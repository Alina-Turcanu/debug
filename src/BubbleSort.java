public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7, 2, 5, 4, 1, 6, 0, 3};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }


    public static void bubbleSort(int[] a) {
        //de n ori
        //parcurgem array-ul
        //verificam daca elementul de la i cu cel de la i+1 nu sunt in ordine si interschimbam daca nu sunt


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1, a);


//int[] a = {7,2,5,4,1,6,0,3};
                    //debug manual:
                    //vrem sa sortam numerele de la cel mai mic la cel mai mare
                    //pentru arrayul nostru se va face atatea iteratii cate numere avem in array,lungimea acestuia.

                    // bucla interna va merge de la 0 pana la penultima pozitie
                    //daca numarul de la pozitia actuala a parcurgerii este mai mare decast urmatorul numar
                    //se va realiza schimbul intre numere cu ajutorul unei metode

                    //prima parcurgere
                    //numarul de la prima pozitie este 7 si este mai mare decat numarul de la urmatoarea pozitie,adica 2
                    // si se va realiza schimbul.
                    //la pozitia 1 este 7 acum si el este mai mare decat urmatorul numar ,adica 5 si se va realiza schimbul

                    //la pozitia 2 este 7 acum si este mai mare decat 4 si se va realiza schimbul
                    //7 este la pozitia 3 acum si este mai mare ca 1 si se va face schimbul
                    //7 este acum la pozitia 4 si este mai mare ca 6 si se va realiza schimbul
                    //7 este acum la pozitia 5 si este mai mare ca 0 si se va face schimbul
                    //7 este la pozitia 6 si este mai mare ca 3 si se va face schimbul
                    //7 a ajuns la ultima pozitie si ramane acolo

                    //se reintorce in bucla si reia de la capat parcurgerea pentru a termina sortarea
                    //arrayul nostru arata asa acum : int[] a = {2,5,4,1,6,0,3,7};
                    //la pozitia 0 este acum 2 si nu este mai mare ca 5 si nu se va realiza schimbul
                    //la pozitia 1 este 5 si se va schimba cu 4 deoarece este mai mare
                    //la pozitia 2 este 5 si se va schimba cu 1
                    //5 este acum la pozitia 3 si va ramane acolo ca nu este mai mare ca 6
                    //la pozitia 4 ese 6 si se va schimba cu 0 deoarece este mai mare
                    //la pozitia 5 este 6 si se va schimba cu 3
                    //la pozitia 6 este acum 6 si ramane acolo deoarece este mai mic ca numarul din urmatoarea pozitie
                    // se terjmina parcurgerea

                    //se reintorce in bucla si reia de la capat parcurgerea pentru a termina sortarea
                    ///arrayul nostru arata asa acum : int[] a = {2,4,1,5,0,3,6,7};
                    //la pozitia 0 este acum 2 si nu este mai mare ca 4 si nu se va realiza schimbul
                    //la pozitia 1 este 4 si se va schimba cu 1 deoarece este mai mare
                    //la pozitia 2 este 4 si va ramane acolo ca nu este mai mare ca 5
                    //5 este acum la pozitia 3 si se va schimba cu 0
                    //la pozitia 4 ese 5 si se va schimba cu 3
                    //la pozitia 5 este 5 si va ramane acolo deoarece nu este mai mare decat 6
                    // se terjmina parcurgerea

                    //se reintorce in bucla si reia de la capat parcurgerea pentru a termina sortarea
                    ///arrayul nostru arata asa acum : int[] a = {2,1,4,0,3,5,6,7};
                    //la pozitia 0 este acum 2 si se va schimba cu 1
                    //la pozitia 1 este 2 si va ramane acolo ca nu este mai mare decat 4
                    //la pozitia 2 este 4 si se va schimba cu 0
                    //la pozitia 3 este 4  si se va schimba cu 3
                    //la pozitia 4 ese 4 si va ramane acolo deoarece nu este mai mare decat 5
                    // se terjmina parcurgerea

                    //se reintorce in bucla si reia de la capat parcurgerea pentru a termina sortarea
                    ///arrayul nostru arata asa acum : int[] a = {1,2,0,3,4,5,6,7};
                    //la pozitia 0 este acum 1 si va ramane acolo
                    //la pozitia 1 este 2 si se va schimba cu 0
                    //la pozitia 2 este 2 si va ramane acolo ca nu este mai mare decat 3
                    // se terjmina parcurgerea

                    //se reintorce in bucla si reia de la capat parcurgerea pentru a termina sortarea
                    ///arrayul nostru arata asa acum : int[] a = {1,0,2,3,4,5,6,7};
                    //la pozitia 0 este acum 1 si se va schimba cu 0
                    //la pozitia 1 este 1 si va ramane acolo deoarece nu este mai mare ca 2
                    // se terjmina parcurgerea

                    // s-a realiat numarul de iteratii si se iese din bucla
                }
            }
        }
    }

    public static void swap(int index1, int index2, int[] a) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;

        //debug manual
        //  avem 2 indexi si un array
        //  trebuiue sa facem schimb de numere si pentru asta vom avea nevoie de o variabila temporara
        //in variabila temporara vom pune numarul din pozitia de la index1
        //numarul de la index1 va fi inlocuit de numarul de la indexul 2
        // numarul de la indexul 2 va fi inlocuit de numarul pus in variabila temporara.

    }
}
