package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 implements v0, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final String f6690b;

    /* renamed from: c, reason: collision with root package name */
    public final m2 f6691c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6692e;

    public o2(String key, m2 handle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(handle, "handle");
        this.f6690b = key;
        this.f6691c = handle;
    }

    public final void attachToLifecycle(v5.h registry, k0 lifecycle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(registry, "registry");
        kotlin.jvm.internal.e0.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f6692e) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f6692e = true;
        lifecycle.addObserver(this);
        registry.registerSavedStateProvider(this.f6690b, this.f6691c.savedStateProvider());
    }

    public final m2 getHandle() {
        return this.f6691c;
    }

    public final boolean isAttached() {
        return this.f6692e;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (event == i0.ON_DESTROY) {
            this.f6692e = false;
            source.getLifecycle().removeObserver(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
