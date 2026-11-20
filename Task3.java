class Movie{
    private String mname;
    private double rating;
    private int ryear;
    private String language;

    Movie(String mname,double rating,int ryear,String language){
        this.mname=mname;
        this.rating=rating;
        this.ryear=ryear;
        this.language=language;
    }
    public String getName(){
        return mname;
    }
    public double getRating(){
        return rating;
    }
    public int getYear(){
        return ryear;
    }
    public String getLanguage(){
        return language;
    }
}
public class Task3 {
    public static void main(String[] args){
        Movie m1 = new Movie("Avengers", 8.0,2012, "Action");
        Movie m2 = new Movie("Inception", 8.8,2010, "Sci-Fi");
        Movie m3 = new Movie("Titanic",7.9,1997,"Romance");
        Movie m4 = new Movie("Interstellar",8.7,2014,"Sci-Fic");
        Movie m5 = new Movie("Jawan",7.0,2023,"Action");
        Movie[] m={m1,m2,m3,m4,m5};
        movieDetails(m);
    }
    static void movieDetails(Movie[] m){
        for(int i=0;i<m.length;i++){
            System.out.println(m[i].getName());
            System.out.println(m[i].getRating());
            System.out.println(m[i].getYear());
            System.out.println(m[i].getLanguage());
            System.out.println("aaa...........aaa");
        }
        for(int i=0;i<m.length-1;i++){
            for(int j=0;j<m.length-1-i;j++){
                if(m[j].getRating()<m[j+1].getRating()){
                    Movie temp=m[j];
                    m[j]=m[j+1];
                    m[j+1]=temp;
                }
            }
        }
        for(int i=0;i<m.length;i++){
            if(m[i].getYear()>=2020 && m[i].getYear()<=2025){
                System.out.println(m[i].getName());
                System.out.println(m[i].getRating());
                System.out.println(m[i].getYear());
                System.out.println(m[i].getLanguage());
                System.out.println("yyy...........yyy");
            }
        }
        String str="love";
        for(int i=0;i<m.length;i++){
            if(m[i].getName().toLowerCase().contains(str.toLowerCase())){
                System.out.println(m[i].getName());
                System.out.println(m[i].getRating());
                System.out.println(m[i].getYear());
                System.out.println(m[i].getLanguage());
                System.out.println("sss...........sss");
            }
        }
        for(int i=0;i<m.length;i++){
            if(m[i].getRating()>=8.0){
                System.out.println(m[i].getName());
                System.out.println(m[i].getRating());
                System.out.println(m[i].getYear());
                System.out.println(m[i].getLanguage());
                System.out.println("rrr...........rrr");
            }
        }
    }
}
