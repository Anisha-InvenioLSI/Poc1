package com.training.pojo;

public class Lines {
	
	    private int lineNum;
	    private String refDocNum;
	    private String city;
	    private float amt;
	    public Lines() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    public Lines(int lineNum, String refDocNum, String city, float amt) {
	        super();
	        this.lineNum = lineNum;
	        this.refDocNum = refDocNum;
	        this.city = city;
	        this.amt = amt;
	    }
	    @Override
	    public String toString() {
	        return "Line [lineNum=" + lineNum + ", refDocNum=" + refDocNum + ", city=" + city + ", amt=" + amt + "]";
	    }
	    public int getLineNum() {
	        return lineNum;
	    }
	    public void setLineNum(int lineNum) {
	        this.lineNum = lineNum;
	    }
	    public String getRefDocNum() {
	        return refDocNum;
	    }
	    public void setRefDocNum(String refDocNum) {
	        this.refDocNum = refDocNum;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public float getAmt() {
	        return amt;
	    }
	    public void setAmt(float amt) {
	        this.amt = amt;
	    }
	    
	    public static void main(String args[]) {
	        Lines l1=new Lines();
	        l1.setLineNum(6);
	        l1.setAmt((float) 170.0);
	        
	        
	    }
	    
	    }



	    
	    
	    
	        
	
	

