package com.ironsource;

import com.ironsource.C3;
import com.ironsource.Q1;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f35212a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3486v0 f35213b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, G> f35214c;

    /* renamed from: d, reason: collision with root package name */
    private final C3207f2 f35215d;

    /* renamed from: e, reason: collision with root package name */
    private final List<CallableC3557z3> f35216e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35217f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3 f35218b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q1 f35219c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3.b f35220d;

        public a(C3 c32, Q1 q12, C3.b bVar) {
            this.f35218b = c32;
            this.f35219c = q12;
            this.f35220d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            this.f35218b.a(this.f35219c.e(), this.f35220d, this.f35219c.f35213b.f(), TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements C3.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f35223b;

        public c(d dVar) {
            this.f35223b = dVar;
        }

        @Override // com.ironsource.C3.b
        public void a(final List<? extends D3> biddingDataList, final long j10, final List<String> reachedTimeout) {
            kotlin.jvm.internal.e0.checkNotNullParameter(biddingDataList, "biddingDataList");
            kotlin.jvm.internal.e0.checkNotNullParameter(reachedTimeout, "reachedTimeout");
            V0 v02 = Q1.this.f35212a;
            final Q1 q12 = Q1.this;
            final d dVar = this.f35223b;
            v02.a(new Runnable() { // from class: com.ironsource.mh
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(q12, j10, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.C3.b
        public void onFailure(String error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            Q1.this.f35212a.a(new lh(Q1.this, 1, error, this.f35223b));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 this$0, long j10, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.e0.checkNotNullParameter(biddingDataList, "$biddingDataList");
            kotlin.jvm.internal.e0.checkNotNullParameter(reachedTimeout, "$reachedTimeout");
            kotlin.jvm.internal.e0.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a(j10, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 this$0, String error, d biddingDataListener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
            kotlin.jvm.internal.e0.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.f35212a.e().g().a(error);
            biddingDataListener.a(this$0, error);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        void a(Q1 q12);

        void a(Q1 q12, String str);
    }

    public Q1(V0 adTools, AbstractC3486v0 adUnitData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        this.f35212a = adTools;
        this.f35213b = adUnitData;
        this.f35214c = a();
        this.f35215d = new C3207f2(adUnitData);
        this.f35216e = new ArrayList();
        this.f35217f = adUnitData.e().q();
        b bVarB = b();
        Hf hfG = adUnitData.b().g();
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (hfG == null || hfG.a(networkSettings, this.f35213b.b().a())) {
                AdData adDataA = this.f35213b.a(networkSettings);
                if (networkSettings.isBidder(this.f35213b.b().a())) {
                    Object objB = this.f35217f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (objB instanceof B3) {
                        this.f35216e.add(new CallableC3557z3(networkSettings.getInstanceType(this.f35213b.b().a()), networkSettings.getProviderInstanceName(), adDataA, (B3) objB, bVarB, networkSettings));
                    } else {
                        this.f35212a.e().h().g(objB == null ? a.b.k("prepareAuctionCandidates - could not load network adapter ", networkSettings.getProviderName()) : a.b.l("network adapter ", networkSettings.getProviderName(), " does not implementing BiddingDataInterface"));
                    }
                } else {
                    this.f35215d.a(networkSettings);
                }
            }
        }
    }

    public final Map<String, G> c() {
        return this.f35214c;
    }

    public final C3207f2 d() {
        return this.f35215d;
    }

    public final List<CallableC3557z3> e() {
        return this.f35216e;
    }

    public final boolean f() {
        return !this.f35216e.isEmpty();
    }

    public final boolean g() {
        return this.f35215d.d();
    }

    public final boolean h() {
        return this.f35217f;
    }

    private final b b() {
        return new b();
    }

    private final C3.b b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        G g8 = this.f35214c.get(str);
        if (g8 != null) {
            return g8.b();
        }
        return null;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements A3 {
        public b() {
        }

        @Override // com.ironsource.A3
        public void a(NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterfaceA;
            if (Q1.this.h()) {
                adapterBaseInterfaceA = null;
                BaseAdAdapter baseAdAdapterB = Q1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (baseAdAdapterB != null) {
                    adapterBaseInterfaceA = baseAdAdapterB.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceA = Q1.this.a(networkSettings);
            }
            if (adapterBaseInterfaceA != null) {
                Q1.this.f35212a.e().g().a(Q1.this.a(networkSettings, adapterBaseInterfaceA));
            }
        }

        @Override // com.ironsource.A3
        public void a(String str) {
            Q1.this.f35212a.e().h().g(str);
        }
    }

    private final Map<String, G> a() {
        List<NetworkSettings> listM = this.f35213b.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(listM, 10)), 16));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            G g8 = new G(this.f35212a, this.f35213b, (NetworkSettings) it.next());
            tu.v vVar = tu.e0.to(g8.c(), g8);
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return linkedHashMap;
    }

    public final void a(d biddingDataListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(biddingDataListener, "biddingDataListener");
        C3 c32 = new C3();
        C3.b bVarB = b(biddingDataListener);
        this.f35212a.e().g().a();
        this.f35212a.c((AbstractRunnableC3273ie) new a(c32, this, bVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j10, List<? extends D3> list, List<String> list2, d dVar) {
        this.f35212a.e().g().a(j10);
        for (D3 d32 : list) {
            String strC = d32.c();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strC, "biddingResponse.instanceName");
            Map<String, Object> mapA = a(strC);
            if (d32.a() != null) {
                this.f35215d.a(d32);
                this.f35212a.e().g().a(mapA, d32.e());
            } else {
                this.f35212a.e().g().a(mapA, d32.e(), d32.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f35212a.e().g().b(a(it.next()), j10);
        }
        dVar.a(this);
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface adapterBaseInterfaceA;
        NetworkSettings networkSettingsA = this.f35213b.a(str);
        if (this.f35217f) {
            BaseAdAdapter<?, ?> baseAdAdapterB = b(str);
            adapterBaseInterfaceA = baseAdAdapterB != null ? baseAdAdapterB.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceA = a(networkSettingsA);
        }
        return a(networkSettingsA, adapterBaseInterfaceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e10);
                return map;
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        map.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f35213b.b().a())) : null);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.f35213b.b().a(), this.f35213b.b().b());
    }
}
