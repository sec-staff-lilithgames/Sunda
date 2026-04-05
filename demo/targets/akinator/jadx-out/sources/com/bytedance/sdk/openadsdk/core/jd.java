package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.p000if.jpo.jd;
import com.bytedance.sdk.openadsdk.utils.va;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import io.ktor.http.ContentDisposition;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        public int f20451jd;
        public String jpo;

        public jpo(String str, int i10) {
            this.jpo = str;
            this.f20451jd = i10;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.qk cm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j10 = jOptLong >= 0 ? jOptLong : 0L;
        int iOptInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.qk qkVar = new com.bytedance.sdk.openadsdk.core.model.qk();
        qkVar.jd(iOptInt);
        qkVar.wqx(iOptInt2);
        qkVar.jpo(j10);
        qkVar.jpo(iOptInt3);
        return qkVar;
    }

    /* renamed from: if, reason: not valid java name */
    private static Map<String, Object> m461if(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }

    public static AdSlot jd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("mCodeId", "");
        int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float fOptDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float fOptDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
        int iOptInt3 = jSONObject.optInt("mAdCount", 6);
        boolean zOptBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String strOptString2 = jSONObject.optString("mRewardName", "");
        int iOptInt4 = jSONObject.optInt("mRewardAmount", 0);
        String strOptString3 = jSONObject.optString("mMediaExtra", "");
        String strOptString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int iOptInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean zOptBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean zOptBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String strOptString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt, iOptInt2).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt3).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt4).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt5).setIsAutoPlay(zOptBoolean2).isExpressAd(zOptBoolean3).withBid(strOptString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static com.bytedance.sdk.openadsdk.core.model.jj jj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.jj jjVar = new com.bytedance.sdk.openadsdk.core.model.jj();
        jjVar.jd(jSONObject.optString("app_name"));
        jjVar.wqx(jSONObject.optString("package_name"));
        jjVar.jpo(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        jjVar.jpo(jSONObject.optDouble("score", -1.0d));
        jjVar.jpo(jSONObject.optInt("comment_num", -1));
        jjVar.jd(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        jjVar.cm(jSONObject.optString("app_category"));
        return jjVar;
    }

    private static boolean jpo(int i10) {
        return i10 == 2 || i10 == 3 || i10 == 8;
    }

    private static com.bytedance.sdk.openadsdk.core.model.au ju(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.au auVar = new com.bytedance.sdk.openadsdk.core.model.au();
        auVar.jpo(jSONObject.optString("deeplink_url"));
        auVar.jd(jSONObject.optString("fallback_url"));
        auVar.jpo(jSONObject.optInt("fallback_type"));
        return auVar;
    }

    private static FilterWord my(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    FilterWord filterWordMy = my(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (filterWordMy != null && filterWordMy.isValid()) {
                        filterWord.addOption(filterWordMy);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.rq qk(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.rq rqVar = new com.bytedance.sdk.openadsdk.core.model.rq();
        if (jSONObject == null) {
            rqVar.jpo(10L);
            rqVar.jd(20L);
            rqVar.wqx(10L);
            rqVar.cm(20L);
            rqVar.jpo("");
            return rqVar;
        }
        rqVar.jpo(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        rqVar.jd(jSONObject.optLong("straight_lp_showtime", 20L));
        rqVar.wqx(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        rqVar.cm(jSONObject.optLong("straight_agg_showtime", 20L));
        rqVar.jpo(jSONObject.optString("loading_text", ""));
        return rqVar;
    }

    private static com.bytedance.sdk.openadsdk.core.ju.xyk.jpo wqx(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.ju.xyk.jpo();
        jpoVar.jpo(jSONObject.optString("id"));
        jpoVar.jd(jSONObject.optString("md5"));
        jpoVar.wqx(jSONObject.optString("url"));
        return jpoVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.jr xyk(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.jr jrVar = new com.bytedance.sdk.openadsdk.core.model.jr();
        if (jSONObject == null) {
            jrVar.cm(5);
            jrVar.my(30);
            jrVar.jj(70);
            jrVar.qk(1);
            jrVar.xyk(com.bytedance.sdk.openadsdk.core.model.jr.jpo);
            jrVar.wqx(0);
            jrVar.jd(0);
            jrVar.jpo(3);
            return jrVar;
        }
        jrVar.cm(jSONObject.optInt("ceiling_time", 5));
        jrVar.my(jSONObject.optInt("ceiling_ratio", 30));
        jrVar.jj(jSONObject.optInt("expand_ratio", 70));
        jrVar.qk(jSONObject.optInt("back_type", 1));
        jrVar.xyk(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.jr.jpo));
        jrVar.wqx(jSONObject.optInt("pre_render_status", 0));
        jrVar.jd(jSONObject.optInt("pre_render_use_gecko", 0));
        jrVar.jpo(jSONObject.optInt("pre_render_add_type", 3));
        return jrVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.oya yd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.oya oyaVar = new com.bytedance.sdk.openadsdk.core.model.oya();
        oyaVar.jpo(jSONObject.optInt("if_send_click", 0));
        return oyaVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.xyk zz(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.xyk xykVar = new com.bytedance.sdk.openadsdk.core.model.xyk();
        if (jSONObject == null) {
            xykVar.wqx(0);
            xykVar.cm(0);
            xykVar.jd(new ArrayList());
            xykVar.my(0);
            xykVar.jpo(new ArrayList());
            xykVar.jd(0);
            xykVar.jpo(0);
            return xykVar;
        }
        xykVar.wqx(jSONObject.optInt("interceptor_x", 0));
        xykVar.cm(jSONObject.optInt("interceptor_y", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
            }
        }
        xykVar.jd(arrayList);
        xykVar.my(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i11));
            }
        }
        xykVar.jpo(arrayList2);
        xykVar.jd(jSONObject.optInt("boc_index", 0));
        xykVar.jpo(jSONObject.optInt("is_act", 0));
        return xykVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.util.Pair<com.bytedance.sdk.openadsdk.core.model.jpo, java.util.ArrayList<java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static Pair<com.bytedance.sdk.openadsdk.core.model.jpo, ArrayList<Integer>> jpo(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hx hxVar) {
        ?? r17;
        com.bytedance.sdk.openadsdk.core.model.dt dtVar;
        com.bytedance.sdk.openadsdk.core.model.dt dtVar2;
        com.bytedance.sdk.openadsdk.core.model.dt dtVar3 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.model.jpo();
            jpoVar.jpo(jSONObject.optString("request_id"));
            jpoVar.jpo(jSONObject.optInt("ret"));
            jpoVar.jd(jSONObject.optInt("multi_ad_style", 0));
            jpoVar.jd(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String strOptString = jSONObject.optString("gdid_encrypted");
            jpoVar.jpo(com.bytedance.sdk.openadsdk.core.model.tu.jpo(jSONObject.optJSONObject("loop_config")));
            String strOptString2 = jSONObject.optString("auction_price");
            if (jpoVar.wqx() != 0) {
                return null;
            }
            jpoVar.jpo(com.bytedance.sdk.openadsdk.core.model.nq.jpo(jSONObject.optString("multi_ad_config")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                jSONArrayOptJSONArray.length();
                int i10 = 0;
                ArrayList arrayList2 = jpoVar.yd() ? new ArrayList() : null;
                while (i10 < jSONArrayOptJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.dt dtVarJpo = jpo(jSONArrayOptJSONArray.optJSONObject(i10), adSlot, hxVar, jpoVar, i10);
                    ?? r92 = arrayList2;
                    if (!jpoVar.yd()) {
                        r92 = dtVar3;
                    }
                    int iJpo = jpo(dtVarJpo);
                    if (iJpo != 200) {
                        if (dtVarJpo != null) {
                            com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVarJpo, com.bytedance.sdk.openadsdk.utils.tic.wqx(dtVarJpo.jp()), iJpo);
                        } else {
                            com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar3, "", iJpo);
                        }
                        arrayList.add(Integer.valueOf(iJpo));
                        if (r92 == 0 || dtVarJpo == null) {
                            dtVar2 = dtVar3;
                        } else {
                            dtVar = dtVar3;
                            try {
                                r92.add(new jpo(dtVarJpo.roc(), iJpo));
                                dtVar2 = dtVar;
                            } catch (Throwable th2) {
                                th = th2;
                                r17 = dtVar;
                                com.bytedance.sdk.component.utils.nmd.wqx("TTAD.AdInfoFactory", th.getMessage());
                                return r17;
                            }
                        }
                        if (dtVarJpo != null && (dtVarJpo.jkt() == 39 || dtVarJpo.jkt() == 41)) {
                            jpoVar.jd(0);
                        }
                        jSONArrayOptJSONArray.remove(i10);
                        i10--;
                    } else {
                        dtVar2 = dtVar3;
                        dtVarJpo.oya(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            dtVarJpo.zz(strOptString);
                        }
                        jpoVar.jpo(dtVarJpo);
                    }
                    i10++;
                    dtVar3 = dtVar2;
                    arrayList2 = r92;
                }
                dtVar = dtVar3;
                List<com.bytedance.sdk.openadsdk.core.model.dt> listCm = jpoVar.cm();
                jpo(listCm, jpoVar);
                if (listCm != null) {
                    if (jpoVar.yd() && listCm.size() == 1) {
                        jpoVar.jd(0);
                        com.bytedance.sdk.openadsdk.core.model.dt dtVar4 = listCm.get(0);
                        if (dtVar4 != null) {
                            dtVar4.xyk(false);
                        }
                    }
                    int size = listCm.size();
                    jSONObject.put("creatives", jSONArrayOptJSONArray);
                    for (int i11 = 0; i11 < size; i11++) {
                        com.bytedance.sdk.openadsdk.core.model.dt dtVar5 = listCm.get(i11);
                        if (dtVar5 != null) {
                            if (i11 > 0) {
                                dtVar5.sxw();
                            }
                            dtVar5.ef(jSONObject.toString());
                        }
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    jpo((ArrayList<jpo>) arrayList2);
                }
            } else {
                dtVar = null;
            }
            return new Pair<>(jpoVar, arrayList);
        } catch (Throwable th3) {
            th = th3;
            r17 = dtVar3;
        }
    }

    private static int wqx(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        int iJpo;
        String strWqx = com.bytedance.sdk.openadsdk.utils.tic.wqx(dtVar.jp());
        if (dtVar.tda() == 0) {
            iJpo = jpo(dtVar.cnl());
            if (iJpo != 200) {
                com.bytedance.sdk.openadsdk.cm.wqx.wqx(dtVar, strWqx, iJpo);
                return iJpo;
            }
        } else {
            iJpo = 200;
        }
        int iPzk = dtVar.pzk();
        if (iPzk != 2 && iPzk != 3) {
            if (iPzk == 4) {
                int iJpo2 = jpo(dtVar.xur());
                if (iJpo2 != 200) {
                    com.bytedance.sdk.openadsdk.cm.wqx.wqx(dtVar, strWqx, iJpo2);
                }
                return iJpo2;
            }
            if (iPzk != 8) {
                return iJpo;
            }
        }
        if (!cm(dtVar) || !TextUtils.isEmpty(dtVar.iwg())) {
            return iJpo;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.wqx(dtVar, strWqx, 406);
        return 406;
    }

    private static boolean cm(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        return (dtVar.ig() || dtVar.jfy()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int jd(com.bytedance.sdk.openadsdk.core.model.dt r8) {
        /*
            int r0 = r8.jp()
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.tic.wqx(r0)
            int r1 = r8.tda()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L1c
            com.bytedance.sdk.openadsdk.core.model.au r1 = r8.cnl()
            int r1 = jpo(r1)
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r8, r0, r1)
            goto L1d
        L1c:
            r1 = r2
        L1d:
            int r3 = r8.pzk()
            r4 = 2
            r5 = 406(0x196, float:5.69E-43)
            r6 = 417(0x1a1, float:5.84E-43)
            r7 = 407(0x197, float:5.7E-43)
            if (r3 == r4) goto L79
            r4 = 3
            if (r3 == r4) goto L79
            r4 = 4
            if (r3 == r4) goto L35
            r4 = 8
            if (r3 == r4) goto L79
            goto L8d
        L35:
            com.bytedance.sdk.openadsdk.core.model.jj r3 = r8.xur()
            if (r3 != 0) goto L40
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r8, r0, r7)
            r1 = r7
            goto L8d
        L40:
            java.lang.String r4 = r3.wqx()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L59
            java.lang.String r4 = r3.jpo()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L59
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r8, r0, r6)
            r1 = r6
            goto L8d
        L59:
            java.lang.String r4 = r3.wqx()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L69
            r1 = 416(0x1a0, float:5.83E-43)
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r8, r0, r1)
            goto L8d
        L69:
            java.lang.String r3 = r3.jpo()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            r1 = 408(0x198, float:5.72E-43)
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r8, r0, r1)
            goto L8d
        L79:
            boolean r3 = cm(r8)
            if (r3 == 0) goto L8d
            java.lang.String r3 = r8.iwg()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r8, r0, r5)
            r1 = r5
        L8d:
            if (r1 == r6) goto L9a
            if (r1 == r7) goto L9a
            if (r1 != r5) goto L94
            goto L9a
        L94:
            if (r1 == r2) goto L99
            com.bytedance.sdk.openadsdk.cm.wqx.jd(r8, r0, r1)
        L99:
            return r2
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jd.jd(com.bytedance.sdk.openadsdk.core.model.dt):int");
    }

    private static void jpo(List<com.bytedance.sdk.openadsdk.core.model.dt> list, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = list.get(0);
        if (!jpoVar.yd() || dtVar == null || !dtVar.ci() || com.bytedance.sdk.openadsdk.utils.tic.uu() == 0) {
            return;
        }
        jpoVar.jd(0);
        dtVar.xyk(false);
    }

    public static com.bytedance.sdk.openadsdk.core.model.dt jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return jpo(jSONObject, null, null, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x06a2 A[PHI: r0
      0x06a2: PHI (r0v86 int) = (r0v85 int), (r0v136 int) binds: [B:168:0x068e, B:173:0x069f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.openadsdk.core.model.dt jpo(org.json.JSONObject r17, com.bytedance.sdk.openadsdk.AdSlot r18, com.bytedance.sdk.openadsdk.core.model.hx r19, com.bytedance.sdk.openadsdk.core.model.jpo r20, int r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jd.jpo(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.hx, com.bytedance.sdk.openadsdk.core.model.jpo, int):com.bytedance.sdk.openadsdk.core.model.dt");
    }

    private static void jpo(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("iv_skip_time", -1);
            int iOptInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (iOptInt != -1) {
                dtVar.dn(iOptInt);
            }
            if (iOptInt2 != -1) {
                dtVar.sbx(iOptInt2);
            }
        }
    }

    private static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.p000if.jpo, jd.jpo> jpo(String str, int i10, int i11) {
        int iWqx;
        int iMy;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i11 == 1 || i11 == 5) {
            iWqx = 0;
            iMy = 0;
        } else {
            iWqx = va.wqx(sq.jpo());
            iMy = va.my(sq.jpo());
            if (i10 == 2) {
                iMy = iWqx;
                iWqx = iMy;
            }
        }
        com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my myVar = new com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my(sq.jpo(), iWqx, iMy);
        return new Pair<>(myVar.jpo(str, (File) null, new ArrayList()), myVar.f20406jj);
    }

    private static void jpo(com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        jpoVar.jpo(dtVar);
        if (!jpo(dtVar.pzk())) {
            dtVar.se(2);
        }
        dtVar.ju(1);
        dtVar.jpo(jpoVar);
        if (!TextUtils.isEmpty(jpoVar.cm())) {
            dtVar.nmd(jpoVar.cm());
        }
        if (!TextUtils.isEmpty(jpoVar.my())) {
            dtVar.rq(jpoVar.my());
        }
        dtVar.opi(jpoVar.jj());
        dtVar.jpo((com.bytedance.sdk.openadsdk.core.model.jj) null);
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = dtVar.ww();
        if (jdVarWw == null) {
            jdVarWw = new com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd();
        }
        jdVarWw.wqx(jpoVar.qk());
        jdVarWw.jpo(jpoVar.xyk());
        jdVarWw.jj((String) null);
        jdVarWw.jd((String) null);
        jdVarWw.cm((String) null);
        dtVar.jpo(jdVarWw);
        if (jpoVar.jd() != null && !TextUtils.isEmpty(jpoVar.jd().my())) {
            com.bytedance.sdk.openadsdk.core.model.opi opiVar = new com.bytedance.sdk.openadsdk.core.model.opi();
            opiVar.jpo(jpoVar.jd().my());
            opiVar.jpo(jpoVar.jd().jd());
            opiVar.jd(jpoVar.jd().wqx());
            dtVar.jpo(opiVar);
            return;
        }
        if (dtVar.ou() == null) {
            com.bytedance.sdk.openadsdk.core.model.opi opiVar2 = new com.bytedance.sdk.openadsdk.core.model.opi();
            opiVar2.jpo("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            opiVar2.jpo(98);
            opiVar2.jd(98);
            dtVar.jpo(opiVar2);
        }
    }

    private static com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jpo(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.dt dtVar, boolean z10) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar = new com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd();
        jdVar.jd(jSONObject.optInt("cover_height"));
        jdVar.wqx(jSONObject.optInt("cover_width"));
        jdVar.jpo(jSONObject.optString("resolution"));
        jdVar.jpo(jSONObject.optLong(ContentDisposition.Parameters.Size));
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        jdVar.jpo(dOptDouble);
        int i10 = 1;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && dtVar.cql() != 1 && com.bytedance.sdk.openadsdk.core.model.dt.my(dtVar)) {
            i10 = iOptInt2;
        }
        jdVar.yd(i10);
        jdVar.jd(jSONObject.optString("cover_url"));
        jdVar.wqx(jSONObject.optString("video_url"));
        jdVar.cm(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        jdVar.my(jSONObject.optString("playable_download_url"));
        jdVar.jj(jSONObject.optString("file_hash"));
        jdVar.xyk(jSONObject.optInt("if_playable_loading_show", 0));
        jdVar.zz(jSONObject.optInt("remove_loading_page_type", 0));
        jdVar.jpo(jSONObject.optInt("fallback_endcard_judge", 0));
        jdVar.my(jSONObject.optInt("video_preload_size", 307200));
        jdVar.jj(jSONObject.optInt("reward_video_cached_type", 0));
        jdVar.qk(jSONObject.optInt("execute_cached_type", 0));
        if (z10) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        jdVar.cm(iOptInt);
        return jdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int jpo(com.bytedance.sdk.openadsdk.core.model.dt r5) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r5 != 0) goto Lb
            java.lang.String r5 = ""
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r1, r5, r0)
            return r0
        Lb:
            int r2 = r5.jp()
            java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.tic.wqx(r2)
            java.lang.String r3 = r5.fc()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lbd
            java.lang.String r3 = r5.fc()
            int r3 = r3.length()
            r4 = 1
            if (r3 > r4) goto L2a
            goto Lbd
        L2a:
            boolean r3 = r5.jfy()
            if (r3 == 0) goto L64
            int r3 = r5.jp()
            if (r3 >= 0) goto L47
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.gmx()
            if (r3 == 0) goto L44
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.gmx()
            r3.getDurationSlotType()
            goto L47
        L44:
            r5.cxb()
        L47:
            boolean r3 = r5.aul()
            if (r3 == 0) goto L4f
            java.lang.String r2 = "fullscreen_interstitial_ad"
        L4f:
            java.lang.String r3 = r5.nes()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L5f
            java.lang.String r3 = "load_html_fail"
            com.bytedance.sdk.openadsdk.cm.wqx.jd(r5, r2, r3, r1)
            return r0
        L5f:
            java.lang.String r0 = "load_html_success"
            com.bytedance.sdk.openadsdk.cm.wqx.jd(r5, r2, r0, r1)
        L64:
            int r0 = r5.tda()
            if (r0 != 0) goto La9
            int r0 = r5.iqh()
            r1 = 2
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L9b
            r1 = 3
            if (r0 == r1) goto L9b
            r1 = 4
            if (r0 == r1) goto L9b
            r1 = 5
            if (r0 == r1) goto L89
            r1 = 15
            if (r0 == r1) goto L89
            r1 = 16
            if (r0 == r1) goto L9b
            r1 = 50
            if (r0 == r1) goto L89
            goto La9
        L89:
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd r0 = r5.ww()
            boolean r1 = r5.ig()
            int r0 = jpo(r0, r1)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r5, r2, r0)
            return r0
        L9b:
            java.util.List r0 = r5.fri()
            int r0 = jpo(r0)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r5, r2, r0)
            return r0
        La9:
            com.bytedance.sdk.openadsdk.core.settings.jj r0 = com.bytedance.sdk.openadsdk.core.settings.au.jrx()
            boolean r0 = r0.umr()
            if (r0 == 0) goto Lb8
            int r5 = wqx(r5)
            return r5
        Lb8:
            int r5 = jd(r5)
            return r5
        Lbd:
            r0 = 402(0x192, float:5.63E-43)
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(r5, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jd.jpo(com.bytedance.sdk.openadsdk.core.model.dt):int");
    }

    private static int jpo(com.bytedance.sdk.openadsdk.core.model.au auVar) {
        if (auVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(auVar.jpo())) {
            return 403;
        }
        if (TextUtils.isEmpty(auVar.jd())) {
            return 404;
        }
        return (auVar.wqx() == 1 || auVar.wqx() == 2) ? 200 : 405;
    }

    private static int jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar, boolean z10) {
        if (jdVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(jdVar.ju())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z10 || !TextUtils.isEmpty(jdVar.yd())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int jpo(com.bytedance.sdk.openadsdk.core.model.jj jjVar) {
        if (jjVar == null) {
            return 407;
        }
        if (TextUtils.isEmpty(jjVar.jpo())) {
            return 408;
        }
        if (TextUtils.isEmpty(jjVar.wqx())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int jpo(List<com.bytedance.sdk.openadsdk.core.model.opi> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (com.bytedance.sdk.openadsdk.core.model.opi opiVar : list) {
            if (opiVar == null) {
                return 411;
            }
            if (TextUtils.isEmpty(opiVar.jpo())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void jpo(final ArrayList<jpo> arrayList) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.jd.1
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jpo jpoVar = (jpo) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(BidResponsedEx.KEY_CID, jpoVar.jpo);
                    jSONObject2.put("error_msg", jpoVar.f20451jd);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("multiple_ads_parsing_error").jd(jSONObject.toString());
            }
        });
    }
}
