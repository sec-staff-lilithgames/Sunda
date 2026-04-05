package dd;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f52108c;

    public x(String str) {
        this.f52108c = str;
    }

    @Override // dd.a0
    public String reverse(String str) {
        String str2 = this.f52108c;
        if (str.endsWith(str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return null;
    }

    public String toString() {
        return o2.o(new StringBuilder("[SuffixTransformer('"), this.f52108c, "')]");
    }

    @Override // dd.a0
    public String transform(String str) {
        StringBuilder sbU = p0.o2.u(str);
        sbU.append(this.f52108c);
        return sbU.toString();
    }
}
