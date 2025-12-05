import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TRUNCATE {
    public static void delete() {
        String sql = "TRUNCATE TABLE inventory";
        
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            int rows = pstmt.executeUpdate();
            
            if (rows > 0) System.out.println("TABLE CLEARED!");
        } catch (SQLException e) {
            System.out.println("Error removing product: "+e.getMessage());
        }
    }
}
