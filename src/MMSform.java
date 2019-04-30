import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
    private String Result = "";

    public MMSform() {
        calcularButton.addActionListener(actionEvent -> {
            tpResult.setText("");
            Result="";
            getResult();
        });
    }

    public void getResult(){
        int s = Integer.parseInt(tfS.getText());
        int l = Integer.parseInt(tfL.getText());
        int m = Integer.parseInt(tfM.getText());
        int n = tfN.getText()!=""? Integer.parseInt(tfN.getText()) : 1;
        if(s<=1){
            mm1 = new MM1(l,m,n);
            Result = String.format("\n p: %f \n p0: %f \n pn: %f \n Lq: %f \n L: %f \n Wq: %f \n W: %f", mm1.getP(), mm1.getP0(), mm1.getPn(), mm1.getLq(), mm1.getL(), mm1.getWq(), mm1.getW());

        }else {
            mms = new MMS(s, l, m, n);
            Result = String.format("\n p: %f \n p0: %f \n pn: %f \n Lq: %f \n L: %f \n Wq: %f \n W: %f", mms.getP(), mms.getP0(), mms.getPn(), mms.getLq(), mms.getL(), mms.getWq(), mms.getW());
        }
        tpResult.setText(Result);
    }


}
