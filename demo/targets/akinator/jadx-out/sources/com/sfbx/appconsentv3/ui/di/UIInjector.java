package com.sfbx.appconsentv3.ui.di;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCase;
import com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl;
import com.sfbx.appconsentv3.ui.domain.GetLoadUseCase;
import com.sfbx.appconsentv3.ui.domain.GetLoadUseCaseImpl;
import com.sfbx.appconsentv3.ui.domain.GetVendorDetailsUseCase;
import com.sfbx.appconsentv3.ui.domain.GetVendorDetailsUseCaseImpl;
import com.sfbx.appconsentv3.ui.domain.IsGDPRCacheObsoleteUseCase;
import com.sfbx.appconsentv3.ui.domain.IsGDPRCacheObsoleteUseCaseImpl;
import com.sfbx.appconsentv3.ui.domain.IsGDPRForceByClientUseCase;
import com.sfbx.appconsentv3.ui.domain.IsGDPRForceByClientUseCaseImpl;
import com.sfbx.appconsentv3.ui.domain.IsGDPRFromCacheUseCase;
import com.sfbx.appconsentv3.ui.domain.IsGDPRFromCacheUseCaseImpl;
import com.sfbx.appconsentv3.ui.domain.IsNeedToCallHelloWsUseCase;
import com.sfbx.appconsentv3.ui.domain.IsNeedToCallHelloWsUseCaseImpl;
import com.sfbx.appconsentv3.ui.domain.IsNeedToDisplayLegitimateInterestUseCase;
import com.sfbx.appconsentv3.ui.domain.IsNeedToDisplayLegitimateInterestUseCaseImpl;
import com.sfbx.appconsentv3.ui.domain.LoadingUseCase;
import com.sfbx.appconsentv3.ui.domain.LoadingUseCaseImpl;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.ConsentableDetailViewModel;
import com.sfbx.appconsentv3.ui.ui.consentable.stack.StackViewModel;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationViewModel;
import com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel;
import com.sfbx.appconsentv3.ui.ui.load.LoadViewModel;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel;
import com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel;
import com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListViewModel;
import com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UIInjector {
    private static AppConsentTheme _mAppConsentTheme;
    private static AppConsentCore mAppConsentCore;
    public static final UIInjector INSTANCE = new UIInjector();
    private static final String tag = "UIInjector";
    private static WeakReference<Context> mContext = new WeakReference<>(null);

    private UIInjector() {
    }

    private final void clear() {
        mContext.clear();
        _mAppConsentTheme = null;
        mAppConsentCore = null;
    }

    private final AppConsentTheme getMAppConsentTheme() {
        AppConsentTheme appConsentTheme = _mAppConsentTheme;
        if (appConsentTheme != null) {
            return appConsentTheme;
        }
        throwIllegalStateException();
        throw new k();
    }

    private final int getTargetSDKVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            e0.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
            return applicationInfo.targetSdkVersion;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private final void initAppConsentCore() {
        mAppConsentCore = new AppConsentCore(provideContext());
    }

    private final Context provideContext() {
        Context context = mContext.get();
        if (context != null) {
            return context;
        }
        throwContextIllegalStateException();
        throw new k();
    }

    private final Void throwContextIllegalStateException() {
        throw new IllegalStateException("Context has didn't been initialized !");
    }

    private final Void throwIllegalStateException() {
        throw new IllegalStateException("AppConsentTheme has didn't been initialized !");
    }

    public final void checkInstance() {
        provideAppConsentTheme();
        provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease();
    }

    public final void defineNeedToDisplayQrCode(boolean z10) {
        AppConsentCore appConsentCore = mAppConsentCore;
        if (appConsentCore != null) {
            appConsentCore.defineNeedToDisplayQrCode(z10);
        }
    }

    public final AppConsentCore getMAppConsentCore() {
        return mAppConsentCore;
    }

    public final int getTargetSDKVersion$appconsent_ui_v3_prodXchangeRelease() {
        return getTargetSDKVersion(provideContext());
    }

    public final void init(Context context) {
        e0.checkNotNullParameter(context, "context");
        clear();
        mContext = new WeakReference<>(context.getApplicationContext());
        initAppConsentCore();
    }

    public final void initACTheme(AppConsentTheme appConsentTheme) {
        if (appConsentTheme == null) {
            appConsentTheme = new AppConsentTheme.Builder(provideContext()).build();
        }
        _mAppConsentTheme = appConsentTheme;
    }

    public final boolean isAppRuntimeAndTargetAPI35OrAbove$appconsent_ui_v3_prodXchangeRelease() {
        return Build.VERSION.SDK_INT >= 35 && getTargetSDKVersion$appconsent_ui_v3_prodXchangeRelease() >= 35;
    }

    public final AppConsentCore provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease() {
        AppConsentCore appConsentCore = mAppConsentCore;
        e0.checkNotNull(appConsentCore);
        return appConsentCore;
    }

    public final AppConsentTheme provideAppConsentTheme() {
        if (_mAppConsentTheme == null) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.w$default(aCLogger, tag2, "Default AppConsentTheme force to be instanciate again!", null, 4, null);
            initACTheme(null);
        }
        return getMAppConsentTheme();
    }

    public final ConsentableDetailViewModel provideConsentableDetailViewModel() {
        return new ConsentableDetailViewModel(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease(), provideIsNeedToDisplayLegitimateInterestUseCase());
    }

    public final GeolocationViewModel provideGeolocationViewModel() {
        return new GeolocationViewModel(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GetCountryFromBOUseCase provideGetCountryFromBOUseCase() {
        return new GetCountryFromBOUseCaseImpl(null, provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease(), 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GetLoadUseCase provideGetLoadUseCase() {
        return new GetLoadUseCaseImpl(null, provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease(), 1, 0 == true ? 1 : 0);
    }

    public final GetVendorDetailsUseCase provideGetVendorDetailsUseCase() {
        return new GetVendorDetailsUseCaseImpl(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final IntroductionViewModel provideIntroductionViewModel() {
        return new IntroductionViewModel(provideAppConsentTheme(), provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final IsGDPRCacheObsoleteUseCase provideIsGDPRCacheObsoleteUseCase() {
        return new IsGDPRCacheObsoleteUseCaseImpl(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final IsGDPRForceByClientUseCase provideIsGDPRForceByClientUseCase() {
        return new IsGDPRForceByClientUseCaseImpl(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final IsGDPRFromCacheUseCase provideIsGDPRFromCacheUseCase() {
        return new IsGDPRFromCacheUseCaseImpl(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final IsNeedToCallHelloWsUseCase provideIsNeedToCallHelloWsUseCase() {
        return new IsNeedToCallHelloWsUseCaseImpl(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final IsNeedToDisplayLegitimateInterestUseCase provideIsNeedToDisplayLegitimateInterestUseCase() {
        return new IsNeedToDisplayLegitimateInterestUseCaseImpl(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final LoadViewModel provideLoadViewModel() {
        return new LoadViewModel(provideIsNeedToCallHelloWsUseCase(), provideGetLoadUseCase(), provideLoadingUseCase());
    }

    public final LoadingUseCase provideLoadingUseCase() {
        return new LoadingUseCaseImpl(null, provideIsGDPRForceByClientUseCase(), provideIsGDPRFromCacheUseCase(), provideIsGDPRCacheObsoleteUseCase(), provideGetCountryFromBOUseCase(), 1, null);
    }

    public final NoticeViewModel provideNoticeViewModel() {
        return new NoticeViewModel(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final StackViewModel provideStackViewModel() {
        return new StackViewModel(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final String provideUserId() {
        return provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease().getUserId();
    }

    public final VendorListViewModel provideVendorListViewModel() {
        return new VendorListViewModel(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease());
    }

    public final VendorViewModel provideVendorViewModel() {
        return new VendorViewModel(provideAppConsentCore$appconsent_ui_v3_prodXchangeRelease(), provideIsNeedToDisplayLegitimateInterestUseCase(), provideGetVendorDetailsUseCase());
    }

    public final ViewModelFactory provideViewModelFactory() {
        return new ViewModelFactory();
    }

    public final void setMAppConsentCore(AppConsentCore appConsentCore) {
        mAppConsentCore = appConsentCore;
    }

    public static /* synthetic */ void getMAppConsentCore$annotations() {
    }
}
