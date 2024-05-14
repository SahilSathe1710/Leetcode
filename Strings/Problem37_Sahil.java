// Determine Color of a Chessboard Square

// You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.

// Return true if the square is white, and false if the square is black.

// The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.

 

// Example 1:

// Input: coordinates = "a1"
// Output: false
// Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
// Example 2:

// Input: coordinates = "h3"
// Output: true
// Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
// Example 3:

// Input: coordinates = "c7"
// Output: false
 

// Constraints:

// coordinates.length == 2
// 'a' <= coordinates[0] <= 'h'
// '1' <= coordinates[1] <= '8'

public class Problem37_Sahil {
    public boolean squareIsWhite(String coordinates) {
        for(int i=0; i<2; i++){
            if(((coordinates.charAt(0) == 'a' || coordinates.charAt(0) == 'c' || coordinates.charAt(0) == 'e' || coordinates.charAt(0) == 'g') && (coordinates.charAt(1) == '1' || coordinates.charAt(1) == '3' || coordinates.charAt(1) == '5' || coordinates.charAt(1) == '7')) || ((coordinates.charAt(0) == 'b' || coordinates.charAt(0) == 'd' || coordinates.charAt(0) == 'f' || coordinates.charAt(0) == 'h') && (coordinates.charAt(1) == '2' || coordinates.charAt(1) == '4' || coordinates.charAt(1) == '6' || coordinates.charAt(1) == '8'))){
                return false;
            }
        }
        return true;
    }
}
