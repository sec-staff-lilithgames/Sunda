package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import b0.e2;
import com.ironsource.B7;
import com.ironsource.C3153c2;
import com.ironsource.C3161ca;
import com.ironsource.C3225g2;
import com.ironsource.C3271ic;
import com.ironsource.C3286ja;
import com.ironsource.C3352n2;
import com.ironsource.C3422r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.Mb;
import com.ironsource.Q6;
import com.ironsource.V1;
import com.ironsource.V9;
import com.ironsource.W0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f37316c = "auctionId";

    /* renamed from: d, reason: collision with root package name */
    public static final String f37317d = "armData";

    /* renamed from: e, reason: collision with root package name */
    public static final String f37318e = "larmData";

    /* renamed from: f, reason: collision with root package name */
    public static final String f37319f = "isAdUnitCapped";

    /* renamed from: g, reason: collision with root package name */
    public static final String f37320g = "settings";

    /* renamed from: h, reason: collision with root package name */
    public static final String f37321h = "waterfall";

    /* renamed from: i, reason: collision with root package name */
    public static final String f37322i = "genericParams";

    /* renamed from: j, reason: collision with root package name */
    public static final String f37323j = "configurations";

    /* renamed from: k, reason: collision with root package name */
    public static final String f37324k = "instances";

    /* renamed from: l, reason: collision with root package name */
    public static final String f37325l = "${AUCTION_LOSS}";

    /* renamed from: m, reason: collision with root package name */
    public static final String f37326m = "${AUCTION_MBR}";

    /* renamed from: n, reason: collision with root package name */
    public static final String f37327n = "${AUCTION_PRICE}";

    /* renamed from: o, reason: collision with root package name */
    public static final String f37328o = "${DYNAMIC_DEMAND_SOURCE}";

    /* renamed from: p, reason: collision with root package name */
    public static final String f37329p = "${INSTANCE}";

    /* renamed from: q, reason: collision with root package name */
    public static final String f37330q = "${INSTANCE_TYPE}";

    /* renamed from: r, reason: collision with root package name */
    public static final String f37331r = "${PLACEMENT_NAME}";

    /* renamed from: s, reason: collision with root package name */
    private static final String f37332s = "adMarkup";

    /* renamed from: t, reason: collision with root package name */
    private static final String f37333t = "dynamicDemandSource";

    /* renamed from: u, reason: collision with root package name */
    private static final String f37334u = "params";

    /* renamed from: v, reason: collision with root package name */
    public static final String f37335v = "dlpl";

    /* renamed from: w, reason: collision with root package name */
    public static final String f37336w = "adUnit";

    /* renamed from: x, reason: collision with root package name */
    public static final String f37337x = "parallelLoad";

    /* renamed from: y, reason: collision with root package name */
    public static final String f37338y = "bidderExclusive";

    /* renamed from: z, reason: collision with root package name */
    public static final String f37339z = "showPriorityEnabled";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f37340a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final B7 f37341b = Mb.U().i();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f37342a;

        /* renamed from: b, reason: collision with root package name */
        private List<C3352n2> f37343b;

        /* renamed from: c, reason: collision with root package name */
        private C3352n2 f37344c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f37345d;

        /* renamed from: e, reason: collision with root package name */
        private JSONObject f37346e;

        /* renamed from: f, reason: collision with root package name */
        private int f37347f;

        /* renamed from: g, reason: collision with root package name */
        private String f37348g;

        /* renamed from: h, reason: collision with root package name */
        private V1 f37349h;

        public a(String str) {
            this.f37342a = str;
        }

        public String a() {
            return this.f37342a;
        }

        public JSONObject b() {
            return this.f37346e;
        }

        public int c() {
            return this.f37347f;
        }

        public String d() {
            return this.f37348g;
        }

        public C3352n2 e() {
            return this.f37344c;
        }

        public JSONObject f() {
            return this.f37345d;
        }

        public V1 g() {
            return this.f37349h;
        }

        public List<C3352n2> h() {
            return this.f37343b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            V1 v12 = this.f37349h;
            if (v12 != null) {
                return v12.a(str);
            }
            return new p.b();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements Runnable {

        /* renamed from: d, reason: collision with root package name */
        private static final int f37350d = 15000;

        /* renamed from: a, reason: collision with root package name */
        private String f37351a;

        /* renamed from: b, reason: collision with root package name */
        private String f37352b;

        /* renamed from: c, reason: collision with root package name */
        private String f37353c;

        public b(String str, String str2, String str3) {
            this.f37351a = str;
            this.f37352b = str2;
            this.f37353c = str3;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException, IOException {
            String str = this.f37351a + ";" + this.f37352b + ";" + this.f37353c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f37353c).openConnection();
                httpURLConnection.setRequestMethod(C3271ic.f36943a);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                Mb.U().q().a(new C5(responseCode == 200 || responseCode == 204 ? D5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : D5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, responseCode).put("reason", responseMessage)));
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                StringBuilder sb2 = new StringBuilder("Send auction url failed with params - ");
                sb2.append(str);
                sb2.append(";");
                IronLog.INTERNAL.error(e2.l(e10, sb2));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f37344c = new C3352n2(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(f37317d) ? jSONObject2.optJSONObject(f37317d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f37345d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f37346e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f37324k)) {
                aVar.f37349h = new V1.a(jSONObject2.optJSONObject(f37324k));
            }
        }
        aVar.f37343b = new ArrayList();
        if (jSONObject.has(f37321h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f37321h);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C3352n2 c3352n2 = new C3352n2(jSONArray.getJSONObject(i10), i10, jSONObjectOptJSONObject);
                if (!c3352n2.m()) {
                    aVar.f37347f = 1002;
                    aVar.f37348g = "waterfall " + i10;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f37343b.add(c3352n2);
            }
        }
        return aVar;
    }

    public String c(String str) throws JSONException {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str) && C3286ja.a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("params")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("parameters = " + jSONObject2);
                    if (jSONObject2.has("dynamicDemandSource")) {
                        string = jSONObject2.getString("dynamicDemandSource");
                        ironLog.verbose("demand source = " + string);
                        return string;
                    }
                }
            }
            return "";
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return string;
        }
    }

    public Map<String, String> b(String str) throws JSONException {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
            return map;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return map;
        }
    }

    private c a() {
        c cVar = c.SECURE;
        return Build.VERSION.SDK_INT >= 28 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar : (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    public JSONObject a(i iVar) throws JSONException {
        IronSource.a aVar;
        boolean z10;
        List<String> list;
        IronSource.a aVarC = iVar.c();
        boolean zT = iVar.t();
        Map<String, Object> mapH = iVar.h();
        List<String> listL = iVar.l();
        h hVarE = iVar.e();
        int iO = iVar.o();
        ISBannerSize iSBannerSizeF = iVar.f();
        C3161ca c3161caN = iVar.n();
        boolean zP = iVar.p();
        boolean zQ = iVar.q();
        ArrayList<C3225g2> arrayListK = iVar.k();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            aVar = aVarC;
            z10 = zT;
            String strA = "";
            list = listL;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ISBannerSize iSBannerSize = iSBannerSizeF;
            JSONObject jSONObject3 = new JSONObject();
            C3161ca c3161ca = c3161caN;
            jSONObject3.put(Q6.f35312x0, 2);
            jSONObject3.put(Q6.f35285o0, new JSONObject((Map) mapH.get(next)));
            if (hVarE != null) {
                strA = hVarE.a(next);
            }
            jSONObject3.put(Q6.A0, strA);
            jSONObject3.put("ts", zQ ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            aVarC = aVar;
            zT = z10 ? 1 : 0;
            listL = list;
            iSBannerSizeF = iSBannerSize;
            c3161caN = c3161ca;
        }
        ISBannerSize iSBannerSize2 = iSBannerSizeF;
        C3161ca c3161ca2 = c3161caN;
        int i10 = 2;
        for (String str : list) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(Q6.f35312x0, 1);
            jSONObject4.put(Q6.A0, hVarE != null ? hVarE.a(str) : "");
            jSONObject2.put(str, jSONObject4);
        }
        Iterator<C3225g2> it2 = arrayListK.iterator();
        while (it2.hasNext()) {
            C3225g2 next2 = it2.next();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(Q6.f35312x0, next2.e() ? i10 : 1);
            Map<String, Object> mapF = next2.f();
            if (!mapF.isEmpty()) {
                jSONObject5.put(Q6.f35285o0, new JSONObject(mapF));
            }
            jSONObject5.put(Q6.A0, hVarE != null ? hVarE.a(next2.g()) : "");
            jSONObject5.put("ts", zQ ? 1 : 0);
            if (!next2.h().isEmpty()) {
                jSONObject5.put(f37335v, next2.h());
            }
            jSONObject2.put(next2.g(), jSONObject5);
            i10 = 2;
        }
        jSONObject.put(Q6.f35309w0, jSONObject2);
        if (iVar.v()) {
            jSONObject.put(Q6.f35310w1, 1);
        }
        if (iVar.s()) {
            jSONObject.put("do", 1);
        }
        new V9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new C3153c2(W0.a(aVar)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(Q6.f35315y0, iO);
        jSONObjectA.put(Q6.f35318z0, a().ordinal());
        if (c3161ca2 != null) {
            jSONObjectA.put(Q6.f35268i1, c3161ca2.i());
        }
        jSONObject.put(Q6.f35300t0, jSONObjectA);
        if (iSBannerSize2 != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(Q6.f35291q0, iSBannerSize2.getDescription());
            jSONObject6.put(Q6.f35297s0, iSBannerSize2.getWidth());
            jSONObject6.put(Q6.f35294r0, iSBannerSize2.getHeight());
            jSONObject.put(Q6.f35288p0, jSONObject6);
        }
        jSONObject.put(Q6.f35273k0, aVar.toString());
        if (iVar.b() != null) {
            jSONObject.put("adf", iVar.b());
        }
        if (iVar.d() != null) {
            jSONObject.put("mediationAdUnitId", iVar.d());
        }
        if (iVar.u() != null) {
            jSONObject.put(Q6.f35282n0, iVar.u());
        }
        jSONObject.put(Q6.f35303u0, !z10 ? 1 : 0);
        if (iVar.g() != null) {
            jSONObject.put(Q6.f35298s1, new JSONObject().put(Q6.f35301t1, iVar.g()));
        } else {
            Object objRemove = jSONObjectA.remove(Q6.f35298s1);
            if (objRemove != null) {
                jSONObject.put(Q6.f35298s1, objRemove);
            }
        }
        if (zP) {
            jSONObject.put(Q6.f35292q1, 1);
        }
        return jSONObject;
    }

    public String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f37327n, str4).replace(f37325l, str6).replace(f37326m, str5).replace(f37329p, str2).replace(f37330q, Integer.toString(i10)).replace(f37328o, str3).replace(f37331r, str7);
    }

    public String a(String str, int i10, C3352n2 c3352n2, String str2, String str3, String str4) throws NumberFormatException {
        String strI = c3352n2.i();
        return a(str, c3352n2.c(), i10, b().c(c3352n2.k()), strI, b().a(strI, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
        return str;
    }

    private String a(String str, String str2) throws NumberFormatException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d10 = Double.parseDouble(str);
        return Double.parseDouble(str2) == 0.0d ? "" : String.valueOf(Math.round((d10 / r7) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(Q6.f35274k1)) || !this.f37340a.compareAndSet(false, true)) {
            return;
        }
        Mb.U().q().a(new C5(D5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z10, true, -1)));
    }
}
