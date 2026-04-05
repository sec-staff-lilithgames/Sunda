package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N {

    /* renamed from: f, reason: collision with root package name */
    public static final a f35007f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f35008g = "0";

    /* renamed from: h, reason: collision with root package name */
    public static final String f35009h = "0";

    /* renamed from: i, reason: collision with root package name */
    public static final String f35010i = "0";

    /* renamed from: j, reason: collision with root package name */
    public static final String f35011j = "0";

    /* renamed from: a, reason: collision with root package name */
    private final M9 f35012a;

    /* renamed from: b, reason: collision with root package name */
    private W7 f35013b;

    /* renamed from: c, reason: collision with root package name */
    private String f35014c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC3330m0 f35015d;

    /* renamed from: e, reason: collision with root package name */
    private double f35016e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public N(M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        this.f35012a = adInstance;
        this.f35013b = W7.UnknownProvider;
        this.f35014c = "0";
        this.f35015d = EnumC3330m0.LOAD_REQUEST;
        this.f35016e = b0.e2.c() / 1000.0d;
    }

    public final M9 a() {
        return this.f35012a;
    }

    public final IronSource.a b() {
        return this.f35012a.i() ? IronSource.a.BANNER : this.f35012a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.f37252c;
    }

    public final String c() {
        String strE = this.f35012a.e();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "adInstance.id");
        return strE;
    }

    public final M9 d() {
        return this.f35012a;
    }

    public final W7 e() {
        return this.f35013b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n9 = (N) obj;
        return kotlin.jvm.internal.e0.areEqual(c(), n9.c()) && kotlin.jvm.internal.e0.areEqual(g(), n9.g()) && b() == n9.b() && kotlin.jvm.internal.e0.areEqual(i(), n9.i()) && this.f35013b == n9.f35013b && kotlin.jvm.internal.e0.areEqual(this.f35014c, n9.f35014c) && this.f35015d == n9.f35015d;
    }

    public final EnumC3330m0 f() {
        return this.f35015d;
    }

    public final String g() {
        String strC = this.f35012a.c();
        return strC == null ? "0" : strC;
    }

    public final String h() {
        return this.f35014c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.f35013b, this.f35014c, this.f35015d, Double.valueOf(this.f35016e));
    }

    public final String i() {
        String strG = this.f35012a.g();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strG, "adInstance.name");
        return strG;
    }

    public final double j() {
        return this.f35016e;
    }

    public String toString() {
        String string = new JSONObject().put(f.b.f38557c, c()).put("advertiserBundleId", this.f35014c).put("adProvider", this.f35013b.ordinal()).put("adStatus", this.f35015d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f35016e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    public final N a(M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        return new N(adInstance);
    }

    public static /* synthetic */ N a(N n9, M9 m9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            m9 = n9.f35012a;
        }
        return n9.a(m9);
    }

    public final void a(W7 w72) {
        kotlin.jvm.internal.e0.checkNotNullParameter(w72, "<set-?>");
        this.f35013b = w72;
    }

    public final void a(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f35014c = str;
    }

    public final void a(EnumC3330m0 enumC3330m0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(enumC3330m0, "<set-?>");
        this.f35015d = enumC3330m0;
    }

    public final void a(double d10) {
        this.f35016e = d10;
    }
}
