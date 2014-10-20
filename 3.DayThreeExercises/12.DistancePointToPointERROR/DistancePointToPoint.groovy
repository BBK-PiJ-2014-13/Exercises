class Point {
double x = 0;
double y = 0;

	Point(double inputX, double inputY) {
		x = inputX;
		y = inputY
	}
}

double calculateDistance(Point point) {
double x = point.x;
double y = point.y;

return (x ** 2 + y ** 2) ** (1/2);
}

double tempX = 0;
double tempY = 0;

print("Enter x coordinates of first point: ");
tempX = Double.parseDouble(System.console().readLine());
print("Enter y coordinates of first point: ");
tempY = Double.parseDouble(System.console().readLine());

Point point1 = new Point(tempX, tempY);

print("Enter x coordinates of second point: ");
tempX = Double.parseDouble(System.console().readLine());
print("Enter y coordinates of second point: ");
tempY = Double.parseDouble(System.console().readLine());

Point point2 = new Point(tempX, tempY);

print("Enter x coordinates of third point: ");
tempX = Double.parseDouble(System.console().readLine());
print("Enter y coordinates of third point: ");
tempY = Double.parseDouble(System.console().readLine());

Point point3 = new Point(tempX, tempY);

double distance1 = (calculateDistance(point1);
double distance2 = (calculateDistance(point2);
double distance3 = (calculateDistance(point3);
String closestPoint = ""; // one, two or three

if (distance1 < distance2) {
	if (distance 1 < distance 3) {
		closestPoint = "one";
	} else {
		closestPoint = "three";
	}
} else {
	if (distance2 < distance3) {
		closestPoint = "two";
	} else {
		closestPoint = "three";
	}
}