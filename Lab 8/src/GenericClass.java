public class GenericClass<T> {
    private T value;

    public GenericClass(T v){
        this.value = v;
    }

    public T getValue(){
        return this.value;
    }

}
