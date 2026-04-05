package io.odeeo.internal.i1;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f64337a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f64338b = new AtomicBoolean(false);

    public void initialize() {
        this.f64337a.set(true);
    }

    public boolean isInitialized() {
        return this.f64337a.get();
    }

    public boolean isInitializedOrLock() {
        return this.f64337a.get() || this.f64338b.get();
    }

    public void lockInit() {
        this.f64338b.set(true);
    }

    public abstract void onBeforeInit(Context context);

    public void onInitializationFailed(int i10, String errorMessage) {
        e0.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public void unlockInit() {
        this.f64338b.set(false);
    }

    public void onInitializationSucceed() {
    }
}
