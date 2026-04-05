package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.sfbx.appconsent.core.IABConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f23263a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f23264b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f23265c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f23266d = null;

    /* renamed from: e, reason: collision with root package name */
    public String f23267e = null;

    /* renamed from: f, reason: collision with root package name */
    public InneractiveAdManager.GdprConsentSource f23268f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f23269g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f23270h = null;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f23271i = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f23272j = null;

    /* renamed from: k, reason: collision with root package name */
    public SharedPreferences f23273k;

    /* renamed from: l, reason: collision with root package name */
    public SharedPreferences f23274l;

    public final boolean a(boolean z10, String str) {
        if (com.fyber.inneractive.sdk.util.o.f26796a == null) {
            return false;
        }
        f();
        SharedPreferences sharedPreferences = this.f23273k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z10).apply();
        return true;
    }

    public final void b() {
        IAlog.a("Clearing LGPD consent status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f26796a == null) {
            IAlog.f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f23271i = null;
        SharedPreferences sharedPreferences = this.f23273k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    public final void c() {
        IAlog.a("Clearing CCPA Consent String", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f26796a == null) {
            IAlog.f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f23270h = null;
        SharedPreferences sharedPreferences = this.f23273k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public final Boolean d() {
        if (this.f23263a == null) {
            this.f23264b = g();
        }
        if (com.fyber.inneractive.sdk.util.o.f26796a == null) {
            return null;
        }
        Boolean bool = this.f23263a;
        return bool == null ? this.f23264b : bool;
    }

    public final boolean e() {
        o oVar;
        SharedPreferences sharedPreferences;
        if (this.f23265c == null) {
            s sVar = IAConfigManager.O.f23226u;
            boolean z10 = false;
            if (sVar != null && (oVar = sVar.f23394b) != null && oVar.a("TcfPurpose1", 1, Integer.MIN_VALUE) == 1 && (sharedPreferences = this.f23274l) != null) {
                try {
                    String string = sharedPreferences.getString(IABConstants.PURPOSE_CONSENTS, null);
                    if (string != null && !string.isEmpty() && string.charAt(0) == '0') {
                        z10 = true;
                    }
                } catch (Exception unused) {
                    IAlog.b("%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs", IAlog.a(this));
                }
            }
            this.f23265c = Boolean.valueOf(z10);
        }
        return this.f23265c.booleanValue();
    }

    public final void f() {
        Application application = com.fyber.inneractive.sdk.util.o.f26796a;
        if (application != null) {
            if (this.f23274l == null) {
                this.f23274l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            if (this.f23273k == null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.f23273k = sharedPreferences;
                if (sharedPreferences != null) {
                    if (sharedPreferences.contains("IAGDPRBool")) {
                        this.f23263a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                    } else {
                        this.f23264b = g();
                    }
                    if (sharedPreferences.contains("IAGdprConsentData")) {
                        this.f23266d = sharedPreferences.getString("IAGdprConsentData", null);
                    } else {
                        this.f23267e = h();
                    }
                    if (sharedPreferences.contains("IACCPAConsentData")) {
                        this.f23270h = sharedPreferences.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences.contains("IAGdprSource")) {
                        try {
                            this.f23268f = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (Exception unused) {
                            this.f23268f = InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences.contains("IALgpdConsentStatus")) {
                        this.f23271i = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences.contains("keyUserID")) {
                        this.f23269g = sharedPreferences.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    public final Boolean g() {
        o oVar;
        SharedPreferences sharedPreferences;
        s sVar = IAConfigManager.O.f23226u;
        if (sVar != null && (oVar = sVar.f23394b) != null) {
            int iA = oVar.a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (iA != 0 && (sharedPreferences = this.f23274l) != null) {
                try {
                    String string = sharedPreferences.getString(IABConstants.VENDOR_CONSENTS, null);
                    if (string == null) {
                        return null;
                    }
                    int i10 = (iA >= 0 ? iA : 262) - 1;
                    return Boolean.valueOf(string.length() > i10 && string.charAt(i10) == '1');
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final String h() {
        SharedPreferences sharedPreferences;
        if (IAConfigManager.O.f23226u.f23394b.a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.f23274l) != null && sharedPreferences.contains("IABTCF_TCString")) {
            try {
                return this.f23274l.getString("IABTCF_TCString", null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.o.f26796a == null) {
            return false;
        }
        f();
        if (this.f23273k == null) {
            return false;
        }
        IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
        this.f23273k.edit().putString(str, str2).apply();
        return true;
    }

    public final void a(String str) {
        if (com.fyber.inneractive.sdk.util.o.f26796a != null) {
            f();
            if (TextUtils.isEmpty(str)) {
                this.f23269g = str;
                SharedPreferences sharedPreferences = this.f23273k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 256) {
                str = str.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            SharedPreferences sharedPreferences2 = this.f23273k;
            if (sharedPreferences2 != null) {
                this.f23269g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public final void a() {
        IAlog.a("Clearing GDPR Consent String and status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f26796a == null) {
            IAlog.f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f23263a = null;
        this.f23266d = null;
        SharedPreferences sharedPreferences = this.f23273k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }
}
