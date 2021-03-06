/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author sirag
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        jTextField1.setEditable(false);

    }
    
    public Payment(String para ) {
        initComponents();
        
        jTextField1.setText(para);
        
        double res = calculate_reservation_cost();
        double veh = calculate_vehicle_cost();
        double total = res + veh ; 
        double disc_total = total - 0.2 * total; 
        String s=Double.toString(res);
        String st=Double.toString(veh);
        String t=Double.toString(disc_total);
        
        jTextField_res_cost.setText(s);
        jTextField_veh_cost.setText(st);
        jTextField_total.setText(t);
        
        jTextField1.setEditable(false);     
        jTextField_res_cost.setEditable(false);
        jTextField_veh_cost.setEditable(false);
        jTextField_total.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_veh_cost = new javax.swing.JTextField();
        jTextField_total = new javax.swing.JTextField();
        jTextField_res_cost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_fullname = new javax.swing.JTextField();
        jTextField_key = new javax.swing.JTextField();
        jTextField_credit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser_date = new com.toedter.calendar.JDateChooser();

        jTextField5.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(485, 485, 485)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Your Hotel Reservation Cost is :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Your Vehicle Reservation Cost is :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Total Cost After Discount is :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Your Reservation id is : ");

        jTextField_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalActionPerformed(evt);
            }
        });

        jTextField_res_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_res_costActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Provide your Credit Card Credentials!");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Credit Card Number : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Key Code : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("FullName : ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Due Date : ");

        jTextField_key.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_keyKeyTyped(evt);
            }
        });

        jTextField_credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_creditActionPerformed(evt);
            }
        });
        jTextField_credit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_creditKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_veh_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_res_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(83, 83, 83)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_key, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jTextField_fullname, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jTextField_credit, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jDateChooser_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(434, 434, 434))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel6)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_res_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_veh_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_key, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalActionPerformed

    private void jTextField_res_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_res_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_res_costActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField_creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_creditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (verifyFields())
        {
           JOptionPane.showMessageDialog(null, "Your Payment has been Succesfully Completed ","Completed",2);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_creditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_creditKeyTyped
         char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();

        }
        
        
    }//GEN-LAST:event_jTextField_creditKeyTyped

    private void jTextField_keyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_keyKeyTyped
        
          char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();

        }
        
        
    }//GEN-LAST:event_jTextField_keyKeyTyped

    
    
    public double calculate_reservation_cost()
    {   
        double res_cost = 0;
        double Standard_cost = 40;
        double Luxury_cost = 70;
        
        String id = jTextField1.getText();
        String fname,lname,email,checkin,checkout,persons,type;
         try{
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/hotel_system";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
                         
            PreparedStatement ps ;
            String query = "SELECT * FROM reservations WHERE id =?  ";
            ps = My_CNX.getConnection().prepareStatement(query);
            //PreparedStatement myStmt = conn.PreparedStatement("SELECT * FROM reservations WHERE id =? ");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
              
              fname =  rs.getString("first_name");
              lname= rs.getString("last_name");
              email =  rs.getString("email");
              checkin = rs.getString("check_in");
              checkout =  rs.getString("check_out");
              persons = rs.getString("Persons");
              type = rs.getString("Room_Type");
                              
             int diff = dateDiffernce(checkin,checkout);
             //JOptionPane.showMessageDialog(null, "Days differnce" + diff );
             
             if(type.equals("Standard"))
             {
                 res_cost = diff * Standard_cost;                 
             }
             else if (type.equals("Luxury"))
             {
                 res_cost = diff *Luxury_cost;
             }
            }
        
            
        }
        
        catch (Exception e)
            {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            }
        
            return res_cost;
    }
    
    public int dateDiffernce(String date1 ,String date2) { 
        int i = 0;
    try{
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date firstdate = df.parse(date1);
        Date seconddate = df.parse(date2);  
        
        long diffInMillies = Math.abs(firstdate.getTime() - seconddate.getTime());
        
        //To diff exei thn diafora twn hmerwn
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS); 
         i = (int) diff;

    }
     catch(Exception e){
            e.printStackTrace();
        }
    return i;
    }
    
    
    public double calculate_vehicle_cost()
    {
        double motor_cost = 25 ;
        double car_cost = 45 ;
        double ATV_cost = 35 ;
        double van_cost = 60;
        
        double veh_cost = 0;
        
        
        String id = jTextField1.getText();
        String veh_id,license_id,start_date,return_date,veh_type,res_id;
         try{
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/hotel_system";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
                         
            PreparedStatement ps ;
            String query = "SELECT * FROM vehicle_reservation WHERE Res_id =?  ";
            ps = My_CNX.getConnection().prepareStatement(query);
            //PreparedStatement myStmt = conn.PreparedStatement("SELECT * FROM reservations WHERE id =? ");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
              
              veh_id =  rs.getString("Veh_id");
              license_id= rs.getString("License_id");
              start_date = rs.getString("Start_Date");
              return_date =  rs.getString("Return_Date");
              veh_type = rs.getString("Veh_Type");
                              
             int diff = dateDiffernce(start_date,return_date);
             //JOptionPane.showMessageDialog(null, "Days differnce" + diff );
             
             if(veh_type.equals("MotorCycle"))
             {
                 veh_cost = diff * motor_cost;                 
             }
             else if (veh_type.equals("Car"))
             {
                 veh_cost = diff *car_cost;
             }
             
             else if(veh_type.equals("Van"))
             {
                 veh_cost = diff * van_cost;                 
             }
             else if (veh_type.equals("ATV"))
             {
                 veh_cost = diff *ATV_cost;
             }
            }
            
        }
        
        catch (Exception e)
            {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            }
        
         return veh_cost;
    }
   
    public boolean verifyFields()
    {
        
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         String number = jTextField_credit.getText();
         String fullname = jTextField_fullname.getText();
         
        // String start_date = (df.format(jDateChooser_Start.getDate()));
         //String return_date = (df.format(jDateChooser_Return.getDate()));
         
         Date due_date ;
         due_date = jDateChooser_date.getDate();
         String code = jTextField_key.getText();
        //check empty fields
        if(number.trim().equals("") || fullname.trim().equals("") || (due_date == null) || code.trim().equals("") )
            
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        else {
            
            return true;
        }
    }
     
    
    
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField_credit;
    private javax.swing.JTextField jTextField_fullname;
    private javax.swing.JTextField jTextField_key;
    private javax.swing.JTextField jTextField_res_cost;
    private javax.swing.JTextField jTextField_total;
    private javax.swing.JTextField jTextField_veh_cost;
    // End of variables declaration//GEN-END:variables
}
