import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Principal");
        frame.setContentPane(new MMSform().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        /* Pruebas Comprobación MM1
        int n = 10;
        MM1 m = new MM1(1,3,10);
        System.out.println("P: " + m.getP());
        System.out.println("P0: " + m.getP0());
        for(int i = n; i > 0; i-- ){
            System.out.println("Pn: " + m.calculatePn(i));
        }
        System.out.println("Lq: " + m.getLq());
        System.out.println("L: " + m.getL());
        System.out.println("Wq: " + m.getWq());
        System.out.println("w: " + m.getW());
        */
    }

}