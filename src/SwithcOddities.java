public class SwithcOddities {
    public static void main(String[] args) {
        byte[] bytes = {100, 103, 104, 107, 126};
        String caseAssignedValue = "";
        start_for:
        for (var i : bytes) {  // Using LVTI here

            switch (i * 10) {  // Use an Expression
                case 1000:

                case 1030:
                case 1040:
                    break;
                case 1070:
                    caseAssignedValue = "Less than 1100";
                    break start_for;
                case 1260:
                    caseAssignedValue = "Equal to 1260";
                    break;
            }
            System.out.println("Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);
        }
//        byte[] bytes = {100, 103, 104, 107, 126};
//        String caseAssignedValue = "";
//
//        // Create a label to use in switch statement
//        start_for:
//        for (var i : bytes) {   // Using LVTI here
//            switch (i) {
//                case 100:
//                case 103:
//                case 104:
//                    // This is case block break
//                    break;
//                case 107:
//                    caseAssignedValue = "Less than 110";
//                    // This is a for loop break with label
//                    break start_for;
//                case 126:
//                    caseAssignedValue = "Equal to 126";
//                    break;
//            }
//            System.out.println("Done processing " + i +
//                    ", caseAssignedValue = " + caseAssignedValue);
//        }
    }
}
