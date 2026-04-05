package com.unity3d.ads.core.data.manager;

import android.content.Context;
import av.b;
import av.e;
import bv.f;
import bv.h;
import bv.n;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import tu.z;
import uu.k0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidScarManager implements ScarManager {
    private final GMAScarAdapterBridge gmaBridge;
    private final CommonScarEventReceiver scarEventReceiver;
    private final ScarTimeHackFixer scarTimeHackFixer;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ List<AdFormatOuterClass.AdFormat> $adFormat;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends AdFormatOuterClass.AdFormat> list, AndroidScarManager androidScarManager, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$adFormat, this.this$0, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
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
            List<AdFormatOuterClass.AdFormat> list = this.$adFormat;
            AndroidScarManager androidScarManager = this.this$0;
            this.L$0 = list;
            this.L$1 = androidScarManager;
            this.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    kl.e unityAdFormat = AdFormatExtensions.toUnityAdFormat((AdFormatOuterClass.AdFormat) it.next());
                    if (unityAdFormat == kl.e.f71582b) {
                        unityAdFormat = null;
                    }
                    if (unityAdFormat != null) {
                        arrayList.add(unityAdFormat);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(null));
            } else {
                androidScarManager.gmaBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsFailure(String str) {
                        CancellableContinuation<BiddingSignals> cancellableContinuation = cancellableContinuationImpl;
                        int i11 = z.f87419c;
                        cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(new Exception(str))));
                    }

                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsReady(BiddingSignals biddingSignals) {
                        cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(biddingSignals));
                    }
                }));
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(this);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super BiddingSignals> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37712 extends n implements p {
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            int label;
            final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidScarManager androidScarManager, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = androidScarManager;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                this.this$0.gmaBridge.getVersion();
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
                return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        public C37712(d<? super C37712> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidScarManager.this.new C37712(dVar);
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
            SharedFlow sharedFlowOnSubscription = FlowKt.onSubscription(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new AnonymousClass1(AndroidScarManager.this, null));
            this.label = 1;
            Object objFirst = FlowKt.first(sharedFlowOnSubscription, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super String> dVar) {
            return ((C37712) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", i = {}, l = {93}, m = "loadAd", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37722 extends n implements p {
        final /* synthetic */ String $adString;
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ boolean $canSkip;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        final /* synthetic */ int $videoLength;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37722(boolean z10, String str, String str2, String str3, String str4, int i10, d<? super C37722> dVar) {
            super(2, dVar);
            this.$canSkip = z10;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidScarManager.this.new C37722(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength));
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super GmaEventData> flowCollector, d<? super x0> dVar) {
            return ((C37722) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements p {
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$placementId = str;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementId, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kv.p
        public final Object invoke(GmaEventData gmaEventData, d<? super Boolean> dVar) {
            return ((AnonymousClass3) create(gmaEventData, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                av.e.getCOROUTINE_SUSPENDED()
                int r0 = r3.label
                if (r0 != 0) goto L50
                tu.a0.throwOnFailure(r4)
                java.lang.Object r4 = r3.L$0
                com.unity3d.ads.core.domain.scar.GmaEventData r4 = (com.unity3d.ads.core.domain.scar.GmaEventData) r4
                com.unity3d.scar.adapter.common.c r0 = com.unity3d.scar.adapter.common.c.f50715m
                com.unity3d.scar.adapter.common.c r1 = com.unity3d.scar.adapter.common.c.f50720r
                com.unity3d.scar.adapter.common.c[] r0 = new com.unity3d.scar.adapter.common.c[]{r0, r1}
                java.util.List r0 = uu.p0.listOf(r0)
                com.unity3d.scar.adapter.common.c r1 = r4.getGmaEvent()
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L30
                java.lang.String r0 = r4.getPlacementId()
                java.lang.String r1 = r3.$placementId
                boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r1)
                if (r0 != 0) goto L48
            L30:
                com.unity3d.scar.adapter.common.c r0 = com.unity3d.scar.adapter.common.c.f50706c
                com.unity3d.scar.adapter.common.c r1 = com.unity3d.scar.adapter.common.c.f50718p
                com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.H
                com.unity3d.scar.adapter.common.c[] r0 = new com.unity3d.scar.adapter.common.c[]{r2, r0, r1}
                java.util.List r0 = uu.p0.listOf(r0)
                com.unity3d.scar.adapter.common.c r4 = r4.getGmaEvent()
                boolean r4 = r0.contains(r4)
                if (r4 == 0) goto L4a
            L48:
                r4 = 1
                goto L4b
            L4a:
                r4 = 0
            L4b:
                java.lang.Boolean r4 = bv.b.boxBoolean(r4)
                return r4
            L50:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37731 extends n implements p {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ kl.d $scarAdMetadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37731(Context context, BannerView bannerView, String str, kl.d dVar, UnityBannerSize unityBannerSize, d<? super C37731> dVar2) {
            super(2, dVar2);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = dVar;
            this.$bannerSize = unityBannerSize;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidScarManager.this.new C37731(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super GmaEventData> flowCollector, d<? super x0> dVar) {
            return ((C37731) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37741 extends n implements p {
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37741(String str, String str2, d<? super C37741> dVar) {
            super(2, dVar);
            this.$placementId = str;
            this.$queryId = str2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidScarManager.this.new C37741(this.$placementId, this.$queryId, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super GmaEventData> flowCollector, d<? super x0> dVar) {
            return ((C37741) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", i = {0}, l = {127}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37752 extends n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C37752(d<? super C37752> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            GmaEventData gmaEventData;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (flowCollector.emit(gmaEventData2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                a0.throwOnFailure(obj);
            }
            return bv.b.boxBoolean(!k0.contains(new c[]{c.G, c.f50721s, c.f50726x, c.f50725w}, gmaEventData.getGmaEvent()));
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super GmaEventData> flowCollector, GmaEventData gmaEventData, d<? super Boolean> dVar) {
            C37752 c37752 = new C37752(dVar);
            c37752.L$0 = flowCollector;
            c37752.L$1 = gmaEventData;
            return c37752.invokeSuspend(x0.f87415a);
        }
    }

    public AndroidScarManager(CommonScarEventReceiver scarEventReceiver, GMAScarAdapterBridge gmaBridge, ScarTimeHackFixer scarTimeHackFixer) {
        e0.checkNotNullParameter(scarEventReceiver, "scarEventReceiver");
        e0.checkNotNullParameter(gmaBridge, "gmaBridge");
        e0.checkNotNullParameter(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getSignals(List<? extends AdFormatOuterClass.AdFormat> list, d<? super BiddingSignals> dVar) {
        return TimeoutKt.withTimeoutOrNull(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AnonymousClass2(list, this, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getVersion(d<? super String> dVar) {
        return TimeoutKt.withTimeoutOrNull(5000L, new C37712(null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, zu.d<? super tu.x0> r21) throws com.unity3d.ads.core.data.model.exception.LoadException {
        /*
            r14 = this;
            r0 = r21
            boolean r2 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass1
            if (r2 == 0) goto L16
            r2 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = (com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            java.lang.Object r10 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            r11 = 0
            r12 = 1
            if (r2 == 0) goto L36
            if (r2 != r12) goto L2e
            tu.a0.throwOnFailure(r0)
            goto L6a
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L36:
            tu.a0.throwOnFailure(r0)
            java.lang.String r0 = "INTERSTITIAL"
            boolean r2 = sv.k0.equals(r15, r0, r12)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r14.scarEventReceiver
            kotlinx.coroutines.flow.SharedFlow r13 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r1 = r14
            r3 = r16
            r5 = r17
            r6 = r18
            r4 = r19
            r7 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt.onSubscription(r13, r0)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r1.<init>(r3, r11)
            r9.label = r12
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1, r9)
            if (r0 != r10) goto L6a
            return r10
        L6a:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.c r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.f50715m
            if (r1 == r2) goto L76
            r11 = r0
        L76:
            com.unity3d.ads.core.domain.scar.GmaEventData r11 = (com.unity3d.ads.core.domain.scar.GmaEventData) r11
            if (r11 == 0) goto L99
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.<init>(r2)
            java.lang.String r2 = r11.getErrorMessage()
            if (r2 != 0) goto L8d
            com.unity3d.scar.adapter.common.c r2 = r11.getGmaEvent()
        L8d:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r2, r1)
            throw r0
        L99:
            tu.x0 r0 = tu.x0.f87415a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, zu.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Flow<GmaEventData> loadBannerAd(Context context, BannerView bannerView, kl.d scarAdMetadata, UnityBannerSize bannerSize, final String opportunityId) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(bannerView, "bannerView");
        e0.checkNotNullParameter(scarAdMetadata, "scarAdMetadata");
        e0.checkNotNullParameter(bannerSize, "bannerSize");
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        final Flow flowOnStart = FlowKt.onStart(this.scarEventReceiver.getGmaEventFlow(), new C37731(context, bannerView, opportunityId, scarAdMetadata, bannerSize, null));
        return new Flow<GmaEventData>() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$opportunityId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, zu.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r8)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        tu.a0.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        r2 = r7
                        com.unity3d.ads.core.domain.scar.GmaEventData r2 = (com.unity3d.ads.core.domain.scar.GmaEventData) r2
                        com.unity3d.scar.adapter.common.c r4 = r2.getGmaEvent()
                        com.unity3d.scar.adapter.common.c r5 = com.unity3d.scar.adapter.common.c.I
                        if (r4 != r5) goto L56
                        java.lang.String r2 = r2.getOpportunityId()
                        java.lang.String r4 = r6.$opportunityId$inlined
                        boolean r2 = kotlin.jvm.internal.e0.areEqual(r2, r4)
                        if (r2 == 0) goto L56
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        tu.x0 r7 = tu.x0.f87415a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GmaEventData> flowCollector, d dVar) {
                Object objCollect = flowOnStart.collect(new AnonymousClass2(flowCollector, opportunityId), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Flow<GmaEventData> show(String placementId, String queryId) {
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(queryId, "queryId");
        return FlowKt.transformWhile(FlowKt.onSubscription(this.scarEventReceiver.getGmaEventFlow(), new C37741(placementId, queryId, null)), new C37752(null));
    }
}
