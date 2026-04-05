package com.unity3d.ads.core.data.manager;

import av.e;
import bv.b;
import bv.d;
import bv.f;
import bv.n;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import uu.k0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidOfferwallManager implements OfferwallManager {
    private final OfferwallAdapterBridge offerwallBridge;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", i = {}, l = {28}, m = "loadAd", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", f = "AndroidOfferwallManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$placementName = str;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidOfferwallManager.this.new AnonymousClass2(this.$placementName, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super OfferwallEventData> flowCollector, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements p {
        final /* synthetic */ String $placementName;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, zu.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$placementName = str;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementName, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kv.p
        public final Object invoke(OfferwallEventData offerwallEventData, zu.d<? super Boolean> dVar) {
            return ((AnonymousClass3) create(offerwallEventData, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            return b.boxBoolean(p0.listOf((Object[]) new OfferwallEvent[]{OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED}).contains(offerwallEventData.getOfferwallEvent()) && e0.areEqual(offerwallEventData.getPlacementName(), this.$placementName));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37691 extends n implements p {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37691(String str, zu.d<? super C37691> dVar) {
            super(2, dVar);
            this.$placementName = str;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidOfferwallManager.this.new C37691(this.$placementName, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super OfferwallEventData> flowCollector, zu.d<? super x0> dVar) {
            return ((C37691) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37702 extends n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C37702(zu.d<? super C37702> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            OfferwallEventData offerwallEventData;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                if (flowCollector.emit(offerwallEventData2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                offerwallEventData = offerwallEventData2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offerwallEventData = (OfferwallEventData) this.L$0;
                a0.throwOnFailure(obj);
            }
            return b.boxBoolean(!k0.contains(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super OfferwallEventData> flowCollector, OfferwallEventData offerwallEventData, zu.d<? super Boolean> dVar) {
            C37702 c37702 = new C37702(dVar);
            c37702.L$0 = flowCollector;
            c37702.L$1 = offerwallEventData;
            return c37702.invokeSuspend(x0.f87415a);
        }
    }

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallBridge) {
        e0.checkNotNullParameter(offerwallBridge, "offerwallBridge");
        this.offerwallBridge = offerwallBridge;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object getVersion(zu.d<? super String> dVar) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isAdReady(String str, zu.d<? super Boolean> dVar) {
        return b.boxBoolean(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isConnected(zu.d<? super Boolean> dVar) {
        return b.boxBoolean(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(java.lang.String r6, zu.d<? super tu.x0> r7) throws java.lang.IllegalAccessException, com.unity3d.ads.core.data.model.exception.LoadException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            tu.a0.throwOnFailure(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            tu.a0.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Offerwall Manager - loadAd: "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r7)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r7 = r5.offerwallBridge
            kotlinx.coroutines.flow.SharedFlow r7 = r7.getOfferwallEventFlow()
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2
            r2.<init>(r6, r4)
            kotlinx.coroutines.flow.SharedFlow r7 = kotlinx.coroutines.flow.FlowKt.onSubscription(r7, r2)
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r2, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r6 = r7
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r6 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r6
            com.unity3d.services.ads.offerwall.OfferwallEvent r6 = r6.getOfferwallEvent()
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            if (r6 == r0) goto L71
            r4 = r7
        L71:
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r4
            if (r4 == 0) goto L94
            com.unity3d.ads.core.data.model.exception.LoadException r6 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Error loading offerwall ad: "
            r7.<init>(r0)
            java.lang.String r0 = r4.getErrorMessage()
            if (r0 != 0) goto L88
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = r4.getOfferwallEvent()
        L88:
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r0 = 0
            r6.<init>(r0, r7)
            throw r6
        L94:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd(java.lang.String, zu.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Flow<OfferwallEventData> showAd(String placementName) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(placementName, "placementName");
        DeviceLog.debug("Offerwall Manager - showAd: " + placementName);
        return FlowKt.transformWhile(FlowKt.onSubscription(this.offerwallBridge.getOfferwallEventFlow(), new C37691(placementName, null)), new C37702(null));
    }
}
