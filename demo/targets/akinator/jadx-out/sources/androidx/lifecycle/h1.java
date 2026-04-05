package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f6589b;

    public h1(l1 l1Var) {
        this.f6589b = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        synchronized (this.f6589b.f6649a) {
            obj = this.f6589b.f6654f;
            this.f6589b.f6654f = l1.f6648k;
        }
        this.f6589b.setValue(obj);
    }
}
