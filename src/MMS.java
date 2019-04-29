import java.math.*;

public class MMS {
    private int s;
    private int lambda;
    private int miu;
    private double p;
    private double p0;
    private double pn;
    private double lq;
    private double l;
    private double wq;
    private double w;

    public MMS(){
        s = 2;
        lambda = miu = 0;
        p = p0 = pn = lq = l = wq = w = 0.0;
    }
    public MMS(int s, int lambda, int miu, double p, double p0, double pn, double lq, double l, double wq, double w){

        this.s = s>=2 ? s: 2;
        this.lambda = lambda;
        this.miu = miu;
        this.p = calculateP();
        this.p0 = calculateP0();
        this.pn = calculatePn();
        this.lq = calculateLq();
        this.l = calculateL();
        this.wq =calculateWq();
        this.w = calculateW();
    }

    private double calculateP0() {
        return 0.0;
    }

    private double calculateP() {
        double p = (double) lambda / ((double)s * (double)miu);
        return p;
    }

    private double calculatePn() {
        calculateCn();
        return 0.0;
    }

    private double calculateL() {
        double l;
        l = lq + (double)lambda/(double)miu;
        return l;
    }

    private double calculateLq() {
        double lq = (p0 * Math.pow((double)lambda/(double)miu,2) * p)/(factorial(s) * Math.pow((1-p),2));
        return lq;
    }

    private double calculateW() {
        double w;
        w = wq + 1.0/(double)miu;
        return w;
    }

    private double calculateWq() {
        double wq;
        wq = lq / (double)lambda;
        return wq;
    }

    private double calculateCn() {
        return 0.0;
    }

    private double factorial(int num){
        double result = 1.0;
        for(int i=1; i<num;i++){
            result *= i;
        }
        return result;
    }



}
