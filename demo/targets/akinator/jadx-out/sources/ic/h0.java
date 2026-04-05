package ic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum h0 {
    NONE("", ""),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE(" ", ""),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER("", " "),
    BOTH(" ", " ");


    /* renamed from: b, reason: collision with root package name */
    public final String f59485b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59486c;

    h0(String str, String str2) {
        this.f59485b = str;
        this.f59486c = str2;
    }

    public String apply(char c10) {
        return this.f59485b + c10 + this.f59486c;
    }

    public String spacesAfter() {
        return this.f59486c;
    }

    public String spacesBefore() {
        return this.f59485b;
    }
}
