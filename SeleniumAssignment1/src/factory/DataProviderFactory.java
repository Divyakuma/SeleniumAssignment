package factory;

import dataProvider.ConfigDataProvider;


public class DataProviderFactory {
	
		//this step is optional
		//it will create object and return object directly
		
		public static ConfigDataProvider getconfig(){
			ConfigDataProvider config=new ConfigDataProvider();
			return config;
		}
		

}
