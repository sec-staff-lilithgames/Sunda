package n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public kv.a f75467a;

    public l(kotlin.jvm.internal.u uVar) {
    }

    public abstract void draw(l1.i iVar);

    public kv.a getInvalidateListener$ui_release() {
        return this.f75467a;
    }

    public final void invalidate() {
        kv.a invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke();
        }
    }

    public void setInvalidateListener$ui_release(kv.a aVar) {
        this.f75467a = aVar;
    }
}
