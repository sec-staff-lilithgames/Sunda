package com.moloco.sdk.publisher;

import android.widget.FrameLayout;
import com.moloco.sdk.publisher.MolocoAdError;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f47373c;

    public /* synthetic */ c(FrameLayout frameLayout, int i10) {
        this.f47372b = i10;
        this.f47373c = frameLayout;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        Banner banner = (Banner) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        switch (this.f47372b) {
            case 0:
                return MolocoSamplesKt.MolocoCreateMREC$lambda$4(this.f47373c, banner, adCreateError);
            case 1:
                return MolocoSamplesKt.MolocoCreateBanner$lambda$2(this.f47373c, banner, adCreateError);
            default:
                return MolocoSamplesKt.MolocoCreateBannerTablet$lambda$3(this.f47373c, banner, adCreateError);
        }
    }
}
