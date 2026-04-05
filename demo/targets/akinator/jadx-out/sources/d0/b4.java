package d0;

import android.widget.Magnifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b4 extends z3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(Magnifier magnifier) {
        super(magnifier);
        kotlin.jvm.internal.e0.checkNotNullParameter(magnifier, "magnifier");
    }

    @Override // d0.z3, d0.w3
    /* renamed from: update-Wko1d7g, reason: not valid java name */
    public void mo3686updateWko1d7g(long j10, long j11, float f10) {
        if (!Float.isNaN(f10)) {
            getMagnifier().setZoom(f10);
        }
        if (i1.i.m4198isSpecifiedk4lQ0M(j11)) {
            getMagnifier().show(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), i1.h.m4185getXimpl(j11), i1.h.m4186getYimpl(j11));
        } else {
            getMagnifier().show(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10));
        }
    }
}
