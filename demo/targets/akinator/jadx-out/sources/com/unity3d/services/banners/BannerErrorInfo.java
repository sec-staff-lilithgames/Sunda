package com.unity3d.services.banners;

import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class BannerErrorInfo {
    public BannerErrorCode errorCode;
    public String errorMessage;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.banners.BannerErrorInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        static {
            int[] iArr = new int[UnityAds.UnityAdsLoadError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = iArr;
            try {
                iArr[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[BannerErrorCode.values().length];
            $SwitchMap$com$unity3d$services$banners$BannerErrorCode = iArr2;
            try {
                iArr2[BannerErrorCode.NATIVE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public BannerErrorInfo(String str, BannerErrorCode bannerErrorCode) {
        this.errorCode = bannerErrorCode;
        this.errorMessage = str;
    }

    public static BannerErrorInfo fromLoadError(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new BannerErrorInfo(str, BannerErrorCode.NATIVE_ERROR) : i10 != 4 ? i10 != 5 ? new BannerErrorInfo(str, BannerErrorCode.UNKNOWN) : new BannerErrorInfo(str, BannerErrorCode.NO_FILL) : new BannerErrorInfo(str, BannerErrorCode.WEBVIEW_ERROR);
    }

    public UnityAds.UnityAdsLoadError toLoadError() {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[this.errorCode.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? UnityAds.UnityAdsLoadError.INTERNAL_ERROR : UnityAds.UnityAdsLoadError.INTERNAL_ERROR : UnityAds.UnityAdsLoadError.NO_FILL : UnityAds.UnityAdsLoadError.INVALID_ARGUMENT;
    }
}
