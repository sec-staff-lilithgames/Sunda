package n1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: b, reason: collision with root package name */
    public float[] f75275b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f75276c;

    /* renamed from: d, reason: collision with root package name */
    public List f75277d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f75278e;

    /* renamed from: f, reason: collision with root package name */
    public j1.l1 f75279f;

    /* renamed from: g, reason: collision with root package name */
    public j f75280g;

    /* renamed from: h, reason: collision with root package name */
    public kv.a f75281h;

    /* renamed from: i, reason: collision with root package name */
    public String f75282i;

    /* renamed from: j, reason: collision with root package name */
    public float f75283j;

    /* renamed from: k, reason: collision with root package name */
    public float f75284k;

    /* renamed from: l, reason: collision with root package name */
    public float f75285l;

    /* renamed from: m, reason: collision with root package name */
    public float f75286m;

    /* renamed from: n, reason: collision with root package name */
    public float f75287n;

    /* renamed from: o, reason: collision with root package name */
    public float f75288o;

    /* renamed from: p, reason: collision with root package name */
    public float f75289p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f75290q;

    public b() {
        super(null);
        this.f75276c = new ArrayList();
        this.f75277d = w0.getEmptyPath();
        this.f75278e = true;
        this.f75282i = "";
        this.f75286m = 1.0f;
        this.f75287n = 1.0f;
        this.f75290q = true;
    }

    @Override // n1.l
    public void draw(l1.i iVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        if (this.f75290q) {
            float[] fArrM4732constructorimpl$default = this.f75275b;
            if (fArrM4732constructorimpl$default == null) {
                fArrM4732constructorimpl$default = j1.e1.m4732constructorimpl$default(null, 1, null);
                this.f75275b = fArrM4732constructorimpl$default;
            } else {
                j1.e1.m4741resetimpl(fArrM4732constructorimpl$default);
            }
            float[] fArr = fArrM4732constructorimpl$default;
            j1.e1.m4752translateimpl$default(fArr, this.f75284k + this.f75288o, this.f75285l + this.f75289p, 0.0f, 4, null);
            j1.e1.m4744rotateZimpl(fArr, this.f75283j);
            j1.e1.m4745scaleimpl(fArr, this.f75286m, this.f75287n, 1.0f);
            j1.e1.m4752translateimpl$default(fArr, -this.f75284k, -this.f75285l, 0.0f, 4, null);
            this.f75290q = false;
        }
        if (this.f75278e) {
            if (!this.f75277d.isEmpty()) {
                j jVar = this.f75280g;
                if (jVar == null) {
                    jVar = new j();
                    this.f75280g = jVar;
                } else {
                    jVar.clear();
                }
                j1.l1 l1VarPath = this.f75279f;
                if (l1VarPath == null) {
                    l1VarPath = j1.p.Path();
                    this.f75279f = l1VarPath;
                } else {
                    l1VarPath.reset();
                }
                jVar.addPathNodes(this.f75277d).toPath(l1VarPath);
            }
            this.f75278e = false;
        }
        l1.b bVar = (l1.b) iVar.getDrawContext();
        long jMo5320getSizeNHjbRc = bVar.mo5320getSizeNHjbRc();
        bVar.getCanvas().save();
        l1.k transform = bVar.getTransform();
        float[] fArr2 = this.f75275b;
        if (fArr2 != null) {
            ((l1.c) transform).mo5328transform58bKbWc(j1.e1.m4730boximpl(fArr2).m4753unboximpl());
        }
        j1.l1 l1Var = this.f75279f;
        if (!this.f75277d.isEmpty() && l1Var != null) {
            l1.k.m5415clipPathmtrdDE$default(transform, l1Var, 0, 2, null);
        }
        ArrayList arrayList = this.f75276c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) arrayList.get(i10)).draw(iVar);
        }
        bVar.getCanvas().restore();
        bVar.mo5321setSizeuvyYCjk(jMo5320getSizeNHjbRc);
    }

    public final List<g> getClipPathData() {
        return this.f75277d;
    }

    @Override // n1.l
    public kv.a getInvalidateListener$ui_release() {
        return this.f75281h;
    }

    public final String getName() {
        return this.f75282i;
    }

    public final int getNumChildren() {
        return this.f75276c.size();
    }

    public final float getPivotX() {
        return this.f75284k;
    }

    public final float getPivotY() {
        return this.f75285l;
    }

    public final float getRotation() {
        return this.f75283j;
    }

    public final float getScaleX() {
        return this.f75286m;
    }

    public final float getScaleY() {
        return this.f75287n;
    }

    public final float getTranslationX() {
        return this.f75288o;
    }

    public final float getTranslationY() {
        return this.f75289p;
    }

    public final void insertAt(int i10, l instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        int numChildren = getNumChildren();
        ArrayList arrayList = this.f75276c;
        if (i10 < numChildren) {
            arrayList.set(i10, instance);
        } else {
            arrayList.add(instance);
        }
        instance.setInvalidateListener$ui_release(getInvalidateListener$ui_release());
        invalidate();
    }

    public final void move(int i10, int i11, int i12) {
        int i13 = 0;
        ArrayList arrayList = this.f75276c;
        if (i10 > i11) {
            while (i13 < i12) {
                l lVar = (l) arrayList.get(i10);
                arrayList.remove(i10);
                arrayList.add(i11, lVar);
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                l lVar2 = (l) arrayList.get(i10);
                arrayList.remove(i10);
                arrayList.add(i11 - 1, lVar2);
                i13++;
            }
        }
        invalidate();
    }

    public final void remove(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ArrayList arrayList = this.f75276c;
            if (i10 < arrayList.size()) {
                ((l) arrayList.get(i10)).setInvalidateListener$ui_release(null);
                arrayList.remove(i10);
            }
        }
        invalidate();
    }

    public final void setClipPathData(List<? extends g> value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f75277d = value;
        this.f75278e = true;
        invalidate();
    }

    @Override // n1.l
    public void setInvalidateListener$ui_release(kv.a aVar) {
        this.f75281h = aVar;
        ArrayList arrayList = this.f75276c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) arrayList.get(i10)).setInvalidateListener$ui_release(aVar);
        }
    }

    public final void setName(String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f75282i = value;
        invalidate();
    }

    public final void setPivotX(float f10) {
        this.f75284k = f10;
        this.f75290q = true;
        invalidate();
    }

    public final void setPivotY(float f10) {
        this.f75285l = f10;
        this.f75290q = true;
        invalidate();
    }

    public final void setRotation(float f10) {
        this.f75283j = f10;
        this.f75290q = true;
        invalidate();
    }

    public final void setScaleX(float f10) {
        this.f75286m = f10;
        this.f75290q = true;
        invalidate();
    }

    public final void setScaleY(float f10) {
        this.f75287n = f10;
        this.f75290q = true;
        invalidate();
    }

    public final void setTranslationX(float f10) {
        this.f75288o = f10;
        this.f75290q = true;
        invalidate();
    }

    public final void setTranslationY(float f10) {
        this.f75289p = f10;
        this.f75290q = true;
        invalidate();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f75282i);
        ArrayList arrayList = this.f75276c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(lVar.toString());
            sb2.append("\n");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
