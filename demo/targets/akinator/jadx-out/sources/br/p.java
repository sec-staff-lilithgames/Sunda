package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final float f9967a;

    /* renamed from: b, reason: collision with root package name */
    public final q f9968b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f9969c;

    public p(float f10, q qVar, n1 n1Var) {
        this.f9967a = f10;
        this.f9968b = qVar;
        this.f9969c = n1Var;
    }

    public final float getOpacity() {
        return this.f9967a;
    }

    public final n1 getPlaceholder() {
        return this.f9969c;
    }

    public final q getSource() {
        return this.f9968b;
    }

    public /* synthetic */ p(float f10, q qVar, n1 n1Var, int i10, kotlin.jvm.internal.u uVar) {
        this(f10, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? null : n1Var);
    }
}
