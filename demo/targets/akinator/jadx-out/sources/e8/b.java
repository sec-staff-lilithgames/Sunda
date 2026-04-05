package e8;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import e8.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public float f53913a;

    /* renamed from: b, reason: collision with root package name */
    public float f53914b;

    /* renamed from: c, reason: collision with root package name */
    public float f53915c;

    /* renamed from: d, reason: collision with root package name */
    public int f53916d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f53917e;

    public b() {
        this.f53913a = 0.0f;
        this.f53914b = 0.0f;
        this.f53915c = 0.0f;
        this.f53916d = 0;
    }

    public void applyTo(Paint paint) {
        if (Color.alpha(this.f53916d) > 0) {
            paint.setShadowLayer(Math.max(this.f53913a, Float.MIN_VALUE), this.f53914b, this.f53915c, this.f53916d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void applyWithAlpha(int i10, Paint paint) {
        int iMixOpacities = n.mixOpacities(Color.alpha(this.f53916d), j.clamp(i10, 0, 255));
        if (iMixOpacities <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f53913a, Float.MIN_VALUE), this.f53914b, this.f53915c, Color.argb(iMixOpacities, Color.red(this.f53916d), Color.green(this.f53916d), Color.blue(this.f53916d)));
        }
    }

    public int getColor() {
        return this.f53916d;
    }

    public float getDx() {
        return this.f53914b;
    }

    public float getDy() {
        return this.f53915c;
    }

    public float getRadius() {
        return this.f53913a;
    }

    public void multiplyOpacity(int i10) {
        this.f53916d = Color.argb(Math.round((j.clamp(i10, 0, 255) * Color.alpha(this.f53916d)) / 255.0f), Color.red(this.f53916d), Color.green(this.f53916d), Color.blue(this.f53916d));
    }

    public boolean sameAs(b bVar) {
        return this.f53913a == bVar.f53913a && this.f53914b == bVar.f53914b && this.f53915c == bVar.f53915c && this.f53916d == bVar.f53916d;
    }

    public void setColor(int i10) {
        this.f53916d = i10;
    }

    public void setDx(float f10) {
        this.f53914b = f10;
    }

    public void setDy(float f10) {
        this.f53915c = f10;
    }

    public void setRadius(float f10) {
        this.f53913a = f10;
    }

    public void transformBy(Matrix matrix) {
        if (this.f53917e == null) {
            this.f53917e = new float[2];
        }
        float[] fArr = this.f53917e;
        fArr[0] = this.f53914b;
        fArr[1] = this.f53915c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f53917e;
        this.f53914b = fArr2[0];
        this.f53915c = fArr2[1];
        this.f53913a = matrix.mapRadius(this.f53913a);
    }

    public void applyTo(k.a aVar) {
        if (Color.alpha(this.f53916d) > 0) {
            aVar.f53969b = this;
        } else {
            aVar.f53969b = null;
        }
    }

    public void applyWithAlpha(int i10, k.a aVar) {
        b bVar = new b(this);
        aVar.f53969b = bVar;
        bVar.multiplyOpacity(i10);
    }

    public b(float f10, float f11, float f12, int i10) {
        this.f53913a = f10;
        this.f53914b = f11;
        this.f53915c = f12;
        this.f53916d = i10;
        this.f53917e = null;
    }

    public b(b bVar) {
        this.f53913a = 0.0f;
        this.f53914b = 0.0f;
        this.f53915c = 0.0f;
        this.f53916d = 0;
        this.f53913a = bVar.f53913a;
        this.f53914b = bVar.f53914b;
        this.f53915c = bVar.f53915c;
        this.f53916d = bVar.f53916d;
        this.f53917e = null;
    }
}
