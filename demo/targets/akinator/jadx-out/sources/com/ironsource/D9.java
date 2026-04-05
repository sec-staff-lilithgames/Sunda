package com.ironsource;

import com.ironsource.AbstractC3486v0;
import com.ironsource.N0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D9 extends AbstractC3486v0 {

    /* renamed from: z, reason: collision with root package name */
    public static final a f34173z = new a(null);

    /* renamed from: t, reason: collision with root package name */
    private final C3205f0 f34174t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f34175u;

    /* renamed from: v, reason: collision with root package name */
    private final C3469u0 f34176v;

    /* renamed from: w, reason: collision with root package name */
    private final F9 f34177w;

    /* renamed from: x, reason: collision with root package name */
    private final String f34178x;

    /* renamed from: y, reason: collision with root package name */
    private final String f34179y;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final D9 a(C3205f0 adProperties, C3126ab c3126ab, boolean z10) {
            List<C3566zc> listEmptyList;
            Me meD;
            kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
            AbstractC3486v0.a aVar = AbstractC3486v0.f39082r;
            V3 v3C = (c3126ab == null || (meD = c3126ab.d()) == null) ? null : meD.c();
            F9 f9D = v3C != null ? v3C.d() : null;
            if (f9D == null) {
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
            return new D9(adProperties, z10, new C3469u0(strF, arrayList, c3360naB), f9D);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D9(C3205f0 adProperties, boolean z10, C3469u0 adUnitCommonData, F9 configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C3360na c3360naE = adUnitCommonData.e();
        C3387p2 c3387p2G = configs.g();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3387p2G, "configs.interstitialAuctionSettings");
        super(adProperties, z10, strF, listD, c3360naE, c3387p2G, configs.c(), configs.d(), configs.f(), configs.b(), -1, new N0(N0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        this.f34174t = adProperties;
        this.f34175u = z10;
        this.f34176v = adUnitCommonData;
        this.f34177w = configs;
        this.f34178x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f34179y = C3144bb.f36066c;
    }

    public final C3469u0 A() {
        return this.f34176v;
    }

    public final F9 B() {
        return this.f34177w;
    }

    public final D9 a(C3205f0 adProperties, boolean z10, C3469u0 adUnitCommonData, F9 configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        return new D9(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3486v0
    public C3205f0 b() {
        return this.f34174t;
    }

    @Override // com.ironsource.AbstractC3486v0
    public String c() {
        return this.f34178x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D9)) {
            return false;
        }
        D9 d92 = (D9) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f34174t, d92.f34174t) && this.f34175u == d92.f34175u && kotlin.jvm.internal.e0.areEqual(this.f34176v, d92.f34176v) && kotlin.jvm.internal.e0.areEqual(this.f34177w, d92.f34177w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f34174t.hashCode() * 31;
        boolean z10 = this.f34175u;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.f34177w.hashCode() + ((this.f34176v.hashCode() + ((iHashCode + i10) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC3486v0
    public String j() {
        return this.f34179y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f34174t + ", isPublisherLoad=" + this.f34175u + ", adUnitCommonData=" + this.f34176v + ", configs=" + this.f34177w + ")";
    }

    @Override // com.ironsource.AbstractC3486v0
    public boolean u() {
        return this.f34175u;
    }

    public final C3205f0 w() {
        return this.f34174t;
    }

    public final boolean x() {
        return this.f34175u;
    }

    public final C3469u0 y() {
        return this.f34176v;
    }

    public final F9 z() {
        return this.f34177w;
    }

    public static /* synthetic */ D9 a(D9 d92, C3205f0 c3205f0, boolean z10, C3469u0 c3469u0, F9 f92, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3205f0 = d92.f34174t;
        }
        if ((i10 & 2) != 0) {
            z10 = d92.f34175u;
        }
        if ((i10 & 4) != 0) {
            c3469u0 = d92.f34176v;
        }
        if ((i10 & 8) != 0) {
            f92 = d92.f34177w;
        }
        return d92.a(c3205f0, z10, c3469u0, f92);
    }

    @Override // com.ironsource.AbstractC3486v0
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
