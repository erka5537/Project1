package org.example;

public class Ex10 {

    public static void main(String[] args) {

//        Soru 2) Asagidaki multi dimensional arrayin ic array'lerindeki son elemanlarin carpimini ekrana yazdiran bir program yaziniz
//        { {1,2,3}, {4,5}, {6}}

        int arr[][] = { {1,2,3}, {4,5}, {6}, {2}};

//        arr[0][3]
//        arr[1][2]
//        arr[2][0]
        int carpım = 1;
        for(int i=0; i<arr.length; i++){
           carpım = carpım*arr[i][arr[i].length-1];
        }
        System.out.println(carpım);
    }
}
