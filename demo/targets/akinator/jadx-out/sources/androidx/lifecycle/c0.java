package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f6530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v5.h f6531c;

    public c0(v5.h hVar, k0 k0Var) {
        this.f6530b = k0Var;
        this.f6531c = hVar;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, i0 event) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (event == i0.ON_START) {
            this.f6530b.removeObserver(this);
            this.f6531c.runOnNextRecreation(b0.class);
        }
    }
}
