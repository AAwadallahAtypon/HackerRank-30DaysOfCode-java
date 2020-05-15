    public static Node removeDuplicates(Node head) {
        //Write your code here
        HashSet<Integer> hashSet = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            int currentValue = current.data;
            if (hashSet.contains(currentValue)) {
                previous.next = current.next;
            } else {
                hashSet.add(currentValue);
                previous = current;
            }
            current = current.next;
        }

        return head;
    }
