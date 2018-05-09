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

public class CVHTopologyNotFoundFault extends org.ksoap2.SoapFault implements KvmSerializable
{

    
    public String message;
    
    public CVHEnums.errorCode errorCode;
    
    public CVHEnums.errorCategory errorCategory;
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
        if (info.name.equals("errorCode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.errorCode = CVHEnums.errorCode.fromString(j.toString());
                    }
                }
                else if (obj instanceof CVHEnums.errorCode){
                    this.errorCode = (CVHEnums.errorCode)obj;
                }
            }
            return true;
        }
        if (info.name.equals("errorCategory"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.errorCategory = CVHEnums.errorCategory.fromString(j.toString());
                    }
                }
                else if (obj instanceof CVHEnums.errorCategory){
                    this.errorCategory = (CVHEnums.errorCategory)obj;
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
        if(propertyIndex==0)
        {
            return this.message!=null?this.message:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.errorCode!=null?this.errorCode.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.errorCategory!=null?this.errorCategory.toString():SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "message";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "errorCode";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "errorCategory";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

