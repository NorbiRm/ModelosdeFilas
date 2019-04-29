public class MM1 {
    private double lambda;
    private double miu;
    private double p;
    private double lq;
    private double l;
    private double wq;
    private double w;
    private double p0;

    public MM1(double lambda, double miu, double p, double lq, double l, double wq, double w, double p0) {
        this.lambda = lambda;
        this.miu = miu;
        this.p = p;
        this.lq = lq;
        this.l = l;
        this.wq = wq;
        this.w = w;
        this.p0 = p0;
    }
    public MM1(){

    }


    //Probabilidad sistema desocupado
    public double calculateP0(double p){
        double p0;
        p0 = 1 - p;
        return p0;
    }
    //factor de utilización
    public double calculateP(double lambda, double miu){
        double p;
        p = lambda/miu;
        return p;
    }
    //número promedio de clientes en la cola
    public double calculateLQ(double lambda, double miu){
        double lq;
        double lambda2 = 0;
        lambda2 = Math.pow(lambda, 2);
        lq = (lambda2/(miu*(miu-lambda)));
        return lq;
    }
    //número promedio de clientes en el sistema
    public double calculateL(double lambda, double miu){
        double l;
        l = (lambda/(miu-lambda));
        return l;
    }
    //tiempo esperado en la cola
    public double calculateWq(double lambda, double miu){
        double wq;
        wq = (lambda/(miu*(miu-lambda)));
        return wq;
    }
    //tiempo promedio en el sistema
    public double calculateW(double lambda, double miu){
        double w;
        w = 1/(miu-lambda);
        return w;
    }


}
