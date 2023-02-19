import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm {
    private JPanel main;
    private JTextField textFirstName;
    private JTextField textLName;
    private JTextField textEmail;
    private JPasswordField passwordField;
    private JPasswordField passwordField2;
    private JButton submitButton;
    private JButton btnClear;

    public static void main(String[] args) {
        JFrame frame = new JFrame("RegisterForm");
        frame.setContentPane(new RegisterForm().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public RegisterForm() {
    submitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            boolean check1=false;
            boolean check2 =false;

            String name = textFirstName.getText();
            String lName = textLName.getText();
            String email = textEmail.getText();
            String password = passwordField.getText();
            String rePassword = passwordField2.getText();

//            Method 1
//            if(!name.equals("") && !lName.equals("") && !email.equals("") && !password.equals("") && rePassword.equals(password)){
//                JOptionPane.showMessageDialog(null, "Success 😍");
//            }else{
//                JOptionPane.showMessageDialog(null," Please Complete All The Required Fields");
//            }


            //Method 2
            //if all fields are not empty then makes check1 variable true. if condition are not satisfied then makes check1 variable false
            if(!name.equals("") && !lName.equals("") && !email.equals("") && !password.equals("") && !rePassword.equals("")){
                check1 = true;
            }else{
               check1 = false;
            }
            //if all fields are not empty then makes check2 variable true. if condition are not satisfied then makes check2 variable false
            if(!password.equals("") && rePassword.equals(password)){
                check2 = true;
            }else{
                check2 = false;
            }

            // Condition check for message dialog box
           if(check1 == true){
               if(check2== true){
                   JOptionPane.showMessageDialog(null,"Success");
               }else{
                   //check2 error
                   JOptionPane.showMessageDialog(null,"pass wrong");
               }
           }else{
               //check1 error
               JOptionPane.showMessageDialog(null,"required all fields");
           }


        }
    });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFirstName.setText("");
                textLName.setText("");
                textEmail.setText("");
                passwordField.setText("");
                passwordField2.setText("");
            }
        });
    }
}

//Final Code
