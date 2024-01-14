import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class imgEncryption {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Image Compression");
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font =new Font("Roboto",Font.BOLD,25);
        //creating button
        JButton button = new JButton();
        button.setText("Open Image");
        button.setFont(font);

        //creating test field
        JTextField testField = new JTextField(10);
        testField.setFont(font);
        f.setLayout(new FlowLayout());
        f.add(button);
        f.add(testField);
        button.addActionListener(e->{
            System.out.println("Button Clicked");
            String text=testField.getText();
            int temp=Integer.parseInt(text);
            operate(temp);
        });
        f.setVisible(true);
    }

    public static void operate(int key) {

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showOpenDialog(null);
    File file=fileChooser.getSelectedFile();
    //File inputStream
    try{
        FileInputStream fs=new FileInputStream(file);
        byte[] byteArr=new byte[fs.available()];
        int i=0;
        fs.read(byteArr);
        for(byte b:byteArr){
            System.out.println(b);
            byteArr[i]=(byte)(b^key);
            i++;
        }

        FileOutputStream fos=new FileOutputStream(file);
        fos.write(byteArr);
        fos.close();
        fs.close();
        JOptionPane.showMessageDialog(null,"Done");

    }
    catch(Exception e){
        e.printStackTrace();
        }
    }
}