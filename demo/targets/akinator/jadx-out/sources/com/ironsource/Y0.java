package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Y0 extends C3237ge {

    /* renamed from: h, reason: collision with root package name */
    private static String f35710h = "type";

    /* renamed from: i, reason: collision with root package name */
    private static String f35711i = "numOfAdUnits";

    /* renamed from: j, reason: collision with root package name */
    private static String f35712j = "firstCampaignCredits";

    /* renamed from: k, reason: collision with root package name */
    private static String f35713k = "totalNumberCredits";

    /* renamed from: l, reason: collision with root package name */
    private static String f35714l = "productType";

    /* renamed from: b, reason: collision with root package name */
    private String f35715b;

    /* renamed from: c, reason: collision with root package name */
    private String f35716c;

    /* renamed from: d, reason: collision with root package name */
    private String f35717d;

    /* renamed from: e, reason: collision with root package name */
    private String f35718e;

    /* renamed from: f, reason: collision with root package name */
    private String f35719f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35720g;

    public Y0(String str) {
        super(str);
        if (a(f35710h)) {
            k(d(f35710h));
        }
        if (a(f35711i)) {
            h(d(f35711i));
            a(true);
        } else {
            a(false);
        }
        if (a(f35712j)) {
            g(d(f35712j));
        }
        if (a(f35713k)) {
            j(d(f35713k));
        }
        if (a(f35714l)) {
            i(d(f35714l));
        }
    }

    private void a(boolean z10) {
        this.f35720g = z10;
    }

    public String b() {
        return this.f35718e;
    }

    public String c() {
        return this.f35717d;
    }

    public String d() {
        return this.f35716c;
    }

    public String e() {
        return this.f35719f;
    }

    public String f() {
        return this.f35715b;
    }

    public void g(String str) {
        this.f35718e = str;
    }

    public void h(String str) {
        this.f35717d = str;
    }

    public void i(String str) {
        this.f35716c = str;
    }

    public void j(String str) {
        this.f35719f = str;
    }

    public void k(String str) {
        this.f35715b = str;
    }

    public boolean g() {
        return this.f35720g;
    }
}
