import services.SequenceService;

public class Application {
    public static void main(String[] args) {
        SequenceService sequenceService = new SequenceService();
        int[] arr = new int[] {3,4,5,8,9};
        int result = sequenceService.act(arr,13);

        System.out.println(result);
    }
}
