package j1;

import android.graphics.Shader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b2 extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public Shader f68845b;

    /* renamed from: c, reason: collision with root package name */
    public long f68846c;

    public b2() {
        super(null);
        this.f68846c = i1.o.f59366b.m4238getUnspecifiedNHjbRc();
    }

    @Override // j1.b0
    /* renamed from: applyTo-Pq9zytI */
    public final void mo4671applyToPq9zytI(long j10, i1 p10, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(p10, "p");
        Shader shaderMo4695createShaderuvyYCjk = this.f68845b;
        if (shaderMo4695createShaderuvyYCjk == null || !i1.o.m4248equalsimpl0(this.f68846c, j10)) {
            shaderMo4695createShaderuvyYCjk = mo4695createShaderuvyYCjk(j10);
            this.f68845b = shaderMo4695createShaderuvyYCjk;
            this.f68846c = j10;
        }
        long jMo4766getColor0d7_KjU = p10.mo4766getColor0d7_KjU();
        l0 l0Var = m0.f68918b;
        if (!m0.m4859equalsimpl0(jMo4766getColor0d7_KjU, l0Var.m4825getBlack0d7_KjU())) {
            p10.mo4772setColor8_81llA(l0Var.m4825getBlack0d7_KjU());
        }
        if (!kotlin.jvm.internal.e0.areEqual(p10.getShader(), shaderMo4695createShaderuvyYCjk)) {
            p10.setShader(shaderMo4695createShaderuvyYCjk);
        }
        if (p10.getAlpha() == f10) {
            return;
        }
        p10.setAlpha(f10);
    }

    /* renamed from: createShader-uvyYCjk, reason: not valid java name */
    public abstract Shader mo4695createShaderuvyYCjk(long j10);
}
