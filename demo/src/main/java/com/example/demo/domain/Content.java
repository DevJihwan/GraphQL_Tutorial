
@Entity
@Table(name = "CONTENTS")
@Getter
@Setter
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contentId;

    private String contentTitle;

    private String contentBody;

    @OneToMany
    private List<Comment> commentList;
}