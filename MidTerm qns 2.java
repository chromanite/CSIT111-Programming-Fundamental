switch (x) {
    case 1:
    case 2:
        if (ch == 'a') {
            System.out.println ("Good");
        } else if ( ch == 'b') {
            System.out.println ("Luck");        
        }
        
        break;
    
    case 3:
    case 4:
        switch (ch) {
            case 'c':
            case 'd':
                System.out.println ("To");
                break;

            default:
                System.out.println ("Your");
                break;
        }
        
    default:
        if (ch == 'e' || ch == 'f') {
            System.out.println ("Term");
        }
        System.out.println ("Test");
}





if (x == 1 || x == 2) {
    switch (ch) {
    case 'a': System.out.println ("Good");
    case 'b': System.out.println ("Luck");
    }
} else if (x == 3 || x == 4) {
    if (ch == 'c' || ch == 'd')
    System.out.println ("To");
    else
    System.out.println ("Your");
} else {
    switch (ch) {
    case 'e':
    case 'f': System.out.println ("Term");
    default : System.out.println ("Test");
    }
}