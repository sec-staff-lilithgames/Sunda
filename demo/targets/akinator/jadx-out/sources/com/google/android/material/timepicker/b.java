package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f29572b;

    public b(ClockFaceView clockFaceView) {
        this.f29572b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f29572b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        clockFaceView.setRadius(((clockFaceView.getHeight() / 2) - clockFaceView.f29526f.getSelectorRadius()) - clockFaceView.f29534n);
        return true;
    }
}
