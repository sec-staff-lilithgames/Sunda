package com.sfbx.appconsentv3.ui.ui.vendor.list;

import androidx.lifecycle.g3;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import av.e;
import bv.f;
import bv.n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsentv3.ui.model.QrCodeData;
import com.sfbx.appconsentv3.ui.model.Response;
import com.vungle.ads.internal.protos.Sdk;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import j1.o2;
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
public final class VendorListViewModel extends g3 {
    private final MutableSharedFlow<Response<QrCodeData>> _qrCode;
    private final AppConsentCore appConsentCore;
    private QrCodeData lastQrCodeData;
    private long lastQrCodeRequestTime;
    private final SharedFlow<Response<QrCodeData>> qrCode;
    private boolean qrCodeShowing;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1", f = "VendorListViewModel.kt", i = {0}, l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ int $id;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1$2", f = "VendorListViewModel.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(m1 m1Var, d<? super AnonymousClass2> dVar) {
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
            public final Object invoke(FlowCollector<? super Consentable> flowCollector, Throwable th2, d<? super x0> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$liveData, dVar);
                anonymousClass2.L$0 = th2;
                return anonymousClass2.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$id = i10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = VendorListViewModel.this.new AnonymousClass1(this.$id, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((AnonymousClass1) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        
            if (r6.collect(r4, r5) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r6)
                goto L65
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r6)
                goto L3a
            L22:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r6 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r6.<init>()
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L3a
                goto L64
            L3a:
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel r6 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r6 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.access$getAppConsentCore$p(r6)
                kotlinx.coroutines.flow.Flow r6 = r6.getNotice(r3)
                int r3 = r5.$id
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1$invokeSuspend$$inlined$map$1 r4 = new com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1$invokeSuspend$$inlined$map$1
                r4.<init>()
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1$2 r6 = new com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1$2
                r3 = 0
                r6.<init>(r1, r3)
                kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.m5171catch(r4, r6)
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1$3 r4 = new com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getConsentable$1$3
                r4.<init>()
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L65
            L64:
                return r0
            L65:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$1", f = "VendorListViewModel.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, 102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37301 extends n implements p {
        final /* synthetic */ boolean $forced;
        final /* synthetic */ QrCodeData $qrCodeData;
        int label;
        final /* synthetic */ VendorListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37301(boolean z10, VendorListViewModel vendorListViewModel, QrCodeData qrCodeData, d<? super C37301> dVar) {
            super(2, dVar);
            this.$forced = z10;
            this.this$0 = vendorListViewModel;
            this.$qrCodeData = qrCodeData;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C37301(this.$forced, this.this$0, this.$qrCodeData, dVar);
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
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$1$subscriberPresent$1 r10 = new com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$1$subscriberPresent$1
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel r1 = r9.this$0
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
                java.lang.String r4 = "VendorListViewModel"
                java.lang.String r5 = "subscriber présent, on emit value"
                r6 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r3, r4, r5, r6, r7, r8)
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel r10 = r9.this$0
                kotlinx.coroutines.flow.MutableSharedFlow r10 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.access$get_qrCode$p(r10)
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
                java.lang.String r2 = "VendorListViewModel"
                java.lang.String r3 = "No subscriber... timeout has been raised"
                r4 = 0
                io.sfbx.appconsent.logger.ACLoggerContract.DefaultImpls.d$default(r1, r2, r3, r4, r5, r6)
            L72:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.C37301.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C37301) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$2", f = "VendorListViewModel.kt", i = {0}, l = {110, 112, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$2, reason: invalid class name */
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
            AnonymousClass2 anonymousClass2 = VendorListViewModel.this.new AnonymousClass2(this.$data, this.$title, this.$description, dVar);
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
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel r1 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.access$get_qrCode$p(r1)
                com.sfbx.appconsentv3.ui.model.Response$Loading r7 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r7.<init>()
                r10.L$0 = r11
                r10.label = r4
                java.lang.Object r11 = r1.emit(r7, r10)
                if (r11 != r0) goto L4c
                goto L9b
            L4c:
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel r11 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.this
                java.lang.String r1 = r10.$data
                java.lang.String r4 = r10.$title
                java.lang.String r7 = r10.$description
                int r8 = tu.z.f87419c     // Catch: java.lang.Throwable -> L25
                com.sfbx.appconsent.core.AppConsentCore r8 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.access$getAppConsentCore$p(r11)     // Catch: java.lang.Throwable -> L25
                kotlinx.coroutines.flow.Flow r8 = r8.generateQrCode(r1)     // Catch: java.lang.Throwable -> L25
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$2$1$1 r9 = new com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getQrCode$2$1$1     // Catch: java.lang.Throwable -> L25
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
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel r1 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.this
                java.lang.Throwable r4 = tu.z.m7134exceptionOrNullimpl(r11)
                if (r4 == 0) goto L9c
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.access$setLastQrCodeData$p(r1, r6)
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.access$get_qrCode$p(r1)
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
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getVendors$1", f = "VendorListViewModel.kt", i = {0}, l = {145, 148}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getVendors$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37311 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getVendors$1$1", f = "VendorListViewModel.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getVendors$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05401 extends n implements q {
            final /* synthetic */ m1 $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05401(m1 m1Var, d<? super C05401> dVar) {
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
            public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05401 c05401 = new C05401(this.$$this$liveData, dVar);
                c05401.L$0 = th2;
                return c05401.invokeSuspend(x0.f87415a);
            }
        }

