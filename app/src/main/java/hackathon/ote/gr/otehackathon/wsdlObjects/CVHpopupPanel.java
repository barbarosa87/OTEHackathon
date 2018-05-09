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

public class CVHpopupPanel extends CVHformElement implements KvmSerializable
{

    
    public String controlCaption;
    
    public CVHEnums.controlType controlType;
    
    public CVHcontainer popupContainer;
    
    public String popupHeader;
    

    
    
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
        if (info.name.equals("controlCaption"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.controlCaption = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.controlCaption = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("controlType"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.controlType = CVHEnums.controlType.fromString(j.toString());
                    }
                }
                else if (obj instanceof CVHEnums.controlType){
                    this.controlType = (CVHEnums.controlType)obj;
                }
            }
            return true;
        }
        if (info.name.equals("popupContainer"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.popupContainer = (CVHcontainer)__envelope.get(j,CVHcontainer.class,false);
            }
            return true;
        }
        if (info.name.equals("popupHeader"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.popupHeader = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.popupHeader = (String)obj;
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
            return controlCaption;
        }
        if(propertyIndex==count+1)
        {
            return this.controlType!=null?this.controlType.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return popupContainer;
        }
        if(propertyIndex==count+3)
        {
            return this.popupHeader!=null?this.popupHeader:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "controlCaption";
            info.namespace= "";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "controlType";
            info.namespace= "";
        }
        if(propertyIndex==count+2)
        {
            info.type = CVHcontainer.class;
            info.name = "popupContainer";
            info.namespace= "";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "popupHeader";
            info.namespace= "";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

