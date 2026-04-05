package n0;

import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements a {

    /* renamed from: a, reason: collision with root package name */
    public final long f75161a;

    /* renamed from: b, reason: collision with root package name */
    public final long f75162b;

    /* renamed from: c, reason: collision with root package name */
    public final long f75163c;

    /* renamed from: d, reason: collision with root package name */
    public final long f75164d;

    public q(long j10, long j11, long j12, long j13, kotlin.jvm.internal.u uVar) {
        this.f75161a = j10;
        this.f75162b = j11;
        this.f75163c = j12;
        this.f75164d = j13;
    }

    @Override // n0.a
    public v5 backgroundColor(boolean z10, p0.w wVar, int i10) {
        wVar.startReplaceableGroup(-655254499);
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(j1.m0.m4848boximpl(z10 ? this.f75161a : this.f75163c), wVar, 0);
        wVar.endReplaceableGroup();
        return v5VarRememberUpdatedState;
    }

    @Override // n0.a
    public v5 contentColor(boolean z10, p0.w wVar, int i10) {
        wVar.startReplaceableGroup(-2133647540);
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(j1.m0.m4848boximpl(z10 ? this.f75162b : this.f75164d), wVar, 0);
        wVar.endReplaceableGroup();
        return v5VarRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.e0.areEqual(kotlin.jvm.internal.c1.getOrCreateKotlinClass(q.class), kotlin.jvm.internal.c1.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        q qVar = (q) obj;
        return j1.m0.m4859equalsimpl0(this.f75161a, qVar.f75161a) && j1.m0.m4859equalsimpl0(this.f75162b, qVar.f75162b) && j1.m0.m4859equalsimpl0(this.f75163c, qVar.f75163c) && j1.m0.m4859equalsimpl0(this.f75164d, qVar.f75164d);
    }

    public int hashCode() {
        return j1.m0.m4865hashCodeimpl(this.f75164d) + ((j1.m0.m4865hashCodeimpl(this.f75163c) + ((j1.m0.m4865hashCodeimpl(this.f75162b) + (j1.m0.m4865hashCodeimpl(this.f75161a) * 31)) * 31)) * 31);
    }
}
