public class MEk1 {

    double lambda,p,mu,n;
    int k;

    double p0,lq,l,wq,w,pn;

    MEk1(double  lambda,int  k, double  mu,double n){
        this.lambda = lambda;
        this.k=k;
        this.p=lambda/mu;
        this.mu=mu;
        this.n=n;
        calculateAll();
    }
    public void calculateAll(){
        calculateP0();
        calculateLq();
        calculateL();
        calculateWq();
        calculateW();
        calculatePn();
    }
    private void calculateP0() {
        p0 = 1-p;
    }
    public void calculateLq(){
        this.lq = ((1+k)/2*k)*(lambda*lambda/mu*(mu-lambda));
    }
    public void calculateL(){
        this.l = this.p+this.lq;
    }
    public void calculateWq(){
        this.wq = ((1+k)/2*k)*(lambda/mu*(mu-lambda));
    }
    public void calculateW(){
        this.w = this.wq + (1/mu);
    }
    public void calculatePn(){
        pn=Math.pow(p,n)*p0;
    }

    public double calculateCt(double cw, double cs){
        double result;
        result = (lq*cw)+(1.0*cs);
        return result;
    }
}
