package enums;

public enum Category {
    A("General Knowledge"),
    B("Philosophy, Psychology, and Religion"),
    C("Historical Studies and Research Methods"),
    D("Global and Regional History (Europe, Asia, Africa, etc.)"),
    E("American History"),
    F("History of the United States and Canada"),
    G("Geography, Anthropology, and Outdoor Activities"),
    H("Humanities and Social Sciences"),
    J("Government and Politics"),
    K("Law and Legal Studies"),
    L("Education and Learning"),
    M("Music and Performing Arts"),
    N("Arts and Culture"),
    P("Literature and Linguistics"),
    Q("Scientific Research and Innovation"),
    R("Health and Medicine"),
    S("Agriculture and Environmental Studies"),
    T("Engineering and Technology"),
    U("Military and Defense Studies"),
    V("Naval and Maritime Studies"),
    Z("Library Science and Information Management");

    private final String description;

    // Constructor
    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // Assign categories to specific items
    public static Category getCategoryForItem(String itemType) {
        switch (itemType.toLowerCase()) {
            case "audiobooks":
                return M;  // Audiobooks often belong to Music and Performing Arts (M).
            case "ebooks":
                return P;  // E-books typically fall under Literature and Linguistics (P).
            case "magazines":
            case "newspapers":
                return H;  // Magazines and Newspapers often relate to Humanities and Social Sciences (H).
            case "dvds":
            case "blu-rays":
                return N;  // DVDs and Blu-rays may be categorized under Arts and Culture (N).
            case "music records":
                return M;  // Music Records belong to Music and Performing Arts (M).
            case "video game items":
                return G;  // Video Game can be related to Geography, Anthropology, and Outdoor Activities (G).
            case "reference materials":
                return Z;  // Reference Materials typically fall under Library Science and Information Management (Z).
            case "online resources":
                return Z;  // Online Resources often fall under Information Management (Z).
            default:
                return A;  // Default category: General Knowledge (A).
        }
    }
}
