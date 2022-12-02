public class Sport {
    String sportname;
    int players;
    int record;

    public void print()
    {
        System.out.println("The sport, " + sportname + ", has " + players + " players with a record of " + record);
        rating();
    }
    public Sport( int pPlayers, int pRecord, String pSportname) {
        sportname = pSportname;
        players = pPlayers;
        record = pRecord;
    }

    public void rating()
    {
        if (record > 14)
        {
            System.out.println("This is a good season");
        }
        else {
            System.out.println("This is a bad season");
        }
    }
}
