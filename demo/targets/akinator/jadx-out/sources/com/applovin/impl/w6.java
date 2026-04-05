package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.InterfaceC3129ae;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class w6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f16144a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f16145b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f16146c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f16147d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f16148e;

    /* renamed from: f, reason: collision with root package name */
    private String f16149f;

    /* renamed from: g, reason: collision with root package name */
    private String f16150g;

    /* renamed from: h, reason: collision with root package name */
    private String f16151h;

    /* renamed from: i, reason: collision with root package name */
    private String f16152i;

    /* renamed from: j, reason: collision with root package name */
    private String f16153j;

    public w6(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o());
        this.f16145b = defaultSharedPreferences;
        this.f16144a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f16146c = a(x4.f16192t.a());
        this.f16147d = a(x4.f16193u.a());
        this.f16148e = h();
        this.f16149f = (String) y4.a(x4.f16195w, (Object) null, defaultSharedPreferences, false);
        this.f16150g = (String) y4.a(x4.f16196x, (Object) null, defaultSharedPreferences, false);
        this.f16151h = (String) y4.a(x4.f16197y, (Object) null, defaultSharedPreferences, false);
        this.f16152i = (String) y4.a(x4.A, (Object) null, defaultSharedPreferences, false);
        this.f16153j = (String) y4.a(x4.C, (Object) null, defaultSharedPreferences, false);
        b(this.f16150g);
    }

    private Integer h() {
        String strA = x4.f16194v.a();
        if (this.f16145b.contains(strA)) {
            Integer num = (Integer) y4.a(strA, null, Integer.class, this.f16145b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f16144a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f16144a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l9 = (Long) y4.a(strA, null, Long.class, this.f16145b, false);
            if (l9 != null) {
                if (l9.longValue() == 1 || l9.longValue() == 0) {
                    return Integer.valueOf(l9.intValue());
                }
                this.f16144a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f16144a.O().b("TcfManager", "Long value (" + l9 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) y4.a(strA, null, Boolean.class, this.f16145b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) y4.a(strA, null, String.class, this.f16145b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f16144a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f16144a.O().b("TcfManager", e3.g.l("String value (", str, ") for ", strA, " is invalid - setting GDPR Applies to null"));
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i10) {
        return z6.a(i10, this.f16150g);
    }

    public boolean b() {
        return z6.a(this.f16150g);
    }

    public String c() {
        return this.f16150g;
    }

    public String d() {
        return u6.a(this.f16146c);
    }

    public Integer e() {
        return this.f16146c;
    }

    public Integer f() {
        return this.f16147d;
    }

    public Integer g() {
        return this.f16148e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f16146c) + a("CMP SDK Version", this.f16147d) + a(x4.f16194v.a(), this.f16148e) + a(x4.f16195w.a(), this.f16149f) + a(x4.f16196x.a(), this.f16150g);
    }

    public String j() {
        return this.f16149f;
    }

    public String k() {
        return this.f16151h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f16144a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(x4.f16192t.a())) {
            this.f16146c = a(str);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = this.f16144a.O();
                StringBuilder sbO = e3.g.o("SharedPreferences entry updated - key: ", str, ", value: ");
                sbO.append(this.f16146c);
                oVarO.a("TcfManager", sbO.toString());
            }
            this.f16144a.S0();
            return;
        }
        if (str.equals(x4.f16193u.a())) {
            this.f16147d = a(str);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO2 = this.f16144a.O();
                StringBuilder sbO2 = e3.g.o("SharedPreferences entry updated - key: ", str, ", value: ");
                sbO2.append(this.f16147d);
                oVarO2.a("TcfManager", sbO2.toString());
                return;
            }
            return;
        }
        if (str.equals(x4.f16194v.a())) {
            this.f16148e = h();
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO3 = this.f16144a.O();
                StringBuilder sbO3 = e3.g.o("SharedPreferences entry updated - key: ", str, ", value: ");
                sbO3.append(this.f16148e);
                oVarO3.a("TcfManager", sbO3.toString());
                return;
            }
            return;
        }
        if (str.equals(x4.f16195w.a())) {
            this.f16149f = (String) y4.a(str, (Object) null, String.class, sharedPreferences);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.B(e3.g.o("SharedPreferences entry updated - key: ", str, ", value: "), this.f16149f, this.f16144a.O(), "TcfManager");
            }
            this.f16144a.S0();
            return;
        }
        if (str.equals(x4.f16196x.a())) {
            this.f16150g = (String) y4.a(str, (Object) null, String.class, sharedPreferences);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.B(e3.g.o("SharedPreferences entry updated - key: ", str, ", value: "), this.f16150g, this.f16144a.O(), "TcfManager");
            }
            b(this.f16150g);
            return;
        }
        if (str.equals(x4.f16197y.a())) {
            this.f16151h = (String) y4.a(str, (Object) null, String.class, sharedPreferences);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.B(e3.g.o("SharedPreferences entry updated - key: ", str, ", value: "), this.f16151h, this.f16144a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(x4.f16198z.a())) {
            String str2 = (String) y4.a(str, (Object) null, String.class, sharedPreferences);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f16144a.O().a("TcfManager", a.b.m("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(x4.A.a())) {
            this.f16152i = (String) y4.a(str, (Object) null, String.class, sharedPreferences);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.B(e3.g.o("SharedPreferences entry updated - key: ", str, ", value: "), this.f16152i, this.f16144a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(x4.B.a())) {
            String str3 = (String) y4.a(str, (Object) null, String.class, sharedPreferences);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f16144a.O().a("TcfManager", a.b.m("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (str.equals(x4.C.a())) {
            this.f16153j = (String) y4.a(str, (Object) null, String.class, sharedPreferences);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.B(e3.g.o("SharedPreferences entry updated - key: ", str, ", value: "), this.f16153j, this.f16144a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) y4.a(str, (Object) null, String.class, sharedPreferences);
            this.f16144a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f16144a.O().a("TcfManager", a.b.m("SharedPreferences entry updated - key: ", str, ", value: ", str4));
            }
        }
    }

    private Integer a(String str) {
        if (this.f16145b.contains(str)) {
            Integer num = (Integer) y4.a(str, null, Integer.class, this.f16145b, false);
            if (num != null) {
                return num;
            }
            Long l9 = (Long) y4.a(str, null, Long.class, this.f16145b, false);
            if (l9 != null && l9.longValue() >= -2147483648L && l9.longValue() <= 2147483647L) {
                return Integer.valueOf(l9.intValue());
            }
            String str2 = (String) y4.a(str, null, String.class, this.f16145b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f16144a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f16144a.O().b("TcfManager", e3.g.l("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    public Boolean b(int i10) {
        String str = this.f16152i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(z6.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f16153j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(z6.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f16151h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(z6.a(str, i10 - 1));
    }

    private void b(String str) {
        this.f16144a.O();
        if (com.applovin.impl.sdk.o.a()) {
            b0.e2.y("Attempting to update consent from Additional Consent string: ", str, this.f16144a.O(), "TcfManager");
        }
        Boolean boolA = z6.a(InterfaceC3129ae.c.f35992e, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f16144a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f16144a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                p0.b(true, com.applovin.impl.sdk.k.o());
            } else {
                this.f16144a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f16144a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                p0.b(false, com.applovin.impl.sdk.k.o());
            }
            this.f16144a.S0();
            return;
        }
        this.f16144a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f16144a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f16146c = null;
        this.f16148e = null;
        this.f16149f = null;
        this.f16150g = null;
        this.f16151h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sbO = e3.g.o("\n", str, " - ");
        sbO.append(obj != null ? obj.toString() : "No value set");
        return sbO.toString();
    }
}
