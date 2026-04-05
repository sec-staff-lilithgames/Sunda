package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import qg.t0;
import x3.e3;
import x3.r2;
import yg.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d extends BottomSheetBehavior.a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f29022a;

    /* renamed from: b, reason: collision with root package name */
    public final e3 f29023b;

    /* renamed from: c, reason: collision with root package name */
    public Window f29024c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29025d;

    public d(View view, e3 e3Var) {
        this.f29023b = e3Var;
        j jVar = BottomSheetBehavior.from(view).f29000l;
        ColorStateList fillColor = jVar != null ? jVar.getFillColor() : view.getBackgroundTintList();
        if (fillColor != null) {
            this.f29022a = Boolean.valueOf(jg.b.isColorLight(fillColor.getDefaultColor()));
            return;
        }
        Integer backgroundColor = t0.getBackgroundColor(view);
        if (backgroundColor != null) {
            this.f29022a = Boolean.valueOf(jg.b.isColorLight(backgroundColor.intValue()));
        } else {
            this.f29022a = null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void a(View view) {
        b(view);
    }

    public final void b(View view) {
        int top = view.getTop();
        e3 e3Var = this.f29023b;
        if (top < e3Var.getSystemWindowInsetTop()) {
            Window window = this.f29024c;
            if (window != null) {
                Boolean bool = this.f29022a;
                qg.j.setLightStatusBar(window, bool == null ? this.f29025d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), e3Var.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f29024c;
            if (window2 != null) {
                qg.j.setLightStatusBar(window2, this.f29025d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void c(Window window) {
        if (this.f29024c == window) {
            return;
        }
        this.f29024c = window;
        if (window != null) {
            this.f29025d = r2.getInsetsController(window, window.getDecorView()).isAppearanceLightStatusBars();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public void onSlide(View view, float f10) {
        b(view);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public void onStateChanged(View view, int i10) {
        b(view);
    }
}
