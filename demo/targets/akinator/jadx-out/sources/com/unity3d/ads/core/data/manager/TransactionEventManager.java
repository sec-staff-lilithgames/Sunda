package com.unity3d.ads.core.data.manager;

import av.b;
import av.e;
import bv.f;
import bv.h;
import bv.n;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TransactionEventManager {
    public static final Companion Companion = new Companion(null);
    private static final String INAPP = "inapp";
    private static final String SUBS = "subs";
    private final BillingClientAdapter billingClientAdapter;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final IsBillingClientAvailable isBillingClientAvailable;
    private final ProductDetailsFetcher productDetailsFetcher;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final TransactionEventRepository transactionEventRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        Object L$0;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return TransactionEventManager.this.new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
            } catch (Exception unused) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(TransactionEventManager.this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, null, 62, null);
            }
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                if (!TransactionEventManager.this.billingClientAdapter.isInitialized()) {
                    final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                    this.L$0 = transactionEventManager;
                    this.label = 1;
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    transactionEventManager.billingClientAdapter.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                        private final MutableStateFlow<Boolean> hasBeenResumed = StateFlowKt.MutableStateFlow(Boolean.FALSE);

                        private final void tryResume() {
                            Boolean value;
                            Boolean bool;
                            if (cancellableContinuationImpl.isActive()) {
                                MutableStateFlow<Boolean> mutableStateFlow = this.hasBeenResumed;
                                do {
                                    value = mutableStateFlow.getValue();
                                    bool = value;
                                    bool.getClass();
                                } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
                                if (bool.booleanValue()) {
                                    return;
                                }
                                CancellableContinuation<x0> cancellableContinuation = cancellableContinuationImpl;
                                int i11 = z.f87419c;
                                cancellableContinuation.resumeWith(z.m7131constructorimpl(x0.f87415a));
                            }
                        }

                        private final void tryResumeWithException(Exception exc) {
                            Boolean value;
                            Boolean bool;
                            if (cancellableContinuationImpl.isActive()) {
                                MutableStateFlow<Boolean> mutableStateFlow = this.hasBeenResumed;
                                do {
                                    value = mutableStateFlow.getValue();
                                    bool = value;
                                    bool.getClass();
                                } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
                                if (bool.booleanValue()) {
                                    return;
                                }
                                CancellableContinuation<x0> cancellableContinuation = cancellableContinuationImpl;
                                int i11 = z.f87419c;
                                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(exc)));
                            }
                        }

                        public final MutableStateFlow<Boolean> getHasBeenResumed() {
                            return this.hasBeenResumed;
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingServiceDisconnected() {
                            tryResumeWithException(new TransactionException("Billing service disconnected"));
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingSetupFinished(BillingResultBridge billingResult) {
                            e0.checkNotNullParameter(billingResult, "billingResult");
                            if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                                tryResumeWithException(new TransactionException("Billing setup failed"));
                            } else {
                                tryResume();
                            }
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                        public void onIsAlreadyInitialized() {
                            tryResume();
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                        public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> list) {
                            e0.checkNotNullParameter(billingResult, "billingResult");
                            transactionEventManager.onPurchasesReceived(billingResult, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                        }
                    });
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == e.getCOROUTINE_SUSPENDED()) {
                        h.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return x0.f87415a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            if (TransactionEventManager.this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
                BillingClientAdapter billingClientAdapter = TransactionEventManager.this.billingClientAdapter;
                final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
                final int i11 = 0;
                billingClientAdapter.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        switch (i11) {
                            case 0:
                                TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$1(transactionEventManager2, billingResultBridge, list);
                                break;
                            default:
                                TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$2(transactionEventManager2, billingResultBridge, list);
                                break;
                        }
                    }
                });
                BillingClientAdapter billingClientAdapter2 = TransactionEventManager.this.billingClientAdapter;
                final TransactionEventManager transactionEventManager3 = TransactionEventManager.this;
                final int i12 = 1;
                billingClientAdapter2.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        switch (i12) {
                            case 0:
                                TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$1(transactionEventManager3, billingResultBridge, list);
                                break;
                            default:
                                TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                                break;
                        }
                    }
                });
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135, 148, 151}, m = "invokeSuspend", n = {"transactionDataList", "deferredPurchaseList", ProductAction.ACTION_PURCHASE, InAppPurchaseMetaData.KEY_PRODUCT_ID, "purchaseTime", "index$iv", "index", "transactionDataList", "deferredPurchaseList", ProductAction.ACTION_PURCHASE, "index$iv", "index", "transactionDataList"}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$4", "I$0", "I$1", "L$0"})
    /* renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37761 extends n implements p {
        final /* synthetic */ List<PurchaseBridge> $purchases;
        final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C37761(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, d<? super C37761> dVar) {
            super(2, dVar);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
            this.$transactionOrigin = transactionOrigin;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C37761(this.$purchases, this.this$0, this.$transactionOrigin, dVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:12|(3:118|13|14)|(1:116)|65|(1:67)|73|74|106|75|76|82|85|25|(21:27|(1:29)|30|112|31|32|120|33|34|(1:37)|(3:102|39|40)(1:42)|43|(1:45)(1:46)|(2:52|(5:55|100|56|57|(6:104|59|60|110|61|(13:64|116|65|(0)|73|74|106|75|76|82|85|25|(2:86|(3:89|(0)|95))(0)))(10:72|73|74|106|75|76|82|85|25|(0)(0))))|80|114|81|82|85|25|(0)(0))(0)|93) */
        /* JADX WARN: Can't wrap try/catch for region: R(21:27|(1:29)|30|112|31|32|120|33|34|(1:37)|(3:102|39|40)(1:42)|43|(1:45)(1:46)|(2:52|(5:55|100|56|57|(6:104|59|60|110|61|(13:64|116|65|(0)|73|74|106|75|76|82|85|25|(2:86|(3:89|(0)|95))(0)))(10:72|73|74|106|75|76|82|85|25|(0)(0))))|80|114|81|82|85|25|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(6:104|59|60|110|61|(13:64|116|65|(0)|73|74|106|75|76|82|85|25|(2:86|(3:89|(0)|95))(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01b9, code lost:
        
            r12 = r14;
            r5 = r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01bc, code lost:
        
            r14 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01d5, code lost:
        
            r5 = r16;
            r7 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01d8, code lost:
        
            r15 = r2;
            r2 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01e9, code lost:
        
            r5 = r7;
            r7 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0248, code lost:
        
            if (r2 == r1) goto L93;
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01a4 A[Catch: Exception -> 0x01b6, TryCatch #8 {Exception -> 0x01b6, blocks: (B:65:0x019e, B:67:0x01a4, B:73:0x01c3), top: B:116:0x019e }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x022d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x019b -> B:116:0x019e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01c0 -> B:73:0x01c3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01de -> B:82:0x01e7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01ec -> B:76:0x01ce). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 599
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C37761.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37761) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public TransactionEventManager(CoroutineScope scope, BillingClientAdapter billingClientAdapter, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, ByteStringDataSource iapTransactionStore, SendDiagnosticEvent sendDiagnosticEvent, IsBillingClientAvailable isBillingClientAvailable, SessionRepository sessionRepository, ProductDetailsFetcher productDetailsFetcher) {
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(getTransactionData, "getTransactionData");
        e0.checkNotNullParameter(getTransactionRequest, "getTransactionRequest");
        e0.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        e0.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(isBillingClientAvailable, "isBillingClientAvailable");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(productDetailsFetcher, "productDetailsFetcher");
        this.scope = scope;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        List<? extends PurchaseBridge> list2;
        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK || (list2 = list) == null || list2.isEmpty() || this.billingClientAdapter == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C37761(list, this, transactionOrigin, null), 3, null);
    }

    public final void invoke() {
        if (!this.isBillingClientAvailable.invoke() || this.billingClientAdapter == null) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, null, 62, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
        }
    }
}
