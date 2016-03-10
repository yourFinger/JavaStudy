package Hello;

/**
 * Created by yourfinger on 16/1/26.
 */
public class NutritionFactsFacts {
    //Required parameters
    private final int servingsSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int carbohydrate;
    private final int sodium;

    public static class Builder{
        //Required parameters
        private final int servingsSize;
        private final int serving;

        //Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int serving){
            this.servingsSize = servingSize;
            this.serving = serving;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val){
            sodium = val;
            return this;
        }

        public NutritionFactsFacts build(){
            return new NutritionFactsFacts(this);
        }
    }

    private NutritionFactsFacts(Builder builder){
        servingsSize = builder.servingsSize;
        serving = builder.serving;
        calories = builder.calories;
        fat = builder.fat;
        carbohydrate = builder.carbohydrate;
        sodium = builder.sodium;
    }

    public static void main(String[] args){
        NutritionFactsFacts nutritionFactsFacts = new NutritionFactsFacts
                                                        .Builder(240, 8)
                                                        .calories(100)
                                                        .sodium(35)
                                                        .carbohydrate(27)
                                                        .build();

    }
}
