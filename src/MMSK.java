import java.math.*;

public class MMSK {
    private int s;
    private int lambda;
    private int miu;
    private int k;
    private double p;
    private double p0;
    private double pn;
    private double lq;
    private double l;
    private double wq;
    private double w;
    private double ct;


    public MMSK(){
        s = 2;
        lambda = miu = k = 0;
        p = p0 = pn = lq = l = wq = w = ct = 0.0;
    }
    public MMSK(int s, int lambda, int miu, int n, int k, double cw, double cs){
        this.s =  s;
        this.lambda = lambda;
        this.miu = miu;
        this.p = calculateP();
        this.p0 = calculateP0();
        this.pn = calculatePn(n);
        this.lq = calculateLq();
        this.l = calculateL();
        this.wq =calculateWq();
        this.w = calculateW();
        this.k = k;
        this.ct = (cw == 0.0 && cs == 0.0) ? 0.0 : calculateCt(cw, cs);
    }

    private double calculateP0() {
        double numerador = 1.0;
        double denominador = sumatoriaP0(s) + ((Math.pow((double)lambda /(double) miu, s) / factorial(s)) * sumatoria2P0(k,s));
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
    
    public double sumatoria2P0(int k, int n){
        double result = 0.0;
        for(int i=n+1; i<=k; i++){
            result += Math.pow(p,i-n);
        }
        return result;
    }

    private double calculateP() {
        double p = (double) lambda / ((double)s * (double)miu);
        return p;
    }

    private double calculatePn(int n) {
        double result = 0.0;
        if(n>=0 && n<=s && n<k){
            result = (Math.pow((double)lambda/(double)miu,n)/factorial(n))*p0;
        }else{
        	if(n>s && n<=k){
            	result = (Math.pow((double)lambda/(double)miu,n)/(factorial(n)*Math.pow(s,n-s)))*p0;
            }else{
            	if(n>k){
            		result = 0;
            	}
            }
        }
        return result;
    }
    
    private double calculateLambdaE(){
    	double lambdaE;
    	lambdaE = (double)lambda*(1-calculatePn(k));
    	return lambdaE;
    }

    private double calculateL() {
        
        double l;
        l = calculateLambdaE() * w ;
        return l;
    }

    private double calculateLq() {
        double lq = ((p0 * Math.pow((double)lambda/(double)miu,s) * p)/(factorial(s) * Math.pow((1-p),2)))*(1 - (Math.pow(p,k-s)) - ((k-s) * (Math.pow(p,k-s)) * (1-p)));
        return lq;
    }

    private double calculateW() {
        double w;
        w = wq + 1.0/(double)miu;
        return w;
    }

    private double calculateWq() {
        double wq;
        wq = lq / calculateLambdaE();
        return wq;
    }

    private double calculateCn(int n) {
       double result = 0.0;
       if(n<s && n<k){
           result = Math.pow((double)lambda/(double)miu,n)/factorial(n);
       }else{
       		if(n>=s && n<=k){
           		result = Math.pow((double)lambda/(double)miu,n)/(factorial(n)*Math.pow(s,n-s));
        	}else{
        		if(n>k){
        			result = 0;
        		}
        	}
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