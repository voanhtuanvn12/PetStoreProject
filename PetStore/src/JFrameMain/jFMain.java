/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrameMain;
import Bussiness.*;
import Data.Data;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author voanh
 */
public class jFMain extends javax.swing.JFrame {
    static String id="";
    static String maChucVu;
    static String mk="";
    static jFTableManager fTableManager;
    static String errorText = "Tên đăng nhập hoặc mật khẩu không hợp lệ !";
    
    
    boolean bThongTinCaNhan = false;
    boolean bQuanLyNhanVien = false;
    boolean bQuanLySanPham = false;
    boolean bQuanLyKho = false;
    boolean bQuanLyThuChi = false;

    
    /**
     * Creates new form jFMain
     */
    public jFMain() {
        
         Data d = new Data();
        
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
        
        
        fTableManager = new jFTableManager(this);
        fTableManager.setVisible(false);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_Thoat = new javax.swing.JButton();
        btn_QuanLyNhanVien = new javax.swing.JButton();
        btn_QuanLySanPham = new javax.swing.JButton();
        btn_QuanLyThuChi = new javax.swing.JButton();
        btn_QuanLyKho = new javax.swing.JButton();
        btn_ThongTinCaNhan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImages(null);
        setLocationByPlatform(true);
        setName("fLogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setForeground(new java.awt.Color(60, 63, 65));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-cat-profile-75.png"))); // NOI18N
        jLabel2.setText("PETS STORE");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chào  TUANKYOU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 120, 215));

        btn_Thoat.setBackground(new java.awt.Color(0, 120, 215));
        btn_Thoat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Thoat.setForeground(new java.awt.Color(255, 255, 255));
        btn_Thoat.setText("Thoát");
        btn_Thoat.setBorder(null);
        btn_Thoat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Thoat.setName(""); // NOI18N
        btn_Thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ThoatMouseExited(evt);
            }
        });
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        btn_QuanLyNhanVien.setBackground(new java.awt.Color(0, 120, 215));
        btn_QuanLyNhanVien.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_QuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLyNhanVien.setText("Quản Lý Nhân Viên");
        btn_QuanLyNhanVien.setBorder(null);
        btn_QuanLyNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_QuanLyNhanVien.setName(""); // NOI18N
        btn_QuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuanLyNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuanLyNhanVienMouseExited(evt);
            }
        });
        btn_QuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLyNhanVienActionPerformed(evt);
            }
        });

        btn_QuanLySanPham.setBackground(new java.awt.Color(0, 120, 215));
        btn_QuanLySanPham.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_QuanLySanPham.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLySanPham.setText("Quản Lý Sản Phẩm");
        btn_QuanLySanPham.setBorder(null);
        btn_QuanLySanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_QuanLySanPham.setName(""); // NOI18N
        btn_QuanLySanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuanLySanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuanLySanPhamMouseExited(evt);
            }
        });
        btn_QuanLySanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLySanPhamActionPerformed(evt);
            }
        });

        btn_QuanLyThuChi.setBackground(new java.awt.Color(0, 120, 215));
        btn_QuanLyThuChi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_QuanLyThuChi.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLyThuChi.setText("Quản Lý Thu Chi");
        btn_QuanLyThuChi.setBorder(null);
        btn_QuanLyThuChi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_QuanLyThuChi.setName(""); // NOI18N
        btn_QuanLyThuChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuanLyThuChiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuanLyThuChiMouseExited(evt);
            }
        });
        btn_QuanLyThuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLyThuChiActionPerformed(evt);
            }
        });

        btn_QuanLyKho.setBackground(new java.awt.Color(0, 120, 215));
        btn_QuanLyKho.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_QuanLyKho.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuanLyKho.setText("Quản Lý Kho");
        btn_QuanLyKho.setBorder(null);
        btn_QuanLyKho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_QuanLyKho.setName(""); // NOI18N
        btn_QuanLyKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuanLyKhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuanLyKhoMouseExited(evt);
            }
        });
        btn_QuanLyKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLyKhoActionPerformed(evt);
            }
        });

        btn_ThongTinCaNhan.setBackground(new java.awt.Color(0, 120, 215));
        btn_ThongTinCaNhan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_ThongTinCaNhan.setForeground(new java.awt.Color(255, 255, 255));
        btn_ThongTinCaNhan.setText("Thông Tin Cá Nhân");
        btn_ThongTinCaNhan.setBorder(null);
        btn_ThongTinCaNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_ThongTinCaNhan.setName(""); // NOI18N
        btn_ThongTinCaNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ThongTinCaNhanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ThongTinCaNhanMouseExited(evt);
            }
        });
        btn_ThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongTinCaNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_QuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_QuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_QuanLyKho, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_QuanLyThuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btn_ThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_QuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_QuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_QuanLyKho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_QuanLyThuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 96, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ExitProgram();
    }//GEN-LAST:event_formWindowClosing

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_QuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanLyNhanVienActionPerformed

    private void btn_QuanLySanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLySanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanLySanPhamActionPerformed

    private void btn_QuanLyThuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLyThuChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanLyThuChiActionPerformed

    private void btn_QuanLyKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLyKhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanLyKhoActionPerformed

    private void btn_QuanLyNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienMouseEntered
        btn_QuanLyNhanVien.setBackground(new java.awt.Color(0, 100, 215));
    }//GEN-LAST:event_btn_QuanLyNhanVienMouseEntered

    private void btn_QuanLySanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLySanPhamMouseEntered
        btn_QuanLySanPham.setBackground(new java.awt.Color(0, 100, 215));
    }//GEN-LAST:event_btn_QuanLySanPhamMouseEntered

    private void btn_QuanLyKhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyKhoMouseEntered
        btn_QuanLyKho.setBackground(new java.awt.Color(0, 100, 215));
    }//GEN-LAST:event_btn_QuanLyKhoMouseEntered

    private void btn_QuanLyThuChiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyThuChiMouseEntered
        btn_QuanLyThuChi.setBackground(new java.awt.Color(0, 100, 215));
    }//GEN-LAST:event_btn_QuanLyThuChiMouseEntered

    private void btn_ThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseEntered
        btn_Thoat.setBackground(new java.awt.Color(0, 100, 215));
    }//GEN-LAST:event_btn_ThoatMouseEntered

    private void btn_QuanLyNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyNhanVienMouseExited
        btn_QuanLyNhanVien.setBackground(new java.awt.Color(0, 120, 215));
    }//GEN-LAST:event_btn_QuanLyNhanVienMouseExited

    private void btn_QuanLySanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLySanPhamMouseExited
        btn_QuanLySanPham.setBackground(new java.awt.Color(0, 120, 215));
    }//GEN-LAST:event_btn_QuanLySanPhamMouseExited

    private void btn_QuanLyKhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyKhoMouseExited
        btn_QuanLyKho.setBackground(new java.awt.Color(0, 120, 215));
    }//GEN-LAST:event_btn_QuanLyKhoMouseExited

    private void btn_QuanLyThuChiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyThuChiMouseExited
        btn_QuanLyThuChi.setBackground(new java.awt.Color(0, 120, 215));
    }//GEN-LAST:event_btn_QuanLyThuChiMouseExited

    private void btn_ThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseExited
        btn_Thoat.setBackground(new java.awt.Color(0, 120, 215));
    }//GEN-LAST:event_btn_ThoatMouseExited

    private void btn_ThongTinCaNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThongTinCaNhanMouseEntered
        btn_ThongTinCaNhan.setBackground(new java.awt.Color(0, 100, 215));
    }//GEN-LAST:event_btn_ThongTinCaNhanMouseEntered

    private void btn_ThongTinCaNhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThongTinCaNhanMouseExited
        btn_ThongTinCaNhan.setBackground(new java.awt.Color(0, 120, 215));
    }//GEN-LAST:event_btn_ThongTinCaNhanMouseExited

    private void btn_ThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongTinCaNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThongTinCaNhanActionPerformed
    
    
    void SetColorAllButton(java.awt.Color jColor ){
        btn_ThongTinCaNhan.setBackground(jColor);
        btn_QuanLySanPham.setBackground(jColor);
        btn_QuanLyNhanVien.setBackground(jColor);
        btn_QuanLyThuChi.setBackground(jColor);
        btn_Thoat.setBackground(jColor);
        btn_QuanLyKho.setBackground(jColor);
    }
    
    void ExitProgram(){
        int output = JOptionPane.showConfirmDialog(this,"Bạn có thật sự muốn thoát không ?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(output==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else
            return;
    }
    /**
     * @param args the command line arguments
     */
    
    
    public static void mmmain(String args[]) {
        
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
            java.util.logging.Logger.getLogger(jFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_QuanLyKho;
    private javax.swing.JButton btn_QuanLyNhanVien;
    private javax.swing.JButton btn_QuanLySanPham;
    private javax.swing.JButton btn_QuanLyThuChi;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_ThongTinCaNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
