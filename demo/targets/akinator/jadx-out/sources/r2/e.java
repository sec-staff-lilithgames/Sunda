package r2;

import j1.b0;
import j1.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final long f83683a;

    public e(long j10, kotlin.jvm.internal.u uVar) {
        this.f83683a = j10;
        if (j10 == m0.f68918b.m4835getUnspecified0d7_KjU()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.");
        }
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ e m6040copy8_81llA$default(e eVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = eVar.f83683a;
        }
        return eVar.m6041copy8_81llA(j10);
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final e m6041copy8_81llA(long j10) {
        return new e(j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && m0.m4859equalsimpl0(this.f83683a, ((e) obj).f83683a);
    }

    @Override // r2.t
    public b0 getBrush() {
        return null;
    }

    @Override // r2.t
    /* renamed from: getColor-0d7_KjU */
    public long mo6039getColor0d7_KjU() {
        return this.f83683a;
    }

    public int hashCode() {
        return m0.m4865hashCodeimpl(this.f83683a);
    }

    @Override // r2.t
    public /* bridge */ /* synthetic */ t merge(t tVar) {
        return super.merge(tVar);
    }

    @Override // r2.t
    public /* bridge */ /* synthetic */ t takeOrElse(kv.a aVar) {
        return super.takeOrElse(aVar);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) m0.m4866toStringimpl(this.f83683a)) + ')';
    }
}
