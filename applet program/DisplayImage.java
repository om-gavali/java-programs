import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"kaka.jpg");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 100,100, this);  
  }  
      
  }  
  /*<applet code="DisplayImage.class" width="1000" height="1000"></applet>*/