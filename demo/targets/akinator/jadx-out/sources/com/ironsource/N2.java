package com.ironsource;

import com.ironsource.AbstractC3486v0;
import com.ironsource.N0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N2 extends AbstractC3486v0 {

    /* renamed from: z, reason: collision with root package name */
    public static final a f35028z = new a(null);

    /* renamed from: t, reason: collision with root package name */
    private final K2 f35029t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f35030u;

    /* renamed from: v, reason: collision with root package name */
    private final C3469u0 f35031v;

    /* renamed from: w, reason: collision with root package name */
    private final V2 f35032w;

    /* renamed from: x, reason: collision with root package name */
    private final String f35033x;

    /* renamed from: y, reason: collision with root package name */
    private final String f35034y;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final N2 a(K2 adProperties, C3126ab c3126ab, boolean z10) {
            List<C3566zc> listEmptyList;
            Me meD;
            kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
            AbstractC3486v0.a aVar = AbstractC3486v0.f39082r;
            V3 v3C = (c3126ab == null || (meD = c3126ab.d()) == null) ? null : meD.c();
            V2 v2C = v3C != null ? v3C.c() : null;
            if (v2C == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (c3126ab == null || (listEmptyList = c3126ab.d(adProperties.e(), adProperties.c())) == null) {
                listEmptyList = uu.p0.emptyList();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(listEmptyList, 10));
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3566zc) it.next()).f());
            }
            C3360na c3360naB = C3360na.b();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3360naB, "getInstance()");
            return new N2(adProperties, z10, new C3469u0(strF, arrayList, c3360naB), v2C);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public N2(K2 adProperties, boolean z10, C3469u0 adUnitCommonData, V2 configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C3360na c3360naE = adUnitCommonData.e();
        C3387p2 c3387p2D = configs.d();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3387p2D, "configs.bannerAuctionSettings");
        super(adProperties, z10, strF, listD, c3360naE, c3387p2D, configs.a(), (int) (configs.b() / 1000), configs.c(), configs.f(), -1, new N0(N0.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * configs.h()), configs.e(), configs.l(), configs.n(), configs.m(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        this.f35029t = adProperties;
        this.f35030u = z10;
        this.f35031v = adUnitCommonData;
        this.f35032w = configs;
        this.f35033x = "BN";
        this.f35034y = C3144bb.f36067d;
    }

    @Override // com.ironsource.AbstractC3486v0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public K2 b() {
        return this.f35029t;
    }

    public final C3469u0 B() {
        return this.f35031v;
    }

    public final V2 C() {
        return this.f35032w;
    }

    public final N2 a(K2 adProperties, boolean z10, C3469u0 adUnitCommonData, V2 v22) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.e0.checkNotNullParameter(v22, RnJusJ.dRVzLkTGaVF);
        return new N2(adProperties, z10, adUnitCommonData, v22);
    }

    @Override // com.ironsource.AbstractC3486v0
    public String c() {
        return this.f35033x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N2)) {
            return false;
        }
        N2 n22 = (N2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f35029t, n22.f35029t) && this.f35030u == n22.f35030u && kotlin.jvm.internal.e0.areEqual(this.f35031v, n22.f35031v) && kotlin.jvm.internal.e0.areEqual(this.f35032w, n22.f35032w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f35029t.hashCode() * 31;
        boolean z10 = this.f35030u;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.f35032w.hashCode() + ((this.f35031v.hashCode() + ((iHashCode + i10) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC3486v0
    public String j() {
        return this.f35034y;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f35029t + ", isPublisherLoad=" + this.f35030u + ", adUnitCommonData=" + this.f35031v + ", configs=" + this.f35032w + ")";
    }

    @Override // com.ironsource.AbstractC3486v0
    public boolean u() {
        return this.f35030u;
    }

    public final K2 w() {
        return this.f35029t;
    }

    public final boolean x() {
        return this.f35030u;
    }

    public final C3469u0 y() {
        return this.f35031v;
    }

    public final V2 z() {
        return this.f35032w;
    }

    public static /* synthetic */ N2 a(N2 n22, K2 k22, boolean z10, C3469u0 c3469u0, V2 v22, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k22 = n22.f35029t;
        }
        if ((i10 & 2) != 0) {
            z10 = n22.f35030u;
        }
        if ((i10 & 4) != 0) {
            c3469u0 = n22.f35031v;
        }
        if ((i10 & 8) != 0) {
            v22 = n22.f35032w;
        }
        return n22.a(k22, z10, c3469u0, v22);
    }

    @Override // com.ironsource.AbstractC3486v0
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC3486v0
    public AdData a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new com.ironsource.mediationsdk.q(ContextProvider.getInstance().getApplicationContext(), new C3294k0().b(b().h())));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }
}
