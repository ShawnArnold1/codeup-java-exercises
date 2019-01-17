package movies;

public class Movie
{
    private String name;
    private String catagorey;

    public String getName()
    {
        return name;
    }

    public String getCatagorey()
    {
        return catagorey;
    }

    public Movie(String name, String catagorey)
    {
        this.name = name;
        this.catagorey = catagorey;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCatagorey(String catagorey)
    {
        this.catagorey = catagorey;
    }


}
