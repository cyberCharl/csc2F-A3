public class Weights {
/*
in order to find the correct weight value i looped through the possibilities in the main string of TestHashTable.java.
Bellow is the code i used, i will be removing it from the main string as its only purpose is
to repeatedly run the program with differing weight values


public static void main ( String [] args )
   {
      for (int a = 0; a < 5; a ++) {
         for (int b = 0; b < 5; b++) {
            for (int c = 0; c < 5; c++) {
               for (int d = 0; d < 5; d++) {
                  for (int e = 0; e < 5; e++) {
                     for (int f = 0; f < 5; f++) {
                        for (int g = 0; g < 5; g++) {
                           for (int h = 0; h < 5; h++) {
                              for (int i = 0; i < 5; i++) {
                                 for (int j = 0; j < 5; j++) {

                                    Weights weights = new Weights(a, b, c, d, e, f, g, h, i, j);
                                    (new TestHashTable ()).run(0, weights);

                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
*/
    public static int[] weigh;

    // constructor
    public Weights(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        weigh = new int[]{a, b, c, d, e, f, g, h, i, j};
    }

    public static int[] getWeights() {
        return weigh;
    }

    @Override
    public String toString() {
        return ("weight = " + weigh[0] + weigh[1] + weigh[2] + weigh[3] + weigh[4] + weigh[5] + weigh[6] + weigh[7] + weigh[8]);
    }
}

