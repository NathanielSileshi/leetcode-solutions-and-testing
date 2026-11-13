package testdata;

public class DuplicateData {
    DuplicateTestCase[] cases;

    public DuplicateData(){

        /*
        Tests 1–4: Basic duplicate detection.
        Tests 5–7: Small arrays and repeated values.
        Tests 8–9: Negative integers.
        Tests 10–12: Duplicates at different positions.
        Tests 13–14: Mixed positive/negative values and integer boundaries.
        Test 15: A longer array with no duplicates.
        */


        cases = new DuplicateTestCase[]{
                new DuplicateTestCase(new int[]{1, 2, 3, 1}, true),                              //1
                new DuplicateTestCase(new int[]{1, 2, 3, 4}, false),                             //2
                new DuplicateTestCase(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true),            //3
                new DuplicateTestCase(new int[]{1, 2, 3, 4, 5, 6}, false),                       //4
                new DuplicateTestCase(new int[]{5, 5}, true),                                    //5
                new DuplicateTestCase(new int[]{7}, false),                                      //6
                new DuplicateTestCase(new int[]{0, 0}, true),                                    //7
                new DuplicateTestCase(new int[]{-1, -2, -3, -1}, true),                          //8
                new DuplicateTestCase(new int[]{-5, -4, -3, -2, -1}, false),                     //9
                new DuplicateTestCase(new int[]{10, 20, 30, 40, 10}, true),                     //10
                new DuplicateTestCase(new int[]{100, 200, 300, 400, 500}, false),               //11
                new DuplicateTestCase(new int[]{1, 2, 3, 4, 5, 1}, true),                       //12
                new DuplicateTestCase(new int[]{0, -1, 1, -2, 2}, false),                       //13
                new DuplicateTestCase(new int[]{2147483647, -2147483648, 0, 2147483647}, true), //14
                new DuplicateTestCase(new int[]{2, 4, 6, 8, 10, 12, 14, 16}, false),            //15
        };
    }

    public DuplicateTestCase[] getCases() {
        return cases;
    }
    public DuplicateTestCase getCase(int index){
        return cases[index];
    }
}
