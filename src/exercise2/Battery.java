package exercise2;
    /**
     * Write a description of class Battery here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    public class Battery
    {
        /**
         * Fields
         */
        private int energy;
        /**
         * Constructor for objects of class Battery
         */
        public Battery()
        {
            // To do:
            energy=100;
        }
        /**
         * Method
         */
        public void setEnergy(int value) {
            energy=value;
        }
        public int getEnergy() {
            return energy;
        }
        public void decreaseEnergy() {
            energy--;
        }
    }


