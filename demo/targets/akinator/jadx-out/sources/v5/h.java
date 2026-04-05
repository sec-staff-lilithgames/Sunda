package v5;

import android.os.Bundle;
import kotlin.jvm.internal.e0;
import v5.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final w5.a f89041a;

    /* renamed from: b, reason: collision with root package name */
    public a.b f89042b;

    public h(w5.a impl) {
        e0.checkNotNullParameter(impl, "impl");
        this.f89041a = impl;
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        e0.checkNotNullParameter(key, "key");
        return this.f89041a.consumeRestoredStateForKey(key);
    }

    public final g getSavedStateProvider(String key) {
        e0.checkNotNullParameter(key, "key");
        return this.f89041a.getSavedStateProvider(key);
    }

    public final boolean isRestored() {
        return this.f89041a.isRestored();
    }

    public final void registerSavedStateProvider(String key, g provider) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(provider, "provider");
        this.f89041a.registerSavedStateProvider(key, provider);
    }

    public final void runOnNextRecreation(Class<? extends f> clazz) throws NoSuchMethodException, SecurityException {
        e0.checkNotNullParameter(clazz, "clazz");
        if (!this.f89041a.isAllowingSavingState$savedstate_release()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a.b bVar = this.f89042b;
        if (bVar == null) {
            bVar = new a.b(this);
        }
        this.f89042b = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            a.b bVar2 = this.f89042b;
            if (bVar2 != null) {
                String name = clazz.getName();
                e0.checkNotNullExpressionValue(name, "getName(...)");
                bVar2.add(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void unregisterSavedStateProvider(String key) {
        e0.checkNotNullParameter(key, "key");
        this.f89041a.unregisterSavedStateProvider(key);
    }
}
