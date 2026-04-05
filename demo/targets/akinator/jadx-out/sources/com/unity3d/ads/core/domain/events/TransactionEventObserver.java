package com.unity3d.ads.core.domain.events;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TransactionEventObserver {
    private final CoroutineDispatcher defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final MutableStateFlow<Boolean> isRunning;
    private final TransactionEventRepository transactionEventRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2", f = "TransactionEventObserver.kt", i = {1}, l = {44, 46, 55}, m = "invokeSuspend", n = {"fullRequest"}, s = {"L$0"})
        /* renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C05452 extends n implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransactionEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05452(TransactionEventObserver transactionEventObserver, d<? super C05452> dVar) {
                super(2, dVar);
                this.this$0 = transactionEventObserver;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                C05452 c05452 = new C05452(this.this$0, dVar);
                c05452.L$0 = obj;
                return c05452;
            }

            @Override // kv.p
            public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, d<? super x0> dVar) {
                return ((C05452) create(transactionEventRequest, dVar)).invokeSuspend(x0.f87415a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
            
                if (r13.set(r1, r12) == r0) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
            @Override // bv.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                    int r1 = r12.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r4) goto L28
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    tu.a0.throwOnFailure(r13)
                    r9 = r12
                    goto Laf
                L17:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1f:
                    java.lang.Object r1 = r12.L$0
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                    tu.a0.throwOnFailure(r13)
                    r9 = r12
                    goto L80
                L28:
                    tu.a0.throwOnFailure(r13)
                    goto L5b
                L2c:
                    tu.a0.throwOnFailure(r13)
                    java.lang.Object r13 = r12.L$0
                    gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r13 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r13
                    gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
                    gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
                    java.lang.String r6 = "newBuilder()"
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r6)
                    gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r5)
                    r1.setTransactionEventRequest(r13)
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r1._build()
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = r12.this$0
                    com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)
                    r12.label = r4
                    java.lang.Object r13 = r1.invoke(r13, r12)
                    if (r13 != r0) goto L5b
                    r9 = r12
                    goto Lae
                L5b:
                    r6 = r13
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r13)
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT
                    r12.L$0 = r6
                    r12.label = r3
                    r5 = 0
                    r10 = 1
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L7f
                    goto Lae
                L7f:
                    r1 = r6
                L80:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    gatewayprotocol.v1.ErrorOuterClass$Error r13 = r13.getError()
                    if (r13 == 0) goto Laf
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r9.this$0
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r13)
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r1 = r1.getSharedData()
                    gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.getTimestamps()
                    com.google.protobuf.Timestamp r1 = r1.getTimestamp()
                    com.google.protobuf.ByteString r1 = r1.toByteString()
                    java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r3)
                    r3 = 0
                    r9.L$0 = r3
                    r9.label = r2
                    java.lang.Object r13 = r13.set(r1, r12)
                    if (r13 != r0) goto Laf
                Lae:
                    return r0
                Laf:
                    tu.x0 r13 = tu.x0.f87415a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.C05452.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return TransactionEventObserver.this.new AnonymousClass2(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Boolean bool;
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow = TransactionEventObserver.this.isRunning;
            do {
                value = mutableStateFlow.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!mutableStateFlow.compareAndSet(value, b.boxBoolean(true)));
            boolean zBooleanValue = bool.booleanValue();
            x0 x0Var = x0.f87415a;
            if (zBooleanValue) {
                return x0Var;
            }
            FlowKt.launchIn(FlowKt.onEach(TransactionEventObserver.this.transactionEventRepository.getTransactionEvents(), new C05452(TransactionEventObserver.this, null)), CoroutineScopeKt.CoroutineScope(TransactionEventObserver.this.defaultDispatcher));
            return x0Var;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, CoroutineDispatcher defaultDispatcher, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource iapTransactionStore) {
        e0.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        e0.checkNotNullParameter(gatewayClient, "gatewayClient");
        e0.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        e0.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public final Object invoke(d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.defaultDispatcher, new AnonymousClass2(null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
