public class SimpleTasks {
    public static double[] fourthTask(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0){
            throw new IllegalArgumentException("Нулевой аргумент");
        }
        int type = 0;
        if ((c==0)&&(b!=0)&&(a!=0)) {
            type = 1;
        }
        if ((b==0)&&(c!=0)&&(a!=0)) {
            type = 2;
        }
        if ((b!=0)&&(c!=0)&&(a!=0)) {
            type = 3;
        }
        switch(type) {
            case (1):
                double first = 0;
                double second = -b / a;
                System.out.println(first);
                System.out.println(second);
                return new double[]{first, second};
            case(2):
                double first2 = Math.sqrt(-c/a);
                double second2 = (-1)* Math.sqrt(-c/a);
                System.out.println(first2);
                System.out.println(second2);
                return new double[]{first2, second2};
            case(3):
                double discriminant = (b*b - 4*a*c);
                if (discriminant<0){
                    System.out.println("Существуют только комплексные корни");
                } else if (discriminant>0){
                    double first3 = ((-b + Math.sqrt(discriminant))*(1/(2*a)));
                    double second3 = ((-b - Math.sqrt(discriminant))*(1/(2*a)));
                    System.out.println(first3);
                    System.out.println(second3);
                    return new double[]{first3, second3};
                } else {
                    double single = (-b) * 1 / (2 * a);
                    System.out.println(single);
                    return new double[]{single};
                }
        }
        return new double[0];
    }

    public static void fifthTask(double l, double r, double step) {
        if (step==0) {
            throw new IllegalArgumentException("Нулевой ход");
        }
        if (step<0) {
            if (l > r) {
                for (double argument = l; argument >= r; argument += step) {
                    System.out.println(argument + "   " + Math.sin(argument));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (step>0) {
            if (l < r) {
                for (double argument = l; argument < r + step / 2; argument += step) {
                    System.out.println(argument + "   " + Math.sin(argument));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static double[] sixthTask(double a1, double b1, double c1, double a2, double b2, double c2) {
        double x, y;
        double det = a1 * b2 - b1 * a2;
        if (det == 0) {
            if ((a1 != 0) && (a2 != 0) && (b1 == 0)) {
                if (c1 / a1 == c2 / a2) {
                    System.out.println("Бесконечно много решений");
                } else {
                    System.out.println("Нет корней");
                }
            }

            if ((b1 != 0) && (b2 != 0) && (a1 == 0)) {
                if (c1 / b1 == c2 / b2) {
                    System.out.println("Бесконечно много решений");
                } else {
                    System.out.println("Нет корней");
                }
            }

            if ((a1 != 0) && (b1 != 0) && (a2 == 0)) {
                if (c2 == 0) {
                    System.out.println("Бесконечно много решений");
                } else {
                    System.out.println("Нет корней");
                }
            }

            if ((a2 != 0) && (b2 != 0) && (a1 == 0)) {
                if (c1 == 0) {
                    System.out.println("Бесконечно много решений");
                } else {
                    System.out.println("Нет корней");
                }
            }

            if ((a1 != 0) && (b2 != 0) && (a2 != 0) && (b1 != 0)) {
                if (a1 * b2 == a2 * b1) {
                    if (c1 * b2 == c2 * b1) {
                        System.out.println("Бесконечно много решений");
                    } else {
                        System.out.println("Нет корней");
                    }
                }
            }

            if ((a1 == 0) && (b2 == 0) && (a2 == 0) && (b1 == 0)) {
                if (c1 == 0 && c2 == 0) {
                    System.out.println("Бесконечно много решений");
                } else {
                    System.out.println("Нет корней");
                }
            }
        } else {
            return new double[]{(c1 * b2 - b1 * c2) / det, (a1 * c2 - c1 * a2) / det};
        }
        return new double[0];
    }

    public static double seventhTask(double x, double eps) {
        double result = 1.0;
        int counter = 1;
        double temp = x;
        while ((Math.abs(temp)==eps)||(Math.abs(temp)>eps)) {
            result += temp;

            counter++;
            temp *= x / counter;
        }
        return result;
    }
}
