public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 3, 6},
                {5, 1, 4},
                {4, 6, 8}
        };

        int determinante =
                        matriz[0][0] * matriz[1][1] * matriz[2][2] +
                        matriz[0][1] * matriz[1][2] * matriz[2][0] +
                        matriz[0][2] * matriz[1][0] * matriz[2][1] -
                        matriz[0][2] * matriz[1][1] * matriz[2][0] -
                        matriz[0][0] * matriz[1][2] * matriz[2][1] -
                        matriz[0][1] * matriz[1][0] * matriz[2][2];

        System.out.println("Determinante da matriz:");
        System.out.println(determinante);
    }
}


/*

static int determinante(int [][]m){
    int cont=0;
    for(int i=0; i<m.length;i++){
        cont = i;
        for(int j=0;j<m[0].length;j++){
            cont++;
            if(cont>m.length-1)
                 cont=0;
            sout(j+" - "+cont);

     }
  }



        sout(cont);
        cont++;
        if(cont>m.length-1)
        cont=0;
    }
    return 0;
}


 */