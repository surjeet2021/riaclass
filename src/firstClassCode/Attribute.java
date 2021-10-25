
package firstClassCode;

 class PAttribute{
	 
	 int y=10;
	
}

public class Attribute {
	
	int x=20;	

	public static void main(String[] args) {
		
		PAttribute objParentClass=new PAttribute();
		objParentClass.y=30;
		int ParentAttributeValue=objParentClass.y;
		System.out.println(ParentAttributeValue);
		
		PAttribute objParentClass1=new PAttribute();
		int ParentAttributeValue1=objParentClass1.y;
		System.out.println(ParentAttributeValue1);
		
		Attribute objChildClass=new Attribute();
		int ChildtAttributeValue=objChildClass.x;
		System.out.println(ChildtAttributeValue);
		
		objParentClass.y=30;
		 ParentAttributeValue=objParentClass.y;
		System.out.println("Modified attribute= "+ParentAttributeValue);
		
		objChildClass.x=40;
		ChildtAttributeValue=objChildClass.x;
		System.out.println("Modified attribute= "+ChildtAttributeValue);
	}

}














