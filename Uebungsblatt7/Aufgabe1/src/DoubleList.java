public class DoubleList {
    private DoubleNode head;

    public void add(double d) {
        if (head == null) {
            head = new DoubleNode(d);
        } else {
            DoubleNode cursor = head;

            // alternatively to iterating through the list
            // a reference to the last node could be stored
            while (cursor.next != null) {
                cursor = cursor.next;
            }
            cursor.next = new DoubleNode(d);
        }
    }

    public void insertFirst(double d) {
        DoubleNode newNode = new DoubleNode(d);
        newNode.next = head;
        head = newNode;
    }

    public double get(int i) {
        if (i < 0) {
            return 0;
        }
        DoubleNode cursor = head;
        int counter = 0;
        while (cursor != null) {
            if (counter == i) {
                return cursor.value;
            }
            counter++;
            cursor = cursor.next;
        }
        return 0;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        DoubleNode cursor = head;
        while (cursor != null) {
            builder.append(cursor.value + ";");
            cursor = cursor.next;
        }
        return builder.toString();
    }

    public void remove(int i) {
        // if i is invalid no node is removed
        if (head != null && i >= 0) {
            if (i == 0) {
                head = head.next;
            } else {
                DoubleNode cursor = head;
                int counter = 0;
                while (cursor != null) {
                    // find node before the one to be removed
                    if (counter == i - 1) {
                        if (cursor.next != null) {
                            cursor.next = cursor.next.next;
                        }
                        return;
                    }

                    cursor = cursor.next;
                    counter++;
                }
            }
        }
    }

    private class DoubleNode {
        double value;
        DoubleNode next;

        DoubleNode(double v) {
            value = v;
        }
    }
}