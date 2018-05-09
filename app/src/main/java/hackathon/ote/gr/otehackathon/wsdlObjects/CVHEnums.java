package hackathon.ote.gr.otehackathon.wsdlObjects;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.5.0.1
//
// Created by Quasar Development 
//
//---------------------------------------------------





public class CVHEnums
{

    public enum errorCode
    {
        
        INVALID_REQUEST(0),
        
        INVALID_SESSION(1),
        
        INVALID_CASE(2),
        
        LOCALE_MISMATCH(3),
        
        UNKNOWN_ELEMENT(4),
        
        INVALID_OPERATION(5),
        
        VALIDATION_ERROR(6),
        
        SERVICE_ERROR(7),
        
        KNOWLEDGEBASE_ERROR(8),
        
        RUNTIME_ERROR(9);
        
        private int code;
        
        errorCode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static errorCode fromString(String str)
        {
            if (str.equals("INVALID_REQUEST"))
                return INVALID_REQUEST;
            if (str.equals("INVALID_SESSION"))
                return INVALID_SESSION;
            if (str.equals("INVALID_CASE"))
                return INVALID_CASE;
            if (str.equals("LOCALE_MISMATCH"))
                return LOCALE_MISMATCH;
            if (str.equals("UNKNOWN_ELEMENT"))
                return UNKNOWN_ELEMENT;
            if (str.equals("INVALID_OPERATION"))
                return INVALID_OPERATION;
            if (str.equals("VALIDATION_ERROR"))
                return VALIDATION_ERROR;
            if (str.equals("SERVICE_ERROR"))
                return SERVICE_ERROR;
            if (str.equals("KNOWLEDGEBASE_ERROR"))
                return KNOWLEDGEBASE_ERROR;
            if (str.equals("RUNTIME_ERROR"))
                return RUNTIME_ERROR;
		    return null;
        }
    }

    public enum errorCategory
    {
        
        CLIENT(0),
        
        RUNTIME(1),
        
        KNOWLEGEBASE(2);
        
        private int code;
        
        errorCategory(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static errorCategory fromString(String str)
        {
            if (str.equals("CLIENT"))
                return CLIENT;
            if (str.equals("RUNTIME"))
                return RUNTIME;
            if (str.equals("KNOWLEGEBASE"))
                return KNOWLEGEBASE;
		    return null;
        }
    }

    public enum state
    {
        
        idle(0),
        
        inProgress(1),
        
        terminated(2);
        
        private int code;
        
        state(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static state fromString(String str)
        {
            if (str.equals("idle"))
                return idle;
            if (str.equals("inProgress"))
                return inProgress;
            if (str.equals("terminated"))
                return terminated;
		    return null;
        }
    }

    public enum numberInputType
    {
        
        integerInput(0),
        
        floatInput(1);
        
        private int code;
        
        numberInputType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static numberInputType fromString(String str)
        {
            if (str.equals("integerInput"))
                return integerInput;
            if (str.equals("floatInput"))
                return floatInput;
		    return null;
        }
    }

    public enum dateInputType
    {
        
        time(0),
        
        date(1),
        
        dateTime(2);
        
        private int code;
        
        dateInputType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static dateInputType fromString(String str)
        {
            if (str.equals("time"))
                return time;
            if (str.equals("date"))
                return date;
            if (str.equals("dateTime"))
                return dateTime;
		    return null;
        }
    }

    public enum messageType
    {
        
        info(0),
        
        warning(1),
        
        error(2),
        
        solution(3);
        
        private int code;
        
        messageType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static messageType fromString(String str)
        {
            if (str.equals("info"))
                return info;
            if (str.equals("warning"))
                return warning;
            if (str.equals("error"))
                return error;
            if (str.equals("solution"))
                return solution;
		    return null;
        }
    }

    public enum unit
    {
        
        PIXELS(0),
        
        PERCENTAGE(1);
        
        private int code;
        
        unit(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static unit fromString(String str)
        {
            if (str.equals("PIXELS"))
                return PIXELS;
            if (str.equals("PERCENTAGE"))
                return PERCENTAGE;
		    return null;
        }
    }

    public enum labelPosition
    {
        
        AFTER(0),
        
        BEFORE(1);
        
        private int code;
        
        labelPosition(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static labelPosition fromString(String str)
        {
            if (str.equals("AFTER"))
                return AFTER;
            if (str.equals("BEFORE"))
                return BEFORE;
		    return null;
        }
    }

    public enum mediaType
    {
        
        UNDEFINED(0),
        
        FLASH(1),
        
        QUICKTIME(2),
        
        WINDOWS_MEDIA(3);
        
        private int code;
        
        mediaType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static mediaType fromString(String str)
        {
            if (str.equals("UNDEFINED"))
                return UNDEFINED;
            if (str.equals("FLASH"))
                return FLASH;
            if (str.equals("QUICKTIME"))
                return QUICKTIME;
            if (str.equals("WINDOWS_MEDIA"))
                return WINDOWS_MEDIA;
		    return null;
        }
    }

    public enum controlType
    {
        
        LINK(0),
        
        BUTTON(1);
        
        private int code;
        
        controlType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static controlType fromString(String str)
        {
            if (str.equals("LINK"))
                return LINK;
            if (str.equals("BUTTON"))
                return BUTTON;
		    return null;
        }
    }

}