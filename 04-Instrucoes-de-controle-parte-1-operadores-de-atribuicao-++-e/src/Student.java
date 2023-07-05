
 class Student{
    
    private String name;
    private double averange;

    public Student(String name, double averange){
        this.name = name;
        
        if(averange > 0.0)
            if(averange <= 100.0)
                this.averange = averange;   
    }
    
    public String getName(){
        return name;   
    }
    
    public void setName(String name){
        this.name = name;    
    }

    public double getAverange(){
        return averange;
    }
    
    public void setAverange(double averange){
        this.averange = averange;
    }
    public String getLetterGrade(){
        String letterGrade = "";
        
        if(averange >=90)
            letterGrade = "A";  
        else if(averange >= 80)
            letterGrade = "B"; 
        else if (averange >=70)
            letterGrade = "C";
        else if(averange >= 60)
            letterGrade = "D";
        else 
            letterGrade = "F";

        return letterGrade;
     }
    
}
