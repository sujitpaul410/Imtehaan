/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imtehaan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;

/**
 *
 * @author User
 */
public class Imtehaan_Main extends javax.swing.JFrame {

    /**
     * Creates new form Imtehaan_Main
     */
    int numberOfFilesRequired = 0;
    public static String usrName = "", passWord = "", lang = "";
    public static Boolean exitable;
    Process showPdf;

    public Imtehaan_Main() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        examGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        setPurposeLabel = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        setExamButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        confirmPasswordText = new javax.swing.JPasswordField();
        examC = new javax.swing.JRadioButton();
        examCPP = new javax.swing.JRadioButton();
        examJava = new javax.swing.JRadioButton();
        examPython = new javax.swing.JRadioButton();
        examPerl = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numberQuestions = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        closeButton.setBackground(new java.awt.Color(255, 0, 51));
        closeButton.setText("X");
        closeButton.setToolTipText("");
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        setPurposeLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        setPurposeLabel.setText("Set UserName and Password for exam");

        userNameText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        setExamButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        setExamButton.setText("Set");
        setExamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setExamButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Confirm Password");

        passwordText.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        confirmPasswordText.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        examGroup.add(examC);
        examC.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        examC.setText("C");

        examGroup.add(examCPP);
        examCPP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        examCPP.setText("C++");

        examGroup.add(examJava);
        examJava.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        examJava.setText("Java");

        examGroup.add(examPython);
        examPython.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        examPython.setText("Python");

