public class latihan1noLib {
    private Object[] data;
    private int top;

    public latihan1noLib(int size){
        data = new Object[size];
        top = -1;
    }
    public void push(Object obj){
        if (top == data.length -1){
            System.out.println("Stack Overflow");
        }else {
            top++;
            data[top]=obj;
        }
    }
    public Object pop(){
        if (top==-1){
            System.out.println("Stack underflow");
            return null;
        }else {
            Object obj = data[top];
            top--;
            return obj;
        }
    }
    public Object peek(){
        if (top == -1){
            System.out.println("Stack Empty");
            return null;
        }else {
            return data[top];
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == data.length- 1;
    }
    public int search(Object obj){
        int position = -1;

        for (int i =0; i<= top; i++){
            if (data[i].equals(obj)){
                position= top -i +1;
                break;
            }
        }
    return position;
    }

    public static void main(String[] args) {
        latihan1noLib no = new latihan1noLib(5);

        no.push("Aku");
        no.push("Anak");
        no.push("Indonesia");

        System.out.println("Next : "+ no.peek());
        no.push("Raya");
        System.out.println(no.pop());
        no.push("!");

        int hitung = no.search("Aku");
        while (hitung != -1 && hitung>1){
            no.pop();
            hitung--;
        }
        System.out.println(no.pop());
        System.out.println(no.isEmpty());
    }
}
