package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.j3;
import androidx.lifecycle.l3;
import androidx.lifecycle.m3;
import androidx.lifecycle.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r2 implements androidx.lifecycle.a0, v5.j, n3 {

    /* renamed from: b, reason: collision with root package name */
    public final Fragment f6446b;

    /* renamed from: c, reason: collision with root package name */
    public final m3 f6447c;

    /* renamed from: e, reason: collision with root package name */
    public l3 f6448e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.d1 f6449f = null;

    /* renamed from: g, reason: collision with root package name */
    public v5.i f6450g = null;

    public r2(Fragment fragment, m3 m3Var) {
        this.f6446b = fragment;
        this.f6447c = m3Var;
    }

    public final void a(androidx.lifecycle.i0 i0Var) {
        this.f6449f.handleLifecycleEvent(i0Var);
    }

    public final void b() {
        if (this.f6449f == null) {
            this.f6449f = new androidx.lifecycle.d1(this);
            v5.i iVarCreate = v5.i.create(this);
            this.f6450g = iVarCreate;
            iVarCreate.performAttach();
            androidx.lifecycle.t2.enableSavedStateHandles(this);
        }
    }

    @Override // androidx.lifecycle.a0
    public b5.a getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f6446b;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        b5.e eVar = new b5.e();
        if (application != null) {
            eVar.set(j3.a.f6628f, application);
        }
        eVar.set(androidx.lifecycle.t2.f6710a, this);
        eVar.set(androidx.lifecycle.t2.f6711b, this);
        if (fragment.getArguments() != null) {
            eVar.set(androidx.lifecycle.t2.f6712c, fragment.getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.a0
    public l3 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f6446b;
        l3 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f6448e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f6448e == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f6448e = new androidx.lifecycle.x2(application, this, fragment.getArguments());
        }
        return this.f6448e;
    }

    @Override // v5.j, f.i0
    public androidx.lifecycle.k0 getLifecycle() {
        b();
        return this.f6449f;
    }

    @Override // v5.j
    public v5.h getSavedStateRegistry() {
        b();
        return this.f6450g.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.n3
    public m3 getViewModelStore() {
        b();
        return this.f6447c;
    }
}
