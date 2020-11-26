import java.util.*;

class Casilla{
              Scanner entrada = new Scanner(System.in);
              private int boomVecinas=0;
              private boolean tieneBomba=true;
              private boolean seleccionado=false ;
              private int x, y;

              public Casilla(int x , int y){
                            this.x = x;
                            this.y = y;

              }
              public void setTieneBomba(boolean tieneBomba){
                            this.tieneBomba=tieneBomba;
              }
              public void setSeleccionado(boolean seleccionmado){
                            this.seleccionado=seleccionado;
              }
              public void setboomVecinas(int boomVecinas){
                            this.boomVecinas=boomVecinas;
              }
              public Boolean getTieneBonba(){
                            return tieneBomba;
              }

              public Boolean getSeleccionado(){
                            return seleccionado;
              }
              public int getboomVecinas(){
                            return boomVecinas;
              }



}