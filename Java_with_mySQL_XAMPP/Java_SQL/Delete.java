import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void delete(int id) {
        String sql = "DELETE FROM inventory WHERE ProductID=?";
        
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
            pstmt.setInt(1, id);
            
            int rows = pstmt.executeUpdate();
            
            if (rows > 0) System.out.println("Product deleted!");
            else System.out.println("No product found with ID "+id);
                 
        } catch (SQLException e) {
            System.out.println("Error removing product: "+e.getMessage());
        }
    }
}
