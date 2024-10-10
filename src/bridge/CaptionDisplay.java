package bridge;

public class CaptionDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println("title"+draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println("author"+draft.getAuthor());
    }

    @Override
    public void content(Draft draft) {
        System.out.println("content");
        String[] contents = draft.getContent();
        for (int i = 0; i < contents.length; i++) {
            System.out.println("    "+contents[i]);
        }
    }
}
