package runner;

import formatting.TerminalFormatting;
import problems.*;
import testdata.*;

import java.util.Arrays;

public class TestRunner {

    private static final TerminalFormatting terminalFormatting = new TerminalFormatting();


    public static void twoSumProblem(){
        TwoSum twoSum = new TwoSum();
        TwoSumData twoSumData = new TwoSumData();
        String[] propertyNames = {"Nums: ", "Target: ", "Expected Answer = ", "Nate's Answer = "};

        terminalFormatting.outputTitle("Two Sum");

        for(TwoSumTestCase sample : twoSumData.getCases()){
            String propertyOne = Arrays.toString(sample.getNums());
            String propertyTwo = String.valueOf(sample.getTarget());
            String propertyThree = Arrays.toString(sample.getExpectedResult());
            String myAnswer = Arrays.toString(twoSum.TwoSum(sample.getNums(),sample.getTarget()));

            String[] properties = {propertyOne,propertyTwo,propertyThree,myAnswer};

            terminalFormatting.outputproperties(propertyNames, properties);
        }

        terminalFormatting.outputTitle("Two Sum");
    }

    public static void duplicateProblem(){
        Duplicate duplicate = new Duplicate();
        DuplicateData duplicateData = new DuplicateData();
        String[] propertyNames = {"Nums: ", "Expected Answer = ", "Nate's HasSet Answer = ", "Nate's Sorting Answer = "};

        terminalFormatting.outputTitle("Contains Duplicate");

        for(DuplicateTestCase sample : duplicateData.getCases()){
            String propertyOne = Arrays.toString(sample.getNums());
            String propertyTwo = String.valueOf(sample.getExpectedResult());
            String myAnswerHS = String.valueOf(duplicate.containsDuplicateHS(sample.getNums()));
            String myAnswerSorting = String.valueOf(duplicate.containsDuplicateSorting(sample.getNums()));

            String[] properties = {propertyOne, propertyTwo, myAnswerHS, myAnswerSorting};

            terminalFormatting.outputproperties(propertyNames,properties);
        }

        terminalFormatting.outputTitle("Contains Duplicate");
    }

    public static void maxProfitProblem(){
        MaxProfit maxProfit = new MaxProfit();
        MaxProfitData maxProfitData = new MaxProfitData();
        String[] propertyNames = {"Nums: ", "Expected Answer = ", "Nate's Answer = "};

        terminalFormatting.outputTitle("Best Time to Buy and Sell Stock");

        for(MaxProfitTestCase sample : maxProfitData.getCases()){
            String propertyOne = Arrays.toString(sample.getNums());
            String propertyTwo = String.valueOf(sample.getExpectedResult());
            String myAnswer = String.valueOf(maxProfit.maxProfit(sample.getNums()));

            String[] properties = {propertyOne,propertyTwo,myAnswer};

            terminalFormatting.outputproperties(propertyNames,properties);
        }

        terminalFormatting.outputTitle("Best Time to Buy and Sell Stock");

    }
}
