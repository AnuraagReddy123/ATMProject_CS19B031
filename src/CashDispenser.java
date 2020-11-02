public class CashDispenser {
     //CashDispenser variables
    private int availableCash;

    CashDispenser (int availableCash) {
        this.availableCash = availableCash;
    }

    //CashDispenserMethods
    public boolean checkEnoughCash(int amount) {
        return this.availableCash > amount;
    }
    
    public int[] giveCash (int amount) {
        this.availableCash -= amount;
        
        int[] notes = new int[3];
        int note1000 = 0, note500 = 0, note100 = 0;
        
        if (amount>=1000) {
            while (amount >= 1000) {
                note1000++;
                amount -= 1000;
            }
            notes[0] = note1000;
        }
        if (amount>=500) {
            while (amount >= 500) {
                note500++;
                amount -= 500;
            }
            notes[1] = note500;
        }
        if (amount>=100) {
            while (amount >= 100) {
                note100++;
                amount -= 100;
            }
            notes[2] = note100;
        }
        return notes;
    }
}


