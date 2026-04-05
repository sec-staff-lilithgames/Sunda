package com.unity3d.services;

import android.content.Context;
import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.InitializeSDK;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kv.a;
import kv.p;
import tu.a0;
import tu.e0;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;
import tv.x;
import tv.y;
import uu.o1;
import uu.p1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityAdsSDK implements IServiceComponent {
    private final IServiceProvider serviceProvider;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", f = "UnityAdsSDK.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ o $getAdObject$delegate;
        final /* synthetic */ o $omFinishSession$delegate;
        final /* synthetic */ CoroutineScope $omidScope;
        final /* synthetic */ String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, CoroutineScope coroutineScope, o oVar, o oVar2, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$opportunityId = str;
            this.$omidScope = coroutineScope;
            this.$getAdObject$delegate = oVar;
            this.$omFinishSession$delegate = oVar2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AdObject adObjectInvoke = UnityAdsSDK.finishOMIDSession$lambda$18(this.$getAdObject$delegate).invoke(this.$opportunityId);
                if (adObjectInvoke != null) {
                    OmFinishSession omFinishSessionFinishOMIDSession$lambda$19 = UnityAdsSDK.finishOMIDSession$lambda$19(this.$omFinishSession$delegate);
                    this.label = 1;
                    if (omFinishSessionFinishOMIDSession$lambda$19.invoke(adObjectInvoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(this.$omidScope, null, 1, null);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$getToken$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return UnityAdsSDK.this.new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.this;
            this.label = 1;
            Object objFetchToken = unityAdsSDK.fetchToken("true", this);
            return objFetchToken == coroutine_suspended ? coroutine_suspended : objFetchToken;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super String> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$getToken$2, reason: invalid class name and case insensitive filesystem */
    public static final class C38482 extends n implements p {
        final /* synthetic */ o $getAsyncHeaderBiddingToken$delegate;
        final /* synthetic */ CoroutineScope $getTokenScope;
        final /* synthetic */ IUnityAdsTokenListener $listener;
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ o $tokenNumberProvider$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38482(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, CoroutineScope coroutineScope, o oVar, o oVar2, d<? super C38482> dVar) {
            super(2, dVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = coroutineScope;
            this.$getAsyncHeaderBiddingToken$delegate = oVar;
            this.$tokenNumberProvider$delegate = oVar2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C38482(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                GetAsyncHeaderBiddingToken token$lambda$8 = UnityAdsSDK.getToken$lambda$8(this.$getAsyncHeaderBiddingToken$delegate);
                int iInvoke = UnityAdsSDK.getToken$lambda$7(this.$tokenNumberProvider$delegate).invoke();
                TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
                IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
                this.label = 1;
                if (token$lambda$8.invoke(iInvoke, tokenConfiguration, iUnityAdsTokenListener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(this.$getTokenScope, null, 1, null);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C38482) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", i = {}, l = {87, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$initialize$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38491 extends n implements p {
        final /* synthetic */ o $alternativeFlowReader$delegate;
        final /* synthetic */ CoroutineScope $initScope;
        final /* synthetic */ o $initializeBoldSDK$delegate;
        final /* synthetic */ o $initializeSDK$delegate;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38491(String str, CoroutineScope coroutineScope, o oVar, o oVar2, o oVar3, d<? super C38491> dVar) {
            super(2, dVar);
            this.$source = str;
            this.$initScope = coroutineScope;
            this.$alternativeFlowReader$delegate = oVar;
            this.$initializeBoldSDK$delegate = oVar2;
            this.$initializeSDK$delegate = oVar3;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C38491(this.$source, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            if (r5.mo3513invokegIAlus(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        
            return r0;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                tu.a0.throwOnFailure(r5)
                tu.z r5 = (tu.z) r5
                r5.m7139unboximpl()
                goto L54
            L17:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1f:
                tu.a0.throwOnFailure(r5)
                goto L54
            L23:
                tu.a0.throwOnFailure(r5)
                tu.o r5 = r4.$alternativeFlowReader$delegate
                com.unity3d.ads.core.configuration.AlternativeFlowReader r5 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$1(r5)
                boolean r5 = r5.invoke()
                if (r5 == 0) goto L43
                tu.o r5 = r4.$initializeBoldSDK$delegate
                com.unity3d.ads.core.domain.InitializeBoldSDK r5 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$3(r5)
                java.lang.String r1 = r4.$source
                r4.label = r3
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L54
                goto L53
            L43:
                tu.o r5 = r4.$initializeSDK$delegate
                com.unity3d.services.core.domain.task.InitializeSDK r5 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$2(r5)
                com.unity3d.services.core.domain.task.EmptyParams r1 = com.unity3d.services.core.domain.task.EmptyParams.INSTANCE
                r4.label = r2
                java.lang.Object r5 = r5.mo3513invokegIAlus(r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                kotlinx.coroutines.CoroutineScope r5 = r4.$initScope
                r0 = 0
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(r5, r0, r3, r0)
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK.C38491.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C38491) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$load$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38501 extends n implements p {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ o $context$delegate;
        final /* synthetic */ IUnityAdsLoadListener $listener;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ CoroutineScope $loadScope;
        final /* synthetic */ String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38501(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, CoroutineScope coroutineScope, o oVar, d<? super C38501> dVar) {
            super(2, dVar);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = iUnityAdsLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = coroutineScope;
            this.$context$delegate = oVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return UnityAdsSDK.this.new C38501(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            C38501 c38501;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", c1.getOrCreateKotlinClass(LegacyLoadUseCase.class));
                Context contextLoad$lambda$5 = UnityAdsSDK.load$lambda$5(this.$context$delegate);
                String str = this.$placementId;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
                UnityBannerSize unityBannerSize = this.$bannerSize;
                this.label = 1;
                c38501 = this;
                if (legacyLoadUseCase.invoke(contextLoad$lambda$5, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, c38501) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                c38501 = this;
            }
            CoroutineScopeKt.cancel$default(c38501.$loadScope, null, 1, null);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C38501) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", i = {}, l = {AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$show$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38511 extends n implements p {
        final /* synthetic */ Listeners $listener;
        final /* synthetic */ String $placementId;
        final /* synthetic */ LegacyShowUseCase $showBoldSDK;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ CoroutineScope $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38511(LegacyShowUseCase legacyShowUseCase, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, CoroutineScope coroutineScope, d<? super C38511> dVar) {
            super(2, dVar);
            this.$showBoldSDK = legacyShowUseCase;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = coroutineScope;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C38511(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
                String str = this.$placementId;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                Listeners listeners = this.$listener;
                this.label = 1;
                if (legacyShowUseCase.invoke(str, unityAdsShowOptions, listeners, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(this.$showScope, null, 1, null);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C38511) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, d<? super String> dVar) {
        String str2;
        String str3;
        String str4;
        s sVar = s.f87405e;
        o oVarLazy = q.lazy(sVar, (a) new UnityAdsSDK$fetchToken$$inlined$inject$default$1(this, ""));
        o oVarLazy2 = q.lazy(sVar, (a) new UnityAdsSDK$fetchToken$$inlined$inject$default$2(this, ""));
        o oVarLazy3 = q.lazy(sVar, (a) new UnityAdsSDK$fetchToken$$inlined$inject$default$3(this, ""));
        o oVarLazy4 = q.lazy(sVar, (a) new UnityAdsSDK$fetchToken$$inlined$inject$default$4(this, ""));
        long jM7254markNowz9LOYto = y.f87465a.m7254markNowz9LOYto();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$12(oVarLazy4), "native_gateway_token_started", null, p1.mapOf(e0.to("sync", str), e0.to("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(oVarLazy3), false, 1, null).toString())), null, null, null, 58, null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(oVarLazy3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) BuildersKt__BuildersKt.runBlocking$default(null, new UnityAdsSDK$fetchToken$token$1(oVarLazy2, oVarLazy, null), 1, null);
                str2 = null;
                str3 = null;
            } catch (Exception e10) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e10, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$12 = fetchToken$lambda$12(oVarLazy4);
        String str5 = str4 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double dBoxDouble = b.boxDouble(TimeExtensionsKt.elapsedMillis(x.m7236boximpl(jM7254markNowz9LOYto)));
        Map mapCreateMapBuilder = o1.createMapBuilder();
        mapCreateMapBuilder.put("sync", str);
        mapCreateMapBuilder.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(oVarLazy3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            mapCreateMapBuilder.put("reason_debug", str3);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$12, str5, dBoxDouble, o1.build(mapCreateMapBuilder), null, null, b.boxInt(fetchToken$lambda$9(oVarLazy).invoke()), 24, null);
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$10(o oVar) {
        return (GetHeaderBiddingToken) oVar.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$11(o oVar) {
        return (GetInitializationState) oVar.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$12(o oVar) {
        return (SendDiagnosticEvent) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$9(o oVar) {
        return (TokenNumberProvider) oVar.getValue();
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$16(o oVar) {
        return (AlternativeFlowReader) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$18(o oVar) {
        return (GetAdObject) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$19(o oVar) {
        return (OmFinishSession) oVar.getValue();
    }

    private static final GetGameId getToken$lambda$6(o oVar) {
        return (GetGameId) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$7(o oVar) {
        return (TokenNumberProvider) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$8(o oVar) {
        return (GetAsyncHeaderBiddingToken) oVar.getValue();
    }

    public static /* synthetic */ Job initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    private static final ShouldAllowInitialization initialize$lambda$0(o oVar) {
        return (ShouldAllowInitialization) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader initialize$lambda$1(o oVar) {
        return (AlternativeFlowReader) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeSDK initialize$lambda$2(o oVar) {
        return (InitializeSDK) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$3(o oVar) {
        return (InitializeBoldSDK) oVar.getValue();
    }

    public static /* synthetic */ Job load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$4(o oVar) {
        return (GetGameId) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$5(o oVar) {
        return (Context) oVar.getValue();
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$20(o oVar) {
        return (AlternativeFlowReader) oVar.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$21(o oVar) {
        return (SendDiagnosticEvent) oVar.getValue();
    }

    public final Job finishOMIDSession(String opportunityId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(opportunityId, "opportunityId");
        s sVar = s.f87405e;
        if (!finishOMIDSession$lambda$16(q.lazy(sVar, (a) new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(this, ""))).invoke()) {
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            completableJobJob$default.complete();
            return completableJobJob$default;
        }
        o oVarLazy = q.lazy(sVar, (a) new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2(this, ""));
        o oVarLazy2 = q.lazy(sVar, (a) new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(this, ""));
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class));
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(opportunityId, coroutineScope, oVarLazy, oVarLazy2, null), 3, null);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final String getToken() {
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
    }

    public final synchronized Job initialize(String str, String source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        s sVar = s.f87405e;
        if (!initialize$lambda$0(q.lazy(sVar, (a) new UnityAdsSDK$initialize$$inlined$inject$default$1(this, ""))).invoke(str)) {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
        o oVarLazy = q.lazy(sVar, (a) new UnityAdsSDK$initialize$$inlined$inject$default$2(this, ""));
        o oVarLazy2 = q.lazy(sVar, (a) new UnityAdsSDK$initialize$$inlined$inject$default$3(this, ""));
        o oVarLazy3 = q.lazy(sVar, (a) new UnityAdsSDK$initialize$$inlined$inject$default$4(this, ""));
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class));
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C38491(source, coroutineScope, oVarLazy, oVarLazy3, oVarLazy2, null), 3, null);
    }

    public final Job load(String str, UnityAdsLoadOptions loadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadOptions, "loadOptions");
        s sVar = s.f87405e;
        initialize(load$lambda$4(q.lazy(sVar, (a) new UnityAdsSDK$load$$inlined$inject$default$1(this, ""))).invoke(), "load");
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class));
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C38501(str, loadOptions, iUnityAdsLoadListener, unityBannerSize, coroutineScope, q.lazy(sVar, (a) new UnityAdsSDK$load$$inlined$inject$default$2(this, "")), null), 3, null);
    }

    public final void sendBannerDestroyed() {
        s sVar = s.f87405e;
        if (sendBannerDestroyed$lambda$20(q.lazy(sVar, (a) new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1(this, ""))).invoke()) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$21(q.lazy(sVar, (a) new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2(this, ""))), "native_banner_destroyed", null, null, null, null, null, 62, null);
        }
    }

    public final Job show(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class));
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C38511((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", c1.getOrCreateKotlinClass(LegacyShowUseCase.class)), str, unityAdsShowOptions, listener, coroutineScope, null), 3, null);
    }

    public UnityAdsSDK(IServiceProvider serviceProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    public final Job getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        return getToken(null, iUnityAdsTokenListener);
    }

    public final Job getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        s sVar = s.f87405e;
        initialize(getToken$lambda$6(q.lazy(sVar, (a) new UnityAdsSDK$getToken$$inlined$inject$default$1(this, ""))).invoke(), "get_token");
        o oVarLazy = q.lazy(sVar, (a) new UnityAdsSDK$getToken$$inlined$inject$default$2(this, ""));
        o oVarLazy2 = q.lazy(sVar, (a) new UnityAdsSDK$getToken$$inlined$inject$default$3(this, ""));
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class));
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C38482(tokenConfiguration, iUnityAdsTokenListener, coroutineScope, oVarLazy2, oVarLazy, null), 3, null);
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i10, u uVar) {
        this((i10 & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }
}
