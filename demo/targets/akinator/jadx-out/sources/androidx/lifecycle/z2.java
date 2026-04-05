package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f6749a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6750b;

    /* renamed from: c, reason: collision with root package name */
    public a f6751c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final d1 f6752b;

        /* renamed from: c, reason: collision with root package name */
        public final i0 f6753c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6754e;

        public a(d1 registry, i0 event) {
            kotlin.jvm.internal.e0.checkNotNullParameter(registry, "registry");
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            this.f6752b = registry;
            this.f6753c = event;
        }

        public final i0 getEvent() {
            return this.f6753c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6754e) {
                return;
            }
            this.f6752b.handleLifecycleEvent(this.f6753c);
            this.f6754e = true;
        }
    }

    public z2(b1 provider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
        this.f6749a = new d1(provider);
        this.f6750b = new Handler();
    }

    public final void a(i0 i0Var) {
        a aVar = this.f6751c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f6749a, i0Var);
        this.f6751c = aVar2;
        kotlin.jvm.internal.e0.checkNotNull(aVar2);
        this.f6750b.postAtFrontOfQueue(aVar2);
    }

    public k0 getLifecycle() {
        return this.f6749a;
    }

    public void onServicePreSuperOnBind() {
        a(i0.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        a(i0.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        a(i0.ON_STOP);
        a(i0.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        a(i0.ON_START);
    }
}
