package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y4 implements ww.b {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f90242a;

    /* renamed from: b, reason: collision with root package name */
    public final ww.b f90243b;

    public y4(l0 l0Var, ww.b bVar) {
        this.f90242a = l0Var;
        this.f90243b = bVar;
    }

    @Override // ww.b
    public String replace(String str) {
        Object attribute = this.f90242a.getAttribute(str);
        return attribute != null ? attribute.toString() : this.f90243b.replace(str);
    }
}
