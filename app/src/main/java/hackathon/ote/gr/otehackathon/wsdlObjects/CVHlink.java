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

public class CVHlink extends CVHformElement implements KvmSerializable
{

    
    public String caption;
    
    public String description;
    
    public CVHsize height;
    
    public String url;
    
    public CVHsize width;
    
    public String windowType;
    

    
    
    @Override
    public void loadFromSoap(java.lang.Object paramObj,CVHExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        super.loadFromSoap(paramObj, __envelope);

    }

    @Override
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,CVHExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("caption"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.caption = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.caption = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("description"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.description = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.description = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("height"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.height = (CVHsize)__envelope.get(j,CVHsize.class,false);
            }
            return true;
        }
        if (info.name.equals("url"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.url = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.url = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("width"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.width = (CVHsize)__envelope.get(j,CVHsize.class,false);
            }
            return true;
        }
        if (info.name.equals("windowType"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.windowType = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.windowType = (String)obj;
                }
            }
            return true;
        }
        return super.loadProperty(info,soapObject,__envelope);
    }
    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return this.caption!=null?this.caption:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.description!=null?this.description:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.height!=null?this.height:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return url;
        }
        if(propertyIndex==count+4)
        {
            return this.width!=null?this.width:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.windowType!=null?this.windowType:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "caption";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "description";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = CVHsize.class;
            info.name = "height";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "url";
            info.namespace= "";
        }
        if(propertyIndex==count+4)
        {
            info.type = CVHsize.class;
            info.name = "width";
            info.namespace= "";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "windowType";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

