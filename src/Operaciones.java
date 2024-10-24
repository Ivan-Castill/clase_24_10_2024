public class Operaciones {

    double num1,num2;
    double suma;

    //metodo consturctor
    public Operaciones (double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    //metodo personalizado
    public double Sumar(){
        return num1+num2;
    }
    public double resta(){
        return num1-num2;
    }
    public void imprimir(){
        System.out.print("la suma desde el metodo personalizado es: "+Sumar());
        System.out.print("\nla resta desde el metodo personalizado es: "+resta());
    }
    //public void imprimirsuma(){
     //   System.out.print("la suma desde el metodo personalizado es: "+Sumar());
   // }
    //public void imprimirresta(){
      //  System.out.print("\nla resta desde el metodo personalizado es: "+resta());
    //}
    //un objeto
    //        ATRIBUTOS NUM1,NUM2
      //      METODOS CONTRUCTOR
        //    METODO PERSONALIZADO
}
