public class Main {

    public static void main(String[] args) {
/*
        System.out.println(Factorial.factorial(7));
*/
/*
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Лука"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?\n",
                "Артемий Филиппович: Как ревизор?\n",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n",
                "Аммос Федорович: Вот те на!\n",
                "Артемий Филиппович: Вот не было заботы, так подай!\n",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        String b = PrintTextPerRole.printTextPerRole(roles, textLines);
        System.out.println(b);
*/
/* MergeArrays
        int [] a1 = {0,2,2};
        int [] a2 = {1,3};
        int[] b = MergeArrays.mergeArrays(a1, a2);
        System.out.println(Arrays.toString(b));
*/
/* PrintOddNumbers
        int[] a = {16,-17,31,32,57,68,25,102,547};
        PrintOddNumbers.printOddNumbers(a);
*/
/* DetermineGroup
        DetermineGroup group = new DetermineGroup();
        System.out.println(group.determineGroup(6));
*/

        ComplexNumber obj1 = new ComplexNumber(1.13, 1.27);
        ComplexNumber obj2 = new ComplexNumber(1.13, 1.27);

        System.out.println("Object: \n\tobj1 = " + obj1 +
                "\n\tobj2 = " + obj2);
        System.out.println("hashCode объектов :" +
                "\n\tobj1.hashCode = " + obj1.hashCode() +
                "\n\tobj2.hashCode = " + obj2.hashCode());
        System.out.println("Сравнение объектов :" +
                "\n\tobj1.equals(obj2) = " + obj1.equals(obj2));
        System.out.println("Сравнение объектов :" +
                "\n\tobj2.equals(obj1) = " + obj2.equals(obj1));

    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (obj == null) {
                return false;
            } else if (getClass() != obj.getClass()) {
                return false;
            }

            ComplexNumber other = (ComplexNumber) obj;
            if (re != other.getRe()) {
                return false;
            } else if (im != other.getIm()) {
                return im == other.getIm();
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;

            long reLong = Double.doubleToLongBits(re);
            result = 31 * result + (int) (reLong ^ (reLong >>> 32));

            long imLong = Double.doubleToLongBits(im);
            result = 31 * result + (int) (imLong ^ (imLong >>> 32));


            return result;
        }
    }
}
