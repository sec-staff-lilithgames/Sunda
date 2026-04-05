package dd;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f52107c;

    public w(String str) {
        this.f52107c = str;
    }

    @Override // dd.a0
    public String reverse(String str) {
        String str2 = this.f52107c;
        if (str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return null;
    }

    public String toString() {
        return o2.o(new StringBuilder("[PrefixTransformer('"), this.f52107c, "')]");
    }

    @Override // dd.a0
    public String transform(String str) {
        return o2.o(new StringBuilder(), this.f52107c, str);
    }
}