        examGroup.add(examPerl);
        examPerl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        examPerl.setText("Perl");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Exam For");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Number Of Questions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(84, 84, 84)
                                            .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(examPython)
                                                        .addGap(34, 34, 34)
                                                        .addComponent(examPerl))
                                                    .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(examC)
                                        .addGap(30, 30, 30)
                                        .addComponent(examCPP)
                                        .addGap(31, 31, 31)
                                        .addComponent(examJava)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(setExamButton)))
                                .addGap(153, 153, 153))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(setPurposeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(setPurposeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(setExamButton)
                        .addComponent(examC)
                        .addComponent(examCPP)
                        .addComponent(examJava)
                        .addComponent(examPython)
                        .addComponent(examPerl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numberQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void setExamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setExamButtonActionPerformed
        // TODO add your handling code here:
        InitialCheck();
    }//GEN-LAST:event_setExamButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        Imtehaan_Main im = new Imtehaan_Main();
        im.setVisible(true);
        boolean chk = im.PreCheck();
        if (chk == true) {
            JFrame ie = new JFrame();
            JTabbedPane jTabbedPane1 = new JTabbedPane();
            jTabbedPane1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
            File data = new File("testout.txt");
            try {
                int i = 0;
                BufferedReader br = new BufferedReader(new FileReader(data));
                String st;
                while ((st = br.readLine()) != null) {
                    if (i == 0) {
                        im.usrName = st;
                        System.out.println(st);
                    }
                    if (i == 1) {
                        im.passWord = st;
                        System.out.println(st);
                    }
                    if (i == 2) {
                        im.numberOfFilesRequired = Integer.parseInt(st);
                        System.out.println(im.numberOfFilesRequired);
                    }
                    if (i == 3) {
                        im.lang = st;
                        System.out.println(st);
                    }
                    i++;
                }
                
            } catch (Exception ex) {

            }
            for (int j = 1; j <= im.numberOfFilesRequired; j++) {
                im.CreateAndAddTabs(ie, jTabbedPane1, "Solution" + j);
            }
            im.CreateCompileAndExecuteTab(ie, jTabbedPane1, "Execute", im.numberOfFilesRequired, im.lang);
            im.ProblemsProvided(ie, jTabbedPane1, im);
            im.EndExam(ie, jTabbedPane1, im);
            im.AboutMe(ie, jTabbedPane1);
            
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            ie.setSize(screenSize.width, screenSize.height);
            
            //ie.setSize(1024, 900);
            //ie.setExtendedState(JFrame.MAXIMIZED_BOTH);
            ie.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
            ie.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ie.setResizable(false);
            ie.setUndecorated(true);
            ie.setVisible(true);
            //Do stuff like calling editor before hiding..
            im.setVisible(false);

            //Get TextArea to save as files
            String st;
            int i = 0;

            try
            {
                File dir=new File("Solutions Of "+im.usrName);
                
                if(dir.exists() && dir.isDirectory())
                {
                    for(int s=1;s<=im.numberOfFilesRequired;s++)
                    {
                        File f=new File("Solutions Of "+im.usrName+"/"+"Solution" + s + "." + im.lang);
                        if(f.exists())
                        {
                            System.out.println("Solution" + s + "." + im.lang+" exists..!!");
                            BufferedReader br = new BufferedReader(new FileReader(f));

                            String str="",finalStr="";
                            //int p = 1;
                            while ((str = br.readLine()) != null) {
                                finalStr=finalStr+"\n";
                                finalStr=finalStr+str;
                                //p++;
                            }
                            System.out.println("Content: " + finalStr);
                            jTabbedPane1.setSelectedIndex(s-1);
                            TextArea TextArea1 = (TextArea) jTabbedPane1.getSelectedComponent();
                            TextArea1.setText(finalStr);
                            br.close();
                        }
                    }
                    jTabbedPane1.setSelectedIndex(0);
                }
                else
                {
                    Files.createDirectory(dir.toPath());
                }
                
            }
            catch(Exception e)
            {
                System.out.println("Directory not created");
            }
            while (true) {
                
                try {
                    TextArea TextArea1 = (TextArea) jTabbedPane1.getSelectedComponent();
                    int selectedIndex = jTabbedPane1.getSelectedIndex();
                    selectedIndex += 1;
                    System.out.println("FileNAme: " + "Solution" + selectedIndex);
                    System.out.print("Selected Tab: " + selectedIndex + "\nText: " + TextArea1.getText());
                    try {
                        TimeUnit.SECONDS.sleep(1/2);
                        FileWriter fw = new FileWriter("Solution" + selectedIndex + "." + im.lang);
                        String str=TextArea1.getText();
                        fw.write(TextArea1.getText());
                        fw.close();
                        
                        File f=new File("Solutions Of "+im.usrName);
                        if(f.exists() && f.isDirectory())
                        {
                            FileWriter fw1 = new FileWriter("Solutions Of "+im.usrName+"/"+"Solution" + selectedIndex + "." + im.lang);
                            BufferedWriter out = new BufferedWriter(fw1);
                            out.write(str);
                            out.close();
                            fw.close();
                        }
                        
                    } catch (Exception e) {
                           System.out.println(e.toString());
                    }
                    if (im.exitable == true) {
                        System.exit(0);
                    }
                } catch (Exception exp) {

                }

            }

        }
    }

    public void EndExam(JFrame jf, JTabbedPane jTabbedPane1, Imtehaan_Main im) {
        JPanel jp = new JPanel();
        jp.setName("End Exam");
        jTabbedPane1.add(jp);

        jp.add(new JButton(new AbstractAction("Quit Exam") {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //im.showPdf = Runtime.getRuntime().exec("java -jar PdfViewer.jar");
                    EndExamFrame ex = new EndExamFrame();
                    ex.setVisible(true);

                    ex.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                            // your code
                            if(im.exitable==true)
                            {
                                System.exit(0);
                            }

                        }
                    });
                } catch (Exception exp) {

                }
            }
        }));
    }

    public void AboutMe(JFrame jf, JTabbedPane jTabbedPane1) {
        JPanel jp = new JPanel();
        jp.setName("About");
        jTabbedPane1.add(jp);
        JLabel jl = new JLabel("<html><body bgcolor=\"#00A0E5\"><h3>Imtehaan aims for a strong logical foundation for students</h3><h3><p style=\"margin-left:100px\">With Love,<br><sp>Sujit Paul</sp></p></h3></body><html>");
        jl.setPreferredSize(new Dimension(500, 600));
        jp.add(jl);
    }

    public void ProblemsProvided(JFrame jf, JTabbedPane jTabbedPane1, Imtehaan_Main im) {
        JPanel jp = new JPanel();
        jp.setName("Problems");
        jTabbedPane1.add(jp);

        jp.add(new JButton(new AbstractAction("Show Problems.pdf") {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(im.showPdf!=null)
                    {
                        im.showPdf.destroy();
                        im.showPdf = Runtime.getRuntime().exec("java -jar PdfViewer.jar");
                    }
                    else
                    {
                        im.showPdf = Runtime.getRuntime().exec("java -jar PdfViewer.jar");
                    }
                } catch (Exception exp) {
                    System.out.println(exp.toString());

                }
            }
        }));
    }

    public void CreateCompileAndExecuteTab(JFrame jf, JTabbedPane jTabbedPane1, String tabName, int noOfSols, String usedLang) {
        JPanel jp = new JPanel();
        jp.setName("Execute");
        jTabbedPane1.add(jp);
        for (int i = 1; i <= noOfSols; i++) {
            createPanel(jp, "CompileAndRun Solution" + i, usedLang);
        }
    }

    private JPanel createPanel(JPanel p, String name, String mlang) {
        //final JPanel p = new JPanel();
        //p.setName(name);
        p.add(new JButton(new AbstractAction(name) {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(p, name);
                JOptionPane.showMessageDialog(p, mlang);
                if (mlang.equals("py")) {
                    try {

                        //builder.start();
                        //String myCmd="python Solution"+name.charAt(name.length()-1)+".py";
                        //System.out.println("Command used: "+myCmd);
                        FileWriter fw = new FileWriter("MyExecutioner.py");
                        fw.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"python Solution" + name.charAt(name.length() - 1) + ".py; sleep 10\\\" '\")\nexecute_command()");
                        fw.close();
                        String myCmd = "python MyExecutioner.py";
                        Process p = Runtime.getRuntime().exec(myCmd);
                    } catch (Exception ex) {
                        System.out.println("Exception.." + e.toString());
                    }
                }
                if (mlang.equals("c")) {
                    try {
                        File delFile = new File("a.out");
                        if (delFile.exists()) {
                            delFile.delete();
                        }
                        FileWriter fw = new FileWriter("MyExecutioner.py");
                        fw.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"gcc Solution" + name.charAt(name.length() - 1) + ".c; sleep 10\\\" '\")\nexecute_command()");
                        fw.close();
                        String myCmd = "python MyExecutioner.py";
                        Process p = Runtime.getRuntime().exec(myCmd);
                        File file = new File("MyExecutioner.py");
                        TimeUnit.SECONDS.sleep(12);
                        p.destroy();
                        file.delete();
                        File init = new File("a.out");
                        if (init.exists()) {
                            FileWriter fwn = new FileWriter("MyExecutionerRun.py");
                            //fwn.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"./a.out; sleep 10\\\" '\")\nexecute_command()");
                            //fwn.write("Hello Py");
                            //fw.close();
                            BufferedWriter out = new BufferedWriter(fwn);
                            out.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"./a.out; sleep 10\\\" '\")\nexecute_command()");
                            out.close();
                            fwn.close();
                            String myCmdr = "python MyExecutionerRun.py";
                            Process p1 = Runtime.getRuntime().exec(myCmdr);
                            TimeUnit.SECONDS.sleep(12);
                            p1.destroy();
                        }
                        /*else
                        {
                            System.out.println("a.out exception");
                        }*/
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                }
                if (mlang.equals("cpp")) {
                    try {
                        File delFile = new File("a.out");
                        if (delFile.exists()) {
                            delFile.delete();
                        }
                        FileWriter fw = new FileWriter("MyExecutioner.py");
                        fw.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"g++ Solution" + name.charAt(name.length() - 1) + ".cpp; sleep 10\\\" '\")\nexecute_command()");
                        fw.close();
                        String myCmd = "python MyExecutioner.py";
                        Process p = Runtime.getRuntime().exec(myCmd);
                        File file = new File("MyExecutioner.py");
                        TimeUnit.SECONDS.sleep(12);
                        p.destroy();
                        file.delete();
                        File init = new File("a.out");
                        if (init.exists()) {
                            FileWriter fwn = new FileWriter("MyExecutionerRun.py");
                            //fwn.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"./a.out; sleep 10\\\" '\")\nexecute_command()");
                            //fwn.write("Hello Py");
                            //fw.close();
                            BufferedWriter out = new BufferedWriter(fwn);
                            out.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"./a.out; sleep 10\\\" '\")\nexecute_command()");
                            out.close();
                            fwn.close();
                            String myCmdr = "python MyExecutionerRun.py";
                            Process p1 = Runtime.getRuntime().exec(myCmdr);
                            TimeUnit.SECONDS.sleep(12);
                            p1.destroy();
                        }
                        /*else
                        {
                            System.out.println("a.out exception");
                        }*/
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                }
                if (mlang.equals("java")) {
                    try {
                        File delFile = new File("Solution" + name.charAt(name.length() - 1) + ".class");
                        if (delFile.exists()) {
                            delFile.delete();
                        }
                        FileWriter fw = new FileWriter("MyExecutioner.py");
                        fw.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"javac Solution" + name.charAt(name.length() - 1) + ".java; sleep 10\\\" '\")\nexecute_command()");
                        fw.close();
                        String myCmd = "python MyExecutioner.py";
                        Process p = Runtime.getRuntime().exec(myCmd);
                        File file = new File("MyExecutioner.py");
                        TimeUnit.SECONDS.sleep(12);
                        p.destroy();
                        file.delete();
                        File init = new File("Solution" + name.charAt(name.length() - 1) + ".class");
                        if (init.exists()) {
                            FileWriter fwn = new FileWriter("MyExecutionerRun.py");
                            //fwn.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"./a.out; sleep 10\\\" '\")\nexecute_command()");
                            //fwn.write("Hello Py");
                            //fw.close();
                            BufferedWriter out = new BufferedWriter(fwn);
                            out.write("import os\ndef execute_command():\n\tos.system(\"gnome-terminal --full-screen -e 'bash -c \\\"java Solution" + name.charAt(name.length() - 1) + "; sleep 10\\\" '\")\nexecute_command()");
                            out.close();
                            fwn.close();
                            String myCmdr = "python MyExecutionerRun.py";
                            Process p1 = Runtime.getRuntime().exec(myCmdr);
                            TimeUnit.SECONDS.sleep(12);
                            p1.destroy();
                        }
                        /*else
                        {
                            System.out.println("a.out exception");
                        }*/
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                }
            }
        }));
        return p;
    }

    public void CreateAndAddTabs(JFrame jf, JTabbedPane jTabbedPane1, String tabName) {

        //JPanel myjPanel1 = new JPanel();
        TextArea ta = new TextArea();
        ta.setFont(new Font("Arial Black", Font.BOLD, 20));
        jTabbedPane1.addTab(tabName, ta);
        jTabbedPane1.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("LEFT"), "none");
        jTabbedPane1.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("RIGHT"), "none");
        jTabbedPane1.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("UP"), "none");
        jTabbedPane1.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("DOWn"), "none");
        //jTabbedPane1.setTabComponentAt(0,new JButton());

        jf.add(jTabbedPane1, BorderLayout.CENTER);
        jf.getContentPane().add(jTabbedPane1);
    }

    public void InitialCheck() {
        examC.setActionCommand("c");
        examCPP.setActionCommand("cpp");
        examJava.setActionCommand("java");
        examPython.setActionCommand("py");
        examPerl.setActionCommand("pl");

        if (userNameText.getText().isEmpty()) {
            //System.out.println("Enter UserName");
            JOptionPane.showMessageDialog(new Imtehaan_Main(), "Enter UserName");
            return;
        } else if (passwordText.getText().isEmpty()) {
            //System.out.println("Password Empty");
            JOptionPane.showMessageDialog(new Imtehaan_Main(), "Enter Password");
            return;
        } else if (confirmPasswordText.getText().isEmpty() || !passwordText.getText().equals(confirmPasswordText.getText())) {
            //System.out.println("ConfirmPassword Empty");
            JOptionPane.showMessageDialog(new Imtehaan_Main(), "Enter Same Password again to confirm");
            return;
        } else if (numberQuestions.getText().isEmpty()) {
            //System.out.println("ConfirmPassword Empty");
            JOptionPane.showMessageDialog(new Imtehaan_Main(), "Enter Number of questions");
            return;
        } else if (!numberQuestions.getText().isEmpty()) {
            //System.out.println("ConfirmPassword Empty");
            try {
                int numberOfQuestions = Integer.parseInt(numberQuestions.getText());
                if (numberOfQuestions < 0) {
                    JOptionPane.showMessageDialog(new Imtehaan_Main(), "Enter Integer greater than 0(zero)");
                    return;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(new Imtehaan_Main(), "Enter Integer greater than 0(zero)");
                return;
            }
        }
        try {
            System.out.println("Language: " + examGroup.getSelection().getActionCommand());
            System.out.println("UserName: " + userNameText.getText());
            System.out.println("Password: " + confirmPasswordText.getText());
            System.out.println("No of questions: " + numberQuestions.getText());
        } catch (Exception e) {
            //System.out.println("Select Exam");
            JOptionPane.showMessageDialog(new Imtehaan_Main(), "Select the Language needed for the Exam");
            return;
        }

        try {
            FileWriter fw = new FileWriter("testout.txt");
            fw.write(userNameText.getText() + "\n" + confirmPasswordText.getText() + "\n" + numberQuestions.getText() + "\n" + examGroup.getSelection().getActionCommand());
            fw.close();
            //Do stuuff like calling a editor before hiding..
            JOptionPane.showMessageDialog(rootPane, "COnfiguration is complete..\nPlease Restart this Application..!!");
            //this.setVisible(false);
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("File creration error..!! "+ex);
        }

    }

    public boolean PreCheck() {
        File init = new File("testout.txt");
        if (init.exists() && init.isFile()) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JRadioButton examC;
    private javax.swing.JRadioButton examCPP;
    private javax.swing.ButtonGroup examGroup;
    private javax.swing.JRadioButton examJava;
    private javax.swing.JRadioButton examPerl;
    private javax.swing.JRadioButton examPython;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numberQuestions;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton setExamButton;
    private javax.swing.JLabel setPurposeLabel;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
