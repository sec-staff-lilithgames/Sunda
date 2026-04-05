package com.sfbx.appconsent.core.repository;

import ac.AcError;
import ac.Api;
import ac.Models;
import android.content.Context;
import android.graphics.Bitmap;
import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.play_billing.a;
import com.google.protobuf.Duration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sfbx.appconsent.core.AppConsentError;
import com.sfbx.appconsent.core.api.AppConsentService;
import com.sfbx.appconsent.core.controller.ConnectivityController;
import com.sfbx.appconsent.core.dao.StateDao;
import com.sfbx.appconsent.core.listener.AppConsentNoticeListener;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.DurationUnit;
import com.sfbx.appconsent.core.model.FloatingConsent;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.api.proto.Configuration;
import com.sfbx.appconsent.core.model.api.proto.Consent;
import com.sfbx.appconsent.core.model.api.proto.CountryProto;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import com.sfbx.appconsent.core.model.reducer.MobileTcfStorage;
import com.sfbx.appconsent.core.model.reducer.State;
import com.sfbx.appconsent.core.model.reducer.VendorReducer;
import com.sfbx.appconsent.core.model.reducer.action.Save;
import com.sfbx.appconsent.core.provider.ConfigurationProvider;
import com.sfbx.appconsent.core.provider.ConsentProvider;
import com.sfbx.appconsent.core.provider.TimeoutProvider;
import com.sfbx.appconsent.core.provider.UserProvider;
import com.sfbx.appconsent.core.util.HelloReplyExtsKt;
import com.sfbx.appconsent.core.util.RateLimiter;
import com.sfbx.appconsent.core.util.StateExtsKt;
import com.sfbx.appconsent.core.util.Utils;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import tu.z;
import uu.o1;
import uu.p0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentRepository {
    public static final String KEY_CHECK_FOR_UPDATE_RESPONSE = "KEY_CHECK_FOR_UPDATE_RESPONSE";
    public static final String KEY_GDPR_COUNTRY_RESPONSE = "KEY_GDPR_COUNTRY_RESPONSE";
    public static final String KEY_HELLO_REPLY_RESPONSE = "KEY_HELLO_REPLY_RESPONSE";
    private final RateLimiter GDPRRateLimiter;
    private String appKey;
    private final RateLimiter checkForUpdateRateLimiter;
    private HelloReply checkForUpdateResponse;
    private final ConnectivityController connectivityController;
    private final Context context;
    private final CoroutineDispatcher dispatcher;
    private boolean fromCache;
    private HelloReply helloReply;
    private final Mutex lock;
    private final AppConsentService mAppConsentService;
    private final ConfigurationProvider mConfigurationProvider;
    private final ConsentProvider mConsentProvider;
    private final StateDao mStateDao;
    private final UserProvider mUserProvider;
    private final RateLimiter rateLimiter;
    private final TimeoutProvider timeoutProvider;
    public static final Companion Companion = new Companion(null);
    private static final String tag = "ConsentRepository";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getKEY_CHECK_FOR_UPDATE_RESPONSE$appconsent_core_prodXchangeRelease$annotations() {
        }

        public static /* synthetic */ void getKEY_GDPR_COUNTRY_RESPONSE$appconsent_core_prodXchangeRelease$annotations() {
        }

        public static /* synthetic */ void getKEY_HELLO_REPLY_RESPONSE$appconsent_core_prodXchangeRelease$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$checkForUpdate$1", f = "ConsentRepository.kt", i = {0}, l = {472, 474}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$checkForUpdate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = ConsentRepository.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super Api.HelloReply> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00c6, code lost:
        
            if (r1.emit((ac.Api.HelloReply) r12, r11) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
                r11 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                java.lang.String r2 = "tag"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                tu.a0.throwOnFailure(r12)
                goto Lc9
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                java.lang.Object r1 = r11.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r12)
                goto Laa
            L26:
                tu.a0.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                r1 = r12
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                ac.Api$HelloRequest$Builder r12 = ac.Api.HelloRequest.newBuilder()
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                java.lang.String r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getAppKey$p(r5)
                ac.Api$HelloRequest$Builder r12 = r12.setAppKey(r5)
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.ConsentProvider r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r5)
                java.util.Map r5 = r5.getExternalIds()
                ac.Api$HelloRequest$Builder r12 = r12.putAllExternalIds(r5)
                com.sfbx.appconsent.core.util.Utils r5 = com.sfbx.appconsent.core.util.Utils.INSTANCE
                java.lang.String r5 = r5.getUserAgent()
                ac.Api$HelloRequest$Builder r12 = r12.setAgent(r5)
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.UserProvider r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMUserProvider$p(r5)
                java.lang.String r5 = r5.getLanguage()
                ac.Api$HelloRequest$Builder r12 = r12.setLanguage(r5)
                ac.Api$HelloRequest$Builder r12 = r12.setNoConsent(r4)
                ac.Api$HelloRequest$Builder r12 = r12.setNoConfiguration(r4)
                ac.Api$HelloRequest$Builder r12 = r12.setNoVendorList(r4)
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.UserProvider r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMUserProvider$p(r5)
                java.lang.String r5 = r5.getUserId()
                ac.Api$HelloRequest$Builder r12 = r12.setUuid(r5)
                com.google.protobuf.GeneratedMessageLite r12 = r12.build()
                ac.Api$HelloRequest r12 = (ac.Api.HelloRequest) r12
                io.sfbx.appconsent.logger.ACLogger r5 = io.sfbx.appconsent.logger.ACLogger.INSTANCE
                java.lang.String r6 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getTag$cp()
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r2)
                r9 = 4
                r10 = 0
                r7 = 0
                java.lang.String r7 = com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ.ypvSSl
                r8 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r5, r6, r7, r8, r9, r10)
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.api.AppConsentService r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMAppConsentService$p(r5)
                java.lang.String r6 = "helloRequest"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r6)
                r11.L$0 = r1
                r11.label = r4
                java.lang.Object r12 = r5.sayHello(r12, r11)
                if (r12 != r0) goto Laa
                goto Lc8
            Laa:
                ac.Api$HelloReply r12 = (ac.Api.HelloReply) r12
                io.sfbx.appconsent.logger.ACLogger r4 = io.sfbx.appconsent.logger.ACLogger.INSTANCE
                java.lang.String r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getTag$cp()
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r2)
                r8 = 4
                r9 = 0
                java.lang.String r6 = "<< getting LITE /HELLO"
                r7 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r4, r5, r6, r7, r8, r9)
                r2 = 0
                r11.L$0 = r2
                r11.label = r3
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto Lc9
            Lc8:
                return r0
            Lc9:
                tu.x0 r12 = tu.x0.f87415a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository", f = "ConsentRepository.kt", i = {0, 0, 1, 1}, l = {852, 496}, m = "checkForUpdateWithCache", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$checkForUpdateWithCache$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36571 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C36571(d<? super C36571> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConsentRepository.this.checkForUpdateWithCache(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$1", f = "ConsentRepository.kt", i = {}, l = {607, 613, 613}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36581 extends n implements p {
        final /* synthetic */ boolean $checkCache;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36581(boolean z10, d<? super C36581> dVar) {
            super(2, dVar);
            this.$checkCache = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36581 c36581 = ConsentRepository.this.new C36581(this.$checkCache, dVar);
            c36581.L$0 = obj;
            return c36581;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00cc A[RETURN] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                tu.x0 r2 = tu.x0.f87415a
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2d
                if (r1 == r5) goto L29
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                tu.a0.throwOnFailure(r8)
                goto Lcc
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r8)
                goto Lba
            L29:
                tu.a0.throwOnFailure(r8)
                goto La3
            L2d:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                ac.Api$HelloRequest$Builder r8 = ac.Api.HelloRequest.newBuilder()
                com.sfbx.appconsent.core.repository.ConsentRepository r6 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                java.lang.String r6 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getAppKey$p(r6)
                ac.Api$HelloRequest$Builder r8 = r8.setAppKey(r6)
                com.sfbx.appconsent.core.repository.ConsentRepository r6 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.ConsentProvider r6 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r6)
                java.util.Map r6 = r6.getExternalIds()
                ac.Api$HelloRequest$Builder r8 = r8.putAllExternalIds(r6)
                com.sfbx.appconsent.core.util.Utils r6 = com.sfbx.appconsent.core.util.Utils.INSTANCE
                java.lang.String r6 = r6.getUserAgent()
                ac.Api$HelloRequest$Builder r8 = r8.setAgent(r6)
                com.sfbx.appconsent.core.repository.ConsentRepository r6 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.UserProvider r6 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMUserProvider$p(r6)
                java.lang.String r6 = r6.getLanguage()
                ac.Api$HelloRequest$Builder r8 = r8.setLanguage(r6)
                com.sfbx.appconsent.core.repository.ConsentRepository r6 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.UserProvider r6 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMUserProvider$p(r6)
                java.lang.String r6 = r6.getUserId()
                ac.Api$HelloRequest$Builder r8 = r8.setUuid(r6)
                ac.Api$HelloRequest$Builder r8 = r8.setNoConsent(r5)
                ac.Api$HelloRequest$Builder r8 = r8.setNoVendorList(r5)
                com.google.protobuf.GeneratedMessageLite r8 = r8.build()
                ac.Api$HelloRequest r8 = (ac.Api.HelloRequest) r8
                boolean r6 = r7.$checkCache
                if (r6 == 0) goto La4
                com.sfbx.appconsent.core.repository.ConsentRepository r6 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.ConfigurationProvider r6 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConfigurationProvider$p(r6)
                com.sfbx.appconsent.core.model.api.proto.HelloReply r6 = r6.getHelloReply()
                if (r6 == 0) goto La4
                com.sfbx.appconsent.core.repository.ConsentRepository r8 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.repository.ConsentRepository.access$setFromCache$p(r8, r5)
                r7.label = r5
                java.lang.Object r8 = r1.emit(r6, r7)
                if (r8 != r0) goto La3
                goto Lcb
            La3:
                return r2
            La4:
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.api.AppConsentService r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMAppConsentService$p(r5)
                java.lang.String r6 = "helloRequest"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r6)
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = r5.sayHello(r8, r7)
                if (r8 != r0) goto Lba
                goto Lcb
            Lba:
                ac.Api$HelloReply r8 = (ac.Api.HelloReply) r8
                com.sfbx.appconsent.core.model.api.proto.HelloReply r8 = com.sfbx.appconsent.core.util.HelloReplyExtsKt.toCoreModel(r8)
                r4 = 0
                r7.L$0 = r4
                r7.label = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto Lcc
            Lcb:
                return r0
            Lcc:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.C36581.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super HelloReply> flowCollector, d<? super x0> dVar) {
            return ((C36581) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$3", f = "ConsentRepository.kt", i = {}, l = {LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements q {
        final /* synthetic */ List<AppConsentNoticeListener> $listeners;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$3$1", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ Throwable $error;
            final /* synthetic */ List<AppConsentNoticeListener> $listeners;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(List<? extends AppConsentNoticeListener> list, Throwable th2, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$listeners = list;
                this.$error = th2;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$listeners, this.$error, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                List<AppConsentNoticeListener> list = this.$listeners;
                Throwable th2 = this.$error;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.LoadingCachedError(th2));
                }
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends AppConsentNoticeListener> list, d<? super AnonymousClass3> dVar) {
            super(3, dVar);
            this.$listeners = list;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                HelloReply helloReply = ConsentRepository.this.mConfigurationProvider.getHelloReply();
                if ((helloReply != null ? helloReply.getConfiguration() : null) == null) {
                    throw th2;
                }
                BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AnonymousClass1(this.$listeners, th2, null), 3, null);
                Configuration configuration = helloReply.getConfiguration();
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(configuration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Configuration> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass3 anonymousClass3 = ConsentRepository.this.new AnonymousClass3(this.$listeners, dVar);
            anonymousClass3.L$0 = flowCollector;
            anonymousClass3.L$1 = th2;
            return anonymousClass3.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReplyFromCacheOrRemote$1", f = "ConsentRepository.kt", i = {1, 3}, l = {286, 289, 290, 298, 299}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReplyFromCacheOrRemote$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36591 extends n implements p {
        final /* synthetic */ boolean $checkCache;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConsentRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36591(boolean z10, ConsentRepository consentRepository, d<? super C36591> dVar) {
            super(2, dVar);
            this.$checkCache = z10;
            this.this$0 = consentRepository;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36591 c36591 = new C36591(this.$checkCache, this.this$0, dVar);
            c36591.L$0 = obj;
            return c36591;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
        
            if (r1.emit((com.sfbx.appconsent.core.model.api.proto.HelloReply) r9, r8) != r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
        
            if (r1.emit((com.sfbx.appconsent.core.model.api.proto.HelloReply) r9, r8) != r0) goto L43;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
            /*
                r8 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L37
                if (r1 == r6) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L32
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                goto L32
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r9)
                goto La5
            L2a:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r9)
                goto L79
            L32:
                tu.a0.throwOnFailure(r9)
                goto Lb2
            L37:
                tu.a0.throwOnFailure(r9)
                java.lang.Object r9 = r8.L$0
                r1 = r9
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                boolean r9 = r8.$checkCache
                if (r9 == 0) goto L8c
                com.sfbx.appconsent.core.repository.ConsentRepository r9 = r8.this$0
                com.sfbx.appconsent.core.provider.ConfigurationProvider r9 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConfigurationProvider$p(r9)
                com.sfbx.appconsent.core.model.api.proto.HelloReply r9 = r9.getHelloReply()
                if (r9 == 0) goto L54
                com.sfbx.appconsent.core.model.api.proto.VendorList r2 = r9.getVendorList()
                goto L55
            L54:
                r2 = r7
            L55:
                if (r2 == 0) goto L60
                r8.label = r6
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto Lb2
                goto Lb1
            L60:
                com.sfbx.appconsent.core.repository.ConsentRepository r9 = r8.this$0
                com.sfbx.appconsent.core.controller.ConnectivityController r9 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getConnectivityController$p(r9)
                boolean r9 = r9.isConnectivityAvailable()
                if (r9 == 0) goto L86
                com.sfbx.appconsent.core.repository.ConsentRepository r9 = r8.this$0
                r8.L$0 = r1
                r8.label = r5
                java.lang.Object r9 = r9.getHelloReplyFromRemote$appconsent_core_prodXchangeRelease(r8)
                if (r9 != r0) goto L79
                goto Lb1
            L79:
                com.sfbx.appconsent.core.model.api.proto.HelloReply r9 = (com.sfbx.appconsent.core.model.api.proto.HelloReply) r9
                r8.L$0 = r7
                r8.label = r4
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto Lb2
                goto Lb1
            L86:
                com.sfbx.appconsent.core.exception.NoConnectivityException r9 = new com.sfbx.appconsent.core.exception.NoConnectivityException
                r9.<init>()
                throw r9
            L8c:
                com.sfbx.appconsent.core.repository.ConsentRepository r9 = r8.this$0
                com.sfbx.appconsent.core.controller.ConnectivityController r9 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getConnectivityController$p(r9)
                boolean r9 = r9.isConnectivityAvailable()
                if (r9 == 0) goto Lb5
                com.sfbx.appconsent.core.repository.ConsentRepository r9 = r8.this$0
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r9 = r9.getHelloReplyFromRemote$appconsent_core_prodXchangeRelease(r8)
                if (r9 != r0) goto La5
                goto Lb1
            La5:
                com.sfbx.appconsent.core.model.api.proto.HelloReply r9 = (com.sfbx.appconsent.core.model.api.proto.HelloReply) r9
                r8.L$0 = r7
                r8.label = r2
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto Lb2
            Lb1:
                return r0
            Lb2:
                tu.x0 r9 = tu.x0.f87415a
                return r9
            Lb5:
                com.sfbx.appconsent.core.exception.NoConnectivityException r9 = new com.sfbx.appconsent.core.exception.NoConnectivityException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.C36591.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super HelloReply> flowCollector, d<? super x0> dVar) {
            return ((C36591) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReplyFromCacheOrRemote$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReplyFromCacheOrRemote$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements q {
        final /* synthetic */ List<AppConsentNoticeListener> $listeners;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReplyFromCacheOrRemote$2$1", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReplyFromCacheOrRemote$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ Throwable $error;
            final /* synthetic */ List<AppConsentNoticeListener> $listeners;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(List<? extends AppConsentNoticeListener> list, Throwable th2, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$listeners = list;
                this.$error = th2;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$listeners, this.$error, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                List<AppConsentNoticeListener> list = this.$listeners;
                Throwable th2 = this.$error;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.LoadingCachedError(th2));
                }
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends AppConsentNoticeListener> list, d<? super AnonymousClass2> dVar) {
            super(3, dVar);
            this.$listeners = list;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                HelloReply helloReply = ConsentRepository.this.mConfigurationProvider.getHelloReply();
                if ((helloReply != null ? helloReply.getVendorList() : null) == null) {
                    throw th2;
                }
                BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AnonymousClass1(this.$listeners, th2, null), 3, null);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(helloReply, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super HelloReply> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = ConsentRepository.this.new AnonymousClass2(this.$listeners, dVar);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getLiteHelloReplyFromRemoteAndUpdateGDPRLocalCache$1", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getLiteHelloReplyFromRemoteAndUpdateGDPRLocalCache$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36601 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        public C36601(d<? super C36601> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            ConsentRepository.this.tryToUpdateGDPRApplyValueFromBO(new CountryProto((String) null, false, 1, (u) null));
            throw th2;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Api.HelloReply> flowCollector, Throwable th2, d<? super x0> dVar) {
            C36601 c36601 = ConsentRepository.this.new C36601(dVar);
            c36601.L$0 = th2;
            return c36601.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getLiteHelloReplyFromRemoteAndUpdateGDPRLocalCache$2", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getLiteHelloReplyFromRemoteAndUpdateGDPRLocalCache$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36612 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public C36612(d<? super C36612> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36612 c36612 = ConsentRepository.this.new C36612(dVar);
            c36612.L$0 = obj;
            return c36612;
        }

        @Override // kv.p
        public final Object invoke(Api.HelloReply helloReply, d<? super Flow<HelloReply>> dVar) {
            return ((C36612) create(helloReply, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Api.HelloReply helloReply = (Api.HelloReply) this.L$0;
            ConsentRepository consentRepository = ConsentRepository.this;
            Models.Country country = helloReply.getCountry();
            e0.checkNotNullExpressionValue(country, "helloReplyResponse.country");
            consentRepository.tryToUpdateGDPRApplyValueFromBO(HelloReplyExtsKt.toCoreModel(country));
            return FlowKt.flowOf(HelloReplyExtsKt.toCoreModel(helloReply));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$2", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36622 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        public C36622(d<? super C36622> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            throw ((Throwable) this.L$0);
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
            C36622 c36622 = new C36622(dVar);
            c36622.L$0 = th2;
            return c36622.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$1", f = "ConsentRepository.kt", i = {}, l = {TTAdConstant.AD_ID_IS_NULL_CODE, 406, TTAdConstant.VIDEO_INFO_CODE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36631 extends n implements p {
        final /* synthetic */ HelloReply $helloReply;
        final /* synthetic */ List<AppConsentNoticeListener> $listeners;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C36631(HelloReply helloReply, List<? extends AppConsentNoticeListener> list, d<? super C36631> dVar) {
            super(2, dVar);
            this.$helloReply = helloReply;
            this.$listeners = list;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36631 c36631 = ConsentRepository.this.new C36631(this.$helloReply, this.$listeners, dVar);
            c36631.L$0 = obj;
            return c36631;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r9, r1, r8) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r9, r1, r8) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
        
            return r0;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1a
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                tu.a0.throwOnFailure(r9)
                goto Lb5
            L1f:
                tu.a0.throwOnFailure(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                com.sfbx.appconsent.core.repository.ConsentRepository r1 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.dao.StateDao r1 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMStateDao$p(r1)
                com.sfbx.appconsent.core.model.reducer.State r1 = r1.getTemporaryState()
                if (r1 == 0) goto L99
                com.sfbx.appconsent.core.repository.ConsentRepository r2 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.ConsentProvider r2 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r2)
                boolean r2 = r2.isSyncNeeded()
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.ConfigurationProvider r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConfigurationProvider$p(r5)
                com.sfbx.appconsent.core.model.api.proto.HelloReply r5 = r5.getHelloReply()
                r6 = 0
                if (r5 == 0) goto L54
                java.lang.Integer r5 = r5.getCmpHashVersion()
                if (r5 == 0) goto L54
                int r5 = r5.intValue()
                goto L55
            L54:
                r5 = r6
            L55:
                com.sfbx.appconsent.core.model.api.proto.HelloReply r7 = r8.$helloReply
                java.lang.Integer r7 = r7.getCmpHashVersion()
                if (r7 == 0) goto L62
                int r7 = r7.intValue()
                goto L63
            L62:
                r7 = r6
            L63:
                if (r5 != r7) goto L66
                r6 = r4
            L66:
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.model.api.proto.HelloReply r7 = r8.$helloReply
                boolean r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$isHelloConsentSameAsState(r5, r7, r1)
                if (r2 != 0) goto L72
                if (r6 == 0) goto L7d
            L72:
                if (r5 != 0) goto L7d
                r8.label = r4
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto Lb5
                goto Lb4
            L7d:
                com.sfbx.appconsent.core.repository.ConsentRepository r1 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.ConsentProvider r1 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r1)
                com.sfbx.appconsent.core.model.reducer.action.Hello r2 = new com.sfbx.appconsent.core.model.reducer.action.Hello
                com.sfbx.appconsent.core.model.api.proto.HelloReply r4 = r8.$helloReply
                r2.<init>(r4)
                java.util.List<com.sfbx.appconsent.core.listener.AppConsentNoticeListener> r4 = r8.$listeners
                kotlinx.coroutines.flow.Flow r1 = r1.dispatch(r2, r4)
                r8.label = r3
                java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.emitAll(r9, r1, r8)
                if (r9 != r0) goto Lb5
                goto Lb4
            L99:
                com.sfbx.appconsent.core.repository.ConsentRepository r1 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.ConsentProvider r1 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r1)
                com.sfbx.appconsent.core.model.reducer.action.Hello r3 = new com.sfbx.appconsent.core.model.reducer.action.Hello
                com.sfbx.appconsent.core.model.api.proto.HelloReply r4 = r8.$helloReply
                r3.<init>(r4)
                java.util.List<com.sfbx.appconsent.core.listener.AppConsentNoticeListener> r4 = r8.$listeners
                kotlinx.coroutines.flow.Flow r1 = r1.dispatch(r3, r4)
                r8.label = r2
                java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.emitAll(r9, r1, r8)
                if (r9 != r0) goto Lb5
            Lb4:
                return r0
            Lb5:
                tu.x0 r9 = tu.x0.f87415a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.C36631.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super State> flowCollector, d<? super x0> dVar) {
            return ((C36631) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$2", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$2, reason: invalid class name and case insensitive filesystem */
    public static final class C36642 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        public C36642(d<? super C36642> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = ConsentRepository.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            aCLogger.e(tag, "An error has been thrown ! We can't continue to treat GDPR.", th2);
            throw th2;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super State> flowCollector, Throwable th2, d<? super x0> dVar) {
            C36642 c36642 = new C36642(dVar);
            c36642.L$0 = th2;
            return c36642.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$4", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$4, reason: invalid class name */
    public static final class AnonymousClass4 extends n implements q {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = ConsentRepository.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            aCLogger.e(tag, "An error has been thrown !", th2);
            throw th2;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(dVar);
            anonymousClass4.L$0 = th2;
            return anonymousClass4.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getQrCode$1", f = "ConsentRepository.kt", i = {}, l = {552, 552}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getQrCode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36651 extends n implements p {
        final /* synthetic */ String $data;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36651(String str, d<? super C36651> dVar) {
            super(2, dVar);
            this.$data = str;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36651 c36651 = ConsentRepository.this.new C36651(this.$data, dVar);
            c36651.L$0 = obj;
            return c36651;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r7)
                goto L4f
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r7)
                goto L43
            L22:
                tu.a0.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.sfbx.appconsent.core.repository.ConsentRepository r7 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.api.AppConsentService r7 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMAppConsentService$p(r7)
                java.lang.String r4 = r6.$data
                com.sfbx.appconsent.core.repository.ConsentRepository r5 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                java.lang.String r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getAppKey$p(r5)
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r7.generateQrCode(r4, r5, r6)
                if (r7 != r0) goto L43
                goto L4e
            L43:
                r3 = 0
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.C36651.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super Bitmap> flowCollector, d<? super x0> dVar) {
            return ((C36651) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$1", f = "ConsentRepository.kt", i = {}, l = {573, 573}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36661 extends n implements p {
        final /* synthetic */ long $cookieMaxAgeSeconds;
        final /* synthetic */ boolean $useNonCookieAccess;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConsentRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36661(long j10, boolean z10, ConsentRepository consentRepository, d<? super C36661> dVar) {
            super(2, dVar);
            this.$cookieMaxAgeSeconds = j10;
            this.$useNonCookieAccess = z10;
            this.this$0 = consentRepository;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36661 c36661 = new C36661(this.$cookieMaxAgeSeconds, this.$useNonCookieAccess, this.this$0, dVar);
            c36661.L$0 = obj;
            return c36661;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
                r6 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r7)
                goto L88
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r7)
                goto L7c
            L22:
                tu.a0.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                ac.Api$TranslateVendorCookieRetentionRequest$Builder r7 = ac.Api.TranslateVendorCookieRetentionRequest.newBuilder()
                long r4 = r6.$cookieMaxAgeSeconds
                ac.Api$TranslateVendorCookieRetentionRequest$Builder r7 = r7.setCookieMaxAgeSeconds(r4)
                boolean r4 = r6.$useNonCookieAccess
                ac.Api$TranslateVendorCookieRetentionRequest$Builder r7 = r7.setUsesNonCookieAccess(r4)
                com.sfbx.appconsent.core.repository.ConsentRepository r4 = r6.this$0
                java.lang.String r4 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getAppKey$p(r4)
                ac.Api$TranslateVendorCookieRetentionRequest$Builder r7 = r7.setAppKey(r4)
                com.sfbx.appconsent.core.repository.ConsentRepository r4 = r6.this$0
                com.sfbx.appconsent.core.provider.UserProvider r4 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMUserProvider$p(r4)
                java.lang.String r4 = r4.getLanguage()
                ac.Api$TranslateVendorCookieRetentionRequest$Builder r7 = r7.setLang(r4)
                com.sfbx.appconsent.core.repository.ConsentRepository r4 = r6.this$0
                com.sfbx.appconsent.core.provider.UserProvider r4 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMUserProvider$p(r4)
                java.lang.String r4 = r4.getUserId()
                ac.Api$TranslateVendorCookieRetentionRequest$Builder r7 = r7.setUuid(r4)
                com.google.protobuf.GeneratedMessageLite r7 = r7.build()
                ac.Api$TranslateVendorCookieRetentionRequest r7 = (ac.Api.TranslateVendorCookieRetentionRequest) r7
                com.sfbx.appconsent.core.repository.ConsentRepository r4 = r6.this$0
                com.sfbx.appconsent.core.api.AppConsentService r4 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMAppConsentService$p(r4)
                java.lang.String r5 = "translateVendorCookieRetentionRequest"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r4.getVendorExpiration(r7, r6)
                if (r7 != r0) goto L7c
                goto L87
            L7c:
                r3 = 0
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L88
            L87:
                return r0
            L88:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.C36661.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super Api.TranslateVendorCookieRetentionReply> flowCollector, d<? super x0> dVar) {
            return ((C36661) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36671 extends n implements p {
        final /* synthetic */ List<AppConsentNoticeListener> $listeners;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$1", f = "ConsentRepository.kt", i = {}, l = {TTAdConstant.STYLE_SIZE_RADIO_2_3, 665}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05051 extends n implements p {
            final /* synthetic */ Models.Consent $consent;
            final /* synthetic */ State $state;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConsentRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05051(ConsentRepository consentRepository, Models.Consent consent, State state, d<? super C05051> dVar) {
                super(2, dVar);
                this.this$0 = consentRepository;
                this.$consent = consent;
                this.$state = state;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                C05051 c05051 = new C05051(this.this$0, this.$consent, this.$state, dVar);
                c05051.L$0 = obj;
                return c05051;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
            
                if (r1.emit(r7, r6) == r0) goto L15;
             */
            @Override // bv.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.google.protobuf.InvalidProtocolBufferException {
                /*
                    r6 = this;
                    java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    tu.a0.throwOnFailure(r7)
                    goto L8b
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    java.lang.Object r1 = r6.L$0
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                    tu.a0.throwOnFailure(r7)
                    goto L7f
                L23:
                    tu.a0.throwOnFailure(r7)
                    java.lang.Object r7 = r6.L$0
                    r1 = r7
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                    ac.Api$SaveRequest$Builder r7 = ac.Api.SaveRequest.newBuilder()
                    com.sfbx.appconsent.core.repository.ConsentRepository r4 = r6.this$0
                    java.lang.String r4 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getAppKey$p(r4)
                    ac.Api$SaveRequest$Builder r7 = r7.setAppKey(r4)
                    com.sfbx.appconsent.core.repository.ConsentRepository r4 = r6.this$0
                    com.sfbx.appconsent.core.provider.UserProvider r4 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMUserProvider$p(r4)
                    java.lang.String r4 = r4.getUserId()
                    ac.Api$SaveRequest$Builder r7 = r7.setUuid(r4)
                    ac.Models$Consent r4 = r6.$consent
                    ac.Api$SaveRequest$Builder r7 = r7.setConsent(r4)
                    com.sfbx.appconsent.core.model.reducer.State r4 = r6.$state
                    java.util.List r4 = com.sfbx.appconsent.core.util.StateExtsKt.getMetricsToProto(r4)
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    ac.Api$SaveRequest$Builder r7 = r7.addAllEvents(r4)
                    com.sfbx.appconsent.core.util.Utils r4 = com.sfbx.appconsent.core.util.Utils.INSTANCE
                    java.lang.String r4 = r4.getUserAgent()
                    ac.Api$SaveRequest$Builder r7 = r7.setAgent(r4)
                    com.google.protobuf.GeneratedMessageLite r7 = r7.build()
                    ac.Api$SaveRequest r7 = (ac.Api.SaveRequest) r7
                    com.sfbx.appconsent.core.repository.ConsentRepository r4 = r6.this$0
                    com.sfbx.appconsent.core.api.AppConsentService r4 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMAppConsentService$p(r4)
                    java.lang.String r5 = "saveRequest"
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
                    r6.L$0 = r1
                    r6.label = r3
                    java.lang.Object r7 = r4.sendConsents(r7, r6)
                    if (r7 != r0) goto L7f
                    goto L8a
                L7f:
                    r3 = 0
                    r6.L$0 = r3
                    r6.label = r2
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L8b
                L8a:
                    return r0
                L8b:
                    tu.x0 r7 = tu.x0.f87415a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.C36671.C05051.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kv.p
            public final Object invoke(FlowCollector<? super Api.SaveReply> flowCollector, d<? super x0> dVar) {
                return ((C05051) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$2", f = "ConsentRepository.kt", i = {}, l = {676}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements q {
            final /* synthetic */ List<AppConsentNoticeListener> $listeners;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$2$1", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$2$1, reason: invalid class name and collision with other inner class name */
            public static final class C05061 extends n implements p {
                final /* synthetic */ Throwable $it;
                final /* synthetic */ List<AppConsentNoticeListener> $listeners;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C05061(List<? extends AppConsentNoticeListener> list, Throwable th2, d<? super C05061> dVar) {
                    super(2, dVar);
                    this.$listeners = list;
                    this.$it = th2;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    return new C05061(this.$listeners, this.$it, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    e.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    List<AppConsentNoticeListener> list = this.$listeners;
                    Throwable th2 = this.$it;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.ConsentCachedError(th2));
                    }
                    return x0.f87415a;
                }

                @Override // kv.p
                public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                    return ((C05061) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(List<? extends AppConsentNoticeListener> list, d<? super AnonymousClass2> dVar) {
                super(3, dVar);
                this.$listeners = list;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Throwable th2 = (Throwable) this.L$1;
                    BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new C05061(this.$listeners, th2, null), 3, null);
                    Api.SaveReply.Builder builderNewBuilder = Api.SaveReply.newBuilder();
                    AcError.ErrorResponse.Builder code = AcError.ErrorResponse.newBuilder().setCode(AcError.ErrorCode.UNKNOWN);
                    String message = th2.getMessage();
                    if (message == null) {
                        message = "Error UNKNOWN";
                    }
                    Api.SaveReply saveReplyBuild = builderNewBuilder.setError(code.setDescription(message).build()).build();
                    e0.checkNotNullExpressionValue(saveReplyBuild, "newBuilder()\n           …                 .build()");
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(saveReplyBuild, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super Api.SaveReply> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$listeners, dVar);
                anonymousClass2.L$0 = flowCollector;
                anonymousClass2.L$1 = th2;
                return anonymousClass2.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$3", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends n implements p {
            final /* synthetic */ State $state;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConsentRepository this$0;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$3$1", f = "ConsentRepository.kt", i = {}, l = {691}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$3$1, reason: invalid class name and collision with other inner class name */
            public static final class C05071 extends n implements p {
                final /* synthetic */ Api.SaveReply $saveReply;
                final /* synthetic */ State $state;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ConsentRepository this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05071(ConsentRepository consentRepository, State state, Api.SaveReply saveReply, d<? super C05071> dVar) {
                    super(2, dVar);
                    this.this$0 = consentRepository;
                    this.$state = state;
                    this.$saveReply = saveReply;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    C05071 c05071 = new C05071(this.this$0, this.$state, this.$saveReply, dVar);
                    c05071.L$0 = obj;
                    return c05071;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 == 0) {
                        a0.throwOnFailure(obj);
                        final FlowCollector flowCollector = (FlowCollector) this.L$0;
                        ConsentProvider consentProvider = this.this$0.mConsentProvider;
                        String consentString = this.$state.getConsentString();
                        if (consentString == null) {
                            consentString = "";
                        }
                        Flow<MobileTcfStorage> mobileTcfStorage = consentProvider.getMobileTcfStorage(consentString);
                        final ConsentRepository consentRepository = this.this$0;
                        final State state = this.$state;
                        final Api.SaveReply saveReply = this.$saveReply;
                        FlowCollector<? super MobileTcfStorage> flowCollector2 = new FlowCollector() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository.saveConsents.1.3.1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                                return emit((MobileTcfStorage) obj2, (d<? super x0>) dVar);
                            }

                            public final Object emit(MobileTcfStorage mobileTcfStorage2, d<? super x0> dVar) {
                                String cmpHash;
                                ConsentProvider consentProvider2 = consentRepository.mConsentProvider;
                                List<VendorReducer> vendors = state.getConsents().getVendors();
                                ArrayList arrayList = new ArrayList();
                                for (T t10 : vendors) {
                                    VendorReducer vendorReducer = (VendorReducer) t10;
                                    if (vendorReducer.getExtraId() != null && vendorReducer.getStatus() == ConsentStatus.ALLOWED.getValue$appconsent_core_prodXchangeRelease()) {
                                        arrayList.add(t10);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<T> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    String extraId = ((VendorReducer) it.next()).getExtraId();
                                    if (extraId != null) {
                                        arrayList2.add(extraId);
                                    }
                                }
                                consentProvider2.updateIABConsentsInCache(mobileTcfStorage2, arrayList2);
                                List<Consentable> consentables = StateExtsKt.getConsentables(state);
                                ArrayList arrayList3 = new ArrayList();
                                for (T t11 : consentables) {
                                    if (((Consentable) t11).isGeolocation()) {
                                        arrayList3.add(t11);
                                    }
                                }
                                ConsentRepository consentRepository2 = consentRepository;
                                Duration consentExpiration = saveReply.getConsentExpiration();
                                e0.checkNotNullExpressionValue(consentExpiration, "saveReply.consentExpiration");
                                long expirationTime = consentRepository2.getExpirationTime(consentExpiration);
                                consentRepository.mConsentProvider.setNoticeExpirationTime(expirationTime);
                                if (!arrayList3.isEmpty()) {
                                    if (arrayList3.isEmpty()) {
                                        consentRepository.mConsentProvider.setGeolocationExpirationTime(expirationTime);
                                    } else {
                                        Iterator<T> it2 = arrayList3.iterator();
                                        while (it2.hasNext()) {
                                            if (((Consentable) it2.next()).getStatus() == ConsentStatus.PENDING) {
                                                break;
                                            }
                                        }
                                        consentRepository.mConsentProvider.setGeolocationExpirationTime(expirationTime);
                                    }
                                }
                                consentRepository.mConfigurationProvider.setLastGvlVersion(state.getVendorList().getGvlVersion());
                                ConfigurationProvider configurationProvider = consentRepository.mConfigurationProvider;
                                HelloReply helloReply = consentRepository.mConfigurationProvider.getHelloReply();
                                if (helloReply == null || (cmpHash = helloReply.getCmpHash()) == null) {
                                    cmpHash = "";
                                }
                                configurationProvider.setLastCmpHash(cmpHash);
                                Object objEmit = flowCollector.emit(saveReply, dVar);
                                return objEmit == e.getCOROUTINE_SUSPENDED() ? objEmit : x0.f87415a;
                            }
                        };
                        this.label = 1;
                        if (mobileTcfStorage.collect(flowCollector2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0.throwOnFailure(obj);
                    }
                    return x0.f87415a;
                }

                @Override // kv.p
                public final Object invoke(FlowCollector<? super Api.SaveReply> flowCollector, d<? super x0> dVar) {
                    return ((C05071) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ConsentRepository consentRepository, State state, d<? super AnonymousClass3> dVar) {
                super(2, dVar);
                this.this$0 = consentRepository;
                this.$state = state;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$state, dVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kv.p
            public final Object invoke(Api.SaveReply saveReply, d<? super Flow<Api.SaveReply>> dVar) {
                return ((AnonymousClass3) create(saveReply, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return FlowKt.flow(new C05071(this.this$0, this.$state, (Api.SaveReply) this.L$0, null));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends n implements p {
            final /* synthetic */ State $state;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConsentRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ConsentRepository consentRepository, State state, d<? super AnonymousClass4> dVar) {
                super(2, dVar);
                this.this$0 = consentRepository;
                this.$state = state;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$state, dVar);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kv.p
            public final Object invoke(Api.SaveReply saveReply, d<? super Flow<Api.SaveReply>> dVar) {
                return ((AnonymousClass4) create(saveReply, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                final Api.SaveReply saveReply = (Api.SaveReply) this.L$0;
                final Flow<String> googleAdditionalConsent = this.this$0.mConsentProvider.getGoogleAdditionalConsent(this.$state);
                final ConsentRepository consentRepository = this.this$0;
                return new Flow<Api.SaveReply>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ Api.SaveReply $saveReply$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ ConsentRepository this$0;

                        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                        @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends bv.d {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // bv.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, ConsentRepository consentRepository, Api.SaveReply saveReply) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = consentRepository;
                            this.$saveReply$inlined = saveReply;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                tu.a0.throwOnFailure(r6)
                                goto L4c
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                tu.a0.throwOnFailure(r6)
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                                java.lang.String r5 = (java.lang.String) r5
                                com.sfbx.appconsent.core.repository.ConsentRepository r2 = r4.this$0
                                com.sfbx.appconsent.core.provider.ConsentProvider r2 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r2)
                                r2.updateGoogleAdditionalConsent(r5)
                                ac.Api$SaveReply r5 = r4.$saveReply$inlined
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L4c
                                return r1
                            L4c:
                                tu.x0 r5 = tu.x0.f87415a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$1$4$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Api.SaveReply> flowCollector, d dVar) {
                        Object objCollect = googleAdditionalConsent.collect(new AnonymousClass2(flowCollector, consentRepository, saveReply), dVar);
                        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
                    }
                };
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C36671(List<? extends AppConsentNoticeListener> list, d<? super C36671> dVar) {
            super(2, dVar);
            this.$listeners = list;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36671 c36671 = ConsentRepository.this.new C36671(this.$listeners, dVar);
            c36671.L$0 = obj;
            return c36671;
        }

        @Override // kv.p
        public final Object invoke(State state, d<? super Flow<Api.SaveReply>> dVar) {
            return ((C36671) create(state, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            State state = (State) this.L$0;
            ConsentRepository.this.mStateDao.save(state);
            ConsentRepository.this.mConsentProvider.setSyncNeeded(false);
            ConsentRepository.this.mConsentProvider.setNeedToUpdate(false);
            return FlowKt.flatMapConcat(FlowKt.flatMapConcat(FlowKt.m5171catch(FlowKt.flow(new C05051(ConsentRepository.this, StateExtsKt.toProtoConsent(state, ConsentRepository.this.mConsentProvider, ConsentRepository.this.mConfigurationProvider, ConsentRepository.this.mUserProvider), state, null)), new AnonymousClass2(this.$listeners, null)), new AnonymousClass3(ConsentRepository.this, state, null)), new AnonymousClass4(ConsentRepository.this, state, null));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$3", f = "ConsentRepository.kt", i = {}, l = {746}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$3, reason: invalid class name and case insensitive filesystem */
    public static final class C36683 extends n implements q {
        final /* synthetic */ List<AppConsentNoticeListener> $listeners;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$3$1", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ Throwable $it;
            final /* synthetic */ List<AppConsentNoticeListener> $listeners;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(List<? extends AppConsentNoticeListener> list, Throwable th2, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$listeners = list;
                this.$it = th2;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$listeners, this.$it, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                List<AppConsentNoticeListener> list = this.$listeners;
                Throwable th2 = this.$it;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((AppConsentNoticeListener) it.next()).onError(new AppConsentError.ConsentCachedError(th2));
                }
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C36683(List<? extends AppConsentNoticeListener> list, d<? super C36683> dVar) {
            super(3, dVar);
            this.$listeners = list;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(a.p(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), null, null, new AnonymousClass1(this.$listeners, (Throwable) this.L$1, null), 3, null);
                ConsentRepository.this.mConsentProvider.setSyncNeeded(true);
                Boolean boolBoxBoolean = b.boxBoolean(false);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, d<? super x0> dVar) {
            C36683 c36683 = ConsentRepository.this.new C36683(this.$listeners, dVar);
            c36683.L$0 = flowCollector;
            c36683.L$1 = th2;
            return c36683.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$1", f = "ConsentRepository.kt", i = {}, l = {812, 811}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36691 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public C36691(d<? super C36691> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36691 c36691 = ConsentRepository.this.new C36691(dVar);
            c36691.L$0 = obj;
            return c36691;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
                r10 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                tu.a0.throwOnFailure(r11)
                goto L9b
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r11)
                goto L8f
            L23:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                long r4 = java.lang.System.currentTimeMillis()
                com.sfbx.appconsent.core.repository.ConsentRepository r11 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.api.AppConsentService r11 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMAppConsentService$p(r11)
                ac.Api$SaveExternalRequest$Builder r6 = ac.Api.SaveExternalRequest.newBuilder()
                com.sfbx.appconsent.core.repository.ConsentRepository r7 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                java.lang.String r7 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getAppKey$p(r7)
                ac.Api$SaveExternalRequest$Builder r6 = r6.setAppKey(r7)
                com.sfbx.appconsent.core.repository.ConsentRepository r7 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.UserProvider r7 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMUserProvider$p(r7)
                java.lang.String r7 = r7.getUserId()
                ac.Api$SaveExternalRequest$Builder r6 = r6.setUuid(r7)
                com.sfbx.appconsent.core.repository.ConsentRepository r7 = com.sfbx.appconsent.core.repository.ConsentRepository.this
                com.sfbx.appconsent.core.provider.ConsentProvider r7 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r7)
                java.util.Map r7 = r7.getExternalIds()
                ac.Api$SaveExternalRequest$Builder r6 = r6.putAllExternalIds(r7)
                com.google.protobuf.Timestamp$Builder r7 = com.google.protobuf.Timestamp.newBuilder()
                r8 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 / r8
                com.google.protobuf.Timestamp$Builder r4 = r7.setSeconds(r4)
                r5 = 0
                com.google.protobuf.Timestamp$Builder r4 = r4.setNanos(r5)
                com.google.protobuf.GeneratedMessageLite r4 = r4.build()
                com.google.protobuf.Timestamp r4 = (com.google.protobuf.Timestamp) r4
                ac.Api$SaveExternalRequest$Builder r4 = r6.setGivenAt(r4)
                com.google.protobuf.GeneratedMessageLite r4 = r4.build()
                java.lang.String r5 = "newBuilder()\n           …                 .build()"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r5)
                ac.Api$SaveExternalRequest r4 = (ac.Api.SaveExternalRequest) r4
                r10.L$0 = r1
                r10.label = r3
                java.lang.Object r11 = r11.saveExternalIds(r4, r10)
                if (r11 != r0) goto L8f
                goto L9a
            L8f:
                r3 = 0
                r10.L$0 = r3
                r10.label = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L9b
            L9a:
                return r0
            L9b:
                tu.x0 r11 = tu.x0.f87415a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.C36691.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super Api.SaveExternalReply> flowCollector, d<? super x0> dVar) {
            return ((C36691) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$1", f = "ConsentRepository.kt", i = {}, l = {772, 771}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36701 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public C36701(d<? super C36701> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C36701 c36701 = ConsentRepository.this.new C36701(dVar);
            c36701.L$0 = obj;
            return c36701;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0142, code lost:
        
            if (r1.emit(r14, r13) == r0) goto L43;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.C36701.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super Api.SaveFloatingExtraPurposeReply> flowCollector, d<? super x0> dVar) {
            return ((C36701) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$sendNewDisplayMetric$1", f = "ConsentRepository.kt", i = {}, l = {539}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$sendNewDisplayMetric$1, reason: invalid class name and case insensitive filesystem */
    public static final class C36711 extends n implements p {
        int label;

        public C36711(d<? super C36711> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return ConsentRepository.this.new C36711(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AppConsentService appConsentService = ConsentRepository.this.mAppConsentService;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ConsentRepository consentRepository = ConsentRepository.this;
                linkedHashMap.put("a", consentRepository.appKey);
                linkedHashMap.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, consentRepository.mUserProvider.getUserId());
                linkedHashMap.put("n", "display");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ConsentRepository consentRepository2 = ConsentRepository.this;
                linkedHashMap2.put("agent", Utils.INSTANCE.getUserAgent());
                linkedHashMap2.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, consentRepository2.mUserProvider.getLanguage());
                this.label = 1;
                if (appConsentService.m3442sendDisplayMetric0E7RQCE(linkedHashMap, linkedHashMap2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                ((z) obj).m7139unboximpl();
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C36711) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public ConsentRepository(CoroutineDispatcher dispatcher, Context context, StateDao mStateDao, ConsentProvider mConsentProvider, ConfigurationProvider mConfigurationProvider, UserProvider mUserProvider, AppConsentService mAppConsentService, TimeoutProvider timeoutProvider, ConnectivityController connectivityController) {
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(mStateDao, "mStateDao");
        e0.checkNotNullParameter(mConsentProvider, "mConsentProvider");
        e0.checkNotNullParameter(mConfigurationProvider, "mConfigurationProvider");
        e0.checkNotNullParameter(mUserProvider, "mUserProvider");
        e0.checkNotNullParameter(mAppConsentService, "mAppConsentService");
        e0.checkNotNullParameter(timeoutProvider, "timeoutProvider");
        e0.checkNotNullParameter(connectivityController, "connectivityController");
        this.dispatcher = dispatcher;
        this.context = context;
        this.mStateDao = mStateDao;
        this.mConsentProvider = mConsentProvider;
        this.mConfigurationProvider = mConfigurationProvider;
        this.mUserProvider = mUserProvider;
        this.mAppConsentService = mAppConsentService;
        this.timeoutProvider = timeoutProvider;
        this.connectivityController = connectivityController;
        this.lock = MutexKt.Mutex$default(false, 1, null);
        this.appKey = "";
        DurationUnit durationUnit = DurationUnit.MINUTES;
        this.rateLimiter = new RateLimiter(30, durationUnit, timeoutProvider);
        this.checkForUpdateRateLimiter = new RateLimiter(30, durationUnit, timeoutProvider);
        this.GDPRRateLimiter = new RateLimiter(4, DurationUnit.HOURS, timeoutProvider);
    }

    private final Flow<Api.HelloReply> checkForUpdate() {
        return FlowKt.flow(new AnonymousClass1(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow getConfigurationFromServer$default(ConsentRepository consentRepository, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            list = p0.emptyList();
        }
        return consentRepository.getConfigurationFromServer(z10, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getExpirationTime(Duration duration) {
        long j10 = 365 * 24 * 3600;
        long seconds = duration.getSeconds();
        if (seconds > 0) {
            j10 = seconds;
        }
        return System.currentTimeMillis() + (j10 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFloatingFromHello(FloatingConsent floatingConsent) {
        if (!this.mConsentProvider.getFloatingPurposes().isEmpty() || floatingConsent == null) {
            return;
        }
        ConsentProvider consentProvider = this.mConsentProvider;
        String id2 = floatingConsent.getId();
        if (id2 == null) {
            id2 = "";
        }
        consentProvider.setFloatingPurposes(o1.mapOf(tu.e0.to(id2, Boolean.valueOf(floatingConsent.getStatus() == ConsentStatus.ALLOWED))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow getHelloReply$default(ConsentRepository consentRepository, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = p0.emptyList();
        }
        return consentRepository.getHelloReply(list, z10);
    }

    private final Flow<HelloReply> getHelloReplyFromCacheOrRemote(boolean z10, List<? extends AppConsentNoticeListener> list) {
        return FlowKt.m5171catch(FlowKt.flow(new C36591(z10, this, null)), new AnonymousClass2(list, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow getHelloReplyFromCacheOrRemote$default(ConsentRepository consentRepository, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = p0.emptyList();
        }
        return consentRepository.getHelloReplyFromCacheOrRemote(z10, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow getNotice$default(ConsentRepository consentRepository, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = p0.emptyList();
        }
        return consentRepository.getNotice(list, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Notice> getNoticeFromHello(final HelloReply helloReply, List<? extends AppConsentNoticeListener> list) {
        final Flow flowM5171catch = FlowKt.m5171catch(FlowKt.flow(new C36631(helloReply, list, null)), new C36642(null));
        return FlowKt.flowOn(FlowKt.m5171catch(new Flow<Notice>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ HelloReply $helloReply$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConsentRepository this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, HelloReply helloReply, ConsentRepository consentRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$helloReply$inlined = helloReply;
                    this.this$0 = consentRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zu.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        tu.a0.throwOnFailure(r7)
                        goto La8
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        tu.a0.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.reducer.State r6 = (com.sfbx.appconsent.core.model.reducer.State) r6
                        com.sfbx.appconsent.core.model.reducer.VendorListReducer r2 = r6.getVendorList()
                        java.util.List r2 = r2.getGeolocAds()
                        boolean r2 = r2.isEmpty()
                        if (r2 == 0) goto L60
                        com.sfbx.appconsent.core.model.reducer.VendorListReducer r2 = r6.getVendorList()
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r4 = r5.$helloReply$inlined
                        com.sfbx.appconsent.core.model.api.proto.VendorList r4 = r4.getVendorList()
                        if (r4 == 0) goto L59
                        java.util.List r4 = r4.getGeolocAds()
                        if (r4 != 0) goto L5d
                    L59:
                        java.util.List r4 = uu.p0.emptyList()
                    L5d:
                        r2.setGeolocAds(r4)
                    L60:
                        com.sfbx.appconsent.core.model.reducer.VendorListReducer r2 = r6.getVendorList()
                        java.util.List r2 = r2.getGeolocMarkets()
                        boolean r2 = r2.isEmpty()
                        if (r2 == 0) goto L87
                        com.sfbx.appconsent.core.model.reducer.VendorListReducer r2 = r6.getVendorList()
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r4 = r5.$helloReply$inlined
                        com.sfbx.appconsent.core.model.api.proto.VendorList r4 = r4.getVendorList()
                        if (r4 == 0) goto L80
                        java.util.List r4 = r4.getGeolocMarkets()
                        if (r4 != 0) goto L84
                    L80:
                        java.util.List r4 = uu.p0.emptyList()
                    L84:
                        r2.setGeolocMarkets(r4)
                    L87:
                        com.sfbx.appconsent.core.repository.ConsentRepository r2 = r5.this$0
                        com.sfbx.appconsent.core.provider.ConfigurationProvider r2 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConfigurationProvider$p(r2)
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r4 = r5.$helloReply$inlined
                        r2.setHelloReply(r4)
                        com.sfbx.appconsent.core.repository.ConsentRepository r2 = r5.this$0
                        com.sfbx.appconsent.core.dao.StateDao r2 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMStateDao$p(r2)
                        r2.saveTemporaryState(r6)
                        com.sfbx.appconsent.core.model.Notice r6 = com.sfbx.appconsent.core.util.StateExtsKt.toNotice(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto La8
                        return r1
                    La8:
                        tu.x0 r6 = tu.x0.f87415a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$getNoticeFromHello$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Notice> flowCollector, d dVar) {
                Object objCollect = flowM5171catch.collect(new AnonymousClass2(flowCollector, helloReply, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new AnonymousClass4(null)), this.dispatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow getNoticeFromHello$default(ConsentRepository consentRepository, HelloReply helloReply, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = p0.emptyList();
        }
        return consentRepository.getNoticeFromHello(helloReply, list);
    }

    private final boolean isCheckForUpdateCacheObsolete() {
        return this.checkForUpdateRateLimiter.isTimeOver(KEY_CHECK_FOR_UPDATE_RESPONSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHelloConsentSameAsState(HelloReply helloReply, State state) {
        Consent coreConsent = StateExtsKt.toCoreConsent(state, this.mConsentProvider, this.mConfigurationProvider, this.mUserProvider);
        Consent consent = helloReply.getConsent();
        boolean zAreEqual = e0.areEqual(consent != null ? consent.getPurposesConsent() : null, coreConsent.getPurposesConsent());
        Consent consent2 = helloReply.getConsent();
        boolean zAreEqual2 = e0.areEqual(consent2 != null ? consent2.getPurposesLITransparency() : null, coreConsent.getPurposesLITransparency());
        Consent consent3 = helloReply.getConsent();
        boolean zAreEqual3 = e0.areEqual(consent3 != null ? consent3.getVendorsConsent() : null, coreConsent.getVendorsConsent());
        Consent consent4 = helloReply.getConsent();
        boolean zAreEqual4 = e0.areEqual(consent4 != null ? consent4.getVendorLIT() : null, coreConsent.getVendorLIT());
        Consent consent5 = helloReply.getConsent();
        return zAreEqual && zAreEqual2 && zAreEqual3 && zAreEqual4 && e0.areEqual(consent5 != null ? consent5.getSpecialFeatureOptIns() : null, coreConsent.getSpecialFeatureOptIns());
    }

    private final boolean isHelloReplyCacheObsolete() {
        return this.rateLimiter.isTimeOver(KEY_HELLO_REPLY_RESPONSE);
    }

    private final boolean isNeedToCallHelloCheckForUpdateWs() {
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ">> isNeedToCallHelloCheckForUpdateWs", null, 4, null);
        boolean zIsCheckForUpdateCacheObsolete = isCheckForUpdateCacheObsolete();
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloCheckForUpdateWs :: isCheckForUpdateCacheObsolete ? " + zIsCheckForUpdateCacheObsolete, null, 4, null);
        e0.checkNotNullExpressionValue(tag2, "tag");
        StringBuilder sb2 = new StringBuilder(":: isNeedToCallHelloCheckForUpdateWs :: is memory cache is available ? ");
        sb2.append(this.checkForUpdateResponse != null);
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, sb2.toString(), null, 4, null);
        if (!zIsCheckForUpdateCacheObsolete && this.checkForUpdateResponse == null) {
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloCheckForUpdateWs :: Cache not obsolete but not loaded into memory", null, 4, null);
            boolean zIsCheckForUpdateHelloReplayCacheIsPresent = this.mConfigurationProvider.isCheckForUpdateHelloReplayCacheIsPresent();
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloCheckForUpdateWs :: is cache is present ? " + zIsCheckForUpdateHelloReplayCacheIsPresent, null, 4, null);
            if (zIsCheckForUpdateHelloReplayCacheIsPresent) {
                e0.checkNotNullExpressionValue(tag2, "tag");
                ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloCheckForUpdateWs :: Cache is present, so we load it into memory", null, 4, null);
                this.checkForUpdateResponse = this.mConfigurationProvider.getCheckForUpdateHelloReply();
                e0.checkNotNullExpressionValue(tag2, "tag");
                ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloCheckForUpdateWs :: Memory cache loaded", null, 4, null);
            }
        }
        boolean z10 = this.checkForUpdateResponse == null || zIsCheckForUpdateCacheObsolete;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloCheckForUpdateWs :: is need to call WS ? " + z10, null, 4, null);
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "<< isNeedToCallHelloCheckForUpdateWs", null, 4, null);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow saveConsents$default(ConsentRepository consentRepository, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = p0.emptyList();
        }
        return consentRepository.saveConsents(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToUpdateGDPRApplyValueFromBO(CountryProto countryProto) {
        if (countryProto != null) {
            if (this.mConsentProvider.isGdprForcedByClient()) {
                this.mConsentProvider.updateGdprFromBOInCache(true);
                this.GDPRRateLimiter.shouldFetch(KEY_GDPR_COUNTRY_RESPONSE, true);
            } else {
                this.mConsentProvider.updateGdprFromBOInCache(countryProto.getGdpr());
                this.GDPRRateLimiter.shouldFetch(KEY_GDPR_COUNTRY_RESPONSE, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #1 {all -> 0x0104, blocks: (B:29:0x006a, B:31:0x0070, B:42:0x0108), top: B:55:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108 A[Catch: all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0104, blocks: (B:29:0x006a, B:31:0x0070, B:42:0x0108), top: B:55:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkForUpdateWithCache(zu.d<? super com.sfbx.appconsent.core.model.api.proto.HelloReply> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.checkForUpdateWithCache(zu.d):java.lang.Object");
    }

    public final void defineAppKey$appconsent_core_prodXchangeRelease(String appKey) {
        e0.checkNotNullParameter(appKey, "appKey");
        this.appKey = appKey;
    }

    public final RateLimiter getCheckForUpdateRateLimiter$appconsent_core_prodXchangeRelease() {
        return this.checkForUpdateRateLimiter;
    }

    public final HelloReply getCheckForUpdateResponse$appconsent_core_prodXchangeRelease() {
        return this.checkForUpdateResponse;
    }

    public final Flow<Configuration> getConfigurationFromServer(boolean z10, List<? extends AppConsentNoticeListener> listeners) {
        e0.checkNotNullParameter(listeners, "listeners");
        final Flow flow = FlowKt.flow(new C36581(z10, null));
        return FlowKt.flowOn(FlowKt.m5171catch(new Flow<Configuration>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConsentRepository this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ConsentRepository consentRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = consentRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r5 = (com.sfbx.appconsent.core.model.api.proto.HelloReply) r5
                        com.sfbx.appconsent.core.repository.ConsentRepository r2 = r4.this$0
                        boolean r2 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getFromCache$p(r2)
                        if (r2 != 0) goto L49
                        com.sfbx.appconsent.core.repository.ConsentRepository r2 = r4.this$0
                        com.sfbx.appconsent.core.provider.ConfigurationProvider r2 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConfigurationProvider$p(r2)
                        r2.setHelloReply(r5)
                    L49:
                        com.sfbx.appconsent.core.model.api.proto.Configuration r5 = r5.getConfiguration()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L56
                        return r1
                    L56:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$getConfigurationFromServer$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Configuration> flowCollector, d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new AnonymousClass3(listeners, null)), this.dispatcher);
    }

    public final RateLimiter getGDPRRateLimiter$appconsent_core_prodXchangeRelease() {
        return this.GDPRRateLimiter;
    }

    public final Flow<HelloReply> getHelloReply(final List<? extends AppConsentNoticeListener> listeners, boolean z10) {
        e0.checkNotNullParameter(listeners, "listeners");
        final Flow<HelloReply> helloReplyFromCacheOrRemote = getHelloReplyFromCacheOrRemote(z10, listeners);
        return FlowKt.flowOn(new Flow<HelloReply>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ List $listeners$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConsentRepository this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1$2", f = "ConsentRepository.kt", i = {0}, l = {231, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ConsentRepository consentRepository, List list) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = consentRepository;
                    this.$listeners$inlined = list;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
                
                    if (r2.emit(r9, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, zu.d r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        tu.a0.throwOnFailure(r10)
                        goto L7e
                    L2d:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L35:
                        java.lang.Object r9 = r0.L$1
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r9 = (com.sfbx.appconsent.core.model.api.proto.HelloReply) r9
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        tu.a0.throwOnFailure(r10)
                        goto L71
                    L41:
                        tu.a0.throwOnFailure(r10)
                        kotlinx.coroutines.flow.FlowCollector r2 = r8.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r9 = (com.sfbx.appconsent.core.model.api.proto.HelloReply) r9
                        com.sfbx.appconsent.core.repository.ConsentRepository r10 = r8.this$0
                        com.sfbx.appconsent.core.model.FloatingConsent r6 = r9.getFloatingConsent()
                        com.sfbx.appconsent.core.repository.ConsentRepository.access$getFloatingFromHello(r10, r6)
                        com.sfbx.appconsent.core.repository.ConsentRepository r10 = r8.this$0
                        java.util.List r6 = r8.$listeners$inlined
                        kotlinx.coroutines.flow.Flow r10 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getNoticeFromHello(r10, r9, r6)
                        com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$1$1 r6 = new com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$1$1
                        java.util.List r7 = r8.$listeners$inlined
                        r6.<init>(r7, r5)
                        kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.m5171catch(r10, r6)
                        r0.L$0 = r2
                        r0.L$1 = r9
                        r0.label = r4
                        java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.collect(r10, r0)
                        if (r10 != r1) goto L71
                        goto L7d
                    L71:
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r9 = r2.emit(r9, r0)
                        if (r9 != r1) goto L7e
                    L7d:
                        return r1
                    L7e:
                        tu.x0 r9 = tu.x0.f87415a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super HelloReply> flowCollector, d dVar) {
                Object objCollect = helloReplyFromCacheOrRemote.collect(new AnonymousClass2(flowCollector, this, listeners), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, this.dispatcher);
    }

    public final HelloReply getHelloReply$appconsent_core_prodXchangeRelease() {
        return this.helloReply;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getHelloReplyFromRemote$appconsent_core_prodXchangeRelease(zu.d<? super com.sfbx.appconsent.core.model.api.proto.HelloReply> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository.getHelloReplyFromRemote$appconsent_core_prodXchangeRelease(zu.d):java.lang.Object");
    }

    public final Flow<HelloReply> getLiteHelloReplyFromRemoteAndUpdateGDPRLocalCache() {
        return FlowKt.flatMapConcat(FlowKt.m5171catch(checkForUpdate(), new C36601(null)), new C36612(null));
    }

    public final Flow<Notice> getNotice(final List<? extends AppConsentNoticeListener> listeners, boolean z10) {
        e0.checkNotNullParameter(listeners, "listeners");
        final Flow<HelloReply> helloReplyFromCacheOrRemote = getHelloReplyFromCacheOrRemote(z10, listeners);
        return FlowKt.flowOn(FlowKt.m5171catch(new Flow<Notice>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ List $listeners$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConsentRepository this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ConsentRepository consentRepository, List list) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = consentRepository;
                    this.$listeners$inlined = list;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
                
                    if (r8.emit((com.sfbx.appconsent.core.model.Notice) r9, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, zu.d r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        tu.a0.throwOnFailure(r9)
                        goto L70
                    L2c:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L34:
                        java.lang.Object r8 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                        tu.a0.throwOnFailure(r9)
                        goto L62
                    L3c:
                        tu.a0.throwOnFailure(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.$this_unsafeFlow
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r8 = (com.sfbx.appconsent.core.model.api.proto.HelloReply) r8
                        com.sfbx.appconsent.core.repository.ConsentRepository r2 = r7.this$0
                        com.sfbx.appconsent.core.model.FloatingConsent r5 = r8.getFloatingConsent()
                        com.sfbx.appconsent.core.repository.ConsentRepository.access$getFloatingFromHello(r2, r5)
                        com.sfbx.appconsent.core.repository.ConsentRepository r2 = r7.this$0
                        java.util.List r5 = r7.$listeners$inlined
                        kotlinx.coroutines.flow.Flow r8 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getNoticeFromHello(r2, r8, r5)
                        r0.L$0 = r9
                        r0.label = r4
                        java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r0)
                        if (r8 != r1) goto L5f
                        goto L6f
                    L5f:
                        r6 = r9
                        r9 = r8
                        r8 = r6
                    L62:
                        com.sfbx.appconsent.core.model.Notice r9 = (com.sfbx.appconsent.core.model.Notice) r9
                        r2 = 0
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r8 = r8.emit(r9, r0)
                        if (r8 != r1) goto L70
                    L6f:
                        return r1
                    L70:
                        tu.x0 r8 = tu.x0.f87415a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$getNotice$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Notice> flowCollector, d dVar) {
                Object objCollect = helloReplyFromCacheOrRemote.collect(new AnonymousClass2(flowCollector, this, listeners), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new C36622(null)), this.dispatcher);
    }

    public final Flow<Bitmap> getQrCode(String data) {
        e0.checkNotNullParameter(data, "data");
        return FlowKt.flow(new C36651(data, null));
    }

    public final RateLimiter getRateLimiter$appconsent_core_prodXchangeRelease() {
        return this.rateLimiter;
    }

    public final Flow<String> getVendorExpiration(long j10, boolean z10) {
        final Flow flow = FlowKt.flow(new C36661(j10, z10, this, null));
        return new Flow<String>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        ac.Api$TranslateVendorCookieRetentionReply r5 = (ac.Api.TranslateVendorCookieRetentionReply) r5
                        java.lang.String r5 = r5.getTranslation()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$getVendorExpiration$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        };
    }

    public final boolean isGDPRCacheObsolete() {
        return this.GDPRRateLimiter.isTimeOver(KEY_GDPR_COUNTRY_RESPONSE);
    }

    public final boolean isNeedToCallHelloWs() {
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ">> isNeedToCallHelloWs", null, 4, null);
        boolean zIsHelloReplyCacheObsolete = isHelloReplyCacheObsolete();
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloWs :: isHelloReplyCacheObsolete ? " + zIsHelloReplyCacheObsolete, null, 4, null);
        e0.checkNotNullExpressionValue(tag2, "tag");
        StringBuilder sb2 = new StringBuilder(":: isNeedToCallHelloWs :: is memory cache is available ? ");
        sb2.append(this.helloReply != null);
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, sb2.toString(), null, 4, null);
        if (!zIsHelloReplyCacheObsolete && this.helloReply == null) {
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloWs :: Cache not obsolete but not loaded into memory", null, 4, null);
            boolean zIsHelloReplayCacheIsPresent = this.mConfigurationProvider.isHelloReplayCacheIsPresent();
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloWs :: is cache is present ? " + zIsHelloReplayCacheIsPresent, null, 4, null);
            if (zIsHelloReplayCacheIsPresent) {
                e0.checkNotNullExpressionValue(tag2, "tag");
                ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloWs :: Cache is present, so we load it into memory", null, 4, null);
                this.helloReply = this.mConfigurationProvider.getHelloReply();
                e0.checkNotNullExpressionValue(tag2, "tag");
                ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloWs :: Memory cache loaded", null, 4, null);
            }
        }
        boolean z10 = this.helloReply == null || zIsHelloReplyCacheObsolete;
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, ":: isNeedToCallHelloWs :: is need to call WS ? " + z10, null, 4, null);
        e0.checkNotNullExpressionValue(tag2, "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, tag2, "<< isNeedToCallHelloWs", null, 4, null);
        return z10;
    }

    public final boolean isRemoveLegintableEnable() {
        VendorList vendorList;
        HelloReply helloReply = this.helloReply;
        if (helloReply == null || (vendorList = helloReply.getVendorList()) == null) {
            return false;
        }
        return vendorList.getRemoveLegintables();
    }

    public final Flow<Boolean> saveConsents(List<? extends AppConsentNoticeListener> listeners) {
        e0.checkNotNullParameter(listeners, "listeners");
        final Flow flowFlatMapConcat = FlowKt.flatMapConcat(this.mConsentProvider.dispatch(Save.INSTANCE, listeners), new C36671(listeners, null));
        return FlowKt.flowOn(FlowKt.m5171catch(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConsentRepository this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ConsentRepository consentRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = consentRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L67
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        ac.Api$SaveReply r5 = (ac.Api.SaveReply) r5
                        ac.AcError$ErrorResponse r5 = r5.getError()
                        ac.AcError$ErrorResponse r2 = ac.AcError.ErrorResponse.getDefaultInstance()
                        boolean r5 = kotlin.jvm.internal.e0.areEqual(r5, r2)
                        if (r5 != 0) goto L4f
                        com.sfbx.appconsent.core.repository.ConsentRepository r5 = r4.this$0
                        com.sfbx.appconsent.core.provider.ConsentProvider r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r5)
                        r5.setSyncNeeded(r3)
                    L4f:
                        com.sfbx.appconsent.core.repository.ConsentRepository r5 = r4.this$0
                        com.sfbx.appconsent.core.provider.ConsentProvider r5 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r5)
                        boolean r5 = r5.isSyncNeeded()
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L67
                        return r1
                    L67:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$saveConsents$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flowFlatMapConcat.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new C36683(listeners, null)), this.dispatcher);
    }

    public final Flow<AcError.ErrorResponse> saveExternalIds() {
        final Flow flow = FlowKt.flow(new C36691(null));
        return FlowKt.flowOn(new Flow<AcError.ErrorResponse>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        ac.Api$SaveExternalReply r5 = (ac.Api.SaveExternalReply) r5
                        ac.AcError$ErrorResponse r5 = r5.getError()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$saveExternalIds$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AcError.ErrorResponse> flowCollector, d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, this.dispatcher);
    }

    public final Flow<AcError.ErrorResponse> saveFloatingPurpose() {
        final Flow flow = FlowKt.flow(new C36701(null));
        return FlowKt.flowOn(new Flow<AcError.ErrorResponse>() { // from class: com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConsentRepository this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1$2", f = "ConsentRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ConsentRepository consentRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = consentRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zu.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r7)
                        goto L81
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        tu.a0.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        ac.Api$SaveFloatingExtraPurposeReply r6 = (ac.Api.SaveFloatingExtraPurposeReply) r6
                        com.sfbx.appconsent.core.repository.ConsentRepository r2 = r5.this$0
                        com.sfbx.appconsent.core.provider.ConsentProvider r2 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConsentProvider$p(r2)
                        com.sfbx.appconsent.core.repository.ConsentRepository r4 = r5.this$0
                        com.sfbx.appconsent.core.provider.ConfigurationProvider r4 = com.sfbx.appconsent.core.repository.ConsentRepository.access$getMConfigurationProvider$p(r4)
                        com.sfbx.appconsent.core.model.api.proto.HelloReply r4 = r4.getHelloReply()
                        if (r4 == 0) goto L55
                        java.lang.Integer r4 = r4.getFloatingExtraVersion()
                        if (r4 == 0) goto L55
                        int r4 = r4.intValue()
                        goto L56
                    L55:
                        r4 = -1
                    L56:
                        r2.setFloatingPurposesVersion(r4)
                        ac.AcError$ErrorResponse r2 = r6.getError()
                        java.lang.Class r2 = r2.getClass()
                        java.lang.Class<java.lang.NullPointerException> r4 = java.lang.NullPointerException.class
                        boolean r2 = r2.equals(r4)
                        boolean r4 = r6.hasError()
                        if (r4 == 0) goto L74
                        if (r2 != 0) goto L74
                        ac.AcError$ErrorResponse r6 = r6.getError()
                        goto L78
                    L74:
                        ac.AcError$ErrorResponse r6 = ac.AcError.ErrorResponse.getDefaultInstance()
                    L78:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L81
                        return r1
                    L81:
                        tu.x0 r6 = tu.x0.f87415a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.ConsentRepository$saveFloatingPurpose$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AcError.ErrorResponse> flowCollector, d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, this.dispatcher);
    }

    public final void sendNewDisplayMetric() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.dispatcher), null, null, new C36711(null), 3, null);
    }

    public final void setCheckForUpdateResponse$appconsent_core_prodXchangeRelease(HelloReply helloReply) {
        this.checkForUpdateResponse = helloReply;
    }

    public final void setHelloReply$appconsent_core_prodXchangeRelease(HelloReply helloReply) {
        this.helloReply = helloReply;
    }

    public /* synthetic */ ConsentRepository(CoroutineDispatcher coroutineDispatcher, Context context, StateDao stateDao, ConsentProvider consentProvider, ConfigurationProvider configurationProvider, UserProvider userProvider, AppConsentService appConsentService, TimeoutProvider timeoutProvider, ConnectivityController connectivityController, int i10, u uVar) {
        this((i10 & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, context, stateDao, consentProvider, configurationProvider, userProvider, appConsentService, timeoutProvider, connectivityController);
    }

    public static /* synthetic */ void getCheckForUpdateRateLimiter$appconsent_core_prodXchangeRelease$annotations() {
    }

    public static /* synthetic */ void getCheckForUpdateResponse$appconsent_core_prodXchangeRelease$annotations() {
    }

    public static /* synthetic */ void getGDPRRateLimiter$appconsent_core_prodXchangeRelease$annotations() {
    }

    public static /* synthetic */ void getHelloReply$appconsent_core_prodXchangeRelease$annotations() {
    }

    public static /* synthetic */ void getRateLimiter$appconsent_core_prodXchangeRelease$annotations() {
    }
}
