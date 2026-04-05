package gc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f57535a;

    /* renamed from: b, reason: collision with root package name */
    public final c f57536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57537c;

    public c(String str, c cVar) {
        this.f57535a = str;
        this.f57536b = cVar;
        this.f57537c = cVar != null ? 1 + cVar.f57537c : 1;
    }

    public String has(char[] cArr, int i10, int i11) {
        String str = this.f57535a;
        if (str.length() != i11) {
            return null;
        }
        int i12 = 0;
        while (str.charAt(i12) == cArr[i10 + i12]) {
            i12++;
            if (i12 >= i11) {
                return str;
            }
        }
        return null;
    }
}
