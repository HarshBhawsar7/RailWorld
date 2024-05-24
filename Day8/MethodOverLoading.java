package Day8;

public class MethodOverLoading {
        public float AreaOfTriangle(float b,float l){
            float res= (float) (0.5*l*b);
            return res;
        }

    public float AreaOfRectangle(float l,float w){
        float res= l*w;
        return res;
    }

    public static void main(String[] args) {
       MethodOverLoading mod=new MethodOverLoading();
       float res=mod.AreaOfTriangle(5,3);
        System.out.println("area of Triangle :"+res);
        float res2= mod.AreaOfRectangle(5,3);
        System.out.println("area of Rectangle :"+res2);
    }
}
