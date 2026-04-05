package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class RK implements NativeAdApi {
    public static String[] A02 = {"Qf6uI4y6btMkRXvA96gvAPpQqYMeMLVQ", "xsH0pc0gEvMtYCBpu3k37P2MSYje76", "eIeN", "vYRtnf0lNdhCyq", "4", "0cPKH6qR821KJSq9ovGwsT1tt", "LdRpqMhVSgJGWZUoheR2iPgR57uht61Q", "hYjvJgOs8spNmgMi7B8jHFIGUAKFh9RM"};
    public final NativeAd A00;
    public final NativeAdBaseApi A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, List<View> list) {
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }

    public RK(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
        C1480Qc.A0L(nativeAdBaseApi).A1b(V6.A06);
    }

    public RK(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
    }

    private C1480Qc A00() {
        return C1480Qc.A0L(this.A01);
    }

    public final String A01() {
        return A00().A1G();
    }

    public final String A02() {
        return A00().A1H();
    }

    public final List<NativeAd> A03() {
        if (A00().A1I() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1480Qc internalNativeAd : A00().A1I()) {
            arrayList.add(new NativeAd(internalNativeAd.A12(), internalNativeAd));
        }
        return arrayList;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final NativeAd.AdCreativeType getAdCreativeType() {
        if (!TextUtils.isEmpty(A00().A1H())) {
            return NativeAd.AdCreativeType.VIDEO;
        }
        if (A00().A1I() != null && !A00().A1I().isEmpty()) {
            return NativeAd.AdCreativeType.CAROUSEL;
        }
        if (A00().getAdCoverImage() != null && !TextUtils.isEmpty(A00().getAdCoverImage().getUrl())) {
            NativeAd.AdCreativeType adCreativeType = NativeAd.AdCreativeType.IMAGE;
            if (A02[1].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "KhCZfMyUHPJBMWXSGegcdmWrt";
            strArr[3] = "8FosuavNBsKEQf";
            return adCreativeType;
        }
        return NativeAd.AdCreativeType.UNKNOWN;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return EnumC1600Uu.A00(A00().A19());
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (MediaView) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, ImageView imageView, List<View> clickableViews) {
        if (imageView != null) {
            C1937dL c1937dLA12 = A00().A12();
            C1937dL downloadContext = RB.A03(imageView.getContext());
            downloadContext.A0L(c1937dLA12);
            C1480Qc.A0k(A00().getAdIcon(), imageView, downloadContext);
        }
        registerViewForInteraction(view, mediaView, (MediaView) null, clickableViews);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, MediaView mediaView2) {
        registerViewForInteraction(view, mediaView, mediaView2, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, MediaView mediaView2, List<View> list) {
        if (mediaView != null) {
            ((C2081fh) mediaView.getMediaViewApi()).A0L(this.A00);
        }
        if (mediaView2 != null) {
            ((C2081fh) mediaView2.getMediaViewApi()).A0M(this.A01, false);
        }
        if (list != null) {
            A00().A1P(view, mediaView, list);
            return;
        }
        C1480Qc c1480QcA00 = A00();
        String[] strArr = A02;
        if (strArr[0].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        A02[4] = "Y8dslRp9uWVtvGXxjU2U0Td790Xm7bcp";
        c1480QcA00.A1O(view, mediaView);
    }
}
