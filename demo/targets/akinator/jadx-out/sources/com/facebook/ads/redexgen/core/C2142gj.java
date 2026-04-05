package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.ironsource.C3364ne;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.gj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2142gj extends AbstractC1418Nq implements S2SRewardedVideoAdExtendedListener {
    public static byte[] A02;
    public final C2155gw A00;
    public final C2145gm A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-57, -52, -46, -35, -61, -48, -48, -51, -48, -35, -63, -51, -62, -61, -35, -55, -61, -41, -73, -68, -62, -51, -64, -60, -51, -60, -73, -78, -77, -67, -51, -78, -61, -64, -81, -62, -73, -67, -68, -51, -71, -77, -57, 114, 117, 116, 109, -123, 111, 116, 124, 103, 114, 111, 106, 103, 122, 111, 117, 116, -123, 122, 111, 115, 107, -123, 113, 107, AbstractJsonLexerKt.TC_INVALID, -107, -106, -108, -95, -121, -108, -108, -111, -108, -95, -113, -121, -107, -107, -125, -119, -121, -95, -115, -121, -101};
    }

    public C2142gj(String str, InterfaceC1420Ns interfaceC1420Ns, C2155gw c2155gw, C2145gm c2145gm) {
        super(str, interfaceC1420Ns);
        this.A00 = c2155gw;
        this.A01 = c2145gm;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        super.A00.AED(2104, super.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(43, 26, 34), this.A00.A0F());
        bundle.putInt(A00(18, 25, 106), this.A01.A00);
        super.A00.AED(2100, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(69, 21, 62), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), adError.getErrorCode());
        super.A00.AED(2103, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        super.A00.AED(2105, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        super.A00.AED(3002, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        super.A00.AED(3001, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        super.A00.AED(2106, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        super.A00.AED(C3364ne.f37989h, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        super.A00.AED(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, super.A01, null);
    }
}
