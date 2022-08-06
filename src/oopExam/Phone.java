package oopExam;

/*
 * Interface: 
            Interface is a blueprint of Class which is created inside a package. Its name starts with upper case letter 
            and then follows either camel case or snake case feature. Interface is used to achieve abstraction in java.
  
 * Things it can and cannot contain:
           Interface can contain both abstract and implemented methods as well as variables. 
           All kinds of methods can be both void and/or return type in Interface.
           Abstract methods are declared but not implemented as they have no method bodies means no curly braces {}. 
           Inside Interface, it is not mandatory to write the 'abstract' keyword for abstract methods.
                   For example: public void car(); ----> void type abstract/unimplemented method, that is declared.
 
            The implemented methods in interface are default and static, which were introduced by Java 1.8.
            Default method is allowed only in Interface. 
            E.g.: public default void car() {} ----> Void type default method. Here, default is not an access modifier.
                    public static int car() {} ----> Return type static method.
                    return 0;
                      
            The variables inside Interface are public, static, and final by default and they have to be initialized.
                    E.g.: public static final int bornYear=1859;
           
            Interface cannot have constructor.  
 
 * Things it can and cannot inherit:
            Interface cannot inherit a regular Class or an Abstract Class by 'extends' or 'implements' keywords.
            However, it can inherit more than one Interface by 'extends' keywords.
 
 * Things it can and cannot do:
            Interface cannot be instantiated by itself means it cannot create an object because of possessing abstract methods. 
            Nevertheless, it can be instantiated with the help of a concrete class that inherits the Interface or by anonymous inner class.
 */

public interface Phone extends Pager, Wakitoki {

	public static final int bornYear = 1859;

	/*
	  public Phone () { }
	  
	 * Interface cannot have constructor because it contains abstract methods that
	    are declared only. Therefore, there is no need to make an object to
	    initialize those methods.
	 */

	public void interfaceInfo();

	public abstract void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("Battery is a default method from Java 1.8\n");
	}

	public static void wireless() {
		System.out.println("Wireless is a static method from Java 1.8\n");
	}

}
