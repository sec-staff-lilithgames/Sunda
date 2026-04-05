package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Ve extends H0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Ue f32399h = new Ue();

    /* renamed from: i, reason: collision with root package name */
    private static final String f32400i = "Ve";

    /* renamed from: j, reason: collision with root package name */
    public static final String f32401j = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ";

    /* renamed from: k, reason: collision with root package name */
    public static final String f32402k = "Ad show is already called. Please wait for the the ad to be shown.";

    /* renamed from: l, reason: collision with root package name */
    public static final String f32403l = "preload() and load() cannot be called on the same instance, please use a different instance.";

    /* renamed from: m, reason: collision with root package name */
    public static final String f32404m = "Please make an ad request first in order to start loading the ad.";

    /* renamed from: n, reason: collision with root package name */
    public static final String f32405n = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ";

    /* renamed from: a, reason: collision with root package name */
    private byte f32406a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f32407b;

    /* renamed from: c, reason: collision with root package name */
    private PublisherCallbacks f32408c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f32409d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private AdMetaInfo f32410e;

    /* renamed from: f, reason: collision with root package name */
    private F5 f32411f;

    /* renamed from: g, reason: collision with root package name */
    private WatermarkData f32412g;

    public static /* synthetic */ void r() {
    }

    public final void a(byte b10) {
        this.f32406a = b10;
    }

    public final void b(PublisherCallbacks publisherCallbacks) {
        this.f32408c = publisherCallbacks;
    }

    @Override // com.inmobi.media.H0
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdLoadSucceeded " + this);
        }
        this.f32410e = info;
        U0 u0J = j();
        if (u0J != null) {
            u0J.b((byte) 1);
        }
    }

    public final void d(AdMetaInfo adMetaInfo) {
        this.f32410e = adMetaInfo;
    }

    @Override // com.inmobi.media.H0
    public void e() {
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdWillShow " + this);
        }
        byte b10 = this.f32406a;
        if (b10 == 4 || b10 == 5) {
            return;
        }
        this.f32409d.post(new zk.e0(this, 0));
        F5 f53 = this.f32411f;
        if (f53 != null) {
            String TAG2 = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).d(TAG2, "AdManager state - WILL_DISPLAY");
        }
        this.f32406a = (byte) 4;
    }

    @Override // com.inmobi.media.H0
    public void h() {
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onUserLeftApplication " + this);
        }
        this.f32409d.post(new zk.e0(this, 2));
    }

    public abstract U0 j();

    public final JSONObject k() {
        JSONObject bidInfo;
        AdMetaInfo adMetaInfo = this.f32410e;
        return (adMetaInfo == null || (bidInfo = adMetaInfo.getBidInfo()) == null) ? new JSONObject() : bidInfo;
    }

    public final PublisherCallbacks l() {
        return this.f32408c;
    }

    public final String m() {
        String creativeID;
        AdMetaInfo adMetaInfo = this.f32410e;
        return (adMetaInfo == null || (creativeID = adMetaInfo.getCreativeID()) == null) ? "" : creativeID;
    }

    public final AdMetaInfo n() {
        return this.f32410e;
    }

    public final byte o() {
        return v() ? (byte) 2 : (byte) 1;
    }

    public final F5 p() {
        return this.f32411f;
    }

    public final byte q() {
        return this.f32406a;
    }

    public final Handler s() {
        return this.f32409d;
    }

    public final WatermarkData t() {
        return this.f32412g;
    }

    public final Boolean u() {
        return this.f32407b;
    }

    public final boolean v() {
        PublisherCallbacks publisherCallbacks = this.f32408c;
        return publisherCallbacks != null && publisherCallbacks.getType() == 1;
    }

    public void w() {
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "submitAdLoadCalled " + this);
        }
        U0 u0J = j();
        if (u0J != null) {
            u0J.u0();
        }
    }

    public final void a(Boolean bool) {
        this.f32407b = bool;
    }

    public final void b(WatermarkData watermarkData) {
        this.f32412g = watermarkData;
    }

    public final void a(F5 f52) {
        this.f32411f = f52;
    }

    public final void b(U0 u02, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onLoadFailure " + this);
        }
        F5 f53 = this.f32411f;
        if (f53 != null) {
            String TAG2 = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).d(TAG2, "AdManager state - LOAD_FAILED");
        }
        this.f32406a = (byte) 3;
        this.f32409d.post(new io.bidmachine.media3.exoplayer.b1(u02, 24, this, status));
    }

    public static final void a(U0 u02, Ve this$0, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "$status");
        if (u02 != null) {
            u02.b((byte) 1);
        }
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(status);
        }
        F5 f53 = this$0.f32411f;
        if (f53 != null) {
            ((G5) f53).a();
        }
    }

    public static final void c(Ve this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    @Override // com.inmobi.media.H0
    public void b(AdMetaInfo info) {
        U0 u0J;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdFetchSuccess " + this);
        }
        F5 f53 = this.f32411f;
        if (f53 != null) {
            String TAG2 = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).d(TAG2, "AdManager state - FETCHED");
        }
        this.f32406a = (byte) 7;
        if (!v() || (u0J = j()) == null) {
            return;
        }
        u0J.b((byte) 2);
    }

    @Override // com.inmobi.media.H0
    public void a(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdFetchFailed " + this);
        }
        this.f32406a = (byte) 3;
        this.f32409d.post(new zk.d0(this, status, 0));
    }

    public static final void a(Ve this$0, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "$status");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(status);
        }
        F5 f53 = this$0.f32411f;
        if (f53 != null) {
            ((G5) f53).a();
        }
    }

    public static final void b(Ve this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.H0
    public void a(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdDisplayed " + this);
        }
        if (this.f32406a != 5) {
            this.f32410e = info;
            this.f32409d.post(new zk.n(14, this, info));
            F5 f53 = this.f32411f;
            if (f53 != null) {
                String TAG2 = f32400i;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).d(TAG2, "AdManager state - DISPLAYED");
            }
            this.f32406a = (byte) 5;
        }
    }

    @Override // com.inmobi.media.H0
    public void b(Map<Object, ? extends Object> rewards) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "rewards");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdRewardActionCompleted " + this);
        }
        this.f32409d.post(new zk.c0(this, rewards, 1));
    }

    public static final void b(Ve this$0, Map rewards) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "$rewards");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(rewards);
        }
    }

    @Override // com.inmobi.media.H0
    public void b(InMobiAdRequestStatus reason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onRequestCreationFailed " + this);
        }
        this.f32409d.post(new zk.d0(this, reason, 1));
    }

    public static final void a(Ve this$0, AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(info);
        }
    }

    public static final void b(Ve this$0, InMobiAdRequestStatus reason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "$reason");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onRequestPayloadCreationFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRequestPayloadCreationFailed(reason);
        }
        F5 f53 = this$0.f32411f;
        if (f53 != null) {
            ((G5) f53).a();
        }
    }

    @Override // com.inmobi.media.H0
    public void a(U0 u02, InMobiAdRequestStatus inMobiAdRequestStatus) {
        kotlin.jvm.internal.e0.checkNotNullParameter(inMobiAdRequestStatus, NyKZx.ycZ);
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdLoadFailed " + this);
        }
        b(u02, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.H0
    public void b() {
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdDismissed " + this);
        }
        this.f32409d.post(new zk.e0(this, 1));
        F5 f53 = this.f32411f;
        if (f53 != null) {
            ((G5) f53).a();
        }
    }

    @Override // com.inmobi.media.H0
    public void a(Map<Object, ? extends Object> params) {
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdInteraction " + this);
        }
        this.f32409d.post(new zk.c0(this, params, 0));
    }

    public static final void a(Ve this$0, Map params) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "$params");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(params);
        }
    }

    public final void a(PublisherCallbacks callbacks) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callbacks, "callbacks");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "getSignals " + this);
        }
        if (j() != null) {
            U0 u0J = j();
            if (u0J != null) {
                u0J.z0();
            }
            this.f32408c = callbacks;
            U0 u0J2 = j();
            if (u0J2 != null) {
                u0J2.Q();
            }
        }
    }

    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        U0 u0J;
        U0 u0J2;
        kotlin.jvm.internal.e0.checkNotNullParameter(callbacks, "callbacks");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "load " + this);
        }
        if (kotlin.jvm.internal.e0.areEqual(this.f32407b, Boolean.TRUE)) {
            AbstractC2902n7.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            F5 f53 = this.f32411f;
            if (f53 != null) {
                String TAG2 = f32400i;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).a(TAG2, "Cannot call load(byte[]) API after load() API is called");
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            U0 u0J3 = j();
            if (u0J3 != null) {
                u0J3.a((short) 2140);
                return;
            }
            return;
        }
        this.f32407b = Boolean.FALSE;
        this.f32406a = (byte) 1;
        F5 f54 = this.f32411f;
        if (f54 != null && (u0J2 = j()) != null) {
            u0J2.a(f54);
        }
        if (j() == null || (u0J = j()) == null || !u0J.e((byte) 1)) {
            return;
        }
        F5 f55 = this.f32411f;
        if (f55 != null) {
            String TAG3 = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
            ((G5) f55).a(TAG3, "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.f32408c = callbacks;
        U0 u0J4 = j();
        if (u0J4 != null) {
            u0J4.a(bArr);
        }
    }

    @Override // com.inmobi.media.H0
    public void a(byte[] request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onRequestCreated " + this);
        }
        this.f32409d.post(new zk.n(18, this, request));
    }

    public static final void a(Ve this$0, byte[] request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "$request");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onRequestPayloadCreated");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRequestPayloadCreated(request);
        }
        F5 f53 = this$0.f32411f;
        if (f53 != null) {
            ((G5) f53).a();
        }
    }

    public void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(watermarkData, "watermarkData");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String str = f32400i;
            StringBuilder sbA = N6.a(str, "TAG", "setWatermark - ");
            sbA.append(watermarkData.getWatermarkBase64EncodedString());
            ((G5) f52).c(str, sbA.toString());
        }
        this.f32412g = watermarkData;
    }

    public final boolean a(String tag, String placementString, PublisherCallbacks publisherCallbacks) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(placementString, "placementString");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            ((G5) f52).c(tag, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.f32408c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, f32403l);
            F5 f53 = this.f32411f;
            if (f53 != null) {
                ((G5) f53).b(tag, f32403l);
            }
            U0 u0J = j();
            if (u0J != null) {
                u0J.a((short) 2005);
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b10 = this.f32406a;
        if (b10 == 8) {
            AbstractC2902n7.a((byte) 1, tag, f32405n + placementString);
            F5 f54 = this.f32411f;
            if (f54 != null) {
                ((G5) f54).b(tag, AbstractC2811i0.a(f32405n, placementString));
            }
            U0 u0J2 = j();
            if (u0J2 != null) {
                u0J2.a((short) 2002);
            }
        } else if (b10 == 1) {
            AbstractC2902n7.a((byte) 1, tag, f32405n + placementString);
            F5 f55 = this.f32411f;
            if (f55 != null) {
                ((G5) f55).b(tag, AbstractC2811i0.a(f32405n, placementString));
            }
            U0 u0J3 = j();
            if (u0J3 != null) {
                u0J3.a((short) 2001);
            }
        } else {
            if (b10 != 5) {
                return true;
            }
            AbstractC2902n7.a((byte) 1, tag, f32401j + placementString);
            F5 f56 = this.f32411f;
            if (f56 != null) {
                ((G5) f56).b(tag, AbstractC2811i0.a(f32401j, placementString));
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            U0 u0J4 = j();
            if (u0J4 != null) {
                u0J4.b((short) 2003);
            }
        }
        return false;
    }

    public final boolean a(String tag, String placementString) throws IllegalStateException {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(placementString, "placementString");
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "canRender " + this);
        }
        byte b10 = this.f32406a;
        if (b10 == 1) {
            AbstractC2902n7.a((byte) 1, tag, f32405n + placementString);
            F5 f53 = this.f32411f;
            if (f53 != null) {
                String TAG2 = f32400i;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).b(TAG2, "adload in progress");
            }
            U0 u0J = j();
            if (u0J != null) {
                u0J.b((short) 2129);
            }
        } else {
            if (b10 != 8) {
                if (b10 != 5) {
                    if (b10 == 7) {
                        return true;
                    }
                    F5 f54 = this.f32411f;
                    if (f54 != null) {
                        String TAG3 = f32400i;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                        ((G5) f54).b(TAG3, "ad in illegal state");
                    }
                    U0 u0J2 = j();
                    if (u0J2 != null) {
                        u0J2.b((short) 2165);
                    }
                    U0 u0J3 = j();
                    if (u0J3 != null) {
                        u0J3.n0();
                    }
                    b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    throw new IllegalStateException(f32404m);
                }
                AbstractC2902n7.a((byte) 1, tag, f32401j + placementString);
                F5 f55 = this.f32411f;
                if (f55 != null) {
                    String TAG4 = f32400i;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
                    ((G5) f55).b(TAG4, "ad active before renderAd");
                }
                U0 u0J4 = j();
                if (u0J4 != null) {
                    u0J4.b((short) 2130);
                }
                U0 u0J5 = j();
                if (u0J5 != null) {
                    u0J5.n0();
                }
                b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                return false;
            }
            AbstractC2902n7.a((byte) 1, tag, f32405n + placementString);
            F5 f56 = this.f32411f;
            if (f56 != null) {
                String TAG5 = f32400i;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG5, "TAG");
                ((G5) f56).b(TAG5, "ad loading into view is in progress");
            }
            U0 u0J6 = j();
            if (u0J6 != null) {
                u0J6.b((short) 2164);
            }
        }
        return false;
    }

    public static final void a(Ve this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        F5 f53 = this$0.f32411f;
        if (f53 != null) {
            String TAG2 = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).b(TAG2, "callback is null");
        }
    }

    @Override // com.inmobi.media.H0
    public void a(C3078xe c3078xe) {
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onAdImpression " + this);
        }
        this.f32409d.post(new zk.n(16, this, c3078xe));
    }

    public static final void a(Ve this$0, C3078xe c3078xe) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (this$0.f32408c == null) {
            F5 f52 = this$0.f32411f;
            if (f52 != null) {
                String TAG = f32400i;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).b(TAG, "callback is null");
            }
            if (c3078xe != null) {
                c3078xe.c();
                return;
            }
            return;
        }
        F5 f53 = this$0.f32411f;
        if (f53 != null) {
            String TAG2 = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c3078xe);
        }
    }

    @Override // com.inmobi.media.H0
    public void a(F1 audioStatusInternal) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        this.f32409d.post(new zk.n(17, this, audioStatusInternal));
    }

    public static final void a(Ve this$0, F1 audioStatusInternal) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(audioStatusInternal, "$audioStatusInternal");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String str = f32400i;
            StringBuilder sbA = N6.a(str, "TAG", "callback - onAudioStatusChanged - ");
            sbA.append(audioStatusInternal.f31766a);
            ((G5) f52).a(str, sbA.toString());
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(audioStatusInternal);
        }
    }

    @Override // com.inmobi.media.H0
    public void a(String log) {
        kotlin.jvm.internal.e0.checkNotNullParameter(log, "log");
        this.f32409d.post(new zk.n(15, this, log));
    }

    public static final void a(Ve this$0, String log) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(log, "$log");
        F5 f52 = this$0.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = this$0.f32408c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(log);
        }
    }

    public void a(short s10) {
        F5 f52 = this.f32411f;
        if (f52 != null) {
            String TAG = f32400i;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "submitAdLoadDroppedAtSDK " + this);
        }
        U0 u0J = j();
        if (u0J != null) {
            u0J.a(s10);
        }
    }

    public String a(double d10) {
        if (j() == null) {
            return "win notification failed to trigger";
        }
        U0 u0J = j();
        if (u0J != null) {
            return u0J.a(d10);
        }
        return null;
    }

    public String a(int i10, double d10) {
        if (j() == null) {
            return "loss notification failed to trigger";
        }
        U0 u0J = j();
        if (u0J != null) {
            return u0J.a(i10, d10);
        }
        return null;
    }
}
