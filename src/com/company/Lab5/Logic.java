package com.company.Lab5;

public class Logic {

    //problema 2
    int array[] = new int[101];

    public void createArray(int n) {
        for (int i = 1; i <= n; i++) {
            array[i] = i;
        }
    }

    //n = cate elemente din vector vrei sa afisezi
    public void printArray(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(array[i] + " ");
        }
    }

    //Problema 3
    public void populateArray(int array[], int n) {
        for(int i=1; i <= n; i++) {
            array[i] = i * 2; //Generam primele n valori pare
        }
    }

    //Problema 4
    public double average(int array1[], int no) {
        double s = 0; //suma este 0
        for (int i = 1; i <= no; i++) {
            s=s+array1[i];
        }
        return s/no; //Suma / numarul de elemente (media)
    }

    //PRoblema 5
    public boolean contains(String array2[], String n) {
        for(int i=1; i<= array2.length-1; i++) { //PArcurs vectorul
            if(n.equals(array2[i])){ //Verificam daca l-am gasit pe pozitie si daca da returnam
                return true;
            }
        }
        return false;
    }

    //PRoblema 6
    public int containsValue(int array3[], int nr) {
        for(int i=1; i<= array3.length-1; i++) {
            if(nr == array3[i]) {
                return i; //Pozitia pe care l-am gasit
            }
        }
        return -1;
    }




}
