import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void update (int id, String newName, int newQty, double newPrice) {
        String sql = "UPDATE inventory SET ProductName =?, Quantity=?, Price=?";
        
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
    
            pstmt.setString(1, newName);
            pstmt.setInt(2, newQty);
            pstmt.setDouble(3, newPrice);
            pstmt.setInt(4, id);
            
            int rows = pstmt.executeUpdate();
            
            if (rows > 0) {
                System.out.println("Product ADDED");
            } else {
                System.out.println("No product found with ID " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error updating product ::: " + e.getMessage());
        }
    }
}