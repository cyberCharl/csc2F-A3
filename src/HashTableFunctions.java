class HashTableFunctions
{
   // hash function weights
   // 9 integers, each in the range 0-5 to act as weights for the characters in the keys

   int [] weights = {2,1,0,2,1,0,0,1,2};
   //int[] weights = Weights.getWeights();

// ADD YOUR WEIGHTS INSTEAD OF 1s (210210012)

   // returns True if the hash table contains string s
   // return False if the hash table does not contain string s
 boolean find ( String s, int h, int hashTableSize, String [] hashTableArray )
   {
      // WRITE YOUR CODE HERE
      return hashTableArray[h].equals(s);
    }
}
