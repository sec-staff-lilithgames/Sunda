package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    public static final long IntSize(int i10, int i11) {
        return v.m6967constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m6977getCenterozmzZPI(long j10) {
        return r.IntOffset(v.m6972getWidthimpl(j10) / 2, v.m6971getHeightimpl(j10) / 2);
    }

    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m6979timesO0kMr_c(int i10, long j10) {
        return v.m6974timesYEO4UFw(j10, i10);
    }

    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final s m6980toIntRectozmzZPI(long j10) {
        return t.m6961IntRectVbeCjmY(q.f85352b.m6920getZeronOccac(), j10);
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m6981toSizeozmzZPI(long j10) {
        return i1.p.Size(v.m6972getWidthimpl(j10), v.m6971getHeightimpl(j10));
    }

    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m6978getCenterozmzZPI$annotations(long j10) {
    }
}
