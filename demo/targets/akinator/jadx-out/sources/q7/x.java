package q7;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x implements ComponentCallbacks2, k7.g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f82563b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f82564c;

    /* renamed from: e, reason: collision with root package name */
    public final k7.h f82565e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f82566f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f82567g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public x(a7.q qVar, Context context, boolean z10) {
        k7.h eVar;
        this.f82563b = context;
        this.f82564c = new WeakReference(qVar);
        if (z10) {
            qVar.getLogger();
            eVar = k7.i.NetworkObserver(context, this, null);
        } else {
            eVar = new k7.e();
        }
        this.f82565e = eVar;
        this.f82566f = eVar.isOnline();
        this.f82567g = new AtomicBoolean(false);
    }

    public final WeakReference<a7.q> getImageLoader$coil_base_release() {
        return this.f82564c;
    }

    public final boolean isOnline() {
        return this.f82566f;
    }

    public final boolean isShutdown() {
        return this.f82567g.get();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (((a7.q) this.f82564c.get()) == null) {
            shutdown();
        }
    }

    @Override // k7.g
    public void onConnectivityChange(boolean z10) {
        x0 x0Var;
        a7.q qVar = (a7.q) this.f82564c.get();
        if (qVar != null) {
            qVar.getLogger();
            this.f82566f = z10;
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            shutdown();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        x0 x0Var;
        a7.q qVar = (a7.q) this.f82564c.get();
        if (qVar != null) {
            qVar.getLogger();
            qVar.onTrimMemory$coil_base_release(i10);
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            shutdown();
        }
    }

    public final void register() {
        this.f82563b.registerComponentCallbacks(this);
    }

    public final void shutdown() {
        if (this.f82567g.getAndSet(true)) {
            return;
        }
        this.f82563b.unregisterComponentCallbacks(this);
        this.f82565e.shutdown();
    }

    public static /* synthetic */ void getImageLoader$coil_base_release$annotations() {
    }
}
