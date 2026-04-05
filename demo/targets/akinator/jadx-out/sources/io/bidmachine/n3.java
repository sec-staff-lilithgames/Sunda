package io.bidmachine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n3 implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final ExecutorService f61952i = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));

    /* renamed from: j, reason: collision with root package name */
    public static final Object f61953j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final CopyOnWriteArrayList f61954k = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ContextProvider f61955b;

    /* renamed from: c, reason: collision with root package name */
    public final InitializationParams f61956c;

    /* renamed from: e, reason: collision with root package name */
    public final NetworkConfig f61957e;

    /* renamed from: f, reason: collision with root package name */
    public final o3 f61958f;

    /* renamed from: g, reason: collision with root package name */
    public final String f61959g;

    /* renamed from: h, reason: collision with root package name */
    public final BidMachineTrackingObject f61960h;

    public n3(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, o3 o3Var) {
        this.f61955b = contextProvider;
        this.f61956c = initializationParams;
        this.f61957e = networkConfig;
        this.f61958f = o3Var;
        String networkKey = networkConfig.getNetworkKey();
        this.f61959g = networkKey;
        this.f61960h = new BidMachineTrackingObject(j1.o2.l(networkKey, "_initialize"));
    }

    public final void a(String str) {
        m0 m0Var = new m0(str, 11);
        String str2 = this.f61959g;
        nm.a.e(str2, m0Var);
        this.f61960h.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, (AdsType) null, new gr.a().setNetworkName(str2), pr.a.adapterInitialization(str));
        f61954k.remove(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        nm.a.d(this.f61959g, "Initialization started");
        try {
            this.f61960h.eventStart(TrackEventType.HeaderBiddingNetworkInitialize, new gr.i().withParameter("HB_NETWORK", this.f61959g));
            NetworkAdapter networkAdapterObtainAdapter = NetworkRegistry.obtainAdapter(this.f61957e);
            networkAdapterObtainAdapter.setLogging(nm.a.isLoggingEnabled());
            networkAdapterObtainAdapter.initialize(this.f61955b, this.f61956c, this.f61957e.getNetworkConfigParams(), new m3(this));
            Map<String, NetworkConfig> map = NetworkRegistry.INITIALIZED_NETWORK_CONFIG_MAP;
            if (!map.containsKey(this.f61959g)) {
                map.put(this.f61959g, this.f61957e);
            }
            for (AdsType adsType : this.f61957e.getSupportedAdsTypes(networkAdapterObtainAdapter)) {
                synchronized (f61953j) {
                    try {
                        if (NetworkRegistry.CORE_NETWORK_CONFIG_MAP.containsKey(this.f61959g)) {
                            Map<AdsType, Map<String, NetworkConfig>> map2 = NetworkRegistry.INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP;
                            String str = this.f61959g;
                            NetworkConfig networkConfig = this.f61957e;
                            Map<String, NetworkConfig> concurrentHashMap = map2.get(adsType);
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap<>();
                                map2.put(adsType, concurrentHashMap);
                            }
                            concurrentHashMap.put(str, networkConfig);
                        }
                        Map<AdsType, Map<String, NetworkConfig>> map3 = NetworkRegistry.INITIALIZED_NETWORK_CONFIG_TYPED_MAP;
                        String str2 = this.f61959g;
                        NetworkConfig networkConfig2 = this.f61957e;
                        Map<String, NetworkConfig> concurrentHashMap2 = map3.get(adsType);
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap<>();
                            map3.put(adsType, concurrentHashMap2);
                        }
                        concurrentHashMap2.put(str2, networkConfig2);
                    } finally {
                    }
                }
            }
            NetworkRegistry.PENDING_NETWORK_CONFIG_MAP.remove(this.f61959g);
        } catch (Throwable th2) {
            nm.a.w(th2);
            a("Network initialization exception");
        }
        o3 o3Var = this.f61958f;
        if (o3Var != null) {
            ((u0) o3Var).onExecuted();
        }
    }
}
