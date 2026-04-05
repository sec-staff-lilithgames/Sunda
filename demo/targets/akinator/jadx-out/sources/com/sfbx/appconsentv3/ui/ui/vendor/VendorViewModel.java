package com.sfbx.appconsentv3.ui.ui.vendor;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import av.e;
import bv.f;
import bv.n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.domain.GetVendorDetailsUseCase;
import com.sfbx.appconsentv3.ui.domain.IsNeedToDisplayLegitimateInterestUseCase;
import com.sfbx.appconsentv3.ui.domain.model.VendorDetailsDomain;
import com.sfbx.appconsentv3.ui.model.QrCodeData;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import com.vungle.ads.internal.protos.Sdk;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import j1.o2;
import java.util.List;
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
public final class VendorViewModel extends AbstractTrackingViewModel {
    private final MutableSharedFlow<Response<QrCodeData>> _qrCode;
    private final GetVendorDetailsUseCase getVendorDetailsUseCase;
    private final IsNeedToDisplayLegitimateInterestUseCase isNeedToDisplayLegitimateInterestUseCase;
    private QrCodeData lastQrCodeData;
    private long lastQrCodeRequestTime;
    private final SharedFlow<Response<QrCodeData>> qrCode;
    private boolean qrCodeShowing;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getQrCode$1", f = "VendorViewModel.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, 102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getQrCode$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ boolean $forced;
        final /* synthetic */ QrCodeData $qrCodeData;
        int label;
        final /* synthetic */ VendorViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, VendorViewModel vendorViewModel, QrCodeData qrCodeData, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$forced = z10;
            this.this$0 = vendorViewModel;
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
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getQrCode$1$subscriberPresent$1 r10 = new com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getQrCode$1$subscriberPresent$1
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel r1 = r9.this$0
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
                java.lang.String r4 = "VendorViewModel"
                java.lang.String r5 = "subscriber présent, on emit value"
                r6 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r3, r4, r5, r6, r7, r8)
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel r10 = r9.this$0
                kotlinx.coroutines.flow.MutableSharedFlow r10 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.access$get_qrCode$p(r10)
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
                java.lang.String r2 = "VendorViewModel"
                java.lang.String r3 = "No subscriber... timeout has been raised"
                r4 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r1, r2, r3, r4, r5, r6)
            L72:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getQrCode$2", f = "VendorViewModel.kt", i = {0}, l = {110, 112, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getQrCode$2, reason: invalid class name */
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
            AnonymousClass2 anonymousClass2 = VendorViewModel.this.new AnonymousClass2(this.$data, this.$title, this.$description, dVar);
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
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel r1 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.access$get_qrCode$p(r1)
                com.sfbx.appconsentv3.ui.model.Response$Loading r7 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r7.<init>()
                r10.L$0 = r11
                r10.label = r4
                java.lang.Object r11 = r1.emit(r7, r10)
                if (r11 != r0) goto L4c
                goto L9b
            L4c:
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel r11 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.this
                java.lang.String r1 = r10.$data
                java.lang.String r4 = r10.$title
                java.lang.String r7 = r10.$description
                int r8 = tu.z.f87419c     // Catch: java.lang.Throwable -> L25
                com.sfbx.appconsent.core.AppConsentCore r8 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.access$getAppConsentCore(r11)     // Catch: java.lang.Throwable -> L25
                kotlinx.coroutines.flow.Flow r8 = r8.generateQrCode(r1)     // Catch: java.lang.Throwable -> L25
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getQrCode$2$1$1 r9 = new com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getQrCode$2$1$1     // Catch: java.lang.Throwable -> L25
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
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel r1 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.this
                java.lang.Throwable r4 = tu.z.m7134exceptionOrNullimpl(r11)
                if (r4 == 0) goto L9c
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.access$setLastQrCodeData$p(r1, r6)
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.access$get_qrCode$p(r1)
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
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1", f = "VendorViewModel.kt", i = {0}, l = {152, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37251 extends n implements p {
        final /* synthetic */ long $cookieMaxAgeSeconds;
        final /* synthetic */ boolean $useNonCookieAccess;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1$1", f = "VendorViewModel.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05331 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05331(m1 m1Var, d<? super C05331> dVar) {
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
            public final Object invoke(FlowCollector<? super String> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05331 c05331 = new C05331(this.$$this$liveData, dVar);
                c05331.L$0 = th2;
                return c05331.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37251(long j10, boolean z10, d<? super C37251> dVar) {
            super(2, dVar);
            this.$cookieMaxAgeSeconds = j10;
            this.$useNonCookieAccess = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37251 c37251 = VendorViewModel.this.new C37251(this.$cookieMaxAgeSeconds, this.$useNonCookieAccess, dVar);
            c37251.L$0 = obj;
            return c37251;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((C37251) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            if (r7.collect(r3, r6) == r0) goto L15;
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
                goto L62
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r7)
                goto L3a
            L22:
                tu.a0.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r7 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r7.<init>()
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L3a
                goto L61
            L3a:
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel r7 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r7 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.access$getAppConsentCore(r7)
                long r3 = r6.$cookieMaxAgeSeconds
                boolean r5 = r6.$useNonCookieAccess
                kotlinx.coroutines.flow.Flow r7 = r7.getVendorExpiration(r3, r5)
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1$1 r3 = new com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1$1
                r4 = 0
                r3.<init>(r1, r4)
                kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.m5171catch(r7, r3)
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1$2 r3 = new com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1$2
                r3.<init>()
                r6.L$0 = r4
                r6.label = r2
                java.lang.Object r7 = r7.collect(r3, r6)
                if (r7 != r0) goto L62
            L61:
                return r0
            L62:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.C37251.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1", f = "VendorViewModel.kt", i = {0}, l = {138, 141}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37261 extends n implements p {
        final /* synthetic */ boolean $rejected;
        final /* synthetic */ int $vendorId;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1$1", f = "VendorViewModel.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05341 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05341(m1 m1Var, d<? super C05341> dVar) {
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
                C05341 c05341 = new C05341(this.$$this$liveData, dVar);
                c05341.L$0 = th2;
                return c05341.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37261(int i10, boolean z10, d<? super C37261> dVar) {
            super(2, dVar);
            this.$vendorId = i10;
            this.$rejected = z10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37261 c37261 = VendorViewModel.this.new C37261(this.$vendorId, this.$rejected, dVar);
            c37261.L$0 = obj;
            return c37261;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((C37261) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        
            if (r7.collect(r3, r6) == r0) goto L19;
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
                goto L69
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r7)
                goto L3a
            L22:
                tu.a0.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r7 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r7.<init>()
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L3a
                goto L68
            L3a:
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel r7 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r7 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.access$getAppConsentCore(r7)
                int r4 = r6.$vendorId
                boolean r5 = r6.$rejected
                if (r5 == 0) goto L49
                com.sfbx.appconsent.core.model.ConsentStatus r5 = com.sfbx.appconsent.core.model.ConsentStatus.DISALLOWED
                goto L4b
            L49:
                com.sfbx.appconsent.core.model.ConsentStatus r5 = com.sfbx.appconsent.core.model.ConsentStatus.ALLOWED
            L4b:
                kotlinx.coroutines.flow.Flow r7 = r7.setVendorStatus(r4, r5, r3)
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1$1 r3 = new com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1$1
                r4 = 0
                r3.<init>(r1, r4)
                kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.m5171catch(r7, r3)
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1$2 r3 = new com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1$2
                r3.<init>()
                r6.L$0 = r4
                r6.label = r2
                java.lang.Object r7 = r7.collect(r3, r6)
                if (r7 != r0) goto L69
            L68:
                return r0
            L69:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.C37261.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1", f = "VendorViewModel.kt", i = {0}, l = {145, 147}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37271 extends n implements p {
        final /* synthetic */ ConsentStatus $newStatus;
        final /* synthetic */ int $vendorId;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1$1", f = "VendorViewModel.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05351 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05351(m1 m1Var, d<? super C05351> dVar) {
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
                C05351 c05351 = new C05351(this.$$this$liveData, dVar);
                c05351.L$0 = th2;
                return c05351.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37271(int i10, ConsentStatus consentStatus, d<? super C37271> dVar) {
            super(2, dVar);
            this.$vendorId = i10;
            this.$newStatus = consentStatus;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37271 c37271 = VendorViewModel.this.new C37271(this.$vendorId, this.$newStatus, dVar);
            c37271.L$0 = obj;
            return c37271;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((C37271) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        
            if (r10.collect(r3, r9) == r0) goto L15;
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
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r10)
                goto L65
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r10)
                goto L3a
            L22:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r10 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r10.<init>()
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L3a
                goto L64
            L3a:
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel r10 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r3 = com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.access$getAppConsentCore(r10)
                int r4 = r9.$vendorId
                com.sfbx.appconsent.core.model.ConsentStatus r5 = r9.$newStatus
                r7 = 4
                r8 = 0
                r6 = 0
                kotlinx.coroutines.flow.Flow r10 = com.sfbx.appconsent.core.AppConsentCoreContract.DefaultImpls.setVendorStatus$default(r3, r4, r5, r6, r7, r8)
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1$1 r3 = new com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1$1
                r4 = 0
                r3.<init>(r1, r4)
                kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.m5171catch(r10, r3)
                com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1$2 r3 = new com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1$2
                r3.<init>()
                r9.L$0 = r4
                r9.label = r2
                java.lang.Object r10 = r10.collect(r3, r9)
                if (r10 != r0) goto L65
            L64:
                return r0
            L65:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.C37271.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorViewModel(AppConsentCore appConsentCore, IsNeedToDisplayLegitimateInterestUseCase isNeedToDisplayLegitimateInterestUseCase, GetVendorDetailsUseCase getVendorDetailsUseCase) {
        super(appConsentCore);
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        e0.checkNotNullParameter(isNeedToDisplayLegitimateInterestUseCase, "isNeedToDisplayLegitimateInterestUseCase");
        e0.checkNotNullParameter(getVendorDetailsUseCase, "getVendorDetailsUseCase");
        this.isNeedToDisplayLegitimateInterestUseCase = isNeedToDisplayLegitimateInterestUseCase;
        this.getVendorDetailsUseCase = getVendorDetailsUseCase;
        MutableSharedFlow<Response<QrCodeData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this._qrCode = mutableSharedFlowMutableSharedFlow$default;
        this.qrCode = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static /* synthetic */ void getQrCode$default(VendorViewModel vendorViewModel, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        vendorViewModel.getQrCode(str, str2, str3, z10);
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

    public final List<Consentable> getConsentables() {
        return getAppConsentCore().getConsentablesInCache();
    }

    public final SharedFlow<Response<QrCodeData>> getQrCode() {
        return this.qrCode;
    }

    public final boolean getQrCodeShowing() {
        return this.qrCodeShowing;
    }

    public final VendorDetailsDomain getVendorDetails(int i10) {
        return this.getVendorDetailsUseCase.get(Integer.valueOf(i10));
    }

    public final l1 getVendorExpiration(long j10, boolean z10) {
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new C37251(j10, z10, null), 3, (Object) null);
    }

    public final List<Vendor> getVendors() {
        return getAppConsentCore().getVendors();
    }

    public final boolean isNeedToDisplayLegitimateInterest() {
        return this.isNeedToDisplayLegitimateInterestUseCase.get().booleanValue();
    }

    public final boolean isNeedToDisplayQrCode() {
        return getAppConsentCore().isNeedToDisplayQrCode();
    }

    public final void qrCodeDismissed() {
        this.qrCodeShowing = false;
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "VendorViewModel", "qrcode dismissed", null, 4, null);
    }

    public final void qrCodePopupDisplayed() {
        this.qrCodeShowing = true;
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "VendorViewModel", "qrcode displayed", null, 4, null);
    }

    public final l1 rejectLITVendors(boolean z10, int i10) {
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new C37261(i10, z10, null), 3, (Object) null);
    }

    public final void setQrCodeShowing(boolean z10) {
        this.qrCodeShowing = z10;
    }

    public final l1 setVendorStatus(int i10, ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new C37271(i10, newStatus, null), 3, (Object) null);
    }

    public final void getQrCode(String title, String description, String data, boolean z10) {
        e0.checkNotNullParameter(title, "title");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(data, "data");
        ACLogger aCLogger = ACLogger.INSTANCE;
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorViewModel", o2.n("getQrCode called with forced = ", z10), null, 4, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastQrCodeRequestTime < 1000 && !z10) {
            ACLoggerContract.DefaultImpls.i$default(aCLogger, "VendorViewModel", "QrCode load request ignored due to debounce", null, 4, null);
            return;
        }
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorViewModel", "lastQrCodeRequestTime updwill be updated", null, 4, null);
        this.lastQrCodeRequestTime = jCurrentTimeMillis;
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorViewModel", "lastQrCodeRequestTime updated", null, 4, null);
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
