package f6;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f55398a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f55399b;

    /* renamed from: c, reason: collision with root package name */
    public float f55400c;

    /* renamed from: d, reason: collision with root package name */
    public float f55401d;

    /* renamed from: e, reason: collision with root package name */
    public float f55402e;

    /* renamed from: f, reason: collision with root package name */
    public float f55403f;

    /* renamed from: g, reason: collision with root package name */
    public float f55404g;

    /* renamed from: h, reason: collision with root package name */
    public float f55405h;

    /* renamed from: i, reason: collision with root package name */
    public float f55406i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f55407j;

    /* renamed from: k, reason: collision with root package name */
    public String f55408k;

    public q() {
        this.f55398a = new Matrix();
        this.f55399b = new ArrayList();
        this.f55400c = 0.0f;
        this.f55401d = 0.0f;
        this.f55402e = 0.0f;
        this.f55403f = 1.0f;
        this.f55404g = 1.0f;
        this.f55405h = 0.0f;
        this.f55406i = 0.0f;
        this.f55407j = new Matrix();
        this.f55408k = null;
    }

    public final void a() {
        Matrix matrix = this.f55407j;
        matrix.reset();
        matrix.postTranslate(-this.f55401d, -this.f55402e);
        matrix.postScale(this.f55403f, this.f55404g);
        matrix.postRotate(this.f55400c, 0.0f, 0.0f);
        matrix.postTranslate(this.f55405h + this.f55401d, this.f55406i + this.f55402e);
    }

    public String getGroupName() {
        return this.f55408k;
    }

    public Matrix getLocalMatrix() {
        return this.f55407j;
    }

    public float getPivotX() {
        return this.f55401d;
    }

    public float getPivotY() {
        return this.f55402e;
    }

    public float getRotation() {
        return this.f55400c;
    }

    public float getScaleX() {
        return this.f55403f;
    }

    public float getScaleY() {
        return this.f55404g;
    }

    public float getTranslateX() {
        return this.f55405h;
    }

    public float getTranslateY() {
        return this.f55406i;
    }

    public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = n3.q.obtainAttributes(resources, theme, attributeSet, a.f55360b);
        this.f55400c = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "rotation", 5, this.f55400c);
        this.f55401d = typedArrayObtainAttributes.getFloat(1, this.f55401d);
        this.f55402e = typedArrayObtainAttributes.getFloat(2, this.f55402e);
        this.f55403f = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "scaleX", 3, this.f55403f);
        this.f55404g = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "scaleY", 4, this.f55404g);
        this.f55405h = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "translateX", 6, this.f55405h);
        this.f55406i = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "translateY", 7, this.f55406i);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f55408k = string;
        }
        a();
        typedArrayObtainAttributes.recycle();
    }

    @Override // f6.r
    public boolean isStateful() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f55399b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((r) arrayList.get(i10)).isStateful()) {
                return true;
            }
            i10++;
        }
    }

    @Override // f6.r
    public boolean onStateChanged(int[] iArr) {
        int i10 = 0;
        boolean zOnStateChanged = false;
        while (true) {
            ArrayList arrayList = this.f55399b;
            if (i10 >= arrayList.size()) {
                return zOnStateChanged;
            }
            zOnStateChanged |= ((r) arrayList.get(i10)).onStateChanged(iArr);
            i10++;
        }
    }

    public void setPivotX(float f10) {
        if (f10 != this.f55401d) {
            this.f55401d = f10;
            a();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f55402e) {
            this.f55402e = f10;
            a();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f55400c) {
            this.f55400c = f10;
            a();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f55403f) {
            this.f55403f = f10;
            a();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f55404g) {
            this.f55404g = f10;
            a();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f55405h) {
            this.f55405h = f10;
            a();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f55406i) {
            this.f55406i = f10;
            a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(q qVar, z.f fVar) {
        o oVar;
        this.f55398a = new Matrix();
        this.f55399b = new ArrayList();
        this.f55400c = 0.0f;
        this.f55401d = 0.0f;
        this.f55402e = 0.0f;
        this.f55403f = 1.0f;
        this.f55404g = 1.0f;
        this.f55405h = 0.0f;
        this.f55406i = 0.0f;
        Matrix matrix = new Matrix();
        this.f55407j = matrix;
        this.f55408k = null;
        this.f55400c = qVar.f55400c;
        this.f55401d = qVar.f55401d;
        this.f55402e = qVar.f55402e;
        this.f55403f = qVar.f55403f;
        this.f55404g = qVar.f55404g;
        this.f55405h = qVar.f55405h;
        this.f55406i = qVar.f55406i;
        String str = qVar.f55408k;
        this.f55408k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(qVar.f55407j);
        ArrayList arrayList = qVar.f55399b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof q) {
                this.f55399b.add(new q((q) obj, fVar));
            } else {
                if (obj instanceof p) {
                    p pVar = (p) obj;
                    p pVar2 = new p(pVar);
                    pVar2.f55388e = 0.0f;
                    pVar2.f55390g = 1.0f;
                    pVar2.f55391h = 1.0f;
                    pVar2.f55392i = 0.0f;
                    pVar2.f55393j = 1.0f;
                    pVar2.f55394k = 0.0f;
                    pVar2.f55395l = Paint.Cap.BUTT;
                    pVar2.f55396m = Paint.Join.MITER;
                    pVar2.f55397n = 4.0f;
                    pVar2.f55387d = pVar.f55387d;
                    pVar2.f55388e = pVar.f55388e;
                    pVar2.f55390g = pVar.f55390g;
                    pVar2.f55389f = pVar.f55389f;
                    pVar2.f55411c = pVar.f55411c;
                    pVar2.f55391h = pVar.f55391h;
                    pVar2.f55392i = pVar.f55392i;
                    pVar2.f55393j = pVar.f55393j;
                    pVar2.f55394k = pVar.f55394k;
                    pVar2.f55395l = pVar.f55395l;
                    pVar2.f55396m = pVar.f55396m;
                    pVar2.f55397n = pVar.f55397n;
                    oVar = pVar2;
                } else if (obj instanceof o) {
                    oVar = new o((o) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f55399b.add(oVar);
                Object obj2 = oVar.f55410b;
                if (obj2 != null) {
                    fVar.put(obj2, oVar);
                }
            }
        }
    }
}
