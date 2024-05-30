
import java.util.Arrays;

public class BinarySearch {

    //initial left = 0
    //intial right = lengh-1
    //atat timp cat left mai mic sau egal right
        //middle devine left + right /2
        //if (numarul cautat este elementul de la zpoitia middle)
             //return
        //else if (numarul cautat este mai mic decat  elementul de la zpoitia middle )
            //right devine middle - 1
        //altfel
            //left devine middle + 1

    public static void main(String[] args) {
        int[] a = {0,2,5,8,10,11,14,25,33};
        Arrays.sort(a);

        System.out.println(binarySearch(a,5));
    }

    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int middle = (left+right)/2;
            if (target == array[middle]){
                return middle;
            } else if (target < array[middle]){
                right = middle - 1;
            } else{
                left = middle + 1;
            }
        }
        return -1;
        //DEBUG MANUAL
           //avem un array int[] a = {0,2,5,8,10,11,14,25,33};
            //vrem sa cautam un numar in acest array
              //ne luam o variabila pentru partea stanga si o vom initializa cu prima pozitie
              //ne luam o variabila pentru partea dreapta si o vom initializa cu ultima pozitie
              //atata timp cat stanga este mai mica sau egala cu partea dreapta
              //mijlocul va fi stanga +dreapta impartit la 2,adica numarul de la jumatatea array-ului
             //daca numarul cautat este egal cu numarul din mijloc,va iesi din bucla si va afisa
        //pozitia unde se afla acel numar in array
             //daca numarul cautat este mai mic decat mijlocul array-ului
        //partea dreapta se va duce cu o pozitie mai la stanga pentru a il cauta
             //in cazul nostru,numarul cautat este 5 si se va duce spre stanga cu cate o pozitie,pana il gaseste
        //partea dreapta in cazul nostru va fi de la mijloc -1 o data,si apoi inca o data se va mai duce
        // la stanga cu o pozitie si atunci cand il va gasi va iesi din bucla si va afisa la consola pozitia
        // unde s afla
           //daca numarul cautat nu exista va iesi din bucla noastra while si va afisa -1
    }
}

