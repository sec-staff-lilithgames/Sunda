package com.sfbx.appconsent.core.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.sfbx.appconsent.core.api.AppConsentService;
import com.sfbx.appconsent.core.controller.ConnectivityController;
import com.sfbx.appconsent.core.dao.ConfigurationDao;
import com.sfbx.appconsent.core.dao.ReducerDao;
import com.sfbx.appconsent.core.dao.StateDao;
import com.sfbx.appconsent.core.provider.ConfigurationProvider;
import com.sfbx.appconsent.core.provider.ConsentProvider;
import com.sfbx.appconsent.core.provider.TimeoutProvider;
import com.sfbx.appconsent.core.provider.UserProvider;
import com.sfbx.appconsent.core.provider.XChangeProvider;
import com.sfbx.appconsent.core.repository.ConsentRepository;
import com.sfbx.appconsent.core.repository.ReducerRepository;
import com.sfbx.appconsent.core.repository.XchangeRepository;
import g5.r;
import io.sfbx.appconsent.core.gcm.di.CoreGCMInjector;
import io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.Json;
import kv.a;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CoreInjector {
    private static Context context;
    private static AppConsentService mAppConsentService;
    private static ConfigurationDao mConfigurationDao;
    private static ConfigurationProvider mConfigurationProvider;
    private static ConnectivityController mConnectivityController;
    private static ConsentProvider mConsentProvider;
    private static ConsentRepository mConsentRepository;
    private static ReducerDao mReducerDao;
    private static ReducerRepository mReducerRepository;
    private static SharedPreferences mSharedPreferences;
    private static StateDao mStateDao;
    private static TimeoutProvider mTimeoutProvider;
    private static UserProvider mUserProvider;
    private static XChangeProvider mXChangeProvider;
    private static XchangeRepository mXchangeRepository;
    public static final CoreInjector INSTANCE = new CoreInjector();
    private static final o mJson$delegate = q.lazy(CoreInjector$mJson$2.INSTANCE);

    private CoreInjector() {
    }

    private final void clear() {
        mConnectivityController = null;
        mSharedPreferences = null;
        mStateDao = null;
        mReducerDao = null;
        mConfigurationDao = null;
        mConsentProvider = null;
        mConfigurationProvider = null;
        mTimeoutProvider = null;
        mUserProvider = null;
        mXChangeProvider = null;
        mConsentRepository = null;
        mXchangeRepository = null;
        mReducerRepository = null;
        mAppConsentService = null;
    }

    private final Json getMJson() {
        return (Json) mJson$delegate.getValue();
    }

    private final void initAppConsentService() {
        if (mAppConsentService == null) {
            mAppConsentService = new AppConsentService(provideContext());
        }
    }

    private final void initConfigurationDao() {
        if (mConfigurationDao == null) {
            mConfigurationDao = new ConfigurationDao(provideContext(), provideJson());
        }
    }

    private final void initConfigurationProvider() {
        if (mConfigurationProvider == null) {
            mConfigurationProvider = new ConfigurationProvider(provideSharedPreferences(), provideJson());
        }
    }

    private final void initConnectivityController() {
        if (mConnectivityController == null) {
            Context applicationContext = provideContext().getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "provideContext().applicationContext");
            mConnectivityController = new ConnectivityController(applicationContext);
        }
    }

    private final void initConsentProvider() {
        if (mConsentProvider == null) {
            mConsentProvider = new ConsentProvider(provideContext(), provideSharedPreferences(), provideJson(), provideStateDao(), provideReducerDao(), provideTimeoutProvider(), provideGCMRepository());
        }
    }

    private final void initConsentRepository() {
        if (mConsentRepository == null) {
            mConsentRepository = new ConsentRepository(null, provideContext(), provideStateDao(), provideConsentProvider(), provideConfigurationProvider(), provideUserProvider(), provideAppConsentService(), provideTimeoutProvider(), provideConnectivityController(), 1, null);
        }
    }

    private final void initReducerDao() {
        if (mReducerDao == null) {
            mReducerDao = new ReducerDao(provideContext());
        }
    }

    private final void initReducerRepository() {
        if (mReducerRepository == null) {
            mReducerRepository = new ReducerRepository(provideReducerDao());
        }
    }

    private final void initSharedPreferences() {
        if (mSharedPreferences == null) {
            mSharedPreferences = r.getDefaultSharedPreferences(provideContext());
        }
    }

    private final void initStateDao() {
        if (mStateDao == null) {
            mStateDao = new StateDao(provideSharedPreferences(), provideJson());
        }
    }

    private final void initTimeoutProvider() {
        if (mTimeoutProvider == null) {
            mTimeoutProvider = new TimeoutProvider(provideSharedPreferences(), provideJson());
        }
    }

    private final void initUserProvider() {
        if (mUserProvider == null) {
            mUserProvider = new UserProvider(provideSharedPreferences());
        }
    }

    private final void initXChangeProvider() {
        if (mXChangeProvider == null) {
            mXChangeProvider = new XChangeProvider(provideSharedPreferences(), getMJson(), provideUserProvider());
        }
    }

    private final void initXChangeRepository() {
        if (mXchangeRepository == null) {
            mXchangeRepository = new XchangeRepository(provideContext(), provideAppConsentService(), provideXChangeProvider(), provideUserProvider());
        }
    }

    public final void init(Context aContext) {
        e0.checkNotNullParameter(aContext, "aContext");
        clear();
        Context applicationContext = aContext.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "aContext.applicationContext");
        context = applicationContext;
        initConnectivityController();
        initSharedPreferences();
        initStateDao();
        initReducerDao();
        initConfigurationDao();
        initConsentProvider();
        initConfigurationProvider();
        initTimeoutProvider();
        initUserProvider();
        initXChangeProvider();
        initConsentRepository();
        initXChangeRepository();
        initReducerRepository();
        initAppConsentService();
    }

    public final <R> R orElse(R r10, a block) {
        e0.checkNotNullParameter(block, "block");
        return r10 == null ? (R) block.invoke() : r10;
    }

    public final AppConsentService provideAppConsentService() {
        initAppConsentService();
        AppConsentService appConsentService = mAppConsentService;
        e0.checkNotNull(appConsentService);
        return appConsentService;
    }

    public final ConfigurationDao provideConfigDao() {
        initConfigurationDao();
        ConfigurationDao configurationDao = mConfigurationDao;
        e0.checkNotNull(configurationDao);
        return configurationDao;
    }

    public final ConfigurationProvider provideConfigurationProvider() {
        initConfigurationProvider();
        ConfigurationProvider configurationProvider = mConfigurationProvider;
        e0.checkNotNull(configurationProvider);
        return configurationProvider;
    }

    public final ConnectivityController provideConnectivityController() {
        initConnectivityController();
        ConnectivityController connectivityController = mConnectivityController;
        e0.checkNotNull(connectivityController);
        return connectivityController;
    }

    public final ConsentProvider provideConsentProvider() {
        initConsentProvider();
        ConsentProvider consentProvider = mConsentProvider;
        e0.checkNotNull(consentProvider);
        return consentProvider;
    }

    public final ConsentRepository provideConsentRepository() {
        initConsentRepository();
        ConsentRepository consentRepository = mConsentRepository;
        e0.checkNotNull(consentRepository);
        return consentRepository;
    }

    public final Context provideContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        e0.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final GCMRepositoryContract provideGCMRepository() {
        return CoreGCMInjector.INSTANCE.provideGCMRepository(provideContext(), provideSharedPreferences());
    }

    public final Json provideJson() {
        return getMJson();
    }

    public final ReducerDao provideReducerDao() {
        initReducerDao();
        ReducerDao reducerDao = mReducerDao;
        e0.checkNotNull(reducerDao);
        return reducerDao;
    }

    public final ReducerRepository provideReducerRepository() {
        initReducerRepository();
        ReducerRepository reducerRepository = mReducerRepository;
        e0.checkNotNull(reducerRepository);
        return reducerRepository;
    }

    public final SharedPreferences provideSharedPreferences() {
        initSharedPreferences();
        SharedPreferences sharedPreferences = mSharedPreferences;
        e0.checkNotNull(sharedPreferences);
        return sharedPreferences;
    }

    public final StateDao provideStateDao() {
        initStateDao();
        StateDao stateDao = mStateDao;
        e0.checkNotNull(stateDao);
        return stateDao;
    }

    public final TimeoutProvider provideTimeoutProvider() {
        initTimeoutProvider();
        TimeoutProvider timeoutProvider = mTimeoutProvider;
        e0.checkNotNull(timeoutProvider);
        return timeoutProvider;
    }

    public final UserProvider provideUserProvider() {
        initUserProvider();
        UserProvider userProvider = mUserProvider;
        e0.checkNotNull(userProvider);
        return userProvider;
    }

    public final XChangeProvider provideXChangeProvider() {
        initXChangeProvider();
        XChangeProvider xChangeProvider = mXChangeProvider;
        e0.checkNotNull(xChangeProvider);
        return xChangeProvider;
    }

    public final XchangeRepository provideXchangeRepository() {
        initXChangeRepository();
        XchangeRepository xchangeRepository = mXchangeRepository;
        e0.checkNotNull(xchangeRepository);
        return xchangeRepository;
    }
}
