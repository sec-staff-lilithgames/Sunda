package f;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.b1;
import androidx.lifecycle.v0;
import java.util.Iterator;
import java.util.ListIterator;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f55206a;

    /* renamed from: b, reason: collision with root package name */
    public final w3.b f55207b;

    /* renamed from: c, reason: collision with root package name */
    public final uu.u f55208c;

    /* renamed from: d, reason: collision with root package name */
    public x f55209d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f55210e;

    /* renamed from: f, reason: collision with root package name */
    public OnBackInvokedDispatcher f55211f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f55212g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f55213h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements v0, d {

        /* renamed from: b, reason: collision with root package name */
        public final androidx.lifecycle.k0 f55214b;

        /* renamed from: c, reason: collision with root package name */
        public final x f55215c;

        /* renamed from: e, reason: collision with root package name */
        public d f55216e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d0 f55217f;

        public a(d0 d0Var, androidx.lifecycle.k0 lifecycle, x onBackPressedCallback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(lifecycle, "lifecycle");
            kotlin.jvm.internal.e0.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f55217f = d0Var;
            this.f55214b = lifecycle;
            this.f55215c = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // f.d
        public void cancel() {
            this.f55214b.removeObserver(this);
            this.f55215c.removeCancellable(this);
            d dVar = this.f55216e;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f55216e = null;
        }

        @Override // androidx.lifecycle.v0
        public void onStateChanged(b1 source, androidx.lifecycle.i0 event) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            if (event == androidx.lifecycle.i0.ON_START) {
                this.f55216e = this.f55217f.addCancellableCallback$activity_release(this.f55215c);
                return;
            }
            if (event != androidx.lifecycle.i0.ON_STOP) {
                if (event == androidx.lifecycle.i0.ON_DESTROY) {
                    cancel();
                }
            } else {
                d dVar = this.f55216e;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements d {

        /* renamed from: b, reason: collision with root package name */
        public final x f55218b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f55219c;

        public b(d0 d0Var, x onBackPressedCallback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f55219c = d0Var;
            this.f55218b = onBackPressedCallback;
        }

        @Override // f.d
        public void cancel() {
            d0 d0Var = this.f55219c;
            uu.u uVar = d0Var.f55208c;
            x xVar = this.f55218b;
            uVar.remove(xVar);
            if (kotlin.jvm.internal.e0.areEqual(d0Var.f55209d, xVar)) {
                xVar.handleOnBackCancelled();
                d0Var.f55209d = null;
            }
            xVar.removeCancellable(this);
            kv.a enabledChangedCallback$activity_release = xVar.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            xVar.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        x xVarPrevious;
        x xVar = this.f55209d;
        if (xVar == null) {
            uu.u uVar = this.f55208c;
            ListIterator listIterator = uVar.listIterator(uVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    xVarPrevious = 0;
                    break;
                } else {
                    xVarPrevious = listIterator.previous();
                    if (((x) xVarPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            xVar = xVarPrevious;
        }
        this.f55209d = null;
        if (xVar != null) {
            xVar.handleOnBackCancelled();
        }
    }

    public final void addCallback(x onBackPressedCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final d addCancellableCallback$activity_release(x onBackPressedCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f55208c.add(onBackPressedCallback);
        b bVar = new b(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(bVar);
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new f0(0, this, d0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void b(c cVar) {
        x xVarPrevious;
        x xVar = this.f55209d;
        if (xVar == null) {
            uu.u uVar = this.f55208c;
            ListIterator listIterator = uVar.listIterator(uVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    xVarPrevious = 0;
                    break;
                } else {
                    xVarPrevious = listIterator.previous();
                    if (((x) xVarPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            xVar = xVarPrevious;
        }
        if (xVar != null) {
            xVar.handleOnBackProgressed(cVar);
        }
    }

    public final void c(c cVar) {
        Object objPrevious;
        uu.u uVar = this.f55208c;
        ListIterator<E> listIterator = uVar.listIterator(uVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((x) objPrevious).isEnabled()) {
                    break;
                }
            }
        }
        x xVar = (x) objPrevious;
        if (this.f55209d != null) {
            a();
        }
        this.f55209d = xVar;
        if (xVar != null) {
            xVar.handleOnBackStarted(cVar);
        }
    }

    public final void d(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f55211f;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f55210e) == null) {
            return;
        }
        a0 a0Var = a0.f55194a;
        if (z10 && !this.f55212g) {
            a0Var.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f55212g = true;
        } else {
            if (z10 || !this.f55212g) {
                return;
            }
            a0Var.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f55212g = false;
        }
    }

    public final void dispatchOnBackCancelled() {
        a();
    }

    public final void dispatchOnBackProgressed(c backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        b(backEvent);
    }

    public final void dispatchOnBackStarted(c backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        c(backEvent);
    }

    public final void e() {
        boolean z10 = this.f55213h;
        boolean z11 = false;
        uu.u uVar = this.f55208c;
        if (uVar == null || !uVar.isEmpty()) {
            Iterator<E> it = uVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((x) it.next()).isEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f55213h = z11;
        if (z11 != z10) {
            w3.b bVar = this.f55207b;
            if (bVar != null) {
                bVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                d(z11);
            }
        }
    }

    public final boolean hasEnabledCallbacks() {
        return this.f55213h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void onBackPressed() {
        x xVarPrevious;
        x xVar = this.f55209d;
        if (xVar == null) {
            uu.u uVar = this.f55208c;
            ListIterator listIterator = uVar.listIterator(uVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    xVarPrevious = 0;
                    break;
                } else {
                    xVarPrevious = listIterator.previous();
                    if (((x) xVarPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            xVar = xVarPrevious;
        }
        this.f55209d = null;
        if (xVar != null) {
            xVar.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f55206a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.e0.checkNotNullParameter(invoker, "invoker");
        this.f55211f = invoker;
        d(this.f55213h);
    }

    public d0(Runnable runnable, w3.b bVar) {
        OnBackInvokedCallback onBackInvokedCallbackCreateOnBackInvokedCallback;
        this.f55206a = runnable;
        this.f55207b = bVar;
        this.f55208c = new uu.u();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                final int i11 = 0;
                final int i12 = 1;
                final int i13 = 0;
                final int i14 = 1;
                onBackInvokedCallbackCreateOnBackInvokedCallback = c0.f55205a.createOnBackAnimationCallback(new kv.l(this) { // from class: f.y

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d0 f55254c;

                    {
                        this.f55254c = this;
                    }

                    @Override // kv.l
                    public final Object invoke(Object obj) {
                        c backEvent = (c) obj;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
                                this.f55254c.c(backEvent);
                                break;
                            default:
                                kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
                                this.f55254c.b(backEvent);
                                break;
                        }
                        return x0.f87415a;
                    }
                }, new kv.l(this) { // from class: f.y

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d0 f55254c;

                    {
                        this.f55254c = this;
                    }

                    @Override // kv.l
                    public final Object invoke(Object obj) {
                        c backEvent = (c) obj;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
                                this.f55254c.c(backEvent);
                                break;
                            default:
                                kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
                                this.f55254c.b(backEvent);
                                break;
                        }
                        return x0.f87415a;
                    }
                }, new kv.a(this) { // from class: f.z

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d0 f55256c;

                    {
                        this.f55256c = this;
                    }

                    @Override // kv.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                this.f55256c.onBackPressed();
                                break;
                            case 1:
                                this.f55256c.a();
                                break;
                            default:
                                this.f55256c.onBackPressed();
                                break;
                        }
                        return x0.f87415a;
                    }
                }, new kv.a(this) { // from class: f.z

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d0 f55256c;

                    {
                        this.f55256c = this;
                    }

                    @Override // kv.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                this.f55256c.onBackPressed();
                                break;
                            case 1:
                                this.f55256c.a();
                                break;
                            default:
                                this.f55256c.onBackPressed();
                                break;
                        }
                        return x0.f87415a;
                    }
                });
            } else {
                final int i15 = 2;
                onBackInvokedCallbackCreateOnBackInvokedCallback = a0.f55194a.createOnBackInvokedCallback(new kv.a(this) { // from class: f.z

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d0 f55256c;

                    {
                        this.f55256c = this;
                    }

                    @Override // kv.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                this.f55256c.onBackPressed();
                                break;
                            case 1:
                                this.f55256c.a();
                                break;
                            default:
                                this.f55256c.onBackPressed();
                                break;
                        }
                        return x0.f87415a;
                    }
                });
            }
            this.f55210e = onBackInvokedCallbackCreateOnBackInvokedCallback;
        }
    }

    public final void addCallback(b1 owner, x onBackPressedCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.k0 lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == androidx.lifecycle.j0.f6614b) {
            return;
        }
        onBackPressedCallback.addCancellable(new a(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new e0(0, this, d0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
    }

    public /* synthetic */ d0(Runnable runnable, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : runnable);
    }

    public d0(Runnable runnable) {
        this(runnable, null);
    }
}
