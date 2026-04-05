package com.sfbx.appconsentv3.ui;

import android.content.Context;
import com.sfbx.appconsent.core.proxy.WebViewProxy;
import com.sfbx.appconsent.core.startup.ACContext;
import com.sfbx.appconsentv3.AppConsent;
import com.sfbx.appconsentv3.model.XChangeData;
import com.sfbx.appconsentv3.model.XChangeDataKt;
import com.sfbx.appconsentv3.ui.model.ACConfiguration;
import com.sfbx.appconsentv3.ui.util.Appkey;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentSDK extends AbstractAppConsent {
    private static AppConsent appConsent;
    private static AppConsentSDK appConsentSDK;
    private static boolean isInitializingOnErrorDueToWebViewComponent;
    public static final Companion Companion = new Companion(null);
    private static final String tag = "AppConsentSDK";
    private static final AtomicBoolean hasTriedToInitAgainAfterContextError = new AtomicBoolean(false);
    private static AtomicBoolean initialized = new AtomicBoolean(false);
    private static AtomicBoolean initializing = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Appkey.AppKeyErrorType.values().length];
                try {
                    iArr[Appkey.AppKeyErrorType.FORBIDDEN_UUID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Appkey.AppKeyErrorType.INVALID_UUID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ void initialize$default(Companion companion, String str, ACConfiguration aCConfiguration, l lVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                aCConfiguration = new ACConfiguration.Builder().build();
            }
            companion.initialize(str, aCConfiguration, lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logDebug(String str) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = AppConsentSDK.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            ACLoggerContract.DefaultImpls.d$default(aCLogger, tag, str, null, 4, null);
        }

        private final void logError(String str, Throwable th2) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = AppConsentSDK.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            aCLogger.e(tag, str, th2);
        }

        public static /* synthetic */ void logError$default(Companion companion, String str, Throwable th2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            companion.logError(str, th2);
        }

        private final void logInfo(String str) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = AppConsentSDK.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            ACLoggerContract.DefaultImpls.i$default(aCLogger, tag, str, null, 4, null);
        }

        private final void logWarning(String str) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag = AppConsentSDK.tag;
            e0.checkNotNullExpressionValue(tag, "tag");
            ACLoggerContract.DefaultImpls.w$default(aCLogger, tag, str, null, 4, null);
        }

        private final void manageAppConsentSDKOnError(String str, ACConfiguration aCConfiguration, l lVar) {
            if (!getHasTriedToInitAgainAfterContextError$appconsent_ui_v3_prodXchangeRelease().compareAndSet(false, true)) {
                logError$default(this, System.lineSeparator() + "We are unable to restart the CMP ourselves." + System.lineSeparator() + "Please refer to our documentation and examples on gitlab to ensure that all initialization steps have been followed." + System.lineSeparator() + "If not, please contact our support team.", null, 2, null);
                return;
            }
            if (AppConsentSDK.isInitializingOnErrorDueToWebViewComponent) {
                logInfo("It seems that an initial problem with the WebView component occurred during initialization.");
                logInfo("A new initialization attempt is underway...");
            } else {
                logInfo("AppConsentInitializer has not been called, we will try to restart the CMP.");
                if (!ACContext.INSTANCE.isInternalACContextLoaded()) {
                    logError$default(this, System.lineSeparator() + "********************************************************************************************************" + System.lineSeparator() + "* The Android context has not been loaded by the [androidx.startup.Initializer] plugin.                *" + System.lineSeparator() + "* If you encounter this error, please let us know through support so that we can improve the product.  *" + System.lineSeparator() + "* To resolve this error, call the [AppConsentSDK.loadContext] method.                                  *" + System.lineSeparator() + "********************************************************************************************************", null, 2, null);
                    return;
                }
            }
            logDebug("Start of the CMP core...");
            initializingByStartUpRuntime$appconsent_ui_v3_prodXchangeRelease();
            initialize(str, aCConfiguration, lVar);
        }

        private final void reset() {
            AppConsentSDK.initialized.set(false);
            AppConsentSDK.initializing.set(false);
            AppConsentSDK.appConsent = null;
        }

        @f
        public final void forceInit() {
            reset();
            getHasTriedToInitAgainAfterContextError$appconsent_ui_v3_prodXchangeRelease().set(false);
            AppConsentSDK.isInitializingOnErrorDueToWebViewComponent = false;
            initializingByStartUpRuntime$appconsent_ui_v3_prodXchangeRelease();
        }

        public final AppConsentSDK getAppConsentSDK$appconsent_ui_v3_prodXchangeRelease() {
            return AppConsentSDK.appConsentSDK;
        }

        public final AtomicBoolean getHasTriedToInitAgainAfterContextError$appconsent_ui_v3_prodXchangeRelease() {
            return AppConsentSDK.hasTriedToInitAgainAfterContextError;
        }

        public final AppConsent getInstance() {
            return AppConsentSDK.appConsent;
        }

        public final void initialize(String appKey, l onReady) {
            e0.checkNotNullParameter(appKey, "appKey");
            e0.checkNotNullParameter(onReady, "onReady");
            initialize$default(this, appKey, null, onReady, 2, null);
        }

        public final void initializingByStartUpRuntime$appconsent_ui_v3_prodXchangeRelease() {
            logDebug(">> initializingByStartUpRuntime");
            logDebug("First stage of initialization in progress...");
            u uVar = null;
            try {
                Context acContext = ACContext.INSTANCE.getAcContext();
                AppConsentSDK.isInitializingOnErrorDueToWebViewComponent = false;
                if (WebViewProxy.INSTANCE.isWebViewComponentIsAvailable(acContext)) {
                    setAppConsentSDK$appconsent_ui_v3_prodXchangeRelease(new AppConsentSDK(acContext, uVar));
                    logDebug("First stage of initialization performed");
                } else {
                    AppConsentSDK.isInitializingOnErrorDueToWebViewComponent = true;
                    logDebug("First stage of initialization on error !");
                }
            } catch (Throwable unused) {
                logError$default(this, System.lineSeparator() + "**************************************************************************************" + System.lineSeparator() + "* A problem has arisen during the initialization of our CMP and                      *" + System.lineSeparator() + "* we are unable to go any further in the initialization process.                     *" + System.lineSeparator() + "* Either the problem is local, in which case the CMP should attempt to reset itself. *" + System.lineSeparator() + "* Or the error is unknown, in which case we encourage you                            *" + System.lineSeparator() + "* to contact support to provide further information and enable us to analyser.       *" + System.lineSeparator() + "**************************************************************************************", null, 2, null);
            }
            logDebug("<< initializingByStartUpRuntime");
        }

        public final boolean isSdkInitialized() {
            return AppConsentSDK.initialized.get();
        }

        public final boolean isSdkInitializing() {
            return !AppConsentSDK.initialized.get() && AppConsentSDK.initializing.get();
        }

        @f
        public final boolean isSdkOnError() {
            return getHasTriedToInitAgainAfterContextError$appconsent_ui_v3_prodXchangeRelease().get() || AppConsentSDK.isInitializingOnErrorDueToWebViewComponent;
        }

        public final void loadContext(Context context) {
            Context applicationContext;
            reset();
            getHasTriedToInitAgainAfterContextError$appconsent_ui_v3_prodXchangeRelease().set(false);
            if (context == null) {
                logError$default(this, "There's no reason to pass null ! You have been warned.", null, 2, null);
            }
            if (context == null || (applicationContext = context.getApplicationContext()) == null) {
                return;
            }
            ACContext.INSTANCE.injectAsACContext(applicationContext);
        }

        public final void setAppConsentSDK$appconsent_ui_v3_prodXchangeRelease(AppConsentSDK appConsentSDK) {
            AppConsentSDK.appConsentSDK = appConsentSDK;
        }

        private Companion() {
        }

        public final void initialize(String appKey, ACConfiguration configuration, l onReady) {
            e0.checkNotNullParameter(appKey, "appKey");
            e0.checkNotNullParameter(configuration, "configuration");
            e0.checkNotNullParameter(onReady, "onReady");
            reset();
            Appkey.Response responseIsValidAppKey = Appkey.INSTANCE.isValidAppKey(appKey);
            if (responseIsValidAppKey instanceof Appkey.Response.Error) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[((Appkey.Response.Error) responseIsValidAppKey).getErrorType().ordinal()];
                if (i10 == 1) {
                    logError$default(this, "The \"appKey\" must match the one generated on your DashBoard \"https://app.appconsent.io/\". This \"appKey\" is not compliant", null, 2, null);
                    return;
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    logError$default(this, "The \"appKey\" must match the one generated on your DashBoard \"https://app.appconsent.io/\"", null, 2, null);
                    return;
                }
            }
            if (getAppConsentSDK$appconsent_ui_v3_prodXchangeRelease() == null) {
                reset();
                manageAppConsentSDKOnError(appKey, configuration, onReady);
                return;
            }
            try {
                AppConsentSDK.initializing.set(true);
                logDebug("Initialization in progress...");
                AppConsentSDK appConsentSDK$appconsent_ui_v3_prodXchangeRelease = getAppConsentSDK$appconsent_ui_v3_prodXchangeRelease();
                if (appConsentSDK$appconsent_ui_v3_prodXchangeRelease != null) {
                    appConsentSDK$appconsent_ui_v3_prodXchangeRelease.setupByUser$appconsent_ui_v3_prodXchangeRelease(appKey, configuration.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease(), configuration.getForceApplyGDPR$appconsent_ui_v3_prodXchangeRelease(), configuration.getFullScreenMode$appconsent_ui_v3_prodXchangeRelease(), configuration.isNeedToDisplayButtonsAtVertical$appconsent_ui_v3_prodXchangeRelease(), configuration.isNeedToReplaceUrlViewerByQrCode$appconsent_ui_v3_prodXchangeRelease(), new AppConsentSDK$Companion$initialize$1(onReady));
                }
            } catch (Throwable th2) {
                AppConsentSDK.initializing.set(false);
                logDebug("Initialization on error");
                logError("Unable to initialize the SDK", th2);
            }
        }

        public static /* synthetic */ void getAppConsentSDK$appconsent_ui_v3_prodXchangeRelease$annotations() {
        }

        public static /* synthetic */ void getHasTriedToInitAgainAfterContextError$appconsent_ui_v3_prodXchangeRelease$annotations() {
        }
    }

    public /* synthetic */ AppConsentSDK(Context context, u uVar) {
        this(context);
    }

    @f
    public static final void forceInit() {
        Companion.forceInit();
    }

    public static final AppConsent getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(String str, ACConfiguration aCConfiguration, l lVar) {
        Companion.initialize(str, aCConfiguration, lVar);
    }

    public static final boolean isSdkInitialized() {
        return Companion.isSdkInitialized();
    }

    public static final boolean isSdkInitializing() {
        return Companion.isSdkInitializing();
    }

    @f
    public static final boolean isSdkOnError() {
        return Companion.isSdkOnError();
    }

    public static final void loadContext(Context context) {
        Companion.loadContext(context);
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void sendXchangeData() {
        getAppConsentBusiness().sendXchangeData();
    }

    @Override // com.sfbx.appconsentv3.AppConsent
    public void setXchangeUserData(XChangeData xChangeData) {
        getAppConsentBusiness().setXchangeUserData(xChangeData != null ? XChangeDataKt.convertTo(xChangeData) : null);
    }

    public final void setupByUser$appconsent_ui_v3_prodXchangeRelease(String appKey, AppConsentTheme appConsentTheme, boolean z10, boolean z11, boolean z12, boolean z13, l onReady) {
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(onReady, "onReady");
        launchByUser$appconsent_ui_v3_prodXchangeRelease(appKey, appConsentTheme, z10, z11, z12, z13, onReady);
    }

    private AppConsentSDK(Context context) {
        super(context);
    }

    public static final void initialize(String str, l lVar) {
        Companion.initialize(str, lVar);
    }
}
