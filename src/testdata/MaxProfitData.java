package testdata;

public class MaxProfitData {
    private MaxProfitTestCase[] cases;

    public MaxProfitData(){
        cases = new MaxProfitTestCase[]{
                new MaxProfitTestCase(new int[]{7, 1, 5, 3, 6, 4}, 5),          //1
                new MaxProfitTestCase(new int[]{7, 6, 4, 3, 1}, 0),             //2
                new MaxProfitTestCase(new int[]{1, 2, 3, 4, 5}, 4),             //3
                new MaxProfitTestCase(new int[]{5, 5, 5, 5, 5}, 0),             //4
                new MaxProfitTestCase(new int[]{10}, 0),                        //5
                new MaxProfitTestCase(new int[]{1, 10}, 9),                     //6
                new MaxProfitTestCase(new int[]{10, 1}, 0),                     //7
                new MaxProfitTestCase(new int[]{3, 2, 6, 5, 0, 3}, 4),          //8
                new MaxProfitTestCase(new int[]{2, 4, 1, 7}, 6),                //9
                new MaxProfitTestCase(new int[]{8, 1, 2, 4, 6, 3, 9}, 8),      //10
                new MaxProfitTestCase(new int[]{0, 0, 0, 10}, 10),             //11
                new MaxProfitTestCase(new int[]{100, 50, 20, 80, 10, 90}, 80), //12
                new MaxProfitTestCase(new int[]{5, 10, 2, 8, 1, 7}, 6),        //13
                new MaxProfitTestCase(new int[]{4, 9, 2, 3, 8, 1}, 6),         //14
                new MaxProfitTestCase(new int[]{10000, 0, 10000}, 10000),      //15

        };
    }

    public MaxProfitTestCase[] getCases(){
        return cases;
    }
    public MaxProfitTestCase getCase(int index){
        return cases[index];
    }
}
