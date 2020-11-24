class Persona{ 
              protected int IdEmpleado ;
              protected String NombreEmpleado ;
              protected String Puesto ;
              protected int SueldoQuincenal[];

              public Persona(){

              }

              public Persona(int IdEmpleado, String NombreEmpleado, String Puesto, int[] SueldoQuincenal ){
                            this.IdEmpleado=IdEmpleado;
                            this.NombreEmpleado=NombreEmpleado;
                            this.Puesto=Puesto;
                            this.SueldoQuincenal=SueldoQuincenal;
              }


              public void setNombreEmpleado(String NombreEmpleado){
                            this.NombreEmpleado=NombreEmpleado;
              }
              public void setIdEmpleado(int IdEmpleado){
                            this.IdEmpleado=IdEmpleado; 
              }
              public void setPuesto(String Puesto){
                            this.Puesto=Puesto; 
              }
              public void setSueldoQuincenal(int[] IdEmpleado){
                            this.SueldoQuincenal=SueldoQuincenal; 
              }
              public String getNombreEmpleado(){
                            return NombreEmpleado;
              }
              public int getIdEmpleado(){
                            return IdEmpleado;
              }
              public String getPuesto(){
                            return Puesto;
              }
              public int[] getSueldoQuincenal(){
                            return SueldoQuincenal;
              }
}