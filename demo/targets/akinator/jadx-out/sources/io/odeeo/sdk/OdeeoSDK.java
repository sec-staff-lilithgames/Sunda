package io.odeeo.sdk;

import android.content.Context;
import com.ironsource.C3191e4;
import io.odeeo.internal.g1.a;
import io.odeeo.internal.m1.c;
import io.odeeo.internal.n1.e;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.common.LogLevel;
import io.odeeo.sdk.common.SdkInitializationListener;
import io.odeeo.sdk.consent.ConsentType;
import io.odeeo.sdk.state.CancellationOption;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONException;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OdeeoSDK {
    public static final String SDK_VERSION = "v3.4.0+441-3a2c98e0-release";
    public static io.odeeo.internal.g1.a appComponent;

    /* renamed from: e, reason: collision with root package name */
    public static SdkInitializationListener f67973e;

    /* renamed from: h, reason: collision with root package name */
    public static final SdkInitializationListener f67976h;

    /* renamed from: i, reason: collision with root package name */
    public static io.odeeo.internal.i1.a f67977i;
    public static io.odeeo.internal.d1.h poParameters;
    public static final OdeeoSDK INSTANCE = new OdeeoSDK();

    /* renamed from: a, reason: collision with root package name */
    public static io.odeeo.internal.f1.d f67969a = new io.odeeo.internal.f1.d(null, null, null, null, null, false, null, 127, null);

    /* renamed from: b, reason: collision with root package name */
    public static LogLevel f67970b = LogLevel.None;

    /* renamed from: c, reason: collision with root package name */
    public static final tu.o f67971c = tu.q.lazy(a.f67978a);

    /* renamed from: d, reason: collision with root package name */
    public static final Set<AdUnit> f67972d = Collections.synchronizedSet(new HashSet());

    /* renamed from: f, reason: collision with root package name */
    public static CoroutineScope f67974f = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* renamed from: g, reason: collision with root package name */
    public static MutableStateFlow<Boolean> f67975g = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f67978a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kv.a
        public final io.odeeo.internal.v1.j invoke() {
            return new io.odeeo.internal.v1.j(false, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements SdkInitializationListener {
        @Override // io.odeeo.sdk.common.SdkInitializationListener
        public void onInitializationFailed(int i10, String errorMessage) {
            e0.checkNotNullParameter(errorMessage, "errorMessage");
            io.odeeo.internal.b2.a.w("Initialization Failed", new Object[0]);
            SdkInitializationListener sdkInitializationListener = OdeeoSDK.f67973e;
            if (sdkInitializationListener == null) {
                return;
            }
            sdkInitializationListener.onInitializationFailed(i10, errorMessage);
        }

        @Override // io.odeeo.sdk.common.SdkInitializationListener
        public void onInitializationSucceed() {
            io.odeeo.internal.b2.a.i("Initialization Succeeds", new Object[0]);
            OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
            odeeoSDK.getInitializerManager$odeeoSdk_release().unlockInit();
            odeeoSDK.getInitializerManager$odeeoSdk_release().initialize();
            SdkInitializationListener sdkInitializationListener = OdeeoSDK.f67973e;
            if (sdkInitializationListener != null) {
                sdkInitializationListener.onInitializationSucceed();
            }
            Iterator<AdUnit> it = odeeoSDK.getAdUnitsSet$odeeoSdk_release().iterator();
            while (it.hasNext()) {
                it.next().loadAd(AdUnit.RequestType.STANDARD);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.OdeeoSDK$checkIfLimitAdTrackingChanged$1", f = "OdeeoSDK.kt", i = {0}, l = {278}, m = "invokeSuspend", n = {C3191e4.i.M}, s = {"L$0"})
    public static final class c extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public Object f67979a;

        /* renamed from: b, reason: collision with root package name */
        public int f67980b;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Boolean bool;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f67980b;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                WeakReference<Context> appContext$odeeoSdk_release = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().getAppContext$odeeoSdk_release();
                Context context = appContext$odeeoSdk_release == null ? null : appContext$odeeoSdk_release.get();
                e0.checkNotNull(context);
                e0.checkNotNullExpressionValue(context, "poParameters.personalInfo.appContext?.get()!!");
                io.odeeo.internal.m1.a idFromStorage = io.odeeo.internal.m1.d.f64727j.readIdFromStorage(context);
                Boolean boolBoxBoolean = idFromStorage == null ? null : bv.b.boxBoolean(idFromStorage.isDoNotTrack());
                io.odeeo.internal.m1.c cVar = io.odeeo.internal.m1.c.f64722a;
                this.f67979a = boolBoxBoolean;
                this.f67980b = 1;
                obj = cVar.fetchAdvertisingInfoSync(context, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bool = boolBoxBoolean;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool = (Boolean) this.f67979a;
                a0.throwOnFailure(obj);
            }
            c.a aVar = (c.a) obj;
            if (!e0.areEqual(aVar == null ? null : bv.b.boxBoolean(aVar.getLimitAdTracking()), bool) && OdeeoSDK.isInitialized()) {
                io.odeeo.internal.f1.a.callUpdateGeneralConsentEndpoint$default(OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().getConsentDataManager$odeeoSdk_release(), null, 1, null);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.OdeeoSDK$initialize$1", f = "OdeeoSDK.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67981a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f67982b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, String str, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f67982b = context;
            this.f67983c = str;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new d(this.f67982b, this.f67983c, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f67981a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
                Context context = this.f67982b;
                String str = this.f67983c;
                this.f67981a = 1;
                if (odeeoSDK.a(context, str, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.OdeeoSDK", f = "OdeeoSDK.kt", i = {0}, l = {128}, m = "initializeInternal", n = {"this"}, s = {"L$0"})
    public static final class e extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f67984a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67985b;

        /* renamed from: d, reason: collision with root package name */
        public int f67987d;

        public e(zu.d<? super e> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f67985b = obj;
            this.f67987d |= Integer.MIN_VALUE;
            return OdeeoSDK.this.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.OdeeoSDK$initializeInternal$2", f = "OdeeoSDK.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67988a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f67989b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f67989b = context;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new f(this.f67989b, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f67988a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            OdeeoSDK.INSTANCE.getInitializerManager$odeeoSdk_release().onBeforeInit(this.f67989b);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.OdeeoSDK$initializeInternal$3", f = "OdeeoSDK.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67990a;

        public g(zu.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new g(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f67990a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().initParameters();
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f67991a = new h();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends f0 implements kv.l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f67992a = new a();

            public a() {
                super(1);
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.a) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.a errorState) {
                e0.checkNotNullParameter(errorState, "errorState");
                OdeeoSDK.INSTANCE.invokeOnInitializationFailed$odeeoSdk_release(errorState);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends f0 implements kv.l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f67993a = new b();

            public b() {
                super(1);
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.h) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.h errorState) {
                e0.checkNotNullParameter(errorState, "errorState");
                OdeeoSDK.INSTANCE.invokeOnInitializationFailed$odeeoSdk_release(errorState);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c extends f0 implements kv.l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f67994a = new c();

            public c() {
                super(1);
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.b) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.b errorState) {
                e0.checkNotNullParameter(errorState, "errorState");
                OdeeoSDK.INSTANCE.invokeOnInitializationFailed$odeeoSdk_release(errorState);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class d extends f0 implements kv.l {

            /* renamed from: a, reason: collision with root package name */
            public static final d f67995a = new d();

            public d() {
                super(1);
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.g) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.g errorState) {
                e0.checkNotNullParameter(errorState, "errorState");
                OdeeoSDK.INSTANCE.invokeOnInitializationFailed$odeeoSdk_release(errorState);
            }
        }

        public h() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e.a) obj);
            return x0.f87415a;
        }

        public final void invoke(e.a stateListenerLaunch) {
            e0.checkNotNullParameter(stateListenerLaunch, "$this$stateListenerLaunch");
            stateListenerLaunch.onBadInternetError(a.f67992a);
            stateListenerLaunch.onWrongAuthenticationDataError(b.f67993a);
            stateListenerLaunch.onBadRequestError(c.f67994a);
            stateListenerLaunch.onError(d.f67995a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final i f67996a = new i();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f67997a = new a();

            public a() {
                super(0);
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m4622invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4622invoke() {
                OdeeoSDK.INSTANCE.getInitializerManager$odeeoSdk_release().onInitializationSucceed();
            }
        }

        public i() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((io.odeeo.internal.n1.c) obj);
            return x0.f87415a;
        }

        public final void invoke(io.odeeo.internal.n1.c result) {
            e0.checkNotNullParameter(result, "result");
            if (result instanceof io.odeeo.internal.n1.f) {
                OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
                odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().sessionStart();
                odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getConsentDataManager$odeeoSdk_release().callUpdateGeneralConsentEndpoint(a.f67997a);
            }
        }
    }

    static {
        b bVar = new b();
        f67976h = bVar;
        f67977i = new io.odeeo.internal.i1.b(bVar);
    }

    public static final void addCustomAttribute(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        io.odeeo.internal.d1.e.f63657a.add(str, str2);
    }

    public static final void clearCustomAttributes() {
        io.odeeo.internal.d1.e.f63657a.clear();
    }

    public static final void clearForceRegulationType() {
        OdeeoSDK odeeoSDK = INSTANCE;
        if (odeeoSDK.isParamsInitialized$odeeoSdk_release()) {
            odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().clearForceRegulationType$odeeoSdk_release();
        } else {
            f67969a.clearForceRegulationType();
        }
    }

    public static final void forceRegulationType(ConsentType consentType) {
        OdeeoSDK odeeoSDK = INSTANCE;
        if (!odeeoSDK.isParamsInitialized$odeeoSdk_release()) {
            if (consentType == null) {
                return;
            }
            odeeoSDK.getDefaultConsentData$odeeoSdk_release().forceRegulationType(consentType);
        } else {
            io.odeeo.internal.u1.a personalInfo = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo();
            personalInfo.forceRegulationType$odeeoSdk_release(consentType);
            if (isInitialized()) {
                io.odeeo.internal.f1.a.callUpdateGeneralConsentEndpoint$default(personalInfo.getConsentDataManager$odeeoSdk_release(), null, 1, null);
            }
        }
    }

    public static final List<Map.Entry<String, String>> getCustomAttributes() {
        return io.odeeo.internal.d1.e.f63657a.getAllAttributes();
    }

    public static final float getDeviceVolumeLevel() {
        OdeeoSDK odeeoSDK = INSTANCE;
        if (!odeeoSDK.isParamsInitialized$odeeoSdk_release() || odeeoSDK.getPoParameters$odeeoSdk_release().getClientMetadata() == null) {
            io.odeeo.internal.b2.a.w("Unable to detect Device Volume Level. Sent -1. Please make sure OdeeoSDK is initialized.", new Object[0]);
            return -1.0f;
        }
        io.odeeo.internal.m1.b clientMetadata = odeeoSDK.getPoParameters$odeeoSdk_release().getClientMetadata();
        e0.checkNotNull(clientMetadata);
        return clientMetadata.getDeviceVolumeLevel();
    }

    public static final String getPublisherUserID() {
        OdeeoSDK odeeoSDK = INSTANCE;
        return odeeoSDK.isParamsInitialized$odeeoSdk_release() ? odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getPublisherUserID$odeeoSdk_release() : f67969a.getPublisherUserID();
    }

    public static final ConsentType getRegulationType() {
        OdeeoSDK odeeoSDK = INSTANCE;
        return odeeoSDK.isParamsInitialized$odeeoSdk_release() ? odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getRegulationType$odeeoSdk_release() : f67969a.getRegulationType$odeeoSdk_release();
    }

    public static final void initialize(Context context, String appKey) throws ExecutionException, JSONException, InterruptedException {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(appKey, "appKey");
        BuildersKt__Builders_commonKt.launch$default(f67974f, null, null, new d(context, appKey, null), 3, null);
    }

    public static final boolean isInitialized() {
        return f67977i.isInitialized();
    }

    public static final void onPause() {
        io.odeeo.internal.b2.a.i(C3191e4.h.f36510t0, new Object[0]);
        f67975g.setValue(Boolean.TRUE);
        if (isInitialized()) {
            INSTANCE.getPoParameters$odeeoSdk_release().getSessionManager().pause();
        } else {
            io.odeeo.internal.b2.a.d("SDK is not initialized - return", new Object[0]);
        }
    }

    public static final void onResume() {
        io.odeeo.internal.b2.a.i(C3191e4.h.f36512u0, new Object[0]);
        f67975g.setValue(Boolean.FALSE);
        if (isInitialized()) {
            OdeeoSDK odeeoSDK = INSTANCE;
            odeeoSDK.checkIfLimitAdTrackingChanged$odeeoSdk_release();
            odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().resume();
        }
    }

    public static final void removeCustomAttribute(String str) {
        if (str == null) {
            return;
        }
        io.odeeo.internal.d1.e.f63657a.removeByKey(str);
    }

    public static final void setDoNotSell(boolean z10) {
        OdeeoSDK odeeoSDK = INSTANCE;
        if (odeeoSDK.isParamsInitialized$odeeoSdk_release()) {
            odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().setDoNotSell$odeeoSdk_release(z10, null);
        } else {
            f67969a.setDoNotSell(z10, null);
        }
    }

    public static final void setDoNotSellPrivacyString(String privacyString) {
        e0.checkNotNullParameter(privacyString, "privacyString");
        OdeeoSDK odeeoSDK = INSTANCE;
        if (odeeoSDK.isParamsInitialized$odeeoSdk_release()) {
            odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().setPrivacyStr$odeeoSdk_release(privacyString);
        } else {
            f67969a.setPrivacyStr(privacyString);
        }
    }

    public static final void setEngineInformation(String engineName, String engineVersion) {
        e0.checkNotNullParameter(engineName, "engineName");
        e0.checkNotNullParameter(engineVersion, "engineVersion");
        io.odeeo.internal.d1.f.f63660a.setEngineInfo(engineName, engineVersion);
    }

    public static final void setExtendedUserId(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            io.odeeo.internal.b2.a.w("ExtendedUserId key or value is empty or null", new Object[0]);
        } else {
            io.odeeo.internal.d1.g.f63663a.add(str, str2);
        }
    }

    public static final void setIsChildDirected(boolean z10) {
        OdeeoSDK odeeoSDK = INSTANCE;
        if (!odeeoSDK.isParamsInitialized$odeeoSdk_release()) {
            f67969a.setChildDirected(z10);
            return;
        }
        io.odeeo.internal.u1.a personalInfo = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo();
        personalInfo.setChildDirected$odeeoSdk_release(z10);
        if (isInitialized()) {
            io.odeeo.internal.f1.a.callUpdateGeneralConsentEndpoint$default(personalInfo.getConsentDataManager$odeeoSdk_release(), null, 1, null);
        }
    }

    public static final void setLogLevel(LogLevel level) {
        e0.checkNotNullParameter(level, "level");
        io.odeeo.internal.b2.a.d(e0.stringPlus("setLogLevel: ", level), new Object[0]);
        f67970b = level;
    }

    public static final void setOnInitializationListener(SdkInitializationListener sdkInitializationListener) {
        io.odeeo.internal.b2.a.i(e0.stringPlus("setOnInitializationListener: ", sdkInitializationListener), new Object[0]);
        f67973e = sdkInitializationListener;
    }

    public static final void setPublisherUserID(String str) {
        io.odeeo.internal.b2.a.i(e0.stringPlus("setPublisherUserID: ", str), new Object[0]);
        if (str != null) {
            OdeeoSDK odeeoSDK = INSTANCE;
            if (odeeoSDK.isParamsInitialized$odeeoSdk_release()) {
                odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().setPublisherUserID$odeeoSdk_release(str);
            } else {
                f67969a.setPublisherUserID(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r21, java.lang.String r22, zu.d<? super tu.x0> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            boolean r2 = r1 instanceof io.odeeo.sdk.OdeeoSDK.e
            if (r2 == 0) goto L17
            r2 = r1
            io.odeeo.sdk.OdeeoSDK$e r2 = (io.odeeo.sdk.OdeeoSDK.e) r2
            int r3 = r2.f67987d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f67987d = r3
            goto L1c
        L17:
            io.odeeo.sdk.OdeeoSDK$e r2 = new io.odeeo.sdk.OdeeoSDK$e
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f67985b
            java.lang.Object r3 = av.e.getCOROUTINE_SUSPENDED()
            int r4 = r2.f67987d
            r5 = 0
            tu.x0 r6 = tu.x0.f87415a
            r7 = 1
            if (r4 == 0) goto L3c
            if (r4 != r7) goto L34
            java.lang.Object r2 = r2.f67984a
            io.odeeo.sdk.OdeeoSDK r2 = (io.odeeo.sdk.OdeeoSDK) r2
            tu.a0.throwOnFailure(r1)
            goto La8
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            tu.a0.throwOnFailure(r1)
            io.odeeo.internal.i1.a r1 = r0.getInitializerManager$odeeoSdk_release()
            boolean r1 = r1.isInitializedOrLock()
            if (r1 == 0) goto L4a
            return r6
        L4a:
            java.util.List r1 = io.odeeo.internal.b2.a.forest()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5c
            io.odeeo.internal.c1.a r1 = new io.odeeo.internal.c1.a
            r1.<init>()
            io.odeeo.internal.b2.a.plant(r1)
        L5c:
            io.odeeo.internal.i1.a r1 = r0.getInitializerManager$odeeoSdk_release()
            r1.lockInit()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r4 = "Initialization Started"
            io.odeeo.internal.b2.a.i(r4, r1)
            kotlinx.coroutines.CoroutineScope r8 = r0.getScope$odeeoSdk_release()
            kotlinx.coroutines.CoroutineDispatcher r9 = r0.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release()
            io.odeeo.sdk.OdeeoSDK$f r11 = new io.odeeo.sdk.OdeeoSDK$f
            r1 = 0
            r4 = r21
            r11.<init>(r4, r1)
            r12 = 2
            r13 = 0
            r10 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r8, r9, r10, r11, r12, r13)
            r20.initDi$odeeoSdk_release(r21, r22)
            kotlinx.coroutines.CoroutineScope r14 = r0.getScope$odeeoSdk_release()
            kotlinx.coroutines.CoroutineDispatcher r15 = r0.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release()
            io.odeeo.sdk.OdeeoSDK$g r4 = new io.odeeo.sdk.OdeeoSDK$g
            r4.<init>(r1)
            r18 = 2
            r19 = 0
            r16 = 0
            r17 = r4
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.launch$default(r14, r15, r16, r17, r18, r19)
            r2.f67984a = r0
            r2.f67987d = r7
            java.lang.Object r1 = r1.join(r2)
            if (r1 != r3) goto La7
            return r3
        La7:
            r2 = r0
        La8:
            io.odeeo.internal.d1.h r1 = r2.getPoParameters$odeeoSdk_release()
            io.odeeo.sdk.OdeeoSDK$h r3 = io.odeeo.sdk.OdeeoSDK.h.f67991a
            r1.stateListenerLaunch(r3)
            io.odeeo.internal.n1.e$b r1 = io.odeeo.internal.n1.e.f65065c
            io.odeeo.internal.d1.h r3 = r2.getPoParameters$odeeoSdk_release()
            io.odeeo.internal.u1.a r3 = r3.getPersonalInfo()
            io.odeeo.internal.d1.h r2 = r2.getPoParameters$odeeoSdk_release()
            io.odeeo.internal.d1.a r2 = r2.getConfigManager()
            r4 = 2
            io.odeeo.internal.n1.e[] r4 = new io.odeeo.internal.n1.e[r4]
            r4[r5] = r3
            r4[r7] = r2
            io.odeeo.sdk.OdeeoSDK$i r2 = io.odeeo.sdk.OdeeoSDK.i.f67996a
            r1.combine(r4, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.OdeeoSDK.a(android.content.Context, java.lang.String, zu.d):java.lang.Object");
    }

    public final void addAdUnit$odeeoSdk_release(AdUnit ad2) {
        e0.checkNotNullParameter(ad2, "ad");
        f67972d.add(ad2);
    }

    public final void checkIfLimitAdTrackingChanged$odeeoSdk_release() {
        BuildersKt__Builders_commonKt.launch$default(f67974f, null, null, new c(null), 3, null);
    }

    public final Set<AdUnit> getAdUnitsSet$odeeoSdk_release() {
        return f67972d;
    }

    public final SdkInitializationListener getAllInitializationsFinished$odeeoSdk_release() {
        return f67976h;
    }

    public final io.odeeo.internal.g1.a getAppComponent$odeeoSdk_release() {
        io.odeeo.internal.g1.a aVar = appComponent;
        if (aVar != null) {
            return aVar;
        }
        e0.throwUninitializedPropertyAccessException("appComponent");
        return null;
    }

    public final io.odeeo.internal.f1.d getDefaultConsentData$odeeoSdk_release() {
        return f67969a;
    }

    public final io.odeeo.internal.i1.a getInitializerManager$odeeoSdk_release() {
        return f67977i;
    }

    public final LogLevel getLevel$odeeoSdk_release() {
        return f67970b;
    }

    public final CoroutineDispatcher getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release() {
        return (CoroutineDispatcher) f67971c.getValue();
    }

    public final io.odeeo.internal.d1.h getPoParameters$odeeoSdk_release() {
        io.odeeo.internal.d1.h hVar = poParameters;
        if (hVar != null) {
            return hVar;
        }
        e0.throwUninitializedPropertyAccessException("poParameters");
        return null;
    }

    public final CoroutineScope getScope$odeeoSdk_release() {
        return f67974f;
    }

    public final void initDi$odeeoSdk_release(Context context, String appKey) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(appKey, "appKey");
        setAppComponent$odeeoSdk_release(provideAppComponent$odeeoSdk_release(context, appKey));
        setPoParameters$odeeoSdk_release(getAppComponent$odeeoSdk_release().getOdeeoSDKParameters());
        getPoParameters$odeeoSdk_release().getPersonalInfo().getConsentDataManager$odeeoSdk_release().updateValuesFromIamTcf$odeeoSdk_release();
        f67969a.processDefaultValues(getPoParameters$odeeoSdk_release().getPersonalInfo());
    }

    public final void invokeOnInitializationFailed$odeeoSdk_release(io.odeeo.internal.n1.c baseState) {
        e0.checkNotNullParameter(baseState, "baseState");
        if (baseState.getOnCancellation() == CancellationOption.Cancel) {
            f67977i.onInitializationFailed(baseState.getCode(), baseState.getMessage());
            f67977i.unlockInit();
        }
    }

    public final boolean isParamsInitialized$odeeoSdk_release() {
        return poParameters != null;
    }

    public final MutableStateFlow<Boolean> isPausedFlow$odeeoSdk_release() {
        return f67975g;
    }

    public final io.odeeo.internal.g1.a provideAppComponent$odeeoSdk_release(Context context, String appKey) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(appKey, "appKey");
        a.InterfaceC0616a interfaceC0616aAppKey = io.odeeo.internal.g1.g.builder().context(context).appKey(appKey);
        String packageName = context.getPackageName();
        e0.checkNotNullExpressionValue(packageName, "context.packageName");
        return interfaceC0616aAppKey.bundleId(packageName).build();
    }

    public final void removeAdUnit$odeeoSdk_release(AdUnit ad2) {
        e0.checkNotNullParameter(ad2, "ad");
        f67972d.remove(ad2);
    }

    public final void setAppComponent$odeeoSdk_release(io.odeeo.internal.g1.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        appComponent = aVar;
    }

    public final void setDefaultConsentData$odeeoSdk_release(io.odeeo.internal.f1.d dVar) {
        e0.checkNotNullParameter(dVar, "<set-?>");
        f67969a = dVar;
    }

    public final void setInitializerManager$odeeoSdk_release(io.odeeo.internal.i1.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        f67977i = aVar;
    }

    public final void setLevel$odeeoSdk_release(LogLevel logLevel) {
        e0.checkNotNullParameter(logLevel, "<set-?>");
        f67970b = logLevel;
    }

    public final void setPausedFlow$odeeoSdk_release(MutableStateFlow<Boolean> mutableStateFlow) {
        e0.checkNotNullParameter(mutableStateFlow, "<set-?>");
        f67975g = mutableStateFlow;
    }

    public final void setPoParameters$odeeoSdk_release(io.odeeo.internal.d1.h hVar) {
        e0.checkNotNullParameter(hVar, "<set-?>");
        poParameters = hVar;
    }

    public final void setScope$odeeoSdk_release(CoroutineScope coroutineScope) {
        e0.checkNotNullParameter(coroutineScope, "<set-?>");
        f67974f = coroutineScope;
    }

    public static final List<Map.Entry<String, String>> getCustomAttributes(String key) {
        e0.checkNotNullParameter(key, "key");
        return io.odeeo.internal.d1.e.f63657a.getAllByKey(key);
    }

    public static final void setDoNotSell(boolean z10, String str) {
        OdeeoSDK odeeoSDK = INSTANCE;
        if (odeeoSDK.isParamsInitialized$odeeoSdk_release()) {
            odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().setDoNotSell$odeeoSdk_release(z10, str);
        } else {
            f67969a.setDoNotSell(z10, str);
        }
    }
}
