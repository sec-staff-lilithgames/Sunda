package n1;

import p0.j2;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends l {

    /* renamed from: b, reason: collision with root package name */
    public final b f75481b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f75482c;

    /* renamed from: d, reason: collision with root package name */
    public final a f75483d;

    /* renamed from: e, reason: collision with root package name */
    public kv.a f75484e;

    /* renamed from: f, reason: collision with root package name */
    public final j2 f75485f;

    /* renamed from: g, reason: collision with root package name */
    public float f75486g;

    /* renamed from: h, reason: collision with root package name */
    public float f75487h;

    /* renamed from: i, reason: collision with root package name */
    public long f75488i;

    /* renamed from: j, reason: collision with root package name */
    public final n f75489j;

    public q() {
        super(null);
        b bVar = new b();
        bVar.setPivotX(0.0f);
        bVar.setPivotY(0.0f);
        bVar.setInvalidateListener$ui_release(new p(this));
        this.f75481b = bVar;
        this.f75482c = true;
        this.f75483d = new a();
        this.f75484e = o.f75475e;
        this.f75485f = o5.mutableStateOf$default(null, null, 2, null);
        this.f75488i = i1.o.f59366b.m4238getUnspecifiedNHjbRc();
        this.f75489j = new n(this);
    }

    public static final void access$doInvalidate(q qVar) {
        qVar.f75482c = true;
        qVar.f75484e.invoke();
    }

    public final void draw(l1.i iVar, float f10, j1.n0 n0Var) {
        l1.i iVar2;
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        if (n0Var == null) {
            n0Var = getIntrinsicColorFilter$ui_release();
        }
        if (this.f75482c || !i1.o.m4248equalsimpl0(this.f75488i, iVar.mo5314getSizeNHjbRc())) {
            float fM4252getWidthimpl = i1.o.m4252getWidthimpl(iVar.mo5314getSizeNHjbRc()) / this.f75486g;
            b bVar = this.f75481b;
            bVar.setScaleX(fM4252getWidthimpl);
            bVar.setScaleY(i1.o.m4249getHeightimpl(iVar.mo5314getSizeNHjbRc()) / this.f75487h);
            iVar2 = iVar;
            this.f75483d.m5707drawCachedImageCJJARo(s2.w.IntSize((int) Math.ceil(i1.o.m4252getWidthimpl(iVar.mo5314getSizeNHjbRc())), (int) Math.ceil(i1.o.m4249getHeightimpl(iVar.mo5314getSizeNHjbRc()))), iVar2, iVar.getLayoutDirection(), this.f75489j);
            this.f75482c = false;
            this.f75488i = iVar2.mo5314getSizeNHjbRc();
        } else {
            iVar2 = iVar;
        }
        this.f75483d.drawInto(iVar2, f10, n0Var);
    }

    public final j1.n0 getIntrinsicColorFilter$ui_release() {
        return (j1.n0) this.f75485f.getValue();
    }

    public final kv.a getInvalidateCallback$ui_release() {
        return this.f75484e;
    }

    public final String getName() {
        return this.f75481b.getName();
    }

    public final b getRoot() {
        return this.f75481b;
    }

    public final float getViewportHeight() {
        return this.f75487h;
    }

    public final float getViewportWidth() {
        return this.f75486g;
    }

    public final void setIntrinsicColorFilter$ui_release(j1.n0 n0Var) {
        this.f75485f.setValue(n0Var);
    }

    public final void setInvalidateCallback$ui_release(kv.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
        this.f75484e = aVar;
    }

    public final void setName(String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f75481b.setName(value);
    }

    public final void setViewportHeight(float f10) {
        if (this.f75487h == f10) {
            return;
        }
        this.f75487h = f10;
        this.f75482c = true;
        this.f75484e.invoke();
    }

    public final void setViewportWidth(float f10) {
        if (this.f75486g == f10) {
            return;
        }
        this.f75486g = f10;
        this.f75482c = true;
        this.f75484e.invoke();
    }

    public String toString() {
        String str = "Params: \tname: " + getName() + "\n\tviewportWidth: " + this.f75486g + "\n\tviewportHeight: " + this.f75487h + "\n";
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Override // n1.l
    public void draw(l1.i iVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        draw(iVar, 1.0f, null);
    }
}
