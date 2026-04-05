package com.unity3d.ads.core.domain;

import android.content.Context;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final CoroutineDispatcher defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER, 93, 97, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$withContext", "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv", "$this$withContext", "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "J$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        final /* synthetic */ Context $context;
        final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placement;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$opportunityId = byteString;
            this.$placement = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = AndroidLoad.this.new AnonymousClass2(this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:115:0x03a3, code lost:
        
            if (r0 != r9) goto L117;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x02db A[Catch: UnityAdsNetworkException -> 0x0029, TryCatch #7 {UnityAdsNetworkException -> 0x0029, blocks: (B:9:0x0022, B:117:0x03a6, B:119:0x03ac, B:121:0x03ba, B:122:0x03cd, B:123:0x03d4, B:126:0x03d9, B:127:0x03de, B:92:0x0267, B:96:0x0293, B:98:0x02bf, B:100:0x02db, B:102:0x0344, B:103:0x0350, B:105:0x035d, B:106:0x036e, B:107:0x0374, B:111:0x0390, B:91:0x025c, B:21:0x005a, B:78:0x020e, B:64:0x0171, B:68:0x019d, B:63:0x0166, B:29:0x008a, B:50:0x0118, B:32:0x009b, B:34:0x00a7, B:36:0x00bd, B:41:0x00c6, B:44:0x00ce, B:46:0x00f4, B:70:0x01d2, B:72:0x01f2, B:74:0x01f6, B:43:0x00cb), top: B:146:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x038d  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x038f  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0243  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x02bf A[Catch: UnityAdsNetworkException -> 0x0029, TryCatch #7 {UnityAdsNetworkException -> 0x0029, blocks: (B:9:0x0022, B:117:0x03a6, B:119:0x03ac, B:121:0x03ba, B:122:0x03cd, B:123:0x03d4, B:126:0x03d9, B:127:0x03de, B:92:0x0267, B:96:0x0293, B:98:0x02bf, B:100:0x02db, B:102:0x0344, B:103:0x0350, B:105:0x035d, B:106:0x036e, B:107:0x0374, B:111:0x0390, B:91:0x025c, B:21:0x005a, B:78:0x020e, B:64:0x0171, B:68:0x019d, B:63:0x0166, B:29:0x008a, B:50:0x0118, B:32:0x009b, B:34:0x00a7, B:36:0x00bd, B:41:0x00c6, B:44:0x00ce, B:46:0x00f4, B:70:0x01d2, B:72:0x01f2, B:74:0x01f6, B:43:0x00cb), top: B:146:0x0016 }] */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v3, types: [int] */
        /* JADX WARN: Type inference failed for: r13v4, types: [int] */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v7 */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 1000
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super LoadResult> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidLoad(CoroutineDispatcher defaultDispatcher, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(getAdRequest, "getAdRequest");
        e0.checkNotNullParameter(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        e0.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        e0.checkNotNullParameter(handleGatewayAdResponse, "handleGatewayAdResponse");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(gatewayClient, "gatewayClient");
        e0.checkNotNullParameter(adRepository, "adRepository");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString byteString, String str, boolean z10, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        ByteString EMPTY = ByteString.EMPTY;
        e0.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new AdObject(byteString, str, EMPTY, false, null, null, null, false, null, null, null, unityAdsLoadOptions, z10, diagnosticAdType, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        boolean z10 = unityAdsNetworkException instanceof NetworkTimeoutException;
        return new LoadResult.Failure(z10 ? UnityAds.UnityAdsLoadError.TIMEOUT : UnityAds.UnityAdsLoadError.INTERNAL_ERROR, z10 ? LoadResult.MSG_TIMEOUT : unityAdsNetworkException instanceof GatewayException ? unityAdsNetworkException.getMessage() : LoadResult.MSG_COMMUNICATION_FAILURE, unityAdsNetworkException, z10 ? "timeout" : "gateway", unityAdsNetworkException.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, d<? super LoadResult> dVar) {
        return BuildersKt.withContext(this.defaultDispatcher, new AnonymousClass2(bannerSize, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), dVar);
    }
}
