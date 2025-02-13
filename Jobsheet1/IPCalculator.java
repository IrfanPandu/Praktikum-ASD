public class IPCalculator {

    public static void main(String[] args) {
        // Define course names and corresponding grades
        String[] courses = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matermatika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        double[] grades = {75, 85, 70, 85, 85, 62, 62, 85};

        // Calculate IP
        double ip = calculateIP(grades);

        // Display results
        System.out.println("Program Menghitung IP Semester");
        System.out.println("----------------------------");
        System.out.println("hasil Konversi Nilai");
        System.out.println("----------------------------");
        System.out.println("MK\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.println("----------------------------");
        for (int i = 0; i < courses.length; i++) {
            String gradeLetter = getGradeLetter(grades[i]);
            double gradeValue = getGradeValue(grades[i]);
            System.out.println(courses[i] + "\t" + grades[i] + ".00\t" + gradeLetter + "\t" + gradeValue);
        }
        System.out.println("----------------------------");
        System.out.println("IP : " + ip);
    }

    // Calculate IP based on grade values
    private static double calculateIP(double[] grades) {
        double totalGradePoints = 0;
        for (double grade : grades) {
            totalGradePoints += getGradeValue(grade);
        }
        return totalGradePoints / grades.length;
    }

    // Get grade letter based on numeric grade
    private static String getGradeLetter(double grade) {
        if (grade >= 85) {
            return "A";
        } else if (grade >= 75) {
            return "B+";
        } else if (grade >= 70) {
 return "B";
        } else if (grade >= 65) {
            return "C+";
        } else if (grade >= 60) {
            return "C";
        } else if (grade >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    // Get grade value based on numeric grade
    private static double getGradeValue(double grade) {
        if (grade >= 85) {
            return 4.0;
        } else if (grade >= 75) {
            return 3.7;
        } else if (grade >= 70) {
            return 3.0;
        } else if (grade >= 65) {
            return 2.3;
        } else if (grade >= 60) {
            return 2.0;
        } else if (grade >= 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}