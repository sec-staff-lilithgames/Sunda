package o2;

import android.text.TextPaint;
import j1.b0;
import j1.b2;
import j1.d2;
import j1.j2;
import j1.m0;
import j1.o0;
import kotlin.jvm.internal.e0;
import r2.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public r2.n f77415a;

    /* renamed from: b, reason: collision with root package name */
    public d2 f77416b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f77417c;

    /* renamed from: d, reason: collision with root package name */
    public i1.o f77418d;

    public l(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f77415a = r2.n.f83709b.getNone();
        this.f77416b = d2.f68857d.getNone();
    }

    /* renamed from: setBrush-d16Qtg0, reason: not valid java name */
    public final void m5774setBrushd16Qtg0(b0 b0Var, long j10) {
        if (b0Var == null) {
            setShader(null);
            return;
        }
        if (e0.areEqual(this.f77417c, b0Var)) {
            i1.o oVar = this.f77418d;
            if (oVar == null ? false : i1.o.m4248equalsimpl0(oVar.m4257unboximpl(), j10)) {
                return;
            }
        }
        this.f77417c = b0Var;
        this.f77418d = i1.o.m4240boximpl(j10);
        if (b0Var instanceof j2) {
            setShader(null);
            m5775setColor8_81llA(((j2) b0Var).m4781getValue0d7_KjU());
        } else if (b0Var instanceof b2) {
            if (j10 != i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
                setShader(((b2) b0Var).mo4695createShaderuvyYCjk(j10));
            }
        }
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m5775setColor8_81llA(long j10) {
        int iM4894toArgb8_81llA;
        if (j10 == m0.f68918b.m4835getUnspecified0d7_KjU() || getColor() == (iM4894toArgb8_81llA = o0.m4894toArgb8_81llA(j10))) {
            return;
        }
        setColor(iM4894toArgb8_81llA);
    }

    public final void setShadow(d2 d2Var) {
        if (d2Var == null) {
            d2Var = d2.f68857d.getNone();
        }
        if (e0.areEqual(this.f77416b, d2Var)) {
            return;
        }
        this.f77416b = d2Var;
        if (e0.areEqual(d2Var, d2.f68857d.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(this.f77416b.getBlurRadius(), i1.h.m4185getXimpl(this.f77416b.m4721getOffsetF1C5BW0()), i1.h.m4186getYimpl(this.f77416b.m4721getOffsetF1C5BW0()), o0.m4894toArgb8_81llA(this.f77416b.m4720getColor0d7_KjU()));
        }
    }

    public final void setTextDecoration(r2.n nVar) {
        if (nVar == null) {
            nVar = r2.n.f83709b.getNone();
        }
        if (e0.areEqual(this.f77415a, nVar)) {
            return;
        }
        this.f77415a = nVar;
        n.a aVar = r2.n.f83709b;
        setUnderlineText(nVar.contains(aVar.getUnderline()));
        setStrikeThruText(this.f77415a.contains(aVar.getLineThrough()));
    }
}
