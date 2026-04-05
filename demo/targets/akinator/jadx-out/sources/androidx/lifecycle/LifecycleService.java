package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class LifecycleService extends Service implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final z2 f6512b = new z2(this);

    @Override // androidx.lifecycle.b1, v5.j, f.i0
    public k0 getLifecycle() {
        return this.f6512b.getLifecycle();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "intent");
        this.f6512b.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f6512b.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f6512b.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    @tu.f
    public void onStart(Intent intent, int i10) {
        this.f6512b.onServicePreSuperOnStart();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
