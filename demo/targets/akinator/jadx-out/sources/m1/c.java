package m1;

import i1.o;
import j1.m0;
import j1.n0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import l1.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: h, reason: collision with root package name */
    public final long f73878h;

    /* renamed from: j, reason: collision with root package name */
    public n0 f73880j;

    /* renamed from: i, reason: collision with root package name */
    public float f73879i = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public final long f73881k = o.f59366b.m4238getUnspecifiedNHjbRc();

    public c(long j10, u uVar) {
        this.f73878h = j10;
    }

    @Override // m1.e
    public final boolean a(float f10) {
        this.f73879i = f10;
        return true;
    }

    @Override // m1.e
    public final boolean b(n0 n0Var) {
        this.f73880j = n0Var;
        return true;
    }

    @Override // m1.e
    public final void d(i iVar) {
        e0.checkNotNullParameter(iVar, "<this>");
        i.m5411drawRectnJ9OG0$default(iVar, this.f73878h, 0L, 0L, this.f73879i, null, this.f73880j, 0, 86, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return m0.m4859equalsimpl0(this.f73878h, ((c) obj).f73878h);
        }
        return false;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5580getColor0d7_KjU() {
        return this.f73878h;
    }

    @Override // m1.e
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo138getIntrinsicSizeNHjbRc() {
        return this.f73881k;
    }

    public int hashCode() {
        return m0.m4865hashCodeimpl(this.f73878h);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) m0.m4866toStringimpl(this.f73878h)) + ')';
    }
}
