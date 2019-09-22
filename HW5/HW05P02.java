/* Hua Chen CIN:305942655 
Write a program to compute the area between the four cities of: 
Atlanta, Georgia; Charlotte, North Carolina; Savannah, Georgia; and Orlando, Florida. 
Formulas and Other Information:

distance=radiusOfEarth×arccos(sin(x1)×sin(x2)+cos(x1)×cos(x2)×cos(y1−y2))
The GPS coordinates for each city can be found using this website: GPS Coordinate Finder
radius of earth = 6371.01 km
s=(side1+side2+side3)/2
triangle area=√(s(s−side1)(s−side2)(s−side3))
The map may be useful for picturing the area:
NOTE: The area is not an exact triangle despite what the lines may indicate.  It is more of a four sided polygon.
*/

public class HW05P02 {
   public static void main(String[] args) {
		final double ATLANTA_LATITUDE = Math.toRadians(33.748995);
		final double ATLANTA_LONGITUDE = Math.toRadians(-84.387982);
		final double CHARLOTTE_LATITUDE = Math.toRadians(35.227087);
		final double CHARLOTTE_LONGITUDE = Math.toRadians(-80.843127);
		final double SAVANNAH_LATITUDE = Math.toRadians(32.083541);
		final double SAVANNAH_LONGITUDE = Math.toRadians(-81.099834);
		final double ORLANDO_LATITUDE = Math.toRadians(28.538335);
		final double ORLANDO_LONGITUDE = Math.toRadians(-81.379236);
		final double EARTH_RADIUS = 6371.01;
		
		double distanceAC = EARTH_RADIUS * Math.acos(Math.sin(ATLANTA_LATITUDE) * Math.sin(CHARLOTTE_LATITUDE) + Math.cos(ATLANTA_LATITUDE) * Math.cos(CHARLOTTE_LATITUDE) * Math.cos(ATLANTA_LONGITUDE - CHARLOTTE_LONGITUDE));
		System.out.println("Atlanta to Charlotte Distance: " + distanceAC);
		double distanceCS = EARTH_RADIUS * Math.acos(Math.sin(CHARLOTTE_LATITUDE) * Math.sin(SAVANNAH_LATITUDE) + Math.cos(CHARLOTTE_LATITUDE) * Math.cos(SAVANNAH_LATITUDE) * Math.cos(CHARLOTTE_LONGITUDE - SAVANNAH_LONGITUDE));
		System.out.println("Charlotte to Savannah Distance: " + distanceCS);
		double distanceSO = EARTH_RADIUS * Math.acos(Math.sin(SAVANNAH_LATITUDE) * Math.sin(ORLANDO_LATITUDE) + Math.cos(SAVANNAH_LATITUDE) * Math.cos(ORLANDO_LATITUDE) * Math.cos(SAVANNAH_LONGITUDE - ORLANDO_LONGITUDE));
		System.out.println("Savannah to Orlando Distance:  " + distanceSO);
		double distanceOA = EARTH_RADIUS * Math.acos(Math.sin(ORLANDO_LATITUDE) * Math.sin(ATLANTA_LATITUDE) + Math.cos(ORLANDO_LATITUDE) * Math.cos(ATLANTA_LATITUDE) * Math.cos(ORLANDO_LONGITUDE - ATLANTA_LONGITUDE));
		System.out.println("Orlando to Atlanta Distance: " + distanceOA);
		double distanceAS = EARTH_RADIUS * Math.acos(Math.sin(ATLANTA_LATITUDE) * Math.sin(SAVANNAH_LATITUDE) + Math.cos(ATLANTA_LATITUDE) * Math.cos(SAVANNAH_LATITUDE) * Math.cos(ATLANTA_LONGITUDE - SAVANNAH_LONGITUDE));
		System.out.println("Atlanta to Savannah Distance: " + distanceAS);
		
		double sSAO = ((distanceAS + distanceOA + distanceSO) / 2);
		double triangleAreaSAO = Math.sqrt(sSAO * (sSAO - distanceAS) * (sSAO - distanceOA) * (sSAO - distanceSO));
		System.out.println(sSAO);
		System.out.println(triangleAreaSAO);
		
		double sACS = ((distanceCS + distanceAS + distanceAC) / 2);
		double triangleAreaACS = Math.sqrt(sACS * (sACS - distanceAC) * (sACS - distanceCS) * (sACS - distanceAS));
		System.out.println(sACS);
		System.out.println(triangleAreaACS);
		
		double totalArea = triangleAreaACS + triangleAreaSAO;
		System.out.println("The area of the four cities is: " + totalArea + " kms squared.");
      
	}
}