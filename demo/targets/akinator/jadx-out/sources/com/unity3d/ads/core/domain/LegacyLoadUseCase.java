package com.unity3d.ads.core.domain;

import android.content.Context;
import bv.d;
import bv.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import sv.n0;
import tu.x0;
import tv.w;
import tv.x;
import tv.y;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private IUnityAdsLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private w startTime;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase", f = "LegacyLoadUseCase.kt", i = {0, 0, 0}, l = {98}, m = "invoke", n = {"this", "placement", "opportunityId"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyLoadUseCase.this.invoke(null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37921 extends f0 implements kv.a {
        final /* synthetic */ LoadResult.Failure $loadResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37921(LoadResult.Failure failure) {
            super(0);
            this.$loadResult = failure;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3501invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3501invoke() {
            IUnityAdsLoadListener iUnityAdsLoadListener = LegacyLoadUseCase.this.listener;
            if (iUnityAdsLoadListener != null) {
                iUnityAdsLoadListener.onUnityAdsFailedToLoad(LegacyLoadUseCase.this.placement, this.$loadResult.getError(), this.$loadResult.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37931 extends f0 implements kv.a {
        public C37931() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3502invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3502invoke() {
            IUnityAdsLoadListener iUnityAdsLoadListener = LegacyLoadUseCase.this.listener;
            if (iUnityAdsLoadListener != null) {
                iUnityAdsLoadListener.onUnityAdsAdLoaded(LegacyLoadUseCase.this.placement);
            }
        }
    }

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires) {
        e0.checkNotNullParameter(load, "load");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(getInitializationState, "getInitializationState");
        e0.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(adRepository, "adRepository");
        e0.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        e0.checkNotNullParameter(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("adMarkup")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder builderNewBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        BannerSizeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setWidth(unityBannerSize.getWidth());
        dsl_create.setHeight(unityBannerSize.getHeight());
        return dsl_create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String str) {
        if (str == null || n0.isBlank(str)) {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
        }
        try {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(str, false, 1, null).toByteArray());
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final Map<String, String> getTags(String str, String str2) {
        Map<String, String> mapMutableMapOf = p1.mutableMapOf(tu.e0.to("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), tu.e0.to("operation", OperationType.LOAD.toString()));
        if (str != null && str.length() != 0) {
            mapMutableMapOf.put("reason", str);
        }
        if (str2 != null && str2.length() != 0) {
            mapMutableMapOf.put("reason_debug", str2);
        }
        return mapMutableMapOf;
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(String str, boolean z10) {
        UUID uuidFromString = UUID.fromString(str);
        e0.checkNotNullExpressionValue(uuidFromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ByteString EMPTY = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            e0.throwUninitializedPropertyAccessException(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            unityAdsLoadOptions = null;
        }
        UnityAdsLoadOptions unityAdsLoadOptions2 = unityAdsLoadOptions;
        boolean z11 = this.isHeaderBidding;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
        e0.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new AdObject(byteString, str3, EMPTY, z10, null, null, null, false, null, null, null, unityAdsLoadOptions2, z11, adType, null, null, 50672, null);
    }

    public static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return legacyLoadUseCase.getTmpAdObject(str, z10);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, zu.d dVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, dVar);
    }

    private final void loadFailure(String str, LoadResult.Failure failure) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Load Failure for placement: " + this.placement + " reason: " + failure.getError() + " :: " + failure.getMessage());
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        w wVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", wVar != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)) : null, getTags(failure.getReason(), failure.getReasonDebug()), null, getTmpAdObject(str, failure.isScarAd()), null, 40, null);
        this.safeCallbackInvoke.invoke(new C37921(failure));
    }

    private final w loadStart(String str) {
        long jM7254markNowz9LOYto = y.f87465a.m7254markNowz9LOYto();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, str, false, 2, null), null, 42, null);
        return x.m7236boximpl(jM7254markNowz9LOYto);
    }

    private final void loadSuccess(AdObject adObject) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Load Success for placement: " + this.placement);
        adObject.getState().setValue(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        w wVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", wVar != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)) : null, getTags$default(this, null, null, 3, null), null, adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new C37931());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:13:0x0041, B:38:0x00cb, B:40:0x00cf, B:41:0x00ef, B:43:0x00f3, B:44:0x00fd, B:46:0x0101), top: B:53:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:13:0x0041, B:38:0x00cb, B:40:0x00cf, B:41:0x00ef, B:43:0x00f3, B:44:0x00fd, B:46:0x0101), top: B:53:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:13:0x0041, B:38:0x00cb, B:40:0x00cf, B:41:0x00ef, B:43:0x00f3, B:44:0x00fd, B:46:0x0101), top: B:53:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(android.content.Context r23, java.lang.String r24, com.unity3d.ads.UnityAdsLoadOptions r25, com.unity3d.ads.IUnityAdsLoadListener r26, com.unity3d.services.banners.UnityBannerSize r27, zu.d<? super tu.x0> r28) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke(android.content.Context, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize, zu.d):java.lang.Object");
    }
}
