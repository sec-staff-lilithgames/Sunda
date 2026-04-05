package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.w5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3052w5 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f33532a;

    public ViewTreeObserverOnGlobalLayoutListenerC3052w5(InMobiAudio inMobiAudio) {
        this.f33532a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            this.f33532a.f31544f = D2.b(r0.getMeasuredWidth() / AbstractC2679a4.b());
            this.f33532a.f31545g = D2.b(r0.getMeasuredHeight() / AbstractC2679a4.b());
            if (this.f33532a.b()) {
                this.f33532a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception unused) {
            AbstractC2902n7.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
        }
    }
}