        public C37311(d<? super C37311> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37311 c37311 = VendorListViewModel.this.new C37311(dVar);
            c37311.L$0 = obj;
            return c37311;
        }

        @Override // kv.p
        public final Object invoke(m1 m1Var, d<? super x0> dVar) {
            return ((C37311) create(m1Var, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            if (r6.collect(r3, r5) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r6)
                goto L5e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                tu.a0.throwOnFailure(r6)
                goto L3a
            L22:
                tu.a0.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                androidx.lifecycle.m1 r1 = (androidx.lifecycle.m1) r1
                com.sfbx.appconsentv3.ui.model.Response$Loading r6 = new com.sfbx.appconsentv3.ui.model.Response$Loading
                r6.<init>()
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L3a
                goto L5d
            L3a:
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel r6 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.this
                com.sfbx.appconsent.core.AppConsentCore r6 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.access$getAppConsentCore$p(r6)
                kotlinx.coroutines.flow.Flow r6 = r6.getNotice(r3)
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getVendors$1$1 r3 = new com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getVendors$1$1
                r4 = 0
                r3.<init>(r1, r4)
                kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.m5171catch(r6, r3)
                com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getVendors$1$2 r3 = new com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel$getVendors$1$2
                r3.<init>()
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r6.collect(r3, r5)
                if (r6 != r0) goto L5e
            L5d:
                return r0
            L5e:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel.C37311.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public VendorListViewModel(AppConsentCore appConsentCore) {
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.appConsentCore = appConsentCore;
        MutableSharedFlow<Response<QrCodeData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this._qrCode = mutableSharedFlowMutableSharedFlow$default;
        this.qrCode = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static /* synthetic */ void getQrCode$default(VendorListViewModel vendorListViewModel, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        vendorListViewModel.getQrCode(str, str2, str3, z10);
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

    public final l1 getConsentable(int i10) {
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new AnonymousClass1(i10, null), 3, (Object) null);
    }

    public final SharedFlow<Response<QrCodeData>> getQrCode() {
        return this.qrCode;
    }

    public final boolean getQrCodeShowing() {
        return this.qrCodeShowing;
    }

    public final l1 getVendors() {
        return androidx.lifecycle.q.liveData$default((m) null, 0L, new C37311(null), 3, (Object) null);
    }

    public final boolean isNeedToDisplayQrCode() {
        return this.appConsentCore.isNeedToDisplayQrCode();
    }

    public final void qrCodeDismissed() {
        this.qrCodeShowing = false;
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "VendorListViewModel", "qrcode dismissed", null, 4, null);
    }

    public final void qrCodePopupDisplayed() {
        this.qrCodeShowing = true;
        ACLoggerContract.DefaultImpls.d$default(ACLogger.INSTANCE, "VendorListViewModel", "qrcode displayed", null, 4, null);
    }

    public final void setQrCodeShowing(boolean z10) {
        this.qrCodeShowing = z10;
    }

    public final void getQrCode(String title, String description, String data, boolean z10) {
        e0.checkNotNullParameter(title, "title");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(data, "data");
        ACLogger aCLogger = ACLogger.INSTANCE;
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorListViewModel", o2.n("getQrCode called with forced = ", z10), null, 4, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastQrCodeRequestTime < 1000 && !z10) {
            ACLoggerContract.DefaultImpls.i$default(aCLogger, "VendorListViewModel", "QrCode load request ignored due to debounce", null, 4, null);
            return;
        }
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorListViewModel", "lastQrCodeRequestTime updwill be updated", null, 4, null);
        this.lastQrCodeRequestTime = jCurrentTimeMillis;
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "VendorListViewModel", "lastQrCodeRequestTime updated", null, 4, null);
        QrCodeData qrCodeData = this.lastQrCodeData;
        if (qrCodeData == null || !e0.areEqual(title, qrCodeData.getTitle()) || !e0.areEqual(description, qrCodeData.getDescription()) || !e0.areEqual(data, qrCodeData.getUrl())) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass2(data, title, description, null), 3, null);
        } else {
            if (this._qrCode.tryEmit(new Response.Success(qrCodeData))) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C37301(z10, this, qrCodeData, null), 3, null);
        }
    }
}
