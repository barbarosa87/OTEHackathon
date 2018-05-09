package hackathon.ote.gr.otehackathon.wsdlObjects;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.5.0.1
//
// Created by Quasar Development 
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class CVHValidationErrors extends AttributeContainer implements KvmSerializable
{

    
    public ArrayList< CVHvalidationError> errors =new ArrayList<CVHvalidationError >();
    
    public String message;
    private transient java.lang.Object __source;    
    

    
    
    
    public void loadFromSoap(java.lang.Object paramObj,CVHExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                if(!loadProperty(info,soapObject,__envelope))
                {
                }
            } 
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,CVHExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("errors"))
        {
            if(obj!=null)
            {
                if(this.errors==null)
                {
                    this.errors = new java.util.ArrayList< CVHvalidationError>();
                }
                java.lang.Object j =obj;
                CVHvalidationError j1= (CVHvalidationError)__envelope.get(j,CVHvalidationError.class,false);
                this.errors.add(j1);
            }
            return true;
        }
        if (info.name.equals("message"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.message = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.message = (String)obj;
                }
            }
            return true;
        }
        return false;
    }
    
    public java.lang.Object getOriginalXmlSource()
    {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex>=0 && propertyIndex < 0+this.errors.size())
        {
            java.lang.Object errors = this.errors.get(propertyIndex-(0));
            return errors!=null?errors:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==0+this.errors.size())
        {
            return this.message!=null?this.message:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+errors.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex>=0 && propertyIndex < 0+this.errors.size())
        {
            info.type = CVHvalidationError.class;
            info.name = "errors";
            info.namespace= "";
        }
        if(propertyIndex==0+this.errors.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "message";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
