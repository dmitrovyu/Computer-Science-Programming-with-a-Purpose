public class RightTriangle {
    public static void main(String[] arg) {
        int x = Integer.parseInt(arg[0]);
        int y = Integer.parseInt(arg[1]);
        int z = Integer.parseInt(arg[2]);
        boolean returnValue, absCheck,zeroValue;
        int hypotenuse = Math.max(x, Math.max(y, z));
        int cathetiA = Math.min(x, Math.min(y, z));
        int cathetiB = x + y + z - hypotenuse - cathetiA;
        returnValue = (hypotenuse * hypotenuse == ((cathetiA * cathetiA) + (cathetiB * cathetiB)));
        absCheck = (x == Math.abs(x)) && (y == Math.abs(y)) && (z == Math.abs(z));
        zeroValue = !((x == 0) || (y == 0) || (z == 0));

        System.out.println((returnValue && absCheck && zeroValue ));
    }

}
