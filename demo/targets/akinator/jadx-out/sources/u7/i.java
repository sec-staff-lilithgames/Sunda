package u7;

import android.graphics.Color;
import android.graphics.Matrix;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a8.a f87990a;

    /* renamed from: b, reason: collision with root package name */
    public final a f87991b;

    /* renamed from: c, reason: collision with root package name */
    public final f f87992c;

    /* renamed from: d, reason: collision with root package name */
    public final j f87993d;

    /* renamed from: e, reason: collision with root package name */
    public final j f87994e;

    /* renamed from: f, reason: collision with root package name */
    public final j f87995f;

    /* renamed from: g, reason: collision with root package name */
    public final j f87996g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f87997h;

    public i(a aVar, a8.a aVar2, c8.j jVar) {
        this.f87991b = aVar;
        this.f87990a = aVar2;
        f fVarCreateAnimation = jVar.getColor().createAnimation();
        this.f87992c = fVarCreateAnimation;
        fVarCreateAnimation.addUpdateListener(this);
        aVar2.addAnimation(fVarCreateAnimation);
        j jVarCreateAnimation = jVar.getOpacity().createAnimation();
        this.f87993d = jVarCreateAnimation;
        jVarCreateAnimation.addUpdateListener(this);
        aVar2.addAnimation(jVarCreateAnimation);
        j jVarCreateAnimation2 = jVar.getDirection().createAnimation();
        this.f87994e = jVarCreateAnimation2;
        jVarCreateAnimation2.addUpdateListener(this);
        aVar2.addAnimation(jVarCreateAnimation2);
        j jVarCreateAnimation3 = jVar.getDistance().createAnimation();
        this.f87995f = jVarCreateAnimation3;
        jVarCreateAnimation3.addUpdateListener(this);
        aVar2.addAnimation(jVarCreateAnimation3);
        j jVarCreateAnimation4 = jVar.getRadius().createAnimation();
        this.f87996g = jVarCreateAnimation4;
        jVarCreateAnimation4.addUpdateListener(this);
        aVar2.addAnimation(jVarCreateAnimation4);
    }

    public e8.b evaluate(Matrix matrix, int i10) {
        float floatValue = this.f87994e.getFloatValue() * 0.017453292f;
        float fFloatValue = ((Float) this.f87995f.getValue()).floatValue();
        double d10 = floatValue;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f87996g.getValue()).floatValue();
        int iIntValue = ((Integer) this.f87992c.getValue()).intValue();
        e8.b bVar = new e8.b(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((((Float) this.f87993d.getValue()).floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        bVar.transformBy(matrix);
        if (this.f87997h == null) {
            this.f87997h = new Matrix();
        }
        this.f87990a.f4180x.getMatrix().invert(this.f87997h);
        bVar.transformBy(this.f87997h);
        return bVar;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f87991b.onValueChanged();
    }

    public void setColorCallback(f8.c cVar) {
        this.f87992c.setValueCallback(cVar);
    }

    public void setDirectionCallback(f8.c cVar) {
        this.f87994e.setValueCallback(cVar);
    }

    public void setDistanceCallback(f8.c cVar) {
        this.f87995f.setValueCallback(cVar);
    }

    public void setOpacityCallback(f8.c cVar) {
        j jVar = this.f87993d;
        if (cVar == null) {
            jVar.setValueCallback(null);
        } else {
            jVar.setValueCallback(new h(cVar));
        }
    }

    public void setRadiusCallback(f8.c cVar) {
        this.f87996g.setValueCallback(cVar);
    }
}
