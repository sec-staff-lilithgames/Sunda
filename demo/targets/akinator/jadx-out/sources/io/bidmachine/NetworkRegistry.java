package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import io.bidmachine.ads.networks.mraid.MraidConfig;
import io.bidmachine.ads.networks.nast.NastConfig;
import io.bidmachine.ads.networks.vast.VastConfig;
import io.bidmachine.protobuf.AdNetwork;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class NetworkRegistry {
    static final Map<String, NetworkAdapter> NETWORK_ADAPTER_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> CORE_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> FROM_INIT_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> PENDING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> INITIALIZING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> INITIALIZED_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);
    static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);
    private static final AtomicBoolean IS_NETWORKS_INITIALIZING_EXECUTED = new AtomicBoolean(false);
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZING = new AtomicBoolean(false);
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZED = new AtomicBoolean(false);
    private static final Object CORE_INITIALIZING_LOCK = new Object();
    private static final Object INITIALIZING_LOCK = new Object();

    public static String checkAndPutNetwork(Context context, AdsType adsType, NetworkConfig networkConfig, Map<String, NetworkConfig> map) {
        NetworkAdapter adapter = getAdapter(networkConfig.getNetworkKey());
        if (adapter == null) {
            return "Network not registered";
        }
        if (!adapter.isAdsTypeSupported(adsType)) {
            return "Network does not support this ad type";
        }
        if (!adapter.isInitialized(context)) {
            return "Network not initialized";
        }
        map.put(networkConfig.getNetworkKey(), networkConfig);
        return null;
    }

    public static Map<String, NetworkConfig> copyOrNullInitializedCoreNetworkConfigs(AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    public static Map<String, NetworkConfig> copyOrNullInitializedNetworkConfigs(AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    public static Map<String, NetworkConfig> createInitNetworkConfigMap() {
        return new HashMap(FROM_INIT_NETWORK_CONFIG_MAP);
    }

    public static NetworkAdapter getAdapter(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return NETWORK_ADAPTER_MAP.get(str);
    }

    public static NetworkConfig getConfig(String str) {
        if (str == null) {
            return null;
        }
        return INITIALIZED_NETWORK_CONFIG_MAP.get(str);
    }

    public static Collection<NetworkConfig> getCoreNetworkConfigList() {
        return CORE_NETWORK_CONFIG_MAP.values();
    }

    public static Collection<NetworkConfig> getPendingNetworkConfigList() {
        return PENDING_NETWORK_CONFIG_MAP.values();
    }

    private static void initializeNetwork(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, o3 o3Var) {
        synchronized (INITIALIZING_LOCK) {
            try {
                String networkKey = networkConfig.getNetworkKey();
                Map<String, NetworkConfig> map = INITIALIZING_NETWORK_CONFIG_MAP;
                if (map.containsKey(networkKey)) {
                    PENDING_NETWORK_CONFIG_MAP.remove(networkKey);
                    if (o3Var != null) {
                        ((u0) o3Var).onExecuted();
                    }
                    return;
                }
                map.put(networkKey, networkConfig);
                n3 n3Var = new n3(contextProvider, initializationParams, networkConfig, o3Var);
                n3.f61954k.add(n3Var);
                try {
                    n3.f61952i.execute(n3Var);
                } catch (Throwable th2) {
                    nm.a.w(th2);
                    n3Var.a("Exception creating network initialization task");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void initializeNetworksAsync(Context context, o3 o3Var) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            new l3(context.getApplicationContext(), o3Var).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initializeNetworksAwait(Context context) throws InterruptedException {
        initializeNetworksAwait(context, getPendingNetworkConfigList());
    }

    public static void initializeNetworksSync(Context context) throws InterruptedException {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            initializeNetworksAwait(context.getApplicationContext());
        }
    }

    public static boolean isNetworkRegistered(String str) {
        return getAdapter(str) != null;
    }

    public static boolean isNetworksInitializingExecuted() {
        return IS_NETWORKS_INITIALIZING_EXECUTED.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerNetworks$0(NetworkRegistryCallback networkRegistryCallback) {
        if (networkRegistryCallback != null) {
            networkRegistryCallback.onRegistered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerNetworks$1(Context context, String str, NetworkRegistryCallback networkRegistryCallback) throws Throwable {
        registerNetworks(context, str);
        nm.j.onUiThread(new t0(networkRegistryCallback, 4));
    }

    public static NetworkAdapter obtainAdapter(NetworkConfig networkConfig) {
        synchronized (NetworkRegistry.class) {
            try {
                String networkKey = networkConfig.getNetworkKey();
                NetworkAdapter adapter = getAdapter(networkKey);
                if (adapter != null) {
                    return adapter;
                }
                NetworkAdapter networkAdapterCreateNetworkAdapter = networkConfig.createNetworkAdapter();
                NETWORK_ADAPTER_MAP.put(networkKey, networkAdapterCreateNetworkAdapter);
                return networkAdapterCreateNetworkAdapter;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void registerAndInitializeCoreNetworks(Context context) {
        AtomicBoolean atomicBoolean = IS_CORE_NETWORKS_INITIALIZED;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (CORE_INITIALIZING_LOCK) {
            try {
                if (IS_CORE_NETWORKS_INITIALIZING.compareAndSet(false, true)) {
                    registerCoreNetworks();
                    initializeNetworksAwait(context, getCoreNetworkConfigList());
                    atomicBoolean.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void registerCoreNetwork(NetworkConfig networkConfig) {
        String networkKey = networkConfig.getNetworkKey();
        Map<String, NetworkConfig> map = CORE_NETWORK_CONFIG_MAP;
        if (map.containsKey(networkKey)) {
            return;
        }
        map.put(networkKey, networkConfig);
        registerNetwork(networkConfig);
    }

    public static void registerCoreNetworks() {
        MraidConfig mraidConfig = new MraidConfig();
        AdsFormat adsFormat = AdsFormat.Banner;
        registerCoreNetwork(mraidConfig.withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.InterstitialStatic, new HashMap()).withMediationConfig(AdsFormat.RewardedStatic, new HashMap()));
        registerCoreNetwork(new VastConfig().withMediationConfig(AdsFormat.InterstitialVideo, new HashMap()).withMediationConfig(AdsFormat.RewardedVideo, new HashMap()));
        registerCoreNetwork(new NastConfig().withMediationConfig(AdsFormat.Native, new HashMap()));
        registerCoreNetwork(new AdaptiveRenderingConfig().withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.Interstitial, new HashMap()).withMediationConfig(AdsFormat.Rewarded, new HashMap()));
    }

    public static void registerInitNetwork(Context context, AdNetwork adNetwork) {
        NetworkConfig networkConfigA;
        if (isNetworkRegistered(adNetwork.getName())) {
            return;
        }
        NetworkConfig networkConfig = null;
        if (context != null) {
            String name = adNetwork.getName();
            if (!TextUtils.isEmpty(name) && (networkConfigA = j3.a(context, name, adNetwork.getCustomParamsMap())) != null) {
                for (AdNetwork.AdUnit adUnit : adNetwork.getAdUnitsList()) {
                    AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(adUnit.getAdFormat());
                    if (adsFormatByRemoteName != null) {
                        networkConfigA.withMediationConfig(adsFormatByRemoteName, adUnit.getCustomParamsMap());
                    } else {
                        nm.a.d(new m0(name, 7));
                    }
                }
                networkConfig = networkConfigA;
            }
        }
        if (networkConfig != null) {
            FROM_INIT_NETWORK_CONFIG_MAP.put(networkConfig.getNetworkKey(), networkConfig);
            registerNetwork(networkConfig);
        }
    }

    public static void registerNetwork(NetworkConfig networkConfig) {
        n1 n1VarA;
        Context context;
        if (networkConfig == null || isNetworkRegistered(networkConfig.getNetworkKey())) {
            return;
        }
        obtainAdapter(networkConfig);
        PENDING_NETWORK_CONFIG_MAP.put(networkConfig.getNetworkKey(), networkConfig);
        if (!isNetworksInitializingExecuted() || (context = (n1VarA = n1.a()).f61933p) == null) {
            return;
        }
        initializeNetwork(new SimpleContextProvider(context), new z2(n1VarA.f61935r, n1VarA.f61923f), networkConfig, null);
    }

    public static void registerNetworks(NetworkConfig... networkConfigArr) {
        if (networkConfigArr == null) {
            return;
        }
        for (NetworkConfig networkConfig : networkConfigArr) {
            registerNetwork(networkConfig);
        }
    }

    public static void reset() {
        NETWORK_ADAPTER_MAP.clear();
        CORE_NETWORK_CONFIG_MAP.clear();
        FROM_INIT_NETWORK_CONFIG_MAP.clear();
        PENDING_NETWORK_CONFIG_MAP.clear();
        INITIALIZING_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_TYPED_MAP.clear();
        IS_NETWORKS_INITIALIZING_EXECUTED.set(false);
        IS_CORE_NETWORKS_INITIALIZING.set(false);
        IS_CORE_NETWORKS_INITIALIZED.set(false);
        n3.f61954k.clear();
    }

    public static void setLoggingEnabled(boolean z10) {
        Iterator<Map.Entry<String, NetworkAdapter>> it = NETWORK_ADAPTER_MAP.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().setLogging(z10);
            } catch (Throwable th2) {
                nm.a.w(th2);
            }
        }
    }

    private static void initializeNetworksAwait(Context context, Collection<NetworkConfig> collection) throws InterruptedException {
        n1 n1VarA = n1.a();
        initializeNetworksAwait(new SimpleContextProvider(context), new z2(n1VarA.f61935r, n1VarA.f61923f), collection);
    }

    public static void registerNetworks(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                NetworkConfig networkConfigB = j3.b(context, jSONArray.getJSONObject(i10));
                if (networkConfigB != null) {
                    registerNetwork(networkConfigB);
                }
            }
        } catch (JSONException e10) {
            nm.a.w(e10);
        }
    }

    private static void initializeNetworksAwait(ContextProvider contextProvider, InitializationParams initializationParams, Collection<NetworkConfig> collection) throws InterruptedException {
        if (collection.isEmpty()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(collection.size());
        Iterator<NetworkConfig> it = collection.iterator();
        while (it.hasNext()) {
            initializeNetwork(contextProvider, initializationParams, it.next(), new u0(countDownLatch, 4));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            nm.a.w(e10);
        }
    }

    public static void registerNetworks(final Context context, final String str, final NetworkRegistryCallback networkRegistryCallback) {
        v1.get().execute(new cn.a() { // from class: io.bidmachine.k3
            @Override // cn.a, pr.l
            public final void onRun() throws Throwable {
                NetworkRegistry.lambda$registerNetworks$1(context, str, networkRegistryCallback);
            }
        });
    }
}
