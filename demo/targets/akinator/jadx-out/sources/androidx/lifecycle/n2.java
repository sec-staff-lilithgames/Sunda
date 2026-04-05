package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final v2 f6681b;

    public n2(v2 provider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
        this.f6681b = provider;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (event == i0.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            this.f6681b.performRestore();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
