package dLibs.freenect.constants;

//----------------------------------------------------------------------------
public enum LOG_LEVEL{
  FATAL   (0),   //  0 < Log for crashing/non-recoverable errors 
  ERROR   (1),   //  1 < Log for major errors 
  WARNING (2),   //  2 < Log for warning messages 
  NOTICE  (3),   //  3 < Log for important messages 
  INFO    (4),   //  4 < Log for normal messages 
  DEBUG   (5),   //  5 < Log for useful development messages 
  SPEW    (6),   //  6 < Log for slightly less useful messages 
  FLOOD   (7);   //  7 < Log EVERYTHING. May slow performance. 
  
  private final int value;
  private LOG_LEVEL(int value) {
    this.value = value;
  }
  public final int getValue(){
    return value;
  }
  public static LOG_LEVEL getByValue( int value ){
    for (LOG_LEVEL level : LOG_LEVEL.values())
      if( level.getValue() == value){
        return level;
    }
    return null;
  }
}   
