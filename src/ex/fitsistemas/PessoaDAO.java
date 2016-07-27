package ex.fitsistemas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {

	PreparedStatement psmt;
	public static String SQL_INSERT = " INSERT INTO PESSOA (NOME, TELEFONE) VALUES (?,?) ";
	public static String SQL_UPDATE = " UPDATE SET PESSOA SET NOME = ?, TELEFONE = ? WHERE ID = ? ";
	public static String SQL_DELETE = " DELETE FROM PESSOA WHERE ID = ?";

	public Integer crudGeneralPessoaDAO(Connection con, Pessoa p, boolean isAlteracao) {
		try {
			psmt = con.prepareStatement(isAlteracao == true ? SQL_UPDATE : SQL_INSERT);
			psmt.setString(1, p.getNome());
			psmt.setString(2, p.getTelefone());
			int result = psmt.executeUpdate();
			if (result!=0) { return result; }
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Integer deletePessoaDAO(Connection con, Pessoa p, boolean isAlteracao) {
		try {
			psmt = con.prepareStatement(SQL_DELETE);
			psmt.setInt(1, p.getId());
			int result = psmt.executeUpdate();
			if (result!=0) { return result; }
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
