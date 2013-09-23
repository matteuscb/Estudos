package Jasper;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class JasperReport {

    private Connection conexao;

    public JasperReport() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void gerar(int codigo, int cliente) throws JRException, SQLException {
        //gerando o jasper design
        String layout = "C:\\Users\\matt\\Documents\\Matteus\\NetBeansProjects\\Estoque\\src\\Jasper\\romaneio.jrxml";

        JasperDesign desenho = JRXmlLoader.load(layout);

        //compila o relatório


        net.sf.jasperreports.engine.JasperReport relatorio = JasperCompileManager.compileReport(desenho);

        //estabelece conexão

        String query = "select cli_nome,cli_pessoa,cli_cpf_cnpj,cli_telefone1,cli_celular1,cli_rua || ' ' || cli_numero || ', ' || cli_bairro || ' - ' || cli_cidade as ENDERECO, ven_produto,ven_valor_produto,to_char(ven_data,'dd/mm/yyyy'),ven_valor_total,ven_qnt_produto "
                + "from venda inner join cliente on venda.ven_cliente = cliente.cli_codigo "
                + "where cli_codigo = '" + cliente + "' and ven_codigo = '" + codigo + "'";

        java.sql.PreparedStatement stmt = this.conexao.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        //implementação da interface JRDataSource para DataSource ResultSet
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        //executa o relatório
        HashMap parametros = new HashMap();


        parametros.put("mostruario", new Double(10));
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        //JasperPrintManager.printPage(impressao, 0, true);

        //exibe o resultado

        //JasperExportManager.exportReportToPdfFile(impressao, "C:/inked/Termo-" + cliente + ".pdf");

        JasperViewer viewer = new JasperViewer(impressao, true);
        viewer.show();

    }
}
