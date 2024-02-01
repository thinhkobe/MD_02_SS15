package ra.baitap.bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindNumbers {
    public static void main(String[] args) {
        Optional<List<Integer>> result = findNumbers(getArr(), 20, 50);

        result.ifPresentOrElse(
                list -> {
                    for (Integer i : list) {
                        System.out.println(i);
                    }
                },
                () -> System.out.println("Mảng rỗng")
        );
    }

    private static Optional<List<Integer>> findNumbers(int[] arr, int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > start && arr[i] < end) {
                list.add(arr[i]);
            }
        }
        return list.isEmpty() ? Optional.empty() : Optional.of(list);
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
