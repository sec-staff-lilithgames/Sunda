package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3486v0 {

    /* renamed from: r, reason: collision with root package name */
    public static final a f39082r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f39083s = -1;

    /* renamed from: a, reason: collision with root package name */
    private final C3205f0 f39084a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39085b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39086c;

    /* renamed from: d, reason: collision with root package name */
    private final List<NetworkSettings> f39087d;

    /* renamed from: e, reason: collision with root package name */
    private final C3360na f39088e;

    /* renamed from: f, reason: collision with root package name */
    private final C3387p2 f39089f;

    /* renamed from: g, reason: collision with root package name */
    private int f39090g;

    /* renamed from: h, reason: collision with root package name */
    private final int f39091h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39092i;

    /* renamed from: j, reason: collision with root package name */
    private final int f39093j;

    /* renamed from: k, reason: collision with root package name */
    private final int f39094k;

    /* renamed from: l, reason: collision with root package name */
    private final N0 f39095l;

    /* renamed from: m, reason: collision with root package name */
    private final long f39096m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f39097n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f39098o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f39099p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f39100q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.v0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(C3205f0 adProperties, C3126ab c3126ab, kv.l getAdFormatConfig, kv.p createAdUnitData) {
            List<C3566zc> listEmptyList;
            Me meD;
            kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
            kotlin.jvm.internal.e0.checkNotNullParameter(getAdFormatConfig, "getAdFormatConfig");
            kotlin.jvm.internal.e0.checkNotNullParameter(createAdUnitData, "createAdUnitData");
            Object objInvoke = getAdFormatConfig.invoke((c3126ab == null || (meD = c3126ab.d()) == null) ? null : meD.c());
            if (objInvoke == null) {
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
            return (AdUnitData) createAdUnitData.invoke(new C3469u0(strF, arrayList, c3360naB), objInvoke);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3486v0(C3205f0 adProperties, boolean z10, String str, List<? extends NetworkSettings> providerList, C3360na publisherDataHolder, C3387p2 auctionSettings, int i10, int i11, boolean z11, int i12, int i13, N0 loadingData, long j10, boolean z12, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadingData, "loadingData");
        this.f39084a = adProperties;
        this.f39085b = z10;
        this.f39086c = str;
        this.f39087d = providerList;
        this.f39088e = publisherDataHolder;
        this.f39089f = auctionSettings;
        this.f39090g = i10;
        this.f39091h = i11;
        this.f39092i = z11;
        this.f39093j = i12;
        this.f39094k = i13;
        this.f39095l = loadingData;
        this.f39096m = j10;
        this.f39097n = z12;
        this.f39098o = z13;
        this.f39099p = z14;
        this.f39100q = z15;
    }

    public final void a(int i10) {
        this.f39090g = i10;
    }

    public C3205f0 b() {
        return this.f39084a;
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public abstract String c();

    public final boolean d() {
        return this.f39092i;
    }

    public final C3387p2 e() {
        return this.f39089f;
    }

    public final long f() {
        return this.f39096m;
    }

    public final int g() {
        return this.f39093j;
    }

    public final int h() {
        return this.f39091h;
    }

    public final N0 i() {
        return this.f39095l;
    }

    public abstract String j();

    public final int k() {
        return this.f39090g;
    }

    public final String l() {
        String strC;
        C3325ld c3325ldF = b().f();
        return (c3325ldF == null || (strC = c3325ldF.c()) == null) ? "" : strC;
    }

    public final List<NetworkSettings> m() {
        return this.f39087d;
    }

    public final boolean n() {
        return this.f39097n;
    }

    public final C3360na o() {
        return this.f39088e;
    }

    public final boolean p() {
        return this.f39099p;
    }

    public final boolean q() {
        return this.f39100q;
    }

    public final String r() {
        return this.f39086c;
    }

    public final boolean s() {
        return this.f39098o;
    }

    public final boolean t() {
        return this.f39089f.g() > 0;
    }

    public boolean u() {
        return this.f39085b;
    }

    public final String v() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f37337x, Integer.valueOf(this.f39090g), com.ironsource.mediationsdk.d.f37338y, Boolean.valueOf(this.f39092i), com.ironsource.mediationsdk.d.f37339z, Boolean.valueOf(this.f39100q));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    public final void a(boolean z10) {
        this.f39092i = z10;
    }

    public final void b(boolean z10) {
        this.f39100q = z10;
    }

    public final int a() {
        return this.f39094k;
    }

    public final NetworkSettings a(String instanceName) {
        Object next;
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceName, "instanceName");
        Iterator<T> it = this.f39087d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                break;
            }
        }
        return (NetworkSettings) next;
    }

    public AdData a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), this.f39086c);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    public /* synthetic */ AbstractC3486v0(C3205f0 c3205f0, boolean z10, String str, List list, C3360na c3360na, C3387p2 c3387p2, int i10, int i11, boolean z11, int i12, int i13, N0 n02, long j10, boolean z12, boolean z13, boolean z14, boolean z15, int i14, kotlin.jvm.internal.u uVar) {
        this(c3205f0, z10, str, list, c3360na, c3387p2, i10, i11, z11, i12, i13, n02, j10, z12, z13, z14, (i14 & com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z15);
    }
}
