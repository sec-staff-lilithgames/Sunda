package com.amazon.device.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DTBAdMRAIDController f12538c;

    public /* synthetic */ g(DTBAdMRAIDController dTBAdMRAIDController, int i10) {
        this.f12537b = i10;
        this.f12538c = dTBAdMRAIDController;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f12537b) {
            case 0:
                return this.f12538c.lambda$setCloseIndicatorContent$3(view, motionEvent);
            default:
                return ((DTBAdMRAIDExpandedController) this.f12538c).lambda$addCloseIndicator$0(view, motionEvent);
        }
    }
}
