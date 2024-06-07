package debuggingexercises;

public class Debugging1 {

    //Scrie o metoda care pentru fiecare aparitiei a secventei “abc_” intr-un String (unde _ poate fi
    // orice caracter) va printa “bc_” . De exemplu, findAbc(“abcdefabcghi”) va printa:

    //bcd
    //bcg

    //Ce se intampla de fapt?
    //Prima data se aseste secventa "abcd", si printeaza "bcd". In cazul acesta, _ este d.
    //Apoi gaseste secventa "abcg" si printeaza "bcg". In cazul acesta, _ este g.

    //Practic vrei sa gasesti toate secventele de 4 litere care incep cu "abc".
    // Daca ai gasi secventa "abcn", ar trebui sa printezi "bcn".

    public static void findAbc(String input) throws ErrorfFindingException {
        int index = input.indexOf("abc");
        while (index != -1) {
            String found = input.substring(index + 1, index + 4);
            System.out.println(found);
            index = input.indexOf("abc", index + 4);

            if (index == -1) {
                throw new ErrorfFindingException("Nu exista alt grup de litere disponibil");
            }
        }

    }

    public static void main(String[] args) {
        //1. decomenteaza linia 30. Vei apela metoda cu parametrul "abcd"

        try {
            findAbc("abcd");
        } catch (ErrorfFindingException e) {
            System.err.println(e.getMessage());
        }
       // findAbc("abcd");
            //1.1 care ar trebui sa fie output-ul in mod normal?
                    //abcd
            //1.2 care este output-ul dupa ce faci debug manual/intellij?
                          //bcd


        ///2. decomenteaza linia 36. Vei apela metoda cu parametrul "abcdabc"
        //findAbc("abcdabc");
        try {
            findAbc("abcdabc");
        } catch (ErrorfFindingException e) {
            System.err.println(e.getMessage());
        }
            //2.1 care ar trebui sa fie output-ul in mod normal?
                          //abcd //abc
            //2.2 care este output-ul dupa ce faci debug manual/intellij?
                //2.2.1 la ce linie de cod programul nu mai functioneaza,sau altfel spus: care este linia de cod care cauzeaza eroarea?
        // la linia 21,dupa ce a parcurs abcdabc si a trecut de abcd,cand ajunge la abc(fiind decat abc,fara nicio litera dupa) apare o eroare,
                //2.2.2 de ce apare eroarea?
        //nu mai are elemente de parcurs,conditia fiind de la i+1 la i+4.
                //2.2.3 dupa ce gasesti motivul pentru care apare eroare, descrie problema clar,
        // astfel incat cineva sa poate intelege problema ta si sa te poata ajuta
                //avem abcdabc,noi trebuie sa vedem pozitia lui "abc",sa scoatem prima litera si sa adaugam ce litera vine in continuare,
                //in acest cuvant avem de 2 ori abc,insa numai dupa primul grup urmeaza o litera



            //2.3 cum se poate rezolva eroarea?
        // la metoda noastra findAbc,trebuie sa specificam ca este posibil sa fie o eroare in momentul cand apelam
            //2.4 da un alt exemplu de input pentru care apare exact aceasi eroare, in codul initial
                 //ab //abab //ac //aer
        //3.decomenteaza linia 43
       // findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
        try {
            findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
        } catch (ErrorfFindingException e) {
            System.err.println(e.getMessage());
        }
            //3.1 care ar trebui sa fie output-ul in mod normal?
                                //abcd
            //3.2 care este output-ul dupa ce faci debug manual/intellij?
                                //bcdk / bca
                //3.2.1 care este problema? ce anume nu este cum ar trebui in rezultat?
                //3.2.2 descrie problema clar, astfel incat cineva sa poate intelege problema ta si sa te poata ajuta
                //3.2.3 care este situatia in care apare aceasta problema? Altfel spus: cum trebuie sa fie input-ul ca sa apara aceasta problema?
            //3.3 ce modificare trebuie sa faci pentru a rezolva problema?
    }
}
