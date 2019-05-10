import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConnection {

	public static void main(String[] args) {

		System.out.println("Inicio");

		try {

			Connection conn = Conexao.getConnection();
			String query = "select nome from tb_teste";

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Conectou!");
	}

}
