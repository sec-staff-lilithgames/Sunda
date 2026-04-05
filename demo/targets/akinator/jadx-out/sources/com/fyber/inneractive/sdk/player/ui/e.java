package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e extends RelativeLayout implements m {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f26264a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26265b;

    /* renamed from: c, reason: collision with root package name */
    public s0 f26266c;

    /* renamed from: d, reason: collision with root package name */
    public UnitDisplayType f26267d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26268e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26269f;

    /* renamed from: g, reason: collision with root package name */
    public n f26270g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26271h;

    public e(Context context) {
        super(context, null, 0);
        this.f26264a = new g1();
        this.f26265b = 0;
        this.f26268e = false;
        this.f26269f = false;
        this.f26271h = false;
        this.f26265b = Math.min(com.fyber.inneractive.sdk.util.o.e(), com.fyber.inneractive.sdk.util.o.d());
    }

    public abstract void a(h1 h1Var, int i10, int i11);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean a() {
        return false;
    }

    public void c() {
        this.f26271h = true;
    }

    public void d() {
        this.f26271h = false;
    }

    public final void e() {
        boolean globalVisibleRect = isShown() && hasWindowFocus() && this.f26269f && !this.f26271h;
        if (globalVisibleRect) {
            globalVisibleRect = getGlobalVisibleRect(new Rect());
        }
        if (globalVisibleRect == this.f26268e || this.f26270g == null) {
            return;
        }
        IAlog.a("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(globalVisibleRect));
        this.f26268e = globalVisibleRect;
        this.f26270g.a(globalVisibleRect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f26269f));
        this.f26269f = true;
        n nVar = this.f26270g;
        if (nVar != null) {
            nVar.a();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f26269f));
        this.f26269f = false;
        n nVar = this.f26270g;
        if (nVar != null) {
            nVar.c();
        }
        e();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (equals(view)) {
            IAlog.a("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i10));
            e();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.a("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(new d(this, z10), 500L);
    }

    public void setListener(n nVar) {
        this.f26270g = nVar;
    }

    public void setUnitConfig(s0 s0Var) {
        this.f26266c = s0Var;
        r0 r0Var = (r0) s0Var;
        this.f26267d = r0Var.f23347e == null ? r0Var.f23348f.f23408j : UnitDisplayType.DEFAULT;
    }
}
