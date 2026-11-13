package testdata;

public class TwoSumData {
   private TwoSumTestCase[] cases;

   public TwoSumData(){
       cases = new TwoSumTestCase[]{
               new TwoSumTestCase(new int[]{2, 7, 11, 15}, 9, new int[]{0,1}),         //1
               new TwoSumTestCase(new int[]{3, 2, 4}, 6, new int[]{1,2}),              //2
               new TwoSumTestCase(new int[]{3,3}, 6, new int[]{0,1}),                  //3
               new TwoSumTestCase(new int[]{1, 5, 8, 12}, 13, new int[]{0,3}),         //4
               new TwoSumTestCase(new int[]{-3, 4, 3, 90}, 0, new int[]{0,2}),         //5
               new TwoSumTestCase(new int[]{0, 4, 3, 0}, 0, new int[]{0,3}),           //6
               new TwoSumTestCase(new int[]{10, 20, 30, 40}, 70, new int[]{2,3}),      //7
               new TwoSumTestCase(new int[]{1, 2, 3, 4, 5}, 9, new int[]{3,4}),        //8
               new TwoSumTestCase(new int[]{-10, -5, 0, 5, 10}, -15, new int[]{0,1}),  //9
               new TwoSumTestCase(new int[]{100, 200, 300, 400}, 500, new int[]{1,2}) //10
       };
   }

    public TwoSumTestCase[] getCases() {
        return cases;
    }
}
