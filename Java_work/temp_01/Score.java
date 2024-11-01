import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int failCount = 0; // 不及格人数
        int passCount = 0; // 及格人数
        int middleCount = 0; // 中等人数
        int goodCount = 0; // 良好人数
        int excellentCount = 0; // 优秀人数
        double totalScore = 0; // 总分
        int studentCount = 0; // 学生总数

        System.out.println("请输入学生成绩，输入-1结束：");
        
        while (true) {
            double score = scanner.nextDouble();
            
            if (score == -1) {
                break; // 输入-1，结束循环
            }

            // 统计各个区间段的人数
            if (score < 60) {
                failCount++;
            } else if (score < 70) {
                passCount++;
            } else if (score < 80) {
                middleCount++;
            } else if (score < 90) {
                goodCount++;
            } else {
                excellentCount++;
            }

            totalScore += score; // 累加总分
            studentCount++; // 学生总数加1
        }

        // 计算平均分
        double averageScore = (studentCount > 0) ? (totalScore / studentCount) : 0;

        // 输出结果
        System.out.println("不及格的人数为：" + failCount);
        System.out.println("及格的人数为：" + passCount);
        System.out.println("中等的人数为：" + middleCount);
        System.out.println("良好的人数为：" + goodCount);
        System.out.println("优秀的人数为：" + excellentCount);
        System.out.printf("全班平均分为：%.1f\n", averageScore);
        
        scanner.close(); // 关闭扫描器
    }
}
