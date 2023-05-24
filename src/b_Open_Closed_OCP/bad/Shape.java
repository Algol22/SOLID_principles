package b_Open_Closed_OCP.bad;

/*
We should design our code in a way that
allows us to add new features without
changing the existing code

 The Shape class violates the OCP
 because it requires modification
 whenever a new shape is added.
 */

class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public double calculateArea(double radius, double width, double height) {
        if (type.equals("circle")) {
            // Calculate circle area
            return Math.PI * radius * radius;
        } else if (type.equals("rectangle")) {
            // Calculate rectangle area
            return width * height;
        } else if (type.equals("triangle")){
            // Calculate triangle area
        }
        return 0.0; // Default return
    }
}

