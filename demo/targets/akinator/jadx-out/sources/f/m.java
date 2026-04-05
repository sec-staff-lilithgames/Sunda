package f;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.b1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m extends Dialog implements b1, i0, v5.j {

    /* renamed from: b, reason: collision with root package name */
    public d1 f55237b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.i f55238c;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f55239e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        this(context, 0, 2, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    public static void a(m mVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.b1, v5.j, f.i0
    public androidx.lifecycle.k0 getLifecycle() {
        d1 d1Var = this.f55237b;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(this);
        this.f55237b = d1Var2;
        return d1Var2;
    }

    @Override // f.i0
    public final d0 getOnBackPressedDispatcher() {
        return this.f55239e;
    }

    @Override // v5.j
    public v5.h getSavedStateRegistry() {
        return this.f55238c.getSavedStateRegistry();
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        kotlin.jvm.internal.e0.checkNotNull(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        o3.set(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.e0.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        m0.set(decorView2, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.e0.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        v5.n.set(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f55239e.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f55239e.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        }
        this.f55238c.performRestore(bundle);
        d1 d1Var = this.f55237b;
        if (d1Var == null) {
            d1Var = new d1(this);
            this.f55237b = d1Var;
        }
        d1Var.handleLifecycleEvent(androidx.lifecycle.i0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f55238c.performSave(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        d1 d1Var = this.f55237b;
        if (d1Var == null) {
            d1Var = new d1(this);
            this.f55237b = d1Var;
        }
        d1Var.handleLifecycleEvent(androidx.lifecycle.i0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d1 d1Var = this.f55237b;
        if (d1Var == null) {
            d1Var = new d1(this);
            this.f55237b = d1Var;
        }
        d1Var.handleLifecycleEvent(androidx.lifecycle.i0.ON_DESTROY);
        this.f55237b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        super.setContentView(i10);
    }

    public /* synthetic */ m(Context context, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f55238c = v5.i.f89043c.create(this);
        this.f55239e = new d0(new com.unity3d.services.banners.view.a(this, 14));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
