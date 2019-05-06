import javax.swing.*;


public class MMSform {
    protected MMS mms;
    protected MM1 mm1;

    private JTextField tfL;
    private JTextField tfS;
    private JTextField tfM;
    private JButton calcularButton;
    public JPanel panel;
    private JTextField tfN;
    private JTextPane tpResult;
    private JTextField tfCw;
    private JTextField tfCs;
    private String Result = "";

    public MMSform() {
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
        int s = tfS.getText()!=null ? Integer.parseInt(tfS.getText()) : 1;
        int l = tfL.getText()!=null ? Integer.parseInt(tfL.getText()): 1;
        int m = tfM.getText()!=null ? Integer.parseInt(tfM.getText()): 1;
        double cw = tfCw.getText()!=null ? Double.parseDouble(tfCw.getText()) : 0.0 ;
        double cs = tfCs.getText()!=null? Double.parseDouble(tfCs.getText()) : 0.0;
        int n = tfN.getText()!=null ? Integer.parseInt(tfN.getText()) : 1;
        if(s<=1){
            mm1 = new MM1(l,m,n,cw,cs);
            Result = String.format("\n p: %f \n p0: %f \n pn: %f \n Lq: %f \n L: %f \n Wq: %f \n W: %f \n Ct= %f", mm1.getP(), mm1.getP0(), mm1.getPn(), mm1.getLq(), mm1.getL(), mm1.getWq(), mm1.getW(), mm1.getCt());

        }else {
            mms = new MMS(s, l, m, n,cw,cs);
            Result = String.format("\n p: %f \n p0: %f \n pn: %f \n Lq: %f \n L: %f \n Wq: %f \n W: %f \n Ct= %f", mms.getP(), mms.getP0(), mms.getPn(), mms.getLq(), mms.getL(), mms.getWq(), mms.getW(), mms.getCt());
        }
        tpResult.setText(Result);
    }


}
