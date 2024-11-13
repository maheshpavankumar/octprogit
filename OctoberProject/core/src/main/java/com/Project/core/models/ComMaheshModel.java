package com.Project.core.models;


import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.sun.org.apache.xpath.internal.operations.String;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class ComMaheshModel {
	@ValueMapValue
	private String text;
	@ValueMapValue
	private String pathField;
	@ValueMapValue
	private String areaHeader;
	
	
	@Inject
    private List<String> student;

    @ChildResource
    private List<MultifieldItem>lenovo;

    public List<MultifieldItem> getComMaheshModel() {
		return lenovo;
        
   }
        
        
        
	
	 @ValueMapValue
	    private boolean checkbox;
	 @ValueMapValue
		private Date date;
		
	
	////////////////////////////			 
	public String getText() {
		return text;
	}
	
	
	
	public String getPathField() {
		return pathField;
	}

	public String getAreaHeader() {
		return areaHeader;
	}
	
	   public boolean isCheckbox() {
	        return checkbox;
	    }

    
	   

    	
    }
    
    
    
    
    
    
	 
	 

	 
