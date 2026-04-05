package com.sfbx.appconsent.core.repository;

import ac.Xchange;
import android.content.Context;
import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.api.AppConsentService;
import com.sfbx.appconsent.core.provider.UserProvider;
import com.sfbx.appconsent.core.provider.XChangeProvider;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class XchangeRepository {
    private String appKey;
    private final AppConsentService mAppConsentService;
    private final Context mContext;
    private final UserProvider mUserProvider;
    private final XChangeProvider mXChangeProvider;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$1", f = "XchangeRepository.kt", i = {}, l = {43, 43}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = XchangeRepository.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.google.protobuf.InvalidProtocolBufferException, java.net.SocketException {
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
                goto L82
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r7)
                goto L76
            L22:
                tu.a0.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.sfbx.appconsent.core.repository.XchangeRepository r7 = com.sfbx.appconsent.core.repository.XchangeRepository.this
                com.sfbx.appconsent.core.provider.XChangeProvider r7 = com.sfbx.appconsent.core.repository.XchangeRepository.access$getMXChangeProvider$p(r7)
                com.sfbx.appconsent.core.repository.XchangeRepository r4 = com.sfbx.appconsent.core.repository.XchangeRepository.this
                android.content.Context r4 = com.sfbx.appconsent.core.repository.XchangeRepository.access$getMContext$p(r4)
                java.util.Map r7 = r7.generateXChangeData(r4)
                ac.Xchange$ShipRequest$Builder r4 = ac.Xchange.ShipRequest.newBuilder()
                com.sfbx.appconsent.core.repository.XchangeRepository r5 = com.sfbx.appconsent.core.repository.XchangeRepository.this
                com.sfbx.appconsent.core.provider.UserProvider r5 = com.sfbx.appconsent.core.repository.XchangeRepository.access$getMUserProvider$p(r5)
                java.lang.String r5 = r5.getUserId()
                ac.Xchange$ShipRequest$Builder r4 = r4.setUuid(r5)
                com.sfbx.appconsent.core.repository.XchangeRepository r5 = com.sfbx.appconsent.core.repository.XchangeRepository.this
                java.lang.String r5 = r5.getAppKey$appconsent_core_prodXchangeRelease()
                ac.Xchange$ShipRequest$Builder r4 = r4.setAppKey(r5)
                ac.Xchange$ShipRequest$Builder r7 = r4.putAllData(r7)
                com.google.protobuf.GeneratedMessageLite r7 = r7.build()
                ac.Xchange$ShipRequest r7 = (ac.Xchange.ShipRequest) r7
                com.sfbx.appconsent.core.repository.XchangeRepository r4 = com.sfbx.appconsent.core.repository.XchangeRepository.this
                com.sfbx.appconsent.core.api.AppConsentService r4 = com.sfbx.appconsent.core.repository.XchangeRepository.access$getMAppConsentService$p(r4)
                java.lang.String r5 = "shipRequest"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r5)
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r4.ship(r7, r6)
                if (r7 != r0) goto L76
                goto L81
            L76:
                r3 = 0
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L82
            L81:
                return r0
            L82:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.XchangeRepository.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super Xchange.ShipReply> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$3", f = "XchangeRepository.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements q {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Boolean boolBoxBoolean = b.boxBoolean(false);
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
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
            anonymousClass3.L$0 = flowCollector;
            return anonymousClass3.invokeSuspend(x0.f87415a);
        }
    }

    public XchangeRepository(Context mContext, AppConsentService mAppConsentService, XChangeProvider mXChangeProvider, UserProvider mUserProvider) {
        e0.checkNotNullParameter(mContext, "mContext");
        e0.checkNotNullParameter(mAppConsentService, "mAppConsentService");
        e0.checkNotNullParameter(mXChangeProvider, "mXChangeProvider");
        e0.checkNotNullParameter(mUserProvider, "mUserProvider");
        this.mContext = mContext;
        this.mAppConsentService = mAppConsentService;
        this.mXChangeProvider = mXChangeProvider;
        this.mUserProvider = mUserProvider;
        this.appKey = "";
    }

    public final void defineAppKey$appconsent_core_prodXchangeRelease(String appKey) {
        e0.checkNotNullParameter(appKey, "appKey");
        this.appKey = appKey;
    }

    public final String getAppKey$appconsent_core_prodXchangeRelease() {
        return this.appKey;
    }

    public final Flow<Boolean> postXChangeData() {
        final Flow flow = FlowKt.flow(new AnonymousClass1(null));
        return FlowKt.flowOn(FlowKt.m5171catch(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2", f = "XchangeRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        ac.Xchange$ShipReply r5 = (ac.Xchange.ShipReply) r5
                        ac.AcError$ErrorResponse r5 = r5.getError()
                        ac.AcError$ErrorResponse r2 = ac.AcError.ErrorResponse.getDefaultInstance()
                        boolean r5 = kotlin.jvm.internal.e0.areEqual(r5, r2)
                        java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L51
                        return r1
                    L51:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new AnonymousClass3(null)), Dispatchers.getIO());
    }

    public final void setAppKey$appconsent_core_prodXchangeRelease(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.appKey = str;
    }

    public static /* synthetic */ void getAppKey$appconsent_core_prodXchangeRelease$annotations() {
    }
}
