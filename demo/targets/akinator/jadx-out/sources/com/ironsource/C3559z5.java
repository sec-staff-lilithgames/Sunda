package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3559z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3559z5 f39348a = new C3559z5();

    private C3559z5() {
    }

    public static /* synthetic */ IronSourceError a(C3559z5 c3559z5, EnumC3195e8 enumC3195e8, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            ironSourceError = null;
        }
        return c3559z5.a(enumC3195e8, ironSourceError);
    }

    public final IronSourceError b() {
        return a(this, EnumC3195e8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError c() {
        return a(this, EnumC3195e8.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError d() {
        return a(this, EnumC3195e8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final IronSourceError e() {
        return a(this, EnumC3195e8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, EnumC3195e8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, EnumC3195e8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, EnumC3195e8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, EnumC3195e8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, EnumC3195e8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, EnumC3195e8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, EnumC3195e8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, EnumC3195e8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, EnumC3195e8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, EnumC3195e8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, EnumC3195e8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, EnumC3195e8.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, EnumC3195e8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, EnumC3195e8.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, EnumC3195e8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(EnumC3195e8 enumC3195e8, IronSourceError ironSourceError) {
        String strC;
        if (ironSourceError != null) {
            strC = enumC3195e8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            strC = enumC3195e8.c();
        }
        return new IronSourceError(enumC3195e8.b(), strC);
    }

    public final IronSourceError b(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        return a(EnumC3195e8.ISErrorLoadNetworkFailed, error);
    }

    public final IronSourceError c(String description) {
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        return a(EnumC3195e8.ISErrorLoadNetworkFailed, description);
    }

    public final IronSourceError d(String str) {
        return a(EnumC3195e8.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C3559z5 c3559z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c3559z5.b(str);
    }

    public final IronSourceError c(IronSourceError networkError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkError, "networkError");
        return a(EnumC3195e8.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ IronSourceError c(C3559z5 c3559z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c3559z5.d(str);
    }

    public final IronSourceError b(String str) {
        return a(EnumC3195e8.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(EnumC3195e8 enumC3195e8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC3195e8.c();
        }
        return new IronSourceError(enumC3195e8.b(), str);
    }

    public final IronSourceError a(IronSourceError networkError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkError, "networkError");
        return a(EnumC3195e8.ISErrorInitNetworkFailed, networkError);
    }

    public final IronSourceError a() {
        return a(this, EnumC3195e8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C3559z5 c3559z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c3559z5.a(str);
    }

    public final IronSourceError a(String str) {
        return a(EnumC3195e8.ISErrorBannerLoadNoConfig, str);
    }
}
