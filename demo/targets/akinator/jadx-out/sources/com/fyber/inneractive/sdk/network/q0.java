package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import b0.e2;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3500ve;
import com.ironsource.Q6;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q0 extends t0 implements o {

    /* renamed from: p, reason: collision with root package name */
    public final InneractiveAdRequest f24267p;

    /* renamed from: q, reason: collision with root package name */
    public HashMap f24268q;

    /* renamed from: r, reason: collision with root package name */
    public StringBuffer f24269r;

    /* renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.d f24270s;

    /* renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.j f24271t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24272u;

    /* renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.timeouts.request.a f24273v;

    public q0(q qVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(rVar);
        super(qVar, g0.f24226c.a(), rVar);
        this.f24271t = null;
        this.f24272u = false;
        this.f24296o = true;
        this.f24267p = inneractiveAdRequest;
        this.f24270s = cVar;
        if (inneractiveAdRequest != null) {
            String strA = com.fyber.inneractive.sdk.util.n1.a(inneractiveAdRequest.getSpotId());
            String mediationName = inneractiveAdRequest.getMediationName();
            com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
            this.f24273v = TextUtils.isEmpty(mediationName) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(jVar, strA) : new com.fyber.inneractive.sdk.network.timeouts.request.d(strA, jVar, mediationName);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final StringBuffer a() {
        return this.f24269r;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final Map b() {
        return this.f24268q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j10) {
        super.c(j10);
        IAlog.a("%s : NetworkRequestAd : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestAd cancel by timeout - resolve request with no fill", IAlog.a(this));
        this.f24282a = true;
        a((Object) null, (Exception) new k1("no fill", 204), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() throws JSONException {
        JSONArray jSONArrayA;
        byte[] bytes = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            com.fyber.inneractive.sdk.config.global.r rVar = ((com.fyber.inneractive.sdk.serverapi.c) this.f24270s).f26685a;
            if (rVar != null) {
                jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.f23309b, true);
                IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
            } else {
                jSONArrayA = null;
            }
            if (jSONArrayA != null && jSONArrayA.length() > 0) {
                jSONObject2.put(C3500ve.f39133d, jSONArrayA);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType unitDisplayTypeA = com.fyber.inneractive.sdk.serverapi.b.a(this.f24267p.getSpotId());
            IAConfigManager iAConfigManager = IAConfigManager.O;
            JSONArray jSONArrayA2 = iAConfigManager.f23229x.a(unitDisplayTypeA);
            if (jSONArrayA2 != null && jSONArrayA2.length() > 0) {
                jSONObject.put("user_sessions", jSONArrayA2);
            }
            int iA = iAConfigManager.f23226u.f23394b.a("dv_enabled_v3", 0, 0);
            if (unitDisplayTypeA != null && iA == 1) {
                com.fyber.inneractive.sdk.dv.j jVarA = iAConfigManager.G.a(unitDisplayTypeA);
                this.f24271t = jVarA;
                if (jVarA != null) {
                    jSONObject.put("gdem_signal", jVarA.f23457a.getQuery());
                }
            }
            com.fyber.inneractive.sdk.topics.b bVar = iAConfigManager.F;
            if (bVar != null && IAConfigManager.f()) {
                Object objB = bVar.b();
                if (objB != null) {
                    jSONObject.put("topics", objB);
                }
                Object objA = bVar.a();
                if (objA != null) {
                    jSONObject.put("encrypted_topics", objA);
                }
            }
            String string = jSONObject.toString();
            bytes = string.getBytes(StandardCharsets.UTF_8);
            IAlog.a("request json body - %s", string);
            IAlog.d("request json body - %s", string);
            return bytes;
        } catch (Exception unused) {
            IAlog.a("Failed building body for ad request!", new Object[0]);
            return bytes;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        return q();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final Map l() {
        int i10 = com.fyber.inneractive.sdk.config.k.f23321a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap mapS = e2.s("mockadnetworkresponseid", property);
        IAlog.a("NetworkRequestAd: Adding mock response header - %s", property);
        return mapS;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f24273v;
        return new l1(aVar.f24306i, aVar.f24305h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.f24273v.f24302f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    @Override // com.fyber.inneractive.sdk.network.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l r6, java.util.Map r7, int r8) throws com.fyber.inneractive.sdk.network.n0 {
        /*
            r5 = this;
            r8 = 0
            if (r7 == 0) goto L3e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L10
            java.lang.Object r3 = r7.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L10
            int r4 = r3.size()
            if (r4 <= 0) goto L10
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r4)
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r2, r3)
            goto L10
        L3c:
            r5.f24268q = r0
        L3e:
            r7 = 0
            if (r6 != 0) goto L43
            r6 = r7
            goto L45
        L43:
            java.io.InputStream r6 = r6.f24239c
        L45:
            long r0 = java.lang.System.currentTimeMillis()
            super.d(r0)
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.a(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%s : NetworkRequestAd : set start read timestamp"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)
            if (r6 == 0) goto L6b
            java.lang.StringBuffer r6 = com.fyber.inneractive.sdk.util.v.b(r6)     // Catch: java.lang.Exception -> L60
            goto L69
        L60:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "failed create response builder in network request ad"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r6, r0)
            r6 = r7
        L69:
            r5.f24269r = r6
        L6b:
            long r0 = java.lang.System.currentTimeMillis()
            r5.b(r0)
            com.fyber.inneractive.sdk.network.o0 r6 = new com.fyber.inneractive.sdk.network.o0
            r6.<init>()
            java.util.HashMap r0 = r5.f24268q     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L9a
            com.fyber.inneractive.sdk.network.n r1 = com.fyber.inneractive.sdk.network.n.RETURNED_AD_TYPE     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = r1.key     // Catch: java.lang.Exception -> L98
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = r1.toLowerCase(r2)     // Catch: java.lang.Exception -> L98
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L98
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L98
            if (r1 != 0) goto L9a
            boolean r1 = android.text.TextUtils.isDigitsOnly(r0)     // Catch: java.lang.Exception -> L98
            if (r1 == 0) goto L9a
            goto L9b
        L98:
            r6 = move-exception
            goto Lac
        L9a:
            r0 = r7
        L9b:
            if (r0 == 0) goto La2
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L98
            goto La3
        La2:
            r0 = 6
        La3:
            com.fyber.inneractive.sdk.dv.j r1 = r5.f24271t     // Catch: java.lang.Exception -> L98
            com.fyber.inneractive.sdk.response.e r7 = r5.a(r0, r5, r7, r1)     // Catch: java.lang.Exception -> L98
            r6.f24261a = r7     // Catch: java.lang.Exception -> L98
            return r6
        Lac:
            long r0 = java.lang.System.currentTimeMillis()
            r5.b(r0)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = "failed parse ad network request"
            com.fyber.inneractive.sdk.util.IAlog.a(r8, r6, r7)
            com.fyber.inneractive.sdk.network.n0 r7 = new com.fyber.inneractive.sdk.network.n0
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.q0.a(com.fyber.inneractive.sdk.network.l, java.util.Map, int):com.fyber.inneractive.sdk.network.o0");
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j10) {
        super.b(j10);
        IAlog.a("%s : NetworkRequestAd : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        String str;
        String str2;
        int i10 = com.fyber.inneractive.sdk.config.k.f23321a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String strL = TextUtils.isEmpty(property) ? DtbConstants.HTTPS + IAConfigManager.O.f23214i.f23326e : Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(property).matches() ? a.b.l(DtbConstants.HTTPS, property, "/simpleM2M/clientRequestEnhancedXmlAd") : a.b.l(DtbConstants.HTTPS, property, ".inner-active.mobi/simpleM2M/clientRequestEnhancedXmlAd");
        InneractiveAdRequest inneractiveAdRequest = this.f24267p;
        com.fyber.inneractive.sdk.serverapi.d dVar = this.f24270s;
        r0 r0Var = new r0(inneractiveAdRequest, dVar);
        r0Var.f24275a = new HashMap();
        r0Var.a("fromSDK", Boolean.toString(true));
        r0Var.a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        r0Var.a("secure", !com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.O.f23222q ? "1" : "0");
        r0Var.a(SFPXhf.eoNbYUovaiW, inneractiveAdRequest.getSpotId());
        String property2 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property2 == null) {
            property2 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f23343a;
        }
        r0Var.a("uid", property2);
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (TextUtils.isEmpty(iAConfigManager.f23219n)) {
            r0Var.a("med", iAConfigManager.f23217l);
        } else {
            r0Var.a("med", iAConfigManager.f23217l + LJjmO.hmHAavjuE + iAConfigManager.f23219n);
        }
        dVar.getClass();
        r0Var.a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        com.fyber.inneractive.sdk.serverapi.c cVar = (com.fyber.inneractive.sdk.serverapi.c) dVar;
        List list = com.fyber.inneractive.sdk.serverapi.c.f26684d;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf((Integer) it.next()));
            }
            r0Var.a("protocols", com.fyber.inneractive.sdk.util.o.a(arrayList));
        }
        List list2 = com.fyber.inneractive.sdk.serverapi.c.f26683c;
        if (!list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf((Integer) it2.next()));
            }
            r0Var.a("api", com.fyber.inneractive.sdk.util.o.a(arrayList2));
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("zip", iAConfigManager.f23215j.getZipCode());
        }
        r0Var.a("a", Integer.toString(iAConfigManager.f23215j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f23215j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            r0Var.a("g", "m");
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            r0Var.a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        r0Var.a(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, Long.toString(System.currentTimeMillis()));
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.4.0");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        r0Var.a(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, sb2.toString());
        Boolean boolD = iAConfigManager.D.d();
        if (boolD != null) {
            r0Var.a("gdpr_privacy_consent", boolD.booleanValue() ? "1" : "0");
        }
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.D;
        if (gVar != null) {
            Boolean bool = com.fyber.inneractive.sdk.util.o.f26796a == null ? null : gVar.f23271i;
            if (bool != null) {
                r0Var.a("lgpd_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = iAConfigManager.D.f23272j;
            if (bool2 != null && bool2.booleanValue()) {
                r0Var.a("coppaApplies", "1");
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String property3 = System.getProperty("ia.testEnvironmentConfiguration.device");
            com.fyber.inneractive.sdk.config.w wVar = com.fyber.inneractive.sdk.config.u.f23410a;
            com.fyber.inneractive.sdk.config.v vVar = wVar.f23418b;
            String str3 = vVar != null ? vVar.f23416c : false ? "amazonId" : "aaid";
            if (TextUtils.isEmpty(property3)) {
                com.fyber.inneractive.sdk.config.v vVar2 = wVar.f23418b;
                property3 = vVar2 != null ? vVar2.f23414a : null;
            }
            r0Var.a(str3, property3);
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            com.fyber.inneractive.sdk.config.v vVar3 = com.fyber.inneractive.sdk.config.u.f23410a.f23418b;
            r0Var.a("dnt", Boolean.toString(vVar3 != null ? vVar3.f23415b : false));
        }
        r0Var.a("dml", com.fyber.inneractive.sdk.util.k.j());
        int iC = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        int iC2 = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        if (iC > 0 && iC2 > 0) {
            r0Var.a("w", Integer.toString(iC));
            r0Var.a(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, Integer.toString(iC2));
        }
        int iC3 = com.fyber.inneractive.sdk.util.o.c();
        r0Var.a("o", iC3 == 1 ? "p" : iC3 == 2 ? "l" : ApsMetricsDataMap.APSMETRICS_FIELD_URL);
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("ciso", com.fyber.inneractive.sdk.util.k.i());
            String str4 = cVar.f26686b;
            r0Var.a("mcc", str4 == null ? "" : str4.substring(0, Math.min(3, str4.length())));
            String str5 = cVar.f26686b;
            r0Var.a("mnc", str5 == null ? "" : str5.substring(Math.min(3, str5.length())));
            com.fyber.inneractive.sdk.util.z0 z0VarA = com.fyber.inneractive.sdk.util.z0.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", z0VarA, z0VarA.b());
            r0Var.a("nt", z0VarA.b());
            r0Var.a("crn", cVar.a());
        }
        r0Var.a("os", "Android");
        r0Var.a("lng", iAConfigManager.f23220o);
        ArrayList arrayList3 = iAConfigManager.f23221p;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            r0Var.a("in_lng", com.fyber.inneractive.sdk.util.o.a(arrayList3));
        }
        r0Var.a("bid", com.fyber.inneractive.sdk.util.o.f26796a.getPackageName());
        r0Var.a("appv", com.fyber.inneractive.sdk.util.k.l());
        com.fyber.inneractive.sdk.config.g gVar2 = iAConfigManager.D;
        if (gVar2.f23266d == null) {
            gVar2.f23267e = gVar2.h();
        }
        if (com.fyber.inneractive.sdk.util.o.f26796a == null) {
            str = null;
        } else {
            str = gVar2.f23266d;
            if (str == null) {
                str = gVar2.f23267e;
            }
        }
        r0Var.a("gdpr_consent_data", str);
        com.fyber.inneractive.sdk.config.g gVar3 = iAConfigManager.D;
        if (com.fyber.inneractive.sdk.util.o.f26796a == null) {
            gVar3.getClass();
            str2 = null;
        } else {
            str2 = gVar3.f23270h;
        }
        r0Var.a(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, str2);
        r0Var.a("mute_video", Boolean.toString(iAConfigManager.f23216k));
        r0Var.a(Q6.G, Build.VERSION.RELEASE);
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f23993p;
        r0Var.a("ignitep", lVar != null ? lVar.f88175a.d() : null);
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f23993p;
        r0Var.a("ignitev", lVar2 != null ? lVar2.f88175a.i() : null);
        HashMap map = new HashMap();
        cVar.a(inneractiveAdRequest.getSpotId(), map);
        for (Map.Entry entry : map.entrySet()) {
            r0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("childMode", "1");
        }
        com.fyber.inneractive.sdk.ignite.l lVar3 = IAConfigManager.O.E.f23993p;
        r0Var.a("odt", lVar3 != null ? lVar3.getOdt() : "");
        String strA = com.fyber.inneractive.sdk.util.f1.a(strL, r0Var.f24275a);
        if (!this.f24272u) {
            IAlog.d("%s %s", "AD_REQUEST", strA);
            this.f24272u = true;
        }
        return strA;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s: NetworkRequestAd Ad request execution started, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(p().f24250a), Integer.valueOf(p().f24251b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j10) {
        super.a(j10);
        IAlog.a("%s : NetworkRequestAd : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }
}
