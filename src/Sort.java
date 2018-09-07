import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        String[] names={"Maik"};
        int[] nums={200,300,100};



        display(names);
        display(nums);

        Arrays.sort(names);
        Arrays.sort(nums);

        display(names);
        display(nums);
    }
    public static void display(String[] elems){
        System.out.println("\nСтроковый Массив : ");
        for(int i=0;i<elems.length;i++){
            System.out.println("Элемент "+i+" - "+elems[i]);
        }
    }
    public static void display(int[] elems){
        System.out.println("Целочисленный массив : ");
        for(int i=0;i<elems.length;i++){
            System.out.println("Элемент "+i+" - "+elems[i]);
        }
    }

}
