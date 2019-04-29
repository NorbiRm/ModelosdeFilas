public class MM1 {
    private double lambda;
    private double miu;
    private double p;
    private double lq;
    private double l;
    private double wq;
    private double w;
    private double p0;
    private double pn;

    public MM1(double lambda, double miu, int n) {
        this.lambda = lambda;
        this.miu = miu;
        this.p = calculateP();
        this.p0 = calculateP0();
        this.pn = calculatePn(n);
        this.lq = calculateLQ();
        this.l = calculateL();
        this.wq = calculateWq();
        this.w = calculateW();
    }
    public MM1(){

    }


    //Probabilidad sistema desocupado
    public double calculateP0(){
        double p0;
        p0 = 1 - p;
        return p0;
    }
    //factor de utilización
    public double calculateP(){
        double p;
        p = lambda/miu;
        return p;
    }
    //número promedio de clientes en la cola
    public double calculateLQ(){
        double lq;
        double lambda2 = 0;
        lambda2 = Math.pow(lambda, 2);
        lq = (lambda2/(miu*(miu-lambda)));
        return lq;
    }
    //número promedio de clientes en el sistema
    public double calculateL(){
        double l;
        l = (lambda/(miu-lambda));
        return l;
    }
    //tiempo esperado en la cola
    public double calculateWq(){
        double wq;
        wq = (lambda/(miu*(miu-lambda)));
        return wq;
    }
    //tiempo promedio en el sistema
    public double calculateW(){
        double w;
        w = 1/(miu-lambda);
        return w;
    }
    public double calculatePn(int n){
        double pn;
        pn = (1 - p)*(Math.pow(p,n));
        return pn;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double getMiu() {
        return miu;
    }

    public void setMiu(double miu) {
        this.miu = miu;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
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
}
