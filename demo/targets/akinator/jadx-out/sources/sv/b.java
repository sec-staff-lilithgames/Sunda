package sv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f86118e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f86119f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f86120g;

    /* renamed from: b, reason: collision with root package name */
    public final int f86121b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86122c;

    static {
        b[] bVarArr = {new b("UNASSIGNED", 0, 0, "Cn"), new b("UPPERCASE_LETTER", 1, 1, "Lu"), new b("LOWERCASE_LETTER", 2, 2, "Ll"), new b("TITLECASE_LETTER", 3, 3, "Lt"), new b("MODIFIER_LETTER", 4, 4, "Lm"), new b("OTHER_LETTER", 5, 5, "Lo"), new b("NON_SPACING_MARK", 6, 6, "Mn"), new b("ENCLOSING_MARK", 7, 7, "Me"), new b("COMBINING_SPACING_MARK", 8, 8, "Mc"), new b("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd"), new b("LETTER_NUMBER", 10, 10, "Nl"), new b("OTHER_NUMBER", 11, 11, "No"), new b("SPACE_SEPARATOR", 12, 12, "Zs"), new b("LINE_SEPARATOR", 13, 13, "Zl"), new b("PARAGRAPH_SEPARATOR", 14, 14, "Zp"), new b("CONTROL", 15, 15, "Cc"), new b("FORMAT", 16, 16, "Cf"), new b("PRIVATE_USE", 17, 18, "Co"), new b("SURROGATE", 18, 19, "Cs"), new b("DASH_PUNCTUATION", 19, 20, "Pd"), new b("START_PUNCTUATION", 20, 21, "Ps"), new b("END_PUNCTUATION", 21, 22, "Pe"), new b("CONNECTOR_PUNCTUATION", 22, 23, "Pc"), new b("OTHER_PUNCTUATION", 23, 24, "Po"), new b("MATH_SYMBOL", 24, 25, "Sm"), new b("CURRENCY_SYMBOL", 25, 26, "Sc"), new b("MODIFIER_SYMBOL", 26, 27, "Sk"), new b("OTHER_SYMBOL", 27, 28, "So"), new b("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi"), new b("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf")};
        f86119f = bVarArr;
        f86120g = cv.b.enumEntries(bVarArr);
        f86118e = new a(null);
    }

    public b(String str, int i10, int i11, String str2) {
        this.f86121b = i11;
        this.f86122c = str2;
    }

    public static cv.a getEntries() {
        return f86120g;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f86119f.clone();
    }

    public final boolean contains(char c10) {
        return Character.getType(c10) == this.f86121b;
    }

    public final String getCode() {
        return this.f86122c;
    }

    public final int getValue() {
        return this.f86121b;
    }
}
