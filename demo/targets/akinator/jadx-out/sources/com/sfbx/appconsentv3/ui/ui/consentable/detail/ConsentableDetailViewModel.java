package com.sfbx.appconsentv3.ui.ui.consentable.detail;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import av.e;
import bv.f;
import bv.n;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.explorestack.protobuf.openrtb.LossReason;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsentv3.ui.domain.IsNeedToDisplayLegitimateInterestUseCase;
import com.sfbx.appconsentv3.ui.model.QrCodeData;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import com.vungle.ads.internal.protos.Sdk;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import j1.o2;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableDetailViewModel extends AbstractTrackingViewModel {
    private final MutableSharedFlow<Response<QrCodeData>> _qrCode;
    private final IsNeedToDisplayLegitimateInterestUseCase isNeedToDisplayLegitimateInterestUseCase;
    private QrCodeData lastQrCodeData;
    private long lastQrCodeRequestTime;
    private Consentable mConsentable;
    private final SharedFlow<Response<QrCodeData>> qrCode;
    private boolean qrCodeShowing;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentableType.values().length];
            try {
                iArr[ConsentableType.STACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$1", f = "ConsentableDetailViewModel.kt", i = {}, l = {109, 134}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ boolean $forced;
        final /* synthetic */ QrCodeData $qrCodeData;
        int label;
        final /* synthetic */ ConsentableDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, ConsentableDetailViewModel consentableDetailViewModel, QrCodeData qrCodeData, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$forced = z10;
            this.this$0 = consentableDetailViewModel;
            this.$qrCodeData = qrCodeData;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$forced, this.this$0, this.$qrCodeData, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        
            if (r10.emit(r1, r9) == r0) goto L17;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r10)
                goto L72
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                tu.a0.throwOnFailure(r10)
                goto L36
            L1e:
                tu.a0.throwOnFailure(r10)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1 r10 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$1$subscriberPresent$1
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r1 = r9.this$0
                boolean r4 = r9.$forced
                r5 = 0
                r10.<init>(r1, r4, r5)
                r9.label = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r10 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r3, r10, r9)
                if (r10 != r0) goto L36
                goto L65
            L36:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r1 = r9.$forced
                java.lang.Boolean r1 = bv.b.boxBoolean(r1)
                boolean r10 = kotlin.jvm.internal.e0.areEqual(r10, r1)
                if (r10 == 0) goto L66
                io.sfbx.appconsent.logger.ACLogger r3 = io.sfbx.appconsent.logger.ACLogger.INSTANCE
                r7 = 4
                r8 = 0
                java.lang.String r4 = "ConsentableDetailViewModel"
                java.lang.String r5 = "subscriber présent, on emit value"
                r6 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r3, r4, r5, r6, r7, r8)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r10 = r9.this$0
                kotlinx.coroutines.flow.MutableSharedFlow r10 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$get_qrCode$p(r10)
                com.sfbx.appconsentv3.ui.model.Response$Success r1 = new com.sfbx.appconsentv3.ui.model.Response$Success
                com.sfbx.appconsentv3.ui.model.QrCodeData r3 = r9.$qrCodeData
                r1.<init>(r3)
                r9.label = r2
                java.lang.Object r10 = r10.emit(r1, r9)
                if (r10 != r0) goto L72
            L65:
                return r0
            L66:
                io.sfbx.appconsent.logger.ACLogger r1 = io.sfbx.appconsent.logger.ACLogger.INSTANCE
                r5 = 4
                r6 = 0
                java.lang.String r2 = "ConsentableDetailViewModel"
                java.lang.String r3 = "No subscriber... timeout has been raised"
                r4 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r1, r2, r3, r4, r5, r6)
            L72:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$2", f = "ConsentableDetailViewModel.kt", i = {0}, l = {145, 147, 160}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ String $data;
        final /* synthetic */ String $description;
        final /* synthetic */ String $title;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$data = str;
            this.$title = str2;
            this.$description = str3;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = ConsentableDetailViewModel.this.new AnonymousClass2(this.$data, this.$title, this.$description, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                tu.x0 r2 = tu.x0.f87415a
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r5) goto L21
                if (r1 != r3) goto L19
                tu.a0.throwOnFailure(r11)
                goto L9c
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L25
                goto L6e
            L25:
                r11 = move-exception
                goto L73
            L27:
                java.lang.Object r1 = r10.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r11)
                goto L4c
            L2f:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r1 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$get_qrCode$p(r1)
                com.sfbx.appconsentv3.ui.model.Response$Loading r7 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r7.<init>()
                r10.L$0 = r11
                r10.label = r4
                java.lang.Object r11 = r1.emit(r7, r10)
                if (r11 != r0) goto L4c
                goto L9b
            L4c:
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r11 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.this
                java.lang.String r1 = r10.$data
                java.lang.String r4 = r10.$title
                java.lang.String r7 = r10.$description
                int r8 = tu.z.f87419c     // Catch: java.lang.Throwable -> L25
                com.sfbx.appconsent.core.AppConsentCore r8 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$getAppConsentCore(r11)     // Catch: java.lang.Throwable -> L25
                kotlinx.coroutines.flow.Flow r8 = r8.generateQrCode(r1)     // Catch: java.lang.Throwable -> L25
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$2$1$1 r9 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$getQrCode$2$1$1     // Catch: java.lang.Throwable -> L25
                r9.<init>()     // Catch: java.lang.Throwable -> L25
                r10.L$0 = r6     // Catch: java.lang.Throwable -> L25
                r10.label = r5     // Catch: java.lang.Throwable -> L25
                java.lang.Object r11 = r8.collect(r9, r10)     // Catch: java.lang.Throwable -> L25
                if (r11 != r0) goto L6e
                goto L9b
            L6e:
                java.lang.Object r11 = tu.z.m7131constructorimpl(r2)     // Catch: java.lang.Throwable -> L25
                goto L7d
            L73:
                int r1 = tu.z.f87419c
                java.lang.Object r11 = tu.a0.createFailure(r11)
                java.lang.Object r11 = tu.z.m7131constructorimpl(r11)
            L7d:
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r1 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.this
                java.lang.Throwable r4 = tu.z.m7134exceptionOrNullimpl(r11)
                if (r4 == 0) goto L9c
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$setLastQrCodeData$p(r1, r6)
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$get_qrCode$p(r1)
                com.sfbx.appconsentv3.ui.model.Response$Error r7 = new com.sfbx.appconsentv3.ui.model.Response$Error
                r7.<init>(r4, r6, r5, r6)
                r10.L$0 = r11
                r10.label = r3
                java.lang.Object r11 = r1.emit(r7, r10)
                if (r11 != r0) goto L9c
            L9b:
                return r0
            L9c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1", f = "ConsentableDetailViewModel.kt", i = {0}, l = {182, 190, 198}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37041 extends n implements p {
        final /* synthetic */ int $idConsentable;
        final /* synthetic */ boolean $reject;
        final /* synthetic */ ConsentableType $type;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConsentableDetailViewModel this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$1", f = "ConsentableDetailViewModel.kt", i = {}, l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05131 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05131(m1 m1Var, d<? super C05131> dVar) {
                super(3, dVar);
                this.$$this$liveData = m1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    Throwable th2 = (Throwable) this.L$0;
                    m1 m1Var = this.$$this$liveData;
                    Response.Error error = new Response.Error(th2, null, 2, 0 == true ? 1 : 0);
                    this.label = 1;
                    if (m1Var.emit(error, this) == coroutine_suspended) {
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
                C05131 c05131 = new C05131(this.$$this$liveData, dVar);
                c05131.L$0 = th2;
                return c05131.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$3", f = "ConsentableDetailViewModel.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(m1 m1Var, d<? super AnonymousClass3> dVar) {
                super(3, dVar);
                this.$$this$liveData = m1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    Throwable th2 = (Throwable) this.L$0;
                    m1 m1Var = this.$$this$liveData;
                    Response.Error error = new Response.Error(th2, null, 2, 0 == true ? 1 : 0);
                    this.label = 1;
                    if (m1Var.emit(error, this) == coroutine_suspended) {
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$$this$liveData, dVar);
                anonymousClass3.L$0 = th2;
                return anonymousClass3.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConsentableType.values().length];
                try {
                    iArr[ConsentableType.STACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37041(ConsentableType consentableType, ConsentableDetailViewModel consentableDetailViewModel, int i10, boolean z10, d<? super C37041> dVar) {
            super(2, dVar);
            this.$type = consentableType;
            this.this$0 = consentableDetailViewModel;
            this.$idConsentable = i10;
            this.$reject = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37041 c37041 = new C37041(this.$type, this.this$0, this.$idConsentable, this.$reject, dVar);
            c37041.L$0 = obj;
            return c37041;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((C37041) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        
            if (r8.collect(r2, r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        
            if (r8.collect(r3, r7) == r0) goto L30;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                tu.a0.throwOnFailure(r8)
                goto La8
            L1f:
                java.lang.Object r1 = r7.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r8)
                goto L3f
            L27:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r8 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r8.<init>()
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L3f
                goto La7
            L3f:
                com.sfbx.appconsent.core.model.ConsentableType r8 = r7.$type
                int[] r5 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.C37041.WhenMappings.$EnumSwitchMapping$0
                int r8 = r8.ordinal()
                r8 = r5[r8]
                r5 = 0
                if (r8 != r4) goto L7a
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r8 = r7.this$0
                com.sfbx.appconsent.core.AppConsentCore r8 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$getAppConsentCore(r8)
                int r2 = r7.$idConsentable
                boolean r6 = r7.$reject
                if (r6 == 0) goto L5b
                com.sfbx.appconsent.core.model.ConsentStatus r6 = com.sfbx.appconsent.core.model.ConsentStatus.DISALLOWED
                goto L5d
            L5b:
                com.sfbx.appconsent.core.model.ConsentStatus r6 = com.sfbx.appconsent.core.model.ConsentStatus.ALLOWED
            L5d:
                kotlinx.coroutines.flow.Flow r8 = r8.setStackStatus(r2, r6, r4)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$1 r2 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$1
                r2.<init>(r1, r5)
                kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.m5171catch(r8, r2)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$2 r2 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$2
                r2.<init>()
                r7.L$0 = r5
                r7.label = r3
                java.lang.Object r8 = r8.collect(r2, r7)
                if (r8 != r0) goto La8
                goto La7
            L7a:
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r8 = r7.this$0
                com.sfbx.appconsent.core.AppConsentCore r8 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$getAppConsentCore(r8)
                int r3 = r7.$idConsentable
                boolean r6 = r7.$reject
                if (r6 == 0) goto L89
                com.sfbx.appconsent.core.model.ConsentStatus r6 = com.sfbx.appconsent.core.model.ConsentStatus.DISALLOWED
                goto L8b
            L89:
                com.sfbx.appconsent.core.model.ConsentStatus r6 = com.sfbx.appconsent.core.model.ConsentStatus.ALLOWED
            L8b:
                kotlinx.coroutines.flow.Flow r8 = r8.setConsentableStatus(r3, r6, r4)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$3 r3 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$3
                r3.<init>(r1, r5)
                kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.m5171catch(r8, r3)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$4 r3 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$rejectLITVendors$1$4
                r3.<init>()
                r7.L$0 = r5
                r7.label = r2
                java.lang.Object r8 = r8.collect(r3, r7)
                if (r8 != r0) goto La8
            La7:
                return r0
            La8:
                tu.x0 r8 = tu.x0.f87415a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.C37041.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1", f = "ConsentableDetailViewModel.kt", i = {0}, l = {207, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37051 extends n implements p {
        final /* synthetic */ int $idConsentable;
        final /* synthetic */ ConsentStatus $newStatus;
        final /* synthetic */ ConsentableType $type;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConsentableDetailViewModel this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$1", f = "ConsentableDetailViewModel.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05141 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05141(m1 m1Var, d<? super C05141> dVar) {
                super(3, dVar);
                this.$$this$liveData = m1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    Throwable th2 = (Throwable) this.L$0;
                    m1 m1Var = this.$$this$liveData;
                    Response.Error error = new Response.Error(th2, null, 2, 0 == true ? 1 : 0);
                    this.label = 1;
                    if (m1Var.emit(error, this) == coroutine_suspended) {
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
                C05141 c05141 = new C05141(this.$$this$liveData, dVar);
                c05141.L$0 = th2;
                return c05141.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$3", f = "ConsentableDetailViewModel.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(m1 m1Var, d<? super AnonymousClass3> dVar) {
                super(3, dVar);
                this.$$this$liveData = m1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    Throwable th2 = (Throwable) this.L$0;
                    m1 m1Var = this.$$this$liveData;
                    Response.Error error = new Response.Error(th2, null, 2, 0 == true ? 1 : 0);
                    this.label = 1;
                    if (m1Var.emit(error, this) == coroutine_suspended) {
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$$this$liveData, dVar);
                anonymousClass3.L$0 = th2;
                return anonymousClass3.invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConsentableType.values().length];
                try {
                    iArr[ConsentableType.STACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37051(ConsentableType consentableType, ConsentableDetailViewModel consentableDetailViewModel, int i10, ConsentStatus consentStatus, d<? super C37051> dVar) {
            super(2, dVar);
            this.$type = consentableType;
            this.this$0 = consentableDetailViewModel;
            this.$idConsentable = i10;
            this.$newStatus = consentStatus;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37051 c37051 = new C37051(this.$type, this.this$0, this.$idConsentable, this.$newStatus, dVar);
            c37051.L$0 = obj;
            return c37051;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((C37051) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            if (r13.collect(r2, r12) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
        
            if (r13.collect(r3, r12) == r0) goto L22;
         */
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
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                tu.a0.throwOnFailure(r13)
                goto La0
            L1f:
                java.lang.Object r1 = r12.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r13)
                goto L3f
            L27:
                tu.a0.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                r1 = r13
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r13 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r13.<init>()
                r12.L$0 = r1
                r12.label = r4
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto L3f
                goto L9f
            L3f:
                com.sfbx.appconsent.core.model.ConsentableType r13 = r12.$type
                int[] r5 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.C37051.WhenMappings.$EnumSwitchMapping$0
                int r13 = r13.ordinal()
                r13 = r5[r13]
                r5 = 0
                if (r13 != r4) goto L76
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r13 = r12.this$0
                com.sfbx.appconsent.core.AppConsentCore r6 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$getAppConsentCore(r13)
                int r7 = r12.$idConsentable
                com.sfbx.appconsent.core.model.ConsentStatus r8 = r12.$newStatus
                r10 = 4
                r11 = 0
                r9 = 0
                kotlinx.coroutines.flow.Flow r13 = com.sfbx.appconsent.core.AppConsentCoreContract.DefaultImpls.setStackStatus$default(r6, r7, r8, r9, r10, r11)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$1 r2 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$1
                r2.<init>(r1, r5)
                kotlinx.coroutines.flow.Flow r13 = kotlinx.coroutines.flow.FlowKt.m5171catch(r13, r2)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$2 r2 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$2
                r2.<init>()
                r12.L$0 = r5
                r12.label = r3
                java.lang.Object r13 = r13.collect(r2, r12)
                if (r13 != r0) goto La0
                goto L9f
            L76:
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel r13 = r12.this$0
                com.sfbx.appconsent.core.AppConsentCore r6 = com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.access$getAppConsentCore(r13)
                int r7 = r12.$idConsentable
                com.sfbx.appconsent.core.model.ConsentStatus r8 = r12.$newStatus
                r10 = 4
                r11 = 0
                r9 = 0
                kotlinx.coroutines.flow.Flow r13 = com.sfbx.appconsent.core.AppConsentCoreContract.DefaultImpls.setConsentableStatus$default(r6, r7, r8, r9, r10, r11)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$3 r3 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$3
                r3.<init>(r1, r5)
                kotlinx.coroutines.flow.Flow r13 = kotlinx.coroutines.flow.FlowKt.m5171catch(r13, r3)
                com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$4 r3 = new com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel$setConsentableStatus$1$4
                r3.<init>()
                r12.L$0 = r5
                r12.label = r2
                java.lang.Object r13 = r13.collect(r3, r12)
                if (r13 != r0) goto La0
            L9f:
                return r0
            La0:
                tu.x0 r13 = tu.x0.f87415a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel.C37051.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentableDetailViewModel(AppConsentCore appConsentCore, IsNeedToDisplayLegitimateInterestUseCase isNeedToDisplayLegitimateInterestUseCase) {
        super(appConsentCore);
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        e0.checkNotNullParameter(isNeedToDisplayLegitimateInterestUseCase, "isNeedToDisplayLegitimateInterestUseCase");
        this.isNeedToDisplayLegitimateInterestUseCase = isNeedToDisplayLegitimateInterestUseCase;
        MutableSharedFlow<Response<QrCodeData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this._qrCode = mutableSharedFlowMutableSharedFlow$default;
        this.qrCode = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static /* synthetic */ void getQrCode$default(ConsentableDetailViewModel consentableDetailViewModel, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        consentableDetailViewModel.getQrCode(str, str2, str3, z10);
    }

    public final void displayLastQrCode() {
        QrCodeData qrCodeData = this.lastQrCodeData;
        String title = qrCodeData != null ? qrCodeData.getTitle() : null;
        QrCodeData qrCodeData2 = this.lastQrCodeData;
        String description = qrCodeData2 != null ? qrCodeData2.getDescription() : null;
        QrCodeData qrCodeData3 = this.lastQrCodeData;
        String url = qrCodeData3 != null ? qrCodeData3.getUrl() : null;
        if (qrCodeData == null || title == null || title.length() == 0 || description == null || description.length() == 0 || url == null || url.length() == 0) {
            return;
        }
        e0.checkNotNull(title);
        e0.checkNotNull(description);
        e0.checkNotNull(url);
        getQrCode(title, description, url, true);
    }

    public final SharedFlow<Response<QrCodeData>> getQrCode() {
        return this.qrCode;
    }

    public final boolean getQrCodeShowing() {
        return this.qrCodeShowing;
    }

    public final boolean isLegintableMustBeDisplayed() {
        return this.isNeedToDisplayLegitimateInterestUseCase.get().booleanValue();
    }

    public final boolean isNeedToDisplayQrCode() {
        return getAppConsentCore().isNeedToDisplayQrCode();
    }

    public final void qrCodeDismissed() {
        this.qrCodeShowing = false;
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "ConsentableDetailViewModel", "qrcode dismissed", null, 4, null);
    }

    public final void qrCodePopupDisplayed() {
        this.qrCodeShowing = true;
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "ConsentableDetailViewModel", "qrcode displayed", null, 4, null);
    }

    public final l1 rejectLITVendors(int i10, ConsentableType type, boolean z10) {
        e0.checkNotNullParameter(type, "type");
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new C37041(type, this, i10, z10, null), 3, (Object) null);
    }

    public final l1 setConsentableStatus(int i10, ConsentableType type, ConsentStatus newStatus) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(newStatus, "newStatus");
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new C37051(type, this, i10, newStatus, null), 3, (Object) null);
    }

    public final void setQrCodeShowing(boolean z10) {
        this.qrCodeShowing = z10;
    }

    public final Consentable getConsentable(int i10, ConsentableType type) {
        Consentable consentable;
        e0.checkNotNullParameter(type, "type");
        Notice consentInCache = getAppConsentCore().getConsentInCache();
        if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            for (Stack stack : consentInCache.getStacks()) {
                if (stack.getId() == i10) {
                    consentable = ExtensionKt.toConsentable(stack);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        for (Consentable consentable2 : consentInCache.getConsentables()) {
            if (consentable2.getId() == i10 && consentable2.getType() == type) {
                consentable = consentable2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
        this.mConsentable = consentable;
        if (consentable != null) {
            return consentable;
        }
        e0.throwUninitializedPropertyAccessException(rJqlArycrfkilN.enHCcTHFzdJSF);
        return null;
    }

    public final void getQrCode(String title, String description, String data, boolean z10) {
        e0.checkNotNullParameter(title, "title");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(data, "data");
        ACLogger aCLogger = ACLogger.INSTANCE;
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "ConsentableDetailViewModel", o2.n("getQrCode called with forced = ", z10), null, 4, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastQrCodeRequestTime < 1000 && !z10) {
            ACLoggerContract.DefaultImpls.i$default(aCLogger, "ConsentableDetailViewModel", "QrCode load request ignored due to debounce", null, 4, null);
            return;
        }
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "ConsentableDetailViewModel", "lastQrCodeRequestTime updwill be updated", null, 4, null);
        this.lastQrCodeRequestTime = jCurrentTimeMillis;
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "ConsentableDetailViewModel", "lastQrCodeRequestTime updated", null, 4, null);
        QrCodeData qrCodeData = this.lastQrCodeData;
        if (qrCodeData == null || !e0.areEqual(title, qrCodeData.getTitle()) || !e0.areEqual(description, qrCodeData.getDescription()) || !e0.areEqual(data, qrCodeData.getUrl())) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass2(data, title, description, null), 3, null);
        } else {
            if (this._qrCode.tryEmit(new Response.Success(qrCodeData))) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(z10, this, qrCodeData, null), 3, null);
        }
    }
}
