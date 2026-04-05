package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements v2.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f73783a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73784b;

    public m(n nVar, long j10, kotlin.jvm.internal.u uVar) {
        this.f73783a = nVar;
        this.f73784b = j10;
    }

    @Override // v2.e0
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo5543calculatePositionllwVHH4(s2.s anchorBounds, long j10, s2.x layoutDirection, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i10 = l.$EnumSwitchMapping$0[this.f73783a.ordinal()];
        long j12 = this.f73784b;
        if (i10 == 1) {
            return j1.o2.d(anchorBounds.getTop(), s2.q.m6930getXimpl(j12) + anchorBounds.getLeft(), j12);
        }
        if (i10 == 2) {
            return j1.o2.d(anchorBounds.getTop(), (s2.q.m6930getXimpl(j12) + anchorBounds.getLeft()) - s2.v.m6972getWidthimpl(j11), j12);
        }
        if (i10 != 3) {
            throw new tu.t();
        }
        return j1.o2.d(anchorBounds.getTop(), (s2.q.m6930getXimpl(j12) + anchorBounds.getLeft()) - (s2.v.m6972getWidthimpl(j11) / 2), j12);
    }
}
