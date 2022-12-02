public class Avatar {
    int posX;
    int posY;
    int dx;
    int dy;
    int height;
    int width;
    String power;
    String role;
    String weakness;

    public Avatar()
    {
        posX = 400;
        posY = 600;
        dx = 20;
        dy = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "absolute burger";
        weakness = "pride";
    }

    public Avatar(int PposX, int PposY, int Pdx, int Pdy, int Pheight, int Pwidth, String Ppower, String Prole, String Pweakness)
    {
        posX = PposX;
        posY = PposY;
        dx = Pdx;
        dy = Pdy;
        height = Pheight;
        width = Pwidth;
        power = Ppower;
        role = Prole;
        weakness = Pweakness;

    }



    public void print()
    {
        System.out.println("The " + role + " can " + power + " and their weakness is " + weakness);
        System.out.println("they are at the location (" + posX + "," + posY + ")");
    }
}
