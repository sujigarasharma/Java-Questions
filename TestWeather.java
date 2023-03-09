import java.util.*;
import java.lang.*;
import java.io.*;


class Weather
{
	int temperature;
	String city, date;
	float humidity, windspeed;
	// Constructor
	public Weather(String city,String date, int temperature, float humidity, float windspeed)
	{
		
		this.city = city;
		this.date = date;
		this.temperature = temperature;
		this.humidity = humidity;
		this.windspeed = windspeed;
	}

	// Used to print Weather details in TestWeather()
	public String toString()
	{
		return "\nCity : " + this.city +"\nDate : " + this.date+"\nTemperature : " + this.temperature +"\nHumidity : " + this.humidity  +"\nWindspeed : " + this.windspeed;
	}
}

class Sortbytemp implements Comparator<Weather>
{
	
	public int compare(Weather a, Weather b)
	{
		return a.temperature - b.temperature;
	}
}


class TestWeather 
{
	public static void main (String[] args)
	{
		Scanner in =new Scanner(System.in);
		Scanner sc =new Scanner(System.in);
		ArrayList<Weather> w = new ArrayList<Weather>();
		
		for(int j=0 ;j<2;j++)
		{
			System.out.printf("\nEnter The Weather Details of CITY %d\n",j+1);

			System.out.print("Enter The Name of City : ");
			String cname=sc.nextLine();
		
			System.out.print("Enter The Date : ");
			String wdate=sc.nextLine();

			System.out.print("Enter The Weather Temperature  : ");
			int wt=in.nextInt(); 

			System.out.print("Enter The Weather Humidity : ");
			float wh=in.nextFloat(); 

			System.out.print("Enter The Weather Windspeed : ");
			float ws=in.nextFloat(); 

			w.add(new Weather(cname, wdate, wt, wh, ws));
		
		}



		Collections.sort(w, new Sortbytemp());

		System.out.println("\nSorted by Temperature");
		for (int i=0; i<2; i++)
		{
			System.out.println(w.get(i));
		}
	}
}

