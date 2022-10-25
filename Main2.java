import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// no importamos ningún paquete específico de la implementación de logging que usaremos realmente
 
public class HelloWorld {
  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);
  
  private static final String userName = "psanchez";
  public void doNothing() {
 
    LOGGER.info("Hello World");
    
    LOGGER.trace("Hello {}", userName);
 
    try {
    	// any exception
    } catch (Exception e){
	    LOGGER.error("Exception happens", e);
    }
    
    // no longer necessary
    // if(LOGGER.isTraceEnalbed()){
   	// 	LOGGER.trace("Hello: " + userName); 
	// } 
  }
}