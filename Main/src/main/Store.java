
package main;

public interface Store {
   void getTime(IClock t);
   void setTime(String _s);
   void getInfo();
   String getPopName(); 
}
