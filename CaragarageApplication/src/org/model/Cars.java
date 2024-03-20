package org.model;

public class Cars 
{
    private String regno;
    private String model;   
    private String name;
    private String issue;
    private String Ownername;
    private String status;
    public Cars()
    {

    }
    public Cars(String regno,String model,String name,String issue,String Ownername)
    {
        this.regno=regno;
        this.model=model;
        this.name=name;
        this.issue=issue;
        this.Ownername=Ownername;
        // this.status=status;
    }
    public void setregno(String regno)
    {
        this.regno=regno;
    }
    public String getregno()
    {
        return regno;
    }
    public void setmodel(String model)
    {
        this.model=model;
    }
    public String getmodel()
    {
        return model;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setissue(String issue)
    {
        this.issue=issue;
    }
    public String getissue()
    {
        return issue;
    }
    public void setownername(String Ownername)
    {
        this.Ownername=Ownername;
    }
    public String getOwnername()
    {
        return Ownername;
    }
    public void setstatus(String status)
    {
        this.status=status;
    }
    public String getstatus()
    {
        return status;
    }
}
