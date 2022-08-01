import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.\n",
                "Аммос Федорович: Как ревизор?\n",
                "Артемий Филиппович: Как ревизор?\n",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n",
                "Аммос Федорович: Вот те на!\n",
                "Артемий Филиппович: Вот не было заботы, так подай!\n",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        String b = PrintTextPerRole.printTextPerRole(roles, textLines);
        System.out.println(b);
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
    }
}
