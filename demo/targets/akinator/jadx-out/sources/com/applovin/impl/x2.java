package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class x2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16167a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f16168b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f16169c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f16170d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f16171e;

    /* renamed from: f, reason: collision with root package name */
    private final h f16172f;

    public x2(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, h hVar) {
        this.f16167a = str;
        this.f16168b = maxAdFormat;
        this.f16169c = map;
        this.f16170d = map2;
        this.f16171e = map3;
        this.f16172f = hVar;
    }

    public boolean a(Object obj) {
        return obj instanceof x2;
    }

    public String b() {
        return this.f16167a;
    }

    public Map c() {
        return this.f16171e;
    }

    public Map d() {
        return this.f16170d;
    }

    public Map e() {
        return this.f16169c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        if (!x2Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = x2Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = x2Var.a();
        if (maxAdFormatA != null ? !maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 != null) {
            return false;
        }
        Map mapE = e();
        Map mapE2 = x2Var.e();
        if (mapE != null ? !mapE.equals(mapE2) : mapE2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = x2Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = x2Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        h hVarF = f();
        h hVarF2 = x2Var.f();
        return hVarF != null ? hVarF.equals(hVarF2) : hVarF2 == null;
    }

    public h f() {
        return this.f16172f;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        MaxAdFormat maxAdFormatA = a();
        int iHashCode2 = ((iHashCode + 59) * 59) + (maxAdFormatA == null ? 43 : maxAdFormatA.hashCode());
        Map mapE = e();
        int iHashCode3 = (iHashCode2 * 59) + (mapE == null ? 43 : mapE.hashCode());
        Map mapD = d();
        int iHashCode4 = (iHashCode3 * 59) + (mapD == null ? 43 : mapD.hashCode());
        Map mapC = c();
        int iHashCode5 = (iHashCode4 * 59) + (mapC == null ? 43 : mapC.hashCode());
        h hVarF = f();
        return (iHashCode5 * 59) + (hVarF != null ? hVarF.hashCode() : 43);
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + b() + ", adFormat=" + a() + ")";
    }

    public MaxAdFormat a() {
        return this.f16168b;
    }
}
