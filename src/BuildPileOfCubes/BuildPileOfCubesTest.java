package BuildPileOfCubes;

public class BuildPileOfCubesTest {
    public static void main(String[] args) {
        /*
        * Your task is to construct a building which will be a pile of n cubes.
        * The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3
        * and so on until the top which will have a volume of 1^3.
        * You are given the total volume m of the building.
        * Being given m can you find the number n of cubes you will have to build?
        * The parameter of the function findNb (find_nb, find-nb, findNb) will be an integer m
        * and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m
        * if such a n exists or -1 if there is no such n.
        * */
        long cas1 = 1071225;
        long cas2 = 91716553919377L;
        long cas3 = 1675108955365560010L;
        long cas4 = 2200178329312635722L;
        long cas5 = 1769491660066208100L;
        System.out.println("For "+ cas1 + " -> " + BuildPileOfCubes.findNb(cas1));
        System.out.println("For "+ cas2 + " -> " + BuildPileOfCubes.findNb(cas2));
        System.out.println("For "+ cas3 + " -> " + BuildPileOfCubes.findNb(cas3));
        System.out.println("For "+ cas4 + " -> " + BuildPileOfCubes.findNb(cas4));
        System.out.println("For "+ cas5 + " -> " + BuildPileOfCubes.findNb(cas5));

        long cas10 = BuildPileOfCubes.findM(34);
        System.out.println("Inversion 34 :"+cas10);
        System.out.println("For "+ cas10 + " -> " + BuildPileOfCubes.findNb(cas10));
        long cas11 = BuildPileOfCubes.findM(55100);
        System.out.println("Inversion 55100 :"+cas11);
        System.out.println("For "+ cas11 + " -> " + BuildPileOfCubes.findNb(cas11));

    }
}
