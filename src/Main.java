
public class Main {
    public static void main(String[] args) {
        String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы" +
                " сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Господи боже! еще и с секретным предписаньем!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем! Лука Лукич:",
                "Лука Лукич: "};


        printTextPerRole(roles, textLines);
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder a1 = new StringBuilder();
        String[] textLines2=new String[textLines.length];

        String a="1";

        for (String role : roles) {
            for (String line : textLines) {
                if (line.contains(role)) {

                    System.out.println(line);;
                }


                }
            }


             return a;


        }
    }
