package r2;

import j1.b0;
import j1.b2;
import j1.j2;
import j1.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q f83721a = new q();

    public final t from(b0 b0Var) {
        if (b0Var == null) {
            return r.f83722a;
        }
        if (b0Var instanceof j2) {
            return m6091from8_81llA(((j2) b0Var).m4781getValue0d7_KjU());
        }
        if (b0Var instanceof b2) {
            return new d((b2) b0Var);
        }
        throw new tu.t();
    }

    /* renamed from: from-8_81llA, reason: not valid java name */
    public final t m6091from8_81llA(long j10) {
        return j10 != m0.f68918b.m4835getUnspecified0d7_KjU() ? new e(j10, null) : r.f83722a;
    }
}
