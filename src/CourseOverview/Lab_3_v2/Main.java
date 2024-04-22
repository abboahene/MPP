package CourseOverview.Lab_3_v2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        UPS ups = new UPS();
        USMail usMail = new USMail();
        Fedx fedx = new Fedx();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Welcome - Carrier Service");
            System.out.println("---------------------------");

            System.out.println("Choose sender type: ");
            ESenderType sender;
            ESenderType[] senderTypes = ESenderType.values();
            for (int j = 0; j < senderTypes.length; j++){
                System.out.println((j+1) + ". "+ senderTypes[j]);
            }
            while(true){
                int senderTypeNumber = sc.nextInt();
                if(senderTypeNumber > 0 && senderTypeNumber <= senderTypes.length){
                    sender = senderTypes[senderTypeNumber-1];
                    break;
                }else{
                    System.out.println("Invalid choice, try again:");
                }
            }

            System.out.println("Enter number of packages: ");

            int numberOfPackages = sc.nextInt();
            Package[] packages = new Package[numberOfPackages];

            for(int i = 0; i < numberOfPackages; i++){
                System.out.println("Package "+ (i+1) + " Details");
                System.out.println("-----------------------------");
                System.out.println("Enter package description: ");
                String desc = sc.next();

                System.out.println("Enter package weight: ");
                double weight = sc.nextDouble();

                System.out.println("Choose a zone by number: ");
                String[] zones =  Fedx.zonePriceMap.keySet().toArray(new String[]{});
                for (int j = 0; j < zones.length; j++){
                    System.out.println((j+1) + ". "+ zones[j]);
                }

                while(true){
                    int zoneNumber = sc.nextInt();
                    if(zoneNumber > 0 && zoneNumber <= zones.length){
                        packages[i] = new Package(desc, weight, zones[zoneNumber - 1], sender);
                        break;
                    }else{
                        System.out.println("Invalid choice, try again:");
                    }
                }
            }

            System.out.println("\nBest Prices");
            System.out.println("----------------------------------------------------");

            for (int i = 0; i < packages.length; i++) {
               double upsPrice = ComputeTotalCost.calcTotalCost(ups, packages[i]);
               double usMailPrice = ComputeTotalCost.calcTotalCost(usMail, packages[i]);
               double fedxPrice = ComputeTotalCost.calcTotalCost(fedx, packages[i]);
               double minPrice = Math.min(upsPrice, usMailPrice);
               minPrice = Math.min(minPrice, fedxPrice);

               if(Double.compare(upsPrice, minPrice) == 0){
                   System.out.printf("%-15s $%,-15.2f %-15s%n", packages[i].getDescription(), minPrice, ups.getName());
               }else if(Double.compare(usMailPrice, minPrice) == 0){
                   System.out.printf("%-15s $%,-15.2f %-15s%n", packages[i].getDescription(), minPrice, usMail.getName());
               }else{
                   System.out.printf("%-15s $%,-15.2f %-15s%n", packages[i].getDescription(), minPrice, fedx.getName());
               }
            }

            System.out.println("----------------------------------------------------");
            System.out.println();

        }
    }
}
