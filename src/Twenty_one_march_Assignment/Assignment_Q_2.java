package Twenty_one_march_Assignment;

public class Assignment_Q_2 {
    public static void main(String[] args) {

        SalarySlip e1 = new SalarySlip(1001, "kartik", 2000, 1);
        SalarySlip e2 = new SalarySlip(1002, "kishan", 30000, 1);
        SalarySlip e3 = new SalarySlip(1003, "jay", 50000, 1);
        SalarySlip e4 = new SalarySlip(1004, "het", 4000, 1);
        SalarySlip e5 = new SalarySlip(1005, "daxit", 800, 1);
        SalarySlip e6 = new SalarySlip(1006, "dex", 1000, 1);

        SalarySlip e7 = new SalarySlip(1001, "kartik", 90000.0, 2);
        SalarySlip e8 = new SalarySlip(1002, "kishan", 30000.0, 2);
        SalarySlip e9 = new SalarySlip(1003, "jay", 50000.0, 2);
        SalarySlip e10 = new SalarySlip(1004, "het", 40000.0, 2);
        SalarySlip e11 = new SalarySlip(1005, "daxit", 80000.0, 2);
        SalarySlip e12 = new SalarySlip(1006, "daxit", 40000.0, 2);

        SalarySlip e13 = new SalarySlip(1001, "kartik", 20000.0, 3);
        SalarySlip e14 = new SalarySlip(1002, "kishan", 30000.0, 3);
        SalarySlip e15 = new SalarySlip(1003, "jay", 50000.0, 3);
        SalarySlip e16 = new SalarySlip(1004, "het", 40000.0, 3);
        SalarySlip e17 = new SalarySlip(1005, "daxit", 80000.0, 3);
        SalarySlip e18 = new SalarySlip(1006, "daxit", 80000.0, 3);

        SalarySlip e19 = new SalarySlip(1001, "kartik", 20000.0, 4);
        SalarySlip e20 = new SalarySlip(1002, "kishan", 30000.0, 4);
        SalarySlip e21 = new SalarySlip(1003, "jay", 50000.0, 4);
        SalarySlip e22 = new SalarySlip(1004, "het", 40000.0, 4);
        SalarySlip e23 = new SalarySlip(1005, "daxit", 80000.0, 4);
        SalarySlip e24 = new SalarySlip(1006, "daxit", 80000.0, 4);


        SalarySlip e25 = new SalarySlip(1001, "kartik", 20000.0, 5);
        SalarySlip e26 = new SalarySlip(1002, "kishan", 30000.0, 5);
        SalarySlip e27 = new SalarySlip(1003, "jay", 50000.0, 5);
        SalarySlip e28 = new SalarySlip(1004, "het", 60000.0, 5);
        SalarySlip e29 = new SalarySlip(1005, "daxit", 80000.0, 5);
        SalarySlip e30 = new SalarySlip(1006, "daxit", 80000.0, 5);

        SalarySlip e31 = new SalarySlip(1001, "kartik", 20000.0, 6);
        SalarySlip e32 = new SalarySlip(1002, "kishan", 30000.0, 6);
        SalarySlip e33 = new SalarySlip(1003, "jay", 50000.0, 6);
        SalarySlip e34 = new SalarySlip(1004, "het", 40000.0, 6);
        SalarySlip e35 = new SalarySlip(1005, "daxit", 80000.0, 6);
        SalarySlip e36 = new SalarySlip(1006, "daxit", 70000.0, 6);

        SalarySlip[][] salarySlips = new SalarySlip[6][6];

        salarySlips[0][0] = e1;
        salarySlips[0][1] = e2;
        salarySlips[0][2] = e3;
        salarySlips[0][3] = e4;
        salarySlips[0][4] = e5;
        salarySlips[0][5] = e6;

        salarySlips[1][0] = e7;
        salarySlips[1][1] = e8;
        salarySlips[1][2] = e9;
        salarySlips[1][3] = e10;
        salarySlips[1][4] = e11;
        salarySlips[1][5] = e12;

        salarySlips[2][0] = e13;
        salarySlips[2][1] = e14;
        salarySlips[2][2] = e15;
        salarySlips[2][3] = e16;
        salarySlips[2][4] = e17;
        salarySlips[2][5] = e18;

        salarySlips[3][0] = e19;
        salarySlips[3][1] = e20;
        salarySlips[3][2] = e21;
        salarySlips[3][3] = e22;
        salarySlips[3][4] = e23;
        salarySlips[3][5] = e24;

        salarySlips[4][0] = e25;
        salarySlips[4][1] = e26;
        salarySlips[4][2] = e27;
        salarySlips[4][3] = e28;
        salarySlips[4][4] = e29;
        salarySlips[4][5] = e30;

        salarySlips[5][0] = e31;
        salarySlips[5][1] = e32;
        salarySlips[5][2] = e33;
        salarySlips[5][3] = e34;
        salarySlips[5][4] = e35;
        salarySlips[5][5] = e36;


//        salarySlips[0] = e1;
//        salarySlips[1] = e2;
//        salarySlips[2] = e3;
//        salarySlips[3] = e4;
//        salarySlips[4] = e5;
//        salarySlips[5] = e6;
//        salarySlips[6] = e7;
//        salarySlips[7] = e8;
//        salarySlips[8] = e9;
//        salarySlips[9] = e10;
//        salarySlips[10] = e11;
//        salarySlips[11] = e12;
//        salarySlips[12] = e13;
//        salarySlips[13] = e14;
//        salarySlips[14] = e15;
//        salarySlips[15] = e16;
//        salarySlips[16] = e17;
//        salarySlips[17] = e18;
//        salarySlips[18] = e19;
//        salarySlips[19] = e20;
//        salarySlips[20] = e21;
//        salarySlips[21] = e22;
//        salarySlips[22] = e23;
//        salarySlips[23] = e24;
//        salarySlips[24] = e25;
//        salarySlips[25] = e26;
//        salarySlips[26] = e27;
//        salarySlips[27] = e28;
//        salarySlips[28] = e29;
//        salarySlips[29] = e30;
//        salarySlips[30] = e31;
//        salarySlips[31] = e32;
//        salarySlips[32] = e33;
//        salarySlips[33] = e34;
//        salarySlips[34] = e35;
//        salarySlips[35] = e36;

        // top 2 highest salary
        SalarySlip.HighestSalary(salarySlips);

    }
}

class Person {
    int age;
    String name;
}

class SalarySlip extends Person {
    int empId;
    double salary;
    int month;

    SalarySlip(int empId, String name, double salary, int month) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.month = month;
    }

    public static void HighestSalary(SalarySlip[][] salarySlips) {

        for (int i = 0; i < salarySlips.length; i++) {
            int eid1 = 0;
            int eid2 = 0;
            double max1 = Integer.MIN_VALUE;
            double max2 = Integer.MIN_VALUE;
            for (int j = 0; j < salarySlips[i].length; j++) {
                if (salarySlips[i][j].salary > max1) {
                    max2 = max1;
                    eid2 = eid1;
                    max1 = salarySlips[i][j].salary;
                    eid1 = salarySlips[i][j].empId;
                } else if (salarySlips[i][j].salary > max2 && salarySlips[i][j].salary != max1) {
                    max2 = salarySlips[i][j].salary;
                    eid2 = salarySlips[i][j].empId;
                }
            }

            System.out.println((i + 1) + " : " + eid1 + " , " + eid2);
        }


    }

}