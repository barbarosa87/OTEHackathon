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

public class CVHtopologyComponent extends AttributeContainer implements KvmSerializable
{

    
    public ArrayList< CVHtopologyAddition> additions =new ArrayList<CVHtopologyAddition >();
    
    public String description;
    
    public String id;
    
    public ArrayList< CVHtopologyComponentMenuItem> menuItems =new ArrayList<CVHtopologyComponentMenuItem >();
    
    public String name;
    
    public CVHtopologyComponentState state;
    
    public String type;
    
    public Boolean visible=false;
    
    public Integer x=0;
    
    public Integer y=0;
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
        if (info.name.equals("additions"))
        {
            if(obj!=null)
            {
                if(this.additions==null)
                {
                    this.additions = new java.util.ArrayList< CVHtopologyAddition>();
                }
                java.lang.Object j =obj;
                CVHtopologyAddition j1= (CVHtopologyAddition)__envelope.get(j,CVHtopologyAddition.class,false);
                this.additions.add(j1);
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
        if (info.name.equals("id"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.id = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.id = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("menuItems"))
        {
            if(obj!=null)
            {
                if(this.menuItems==null)
                {
                    this.menuItems = new java.util.ArrayList< CVHtopologyComponentMenuItem>();
                }
                java.lang.Object j =obj;
                CVHtopologyComponentMenuItem j1= (CVHtopologyComponentMenuItem)__envelope.get(j,CVHtopologyComponentMenuItem.class,false);
                this.menuItems.add(j1);
            }
            return true;
        }
        if (info.name.equals("name"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.name = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.name = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("state"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.state = (CVHtopologyComponentState)__envelope.get(j,CVHtopologyComponentState.class,false);
            }
            return true;
        }
        if (info.name.equals("type"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.type = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.type = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("visible"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.visible = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.visible = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("x"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.x = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.x = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("y"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.y = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.y = (Integer)obj;
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
        if(propertyIndex>=0 && propertyIndex < 0+this.additions.size())
        {
            java.lang.Object additions = this.additions.get(propertyIndex-(0));
            return additions!=null?additions:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==0+this.additions.size())
        {
            return this.description!=null?this.description:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1+this.additions.size())
        {
            return id;
        }
        if(propertyIndex>=2+this.additions.size() && propertyIndex < 2+this.additions.size()+this.menuItems.size())
        {
            java.lang.Object menuItems = this.menuItems.get(propertyIndex-(2+this.additions.size()));
            return menuItems!=null?menuItems:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==2+this.additions.size()+this.menuItems.size())
        {
            return name;
        }
        if(propertyIndex==3+this.additions.size()+this.menuItems.size())
        {
            return this.state!=null?this.state:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4+this.additions.size()+this.menuItems.size())
        {
            return this.type!=null?this.type:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5+this.additions.size()+this.menuItems.size())
        {
            return visible;
        }
        if(propertyIndex==6+this.additions.size()+this.menuItems.size())
        {
            return x;
        }
        if(propertyIndex==7+this.additions.size()+this.menuItems.size())
        {
            return y;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 8+additions.size()+menuItems.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex>=0 && propertyIndex < 0+this.additions.size())
        {
            info.type = CVHtopologyAddition.class;
            info.name = "additions";
            info.namespace= "";
        }
        if(propertyIndex==0+this.additions.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "description";
            info.namespace= "";
        }
        if(propertyIndex==1+this.additions.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "id";
            info.namespace= "";
        }
        if(propertyIndex>=2+this.additions.size() && propertyIndex < 2+this.additions.size()+this.menuItems.size())
        {
            info.type = CVHtopologyComponentMenuItem.class;
            info.name = "menuItems";
            info.namespace= "";
        }
        if(propertyIndex==2+this.additions.size()+this.menuItems.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "name";
            info.namespace= "";
        }
        if(propertyIndex==3+this.additions.size()+this.menuItems.size())
        {
            info.type = CVHtopologyComponentState.class;
            info.name = "state";
            info.namespace= "";
        }
        if(propertyIndex==4+this.additions.size()+this.menuItems.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "type";
            info.namespace= "";
        }
        if(propertyIndex==5+this.additions.size()+this.menuItems.size())
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "visible";
            info.namespace= "";
        }
        if(propertyIndex==6+this.additions.size()+this.menuItems.size())
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "x";
            info.namespace= "";
        }
        if(propertyIndex==7+this.additions.size()+this.menuItems.size())
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "y";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

