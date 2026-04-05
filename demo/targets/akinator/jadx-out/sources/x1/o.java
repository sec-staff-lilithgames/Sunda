package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements r {
    @Override // x1.r
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo7834computeScaleFactorH7hwNQA(long j10, long j11) {
        float fMin = Math.min(i1.o.m4252getWidthimpl(j11) / i1.o.m4252getWidthimpl(j10), i1.o.m4249getHeightimpl(j11) / i1.o.m4249getHeightimpl(j10));
        return a2.ScaleFactor(fMin, fMin);
    }
}
