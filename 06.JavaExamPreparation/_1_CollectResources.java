import java.util.Scanner;

public class _1_CollectResources {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] items=scanner.nextLine().split("\\s");
        boolean[] itemsFlags=new boolean[items.length];
        int tests=scanner.nextInt();
        long maxQuantity=0;
        long currentQuantity;
        int currentPosition;
        for (int test = 0; test < tests; test++) {
            currentQuantity = 0;
            String[] input = scanner.nextLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int step = Integer.parseInt(input[1]);
            currentPosition = start;
            step %= items.length;
            while (!itemsFlags[currentPosition]) {
                String[] resourceData = items[currentPosition].split("_");
                String resourceType = resourceData[0];
                int quantity;
                if (resourceData.length == 1) {
                    quantity = 1;

                } else {
                    quantity = Integer.parseInt(resourceData[1]);
                }
                switch (resourceType) {
                    case "gold":
                    case "stone":
                    case "food":
                    case "wood":
                        currentQuantity += quantity;
                        itemsFlags[currentPosition] = true;
                }

                currentPosition += step;
                currentPosition %= items.length;
            }

            if (currentQuantity > maxQuantity) {
                maxQuantity = currentQuantity;
            }
        }
        System.out.println(maxQuantity);
    }
}
