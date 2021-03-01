import org.w3c.dom.ls.LSOutput;

public class minmax {
    public static void main(String[] args) {


        int min = 1;
        int max = 9;
        int temp = 0;

        temp = min;
        min=max;
        max=temp;

        System.out.println("min is " + min + ", max is " + max);

       // temp = array[max_index_i][max_index_j];
       // array[max_index_i][max_index_j] = array[min_index_i][min_index_j];
       // array[min_index_i][min_index_j] = temp;

    }
}
