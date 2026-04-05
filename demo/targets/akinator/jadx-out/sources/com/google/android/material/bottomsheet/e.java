package com.google.android.material.bottomsheet;

import ag.i;
import ag.j;
import ag.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.v0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.applovin.shadow.okio.Segment;
import com.digidust.elokence.akinator.freemium.R;
import x3.r2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class e extends v0 {

    /* renamed from: h, reason: collision with root package name */
    public BottomSheetBehavior f29026h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f29027i;

    /* renamed from: j, reason: collision with root package name */
    public CoordinatorLayout f29028j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f29029k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29030l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29031m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29032n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29033o;

    /* renamed from: p, reason: collision with root package name */
    public d f29034p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f29035q;

    /* renamed from: r, reason: collision with root package name */
    public sg.g f29036r;

    /* renamed from: s, reason: collision with root package name */
    public final c f29037s;

    public e(Context context) {
        this(context, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.f29035q = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Deprecated
    public static void setLightStatusBar(View view, boolean z10) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z10 ? systemUiVisibility | Segment.SIZE : systemUiVisibility & (-8193));
    }

    public final void c() {
        if (this.f29027i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f29027i = frameLayout;
            this.f29028j = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f29027i.findViewById(R.id.design_bottom_sheet);
            this.f29029k = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout2);
            this.f29026h = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.f29037s);
            this.f29026h.setHideable(this.f29031m);
            this.f29036r = new sg.g(this.f29026h, this.f29029k);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.f29030l || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    public final FrameLayout d(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f29027i.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f29035q) {
            z1.setOnApplyWindowInsetsListener(this.f29027i, new b(this));
        }
        this.f29029k.removeAllViews();
        if (layoutParams == null) {
            this.f29029k.addView(view);
        } else {
            this.f29029k.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new i(this));
        z1.setAccessibilityDelegate(this.f29029k, new j(this));
        this.f29029k.setOnTouchListener(new k());
        return this.f29027i;
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.f29026h == null) {
            c();
        }
        return this.f29026h;
    }

    public boolean getDismissWithAnimation() {
        return this.f29030l;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.f29035q;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f29035q && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f29027i;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f29028j;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            r2.setDecorFitsSystemWindows(window, !z10);
            d dVar = this.f29034p;
            if (dVar != null) {
                dVar.c(window);
            }
        }
        sg.g gVar = this.f29036r;
        if (gVar == null) {
            return;
        }
        if (this.f29031m) {
            gVar.startListeningForBackCallbacks();
        } else {
            gVar.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.appcompat.app.v0, f.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        d dVar = this.f29034p;
        if (dVar != null) {
            dVar.c(null);
        }
        sg.g gVar = this.f29036r;
        if (gVar != null) {
            gVar.stopListeningForBackCallbacks();
        }
    }

    @Override // f.m, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f29026h;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.f29026h.setState(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        sg.g gVar;
        super.setCancelable(z10);
        if (this.f29031m != z10) {
            this.f29031m = z10;
            BottomSheetBehavior bottomSheetBehavior = this.f29026h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z10);
            }
            if (getWindow() == null || (gVar = this.f29036r) == null) {
                return;
            }
            if (this.f29031m) {
                gVar.startListeningForBackCallbacks();
            } else {
                gVar.stopListeningForBackCallbacks();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f29031m) {
            this.f29031m = true;
        }
        this.f29032n = z10;
        this.f29033o = true;
    }

    @Override // androidx.appcompat.app.v0, f.m, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(d(null, i10, null));
    }

    public void setDismissWithAnimation(boolean z10) {
        this.f29030l = z10;
    }

    @Override // androidx.appcompat.app.v0, f.m, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(d(view, 0, null));
    }

    @Override // androidx.appcompat.app.v0, f.m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(d(view, 0, layoutParams));
    }

    public e(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            i10 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i10);
        this.f29031m = true;
        this.f29032n = true;
        this.f29037s = new c(this);
        supportRequestWindowFeature(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.f29035q = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
