/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.br.opla.gui;

import com.ufpr.br.opla.indicators.Indicators;
import com.ufpr.br.opla.utils.GuiUtils;
import db.BestSolutionBySelectedFitness;
import org.apache.log4j.Logger;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

/**
 * @author elf
 */
public class SmallerFintnessValuesWindow extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(SmallerFintnessValuesWindow.class);

    private String selectedExperiment;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable edTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel labelSelectedSolutionFunctions;
    private javax.swing.JPanel panelConventionalBest;
    private javax.swing.JPanel panelEds;
    private javax.swing.JPanel panelEleganceBest;
    private javax.swing.JPanel panelFeatureDriven;
    private javax.swing.JPanel panelPlaExtBest;
    private javax.swing.JPanel panelTableObjectives;
    private javax.swing.JTable tableConventionalBest;
    private javax.swing.JTable tableEleganceBest;
    private javax.swing.JTable tableFeatureDrivenBest;
    private javax.swing.JTable tableObjectives;
    private javax.swing.JTable tablePLAExtBest;
    private javax.swing.JTextField textFieldBestEDVName;
    private javax.swing.JTextField textFieldBestEDValue;

    /**
     * Creates new form SmallerFintnessValuesWindow
     */
    public SmallerFintnessValuesWindow() {
        initComponents();
        panelEleganceBest.setVisible(false);
        panelConventionalBest.setVisible(false);
        panelFeatureDriven.setVisible(false);
        panelPlaExtBest.setVisible(false);

        GuiUtils.makeTableNotEditable(tableEleganceBest);
        GuiUtils.makeTableNotEditable(tableConventionalBest);
        GuiUtils.makeTableNotEditable(tableFeatureDrivenBest);
        GuiUtils.makeTableNotEditable(tablePLAExtBest);

        panelTableObjectives.setVisible(false);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
		 */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting
        // code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SmallerFintnessValuesWindow.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmallerFintnessValuesWindow.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmallerFintnessValuesWindow.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmallerFintnessValuesWindow.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

		/*
		 * Create and display the form
		 */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SmallerFintnessValuesWindow().setVisible(true);
            }
        });
    }

    private void includeTableObjectives(String selectedSolutionId) {
        Map<String, String> result = db.Database.getObjectivesBySolutionId(selectedSolutionId, selectedExperiment);
        BestSolutionBySelectedFitness.buildTableObjectives(tableObjectives, result);
        panelTableObjectives.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEleganceBest = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEleganceBest = new javax.swing.JTable();
        panelConventionalBest = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableConventionalBest = new javax.swing.JTable();
        panelPlaExtBest = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePLAExtBest = new javax.swing.JTable();
        panelFeatureDriven = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFeatureDrivenBest = new javax.swing.JTable();
        panelTableObjectives = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableObjectives = new javax.swing.JTable();
        labelSelectedSolutionFunctions = new javax.swing.JLabel();
        panelEds = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        edTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        textFieldBestEDVName = new javax.swing.JTextField();
        textFieldBestEDValue = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEleganceBest.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEleganceBest.setEnabled(false);
        panelEleganceBest.setMinimumSize(new java.awt.Dimension(250, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Elegance");

        tableEleganceBest
                .setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{{null, null, null, null}, {null, null, null, null},
                                {null, null, null, null}, {null, null, null, null}},
                        new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        tableEleganceBest.setMinimumSize(new java.awt.Dimension(300, 64));
        tableEleganceBest.setName("elegance");
        tableEleganceBest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEleganceBestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEleganceBest);

        org.jdesktop.layout.GroupLayout panelEleganceBestLayout = new org.jdesktop.layout.GroupLayout(
                panelEleganceBest);
        panelEleganceBest.setLayout(panelEleganceBestLayout);
        panelEleganceBestLayout.setHorizontalGroup(panelEleganceBestLayout
                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(panelEleganceBestLayout.createSequentialGroup().addContainerGap()
                        .add(panelEleganceBestLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
                                panelEleganceBestLayout.createSequentialGroup().add(0, 0, Short.MAX_VALUE).add(jLabel1))
                                .add(jScrollPane1))
                        .addContainerGap()));
        panelEleganceBestLayout
                .setVerticalGroup(panelEleganceBestLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(panelEleganceBestLayout.createSequentialGroup().add(jLabel1).add(7, 7, 7)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE)));

        panelConventionalBest.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelConventionalBest.setMinimumSize(new java.awt.Dimension(250, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Conventional Metrics");

        tableConventionalBest
                .setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{{null, null, null, null}, {null, null, null, null},
                                {null, null, null, null}, {null, null, null, null}},
                        new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        tableConventionalBest.setMinimumSize(new java.awt.Dimension(300, 64));
        tableConventionalBest.setName("conventional");
        tableConventionalBest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConventionalBestMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableConventionalBest);

        org.jdesktop.layout.GroupLayout panelConventionalBestLayout = new org.jdesktop.layout.GroupLayout(
                panelConventionalBest);
        panelConventionalBest.setLayout(panelConventionalBestLayout);
        panelConventionalBestLayout.setHorizontalGroup(panelConventionalBestLayout
                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(panelConventionalBestLayout.createSequentialGroup().addContainerGap()
                        .add(panelConventionalBestLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(panelConventionalBestLayout.createSequentialGroup().add(0, 0, Short.MAX_VALUE)
                                        .add(jLabel2))
                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap()));
        panelConventionalBestLayout.setVerticalGroup(
                panelConventionalBestLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(panelConventionalBestLayout.createSequentialGroup().add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(10, Short.MAX_VALUE)));

        panelPlaExtBest.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPlaExtBest.setMinimumSize(new java.awt.Dimension(250, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("PLA-Extensibiliy");

        tablePLAExtBest
                .setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{{null, null, null, null}, {null, null, null, null},
                                {null, null, null, null}, {null, null, null, null}},
                        new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        tablePLAExtBest.setMinimumSize(new java.awt.Dimension(300, 64));
        tablePLAExtBest.setName("PLAExtensibility");
        tablePLAExtBest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePLAExtBestMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablePLAExtBest);

        org.jdesktop.layout.GroupLayout panelPlaExtBestLayout = new org.jdesktop.layout.GroupLayout(panelPlaExtBest);
        panelPlaExtBest.setLayout(panelPlaExtBestLayout);
        panelPlaExtBestLayout
                .setHorizontalGroup(panelPlaExtBestLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING,
                                panelPlaExtBestLayout.createSequentialGroup().addContainerGap()
                                        .add(panelPlaExtBestLayout
                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                                .add(jScrollPane4)
                                                .add(panelPlaExtBestLayout.createSequentialGroup()
                                                        .add(0, 372, Short.MAX_VALUE).add(jLabel3)))
                                        .addContainerGap()));
        panelPlaExtBestLayout
                .setVerticalGroup(
                        panelPlaExtBestLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(panelPlaExtBestLayout.createSequentialGroup().add(jLabel3)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94,
                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(0, 17, Short.MAX_VALUE)));

        panelFeatureDriven.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelFeatureDriven.setMinimumSize(new java.awt.Dimension(250, 50));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Feature-driven Metrics");

        tableFeatureDrivenBest
                .setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{{null, null, null, null}, {null, null, null, null},
                                {null, null, null, null}, {null, null, null, null}},
                        new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        tableFeatureDrivenBest.setMinimumSize(new java.awt.Dimension(300, 64));
        tableFeatureDrivenBest.setName("featureDriven");
        tableFeatureDrivenBest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFeatureDrivenBestMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableFeatureDrivenBest);

        org.jdesktop.layout.GroupLayout panelFeatureDrivenLayout = new org.jdesktop.layout.GroupLayout(
                panelFeatureDriven);
        panelFeatureDriven.setLayout(panelFeatureDrivenLayout);
        panelFeatureDrivenLayout.setHorizontalGroup(panelFeatureDrivenLayout
                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, panelFeatureDrivenLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(panelFeatureDrivenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                                .add(panelFeatureDrivenLayout.createSequentialGroup().add(0, 0, Short.MAX_VALUE)
                                        .add(jLabel4)))
                        .addContainerGap()));
        panelFeatureDrivenLayout
                .setVerticalGroup(
                        panelFeatureDrivenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(panelFeatureDrivenLayout.createSequentialGroup().add(jLabel4)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82,
                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(0, 12, Short.MAX_VALUE)));

        panelTableObjectives.setMinimumSize(new java.awt.Dimension(250, 50));

        tableObjectives
                .setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{{null, null, null, null}, {null, null, null, null},
                                {null, null, null, null}, {null, null, null, null}},
                        new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        tableObjectives.setMinimumSize(new java.awt.Dimension(300, 64));
        jScrollPane5.setViewportView(tableObjectives);

        labelSelectedSolutionFunctions.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelSelectedSolutionFunctions.setText("Objective Functions");

        org.jdesktop.layout.GroupLayout panelTableObjectivesLayout = new org.jdesktop.layout.GroupLayout(
                panelTableObjectives);
        panelTableObjectives.setLayout(panelTableObjectivesLayout);
        panelTableObjectivesLayout.setHorizontalGroup(panelTableObjectivesLayout
                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(panelTableObjectivesLayout.createSequentialGroup()
                        .add(panelTableObjectivesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .add(panelTableObjectivesLayout.createSequentialGroup().addContainerGap()
                                        .add(labelSelectedSolutionFunctions).add(0, 0, Short.MAX_VALUE)))
                        .addContainerGap()));
        panelTableObjectivesLayout
                .setVerticalGroup(
                        panelTableObjectivesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, panelTableObjectivesLayout
                                        .createSequentialGroup().addContainerGap().add(labelSelectedSolutionFunctions)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 13, Short.MAX_VALUE)
                                        .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105,
                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel18.setText("Euclidean Distance to the Ideal Solution");

        edTable.setModel(
                new javax.swing.table.DefaultTableModel(
                        new Object[][]{{null, null, null, null}, {null, null, null, null},
                                {null, null, null, null}, {null, null, null, null}},
                        new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        edTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(edTable);

        jLabel10.setText("Best trade-off:");

        jLabel6.setText("Solution name:");

        jLabel7.setText("ED value:");

        org.jdesktop.layout.GroupLayout panelEdsLayout = new org.jdesktop.layout.GroupLayout(panelEds);
        panelEds.setLayout(panelEdsLayout);
        panelEdsLayout.setHorizontalGroup(panelEdsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(panelEdsLayout.createSequentialGroup().addContainerGap().add(panelEdsLayout
                        .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jScrollPane6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 362,
                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel10)
                        .add(panelEdsLayout.createSequentialGroup().add(30, 30, 30)
                                .add(panelEdsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel6).add(jLabel7))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(panelEdsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(textFieldBestEDValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189,
                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(textFieldBestEDVName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189,
                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(jLabel18))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        panelEdsLayout.setVerticalGroup(panelEdsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(panelEdsLayout.createSequentialGroup().addContainerGap().add(jLabel18)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jScrollPane6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95,
                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(jLabel10).add(4, 4, 4)
                        .add(panelEdsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(textFieldBestEDVName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(panelEdsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(textFieldBestEDValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel7))
                        .addContainerGap(97, Short.MAX_VALUE)));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Non-dominated Solutions");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup().add(23, 23, 23)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(panelEleganceBest, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(panelPlaExtBest, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(panelFeatureDriven, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(panelConventionalBest, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(panelTableObjectives, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(panelEds, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                .add(org.jdesktop.layout.GroupLayout.TRAILING,
                        layout.createSequentialGroup()
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel8).add(281, 281, 281)));
        layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout
                .createSequentialGroup()
                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22,
                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup().add(22, 22, 22)
                                .add(panelEleganceBest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(panelConventionalBest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(panelPlaExtBest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(panelFeatureDriven, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18).add(panelTableObjectives,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup().addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(panelEds, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(0, 45, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableEleganceBestMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableEleganceBestMouseClicked
        updateTableObjectives(evt);
        tableConventionalBest.clearSelection();
        tableFeatureDrivenBest.clearSelection();
        tablePLAExtBest.clearSelection();
    }

    private void updateTableObjectives(MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            JTable target = (JTable) evt.getSource();
            String selectedSolutionId = target.getModel().getValueAt(target.getSelectedRow(), 0).toString();

            String text = "Objective Functions";
            labelSelectedSolutionFunctions.setText("");
            this.repaint();
            labelSelectedSolutionFunctions.setText(text + " (" + selectedSolutionId + ")");

            includeTableObjectives(selectedSolutionId);
        }
    }// GEN-LAST:event_tableEleganceBestMouseClicked

    private void tableConventionalBestMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableConventionalBestMouseClicked
        updateTableObjectives(evt);
        tableEleganceBest.clearSelection();
        tableFeatureDrivenBest.clearSelection();
        tablePLAExtBest.clearSelection();
    }// GEN-LAST:event_tableConventionalBestMouseClicked

    private void tablePLAExtBestMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tablePLAExtBestMouseClicked
        updateTableObjectives(evt);
        tableEleganceBest.clearSelection();
        tableFeatureDrivenBest.clearSelection();
        tableConventionalBest.clearSelection();
    }// GEN-LAST:event_tablePLAExtBestMouseClicked

    private void tableFeatureDrivenBestMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableFeatureDrivenBestMouseClicked
        updateTableObjectives(evt);
        tableConventionalBest.clearSelection();
        tableEleganceBest.clearSelection();
        tablePLAExtBest.clearSelection();
    }// GEN-LAST:event_tableFeatureDrivenBestMouseClicked

    private void edTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_edTableMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_edTableMouseClicked
    // End of variables declaration//GEN-END:variables

    void setExperimentId(String selectedExperiment) {
        this.selectedExperiment = selectedExperiment;
    }

    public void enablePanelsObjectiveFunctions() {
        String metricsSelectedForCurrentExperiment[] = db.Database.getOrdenedObjectives(this.selectedExperiment)
                .split(" ");

        for (int i = 0; i < metricsSelectedForCurrentExperiment.length; i++) {
            String f = metricsSelectedForCurrentExperiment[i];
            if (f.equalsIgnoreCase("elegance")) {
                initializeContentForEleganceTable();
                panelEleganceBest.setVisible(true);
            }
            if (f.equalsIgnoreCase("conventional")) {
                initializeContentForConventionalTable();
                panelConventionalBest.setVisible(true);
            }
            if (f.equalsIgnoreCase("PLAExtensibility")) {
                initializeContentForPLAExtTable();
                panelPlaExtBest.setVisible(true);
            }
            if (f.equalsIgnoreCase("featureDriven")) {
                initializeContentForFeatureDrivenTable();
                panelFeatureDriven.setVisible(true);
            }

        }
    }

    private void initializeContentForEleganceTable() {
        BestSolutionBySelectedFitness.buildTable(tableEleganceBest,
                BestSolutionBySelectedFitness.calculateBestElegance(selectedExperiment));
    }

    private void initializeContentForFeatureDrivenTable() {
        BestSolutionBySelectedFitness.buildTable(tableFeatureDrivenBest,
                BestSolutionBySelectedFitness.calculateBestFeatureDriven(selectedExperiment));
    }

    private void initializeContentForConventionalTable() {
        BestSolutionBySelectedFitness.buildTable(tableConventionalBest,
                BestSolutionBySelectedFitness.calculateBestConventional(selectedExperiment));
    }

    private void initializeContentForPLAExtTable() {
        BestSolutionBySelectedFitness.buildTable(tablePLAExtBest,
                BestSolutionBySelectedFitness.calculateBestPlaExt(selectedExperiment));
    }

    public void loadEds() {

        try {
            SortedMap<String, Double> resultsEds = Indicators.getEdsForExperiment(selectedExperiment);

            Object[][] data = new Object[resultsEds.size()][resultsEds.size()];
            int index = 0;
            for (Map.Entry<String, Double> entry : resultsEds.entrySet()) {
                data[index] = new String[]{entry.getKey(), String.valueOf(entry.getValue())};
                index++;
            }

            String columnNames[] = {"Solution Name", "ED"};

            TableModel model = new DefaultTableModel(data, columnNames) {
                @Override
                public Class<?> getColumnClass(int column) {
                    return getValueAt(0, column).getClass();
                }
            };

            edTable.setModel(model);
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
            edTable.setRowSorter(sorter);

            Map.Entry<String, Double> bestTradeOffSolutionName = Indicators
                    .getSolutionWithBestTradeOff(selectedExperiment);
            textFieldBestEDVName.setText(bestTradeOffSolutionName.getKey());
            textFieldBestEDValue.setText(String.valueOf(bestTradeOffSolutionName.getValue()));
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    private void selectBestEdSolution() {
        try {
            String solution = Indicators.getSolutionWithBestTradeOff(selectedExperiment).getKey();

            int rows = tableEleganceBest.getRowCount();

            List<JTable> tables = new ArrayList<>();
            tables.add(tableEleganceBest);
            tables.add(tableConventionalBest);
            tables.add(tableFeatureDrivenBest);
            tables.add(tablePLAExtBest);

            for (int x = 0; x < rows; x++) {
                String value = (String) tableEleganceBest.getValueAt(x, 0);
                if (solution.contains(value)) {
                    selectSolutionForTables(tables, x);
                    includeTableObjectives(value);
                }
            }
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    private void selectSolutionForTables(List<JTable> tables, int x) {
        List<String> objs = Arrays.asList(db.Database.getOrdenedObjectives(selectedExperiment).split(" "));

        for (JTable table : tables) {
            if (objs.contains(table.getName())) {
                table.setRowSelectionInterval(x, x);
                table.scrollRectToVisible(new Rectangle(table.getCellRect(x, 0, true)));
            }
        }
    }
}
