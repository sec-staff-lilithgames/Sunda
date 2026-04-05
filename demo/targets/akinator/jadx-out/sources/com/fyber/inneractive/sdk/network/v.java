package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3500ve;
import com.ironsource.G5;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f24312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f24316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f24318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f24319h;

    public v(w wVar, y yVar, String str, String str2, String str3, String str4, Integer num, String str5) {
        this.f24319h = wVar;
        this.f24312a = yVar;
        this.f24313b = str;
        this.f24314c = str2;
        this.f24315d = str3;
        this.f24316e = str4;
        this.f24317f = num;
        this.f24318g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String strA;
        HashMap map;
        com.fyber.inneractive.sdk.response.e eVar;
        w wVar = this.f24319h;
        t tVar = wVar.f24325b;
        if (tVar != null) {
            this.f24312a.a(Integer.valueOf(tVar.val), NotificationCompat.CATEGORY_ERROR);
            this.f24319h.f24325b.getClass();
            strA = r1.ERROR_TABLE.a();
            IAlog.a("Event dispatcher - dispatching error: %s", this.f24319h.f24325b);
            IAlog.d("%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(this.f24319h.f24325b.val));
        } else {
            u uVar = wVar.f24326c;
            if (uVar != null) {
                this.f24312a.a(Integer.valueOf(uVar.val), NotificationCompat.CATEGORY_EVENT);
                this.f24319h.f24326c.getClass();
                strA = r1.EVENT_TABLE.a();
                IAlog.a("Event dispatcher - dispatching event: %s", this.f24319h.f24326c);
                IAlog.d("%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(this.f24319h.f24326c.val));
            } else {
                strA = null;
            }
        }
        y yVar = this.f24312a;
        StringBuilder sbU = o2.u(strA);
        w wVar2 = this.f24319h;
        t tVar2 = wVar2.f24325b;
        sbU.append(tVar2 != null ? String.valueOf(tVar2.val) : String.valueOf(wVar2.f24326c.val));
        yVar.a(sbU.toString(), G5.Q);
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.f24312a.a(Long.valueOf(calendar.getTimeInMillis()), "date_created");
        if (!IAConfigManager.d()) {
            this.f24312a.a(this.f24313b, "contentid");
            this.f24312a.a(this.f24314c, "fairbidv");
            if (!TextUtils.isEmpty(this.f24315d)) {
                this.f24312a.a(this.f24315d, "placement_type");
            }
            if (!TextUtils.isEmpty(this.f24316e)) {
                this.f24312a.a(this.f24316e, "spot_id");
            }
            if (!InneractiveAdManager.isCurrentUserAChild()) {
                String strI = com.fyber.inneractive.sdk.util.k.i();
                if (!TextUtils.isEmpty(strI)) {
                    this.f24312a.a(strI, "ciso");
                }
            }
            this.f24312a.a(this.f24317f, "ad_type");
            if (this.f24319h.f24330g && !TextUtils.isEmpty(this.f24318g)) {
                this.f24312a.f24337c = this.f24318g;
            }
            this.f24312a.a(com.fyber.inneractive.sdk.util.z0.a().b(), "n");
            try {
                this.f24312a.a(w.f24323h.format(calendar.getTime()), "day");
            } catch (Throwable unused) {
            }
            this.f24312a.a(Integer.valueOf(calendar.get(11)), "hour");
            JSONArray jSONArray = this.f24319h.f24327d;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.f24312a.a(this.f24319h.f24327d, C3500ve.f39133d);
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.f24319h.f24328e;
            if (eVar2 != null && eVar2.D) {
                this.f24312a.a("1", "sdk_bidding");
            }
            if (InneractiveAdManager.isCurrentUserAChild()) {
                this.f24312a.a("1", "child_mode");
            }
            IAConfigManager iAConfigManager = IAConfigManager.O;
            this.f24312a.a(iAConfigManager.E.n() && (eVar = this.f24319h.f24328e) != null && eVar.H != com.fyber.inneractive.sdk.ignite.m.NONE ? "1" : "0", "ignite");
            y yVar2 = this.f24312a;
            com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f23993p;
            yVar2.a(lVar != null ? lVar.f88175a.d() : null, "ignitep");
            y yVar3 = this.f24312a;
            com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f23993p;
            yVar3.a(lVar2 != null ? lVar2.f88175a.i() : null, "ignitev");
            JSONArray jSONArrayB = iAConfigManager.M.b();
            if (jSONArrayB != null && jSONArrayB.length() > 0) {
                this.f24312a.a(jSONArrayB, "s_experiments");
            }
            JSONArray jSONArray2 = this.f24319h.f24329f;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jSONArray2.length()) {
                        break;
                    }
                    if (jSONArray2.optJSONObject(i10).length() >= 1) {
                        this.f24312a.a(this.f24319h.f24329f, "extra");
                        break;
                    }
                    i10++;
                }
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.f24319h.f24328e;
            if (eVar3 != null && eVar3.L) {
                this.f24312a.a("1", "dynamic_controls");
            }
        }
        y yVar4 = this.f24312a;
        if (TextUtils.isEmpty(yVar4.f24335a) || (map = yVar4.f24336b) == null || map.size() == 0) {
            return;
        }
        f fVar = IAConfigManager.O.I;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        HashMap map2 = yVar4.f24336b;
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj != null) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused2) {
                }
            }
        }
        String strSubstring = yVar4.f24337c;
        if (strSubstring != null) {
            int length = strSubstring.length();
            if (length > 51200) {
                int iIndexOf = strSubstring.indexOf("iawrapper");
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                strSubstring = strSubstring.substring(iIndexOf, 51199);
                IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", strSubstring);
            } catch (JSONException e10) {
                IAlog.a("Failed inserting ad body to json", e10, new Object[0]);
            }
        }
        if (IAlog.f26748a == 1) {
            try {
                IAlog.d("%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (Throwable unused3) {
            }
        }
        fVar.f24213a.offer(jSONObject);
        if (fVar.f24213a.size() > 30) {
            com.fyber.inneractive.sdk.util.d1 d1Var = fVar.f24216d;
            if (d1Var != null && d1Var.hasMessages(12312329)) {
                fVar.f24216d.removeMessages(12312329);
            }
            com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.f24216d;
            if (d1Var2 != null) {
                d1Var2.post(new c(fVar, 12312329, 0L));
            }
        }
    }
}
