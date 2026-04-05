package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final h3 f98650b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98651c;

    public i3(h3 h3Var, mt.y yVar) {
        this.f98650b = h3Var;
        this.f98651c = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98651c.subscribe(this.f98650b);
    }
}
