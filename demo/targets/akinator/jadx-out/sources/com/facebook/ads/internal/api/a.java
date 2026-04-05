package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements AdComponentViewParentApi {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdComponentFrameLayout f22986b;

    public a(AdComponentFrameLayout adComponentFrameLayout) {
        this.f22986b = adComponentFrameLayout;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i10, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void bringChildToFront(View view) {
        super/*android.view.ViewGroup*/.bringChildToFront(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onMeasure(int i10, int i11) {
        super/*android.widget.FrameLayout*/.onMeasure(i10, i11);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onVisibilityChanged(View view, int i10) {
        super/*android.view.View*/.onVisibilityChanged(view, i10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void onWindowFocusChanged(boolean z10) {
        super/*android.view.View*/.onWindowFocusChanged(z10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.view.View*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void setMeasuredDimension(int i10, int i11) {
        super/*android.view.View*/.setMeasuredDimension(i10, i11);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view) {
        super/*android.view.ViewGroup*/.addView(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i10) {
        super/*android.view.ViewGroup*/.addView(view, i10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i10, int i11) {
        super/*android.view.ViewGroup*/.addView(view, i10, i11);
    }
}
