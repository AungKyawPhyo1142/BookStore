
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class Seller_Management extends javax.swing.JFrame {

    /**
     * Creates new form Seller_Management
     */
    public Seller_Management() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search_id_txt = new javax.swing.JTextField();
        search_btn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        user_id_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        answer_txt = new javax.swing.JTextField();
        question_txt = new javax.swing.JTextField();
        clear_btn = new javax.swing.JButton();
        insert_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        show_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        clear_btn5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(136, 137, 185));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close_window_30px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 237, 183));
        jLabel1.setText("Manage Sellers");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, -1));

        search_id_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        search_id_txt.setForeground(new java.awt.Color(230, 237, 183));
        search_id_txt.setText("ID");
        search_id_txt.setOpaque(false);
        search_id_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_id_txtMouseClicked(evt);
            }
        });
        search_id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_id_txtActionPerformed(evt);
            }
        });
        jPanel1.add(search_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 90, 40));

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_white_25px.png"))); // NOI18N
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_btnMouseExited(evt);
            }
        });
        jPanel1.add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 237, 183));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        id_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        id_txt.setForeground(new java.awt.Color(230, 237, 183));
        id_txt.setText("ID");
        id_txt.setOpaque(false);
        id_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_txtMouseClicked(evt);
            }
        });
        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });
        jPanel1.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 237, 183));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        password_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        password_txt.setForeground(new java.awt.Color(230, 237, 183));
        password_txt.setText("Password");
        password_txt.setOpaque(false);
        password_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_txtMouseClicked(evt);
            }
        });
        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 160, 40));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 237, 183));
        jLabel5.setText("Security");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        user_id_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        user_id_txt.setForeground(new java.awt.Color(230, 237, 183));
        user_id_txt.setText("User-ID");
        user_id_txt.setOpaque(false);
        user_id_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_id_txtMouseClicked(evt);
            }
        });
        user_id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_id_txtActionPerformed(evt);
            }
        });
        jPanel1.add(user_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 130, 40));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 237, 183));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        name_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        name_txt.setForeground(new java.awt.Color(230, 237, 183));
        name_txt.setText("Name");
        name_txt.setOpaque(false);
        name_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name_txtMouseClicked(evt);
            }
        });
        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });
        jPanel1.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, 40));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(230, 237, 183));
        jLabel8.setText("Security");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        answer_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        answer_txt.setForeground(new java.awt.Color(230, 237, 183));
        answer_txt.setText("Security Answer");
        answer_txt.setOpaque(false);
        answer_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answer_txtMouseClicked(evt);
            }
        });
        answer_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer_txtActionPerformed(evt);
            }
        });
        jPanel1.add(answer_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 160, 40));

        question_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        question_txt.setForeground(new java.awt.Color(230, 237, 183));
        question_txt.setText("What is your birthday?");
        question_txt.setOpaque(false);
        question_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                question_txtMouseClicked(evt);
            }
        });
        question_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question_txtActionPerformed(evt);
            }
        });
        jPanel1.add(question_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 160, 40));

        clear_btn.setBackground(new java.awt.Color(136, 137, 185));
        clear_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(230, 237, 183));
        clear_btn.setText("Clear");
        clear_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        clear_btn.setFocusable(false);
        clear_btn.setOpaque(false);
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        jPanel1.add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 100, 40));

        insert_btn.setBackground(new java.awt.Color(136, 137, 185));
        insert_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        insert_btn.setForeground(new java.awt.Color(230, 237, 183));
        insert_btn.setText("Insert");
        insert_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        insert_btn.setFocusable(false);
        insert_btn.setOpaque(false);
        insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btnActionPerformed(evt);
            }
        });
        jPanel1.add(insert_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 100, 40));

        update_btn.setBackground(new java.awt.Color(136, 137, 185));
        update_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        update_btn.setForeground(new java.awt.Color(230, 237, 183));
        update_btn.setText("Update");
        update_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        update_btn.setFocusable(false);
        update_btn.setOpaque(false);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        jPanel1.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 100, 40));

        delete_btn.setBackground(new java.awt.Color(136, 137, 185));
        delete_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(230, 237, 183));
        delete_btn.setText("Delete");
        delete_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        delete_btn.setFocusable(false);
        delete_btn.setOpaque(false);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel1.add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 100, 40));

        show_btn.setBackground(new java.awt.Color(136, 137, 185));
        show_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        show_btn.setForeground(new java.awt.Color(230, 237, 183));
        show_btn.setText("Show Data");
        show_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        show_btn.setFocusable(false);
        show_btn.setOpaque(false);
        show_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_btnActionPerformed(evt);
            }
        });
        jPanel1.add(show_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 100, 40));

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 426, 720, 210));

        clear_btn5.setBackground(new java.awt.Color(136, 137, 185));
        clear_btn5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        clear_btn5.setForeground(new java.awt.Color(230, 237, 183));
        clear_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_to_40px.png"))); // NOI18N
        clear_btn5.setBorder(null);
        clear_btn5.setFocusable(false);
        clear_btn5.setOpaque(false);
        clear_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(clear_btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 50, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 237, 183));
        jLabel2.setText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 10));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(230, 237, 183));
        jLabel10.setText("User-ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked

        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void search_id_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_id_txtMouseClicked

        search_id_txt.setText("");

    }//GEN-LAST:event_search_id_txtMouseClicked

    private void search_id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_id_txtActionPerformed

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (java.lang.ClassNotFoundException e) {  System.out.println(e);       }

        try {

            Connection c = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BookStore\\src\\database\\BookStore.mdb");
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet r = s.executeQuery("SELECT * FROM SellerTable");

            String search_id = search_id_txt.getText();

            if (search_id.equals("")) {

                String s1 = "\n\n\t\t\tSearch ID not Found!!!!\n\t\tPlease Try Again!!";
                ta.setText(s1);
            }

            else {

                r.last();
                r.beforeFirst();

                while (r.next()) {

                    String db_id = r.getString(6);

                    if (db_id.equals(search_id)) {

                        id_txt.setText(""+r.getString(6));
                        name_txt.setText(""+r.getString(1));
                        user_id_txt.setText(""+r.getString(2));
                        password_txt.setText(""+r.getString(3));
                        question_txt.setText(""+r.getString(4));
                        answer_txt.setText(""+r.getString(5));

                    } // found

                } // while

            } //else

            r.close();
            s.close();
            c.close();
        }catch(SQLException se) { System.out.println(se); }

    }//GEN-LAST:event_search_btnMouseClicked

    private void search_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseEntered

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_black_25px.png"))); // NOI18N

    }//GEN-LAST:event_search_btnMouseEntered

    private void search_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseExited

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_white_25px.png"))); // NOI18N

    }//GEN-LAST:event_search_btnMouseExited

    private void id_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMouseClicked
        id_txt.setText("");
    }//GEN-LAST:event_id_txtMouseClicked

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void password_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseClicked
        password_txt.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtMouseClicked

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtActionPerformed

    private void user_id_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_id_txtMouseClicked
        user_id_txt.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_user_id_txtMouseClicked

    private void user_id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_id_txtActionPerformed

    private void name_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_txtMouseClicked
        name_txt.setText("");
    }//GEN-LAST:event_name_txtMouseClicked

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txtActionPerformed

    private void answer_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answer_txtMouseClicked
        answer_txt.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_answer_txtMouseClicked

    private void answer_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer_txtActionPerformed

    private void question_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_question_txtMouseClicked
        question_txt.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_question_txtMouseClicked

    private void question_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question_txtActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed

        search_id_txt.setText("");
        id_txt.setText("");
        name_txt.setText("");
        user_id_txt.setText("");
        password_txt.setText("");
        question_txt.setText("");
        answer_txt.setText("");
        ta.setText("");

    }//GEN-LAST:event_clear_btnActionPerformed

    private void insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btnActionPerformed

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (java.lang.ClassNotFoundException e) {  System.out.println(e);       }

        try {

            Connection c = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BookStore\\src\\database\\BookStore.mdb");
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet r = s.executeQuery("SELECT * FROM SellerTable");

            String id = id_txt.getText();
            String user_id = user_id_txt.getText();
            String name = name_txt.getText();
            String password = password_txt.getText();
            String que = question_txt.getText();
            String ans = answer_txt.getText();

            if (id.equals("") || user_id.equals("") || name.equals("") || password.equals("") || que.equals("") || ans.equals("")) {

                JOptionPane.showMessageDialog(null,"Please fill all the informations!","Try Again",JOptionPane.ERROR_MESSAGE);

            }

            else {

                r.updateString(6,id);
                r.updateString(1,name);
                r.updateString(2,user_id);
                r.updateString(3,password);
                r.updateString(4,que);
                r.updateString(5,ans);
                r.insertRow();
                r.moveToInsertRow();

                JOptionPane.showMessageDialog(null,"Data are inserted successfully!","Success",JOptionPane.PLAIN_MESSAGE);

                // Creating QR Code for Admins
                try {

                    ByteArrayOutputStream out = QRCode.from(user_id).to(ImageType.PNG).stream();
                    String f_name = name;
                    String path = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BookStore\\src\\Seller QR\\";

                    FileOutputStream fout = new FileOutputStream(new File(path+(f_name+".PNG")));
                    fout.write(out.toByteArray());
                    fout.flush();

                }catch(Exception e) { System.out.print(e); }

            } // else

            r.close();
            s.close();
            c.close();
            ta.setText("");

        }catch(SQLException se) { System.out.println(se); }

    }//GEN-LAST:event_insert_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (java.lang.ClassNotFoundException e) {  System.out.println(e);       }

        try {

            Connection c = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BookStore\\src\\database\\BookStore.mdb");
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet r = s.executeQuery("SELECT * FROM SellerTable");

            String search_id = id_txt.getText();
            r.last();
            r.beforeFirst();

            while (r.next()) {

                String db_id = r.getString(6);

                if (db_id.equals(search_id)) {

                    r.updateString(6, id_txt.getText());
                    r.updateString(1, name_txt.getText());
                    r.updateString(2, user_id_txt.getText());
                    r.updateString(3, password_txt.getText());
                    r.updateString(4, question_txt.getText());
                    r.updateString(5, answer_txt.getText());

                    r.updateRow();

                    JOptionPane.showMessageDialog(null,"Data Edited Successfully","Success" ,JOptionPane.PLAIN_MESSAGE);

                } // found

            } // while

            r.close();
            s.close();
            c.close();
        }catch(SQLException se) { System.out.print(se); }

    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (java.lang.ClassNotFoundException e) {  System.out.println(e);       }

        try {

            Connection c = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BookStore\\src\\database\\BookStore.mdb");
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet r = s.executeQuery("SELECT * FROM SellerTable");

            String search_id = id_txt.getText();
            r.last();
            r.beforeFirst();

            while (r.next()) {

                String db_id = r.getString(6);

                if (db_id.equals(search_id)) {

                    r.deleteRow();

                    JOptionPane.showMessageDialog(null,"Data Deleted Successfully","Success" ,JOptionPane.PLAIN_MESSAGE);

                    search_id_txt.setText("");
                    id_txt.setText("");
                    name_txt.setText("");
                    user_id_txt.setText("");
                    password_txt.setText("");
                    question_txt.setText("");
                    answer_txt.setText("");

                } // found

            } // while

            r.close();
            s.close();
            c.close();
        }catch(SQLException se) { System.out.print(se); }

    }//GEN-LAST:event_delete_btnActionPerformed

    private void show_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_btnActionPerformed

        ta.setText("");

        String title = "ID\tName\t\tUser-ID\t\tPassword\t\tSecurity-Question\t\tSecurity Answer\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n";
        ta.setText(title);

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (java.lang.ClassNotFoundException e) {  System.out.println(e);       }

        try {

            Connection c = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BookStore\\src\\database\\BookStore.mdb");
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet r = s.executeQuery("SELECT * FROM SellerTable");

            r.last();
            r.beforeFirst();

            String s1="";
            while(r.next()) {

                String id = r.getString(6);
                String name = r.getString(1);
                String us_id = r.getString(2);
                String pass = r.getString(3);
                String que = r.getString(4);
                String ans = r.getString(5);

                s1+= id+"\t"+name+"\t\t"+us_id+"\t\t"+pass+"\t\t"+que+"\t\t"+ans+"\n";

            }

            ta.setText(""+title+s1);

            r.close();
            s.close();
            c.close();

        }catch(SQLException se) { System.out.println(se); }

    }//GEN-LAST:event_show_btnActionPerformed

    private void clear_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btn5ActionPerformed

        setVisible(false);
        Admin_Menu obj = new Admin_Menu();
        obj.setVisible(true);
    }//GEN-LAST:event_clear_btn5ActionPerformed

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
            java.util.logging.Logger.getLogger(Seller_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer_txt;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton clear_btn5;
    private javax.swing.JLabel close;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton insert_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField password_txt;
    private javax.swing.JTextField question_txt;
    private javax.swing.JLabel search_btn;
    private javax.swing.JTextField search_id_txt;
    private javax.swing.JButton show_btn;
    private javax.swing.JTextArea ta;
    private javax.swing.JButton update_btn;
    private javax.swing.JTextField user_id_txt;
    // End of variables declaration//GEN-END:variables
}
