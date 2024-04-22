package Week3.Lambdas_Streams.Q4;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class ExamData {
    private String studentName;
    private double testScore;
    public ExamData(String name, double score){
        studentName = name;
        testScore = score;
    }

    public static void main(String[] args) {
        List<ExamData> data = new ArrayList<ExamData>();
        data.add(new ExamData("George", 91.3));
        data.add(new ExamData("Tom", 88.9));
        data.add(new ExamData("Rick", 80));
        data.add(new ExamData("Harold", 90.8));
        data.add(new ExamData("Ignatius", 60.9));
        data.add(new ExamData("Anna", 77));
        data.add(new ExamData("Susan", 87.3));
        data.add(new ExamData("Phil", 99.1));
        data.add(new ExamData("Alex", 84));


       DoubleSummaryStatistics summary = data.stream()
                .mapToDouble(d -> d.testScore)
                .summaryStatistics();
       double avg = summary.getAverage();
       double max = summary.getMax();
       double min = summary.getMin();
       System.out.printf("Average: %2f, Max: %2f, Min: %2f", avg, max, min);
    }
}
