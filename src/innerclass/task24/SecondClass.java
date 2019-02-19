package innerclass.task24;

public class SecondClass {
    public class Inner extends FirstClass.Inner{
        public Inner(FirstClass fc){
            fc.super("", 0);
        }
    }
}
