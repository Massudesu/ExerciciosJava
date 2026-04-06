import static java.lang.IO.*;

void main() {
    String[] nums = new String[5];
    for (int i = 0; i < 5; i++) {
        print("Número " + (i + 1) + ": ");
        nums[i] = readln();
    }
    for (String n : nums) println(n);
}