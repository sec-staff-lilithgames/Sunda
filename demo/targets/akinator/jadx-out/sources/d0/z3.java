package d0;

import android.widget.Magnifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class z3 implements w3 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f51695a;

    public z3(Magnifier magnifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(magnifier, "magnifier");
        this.f51695a = magnifier;
    }

    @Override // d0.w3
    public void dismiss() {
        this.f51695a.dismiss();
    }

    public final Magnifier getMagnifier() {
        return this.f51695a;
    }

    @Override // d0.w3
    /* renamed from: getSize-YbymL2g */
    public long mo3735getSizeYbymL2g() {
        return s2.w.IntSize(this.f51695a.getWidth(), this.f51695a.getHeight());
    }

    @Override // d0.w3
    /* renamed from: update-Wko1d7g */
    public void mo3686updateWko1d7g(long j10, long j11, float f10) {
        this.f51695a.show(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10));
    }

    @Override // d0.w3
    public void updateContent() {
        this.f51695a.update();
    }
}
