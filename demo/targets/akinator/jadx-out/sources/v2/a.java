package v2;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final e1.d f88857a;

    /* renamed from: b, reason: collision with root package name */
    public final long f88858b;

    public a(e1.d dVar, long j10, kotlin.jvm.internal.u uVar) {
        this.f88857a = dVar;
        this.f88858b = j10;
    }

    @Override // v2.e0
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo5543calculatePositionllwVHH4(s2.s anchorBounds, long j10, s2.x layoutDirection, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        long jIntOffset = s2.r.IntOffset(0, 0);
        s2.u uVar = s2.v.f85360b;
        long jMo3802alignKFBX0sM = this.f88857a.mo3802alignKFBX0sM(uVar.m6963getZeroYbymL2g(), s2.w.IntSize(anchorBounds.getWidth(), anchorBounds.getHeight()), layoutDirection);
        long jMo3802alignKFBX0sM2 = this.f88857a.mo3802alignKFBX0sM(uVar.m6963getZeroYbymL2g(), s2.w.IntSize(s2.v.m6972getWidthimpl(j11), s2.v.m6971getHeightimpl(j11)), layoutDirection);
        long jIntOffset2 = s2.r.IntOffset(anchorBounds.getLeft(), anchorBounds.getTop());
        long jD = o2.d(s2.q.m6931getYimpl(jIntOffset), s2.q.m6930getXimpl(jIntOffset2) + s2.q.m6930getXimpl(jIntOffset), jIntOffset2);
        long jD2 = o2.d(s2.q.m6931getYimpl(jD), s2.q.m6930getXimpl(jMo3802alignKFBX0sM) + s2.q.m6930getXimpl(jD), jMo3802alignKFBX0sM);
        long jIntOffset3 = s2.r.IntOffset(s2.q.m6930getXimpl(jMo3802alignKFBX0sM2), s2.q.m6931getYimpl(jMo3802alignKFBX0sM2));
        long jIntOffset4 = s2.r.IntOffset(s2.q.m6930getXimpl(jD2) - s2.q.m6930getXimpl(jIntOffset3), s2.q.m6931getYimpl(jD2) - s2.q.m6931getYimpl(jIntOffset3));
        long j12 = this.f88858b;
        long jIntOffset5 = s2.r.IntOffset(s2.q.m6930getXimpl(j12) * (layoutDirection == s2.x.f85363b ? 1 : -1), s2.q.m6931getYimpl(j12));
        return o2.d(s2.q.m6931getYimpl(jIntOffset4), s2.q.m6930getXimpl(jIntOffset5) + s2.q.m6930getXimpl(jIntOffset4), jIntOffset5);
    }

    public final e1.d getAlignment() {
        return this.f88857a;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m7426getOffsetnOccac() {
        return this.f88858b;
    }
}
