package odyssey;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;




/**
 * @author josek
 */
public final class Login extends javax.swing.JFrame {
    
    Socket loginCliente;
    int puerto = 8888;
    String ip = "192.168.0.109";
    BufferedReader entrada;
    PrintStream salida;            
    /**
     * Creates new form Interface
     * @throws java.io.IOException
     */
    public Login() throws IOException {     
        initComponents();
               
        try{            
            loginCliente = new Socket(ip,puerto);
            System.out.println("Server Connected <Login>");   
            entrada = new BufferedReader(new InputStreamReader(loginCliente.getInputStream()));               
            salida = new PrintStream(loginCliente.getOutputStream());  
            
            }catch(IOException e){
              System.out.println("Server Disconnected :( ");            
        }                     
    }
    
     /**
     * This method is called from within the constructor to initialize the form.     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        SingIn = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Odyssey");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 102, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setText("User Name");

        jLabel2.setText("Password ");

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        SingIn.setText("Sing in");
        SingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingInActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(SingIn)
                    .addComponent(Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method get the user name and password of an user
     * @param evt 
     */
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String userName = UserName.getText();
        String password = String.valueOf(Password.getPassword());  
        String acces = "no";        
        //System.out.print("User Name: "+userName + "\nPassword : " + password + "\n");  
        
        try{  
            String xmlClient = "<client><username>"+userName+"</username><password>"+password+"</password><acces>"+acces+"</acces></client>";
            salida.println(xmlClient);        //Envio información al servidor       
            
            String msj = entrada.readLine();        //recibe datos del server
                        
            System.out.println("->"+msj);
            
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource src = new InputSource();
            
            src.setCharacterStream(new StringReader(msj));
            org.w3c.dom.Document doc = builder.parse(src);
            
            String userN = doc.getElementsByTagName("username").item(0).getTextContent();
            String passW = doc.getElementsByTagName("password").item(0).getTextContent();  
            String acceS = doc.getElementsByTagName("acces").item(0).getTextContent();  
            
            System.out.println("Username>>>> "+userN);  
            System.out.println("Password>>>>>"+passW);  
            System.out.println("Acces >>>>>"+acceS);  
            
            
            //JOptionPane.showMessageDialog(this, userN,"Evaluate",2);
            
            Interface i = new Interface();
            i.setVisible(true);
            
                       
        }catch(IOException e){
            System.out.println("odyssey.Login.inicio()");
        } catch (SAXException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
    }//GEN-LAST:event_LoginActionPerformed
    /**
     * This method create a new user.
     * @param evt 
     */
    private void SingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingInActionPerformed
        // TODO add your handling code here:
        SingIn sigIn;
        sigIn = new SingIn();
        sigIn.setVisible(true);
        
      
    }//GEN-LAST:event_SingInActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        //super.dispose();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("C:\\home\\josek\\Descargas"));///home/josek/Descargas
        fileChooser.setDialogTitle("Select Mp3");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Mp3 files","mp3"));
        if(fileChooser.showOpenDialog(Exit)==JFileChooser.APPROVE_OPTION){
            try {                
                File myFile = fileChooser.getSelectedFile();
                String filename = fileChooser.getSelectedFile().getName();
                String filePath = fileChooser.getSelectedFile().getPath();
                
                System.out.println(filename);
                System.out.println(filePath);
                //try {
                String absolutePath = myFile.getAbsolutePath();
                String filePath1 = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
                System.out.println(filePath1);
                // convert file to byte[]
                byte[] bFile = readBytesFromFile(filePath1+filePath);
                
                // save byte[] into a file
                Path path = Paths.get("C:\\home\\josek\\test2.txt");
                Files.write(path, bFile);
                
                System.out.println("Done");
                
                //Print bytes[]
                for (int i = 0; i < bFile.length; i++) {
                    System.out.print((char) bFile[i]);
                }
                
                //} catch (IOException e) {
                //    e.printStackTrace();
                //}
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }        
    }//GEN-LAST:event_ExitActionPerformed

    private static byte[] readBytesFromFile(String filePath) {

        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;

        try {

            File file = new File(filePath);
            bytesArray = new byte[(int) file.length()];

            //read file into bytes[]
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytesArray);

        } catch (IOException e) {
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                }
            }

        }

        return bytesArray;

    }

       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SingIn;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
