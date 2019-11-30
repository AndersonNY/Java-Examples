public class HomeWorkDay172DArray {

        //part4, as homework
        //USING TWO LOOP print names and surnames
        //ex:
        //Bayram Guney
        //Micheal Jackson
        public static void main(String[] args) {
            //part1
            String[][] arr = {
                    //   0         1         2           3            4
                    {"Bayram", "Zeynep", "Sezai", "Micheal", "Baraka"}, //0. row
                    {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},   //1. row
            };

            // Create 2D array
            // in first row put names
            // in second row put surnames
            // Hint:
            // String[][] namesAndSurnames

            //part2. print them name and surname, without loop
            //ex:  { {Bayram}, {Guney} } => Bayram Guney
                //part1
                
                

                System.out.println("part2---------------------------");
                //part2
                System.out.println(arr[0][0] + " " + arr[1][0]);
                System.out.println(arr[0][1] + " " + arr[1][1]);
                System.out.println(arr[0][2] + " " + arr[1][2]);
                System.out.println(arr[0][3] + " " + arr[1][3]);


                System.out.println("part3---------------------------");
                System.out.println("columns at row 0: " + arr[0].length);
                //part3
                //USING ONLY ONE LOOP print names and surnames
                //ex:
                //Bayram Guney
                //Micheal Jackson
                for (int i = 2; i >= 0; i--) {
                    System.out.println(arr[0][i] + " " + arr[1][i]);
                }



            }
        }
                
                


