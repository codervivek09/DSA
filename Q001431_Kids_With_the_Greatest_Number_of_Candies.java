// Q. 1431. Kids With the Greatest Number of Candies



public class Q001431_Kids_With_the_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> Arr = new ArrayList<>();
        
        int MaxCandies = 0;
        int Max = 0;

        for(int Candy : candies){
            Max = Math.max(Candy, Max);
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= Max){
                Arr.add(true);
            } else {
                Arr.add(false);
            }
        }
        return Arr;
    }
}
