public class MG1 {

    double lambda,sigma,p,mu,n ;

    double p0,lq,l,wq,w,pn;

    MG1(double  lambda,double  sigma,double  mu,double n){
        this.lambda = lambda;
        this.sigma=sigma;
        this.mu=mu;
        this.p=lambda/mu;
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
    public void calculateP0(){
        p0=1-p;
    }

    public void calculateLq(){
        this.lq = ((this.lambda*this.lambda
                *this.sigma*this.sigma)
                +(this.p*this.p))
                /(2*(1-this.p));
    }
    public void calculateL(){
        this.l = this.p+this.lq;
    }
    public void calculateWq(){
        this.wq = ((this.lambda*this.lambda
                *this.sigma*this.sigma)
                +(this.p*this.p))
                /(2*this.lambda*(1-this.p));
    }
    public void calculateW(){
        this.w = this.wq + (1/mu);
    }

    public void calculatePn(){
        pn=Math.pow(p,n)*p0;
    }

}
