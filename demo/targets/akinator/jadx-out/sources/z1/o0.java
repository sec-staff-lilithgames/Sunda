package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: b, reason: collision with root package name */
    public final u0 f97366b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.v f97367c;

    /* renamed from: e, reason: collision with root package name */
    public o0 f97368e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97369f;

    public o0(u0 layoutNodeWrapper, e1.v modifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        this.f97366b = layoutNodeWrapper;
        this.f97367c = modifier;
    }

    public final b0 getLayoutNode() {
        return this.f97366b.getLayoutNode$ui_release();
    }

    public final u0 getLayoutNodeWrapper() {
        return this.f97366b;
    }

    public final e1.v getModifier() {
        return this.f97367c;
    }

    public final o0 getNext() {
        return this.f97368e;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m8050getSizeYbymL2g() {
        return this.f97366b.mo7827getSizeYbymL2g();
    }

    public final boolean isAttached() {
        return this.f97369f;
    }

    public void onAttach() {
        this.f97369f = true;
    }

    public void onDetach() {
        this.f97369f = false;
    }

    public final void setNext(o0 o0Var) {
        this.f97368e = o0Var;
    }
}
