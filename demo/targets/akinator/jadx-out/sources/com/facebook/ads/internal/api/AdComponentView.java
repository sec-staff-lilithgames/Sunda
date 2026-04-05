package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface AdComponentView {
    void addView(View view);

    void addView(View view, int i10);

    void addView(View view, int i10, int i11);

    void addView(View view, int i10, ViewGroup.LayoutParams layoutParams);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z10);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
