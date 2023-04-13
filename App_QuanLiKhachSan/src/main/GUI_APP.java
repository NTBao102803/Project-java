/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import form.PanelDSPhong;
import form.PanelHomePage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;
import form.MenuItem;

/**
 *
 * @author Vu
 */
public class GUI_APP extends javax.swing.JFrame{

    private MenuItem menuHomePage, menuBookRoom, menuRoom, menuBill, menuCustomer, menuThongKe;
    /**
     * Creates new form DanhSachPhong
     */
    public GUI_APP() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
        //menuHomePage.setBackground(Color.cyan);
        panelBody.add(new PanelHomePage());
        
    }
    private void execute(){
          //icon
          ImageIcon iconHomePage = new ImageIcon(getClass().getResource("/item/homeColor.png"));
          ImageIcon iconBookRoom = new ImageIcon(getClass().getResource("/item/bookColor.png"));
          ImageIcon iconRoom = new ImageIcon(getClass().getResource("/item/roomColor.png"));
          ImageIcon iconBill = new ImageIcon(getClass().getResource("/item/billColor.png"));
          ImageIcon iconCustomer = new ImageIcon(getClass().getResource("/item/customerColor.png"));
          ImageIcon iconThongKe = new ImageIcon(getClass().getResource("/item/analytics.png"));
          ImageIcon iconBill1 = new ImageIcon(getClass().getResource("/item/dot.png"));
          ImageIcon iconBill2 = new ImageIcon(getClass().getResource("/item/dot.png"));
          //tao bill menu con
          MenuItem menuBill1 = new MenuItem(iconBill1, "Hóa đơn dịch vụ", null);
          MenuItem menuBill2 = new MenuItem(iconBill2, "Hóa đơn thanh toán phòng", null);
          
          
          
          //tao menu parent
          menuHomePage = new MenuItem(iconHomePage, "Trang chủ", new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  menuHomePage.setBackground(Color.cyan);
                  menuRoom.setBackground(menus.getBackground());
                  panelBody.removeAll();
                  panelBody.add(new PanelHomePage());
                  panelBody.repaint();
                  panelBody.revalidate();
              }
          });
          //menuBookRoom = new MenuItem(iconBookRoom, "Quản lý đặt phòng",null);
          menuRoom = new MenuItem(iconRoom, "Quản lý phòng", new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  menuHomePage.setBackground(menus.getBackground());
                  menuRoom.setBackground(Color.cyan);
                  panelBody.removeAll();
                  panelBody.add(new PanelDSPhong());
                  panelBody.repaint();
                  panelBody.revalidate();                  
              }
          });
          menuBill = new MenuItem(iconBill,"Hóa đơn",null, menuBill1,menuBill2 );
          menuCustomer = new MenuItem(iconCustomer,"Thông tin khách hàng", null);
          menuThongKe = new MenuItem(iconThongKe,"Thống kê", null);
          
          //bg color menuItem
          menuHomePage.setBackground(menus.getBackground());
          //menuBookRoom.setBackground(menus.getBackground());
          menuRoom.setBackground(menus.getBackground());    
          menuBill.setBackground(menus.getBackground());
          menuCustomer.setBackground(menus.getBackground());
          menuThongKe.setBackground(menus.getBackground());
          

          
          addMenu(menuHomePage,menuRoom, menuBill, menuCustomer, menuThongKe);
    }
    private void addMenu(MenuItem...menu){
        for(int i=0;i<menu.length;i++){
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for(MenuItem m : subMenu){
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnChangePass = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(35, 142, 241));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Chương trình quản lí khách sạn");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/item/logo70.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phoenix");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hotel");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(1082, Short.MAX_VALUE))
            .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderLayout.createSequentialGroup()
                    .addGap(501, 501, 501)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(255, 204, 204));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 600));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menus.setBackground(new java.awt.Color(232, 245, 252));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        jPanel1.setBackground(new java.awt.Color(232, 245, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/item/nhanVien.png"))); // NOI18N

        jLabel2.setText("Nguyễn Văn Anh Khoa");

        btnChangePass.setBackground(new java.awt.Color(35, 142, 241));
        btnChangePass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChangePass.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/item/key.png"))); // NOI18N
        btnChangePass.setText("Đổi mật khẩu");
        btnChangePass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(35, 142, 241));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/item/doiPass.png"))); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePass, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnChangePass)
                .addGap(12, 12, 12)
                .addComponent(btnLogout)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBodyMousePressed(evt);
            }
        });
        panelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 1366, 782);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void panelBodyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBodyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelBodyMousePressed

    
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
            java.util.logging.Logger.getLogger(GUI_APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_APP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables


}
