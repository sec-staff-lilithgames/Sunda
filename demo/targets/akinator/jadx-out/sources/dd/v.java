package dd;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f52105c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f52106e;

    public v(String str, String str2) {
        this.f52105c = str;
        this.f52106e = str2;
    }

    @Override // dd.a0
    public String reverse(String str) {
        String str2 = this.f52105c;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String str3 = this.f52106e;
        if (strSubstring.endsWith(str3)) {
            return strSubstring.substring(0, strSubstring.length() - str3.length());
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[PreAndSuffixTransformer('");
        sb2.append(this.f52105c);
        sb2.append("','");
        return o2.o(sb2, this.f52106e, "')]");
    }

    @Override // dd.a0
    public String transform(String str) {
        return this.f52105c + str + this.f52106e;
    }
}
