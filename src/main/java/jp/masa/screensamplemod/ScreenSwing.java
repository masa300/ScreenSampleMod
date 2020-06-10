package jp.masa.screensamplemod;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ScreenSwing {
    private JFrame mainFrame;
    private Dimension size = new Dimension(500, 500);     //画面フレームサイズ
    private JLayeredPane mainPanel;
    private JLabel background;
    private JLabel notchLabel;
    private JPanel digitalSpeedPanel;

    private JLabel testLabel;

    public ScreenSwing() {

        String path = new File(".").getAbsoluteFile().getParent();
        System.out.println(path);


        //Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("images/")).getInputStream();

        this.mainFrame = new JFrame("Train Monitor");
        this.mainFrame.setSize(this.size);

        this.mainPanel = new JLayeredPane();


        //背景
        background = new JLabel();
        background.setBounds(0, 0, size.width, size.height);
        mainPanel.add(background);
        mainPanel.setLayer(background, 1);



        this.mainFrame.getContentPane().add(mainPanel);
        this.mainFrame.setVisible(true);

        System.out.println("screen create");


    }
}
