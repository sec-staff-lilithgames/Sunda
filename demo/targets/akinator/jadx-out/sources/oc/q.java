package oc;

import java.net.URI;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends t {

    /* renamed from: f, reason: collision with root package name */
    public final int f78939f;

    public q(Class cls, int i10) {
        super(cls);
        this.f78939f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    @Override // oc.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(java.lang.String r8, jc.k r9) throws pc.c {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.q.V(java.lang.String, jc.k):java.lang.Object");
    }

    @Override // oc.t
    public final boolean Y() {
        return this.f78939f != 7;
    }

    @Override // jc.q
    public final Object a(jc.k kVar) {
        return getEmptyValue(kVar);
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        int i10 = this.f78939f;
        return i10 != 3 ? i10 != 8 ? super.getEmptyValue(kVar) : Locale.ROOT : URI.create("");
    }
}
