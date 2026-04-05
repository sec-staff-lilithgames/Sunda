package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r1 extends s1 {
    @Override // m0.s1
    /* renamed from: compare-3MmeM6k$foundation_release */
    public int mo5560compare3MmeM6k$foundation_release(long j10, i1.j bounds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bounds, "bounds");
        if (bounds.m4205containsk4lQ0M(j10)) {
            return 0;
        }
        if (i1.h.m4186getYimpl(j10) < bounds.getTop()) {
            return -1;
        }
        return (i1.h.m4185getXimpl(j10) >= bounds.getLeft() || i1.h.m4186getYimpl(j10) >= bounds.getBottom()) ? 1 : -1;
    }
}
