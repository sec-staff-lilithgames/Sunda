package com.unity3d.ads.core.domain;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import uu.p1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ l $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onSubscription = lVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$onSubscription, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                l lVar = this.$onSubscription;
                this.label = 1;
                if (lVar.invoke(this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super Invocation> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ Map<String, kv.a> $definition;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements l {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, d<? super AnonymousClass1> dVar) {
                super(1, dVar);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // bv.a
            public final d<x0> create(d<?> dVar) {
                return new AnonymousClass1(this.$exposedFunction, this.$it, dVar);
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
                ExposedFunction exposedFunction = this.$exposedFunction;
                Object[] parameters = this.$it.getParameters();
                this.label = 1;
                Object objInvoke = exposedFunction.invoke(parameters, this);
                return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
            }

            @Override // kv.l
            public final Object invoke(d<Object> dVar) {
                return ((AnonymousClass1) create(dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Map<String, ? extends kv.a> map, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$definition = map;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$definition, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kv.p
        public final Object invoke(Invocation invocation, d<? super x0> dVar) {
            return ((AnonymousClass2) create(invocation, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            ExposedFunction exposedFunction;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Invocation invocation = (Invocation) this.L$0;
                kv.a aVar = this.$definition.get(invocation.getLocation());
                if (aVar != null && (exposedFunction = (ExposedFunction) aVar.invoke()) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(exposedFunction, invocation, null);
                    this.label = 1;
                    if (invocation.handle(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0Var;
        }
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final Flow<Invocation> invoke(SharedFlow<Invocation> onInvocations, String adData, String adDataRefreshToken, String impressionConfig, AdObject adObject, l onSubscription) {
        e0.checkNotNullParameter(onInvocations, "onInvocations");
        e0.checkNotNullParameter(adData, "adData");
        e0.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        e0.checkNotNullParameter(impressionConfig, "impressionConfig");
        e0.checkNotNullParameter(adObject, "adObject");
        e0.checkNotNullParameter(onSubscription, "onSubscription");
        return FlowKt.onEach(FlowKt.onSubscription(onInvocations, new AnonymousClass1(onSubscription, null)), new AnonymousClass2(p1.mapOf(tu.e0.to(ExposedFunctionLocation.GET_AD_CONTEXT, new HandleInvocationsFromAdViewer$invoke$definition$1(this, AdData.m3476constructorimpl(adData), ImpressionConfig.m3490constructorimpl(impressionConfig), AdDataRefreshToken.m3483constructorimpl(adDataRefreshToken), adObject)), tu.e0.to(ExposedFunctionLocation.GET_CONNECTION_TYPE, new HandleInvocationsFromAdViewer$invoke$definition$2(this)), tu.e0.to(ExposedFunctionLocation.GET_DEVICE_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$3(this)), tu.e0.to(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$4(this)), tu.e0.to(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new HandleInvocationsFromAdViewer$invoke$definition$5(this)), tu.e0.to(ExposedFunctionLocation.GET_SCREEN_WIDTH, new HandleInvocationsFromAdViewer$invoke$definition$6(this)), tu.e0.to(ExposedFunctionLocation.OPEN_URL, new HandleInvocationsFromAdViewer$invoke$definition$7(this)), tu.e0.to(ExposedFunctionLocation.SET_ORIENTATION, new HandleInvocationsFromAdViewer$invoke$definition$8(adObject)), tu.e0.to(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$9(this, adObject)), tu.e0.to(ExposedFunctionLocation.STORAGE_WRITE, HandleInvocationsFromAdViewer$invoke$definition$10.INSTANCE), tu.e0.to(ExposedFunctionLocation.STORAGE_READ, HandleInvocationsFromAdViewer$invoke$definition$11.INSTANCE), tu.e0.to(ExposedFunctionLocation.STORAGE_DELETE, HandleInvocationsFromAdViewer$invoke$definition$12.INSTANCE), tu.e0.to(ExposedFunctionLocation.STORAGE_CLEAR, HandleInvocationsFromAdViewer$invoke$definition$13.INSTANCE), tu.e0.to(ExposedFunctionLocation.STORAGE_GET_KEYS, HandleInvocationsFromAdViewer$invoke$definition$14.INSTANCE), tu.e0.to(ExposedFunctionLocation.STORAGE_GET, HandleInvocationsFromAdViewer$invoke$definition$15.INSTANCE), tu.e0.to(ExposedFunctionLocation.STORAGE_SET, HandleInvocationsFromAdViewer$invoke$definition$16.INSTANCE), tu.e0.to(ExposedFunctionLocation.GET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$17(this)), tu.e0.to(ExposedFunctionLocation.SET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$18(this)), tu.e0.to(ExposedFunctionLocation.GET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$19(this)), tu.e0.to(ExposedFunctionLocation.SET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$20(this)), tu.e0.to(ExposedFunctionLocation.GET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$21(this)), tu.e0.to(ExposedFunctionLocation.SET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$22(this)), tu.e0.to(ExposedFunctionLocation.GET_SESSION_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$23(this)), tu.e0.to(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new HandleInvocationsFromAdViewer$invoke$definition$24(this, adObject)), tu.e0.to(ExposedFunctionLocation.REFRESH_AD_DATA, new HandleInvocationsFromAdViewer$invoke$definition$25(this, adObject)), tu.e0.to(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new HandleInvocationsFromAdViewer$invoke$definition$26(this, adObject)), tu.e0.to(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$27(adObject)), tu.e0.to(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new HandleInvocationsFromAdViewer$invoke$definition$28(this)), tu.e0.to(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$29(this, adObject)), tu.e0.to(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new HandleInvocationsFromAdViewer$invoke$definition$30(this)), tu.e0.to(ExposedFunctionLocation.DOWNLOAD, new HandleInvocationsFromAdViewer$invoke$definition$31(this, adObject)), tu.e0.to(ExposedFunctionLocation.IS_FILE_CACHED, new HandleInvocationsFromAdViewer$invoke$definition$32(this)), tu.e0.to(ExposedFunctionLocation.OM_START_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$33(this, adObject)), tu.e0.to(ExposedFunctionLocation.OM_FINISH_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$34(this, adObject)), tu.e0.to(ExposedFunctionLocation.OM_IMPRESSION, new HandleInvocationsFromAdViewer$invoke$definition$35(this, adObject)), tu.e0.to(ExposedFunctionLocation.OM_GET_DATA, new HandleInvocationsFromAdViewer$invoke$definition$36(this)), tu.e0.to(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new HandleInvocationsFromAdViewer$invoke$definition$37(this)), tu.e0.to(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new HandleInvocationsFromAdViewer$invoke$definition$38(this, adObject)), tu.e0.to(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new HandleInvocationsFromAdViewer$invoke$definition$39(this, adObject)), tu.e0.to(ExposedFunctionLocation.LOAD_SCAR_AD, new HandleInvocationsFromAdViewer$invoke$definition$40(this, adObject)), tu.e0.to(ExposedFunctionLocation.SHOW_SCAR_AD, HandleInvocationsFromAdViewer$invoke$definition$41.INSTANCE), tu.e0.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new HandleInvocationsFromAdViewer$invoke$definition$42(this)), tu.e0.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new HandleInvocationsFromAdViewer$invoke$definition$43(this)), tu.e0.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new HandleInvocationsFromAdViewer$invoke$definition$44(this)), tu.e0.to(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new HandleInvocationsFromAdViewer$invoke$definition$45(this, adObject)), tu.e0.to(ExposedFunctionLocation.SHOW_OFFERWALL_AD, HandleInvocationsFromAdViewer$invoke$definition$46.INSTANCE), tu.e0.to(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new HandleInvocationsFromAdViewer$invoke$definition$47(this)), tu.e0.to(ExposedFunctionLocation.REQUEST_GET, new HandleInvocationsFromAdViewer$invoke$definition$48(this)), tu.e0.to(ExposedFunctionLocation.REQUEST_POST, new HandleInvocationsFromAdViewer$invoke$definition$49(this)), tu.e0.to(ExposedFunctionLocation.REQUEST_HEAD, new HandleInvocationsFromAdViewer$invoke$definition$50(this)), tu.e0.to(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new HandleInvocationsFromAdViewer$invoke$definition$51(adObject))), null));
    }
}
