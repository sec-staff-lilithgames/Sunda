package ub;

import com.ironsource.G5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f88196a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f88197b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f88198c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f88199d;

    static {
        b bVar = new b("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, G5.T, 76);
        f88196a = bVar;
        f88197b = new b(bVar, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        f88198c = new b(bVar, "PEM", true, G5.T, 64);
        StringBuilder sb2 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb2.setCharAt(sb2.indexOf("+"), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        f88199d = new b("MODIFIED-FOR-URL", sb2.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static b getDefaultVariant() {
        return f88197b;
    }

    public static b valueOf(String str) throws IllegalArgumentException {
        b bVar = f88196a;
        if (bVar.f88191f.equals(str)) {
            return bVar;
        }
        b bVar2 = f88197b;
        if (bVar2.f88191f.equals(str)) {
            return bVar2;
        }
        b bVar3 = f88198c;
        if (bVar3.f88191f.equals(str)) {
            return bVar3;
        }
        b bVar4 = f88199d;
        if (bVar4.f88191f.equals(str)) {
            return bVar4;
        }
        throw new IllegalArgumentException(a.b.k("No Base64Variant with name ", str == null ? "<null>" : a.b.l("'", str, "'")));
    }
}
