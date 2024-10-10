package bridge;

/**
 * 브릿지 패턴
 * 기능계층과 구현 계층을 분리하여 시스템의 유지보수성을 높이는 패턴
 * 아래 예제를 보아 알겠지만 기존 구현 코드를 수정하지 않고 수정이 가능하다.
 */
public class MainEntry {
    public static void main(String[] args) {
        String title = "recovery Earth";
        String author = "GB";
        String[] content = {"플라스틱 감소와",
                "바다의 어획량 감소로 인하여", "지구는 복원되었다."};
        Draft draft = new Draft(title, author, content);

        Display display1 = new SimpleDisplay();
        draft.print(display1);
        Display display2 = new CaptionDisplay();
        draft.print(display2);

        String publisher = "me";
        int cost = 100000;

        Publication publication = new Publication(title,author,content,publisher,cost);
        publication.print(display1);
        publication.print(display2);
    }

}
