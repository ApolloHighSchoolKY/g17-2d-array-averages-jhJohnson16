import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    double avg = 0;
    int sum = 0;
    int x = 0;
    for(int[] col: ray)
    {
      avg = 0;
      sum = 0;
      x++;
      for(int row: col) 
      {
        sum += row;
        avg = sum/col.length;
      }
      System.out.println("The average of row " + x+ " is: " + avg);
    }
  }

  public void columnAverages(){
    System.out.println("\n");
    double avg = 0;
    int sum = 0;
    int x = 0;
    for(int col = 0; col<ray[0].length; col++)
    { 
      avg = 0;
      sum = 0;
      x++;
      for(int row = 0; row<ray.length; row++)
      {
        sum += ray[row][col];
        avg = sum/ray[col].length;
      }
      System.out.println("The average of column " + x+ " is: " + avg);
    }
  }

  public void arrayAverage(){
    System.out.println("\n");
    double avg = 0;
    int sum = 0;
    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col<ray[row].length; col++)
      {
        sum += ray[row][col];
        avg = sum/(ray.length * ray[col].length);
      }
    }
    System.out.println("The average of the array is: " + avg);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
