package k3;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f70194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f70195c;

    public j(Application application, l lVar) {
        this.f70194b = application;
        this.f70195c = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f70194b.unregisterActivityLifecycleCallbacks(this.f70195c);
    }
}
