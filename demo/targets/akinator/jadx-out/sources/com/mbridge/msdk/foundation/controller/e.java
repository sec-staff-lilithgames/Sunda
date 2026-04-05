package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import com.sfbx.appconsent.core.IABConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private String f40430a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f40431b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f40432c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f40433d = "";

    /* renamed from: e, reason: collision with root package name */
    private int f40434e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f40435f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40436g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40437h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f40438i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f40439j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f40440k;

    /* renamed from: l, reason: collision with root package name */
    private a f40441l;

    /* renamed from: m, reason: collision with root package name */
    private final SharedPreferences f40442m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a();
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f40442m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f40442m;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString("IABTCF_TCString", ""));
            a(this.f40442m.getInt("IABTCF_gdprApplies", 0));
            c(this.f40442m.getString(IABConstants.PURPOSE_CONSENTS, ""));
            e(this.f40442m.getString(IABConstants.VENDOR_CONSENTS, ""));
            b(this.f40442m.getString(IABConstants.GOOGLE_ADDITIONAL_CONSENT, ""));
        }
    }

    public String b() {
        return this.f40430a;
    }

    public void c(String str) {
        this.f40436g = a(str, 1);
        this.f40437h = a(str, 2);
        this.f40431b = str;
    }

    public void d(String str) {
        this.f40430a = str;
    }

    public void e(String str) {
        this.f40438i = a(str, 867);
        this.f40432c = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            switch (str.hashCode()) {
                case -2004976699:
                    if (str.equals(IABConstants.PURPOSE_CONSENTS)) {
                        c(sharedPreferences.getString(IABConstants.PURPOSE_CONSENTS, ""));
                        break;
                    }
                    break;
                case 83641339:
                    if (str.equals("IABTCF_gdprApplies")) {
                        a(sharedPreferences.getInt("IABTCF_gdprApplies", 0));
                        break;
                    }
                    break;
                case 1218895378:
                    if (str.equals("IABTCF_TCString")) {
                        d(sharedPreferences.getString("IABTCF_TCString", ""));
                        break;
                    }
                    break;
                case 1342914771:
                    if (str.equals(IABConstants.GOOGLE_ADDITIONAL_CONSENT)) {
                        b(sharedPreferences.getString(IABConstants.GOOGLE_ADDITIONAL_CONSENT, ""));
                        break;
                    }
                    break;
                case 1450203731:
                    if (str.equals(IABConstants.VENDOR_CONSENTS)) {
                        e(sharedPreferences.getString(IABConstants.VENDOR_CONSENTS, ""));
                        break;
                    }
                    break;
            }
            a aVar = this.f40441l;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th2) {
            p0.b("TCStringManager", th2.getMessage());
        }
    }

    public void b(String str) {
        this.f40433d = str;
        if (TextUtils.isEmpty(str)) {
            this.f40439j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f40440k = false;
            return;
        }
        this.f40440k = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.f40439j = false;
                } else {
                    this.f40439j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th2) {
            p0.b("TCStringManager", th2.getMessage());
        }
    }

    public boolean c() {
        if (this.f40434e == 0) {
            a(true);
            return this.f40435f;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.f40438i || (this.f40440k && this.f40439j)) && this.f40436g && this.f40437h);
        } else {
            a(this.f40438i && this.f40436g && this.f40437h);
        }
        return this.f40435f;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f40441l = aVar;
        }
    }

    public void a(int i10) {
        this.f40434e = i10;
    }

    public void a(boolean z10) {
        this.f40435f = z10;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i10) {
        return a(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }
}
