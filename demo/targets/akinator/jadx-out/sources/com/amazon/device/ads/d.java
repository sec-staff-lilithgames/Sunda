package com.amazon.device.ads;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DTBAdMRAIDBannerController f12527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12529d;

    public /* synthetic */ d(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, ViewGroup viewGroup, boolean z10, int i10) {
        this.f12526a = i10;
        this.f12527b = dTBAdMRAIDBannerController;
        this.f12528c = viewGroup;
        this.f12529d = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12526a) {
            case 0:
                this.f12527b.lambda$moveExpandedToDefaultImpl$3(this.f12528c, this.f12529d, valueAnimator);
                break;
            default:
                this.f12527b.lambda$moveResizedToDefaultImpl$1(this.f12528c, this.f12529d, valueAnimator);
                break;
        }
    }
}
