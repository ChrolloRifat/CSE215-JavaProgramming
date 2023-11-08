import java.util.Calendar;

class NewDate implements Comparable<NewDate>, Cloneable {
    private int day, month, year;

    // constructors
    public NewDate() {
        //  this constructor initializes with today's date
        Calendar cal = Calendar.getInstance();
        day = cal.get(Calendar.DAY_OF_MONTH);
        month = cal.get(Calendar.MONTH) + 1;
        year = cal.get(Calendar.YEAR);
    }

    public NewDate(String st) {
        // this constructor extracts date from string.
        String[] arr = st.split("[-/:]");
        if (arr.length >= 3 && !arr[0].isEmpty() && !arr[1].isEmpty() && !arr[2].isEmpty()) {
            day = Integer.parseInt(arr[2]);
            month = Integer.parseInt(arr[1]);
            year = Integer.parseInt(arr[0]);
        } else {
            // handle the case when the input string is not in the expected format
            throw new IllegalArgumentException("Invalid date format: " + st);
        }
    }

    public NewDate(Calendar dt) {
        // this constructor extracts date from Calendar object
        day = dt.get(Calendar.DAY_OF_MONTH);
        month = dt.get(Calendar.MONTH) + 1;
        year = dt.get(Calendar.YEAR);
    }

    // setter method
    public boolean setDate(int d, int m, int y) {
        // sets the date and return true if the date is valid
        if (d > 0 && d <= 31 && m > 0 && m <= 12 && y > 0) {
            day = d;
            month = m;
            year = y;
            return true;
        } else {
            return false;
        }
    }

    // getter method
    public NewDate getDate() {
        // return a NewDate object with the current date
        return this;
    }

    // class methods
    public int difference(NewDate d) {
        // Return the difference between two dates in days
        int diffYear = Math.abs(this.year - d.year);
        int diffMon = Math.abs(this.month - d.month);
        int diffDay = Math.abs(this.day - d.day);
        return diffYear * 365 + diffMon * 30 + diffDay;
    }

    public int compareTo(NewDate d) {
        // compare two dates and return 1 if this date is greater than the given date, -1 if this date is less than the given date, and 0 if the two dates are equal
        if (this.year > d.year) {
            return 1;
        } else if (this.year < d.year) {
            return -1;
        } else {
            if (this.month > d.month) {
                return 1;
            } else if (this.month < d.month) {
                return -1;
            } else {
                if (this.day > d.day) {
                    return 1;
                } else if (this.day < d.day) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public NewDate clone() throws CloneNotSupportedException {
        // clone this object
        NewDate clonedDate = new NewDate();
        clonedDate.setDate(this.day, this.month, this.year);
        return clonedDate;
    }

    public String toString() {
        // return a string representation of the date
        return day + "/" + month + "/" + year;
    }

    public static void main(String[] args) throws CloneNotSupportedException {


        // Create 3 NewDate objects
        NewDate x = new NewDate(); // No-arg constructor
        NewDate y = new NewDate("2023/01/12"); // String constructor
        NewDate z = new NewDate(Calendar.getInstance()); // Calendar object constructor

        // Show the usage of set, get, difference, compareTo, clone, and toString methods
        System.out.println("x = " + x.toString());
        System.out.println("y = " + y.toString());
        System.out.println("z = " + z.toString());

        // Set the date of x
        x.setDate(13, 01, 2022);

        // Get the date of y
        NewDate yDate = y.getDate();

        // Calculate the difference between x and y in days
        int diffInDays = x.difference(y);
        System.out.println("x.difference(y) = " + diffInDays);

        // Compare x and y
        int compare = x.compareTo(y);
        System.out.println("x.compareTo(y) = " + compare);

        // Clone x
        NewDate xClone = x.clone();
        System.out.println(xClone.toString());

    }
}
