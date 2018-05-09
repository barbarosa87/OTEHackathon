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

public class CVHdataGridHeaderCell extends AttributeContainer implements KvmSerializable
{

    
    public Integer colSpan=0;
    
    public CVHformElement content;
    
    public Integer rowSpan=0;
    
    public ArrayList< String> styles =new ArrayList<String >();
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
        if (info.name.equals("colSpan"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.colSpan = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.colSpan = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("content"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.content = (CVHformElement)__envelope.get(j,CVHformElement.class,false);
            }
            return true;
        }
        if (info.name.equals("rowSpan"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.rowSpan = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.rowSpan = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("styles"))
        {
            if(obj!=null)
            {
                if(this.styles==null)
                {
                    this.styles = new java.util.ArrayList< String>();
                }
                java.lang.Object j =obj;
                String j1= j.toString();
                this.styles.add(j1);
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
            return colSpan;
        }
        if(propertyIndex==1)
        {
            return this.content!=null?this.content:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return rowSpan;
        }
        if(propertyIndex>=3 && propertyIndex < 3+this.styles.size())
        {
            java.lang.Object styles = this.styles.get(propertyIndex-(3));
            return styles!=null?styles:SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3+styles.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "colSpan";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = CVHformElement.class;
            info.name = "content";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "rowSpan";
            info.namespace= "";
        }
        if(propertyIndex>=3 && propertyIndex < 3+this.styles.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "styles";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

