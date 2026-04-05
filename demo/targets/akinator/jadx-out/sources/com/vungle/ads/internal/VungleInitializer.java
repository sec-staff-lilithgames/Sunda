package com.vungle.ads.internal;

import a.b;
import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.VungleWrapperFramework;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.Utils;
import e3.g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.l;
import sv.n0;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleInitializer {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VungleInitializer";
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private final CopyOnWriteArrayList<InitializationListener> initializationCallbackArray = new CopyOnWriteArrayList<>();
    private final TimeIntervalMetric initDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.VungleInitializer$configure$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return x0.f87415a;
        }

        public final void invoke(boolean z10) {
            Logger.Companion.d(VungleInitializer.TAG, "Config fetch result: " + z10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.VungleInitializer$onInitError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38631 extends f0 implements kv.a {
        final /* synthetic */ VungleError $exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38631(VungleError vungleError) {
            super(0);
            this.$exception = vungleError;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3597invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3597invoke() {
            Logger.Companion.e(VungleInitializer.TAG, "onError");
            CopyOnWriteArrayList copyOnWriteArrayList = VungleInitializer.this.initializationCallbackArray;
            VungleError vungleError = this.$exception;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InitializationListener) it.next()).onError(vungleError);
            }
            VungleInitializer.this.initializationCallbackArray.clear();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.VungleInitializer$onInitSuccess$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38641 extends f0 implements kv.a {
        public C38641() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3598invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3598invoke() {
            Iterator it = VungleInitializer.this.initializationCallbackArray.iterator();
            while (it.hasNext()) {
                ((InitializationListener) it.next()).onSuccess();
            }
            VungleInitializer.this.initializationCallbackArray.clear();
        }
    }

    private final void configure(Context context, String str) {
        Context context2;
        boolean z10;
        try {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            s sVar = s.f87403b;
            o oVarLazy = q.lazy(sVar, (kv.a) new VungleInitializer$configure$$inlined$inject$1(context));
            ConfigManager configManager = ConfigManager.INSTANCE;
            ConfigPayload cachedConfig = configManager.getCachedConfig(m3590configure$lambda4(oVarLazy), str);
            if (cachedConfig != null) {
                context2 = context;
                ConfigManager.initWithConfig$vungle_ads_release$default(configManager, context2, cachedConfig, true, null, 8, null);
                z10 = true;
            } else {
                context2 = context;
                z10 = false;
            }
            this.isInitialized.set(true);
            onInitSuccess();
            Logger.Companion.d(TAG, "Running cleanup jobs. " + Thread.currentThread().getId());
            m3591configure$lambda5(q.lazy(sVar, (kv.a) new VungleInitializer$configure$$inlined$inject$2(context2))).execute(CleanupJob.Companion.makeJobInfo$default(CleanupJob.Companion, null, 1, null));
            if (z10) {
                return;
            }
            configManager.fetchConfigAsync$vungle_ads_release(context2, AnonymousClass1.INSTANCE);
        } catch (Throwable th2) {
            Logger.Companion.e(TAG, "Cannot get config", th2);
        }
    }

    /* renamed from: configure$lambda-4, reason: not valid java name */
    private static final FilePreferences m3590configure$lambda4(o oVar) {
        return (FilePreferences) oVar.getValue();
    }

    /* renamed from: configure$lambda-5, reason: not valid java name */
    private static final JobRunner m3591configure$lambda5(o oVar) {
        return (JobRunner) oVar.getValue();
    }

    private final boolean hasInvalidChar(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.') {
                return true;
            }
        }
        return false;
    }

    private final boolean hasRequiredNetworkPermissions(Context context) {
        return (m3.a.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) && (m3.a.checkSelfPermission(context, "android.permission.INTERNET") == 0);
    }

    /* renamed from: init$lambda-0, reason: not valid java name */
    private static final Executors m3592init$lambda0(o oVar) {
        return (Executors) oVar.getValue();
    }

    /* renamed from: init$lambda-1, reason: not valid java name */
    private static final VungleApiClient m3593init$lambda1(o oVar) {
        return (VungleApiClient) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3594init$lambda2(VungleInitializer this$0, Context context, String appId, o vungleApiClient$delegate) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(context, "$context");
        e0.checkNotNullParameter(appId, "$appId");
        e0.checkNotNullParameter(vungleApiClient$delegate, "$vungleApiClient$delegate");
        if (!this$0.hasRequiredNetworkPermissions(context)) {
            Logger.Companion.e(TAG, "Network permissions not granted");
            ThreadUtil.INSTANCE.runOnUiThread(new VungleInitializer$init$1$1(this$0));
        } else {
            PrivacyManager.INSTANCE.init(context);
            m3593init$lambda1(vungleApiClient$delegate).initialize(appId);
            this$0.configure(context, appId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-3, reason: not valid java name */
    public static final void m3595init$lambda3(VungleInitializer this$0) throws Throwable {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.onInitError(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return n0.isBlank(str) || hasInvalidChar(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitError(VungleError vungleError) throws Throwable {
        this.isInitializing.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + vungleError.getCode();
        }
        this.initDurationMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.initDurationMetric, (LogEntry) null, localizedMessage);
        ThreadUtil.INSTANCE.runOnUiThread(new C38631(vungleError));
        Logger.Companion.e(TAG, localizedMessage);
    }

    private final void onInitSuccess() throws Throwable {
        this.isInitializing.set(false);
        this.initDurationMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.initDurationMetric, (LogEntry) null, (String) null, 6, (Object) null);
        Logger.Companion.d(TAG, "onSuccess " + Thread.currentThread().getId());
        ThreadUtil.INSTANCE.runOnUiThread(new C38641());
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.Companion.deInit();
        VungleApiClient.Companion.reset$vungle_ads_release();
        this.isInitialized.set(false);
        this.isInitializing.set(false);
        this.initializationCallbackArray.clear();
    }

    public final void init(String appId, Context context, InitializationListener initializationCallback) throws Throwable {
        e0.checkNotNullParameter(appId, "appId");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(initializationCallback, "initializationCallback");
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (LogEntry) null, (String) null, 6, (Object) null);
        this.initDurationMetric.markStart();
        this.initializationCallbackArray.add(initializationCallback);
        if (isAppIdInvalid(appId)) {
            StringBuilder sbO = g.o("App id invalid: ", appId, ", package name: ");
            sbO.append(context.getPackageName());
            onInitError(new InvalidAppId(sbO.toString()).logError$vungle_ads_release());
            return;
        }
        if (Utils.INSTANCE.isOSVersionInvalid()) {
            Logger.Companion.e(TAG, "Init: SDK is supported only for API versions 25 and above.");
            onInitError(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.setAppId$vungle_ads_release(appId);
        if (this.isInitialized.get()) {
            Logger.Companion.d(TAG, "init already complete");
            onInitSuccess();
            return;
        }
        int i10 = 1;
        if (this.isInitializing.getAndSet(true)) {
            Logger.Companion.d(TAG, "init already in progress");
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        s sVar = s.f87403b;
        m3592init$lambda0(q.lazy(sVar, (kv.a) new VungleInitializer$init$$inlined$inject$1(context))).getBackgroundExecutor().execute(new al.a(this, context, appId, q.lazy(sVar, (kv.a) new VungleInitializer$init$$inlined$inject$2(context)), 18), new com.unity3d.services.banners.view.a(this, i10));
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    public final AtomicBoolean isInitializing$vungle_ads_release() {
        return this.isInitializing;
    }

    public final void setInitialized$vungle_ads_release(AtomicBoolean atomicBoolean) {
        e0.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        e0.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }

    public final void setIntegrationName(VungleWrapperFramework wrapperFramework, String wrapperFrameworkVersion) {
        e0.checkNotNullParameter(wrapperFramework, "wrapperFramework");
        e0.checkNotNullParameter(wrapperFrameworkVersion, "wrapperFrameworkVersion");
        if (wrapperFramework == VungleWrapperFramework.none) {
            Logger.Companion.e(TAG, "Wrapper is null or is none");
            return;
        }
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String headerUa = vungleHeader.getHeaderUa();
        String str = wrapperFramework.name() + (wrapperFrameworkVersion.length() > 0 ? b.k("/", wrapperFrameworkVersion) : "");
        if (n0.contains$default((CharSequence) headerUa, (CharSequence) str, false, 2, (Object) null)) {
            Logger.Companion.w(TAG, "Wrapper info already set");
            return;
        }
        vungleHeader.setHeaderUa(headerUa + ';' + str);
        if (isInitialized()) {
            Logger.Companion.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }
}
