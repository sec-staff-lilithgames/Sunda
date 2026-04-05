package com.ironsource.mediationsdk;

import android.text.TextUtils;
import b0.e2;
import com.ironsource.C3155c4;
import com.ironsource.C3324lc;
import com.ironsource.C3422r4;
import com.ironsource.C3518wf;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.H9;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import j1.o2;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: k, reason: collision with root package name */
    private static final String f37300k = "IronSource";

    /* renamed from: l, reason: collision with root package name */
    private static final String f37301l = "com.ironsource.adapters";

    /* renamed from: m, reason: collision with root package name */
    private static final String f37302m = "aps";

    /* renamed from: n, reason: collision with root package name */
    private static final c f37303n = new c();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f37304o = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f37307c;

    /* renamed from: d, reason: collision with root package name */
    private String f37308d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f37309e;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f37312h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private C3155c4 f37313i = new C3155c4();

    /* renamed from: j, reason: collision with root package name */
    private final C3324lc f37314j = new C3324lc();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f37305a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f37306b = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<String>> f37310f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<IronSource.a, JSONObject> f37311g = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37315a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f37315a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37315a[IronSource.a.f37252c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37315a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37315a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static c b() {
        return f37303n;
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public void b(String str, String str2) {
        this.f37307c = str;
        this.f37308d = str2;
    }

    public void c(String str, List<String> list) {
        synchronized (f37304o) {
            try {
                this.f37310f.put(str, list);
                if (!this.f37305a.isEmpty()) {
                    IronSourceUtils.i("setMetaData key = " + str + ", values = " + list);
                    b(str, list);
                }
                a(str, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.f37310f;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> e() {
        return this.f37306b;
    }

    public void f() {
        this.f37305a.clear();
        this.f37306b.clear();
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z10) {
        String coreSDKVersion;
        String strB = b(networkSettings);
        String providerTypeForReflection = z10 ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (f37304o) {
            try {
                if (this.f37305a.containsKey(strB)) {
                    return this.f37305a.get(strB);
                }
                AbstractAdapter abstractAdapterA = a(strB, providerTypeForReflection);
                if (abstractAdapterA == null) {
                    b(strB + " adapter was not loaded");
                    return null;
                }
                abstractAdapterA.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
                try {
                    coreSDKVersion = abstractAdapterA.getCoreSDKVersion();
                } catch (Throwable th2) {
                    C3422r4.d().a(th2);
                    String str = "error while retrieving coreSDKVersion " + abstractAdapterA.getProviderName() + ": " + th2.getLocalizedMessage();
                    a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                    IronLog.INTERNAL.error(str);
                    coreSDKVersion = "Unknown";
                }
                c(strB + " was allocated (adapter version: " + abstractAdapterA.getVersion() + ", sdk version: " + coreSDKVersion + ")");
                c(abstractAdapterA);
                this.f37314j.a(abstractAdapterA);
                a(abstractAdapterA);
                this.f37313i.a(abstractAdapterA, networkSettings);
                b(abstractAdapterA);
                a(jSONObject, abstractAdapterA, providerTypeForReflection);
                this.f37305a.put(strB, abstractAdapterA);
                return abstractAdapterA;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void b(boolean z10) {
        synchronized (f37304o) {
            this.f37313i.a(z10);
            this.f37313i.a(this.f37305a, this.f37306b);
        }
    }

    private void b(AdapterBaseInterface adapterBaseInterface) throws JSONException {
        Boolean bool = this.f37309e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            c(str);
        }
    }

    private void c(AdapterBaseInterface adapterBaseInterface) throws JSONException {
        if (adapterBaseInterface == null) {
            return;
        }
        for (String str : this.f37310f.keySet()) {
            List<String> list = this.f37310f.get(str);
            if (list != null && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new b0(adapterBaseInterface, str, list, 1), adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    private void c(AbstractAdapter abstractAdapter) throws JSONException {
        if (abstractAdapter == null) {
            return;
        }
        for (String str : this.f37310f.keySet()) {
            List<String> list = this.f37310f.get(str);
            if (list != null) {
                a(new a0(abstractAdapter, str, list, 1), abstractAdapter.getProviderName());
            }
        }
    }

    private void b(AbstractAdapter abstractAdapter) throws JSONException {
        Boolean bool = this.f37309e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th2.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    private String c(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        StringBuilder sbT = a.b.t(uuid != null ? uuid.toString() : "", "-");
        sbT.append(aVar.toString());
        sbT.append("-");
        sbT.append(networkSettings.getProviderName());
        return sbT.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.error(a.b.k("Missing package definition for ", networkSettings.getProviderTypeForReflection()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) throws JSONException {
        if (str.equalsIgnoreCase("IronSource") && this.f37312h.compareAndSet(false, true)) {
            c(a.b.l("SDK5 earlyInit  <", str, ">"));
            try {
                abstractAdapter.earlyInit(this.f37307c, this.f37308d, jSONObject);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e10.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    private void b(String str, List<String> list) throws JSONException {
        for (AbstractAdapter abstractAdapter : this.f37305a.values()) {
            a(new a0(abstractAdapter, str, list, 0), abstractAdapter.getProviderName());
        }
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    private String b(NetworkSettings networkSettings) {
        if (networkSettings.isMultipleInstances()) {
            return networkSettings.getProviderDefaultInstance();
        }
        return networkSettings.getProviderName();
    }

    public ConcurrentHashMap<String, LevelPlayBaseAdapter> c() {
        ConcurrentHashMap<String, LevelPlayBaseAdapter> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f37306b.keySet()) {
            AdapterBaseWrapper adapterBaseWrapper = this.f37306b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) throws JSONException {
        String strC;
        String providerTypeForReflection;
        if (networkSettings.isCustomNetwork()) {
            strC = b(networkSettings);
        } else {
            strC = c(networkSettings, aVar, uuid);
        }
        if (this.f37306b.containsKey(strC)) {
            return this.f37306b.get(strC).getAdapterBaseInterface();
        }
        if (networkSettings.isCustomNetwork()) {
            providerTypeForReflection = networkSettings.getCustomNetworkAdapterName(null);
        } else {
            providerTypeForReflection = networkSettings.getProviderTypeForReflection();
        }
        AdapterBaseInterface adapterBaseInterfaceA = a(strC, providerTypeForReflection, networkSettings);
        return (adapterBaseInterfaceA != null || networkSettings.isCustomNetwork()) ? adapterBaseInterfaceA : a(networkSettings, aVar, strC);
    }

    private AbstractAdapter a(String str, String str2) throws JSONException, ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(a(str2));
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e10) {
            String str3 = "Error while loading adapter - exception = " + e10.getLocalizedMessage();
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            b(str3);
            return null;
        }
    }

    private JSONObject b(NetworkSettings networkSettings, IronSource.a aVar) {
        int i10 = a.f37315a[aVar.ordinal()];
        if (i10 == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i10 == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i10 == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i10 != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    private static String a(String str) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
    }

    public void b(x xVar) throws JSONException {
        if (a(xVar)) {
            this.f37314j.a(xVar);
            xVar.a(this.f37305a.values(), this.f37306b.values());
            xVar.b();
            if (StringUtils.toLowerCase(xVar.a()).equals("aps")) {
                a(xVar.allData());
            }
        }
    }

    private String a(String str, IronSource.a aVar) {
        StringBuilder sb2 = new StringBuilder("com.ironsource.adapters.");
        sb2.append(StringUtils.toLowerCase(str));
        sb2.append(".");
        sb2.append(StringUtils.toLowerCase(a(aVar)));
        sb2.append(".");
        sb2.append(str);
        return o2.o(sb2, a(aVar), "Adapter");
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    private String a(IronSource.a aVar) {
        if (aVar == null) {
            return null;
        }
        int i10 = a.f37315a[aVar.ordinal()];
        if (i10 == 1) {
            return "Rewarded";
        }
        if (i10 == 2) {
            return "Interstitial";
        }
        if (i10 == 3) {
            return "Banner";
        }
        if (i10 != 4) {
            return null;
        }
        return "NativeAd";
    }

    public void a(boolean z10) {
        synchronized (f37304o) {
            try {
                this.f37309e = Boolean.valueOf(z10);
                Iterator<AbstractAdapter> it = this.f37305a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                Iterator<AdapterBaseWrapper> it2 = this.f37306b.values().iterator();
                while (it2.hasNext()) {
                    b(it2.next().getAdapterBaseInterface());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(String str, List<String> list) throws JSONException {
        for (AdapterBaseWrapper adapterBaseWrapper : this.f37306b.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new b0(adapterBaseInterface, str, list, 0), adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(Runnable runnable, String str) throws JSONException {
        try {
            runnable.run();
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String str2 = "Error while setting meta-data for adapter " + str + ": " + th2.getLocalizedMessage();
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            c(str2);
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface) throws JSONException {
        if (!(adapterBaseInterface instanceof SetAPSInterface) || this.f37311g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.f37311g.keySet()) {
            try {
                JSONObject jSONObject = this.f37311g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((SetAPSInterface) adapterBaseInterface).setAPSData(C3518wf.a(aVar), jSONObject);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.f37311g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(AbstractAdapter abstractAdapter) throws JSONException {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals("aps") || this.f37311g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.f37311g.keySet()) {
            try {
                JSONObject jSONObject = this.f37311g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(C3518wf.a(aVar), jSONObject);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.f37311g.clear();
    }

    private w a(NetworkSettings networkSettings, IronSource.a aVar, String str) throws JSONException {
        AbstractAdapter abstractAdapterA = a(networkSettings, b(networkSettings, aVar), false);
        if (abstractAdapterA != null) {
            w wVar = new w(abstractAdapterA);
            this.f37306b.put(str, new AdapterBaseWrapper(wVar, networkSettings));
            return wVar;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }

    private void a(String str, AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) throws JSONException {
        if (!networkSettings.isCustomNetwork()) {
            c(adapterBaseInterface);
            a(adapterBaseInterface);
        }
        this.f37313i.a(adapterBaseInterface, networkSettings);
        b(adapterBaseInterface);
        this.f37314j.a(new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.f37306b.put(str, new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) throws JSONException {
        String strA;
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            strA = networkSettings.getCustomNetworkPackage() + "." + str2;
        } else {
            strA = a(str2);
        }
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(strA).newInstance();
            IronLog.INTERNAL.info(strA + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(str, baseAdapter, networkSettings);
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String strK = a.b.k("failed to load ", strA);
                IronLog.INTERNAL.error(strK);
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, strK);
            }
            return null;
        }
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) throws JSONException {
        BaseAdAdapter<?, ?> baseAdAdapterA = a(networkSettings, aVar);
        if (baseAdAdapterA != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterA;
        }
        AbstractAdapter abstractAdapterA = a(networkSettings);
        if (abstractAdapterA != null) {
            return AbstractC3345a.a(abstractAdapterA, networkSettings, aVar, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar) throws JSONException {
        boolean zIsCustomNetwork = networkSettings.isCustomNetwork();
        if (zIsCustomNetwork && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            c(networkSettings);
            return null;
        }
        String strA = a(networkSettings, aVar, zIsCustomNetwork, a(networkSettings, aVar, zIsCustomNetwork));
        try {
            return a(strA, networkSettings);
        } catch (Exception e10) {
            if (zIsCustomNetwork) {
                a(e10, strA);
            }
            return null;
        }
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z10) {
        if (z10) {
            return networkSettings.getCustomNetworkAdapterName(aVar);
        }
        return networkSettings.getProviderTypeForReflection();
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z10, String str) {
        if (z10) {
            return networkSettings.getCustomNetworkPackage() + "." + str;
        }
        return a(str, aVar);
    }

    private BaseAdAdapter<?, ?> a(String str, NetworkSettings networkSettings) throws Exception {
        return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
    }

    private void a(Exception exc, String str) throws JSONException {
        String strK = a.b.k("Failed to load adapter class: ", str);
        IronLog.INTERNAL.error(strK);
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, e2.l(exc, a.b.t(strK, " - ")));
    }

    private void a(D5 d52, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            H9.i().a(new C5(d52, jSONObject));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(x xVar) throws JSONException {
        if (xVar.allData().length() == 0) {
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network data");
            b("empty network data");
            return false;
        }
        if (!TextUtils.isEmpty(xVar.a())) {
            return true;
        }
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network key");
        b("empty network key");
        return false;
    }

    private void a(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (next.equalsIgnoreCase(IronSource.a.BANNER.toString())) {
                a(LevelPlay.AdFormat.BANNER, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.f37252c.toString())) {
                a(LevelPlay.AdFormat.INTERSTITIAL, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.REWARDED_VIDEO.toString())) {
                a(LevelPlay.AdFormat.REWARDED, jSONObjectOptJSONObject);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(LevelPlay.AdFormat adFormat, JSONObject jSONObject) throws JSONException {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!this.f37305a.isEmpty()) {
                    for (AbstractAdapter abstractAdapter : this.f37305a.values()) {
                        if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals("aps") && (abstractAdapter instanceof SetAPSInterface)) {
                            ((SetAPSInterface) abstractAdapter).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                    }
                }
                for (AdapterBaseWrapper adapterBaseWrapper : this.f37306b.values()) {
                    if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals("aps")) {
                        AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                        if (adapterBaseInterface != null) {
                            ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                        return;
                    }
                }
                synchronized (f37304o) {
                    this.f37311g.put(C3518wf.b(adFormat), jSONObject2);
                }
                return;
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                String str = "error while setting APSData: " + e10.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                b(str);
                return;
            }
        }
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
        b("APSData is empty");
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.f37305a;
    }

    public static boolean a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}
