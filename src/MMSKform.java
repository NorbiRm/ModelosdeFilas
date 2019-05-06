import javax.swing.*;

public class MMSKform {
    private JTextField tfL;
    private JTextField tfM;
    private JTextField tfS;
    private JButton calcularButton;
    private JTextField tfN;
    private JTextPane tpResult;
    private JTextField tfK;
    public JPanel panel;
    private JTextField tfCw;
    private JTextField tfCs;
    protected MMSK mmsk;
    private String Result = "";

    public MMSKform() {
        calcularButton.addActionListener(actionEvent -> {
            tpResult.setText("");
            Result="";
            getResult();
        });
    }

    public void getResult(){
        int s = tfS.getText()!=null && Integer.parseInt(tfS.getText()) >=2 ? Integer.parseInt(tfS.getText()): 2;
        int l = tfL.getText()!=null ? Integer.parseInt(tfL.getText()) : 1;
        int m = tfM.getText()!=null ? Integer.parseInt(tfM.getText()) : 1;
        int n = tfN.getText()!=null? Integer.parseInt(tfN.getText()) : 1;
        int k = tfK.getText()!=null? Integer.parseInt(tfK.getText()) : 1;
        double cw = tfCw.getText()!=null ? Double.parseDouble(tfCw.getText()) : 0.0;
        double cs = tfCs.getText()!=null ? Double.parseDouble(tfCs.getText()) : 0.0;
        mmsk = new MMSK(s,l,m,n,k, cw, cs);
        Result = String.format("\n p: %f \n p0: %f \n pn: %f \n Lq: %f \n L: %f \n Wq: %f \n W: %f \n ct: %f", mmsk.getP(), mmsk.getP0(), mmsk.getPn(), mmsk.getLq(), mmsk.getL(), mmsk.getWq(), mmsk.getW(), mmsk.getCt());
        tpResult.setText(Result);
    }
}
