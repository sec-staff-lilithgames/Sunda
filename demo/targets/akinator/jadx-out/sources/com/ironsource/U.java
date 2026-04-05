package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class U {

    /* renamed from: q, reason: collision with root package name */
    public static final a f35512q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f35513r = -1;

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f35514a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35515b;

    /* renamed from: c, reason: collision with root package name */
    private final List<NetworkSettings> f35516c;

    /* renamed from: d, reason: collision with root package name */
    private final C3387p2 f35517d;

    /* renamed from: e, reason: collision with root package name */
    private int f35518e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35519f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35520g;

    /* renamed from: h, reason: collision with root package name */
    private final int f35521h;

    /* renamed from: i, reason: collision with root package name */
    private final int f35522i;

    /* renamed from: j, reason: collision with root package name */
    private final N0 f35523j;

    /* renamed from: k, reason: collision with root package name */
    private final H0 f35524k;

    /* renamed from: l, reason: collision with root package name */
    private final long f35525l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f35526m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f35527n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f35528o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f35529p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(IronSource.a adUnit, String str, List<? extends NetworkSettings> list, C3387p2 auctionSettings, int i10, int i11, boolean z10, int i12, int i13, N0 loadingData, H0 interactionData, long j10, boolean z11, boolean z12, boolean z13, boolean z14) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadingData, "loadingData");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionData, "interactionData");
        this.f35514a = adUnit;
        this.f35515b = str;
        this.f35516c = list;
        this.f35517d = auctionSettings;
        this.f35518e = i10;
        this.f35519f = i11;
        this.f35520g = z10;
        this.f35521h = i12;
        this.f35522i = i13;
        this.f35523j = loadingData;
        this.f35524k = interactionData;
        this.f35525l = j10;
        this.f35526m = z11;
        this.f35527n = z12;
        this.f35528o = z13;
        this.f35529p = z14;
    }

    public final void a(int i10) {
        this.f35518e = i10;
    }

    public final IronSource.a b() {
        return this.f35514a;
    }

    public final boolean c() {
        return this.f35520g;
    }

    public final C3387p2 d() {
        return this.f35517d;
    }

    public final long e() {
        return this.f35525l;
    }

    public final int f() {
        return this.f35521h;
    }

    public final H0 g() {
        return this.f35524k;
    }

    public final N0 h() {
        return this.f35523j;
    }

    public final int i() {
        return this.f35518e;
    }

    public List<NetworkSettings> j() {
        return this.f35516c;
    }

    public final boolean k() {
        return this.f35526m;
    }

    public final boolean l() {
        return this.f35528o;
    }

    public final boolean m() {
        return this.f35529p;
    }

    public final int n() {
        return this.f35519f;
    }

    public String o() {
        return this.f35515b;
    }

    public final boolean p() {
        return this.f35527n;
    }

    public final boolean q() {
        return this.f35517d.g() > 0;
    }

    public final String r() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f37337x, Integer.valueOf(this.f35518e), com.ironsource.mediationsdk.d.f37338y, Boolean.valueOf(this.f35520g), com.ironsource.mediationsdk.d.f37339z, Boolean.valueOf(this.f35529p));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    public final void a(boolean z10) {
        this.f35520g = z10;
    }

    public final void b(boolean z10) {
        this.f35529p = z10;
    }

    public final int a() {
        return this.f35522i;
    }

    public final NetworkSettings a(String instanceName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceName, "instanceName");
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        Iterator<T> it = listJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                obj = next;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public /* synthetic */ U(IronSource.a aVar, String str, List list, C3387p2 c3387p2, int i10, int i11, boolean z10, int i12, int i13, N0 n02, H0 h02, long j10, boolean z11, boolean z12, boolean z13, boolean z14, int i14, kotlin.jvm.internal.u uVar) {
        this(aVar, str, list, c3387p2, i10, i11, z10, i12, i13, n02, h02, j10, z11, z12, z13, (i14 & 32768) != 0 ? false : z14);
    }
}
