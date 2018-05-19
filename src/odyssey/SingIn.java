/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odyssey;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author josek
 */
public class SingIn extends javax.swing.JFrame {
    
    Socket SingInCliente;
    int puerto = 8888;
    String ip = "172.18.64.35";
    BufferedReader entrada;
    PrintStream salida;  
    
    static JSONArray list;
    static JSONArray listF;
    String genre;
    static String FRIEND_ADD="";
    
    static JSONObject myJSON = new JSONObject();
    static FileWriter fileJSON;
    

    /**
     * Creates new form SingIn
     */
    public SingIn(){
        initComponents();
        setDefaultCloseOperation(Metadata.DISPOSE_ON_CLOSE);
        try{            
            SingInCliente = new Socket(ip,puerto);
            entrada = new BufferedReader(new InputStreamReader(SingInCliente.getInputStream()));               
            salida = new PrintStream(SingInCliente.getOutputStream());   
            
        
            System.out.println("Server Connected <SingIn>");   
            
        }catch(IOException e){
          System.out.println("Server Disconnected ");            
        }    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userName = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        passWord = new javax.swing.JLabel();
        freind = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        buttonCreate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        passWord1 = new javax.swing.JLabel();
        rock = new javax.swing.JCheckBox();
        pop = new javax.swing.JCheckBox();
        electro = new javax.swing.JCheckBox();
        addFriend = new javax.swing.JButton();
        hiphop = new javax.swing.JCheckBox();
        reggae = new javax.swing.JCheckBox();
        bachata = new javax.swing.JCheckBox();
        rockroll = new javax.swing.JCheckBox();
        rap = new javax.swing.JCheckBox();
        trashmetal = new javax.swing.JCheckBox();
        balada = new javax.swing.JCheckBox();
        banda = new javax.swing.JCheckBox();
        salsa = new javax.swing.JCheckBox();
        dance = new javax.swing.JCheckBox();
        jazz = new javax.swing.JCheckBox();
        ska = new javax.swing.JCheckBox();
        punk = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userName.setText("User Name: ");

        fullName.setText("Full Name:");

        age.setText("Age:");

        passWord.setText("Password:");

        freind.setText("Friend:");

        buttonCreate.setText("Create");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/josek/Escritorio/download.2.png")); // NOI18N

        passWord1.setText("Genre: ");

        rock.setText("Rock");

        pop.setText("Pop");

        electro.setText("Electroc");

        addFriend.setText("Add");
        addFriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendActionPerformed(evt);
            }
        });

        hiphop.setText("Hip-Hop");

        reggae.setText("Reggae");

        bachata.setText("Bachata");

        rockroll.setText("Rock&Roll");

        rap.setText("Rap");

        trashmetal.setText("Trash Metal");

        balada.setText("Balada");

        banda.setText("Banda");

        salsa.setText("Salsa");

        dance.setText("Dance");

        jazz.setText("Jazz");

        ska.setText("Ska");

        punk.setText("Punk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passWord)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(freind)
                                    .addComponent(addFriend)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hiphop)
                            .addComponent(rockroll)
                            .addComponent(balada)
                            .addComponent(rock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reggae)
                            .addComponent(rap)
                            .addComponent(banda)
                            .addComponent(pop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(electro)
                            .addComponent(bachata)
                            .addComponent(trashmetal)
                            .addComponent(dance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salsa)
                            .addComponent(jazz)
                            .addComponent(ska)
                            .addComponent(punk))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(age))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(passWord1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fullName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(userName)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(age)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passWord1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rock)
                        .addGap(0, 0, 0)
                        .addComponent(hiphop)
                        .addGap(0, 0, 0)
                        .addComponent(rockroll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balada))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pop)
                        .addGap(0, 0, 0)
                        .addComponent(reggae)
                        .addGap(0, 0, 0)
                        .addComponent(rap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(banda)
                            .addComponent(dance)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(electro)
                            .addComponent(salsa))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bachata)
                            .addComponent(ska))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trashmetal)
                            .addComponent(jazz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(punk)))
                .addGap(10, 10, 10)
                .addComponent(passWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(freind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(addFriend)
                        .addGap(43, 43, 43)
                        .addComponent(buttonCreate))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        super.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        try{                                             
            // TODO add your handling code here:
            String userName = this.jTextField1.getText();
            String fullName = this.jTextField2.getText();
            String ageUser = this.jTextField3.getText();
            String password = this.jTextField4.getText();
            String friend = this.jTextField6.getText();
            genre="";
        if(rock.isSelected()){              genre+="rock ";        }
        if(hiphop.isSelected()){            genre+="hiphop ";      }
        if(rockroll.isSelected()){          genre+="rockroll ";    }
        if(balada.isSelected()){            genre+="balada ";      }
        if(pop.isSelected()){               genre+="pop ";         }
        if(reggae.isSelected()){            genre+="reggae ";      }
        if(rap.isSelected()){              genre+="rap ";        }
        if(banda.isSelected()){             genre+="banda ";       }
        if(electro.isSelected()){           genre+="electro ";     }   
        if(bachata.isSelected()){           genre+="bachata ";     }
        if(trashmetal.isSelected()){        genre+="trashmetal ";  }
        if(dance.isSelected()){             genre+="dance ";       }
        if(salsa.isSelected()){             genre+="salsa ";       }   
        if(ska.isSelected()){               genre+="ska ";         }
        if(jazz.isSelected()){              genre+="jazz ";        }
        if(punk.isSelected()){              genre+="punk ";        }
           
        addFried();
        String friends = FRIEND_ADD;
        
            createJSON(userName, fullName, ageUser,genre,password,friends);
            
            
            try{
                String xmlClient = myJSON.toString();
                salida.println(xmlClient);        //Envio información al servidor
                
                String msj = entrada.readLine();        //recibe datos del server
                
                /*
                DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                InputSource src = new InputSource();
                src.setCharacterStream(new StringReader(msj));
                org.w3c.dom.Document doc = builder.parse(src);
                String age = doc.getElementsByTagName("username").item(0).getTextContent();
                String name = doc.getElementsByTagName("password").item(0).getTextContent();
                System.out.println("username>>>> "+age);
                System.out.println("password>>>>>"+name);
                */
                
            }catch(IOException e){
                System.out.println("odyssey.Login.inicio()");
            } 
        }catch(JSONException ex){
            Logger.getLogger(SingIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SingIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCreateActionPerformed

    private void addFriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendActionPerformed
        // TODO add your handling code here:
       String f = jTextField6.getText();
        
        FRIEND_ADD += (f+"-");
        System.out.println(":" + FRIEND_ADD);
        
    }//GEN-LAST:event_addFriendActionPerformed

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
            java.util.logging.Logger.getLogger(SingIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new SingIn().setVisible(true);                
            }
        });
        
       
    }
    
    public static void createJSON(String userName ,String fullName ,String ageUser ,String listGenre,String password ,String friends ) throws JSONException, IOException {
         
        myJSON.put("UserNAme", userName);
        myJSON.put("Full Name:", fullName);
        myJSON.put("Age", ageUser);
        //FRIEND_ADD
        
        addGenre(listGenre);
        addFried();
                
        myJSON.put("Genre", list);
        myJSON.put("Friends", listF);        
        myJSON.put("Password", password);   
        
        
        
        System.out.println(myJSON);
        try { 
            fileJSON = new FileWriter("myJson.json");    
            
            fileJSON.write(myJSON.toString());
            fileJSON.flush();        
        
        }
        catch(IOException e){
            
        }
        BufferedWriter br = new BufferedWriter(fileJSON);
        
        
        br.write("helllllllllllllllll");
        br.close();
       // fr.close();
    }
    
    public static void addGenre(String listMyGenre) {
        String[] array= listMyGenre.split(" ");       
        
        list= new JSONArray();
        for(int i = 0;i< array.length ;i++){            
            list.put(array[i]);
            System.out.println(":> Genre"+ array[i]);
        }
        
    }
    
    public static void addFried() {
        String[] array= FRIEND_ADD.split("-");       
        
        listF= new JSONArray();
        for(int i = 0;i< array.length ;i++){            
            listF.put(array[i]);
            System.out.println(":> Friend_"+i+" :"+ array[i]);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFriend;
    private javax.swing.JLabel age;
    private javax.swing.JCheckBox bachata;
    private javax.swing.JCheckBox balada;
    private javax.swing.JCheckBox banda;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JCheckBox dance;
    private javax.swing.JCheckBox electro;
    private javax.swing.JLabel freind;
    private javax.swing.JLabel fullName;
    private javax.swing.JCheckBox hiphop;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JCheckBox jazz;
    private javax.swing.JLabel passWord;
    private javax.swing.JLabel passWord1;
    private javax.swing.JCheckBox pop;
    private javax.swing.JCheckBox punk;
    private javax.swing.JCheckBox rap;
    private javax.swing.JCheckBox reggae;
    private javax.swing.JCheckBox rock;
    private javax.swing.JCheckBox rockroll;
    private javax.swing.JCheckBox salsa;
    private javax.swing.JCheckBox ska;
    private javax.swing.JCheckBox trashmetal;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
