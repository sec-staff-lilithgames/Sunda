package l1;

import i1.o;
import i1.p;
import j1.l1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f72229a;

    public c(f fVar) {
        this.f72229a = fVar;
    }

    @Override // l1.k
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo5322clipPathmtrdDE(l1 path, int i10) {
        e0.checkNotNullParameter(path, "path");
        ((b) this.f72229a).getCanvas().mo4696clipPathmtrdDE(path, i10);
    }

    @Override // l1.k
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo5323clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10) {
        ((b) this.f72229a).getCanvas().mo4697clipRectN_I0leg(f10, f11, f12, f13, i10);
    }

    @Override // l1.k
    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public long mo5324getCenterF1C5BW0() {
        return p.m4258getCenteruvyYCjk(mo5325getSizeNHjbRc());
    }

    @Override // l1.k
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public long mo5325getSizeNHjbRc() {
        return ((b) this.f72229a).mo5320getSizeNHjbRc();
    }

    @Override // l1.k
    public void inset(float f10, float f11, float f12, float f13) {
        f fVar = this.f72229a;
        j1.e0 canvas = ((b) fVar).getCanvas();
        long jSize = p.Size(o.m4252getWidthimpl(mo5325getSizeNHjbRc()) - (f12 + f10), o.m4249getHeightimpl(mo5325getSizeNHjbRc()) - (f13 + f11));
        if (o.m4252getWidthimpl(jSize) < 0.0f || o.m4249getHeightimpl(jSize) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        ((b) fVar).mo5321setSizeuvyYCjk(jSize);
        canvas.translate(f10, f11);
    }

    @Override // l1.k
    /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
    public void mo5326rotateUv8p0NA(float f10, long j10) {
        j1.e0 canvas = ((b) this.f72229a).getCanvas();
        canvas.translate(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10));
        canvas.rotate(f10);
        canvas.translate(-i1.h.m4185getXimpl(j10), -i1.h.m4186getYimpl(j10));
    }

    @Override // l1.k
    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public void mo5327scale0AR0LA0(float f10, float f11, long j10) {
        j1.e0 canvas = ((b) this.f72229a).getCanvas();
        canvas.translate(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10));
        canvas.scale(f10, f11);
        canvas.translate(-i1.h.m4185getXimpl(j10), -i1.h.m4186getYimpl(j10));
    }

    @Override // l1.k
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo5328transform58bKbWc(float[] matrix) {
        e0.checkNotNullParameter(matrix, "matrix");
        ((b) this.f72229a).getCanvas().mo4699concat58bKbWc(matrix);
    }

    @Override // l1.k
    public void translate(float f10, float f11) {
        ((b) this.f72229a).getCanvas().translate(f10, f11);
    }
}
