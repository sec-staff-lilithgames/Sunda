package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[PHI: r18
      0x0065: PHI (r18v9 java.lang.String) = (r18v1 java.lang.String), (r18v11 java.lang.String) binds: [B:24:0x0082, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:3:0x0028, B:5:0x0034, B:10:0x003e, B:12:0x004a, B:42:0x00be, B:44:0x00c4, B:51:0x00e0, B:53:0x00e6, B:55:0x00eb, B:58:0x010e, B:60:0x0114, B:67:0x0143, B:69:0x0147, B:70:0x014a, B:71:0x014e, B:73:0x0154, B:76:0x015d, B:78:0x01a4, B:80:0x01eb, B:82:0x01f5, B:84:0x0208, B:85:0x0211, B:87:0x0224, B:89:0x0233, B:90:0x0240, B:93:0x024c, B:96:0x027b, B:98:0x0281, B:100:0x0287, B:101:0x02a5, B:102:0x02b0, B:104:0x02ba, B:106:0x02c0, B:109:0x02f3, B:111:0x02fb, B:113:0x0301, B:114:0x031f, B:115:0x032a, B:117:0x0332, B:119:0x0338, B:120:0x0356, B:121:0x0361, B:123:0x0369, B:125:0x036f, B:126:0x038d, B:127:0x0398, B:130:0x03ad, B:132:0x03b7, B:133:0x03bd, B:134:0x03c2, B:136:0x03c8, B:138:0x03d6, B:141:0x03e6, B:143:0x03ec, B:150:0x0434, B:152:0x043e, B:155:0x044a, B:157:0x0450, B:158:0x0469, B:159:0x046d, B:161:0x0473, B:162:0x048c, B:163:0x048f, B:165:0x0499, B:167:0x04a8, B:168:0x04c8, B:169:0x04d1, B:172:0x04da, B:174:0x04e0, B:180:0x051f, B:184:0x052b, B:186:0x0543, B:189:0x056b, B:191:0x0571, B:193:0x0596, B:195:0x059a, B:197:0x05aa, B:198:0x05af, B:200:0x05b9, B:201:0x05c2, B:203:0x05c8, B:204:0x05d5, B:206:0x05f3, B:208:0x05fa, B:209:0x0607, B:211:0x0611, B:212:0x061a, B:214:0x0622, B:216:0x0629, B:217:0x0636, B:219:0x0640, B:220:0x0649, B:221:0x0656, B:223:0x065e, B:227:0x0671, B:230:0x067f, B:232:0x06a5, B:234:0x06ab, B:236:0x06b0, B:235:0x06ae, B:237:0x06b7, B:239:0x06bf, B:241:0x06c5, B:243:0x06ca, B:242:0x06c8, B:244:0x06d1, B:247:0x06db, B:249:0x06e3, B:250:0x06eb, B:252:0x06fb, B:254:0x0701, B:256:0x0706, B:258:0x0715, B:260:0x071b, B:262:0x0720, B:266:0x0732, B:270:0x0752, B:272:0x075b, B:275:0x0773, B:277:0x077f, B:283:0x078e, B:285:0x079a, B:287:0x07a4, B:293:0x07bb, B:295:0x07ce, B:297:0x07d4, B:299:0x07d9, B:298:0x07d7, B:294:0x07c5, B:288:0x07ad, B:290:0x07b3, B:309:0x0814, B:300:0x07e1, B:302:0x07ef, B:304:0x0802, B:306:0x0808, B:308:0x080d, B:307:0x080b, B:303:0x07f9, B:273:0x0761, B:269:0x074e, B:261:0x071e, B:255:0x0704, B:192:0x058f, B:188:0x0563, B:175:0x04f9, B:176:0x04fd, B:178:0x0503, B:179:0x051c, B:144:0x0407, B:145:0x040d, B:147:0x0415, B:148:0x042e, B:107:0x02e1, B:94:0x026c, B:86:0x021b, B:79:0x01da, B:45:0x00cc, B:47:0x00d2, B:50:0x00dd, B:48:0x00d7, B:23:0x0078, B:27:0x008c, B:30:0x0097, B:32:0x009d, B:35:0x00a8, B:37:0x00ae, B:33:0x00a2, B:39:0x00b4, B:22:0x006f, B:13:0x0051, B:15:0x0057, B:62:0x0122, B:64:0x013d), top: B:318:0x0028, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:3:0x0028, B:5:0x0034, B:10:0x003e, B:12:0x004a, B:42:0x00be, B:44:0x00c4, B:51:0x00e0, B:53:0x00e6, B:55:0x00eb, B:58:0x010e, B:60:0x0114, B:67:0x0143, B:69:0x0147, B:70:0x014a, B:71:0x014e, B:73:0x0154, B:76:0x015d, B:78:0x01a4, B:80:0x01eb, B:82:0x01f5, B:84:0x0208, B:85:0x0211, B:87:0x0224, B:89:0x0233, B:90:0x0240, B:93:0x024c, B:96:0x027b, B:98:0x0281, B:100:0x0287, B:101:0x02a5, B:102:0x02b0, B:104:0x02ba, B:106:0x02c0, B:109:0x02f3, B:111:0x02fb, B:113:0x0301, B:114:0x031f, B:115:0x032a, B:117:0x0332, B:119:0x0338, B:120:0x0356, B:121:0x0361, B:123:0x0369, B:125:0x036f, B:126:0x038d, B:127:0x0398, B:130:0x03ad, B:132:0x03b7, B:133:0x03bd, B:134:0x03c2, B:136:0x03c8, B:138:0x03d6, B:141:0x03e6, B:143:0x03ec, B:150:0x0434, B:152:0x043e, B:155:0x044a, B:157:0x0450, B:158:0x0469, B:159:0x046d, B:161:0x0473, B:162:0x048c, B:163:0x048f, B:165:0x0499, B:167:0x04a8, B:168:0x04c8, B:169:0x04d1, B:172:0x04da, B:174:0x04e0, B:180:0x051f, B:184:0x052b, B:186:0x0543, B:189:0x056b, B:191:0x0571, B:193:0x0596, B:195:0x059a, B:197:0x05aa, B:198:0x05af, B:200:0x05b9, B:201:0x05c2, B:203:0x05c8, B:204:0x05d5, B:206:0x05f3, B:208:0x05fa, B:209:0x0607, B:211:0x0611, B:212:0x061a, B:214:0x0622, B:216:0x0629, B:217:0x0636, B:219:0x0640, B:220:0x0649, B:221:0x0656, B:223:0x065e, B:227:0x0671, B:230:0x067f, B:232:0x06a5, B:234:0x06ab, B:236:0x06b0, B:235:0x06ae, B:237:0x06b7, B:239:0x06bf, B:241:0x06c5, B:243:0x06ca, B:242:0x06c8, B:244:0x06d1, B:247:0x06db, B:249:0x06e3, B:250:0x06eb, B:252:0x06fb, B:254:0x0701, B:256:0x0706, B:258:0x0715, B:260:0x071b, B:262:0x0720, B:266:0x0732, B:270:0x0752, B:272:0x075b, B:275:0x0773, B:277:0x077f, B:283:0x078e, B:285:0x079a, B:287:0x07a4, B:293:0x07bb, B:295:0x07ce, B:297:0x07d4, B:299:0x07d9, B:298:0x07d7, B:294:0x07c5, B:288:0x07ad, B:290:0x07b3, B:309:0x0814, B:300:0x07e1, B:302:0x07ef, B:304:0x0802, B:306:0x0808, B:308:0x080d, B:307:0x080b, B:303:0x07f9, B:273:0x0761, B:269:0x074e, B:261:0x071e, B:255:0x0704, B:192:0x058f, B:188:0x0563, B:175:0x04f9, B:176:0x04fd, B:178:0x0503, B:179:0x051c, B:144:0x0407, B:145:0x040d, B:147:0x0415, B:148:0x042e, B:107:0x02e1, B:94:0x026c, B:86:0x021b, B:79:0x01da, B:45:0x00cc, B:47:0x00d2, B:50:0x00dd, B:48:0x00d7, B:23:0x0078, B:27:0x008c, B:30:0x0097, B:32:0x009d, B:35:0x00a8, B:37:0x00ae, B:33:0x00a2, B:39:0x00b4, B:22:0x006f, B:13:0x0051, B:15:0x0057, B:62:0x0122, B:64:0x013d), top: B:318:0x0028, inners: #2, #3 }] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.mbridge.msdk.foundation.same.report.metrics.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.String> c(java.lang.String r24, com.mbridge.msdk.foundation.same.report.metrics.c r25) {
        /*
            Method dump skipped, instructions count: 2129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.metrics.f.c(java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):java.util.Map");
    }

    private Map<String, String> d(String str, c cVar) {
        return (cVar == null || TextUtils.isEmpty(str)) ? new HashMap() : cVar.c(str);
    }

    private Map<String, String> e(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000126")));
            } else if (str.equals("2000047") || str.equals("2000048")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000130")));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void a(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> mapE;
        HashMap map = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.j(str);
            Map<String, String> mapC = c(str, cVar);
            if (mapC != null) {
                map.putAll(mapC);
            }
            Map<String, String> mapA = a(str, cVar.w(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            if (Arrays.asList(b.f40959d).contains(str) && (mapE = e(str, cVar)) != null) {
                map.putAll(mapE);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            if (!map.containsKey("lrid") || TextUtils.isEmpty((CharSequence) map.get("lrid"))) {
                map.put("lrid", cVar.o());
            }
            if (map.containsKey("lrid")) {
                String str2 = (String) map.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    map.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (map.containsKey("n_lrid")) {
                String str3 = (String) map.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    map.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> mapD = d(str, cVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            String str4 = "1";
            if (cVar.c() == null || !cVar.c().equals("1") || !Arrays.asList(b.f40957b).contains(str) || cVar.a() == 296) {
                if (Arrays.asList(b.f40968m).contains(str)) {
                    map.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str4 = "0";
                    }
                    map.put("local_dns_available", str4);
                }
                com.mbridge.msdk.tracker.e eVarA = a(str, map);
                if (mVar != null && eVarA != null) {
                    mVar.d(eVarA);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap map = new HashMap();
            cVar.j(str);
            Map<String, String> mapA = a(str, cVar.w(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            Map<String, String> mapD = d(str, cVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            com.mbridge.msdk.tracker.e eVarA = a(str, map);
            if (mVar != null && eVarA != null) {
                mVar.d(eVarA);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Map<String, String> b(String str, c cVar) {
        HashMap map = new HashMap();
        if (cVar == null) {
            return map;
        }
        return cVar.a(cVar.o() + str);
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) throws JSONException {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean boolA = com.mbridge.msdk.foundation.same.b.b().a();
            if (boolA != null) {
                jSONObject.put("r_v_r", boolA.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
            return eVar;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return eVar;
        }
    }

    private Map<String, String> a(String str, String str2, m mVar) throws JSONException {
        e eVar = new e();
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD == null) {
                gVarD = h.b().a();
            }
            if (!TextUtils.isEmpty(gVarD.k0())) {
                eVar.a("as_rid", gVarD.k0());
            }
            String strJ = gVarD.J();
            JSONArray jSONArrayI = gVarD.I();
            if (jSONArrayI != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jSONArrayI.length()) {
                        break;
                    }
                    if (str.equals(jSONArrayI.getString(i10))) {
                        strJ = APSAnalytics.DEFAULT_SDK_VERSION;
                        break;
                    }
                    i10++;
                }
            }
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("log_rate", strJ);
            } else {
                eVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                l lVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b(), str2);
                if (lVarD != null && !TextUtils.isEmpty(lVarD.I())) {
                    eVar.a("us_rid", lVarD.I());
                }
                if (lVarD != null && !TextUtils.isEmpty(lVarD.a())) {
                    eVar.a("u_stid", lVarD.a());
                }
                e eVarC = d.b().c(str2);
                if (eVarC != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", eVarC.b("r_stid"));
                            eVarC.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(eVarC);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:25:0x0057, B:27:0x005d, B:30:0x0068, B:32:0x006e, B:28:0x0062, B:33:0x0072, B:35:0x0078, B:36:0x0080, B:38:0x0086, B:41:0x0091, B:43:0x0097, B:39:0x008b, B:15:0x0041, B:17:0x0045, B:19:0x004c, B:21:0x0050), top: B:49:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:25:0x0057, B:27:0x005d, B:30:0x0068, B:32:0x006e, B:28:0x0062, B:33:0x0072, B:35:0x0078, B:36:0x0080, B:38:0x0086, B:41:0x0091, B:43:0x0097, B:39:0x008b, B:15:0x0041, B:17:0x0045, B:19:0x004c, B:21:0x0050), top: B:49:0x0007, inners: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:22:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0050 -> B:22:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> a(com.mbridge.msdk.foundation.same.report.metrics.c r4, java.lang.String r5) throws java.lang.NumberFormatException {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3d
            r1.<init>()     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r4.o()     // Catch: java.lang.Exception -> L3d
            r1.append(r2)     // Catch: java.lang.Exception -> L3d
            r1.append(r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L3d
            java.util.Map r1 = r4.r()     // Catch: java.lang.Exception -> L3d
            if (r1 == 0) goto L53
            boolean r2 = r1.containsKey(r5)     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L53
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            java.lang.String r1 = "resource_type"
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            if (r1 == 0) goto L41
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            goto L54
        L3d:
            r4 = move-exception
            goto L9b
        L3f:
            r5 = move-exception
            goto L4c
        L41:
            boolean r1 = r5 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            if (r1 == 0) goto L53
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            goto L54
        L4c:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L3d
            if (r1 == 0) goto L53
            r5.printStackTrace()     // Catch: java.lang.Exception -> L3d
        L53:
            r5 = -1
        L54:
            r1 = 1
            if (r5 != r1) goto L72
            java.util.List r5 = r4.j()     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L62
            java.util.List r4 = r4.j()     // Catch: java.lang.Exception -> L3d
            goto L66
        L62:
            java.util.List r4 = r4.g()     // Catch: java.lang.Exception -> L3d
        L66:
            if (r4 == 0) goto La2
            int r5 = r4.size()     // Catch: java.lang.Exception -> L3d
            if (r5 <= 0) goto La2
            r0.addAll(r4)     // Catch: java.lang.Exception -> L3d
            goto La2
        L72:
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.i()     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L80
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.i()     // Catch: java.lang.Exception -> L3d
            r0.add(r4)     // Catch: java.lang.Exception -> L3d
            goto La2
        L80:
            java.util.List r5 = r4.j()     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L8b
            java.util.List r4 = r4.j()     // Catch: java.lang.Exception -> L3d
            goto L8f
        L8b:
            java.util.List r4 = r4.g()     // Catch: java.lang.Exception -> L3d
        L8f:
            if (r4 == 0) goto La2
            int r5 = r4.size()     // Catch: java.lang.Exception -> L3d
            if (r5 <= 0) goto La2
            r0.addAll(r4)     // Catch: java.lang.Exception -> L3d
            goto La2
        L9b:
            boolean r5 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r5 == 0) goto La2
            r4.printStackTrace()
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.metrics.f.a(com.mbridge.msdk.foundation.same.report.metrics.c, java.lang.String):java.util.List");
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap map = new HashMap();
        try {
            if (Arrays.asList(b.f40960e).contains(str)) {
                String strC = "";
                if (cVar != null) {
                    strC = cVar.c();
                }
                map.put("auto_load", strC);
            }
            if (cVar != null) {
                Map<String, Map<String, String>> mapR = cVar.r();
                String str2 = cVar.o() + str;
                if (mapR.containsKey(str2) && mapR.get(str2) != null) {
                    map.putAll(mapR.get(str2));
                }
                try {
                    Map<String, Map<String, String>> mapQ = cVar.q();
                    String str3 = cVar.o() + "_" + cVar.l() + "_" + str;
                    if (mapQ.containsKey(str3) && mapQ.get(str3) != null) {
                        map.putAll(mapQ.get(str3));
                        return map;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
        return map;
    }
}
