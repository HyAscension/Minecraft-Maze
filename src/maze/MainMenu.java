/*
This class is a main swing JFrame that responsible for opening different maze
game upon a character being chosen. A string mcharacter is declared and will be
set as different colour name everytime a string form the combobox list is
have a maze with the white character, but by selecting different choice in
JComboBox1, a different maze class will be called, with a different character in 
it. JButton2 on the other hand, will disposed itself, while close down the
program upon clicking.
*/
package maze;

public class MainMenu extends javax.swing.JFrame {
    public static String mcharacter;
    public MainMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maze Game");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(null);
        setSize(new java.awt.Dimension(350, 350));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select your character");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 70, 160, 19);

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome to the maze game");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 30, 230, 24);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Orange", "Blue", "Green" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(111, 110, 80, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 200, 80, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 200, 80, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maze/tron light wall.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 300, 300);

        setSize(new java.awt.Dimension(316, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String item = (String)jComboBox1.getSelectedItem();
        if("White".equals(item)){
            mcharacter = "w";
        }
        if("Orange".equals(item)){
            mcharacter = "o";
        }
        if("Blue".equals(item)){
            mcharacter = "b";
        }
        if("Green".equals(item)){
            mcharacter = "g";
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Maze m = new Maze();
        m.setTitle("Main Menu");
        m.add(new MyPanel());
        m.setSize(465,488);
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(Maze.EXIT_ON_CLOSE);
        if("o".equals(mcharacter)){
            Maze2 m2 = new Maze2();
            m2.setTitle("Main Menu");
            m2.add(new MyPanel2());
            m2.setSize(465,488);
            m2.setVisible(true);
            m2.setLocationRelativeTo(null);
            m2.setDefaultCloseOperation(Maze.EXIT_ON_CLOSE);
        }
        else
            if("b".equals(mcharacter)){
                Maze3 m3 = new Maze3();
                m3.setTitle("Main Menu");
                m3.add(new MyPanel3());
                m3.setSize(465,488);
                m3.setVisible(true);
                m3.setLocationRelativeTo(null);
                m3.setDefaultCloseOperation(Maze.EXIT_ON_CLOSE);
            }
            else
                if("g".equals(mcharacter)){
                    Maze4 m4 = new Maze4();
                    m4.setTitle("Main Menu");
                    m4.add(new MyPanel4());
                    m4.setSize(465,488);
                    m4.setVisible(true);
                    m4.setLocationRelativeTo(null);
                    m4.setDefaultCloseOperation(Maze.EXIT_ON_CLOSE);
                }
        this.dispose();
        this.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	this.dispose();
        this.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
