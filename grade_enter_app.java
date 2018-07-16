import javax.swing.JOptionPane;

public class grade_enter_app {

  public static void main(String[] args) {
    final int MAX_AMOUNT = 10;
    String[] names = new String[MAX_AMOUNT];
    double[] grades = new double[MAX_AMOUNT];
    
    enterGrades(names, grades);
  }
  
  public static void enterGrades(String[] name, double[] grade) {
    boolean condition = false;
    for (int x = 0; x < name.length; x++) {
      do {
        name[x] = JOptionPane.showInputDialog("Enter Name " + (x+1) + ":");
        if (name[x].equals("")) {
          JOptionPane.showMessageDialog(null, "Name cannot be blank!");
        }
        else {
          condition = true; 
        }
      } while (!condition);
        
      condition = false;
      
      do {
         try {
            grade[x] = Double.parseDouble(JOptionPane.showInputDialog("Enter Grade " + (x+1) + ":"));
               if (grade[x] < 0 || grade[x] > 100) {
                  JOptionPane.showMessageDialog(null, "Grade cannot be LESS than 0 OR GREATER than 100");
               }
               else {
                  condition = true; 
               }
         }
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Grade MUST be a positive integar");
         }
      } while (!condition);
     
      condition = false;
    }
  }

}
