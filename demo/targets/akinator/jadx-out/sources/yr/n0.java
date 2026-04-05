package yr;

import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f94965a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94966b;

    public n0(k kVar, String str) {
        this.f94965a = kVar;
        this.f94966b = str;
    }

    public static n0 error(String str) {
        return new n0(null, (String) p1.checkNotNull(str, "error"));
    }

    public static n0 factory(k kVar) {
        return new n0((k) p1.checkNotNull(kVar, "factory"), null);
    }
}
