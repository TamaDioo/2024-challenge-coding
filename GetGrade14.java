// Day 14/366 Coding Challenge 2024
// https://www.codewars.com/kata/55cbd4ba903825f7970000f5

public class GetGrade14 {
    public static char getGrade(int s1, int s2, int s3) {
        double score = (s1 + s2 + s3) / 3;
        char hrf = 'F';
        if (score >= 90 && score <= 100) {
            hrf = 'A';
        } else if (score < 90 && score >= 80) {
            hrf = 'B';
        } else if (score < 80 && score >= 70) {
            hrf = 'C';
        } else if (score < 70 && score >= 60) {
            hrf = 'D';
        }
        return hrf;
    }
}