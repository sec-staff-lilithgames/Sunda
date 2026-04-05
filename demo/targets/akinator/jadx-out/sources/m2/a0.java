package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public String f73890a;

    /* renamed from: b, reason: collision with root package name */
    public j f73891b;

    /* renamed from: c, reason: collision with root package name */
    public int f73892c;

    /* renamed from: d, reason: collision with root package name */
    public int f73893d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public a0(String text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        this.f73890a = text;
        this.f73892c = -1;
        this.f73893d = -1;
    }

    public final char get(int i10) {
        j jVar = this.f73891b;
        if (jVar == null) {
            return this.f73890a.charAt(i10);
        }
        if (i10 < this.f73892c) {
            return this.f73890a.charAt(i10);
        }
        int length = jVar.length();
        int i11 = this.f73892c;
        return i10 < length + i11 ? jVar.get(i10 - i11) : this.f73890a.charAt(i10 - ((length - this.f73893d) + i11));
    }

    public final int getLength() {
        j jVar = this.f73891b;
        if (jVar == null) {
            return this.f73890a.length();
        }
        return jVar.length() + (this.f73890a.length() - (this.f73893d - this.f73892c));
    }

    public final String getText() {
        return this.f73890a;
    }

    public final void replace(int i10, int i11, String text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        j jVar = this.f73891b;
        if (jVar != null) {
            int i12 = this.f73892c;
            int i13 = i10 - i12;
            int i14 = i11 - i12;
            if (i13 >= 0 && i14 <= jVar.length()) {
                jVar.replace(i13, i14, text);
                return;
            }
            this.f73890a = toString();
            this.f73891b = null;
            this.f73892c = -1;
            this.f73893d = -1;
            replace(i10, i11, text);
            return;
        }
        int iMax = Math.max(255, text.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f73890a.length() - i11, 64);
        int i15 = i10 - iMin;
        k.access$toCharArray(this.f73890a, cArr, 0, i15, i10);
        int i16 = iMax - iMin2;
        int i17 = iMin2 + i11;
        k.access$toCharArray(this.f73890a, cArr, i16, i11, i17);
        k.a(text, cArr, iMin);
        this.f73891b = new j(cArr, text.length() + iMin, i16);
        this.f73892c = i15;
        this.f73893d = i17;
    }

    public final void setText(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f73890a = str;
    }

    public String toString() {
        j jVar = this.f73891b;
        if (jVar == null) {
            return this.f73890a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f73890a, 0, this.f73892c);
        jVar.append(sb2);
        String str = this.f73890a;
        sb2.append((CharSequence) str, this.f73893d, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
