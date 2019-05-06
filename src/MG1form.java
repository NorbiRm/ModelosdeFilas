import javax.swing.*;

public class MG1form {
    private JTextField tfL;
    private JTextField tfM;
    private JTextField tfSigma;
    private JTextField tfN;
    private JTextField tfCw;
    private JTextField tfCs;
    private JTextPane tpResult;
    private JButton calcularButton;
    public JPanel panel;
    private String Result = "";

    protected MG1 mg1;

    public MG1form() {
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
        double l = tfL.getText()!=null ? Double.parseDouble(tfL.getText()): 1;
        double m = tfM.getText()!=null ? Double.parseDouble(tfM.getText()): 1;
        double sigma = tfSigma.getText()!=null ? Double.parseDouble(tfSigma.getText()) : 0.0 ;
        double cw = tfCw.getText()!=null ? Double.parseDouble(tfCw.getText()) : 0.0 ;
        double cs = tfCs.getText()!=null? Double.parseDouble(tfCs.getText()) : 0.0;
        double n = tfN.getText()!=null ? Integer.parseInt(tfN.getText()) : 1;
        mg1 = new MG1(l,sigma,m,n);
        Result = String.format("\n p: %f \n p0: %f \n pn: %f \n Lq: %f \n L: %f \n Wq: %f \n W: %f \n Ct= %f", mg1.p, mg1.p0, mg1.pn, mg1.lq, mg1.l, mg1.wq, mg1.w, mg1.calculateCt(cw, cs));
        tpResult.setText(Result);
    }
}
