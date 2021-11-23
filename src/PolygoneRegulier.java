public class PolygoneRegulier extends Polygone {
    public PolygoneRegulier(Point centre, double rayon, int nbrSommets){
        super(nbrSommets);
        double nb= 2*Math.PI / nbrSommets;
        for (int i = 0;i < nbrSommets; i++)
            sommets[i]=new Point(centre.getX()+rayon*Math.cos(nb*i),
                    centre.getY()+rayon*Math.sin(nb*i));
    }
}
