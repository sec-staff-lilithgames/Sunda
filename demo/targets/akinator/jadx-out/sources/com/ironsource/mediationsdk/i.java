package com.ironsource.mediationsdk;

import com.ironsource.C3161ca;
import com.ironsource.C3225g2;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f37532a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<C3225g2> f37533b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37534c;

    /* renamed from: d, reason: collision with root package name */
    private String f37535d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37536e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Object> f37537f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f37538g;

    /* renamed from: h, reason: collision with root package name */
    private int f37539h;

    /* renamed from: i, reason: collision with root package name */
    private h f37540i;

    /* renamed from: j, reason: collision with root package name */
    private C3161ca f37541j;

    /* renamed from: k, reason: collision with root package name */
    private String f37542k;

    /* renamed from: l, reason: collision with root package name */
    private ISBannerSize f37543l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f37544m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37545n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f37546o;

    /* renamed from: p, reason: collision with root package name */
    private String f37547p;

    /* renamed from: q, reason: collision with root package name */
    private String f37548q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f37549r;

    /* renamed from: s, reason: collision with root package name */
    private Double f37550s;

    public i(IronSource.a adUnit) {
        e0.checkNotNullParameter(adUnit, "adUnit");
        this.f37532a = adUnit;
        this.f37533b = new ArrayList<>();
        this.f37535d = "";
        this.f37537f = new HashMap();
        this.f37538g = new ArrayList();
        this.f37539h = -1;
        this.f37542k = "";
    }

    public final IronSource.a a() {
        return this.f37532a;
    }

    public final void b(boolean z10) {
        this.f37536e = z10;
    }

    public final IronSource.a c() {
        return this.f37532a;
    }

    public final void d(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f37542k = str;
    }

    public final h e() {
        return this.f37540i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f37532a == ((i) obj).f37532a;
    }

    public final ISBannerSize f() {
        return this.f37543l;
    }

    public final Double g() {
        return this.f37550s;
    }

    public final Map<String, Object> h() {
        return this.f37537f;
    }

    public int hashCode() {
        return this.f37532a.hashCode();
    }

    public final String j() {
        return this.f37535d;
    }

    public final ArrayList<C3225g2> k() {
        return this.f37533b;
    }

    public final List<String> l() {
        return this.f37538g;
    }

    public final C3161ca n() {
        return this.f37541j;
    }

    public final int o() {
        return this.f37539h;
    }

    public final boolean p() {
        return this.f37545n;
    }

    public final boolean q() {
        return this.f37546o;
    }

    public final String r() {
        return this.f37542k;
    }

    public final boolean s() {
        return this.f37544m;
    }

    public final boolean t() {
        return this.f37536e;
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f37532a + ")";
    }

    public final Boolean u() {
        return this.f37549r;
    }

    public final boolean v() {
        return this.f37534c;
    }

    public final i a(IronSource.a adUnit) {
        e0.checkNotNullParameter(adUnit, "adUnit");
        return new i(adUnit);
    }

    public final void b(String str) {
        this.f37547p = str;
    }

    public final void c(boolean z10) {
        this.f37534c = z10;
    }

    public final void d(boolean z10) {
        this.f37545n = z10;
    }

    public final void e(boolean z10) {
        this.f37546o = z10;
    }

    public static /* synthetic */ i a(i iVar, IronSource.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = iVar.f37532a;
        }
        return iVar.a(aVar);
    }

    public final String b() {
        return this.f37548q;
    }

    public final void c(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f37535d = str;
    }

    public final String d() {
        return this.f37547p;
    }

    public final void a(C3225g2 instanceInfo) {
        e0.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.f37533b.add(instanceInfo);
    }

    public final void a(Map<String, Object> map) {
        e0.checkNotNullParameter(map, "<set-?>");
        this.f37537f = map;
    }

    public final void a(List<String> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.f37538g = list;
    }

    public final void a(int i10) {
        this.f37539h = i10;
    }

    public final void a(h hVar) {
        this.f37540i = hVar;
    }

    public final void a(C3161ca c3161ca) {
        this.f37541j = c3161ca;
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.f37543l = iSBannerSize;
    }

    public final void a(boolean z10) {
        this.f37544m = z10;
    }

    public final void a(String str) {
        this.f37548q = str;
    }

    public final void a(Boolean bool) {
        this.f37549r = bool;
    }

    public final void a(Double d10) {
        this.f37550s = d10;
    }

    @tu.f
    public static /* synthetic */ void i() {
    }

    @tu.f
    public static /* synthetic */ void m() {
    }
}
