package com.moloco.sdk.internal;

import android.view.View;
import androidx.lifecycle.b1;
import androidx.lifecycle.d1;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.o3;
import kotlin.jvm.internal.e0;
import tu.x0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements com.moloco.sdk.internal.a, b1, v5.j {

    /* renamed from: b, reason: collision with root package name */
    public final d1 f45831b = new d1(this);

    /* renamed from: c, reason: collision with root package name */
    public final v5.i f45832c = v5.i.f89043c.create(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.b$b, reason: collision with other inner class name */
    public static final class ViewOnAttachStateChangeListenerC0364b implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f45833b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f45834c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f45835e;

        public ViewOnAttachStateChangeListenerC0364b(View view, b bVar, View view2) {
            this.f45833b = view;
            this.f45834c = bVar;
            this.f45835e = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            e0.checkNotNullParameter(view, "view");
            this.f45833b.removeOnAttachStateChangeListener(this);
            this.f45834c.f(this.f45835e);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            e0.checkNotNullParameter(view, "view");
        }
    }

    static {
        new a(null);
    }

    @Override // com.moloco.sdk.internal.a
    public void b(View view) {
        e0.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (e0.areEqual(v5.n.get(rootView), this)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "Removing ViewTreeSavedStateRegistryOwner", null, false, 12, null);
            v5.n.set(rootView, null);
        }
        if (e(rootView)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "Removing ViewTreeLifecycleOwner", null, false, 12, null);
            o3.set(rootView, null);
        }
    }

    @Override // com.moloco.sdk.internal.a
    public void c(View view) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        e0.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                int i10 = tu.z.f87419c;
                this.f45831b.handleLifecycleEvent(i0.ON_PAUSE);
                objM7131constructorimpl = tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle pause success " + tu.z.m7137isSuccessimpl(objM7131constructorimpl), tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl), false, 8, null);
        }
    }

    @Override // com.moloco.sdk.internal.a
    public void d(View view) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        e0.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                int i10 = tu.z.f87419c;
                this.f45831b.handleLifecycleEvent(i0.ON_RESUME);
                objM7131constructorimpl = tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            if (tu.z.m7137isSuccessimpl(objM7131constructorimpl)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume success", null, false, 12, null);
            }
            Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
            if (thM7134exceptionOrNullimpl != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume failure", thM7134exceptionOrNullimpl, false, 8, null);
            }
        }
    }

    public final boolean e(View view) {
        return e0.areEqual(o3.get(view), this);
    }

    public final void f(View view) {
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (v5.n.get(rootView) == null) {
            v5.n.set(rootView, this);
            try {
                int i10 = tu.z.f87419c;
                this.f45832c.performRestore(null);
                tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (o3.get(rootView) == null) {
            o3.set(rootView, this);
            i0 i0Var = i0.ON_CREATE;
            d1 d1Var = this.f45831b;
            d1Var.handleLifecycleEvent(i0Var);
            d1Var.handleLifecycleEvent(i0.ON_START);
            d1Var.handleLifecycleEvent(i0.ON_RESUME);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // androidx.lifecycle.b1, v5.j, f.i0
    public k0 getLifecycle() {
        return this.f45831b;
    }

    @Override // v5.j
    public v5.h getSavedStateRegistry() {
        return this.f45832c.getSavedStateRegistry();
    }

    @Override // com.moloco.sdk.internal.a
    public void a(View view) {
        e0.checkNotNullParameter(view, "view");
        com.moloco.sdk.internal.scheduling.e.a(new androidx.lifecycle.x0(1, view, this));
    }

    public static final x0 a(View view, b bVar) {
        if (z1.isAttachedToWindow(view)) {
            bVar.f(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0364b(view, bVar, view));
        }
        return x0.f87415a;
    }
}
