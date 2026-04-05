package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f41115a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f41116b;

    /* renamed from: c, reason: collision with root package name */
    private long f41117c;

    /* renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f41118d;

    /* renamed from: e, reason: collision with root package name */
    IntentFilter f41119e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final f0 f41120a = new f0();
    }

    public static f0 a() {
        return b.f41120a;
    }

    public String b() throws JSONException {
        try {
            if (this.f41115a == null) {
                this.f41115a = new JSONObject();
            }
            if (this.f41115a.length() < 2) {
                try {
                    this.f41115a.put("KEY_INFO", (String) c.a(com.mbridge.msdk.foundation.controller.c.m().d(), "KEY_INFO", ""));
                } catch (Exception e10) {
                    p0.b("NetAddressManager", e10.getMessage());
                }
                try {
                    this.f41115a.put("KEY_TIME", ((Long) c.a(com.mbridge.msdk.foundation.controller.c.m().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e11) {
                    p0.b("NetAddressManager", e11.getMessage());
                }
            }
            String strOptString = this.f41115a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
            return System.currentTimeMillis() - this.f41115a.optLong("KEY_TIME") > (gVarB != null ? gVarB.R() : 3600L) * 1000 ? "" : strOptString;
        } catch (Exception e12) {
            p0.b("NetAddressManager", e12.getMessage());
            return "";
        }
    }

    public void c() {
        Context contextD;
        try {
            if (com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b()).S() != 1 || (contextD = com.mbridge.msdk.foundation.controller.c.m().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.f41119e = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            contextD.registerReceiver(this.f41118d, this.f41119e);
        } catch (Exception e10) {
            p0.b("NetAddressManager", e10.getMessage());
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f41117c > 3000) {
            if (this.f41116b == null) {
                this.f41116b = new com.mbridge.msdk.setting.j();
            }
            this.f41116b.c(com.mbridge.msdk.foundation.controller.c.m().d(), com.mbridge.msdk.foundation.controller.c.m().b(), com.mbridge.msdk.foundation.controller.c.m().c());
            this.f41117c = jCurrentTimeMillis;
        }
    }

    public void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (contextD != null) {
            try {
                contextD.unregisterReceiver(this.f41118d);
            } catch (Exception e10) {
                p0.b("NetAddressManager", e10.getMessage());
            }
        }
    }

    private f0() {
        this.f41115a = new JSONObject();
        this.f41118d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f41119e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void a(String str) {
        if (this.f41115a == null) {
            this.f41115a = new JSONObject();
        }
        try {
            if (!this.f41115a.optString("KEY_INFO", "").equals(str)) {
                this.f41115a.put("KEY_INFO", str);
                c.b(com.mbridge.msdk.foundation.controller.c.m().d(), "KEY_INFO", str);
            }
        } catch (Exception e10) {
            p0.b("NetAddressManager", e10.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f41115a.put("KEY_TIME", jCurrentTimeMillis);
            c.b(com.mbridge.msdk.foundation.controller.c.m().d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e11) {
            p0.b("NetAddressManager", e11.getMessage());
        }
    }
}
