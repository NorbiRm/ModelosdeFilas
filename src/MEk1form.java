import javax.swing.*;

public class MEk1form {

    protected MEk1 mek1;
    private String Result = "";
    public JPanel panel;
    private JTextField tfL;
    private JTextField tfN;
    private JTextField tfK;
    private JTextField tfCs;
    private JTextField tfM;
    private JTextField tfCw;
    private JTextPane tpResult;
    private JButton calcularButton;

    public MEk1form() {
        calcularButton.addActionListener(actionEvent -> {
            tpResult.setText("");
            Result="";
            try{
                getResult();
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "llena todos los campos");
            }
        });
        tfCw.setText("0.0");
        tfCs.setText("0.0");
    }

    public void getResult(){
        int l = tfL.getText()!=null ? Integer.parseInt(tfL.getText()) : 1;
        int m = tfM.getText()!=null ? Integer.parseInt(tfM.getText()) : 1;
        int n = tfN.getText()!=null? Integer.parseInt(tfN.getText()) : 1;
        int k = tfK.getText()!=null? Integer.parseInt(tfK.getText()) : 1;
        double cw = tfCw.getText()!=null ? Double.parseDouble(tfCw.getText()) : 0.0;
        double cs = tfCs.getText()!=null ? Double.parseDouble(tfCs.getText()) : 0.0;
        mek1 = new MEk1(l,m,k,n);
        Result = String.format("\n p: %f \n p0: %f \n pn: %f \n Lq: %f \n L: %f \n Wq: %f \n W: %f \n ct: %f", mek1.p, mek1.p0, mek1.pn, mek1.lq, mek1.l, mek1.wq, mek1.w, mek1.calculateCt(cw,cs));
        tpResult.setText(Result);
    }
}

