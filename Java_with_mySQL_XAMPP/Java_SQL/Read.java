import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    public static void read() {
        String sql = "SELECT * FROM inventory";
        
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {
                System.out.println("\n====>>PRODUCT_LIST");
                System.out.printf("%-5s %-20s %-10s %-10s\n", "ID", "Name", "Qty", "Price");
                
                while (rs.next()) {
                    System.out.printf ("%-5d %-20s %-10d %-10.2f\n",
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getInt("Quantity"),
                        rs.getDouble("Price"));
                }
                
            }catch (SQLException e) {
                System.out.println("Error showing products ::: "+e.getMessage());
            }
    }
}