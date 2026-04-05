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
public final class Td extends AbstractC3486v0 {

    /* renamed from: z, reason: collision with root package name */
    public static final a f35501z = new a(null);

    /* renamed from: t, reason: collision with root package name */
    private final C3205f0 f35502t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f35503u;

    /* renamed from: v, reason: collision with root package name */
    private final C3469u0 f35504v;

    /* renamed from: w, reason: collision with root package name */
    private final Zd f35505w;

    /* renamed from: x, reason: collision with root package name */
    private final String f35506x;

    /* renamed from: y, reason: collision with root package name */
    private final String f35507y;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final Td a(C3205f0 adProperties, C3126ab c3126ab, boolean z10) {
            List<C3566zc> listEmptyList;
            Me meD;
            kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
            AbstractC3486v0.a aVar = AbstractC3486v0.f39082r;
            V3 v3C = (c3126ab == null || (meD = c3126ab.d()) == null) ? null : meD.c();
            Zd zdF = v3C != null ? v3C.f() : null;
            if (zdF == null) {
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
            return new Td(adProperties, z10, new C3469u0(strF, arrayList, c3360naB), zdF);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Td(C3205f0 adProperties, boolean z10, C3469u0 adUnitCommonData, Zd configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C3360na c3360naE = adUnitCommonData.e();
        C3387p2 c3387p2K = configs.k();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3387p2K, "configs.rewardedVideoAuctionSettings");
        super(adProperties, z10, strF, listD, c3360naE, c3387p2K, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), new N0(N0.a.MANUAL, configs.k().j(), configs.k().b(), -1L), configs.l(), configs.f(), configs.o(), configs.n(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        this.f35502t = adProperties;
        this.f35503u = z10;
        this.f35504v = adUnitCommonData;
        this.f35505w = configs;
        this.f35506x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f35507y = C3144bb.f36065b;
    }

    public final C3469u0 A() {
        return this.f35504v;
    }

    public final Zd B() {
        return this.f35505w;
    }

    public final Td a(C3205f0 adProperties, boolean z10, C3469u0 adUnitCommonData, Zd configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        return new Td(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3486v0
    public C3205f0 b() {
        return this.f35502t;
    }

    @Override // com.ironsource.AbstractC3486v0
    public String c() {
        return this.f35506x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Td)) {
            return false;
        }
        Td td2 = (Td) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f35502t, td2.f35502t) && this.f35503u == td2.f35503u && kotlin.jvm.internal.e0.areEqual(this.f35504v, td2.f35504v) && kotlin.jvm.internal.e0.areEqual(this.f35505w, td2.f35505w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f35502t.hashCode() * 31;
        boolean z10 = this.f35503u;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.f35505w.hashCode() + ((this.f35504v.hashCode() + ((iHashCode + i10) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC3486v0
    public String j() {
        return this.f35507y;
    }

    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f35502t + ", isPublisherLoad=" + this.f35503u + ", adUnitCommonData=" + this.f35504v + ", configs=" + this.f35505w + ")";
    }

    @Override // com.ironsource.AbstractC3486v0
    public boolean u() {
        return this.f35503u;
    }

    public final C3205f0 w() {
        return this.f35502t;
    }

    public final boolean x() {
        return this.f35503u;
    }

    public final C3469u0 y() {
        return this.f35504v;
    }

    public final Zd z() {
        return this.f35505w;
    }

    public static /* synthetic */ Td a(Td td2, C3205f0 c3205f0, boolean z10, C3469u0 c3469u0, Zd zd2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3205f0 = td2.f35502t;
        }
        if ((i10 & 2) != 0) {
            z10 = td2.f35503u;
        }
        if ((i10 & 4) != 0) {
            c3469u0 = td2.f35504v;
        }
        if ((i10 & 8) != 0) {
            zd2 = td2.f35505w;
        }
        return td2.a(c3205f0, z10, c3469u0, zd2);
    }

    @Override // com.ironsource.AbstractC3486v0
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
