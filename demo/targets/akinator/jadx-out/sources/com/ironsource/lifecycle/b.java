package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC3322la;
import com.ironsource.InterfaceC3304ka;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private static final b f37183m = new b();

    /* renamed from: n, reason: collision with root package name */
    private static AtomicBoolean f37184n = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    static final long f37185o = 700;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f37192g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f37193h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f37194i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f37195j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f37196k;

    /* renamed from: a, reason: collision with root package name */
    private int f37186a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f37187b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37188c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37189d = true;

    /* renamed from: e, reason: collision with root package name */
    private EnumC3322la f37190e = EnumC3322la.NONE;

    /* renamed from: f, reason: collision with root package name */
    private final List<InterfaceC3304ka> f37191f = new CopyOnWriteArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final a.InterfaceC0233a f37197l = new a();

    public b() {
        final int i10 = 0;
        this.f37192g = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f37200c;

            {
                this.f37200c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f37200c.f();
                        break;
                    case 1:
                        this.f37200c.g();
                        break;
                    case 2:
                        this.f37200c.h();
                        break;
                    case 3:
                        this.f37200c.i();
                        break;
                    default:
                        this.f37200c.j();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f37193h = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f37200c;

            {
                this.f37200c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f37200c.f();
                        break;
                    case 1:
                        this.f37200c.g();
                        break;
                    case 2:
                        this.f37200c.h();
                        break;
                    case 3:
                        this.f37200c.i();
                        break;
                    default:
                        this.f37200c.j();
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f37194i = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f37200c;

            {
                this.f37200c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f37200c.f();
                        break;
                    case 1:
                        this.f37200c.g();
                        break;
                    case 2:
                        this.f37200c.h();
                        break;
                    case 3:
                        this.f37200c.i();
                        break;
                    default:
                        this.f37200c.j();
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f37195j = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f37200c;

            {
                this.f37200c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f37200c.f();
                        break;
                    case 1:
                        this.f37200c.g();
                        break;
                    case 2:
                        this.f37200c.h();
                        break;
                    case 3:
                        this.f37200c.i();
                        break;
                    default:
                        this.f37200c.j();
                        break;
                }
            }
        };
        final int i14 = 4;
        this.f37196k = new Runnable(this) { // from class: com.ironsource.lifecycle.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f37200c;

            {
                this.f37200c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.f37200c.f();
                        break;
                    case 1:
                        this.f37200c.g();
                        break;
                    case 2:
                        this.f37200c.h();
                        break;
                    case 3:
                        this.f37200c.i();
                        break;
                    default:
                        this.f37200c.j();
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC3304ka> it = this.f37191f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC3304ka> it = this.f37191f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC3304ka> it = this.f37191f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC3304ka> it = this.f37191f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a aVarA = com.ironsource.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.f37197l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    public static b d() {
        return f37183m;
    }

    public void a(InterfaceC3304ka interfaceC3304ka) {
        if (!IronsourceLifecycleProvider.a() || interfaceC3304ka == null || this.f37191f.contains(interfaceC3304ka)) {
            return;
        }
        this.f37191f.add(interfaceC3304ka);
    }

    public void b(InterfaceC3304ka interfaceC3304ka) {
        if (this.f37191f.contains(interfaceC3304ka)) {
            this.f37191f.remove(interfaceC3304ka);
        }
    }

    public EnumC3322la c() {
        return this.f37190e;
    }

    public boolean e() {
        return this.f37190e == EnumC3322la.STOPPED;
    }

    public void c(Activity activity) {
        int i10 = this.f37186a + 1;
        this.f37186a = i10;
        if (i10 == 1 && this.f37189d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f37196k);
            this.f37189d = false;
            this.f37190e = EnumC3322la.STARTED;
        }
    }

    public void d(Activity activity) {
        this.f37186a--;
        b();
    }

    public void b(Activity activity) {
        int i10 = this.f37187b + 1;
        this.f37187b = i10;
        if (i10 == 1) {
            if (this.f37188c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f37195j);
                this.f37188c = false;
                this.f37190e = EnumC3322la.RESUMED;
                return;
            }
            IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f37192g);
        }
    }

    public void a(Context context) {
        Application application;
        if (!f37184n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(Activity activity) {
        int i10 = this.f37187b - 1;
        this.f37187b = i10;
        if (i10 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f37192g, f37185o);
        }
    }

    private void a() {
        if (this.f37187b == 0) {
            this.f37188c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f37193h);
            this.f37190e = EnumC3322la.PAUSED;
        }
    }

    private void b() {
        if (this.f37186a == 0 && this.f37188c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f37194i);
            this.f37189d = true;
            this.f37190e = EnumC3322la.STOPPED;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements a.InterfaceC0233a {
        public a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0233a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0233a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0233a
        public void b(Activity activity) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
