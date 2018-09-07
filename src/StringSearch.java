public class StringSearch {
    public static void main(String[] args) {
        String[] books={"Java in easy steps" , "XML in easy steps",
                        "HTML in easy steps", "CSS in easy steps",
                        "Gone with the wine","Drop the defens"};
        int counter1=0,counter2=0,counter3=0;

        for(int i=0;i<books.length;i++){
            System.out.print(books[i].substring(0,4)+"|");

            if(books[i].endsWith(" in easy steps ")) {
                counter1++;
                System.out.println(counter1);
            }


            if(books[i].startsWith("Java")) {counter2++;}
            if(books[i].indexOf("easy")==-1) {counter3++;}
        }


        System.out.println("\n Найдено "+counter1+" названий из этой серии."  );
        System.out.println("Найдено " + counter1 + " названий с Java.");
        System.out.println("Найдено " + counter1 + " других названий .");
    }

}
