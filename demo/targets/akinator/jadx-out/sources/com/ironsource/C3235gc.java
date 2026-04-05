package com.ironsource;

import com.ironsource.AbstractC3486v0;
import com.ironsource.N0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.gc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3235gc extends AbstractC3486v0 {

    /* renamed from: y, reason: collision with root package name */
    public static final a f36804y = new a(null);

    /* renamed from: t, reason: collision with root package name */
    private final C3205f0 f36805t;

    /* renamed from: u, reason: collision with root package name */
    private final C3469u0 f36806u;

    /* renamed from: v, reason: collision with root package name */
    private final Rb f36807v;

    /* renamed from: w, reason: collision with root package name */
    private final String f36808w;

    /* renamed from: x, reason: collision with root package name */
    private final String f36809x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.gc$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final C3235gc a(C3205f0 adProperties, C3126ab c3126ab) {
            List<C3566zc> listEmptyList;
            Me meD;
            kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
            AbstractC3486v0.a aVar = AbstractC3486v0.f39082r;
            V3 v3C = (c3126ab == null || (meD = c3126ab.d()) == null) ? null : meD.c();
            Rb rbE = v3C != null ? v3C.e() : null;
            if (rbE == null) {
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
            return new C3235gc(adProperties, new C3469u0(strF, arrayList, c3360naB), rbE);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3235gc(C3205f0 adProperties, C3469u0 adUnitCommonData, Rb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new N0(N0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        this.f36805t = adProperties;
        this.f36806u = adUnitCommonData;
        this.f36807v = configs;
        this.f36808w = "NA";
        this.f36809x = C3144bb.f36068e;
    }

    public final Rb A() {
        return this.f36807v;
    }

    public final C3235gc a(C3205f0 adProperties, C3469u0 adUnitCommonData, Rb configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        return new C3235gc(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3486v0
    public C3205f0 b() {
        return this.f36805t;
    }

    @Override // com.ironsource.AbstractC3486v0
    public String c() {
        return this.f36808w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3235gc)) {
            return false;
        }
        C3235gc c3235gc = (C3235gc) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f36805t, c3235gc.f36805t) && kotlin.jvm.internal.e0.areEqual(this.f36806u, c3235gc.f36806u) && kotlin.jvm.internal.e0.areEqual(this.f36807v, c3235gc.f36807v);
    }

    public int hashCode() {
        return this.f36807v.hashCode() + ((this.f36806u.hashCode() + (this.f36805t.hashCode() * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC3486v0
    public String j() {
        return this.f36809x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f36805t + ", adUnitCommonData=" + this.f36806u + ", configs=" + this.f36807v + ")";
    }

    public final C3205f0 w() {
        return this.f36805t;
    }

    public final C3469u0 x() {
        return this.f36806u;
    }

    public final Rb y() {
        return this.f36807v;
    }

    public final C3469u0 z() {
        return this.f36806u;
    }

    public static /* synthetic */ C3235gc a(C3235gc c3235gc, C3205f0 c3205f0, C3469u0 c3469u0, Rb rb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3205f0 = c3235gc.f36805t;
        }
        if ((i10 & 2) != 0) {
            c3469u0 = c3235gc.f36806u;
        }
        if ((i10 & 4) != 0) {
            rb2 = c3235gc.f36807v;
        }
        return c3235gc.a(c3205f0, c3469u0, rb2);
    }

    @Override // com.ironsource.AbstractC3486v0
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
