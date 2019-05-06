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
    private double ct;

    public MMS(){
        s = 2;
        lambda = miu = 0;
        p = p0 = pn = lq = l = wq = w = ct = 0.0;
    }
    public MMS(int s, int lambda, int miu, int n, double cw, double cs){
        this.s = s>=2 ? s: 2;
        this.lambda = lambda;
        this.miu = miu;
        this.p = calculateP();
        this.p0 = calculateP0();
        this.pn = calculatePn(n);
        this.lq = calculateLq();
        this.l = calculateL();
        this.wq =calculateWq();
        this.w = calculateW();
        this.ct = (cw == 0.0 && cs == 0.0) ? 0.0 : calculateCt(cw, cs);
    }

    private double calculateP0() {
        double numerador = 1.0;
        double denominador = sumatoriaP0(s - 1) + ((Math.pow((double)lambda /(double) miu, s) / factorial(s)) * (1.0 / (1.0 - ((double)lambda / (double) (s * miu)))));
        return numerador/denominador;
    }

    private double calculateCt(double cw, double cs){
        double result;
        result = (getLq()*cw) + ((double)getS()*cs);
        return result;
    }

    public double sumatoriaP0(int n){
        double result = 0.0;
        for(int i=0; i<=n; i++){
            result += Math.pow(((double)lambda/(double)miu),i)/factorial(i);
        }
        return result;
    }

    private double calculateP() {
        double p = (double) lambda / ((double)s * (double)miu);
        return p;
    }

    private double calculatePn(int n) {
        double result;
        if(n>=0 && n<s){
            result = (Math.pow((double)lambda/(double)miu,n)/factorial(n))*p0;
        }else{
            result = (Math.pow((double)lambda/(double)miu,n)/(factorial(n)*Math.pow(s,n-s)))*p0;
        }
        return result;
    }

    private double calculateL() {
        double l;
        l = lq + (double)lambda/(double)miu;
        return l;
    }

    private double calculateLq() {
        double lq = (p0 * Math.pow((double)lambda/(double)miu,s) * p)/(factorial(s) * Math.pow((1-p),2));
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

    private double calculateCn(int n) {
       double result;
       if(n<(s-1)){
           result = Math.pow((double)lambda/(double)miu,n)/factorial(n);
       }else{
           result = Math.pow((double)lambda/(double)miu,n)/(factorial(n)*Math.pow(s,n-s));
       }

       return result;
    }

    private double factorial(int num){
        double result = 1.0;
        for(double i=1.0; i<=num;i++) result *= i;
        return result;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getLambda() {
        return lambda;
    }

    public void setLambda(int lambda) {
        this.lambda = lambda;
    }

    public int getMiu() {
        return miu;
    }

    public void setMiu(int miu) {
        this.miu = miu;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getP0() {
        return p0;
    }

    public void setP0(double p0) {
        this.p0 = p0;
    }

    public double getPn() {
        return pn;
    }

    public void setPn(double pn) {
        this.pn = pn;
    }

    public double getLq() {
        return lq;
    }

    public void setLq(double lq) {
        this.lq = lq;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getWq() {
        return wq;
    }

    public void setWq(double wq) {
        this.wq = wq;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getCt() {
        return ct;
    }

    public void setCt(double ct) {
        this.ct = ct;
    }


}
