package ZKModule;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;

import AbstractModule.CAbstractModule;


public class ZKModule implements CAbstractModule {

	public Component getComponent( Execution exec ) {
		
		Component component =  exec.createComponentsDirectly( "<listbox><listitem label=\"foo\"/></listbox>", "zul", null, null ); //Executions.getCurrent().createComponents( "remote_frame.zul", null );

		return component;
		
	}
	
	public Component[] getComponents( Execution exec ) {
		
		Component[] Components = null;
		
		try {

			//Components = Executions.getCurrent().createComponents( "/WEB-INF/zul/remote_frame.zul", null);
			Components = Executions.getCurrent().createComponents( "~./ZKModule/zul/remote_frame.zul", null);

		}
		catch ( Exception Ex ) {
			
			
		}
		
		return Components;
		
	}

	
	public static void main(String[] args) {

		System.out.println( "ZK Module" );
		
	}
	
}
