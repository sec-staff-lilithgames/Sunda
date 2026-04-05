package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import b0.e2;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.core.zz.Cif;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.va;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C3191e4;
import com.ironsource.C3434s;
import com.ironsource.G5;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class dt implements tu<com.bytedance.sdk.openadsdk.cm.jpo> {
    private final Context jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {

        /* renamed from: jd, reason: collision with root package name */
        public final boolean f20303jd;
        public final int jpo;
        public final com.bytedance.sdk.openadsdk.core.model.ef wqx;

        private jd(int i10, boolean z10, com.bytedance.sdk.openadsdk.core.model.ef efVar) {
            this.jpo = i10;
            this.f20303jd = z10;
            this.wqx = efVar;
        }

        public static jd jpo(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.ef efVar = new com.bytedance.sdk.openadsdk.core.model.ef();
            if (jSONObjectOptJSONObject != null) {
                try {
                    efVar.jpo(jSONObjectOptJSONObject.optInt("reason"));
                    efVar.jd(jSONObjectOptJSONObject.optInt("corp_type"));
                    efVar.wqx(jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    efVar.jpo(jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", th2.getMessage());
                }
            }
            return new jd(iOptInt, zOptBoolean, efVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        final int f20304cm;

        /* renamed from: jd, reason: collision with root package name */
        final long f20305jd;

        /* renamed from: jj, reason: collision with root package name */
        final int f20306jj;
        final int jpo;
        final String my;

        /* renamed from: qk, reason: collision with root package name */
        final String f20307qk;
        final long wqx;
        public final com.bytedance.sdk.openadsdk.core.model.jpo xyk;

        /* renamed from: yd, reason: collision with root package name */
        final ArrayList<Integer> f20308yd;
        final String zz;

        private jpo(String str, int i10, int i11, String str2, int i12, String str3, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, long j10, long j11, ArrayList<Integer> arrayList) {
            this.jpo = i10;
            this.f20304cm = i11;
            this.my = str2;
            this.f20307qk = str3;
            this.xyk = jpoVar;
            this.zz = str;
            this.f20306jj = i12;
            this.f20305jd = j10;
            this.wqx = j11;
            this.f20308yd = arrayList;
        }

        public static jpo jpo(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hx hxVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.jpo, ArrayList<Integer>> pairJpo = com.bytedance.sdk.openadsdk.core.jd.jpo(jSONObject, adSlot, hxVar);
            return pairJpo == null ? new jpo(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new jpo(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.jpo) pairJpo.first, jOptLong, jOptLong2, (ArrayList) pairJpo.second);
        }
    }

    public dt(Context context) {
        this.jpo = context;
    }

    private boolean cm(String str) {
        if (com.bytedance.sdk.openadsdk.core.xyk.jd.jpo()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.xyk.jd.jpo(str)) {
            return false;
        }
        String strJd = com.bytedance.sdk.openadsdk.core.xyk.jd.jd();
        if (!TextUtils.isEmpty(strJd)) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(strJd, System.currentTimeMillis());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hx hxVar, final int i10, final tu.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar2;
        if (!sq.cm().vzb()) {
            jpoVar.jpo(40060, xyk.jpo(40060));
            return;
        }
        boolean zWqx = com.bytedance.sdk.openadsdk.rq.jpo.wqx();
        if (!zWqx) {
            oya.jj();
        }
        final com.bytedance.sdk.openadsdk.core.model.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.model.wqx();
        wqxVar.jpo(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.zz.jpo()) {
            if (jpoVar != null) {
                jpoVar.jpo(1000, "Ad request is temporarily paused, Please contact your AM");
                wqxVar.jpo(1000);
                com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
                return;
            }
            return;
        }
        if (!sq.cm().dm()) {
            if (jpoVar != null) {
                jpoVar.jpo(-16, xyk.jpo(-16));
                wqxVar.jpo(1001);
                com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
                return;
            }
            return;
        }
        if (jpoVar == null) {
            return;
        }
        if (cm(adSlot.getCodeId())) {
            jpoVar.jpo(-8, xyk.jpo(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !hxVar.f20667jj) {
            wqxVar.jd(2);
            wqxVar.jpo(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.prr.cm()) {
                com.bykv.vk.openvk.jpo.jpo.jpo.qk.jd.jpo(adSlot.getBidAdm());
            }
            if (sq.cm().pe() && sz.jpo().cm() == 1) {
                com.bytedance.sdk.openadsdk.utils.tic.jpo("Pangle_Debug_Mode", adSlot.getBidAdm(), this.jpo);
            }
            try {
                JSONObject jSONObjectJpo = jpo(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectJpo == null) {
                    wqxVar.wqx(12);
                    jpo(jpoVar, wqxVar);
                    return;
                }
                jpo jpoVarJpo = jpo.jpo(jSONObjectJpo, adSlot, hxVar);
                wqxVar.jpo(jpoVarJpo.f20308yd);
                Cif.jpo(jpoVarJpo.zz);
                int i11 = jpoVarJpo.f20304cm;
                if (i11 != 20000) {
                    jpoVar.jpo(i11, jpoVarJpo.my);
                    wqxVar.jpo(jpoVarJpo.f20304cm);
                    wqxVar.wqx(9);
                    com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.jpo jpoVar3 = jpoVarJpo.xyk;
                if (jpoVar3 == null) {
                    wqxVar.wqx(13);
                    jpo(jpoVar, wqxVar);
                    return;
                }
                if (jpoVar3.cm() != null && !jpoVarJpo.xyk.cm().isEmpty()) {
                    com.bytedance.sdk.openadsdk.prr.wqx.jpo(jpoVarJpo.xyk.cm().get(0));
                }
                jpo(jpoVarJpo.xyk);
                if (jpo(jpoVarJpo.xyk, jpoVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.p000if.wqx.cm.jpo(jpoVarJpo.xyk);
                jpoVar.jpo(jpoVarJpo.xyk, wqxVar);
                Map<String, com.bytedance.sdk.openadsdk.core.model.dt> mapJpo = com.bytedance.sdk.openadsdk.core.model.jpo.jpo(jpoVarJpo.xyk);
                if (mapJpo != null) {
                    com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(mapJpo);
                }
                jd(jpoVarJpo.xyk);
                com.bytedance.sdk.openadsdk.core.my.jpo.jpo().jpo(jpoVarJpo.xyk);
                return;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.jpo("NetApiImpl", "get ad error: ", th2);
                wqxVar.wqx(14);
                wqxVar.jd(th2.getMessage());
                jpo(jpoVar, wqxVar);
                return;
            }
        }
        if (hxVar != null && !TextUtils.isEmpty(hxVar.f129if)) {
            try {
                JSONObject jSONObjectJpo2 = jpo(new JSONObject(hxVar.f129if));
                if (jSONObjectJpo2 != null) {
                    jpo jpoVarJpo2 = jpo.jpo(jSONObjectJpo2, adSlot, hxVar);
                    nmd nmdVar = hxVar.f20664au;
                    if (nmdVar != null && (jpoVar2 = jpoVarJpo2.xyk) != null && nmdVar.jpo(jpoVar2)) {
                        com.bytedance.sdk.openadsdk.core.p000if.wqx.cm.jpo(jpoVar2);
                        jpoVar.jpo(jpoVar2, wqxVar);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectJpo3 = jpo(adSlot, hxVar, i10);
        if (jSONObjectJpo3 == null) {
            jpoVar.jpo(-9, xyk.jpo(-9));
            wqxVar.jpo(-9);
            com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
            return;
        }
        if (sq.cm().pe() && sz.jpo().cm() == 1) {
            com.bytedance.sdk.openadsdk.utils.tic.jpo("Pangle_Debug_Mode", jSONObjectJpo3.toString(), this.jpo);
        }
        String strJpo = com.bytedance.sdk.openadsdk.utils.tic.jpo("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
        try {
            cmVarJd.jd(com.bytedance.sdk.openadsdk.xyk.cm.jpo(cmVarJd, strJpo));
        } catch (Exception unused2) {
        }
        cmVarJd.jpo(jSONObjectJpo3.toString(), sq.cm().prr());
        Map<String, String> mapJpo2 = com.bytedance.sdk.openadsdk.core.yd.wqx.jpo(strJpo, jSONObjectJpo3.toString());
        if (mapJpo2 != null && mapJpo2.size() > 0) {
            for (String str : mapJpo2.keySet()) {
                try {
                    cmVarJd.jd(str, mapJpo2.get(str));
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e10.getMessage());
                }
            }
        }
        try {
            cmVarJd.jd(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.tic.cm());
            jpo(cmVarJd, jSONObjectJpo3);
        } catch (Exception unused3) {
        }
        final com.bytedance.sdk.openadsdk.utils.dm dmVarJd = com.bytedance.sdk.openadsdk.utils.dm.jd();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z10 = zz.jd().sq() && requestExtraMap != null;
        if (z10) {
            requestExtraMap.put("pgad_start", dmVarJd);
        }
        cmVarJd.jpo(10);
        cmVarJd.jpo("get_ad");
        com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.8
            @Override // com.bytedance.sdk.openadsdk.sq.cm
            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarH = a.h("get_ad");
                jpoVarH.wqx(adSlot.getCodeId());
                jpoVarH.cm(com.bytedance.sdk.openadsdk.utils.tic.wqx(adSlot.getDurationSlotType()));
                return jpoVarH;
            }
        });
        if (com.bytedance.sdk.component.utils.prr.cm()) {
            Thread.currentThread().getName();
        }
        if (zWqx) {
            Map<String, Object> map = requestExtraMap;
            try {
                com.bytedance.sdk.component.qk.jd jdVarJpo = cmVarJd.jpo();
                com.bytedance.sdk.component.qk.jd jdVar = jdVarJpo == null ? new com.bytedance.sdk.component.qk.jd(false, IronSourceConstants.errorCode_biddingDataException, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L) : jdVarJpo;
                if (jdVar.jj()) {
                    boolean z11 = z10;
                    try {
                        jpo(cmVarJd, jdVar, z11, map, dmVarJd, adSlot, wqxVar, jpoVar, hxVar, i10);
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = z11;
                        map = map;
                        wqxVar = wqxVar;
                        jpo(cmVarJd, new IOException(th.getMessage()), new com.bytedance.sdk.component.qk.jd(false, IronSourceConstants.errorCode_isReadyException, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z10, map, jpoVar, wqxVar);
                        com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(false);
                    }
                } else {
                    jpo(cmVarJd, new IOException(jdVar.jd()), jdVar, adSlot, z10, map, jpoVar, wqxVar);
                    com.bytedance.sdk.openadsdk.utils.rq.jpo(cmVarJd.cm());
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            final boolean z12 = z10;
            cmVarJd.jpo(new com.bytedance.sdk.component.qk.jpo.jd() { // from class: com.bytedance.sdk.openadsdk.core.dt.9
                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar2, com.bytedance.sdk.component.qk.jd jdVar2) {
                    dt.this.jpo(wqxVar2, jdVar2, z12, (Map<String, Object>) requestExtraMap, dmVarJd, adSlot, wqxVar, jpoVar, hxVar, i10);
                }

                @Override // com.bytedance.sdk.component.qk.jpo.jd
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar2, IOException iOException, com.bytedance.sdk.component.qk.jd jdVar2) {
                    dt.this.jpo(cmVarJd, iOException, jdVar2, adSlot, z12, (Map<String, Object>) requestExtraMap, jpoVar, wqxVar);
                    if (wqxVar2 != null) {
                        com.bytedance.sdk.openadsdk.utils.rq.jpo(wqxVar2.cm());
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(false);
    }

    @DungeonFlag
    private void jj(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.tic.jj());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.tic.qk());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.tic.xyk());
        } catch (Exception unused) {
        }
    }

    private boolean my(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean wqx(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    private byte[] my(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (IOException e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                gZIPOutputStream.write(str.getBytes(G5.N));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e11) {
                    com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e11.toString());
                }
            } catch (IOException e12) {
                e = e12;
                gZIPOutputStream2 = gZIPOutputStream;
                com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e13) {
                        com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e13.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
                return byteArray;
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e14) {
                        com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e14.toString());
                    }
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e15) {
                    com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e15.toString());
                    throw th;
                }
            }
        } catch (IOException e16) {
            e = e16;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e17) {
            com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e17.toString());
        }
        return byteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e A[PHI: r2
      0x009e: PHI (r2v15 int) = (r2v14 int), (r2v18 int) binds: [B:12:0x0091, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject wqx() throws org.json.JSONException {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "appid"
            com.bytedance.sdk.openadsdk.core.zz r2 = com.bytedance.sdk.openadsdk.core.zz.jd()     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = r2.cm()     // Catch: org.json.JSONException -> Laf
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Laf
            java.lang.String r1 = "name"
            com.bytedance.sdk.openadsdk.core.zz r2 = com.bytedance.sdk.openadsdk.core.zz.jd()     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = r2.xyk()     // Catch: org.json.JSONException -> Laf
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Laf
            r8.jj(r0)     // Catch: org.json.JSONException -> Laf
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.sq.jpo()     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = ""
            if (r1 == 0) goto L47
            java.lang.String r2 = r1.getPackageResourcePath()     // Catch: java.lang.Throwable -> L2f
            goto L47
        L2f:
            r3 = move-exception
            java.lang.String r4 = "NetApiImpl"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Laf
            java.lang.String r6 = "failed to get the application installation package path. error: "
            r5.<init>(r6)     // Catch: org.json.JSONException -> Laf
            java.lang.String r3 = r3.getMessage()     // Catch: org.json.JSONException -> Laf
            r5.append(r3)     // Catch: org.json.JSONException -> Laf
            java.lang.String r3 = r5.toString()     // Catch: org.json.JSONException -> Laf
            com.bytedance.sdk.component.utils.nmd.wqx(r4, r3)     // Catch: org.json.JSONException -> Laf
        L47:
            java.lang.String r3 = "package_install_path"
            r0.put(r3, r2)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "is_paid_app"
            r3 = 0
            r0.put(r2, r3)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "apk_sign"
            java.lang.String r4 = com.bytedance.sdk.openadsdk.common.jd.qk()     // Catch: org.json.JSONException -> Laf
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "app_running_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> Laf
            long r6 = com.bytedance.sdk.openadsdk.core.oya.jpo()     // Catch: org.json.JSONException -> Laf
            long r4 = r4 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "fmwname"
            java.lang.String r4 = com.bytedance.sdk.openadsdk.utils.DeviceUtils.yd()     // Catch: org.json.JSONException -> Laf
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "is_init"
            boolean r4 = com.bytedance.sdk.openadsdk.core.oya.my()     // Catch: org.json.JSONException -> Laf
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Laf
            if (r1 == 0) goto Laf
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: org.json.JSONException -> Laf
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: org.json.JSONException -> Laf
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: org.json.JSONException -> Laf
            int r1 = r1.getRotation()     // Catch: org.json.JSONException -> Laf
            r2 = 1
            if (r1 == 0) goto L9e
            r4 = 3
            if (r1 == r2) goto La0
            r2 = 2
            if (r1 == r2) goto L9e
            if (r1 == r4) goto L9c
            goto La1
        L9c:
            r3 = 4
            goto La1
        L9e:
            r3 = r2
            goto La1
        La0:
            r3 = r4
        La1:
            java.lang.String r1 = "orientation_support"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> Laf
            r2.<init>()     // Catch: org.json.JSONException -> Laf
            org.json.JSONArray r2 = r2.put(r3)     // Catch: org.json.JSONException -> Laf
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Laf
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.dt.wqx():org.json.JSONObject");
    }

    private Map<String, String> cm(JSONObject jSONObject) {
        HashMap mapS = e2.s("Content-Type", "application/json; charset=utf-8");
        if (wqx(jSONObject)) {
            mapS.put("Content-Encoding", "union_sdk_encode");
        }
        return mapS;
    }

    @DungeonFlag
    private JSONObject jpo(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hx hxVar, int i10) {
        int i11;
        int i12;
        int i13;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strMy = (hxVar == null || TextUtils.isEmpty(hxVar.jpo)) ? com.bytedance.sdk.openadsdk.utils.tic.my() : hxVar.jpo;
            if (i10 == 7) {
                if (hxVar != null && (i13 = hxVar.f20666jd) > 0) {
                    jSONObject2.put("req_type", i13);
                }
            } else if (i10 == 8) {
                if (hxVar != null && (i12 = hxVar.wqx) > 0) {
                    jSONObject2.put("req_type", i12);
                }
            } else if (i10 == 3 && hxVar != null && (i11 = hxVar.f20665cm) > 0) {
                jSONObject2.put("req_type", i11);
            }
            try {
                String strZz = sq.cm().zz();
                String strOpi = sq.cm().opi();
                if (strZz != null && strOpi != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strZz);
                    jSONObject3.put("param", strOpi);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("request_id", strMy);
            com.bytedance.sdk.openadsdk.utils.tic.jpo(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("js_render_ver", Cif.jd());
            jSONObject2.put("js_render_v3_ver", Cif.wqx());
            jSONObject2.put("source_type", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, wqx());
            jSONObject2.put(C3191e4.h.G, DeviceUtils.jpo(this.jpo, true));
            jSONObject2.put("user", jpo(adSlot));
            jSONObject2.put(Q6.f35252d0, com.bytedance.sdk.openadsdk.utils.tic.cm());
            jSONObject2.put("channel", C3191e4.h.Z);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jpo(adSlot, i10, hxVar));
            jSONObject2.put("adslots", jSONArray);
            jpo(jSONObject2, hxVar);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strMy != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strMy);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.my.jpo(strConcat));
            if (com.bytedance.sdk.openadsdk.core.yd.wqx.my() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.yd.wqx.my()));
            }
            jSONObject2.put("adx_id", zz.jd().hmu());
            com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo(jSONObject2);
            jSONObject = jpo(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("body data exception", th2);
        }
        return jSONObject;
    }

    public static JSONArray wqx(String str) throws JSONException {
        try {
            Set<com.bytedance.sdk.openadsdk.core.ju.jpo.jpo> setJpo = com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo(str);
            if (setJpo != null && setJpo.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.ju.jpo.jpo jpoVar : setJpo) {
                    if (jpoVar != null && !TextUtils.isEmpty(jpoVar.my())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = jpoVar.jpo().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", jpoVar.jd());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.jpo("NetApiImpl", "getUgenParentTplIds: ", e10);
            return null;
        }
    }

    private void jpo(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.hx hxVar) throws JSONException {
        JSONArray jSONArray;
        if (hxVar == null || (jSONArray = hxVar.my) == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    public void jpo(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hx hxVar, int i10, nmd nmdVar) {
        if (!hxVar.f20667jj && TextUtils.isEmpty(adSlot.getBidAdm())) {
            if (!jpo(hxVar) && nmdVar != null) {
                String strJpo = nmdVar.jpo();
                if (!TextUtils.isEmpty(strJpo)) {
                    hxVar.f129if = strJpo;
                    hxVar.f20664au = nmdVar;
                }
            }
            jpo(adSlot, hxVar, i10, (tu.jpo) nmdVar);
            return;
        }
        jpo(adSlot, hxVar, i10, (tu.jpo) nmdVar);
    }

    private boolean jpo(com.bytedance.sdk.openadsdk.core.model.hx hxVar) {
        if (hxVar != null) {
            return hxVar.f20666jd == 2 || hxVar.wqx == 2 || hxVar.f20665cm == 2;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    public void jpo(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hx hxVar, final int i10, tu.jpo jpoVar) {
        if (hxVar != null && (hxVar.f20666jd == 2 || hxVar.wqx == 2 || hxVar.f20665cm == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.jd.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.core.jd.jpo(jpoVar, adSlot, (adSlot.isPreload() || hxVar == null || hxVar.f20667jj) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            oya.jd().post(new com.bytedance.sdk.component.xyk.xyk("getAd") { // from class: com.bytedance.sdk.openadsdk.core.dt.1
                @Override // java.lang.Runnable
                public void run() {
                    dt.this.jd(adSlot, hxVar, i10, jpoVar2);
                }
            });
        } else {
            jd(adSlot, hxVar, i10, jpoVar2);
        }
        if (com.bytedance.sdk.openadsdk.rq.jpo.wqx()) {
            oya.qk();
        }
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.core.model.dt dtVarJj;
        if (jpoVar == null || (dtVarJj = jpoVar.jj()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.au.rv(dtVarJj.hd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.component.qk.jd.cm cmVar, IOException iOException, com.bytedance.sdk.component.qk.jd jdVar, final AdSlot adSlot, boolean z10, Map<String, Object> map, tu.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
        String message;
        int iJpo;
        com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.10
            @Override // com.bytedance.sdk.openadsdk.sq.cm
            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarH = a.h("get_ad");
                jpoVarH.wqx(adSlot.getCodeId());
                jpoVarH.cm(com.bytedance.sdk.openadsdk.utils.tic.wqx(adSlot.getDurationSlotType()));
                jpoVarH.jpo(BuildConfig.VERSION_NAME);
                return jpoVarH;
            }
        });
        if (jdVar != null) {
            message = jdVar.jd();
        } else if (iOException != null) {
            message = iOException.getMessage();
        } else {
            message = "";
        }
        com.bytedance.sdk.openadsdk.utils.dm dmVarJd = com.bytedance.sdk.openadsdk.utils.dm.jd();
        if (z10) {
            map.put("pgad_end", Long.valueOf(dmVarJd.jpo));
        }
        if (sq.cm().pe() && sz.jpo().cm() == 1) {
            com.bytedance.sdk.openadsdk.utils.tic.jpo("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.jpo);
        }
        if (jdVar != null) {
            iJpo = jdVar.jpo();
        } else {
            iJpo = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : 602;
        }
        if (jpoVar != null) {
            jpoVar.jpo(iJpo, message);
        }
        wqxVar.jpo(iJpo);
        wqxVar.wqx(10);
        wqxVar.jd(message);
        com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
        com.bytedance.sdk.openadsdk.cm.jpo.jj.wqx.incrementAndGet();
        com.bytedance.sdk.openadsdk.cm.jpo.jj.jpo.incrementAndGet();
        com.bytedance.sdk.openadsdk.cm.jpo.jj.f19551qk.incrementAndGet();
        com.bytedance.sdk.openadsdk.cm.jpo.jj.my();
        com.bytedance.sdk.openadsdk.cm.jpo.jj.jpo(iJpo, message);
        com.bytedance.sdk.openadsdk.cm.jpo.jj.wqx();
        com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("get_ad", cmVar.cm(), iJpo, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:9:0x0031, B:11:0x004c, B:13:0x0056, B:16:0x0065, B:18:0x006b, B:20:0x007c, B:22:0x0090, B:24:0x009d, B:26:0x00a4, B:28:0x00b5, B:27:0x00ae, B:30:0x00c6, B:32:0x00ca, B:34:0x00db, B:37:0x00e3, B:39:0x00ee, B:41:0x00f2, B:42:0x00f7, B:58:0x013e, B:60:0x0146, B:62:0x014c, B:64:0x0159, B:66:0x016a, B:65:0x0162, B:73:0x01ac, B:75:0x01c5, B:76:0x01cc, B:78:0x01d4, B:81:0x01e2, B:82:0x0201, B:83:0x0206), top: B:90:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e2 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:9:0x0031, B:11:0x004c, B:13:0x0056, B:16:0x0065, B:18:0x006b, B:20:0x007c, B:22:0x0090, B:24:0x009d, B:26:0x00a4, B:28:0x00b5, B:27:0x00ae, B:30:0x00c6, B:32:0x00ca, B:34:0x00db, B:37:0x00e3, B:39:0x00ee, B:41:0x00f2, B:42:0x00f7, B:58:0x013e, B:60:0x0146, B:62:0x014c, B:64:0x0159, B:66:0x016a, B:65:0x0162, B:73:0x01ac, B:75:0x01c5, B:76:0x01cc, B:78:0x01d4, B:81:0x01e2, B:82:0x0201, B:83:0x0206), top: B:90:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(com.bytedance.sdk.component.qk.jd.wqx r20, com.bytedance.sdk.component.qk.jd r21, boolean r22, java.util.Map<java.lang.String, java.lang.Object> r23, com.bytedance.sdk.openadsdk.utils.dm r24, final com.bytedance.sdk.openadsdk.AdSlot r25, com.bytedance.sdk.openadsdk.core.model.wqx r26, com.bytedance.sdk.openadsdk.core.tu.jpo r27, com.bytedance.sdk.openadsdk.core.model.hx r28, int r29) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.dt.jpo(com.bytedance.sdk.component.qk.jd.wqx, com.bytedance.sdk.component.qk.jd, boolean, java.util.Map, com.bytedance.sdk.openadsdk.utils.dm, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.wqx, com.bytedance.sdk.openadsdk.core.tu$jpo, com.bytedance.sdk.openadsdk.core.model.hx, int):void");
    }

    private void jd(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        List<com.bytedance.sdk.openadsdk.core.model.dt> listCm = jpoVar.cm();
        if (listCm == null || listCm.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < listCm.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.model.dt dtVar = listCm.get(i10);
            if (dtVar != null && dtVar.huv() == null) {
                jpo("", 0, 0, dtVar.ou(), dtVar);
                jpo("", 0, 0, dtVar.kye(), dtVar);
                List<com.bytedance.sdk.openadsdk.core.model.opi> listFri = dtVar.fri();
                if (listFri != null && listFri.size() > 0) {
                    for (int i11 = 0; i11 < listFri.size(); i11++) {
                        jpo(dtVar, listFri.get(i11));
                    }
                }
                if (dtVar.ww() != null) {
                    jpo(dtVar.ww().yd(), dtVar.ww().wqx(), dtVar.ww().jd(), (com.bytedance.sdk.openadsdk.core.model.opi) null, dtVar);
                }
            }
        }
    }

    @DungeonFlag
    private JSONObject jd(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put(Q6.U0, com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", jpo(list));
            jSONObject3.put("dislike_source", str3);
            if (com.bytedance.sdk.openadsdk.core.settings.au.jrx().roc() && jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.jpo.jpo(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    private Map<String, String> jd() {
        return e2.s("Content-Type", "application/octet-stream;tt-data=a");
    }

    private static String jd(AdSlot adSlot) {
        String strAu = zz.jd().au();
        if (adSlot == null) {
            if (TextUtils.isEmpty(strAu)) {
                return "";
            }
        } else {
            String userData = adSlot.getUserData();
            if (TextUtils.isEmpty(strAu)) {
                return userData;
            }
            if (!TextUtils.isEmpty(userData)) {
                HashSet hashSet = new HashSet();
                try {
                    JSONArray jSONArray = new JSONArray(userData);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        if (jSONObject != null) {
                            hashSet.add(jSONObject.optString("name", null));
                        }
                    }
                    try {
                        JSONArray jSONArray2 = new JSONArray(strAu);
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                            if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                                jSONArray.put(jSONObject2);
                            }
                        }
                        return jSONArray.toString();
                    } catch (Throwable unused) {
                        return userData;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return strAu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String jd(int i10, String str) {
        Object obj;
        if (i10 == 3) {
            return com.bytedance.sdk.component.utils.jpo.wqx(str);
        }
        if (i10 == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                nq.jpo(true);
                return str2;
            }
            nq.jpo(false);
            nq.jpo(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.tu
    public com.bytedance.sdk.openadsdk.cm.my jd(JSONObject jSONObject) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        String strJd = "error unknown";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.zz.jpo() || !sq.cm().vzb() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
        int iJpo = 0;
        try {
            JSONObject jSONObjectJpo = jpo(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            cmVarJd.jpo(jSONObjectJpo.toString(), sq.cm().prr());
            cmVarJd.jd(com.bytedance.sdk.openadsdk.utils.tic.cm("/api/ad/union/sdk/stats/batch/"));
            jpo(cmVarJd, jSONObjectJpo);
            cmVarJd.jd(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.tic.cm());
            if (com.bytedance.sdk.openadsdk.core.settings.au.jrx().ota()) {
                cmVarJd.jd("_disable_retry", "1");
            }
            com.bytedance.sdk.component.qk.jd jdVarJpo = cmVarJd.jpo();
            try {
            } catch (Throwable unused) {
                i10 = 0;
                z10 = false;
            }
            if (jdVarJpo == null) {
                return new com.bytedance.sdk.openadsdk.cm.my(false, 0, "error unknown", false);
            }
            if (!jdVarJpo.jj() || TextUtils.isEmpty(jdVarJpo.cm())) {
                z12 = false;
                z10 = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(jdVarJpo.cm());
                int iOptInt = jSONObject2.optInt("code", -1);
                strJd = jSONObject2.optString("data", "");
                z10 = true;
                boolean z13 = iOptInt == 20000;
                z12 = z13;
                if (iOptInt != 60005) {
                    z10 = false;
                    z12 = z13;
                }
            }
            try {
                iJpo = jdVarJpo.jpo();
                z11 = z12;
                if (!jdVarJpo.jj()) {
                    strJd = jdVarJpo.jd();
                    com.bytedance.sdk.openadsdk.utils.rq.jpo(cmVarJd.cm());
                    z11 = z12;
                }
            } catch (Throwable unused2) {
                i10 = iJpo;
                iJpo = z12 ? 1 : 0;
                z11 = iJpo;
                iJpo = i10;
                com.bytedance.sdk.openadsdk.cm.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.cm.jpo.jpo.f19553jd, z11, iJpo, System.currentTimeMillis() - jCurrentTimeMillis);
                return new com.bytedance.sdk.openadsdk.cm.my(z11, iJpo, strJd, z10);
            }
            com.bytedance.sdk.openadsdk.cm.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.cm.jpo.jpo.f19553jd, z11, iJpo, System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.cm.my(z11, iJpo, strJd, z10);
        } catch (Throwable unused3) {
            com.bytedance.sdk.openadsdk.cm.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.cm.jpo.jpo.f19553jd, false, 0, System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.cm.my(false, 0, "error unknown", false);
        }
    }

    public static JSONArray jd(String str) throws JSONException {
        try {
            Set<String> setJd = com.bytedance.sdk.component.adexpress.jpo.jd.jd.jd(str);
            if (setJd != null && setJd.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setJd.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVarJpo = com.bytedance.sdk.component.adexpress.jpo.jd.jd.jpo(it.next());
                    if (jdVarJpo != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", jdVarJpo.jd());
                        jSONObject.put("md5", jdVarJpo.wqx());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.jpo("NetApiImpl", "getParentTplIds: ", e10);
            return null;
        }
    }

    private boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, tu.jpo jpoVar2) {
        if (jpoVar == null) {
            jpoVar2.jpo(40053, xyk.jpo(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.dt> listCm = jpoVar.cm();
        if (listCm.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.dt dtVar : listCm) {
            if (TextUtils.isEmpty(dtVar.mb().jd()) || TextUtils.isEmpty(dtVar.mb().wqx())) {
                jpoVar2.jpo(40053, xyk.jpo(40053));
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, com.bytedance.sdk.openadsdk.utils.tic.jpo(dtVar), "material_error", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.core.dt.13
                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jpo() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", dtVar.mb().jj());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    private void jpo(String str, int i10, int i11, com.bytedance.sdk.openadsdk.core.model.opi opiVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.zz.cm.jpo(str).jpo(i10).jd(i11).my(va.my(sq.jpo())).cm(va.wqx(sq.jpo())).wqx(1).jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, str, null), 4);
        } else {
            if (opiVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.zz.cm.jpo(opiVar).wqx(1).jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, opiVar.jpo(), null), 4);
        }
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, com.bytedance.sdk.openadsdk.core.model.opi opiVar) {
        if (opiVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zz.cm.jpo(opiVar).wqx(1).jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, opiVar.jpo(), new com.bytedance.sdk.component.my.hna() { // from class: com.bytedance.sdk.openadsdk.core.dt.14
            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(int i10, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(com.bytedance.sdk.component.my.ju juVar) {
            }
        }), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(com.bytedance.sdk.component.jd.jpo.yd r13, com.bytedance.sdk.openadsdk.core.model.hx r14, com.bytedance.sdk.openadsdk.utils.dm r15, com.bytedance.sdk.openadsdk.utils.dm r16, int r17, com.bytedance.sdk.openadsdk.utils.dm r18, com.bytedance.sdk.openadsdk.core.model.dt r19, java.lang.String r20) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.settings.jj r0 = com.bytedance.sdk.openadsdk.core.sq.cm()
            boolean r0 = r0.ic()
            if (r0 != 0) goto Lb
            goto L44
        Lb:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r2 = 0
            if (r14 == 0) goto L24
            com.bytedance.sdk.openadsdk.utils.dm r0 = r14.f20670yd     // Catch: java.lang.Exception -> L44
            long r4 = r0.jpo     // Catch: java.lang.Exception -> L44
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L24
            r5 = r18
            long r2 = r5.jpo(r0)     // Catch: java.lang.Exception -> L44
        L22:
            r10 = r2
            goto L27
        L24:
            r5 = r18
            goto L22
        L27:
            r9 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            jpo(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "load_ad_time"
            r13 = r19
            r14 = r20
            r15 = r0
            r18 = r8
            r16 = r10
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(r13, r14, r15, r16, r18)     // Catch: java.lang.Exception -> L44
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.dt.jpo(com.bytedance.sdk.component.jd.jpo.yd, com.bytedance.sdk.openadsdk.core.model.hx, com.bytedance.sdk.openadsdk.utils.dm, com.bytedance.sdk.openadsdk.utils.dm, int, com.bytedance.sdk.openadsdk.utils.dm, com.bytedance.sdk.openadsdk.core.model.dt, java.lang.String):void");
    }

    private static void jpo(com.bytedance.sdk.component.jd.jpo.yd ydVar, com.bytedance.sdk.openadsdk.core.model.hx hxVar, com.bytedance.sdk.openadsdk.utils.dm dmVar, com.bytedance.sdk.openadsdk.utils.dm dmVar2, int i10, com.bytedance.sdk.openadsdk.utils.dm dmVar3, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str, JSONObject jSONObject, boolean z10) throws JSONException {
        if (hxVar != null) {
            com.bytedance.sdk.openadsdk.utils.dm dmVar4 = hxVar.f20670yd;
            if (dmVar4.jpo > 0) {
                jSONObject.put("client_start_time", dmVar.jpo(dmVar4));
            }
        }
        jSONObject.put("network_time", dmVar2.jpo(dmVar));
        jSONObject.put("sever_time", i10);
        jSONObject.put("client_end_time", dmVar3.jpo(dmVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", dtVar.se() ? 1 : 0);
        }
        if (dtVar != null) {
            jSONObject.put("render_control_type", dtVar.cql());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.my.my.jpo().wqx());
        jSONObject.put("sync_barrier_open", z10 ? 1 : 0);
        long j10 = ydVar.f18609jd;
        if (j10 > 0) {
            jSONObject.put("enqueue_2_run_ts", ydVar.wqx - j10);
            jSONObject.put("run_2_connect_end_ts", ydVar.my - ydVar.f18609jd);
            jSONObject.put("connect_end_2_response_end_ts", ydVar.f18610jj - ydVar.my);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - ydVar.f18610jj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.cm.my jpo(JSONObject jSONObject, String str, boolean z10) {
        Object obj;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArrEncryptV3 = null;
            if (!com.bytedance.sdk.openadsdk.core.settings.zz.jpo()) {
                return null;
            }
            com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
            cmVarJd.jd(str);
            if (com.bytedance.sdk.openadsdk.core.settings.au.jrx().cql()) {
                cmVarJd.jd("_disable_retry", "1");
            }
            boolean z11 = true;
            if (z10) {
                com.bytedance.sdk.openadsdk.core.settings.jj jjVarJrx = com.bytedance.sdk.openadsdk.core.settings.au.jrx();
                PangleEncryptConstant.CryptDataScene cryptDataScene = PangleEncryptConstant.CryptDataScene.APP_LOG;
                boolean zJpo = jjVarJrx.jpo(cryptDataScene);
                byte[] bArrMy = my(jSONObject.toString());
                if (zJpo) {
                    Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(bArrMy);
                    if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                        bArrEncryptV3 = (byte[]) obj;
                        nq.jd(true);
                    } else {
                        int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                        nq.jd(false);
                        nq.jpo(1, cryptDataScene, iIntValue);
                    }
                }
                if (bArrEncryptV3 != null) {
                    cmVarJd.jd("Content-Encoding", "union_sdk_encode");
                    cmVarJd.jd("x-pgli18n", "4");
                    cmVarJd.jpo("application/octet-stream;tt-data=a", bArrEncryptV3);
                } else {
                    bArrEncryptV3 = PangleEncryptManager.encryptV3(bArrMy);
                    if (bArrEncryptV3 != null) {
                        jpo(jd(), cmVarJd);
                        cmVarJd.jpo("application/octet-stream;tt-data=a", bArrEncryptV3);
                    }
                }
            }
            if (bArrEncryptV3 == null) {
                try {
                    JSONObject jSONObjectJpo = com.bytedance.sdk.component.utils.jpo.jpo(jSONObject);
                    if (!wqx(jSONObjectJpo)) {
                        jSONObjectJpo = jSONObject;
                    }
                    jpo(cm(jSONObjectJpo), cmVarJd);
                    cmVarJd.jpo(jSONObjectJpo.toString(), sq.cm().prr());
                } catch (OutOfMemoryError e10) {
                    com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e10.toString());
                    return new com.bytedance.sdk.openadsdk.cm.my(false, -2, "encrypt_error", false);
                }
            }
            com.bytedance.sdk.component.qk.jd jdVarJpo = cmVarJd.jpo();
            boolean zMy = (jdVarJpo == null || !jdVarJpo.jj() || TextUtils.isEmpty(jdVarJpo.cm())) ? false : my(new JSONObject(jdVarJpo.cm()));
            String strJd = "error unknown";
            int iJpo = jdVarJpo != null ? jdVarJpo.jpo() : 0;
            if (!zMy && iJpo == 200) {
                strJd = "server say not success";
            } else {
                if (jdVarJpo != null && jdVarJpo.jd() != null) {
                    strJd = jdVarJpo.jd();
                }
                z11 = false;
            }
            if (jdVarJpo == null) {
                com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("applog", str, -1, "response is null");
            } else if (!jdVarJpo.jj()) {
                com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("applog", str, iJpo, jdVarJpo.jd());
            }
            jpo(jSONObject, z10);
            com.bytedance.sdk.openadsdk.cm.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.cm.jpo.jpo.jpo, zMy, iJpo, System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.cm.my(zMy, iJpo, strJd, z11);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo("NetApiImpl", "uploadEvent error", th2);
            return new com.bytedance.sdk.openadsdk.cm.my(false, 509, "service_busy", false);
        }
    }

    private void jpo(Map<String, String> map, com.bytedance.sdk.component.qk.jd.cm cmVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    cmVar.jd(entry.getKey(), entry.getValue());
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", "ADD header exceptopn", e10.getMessage());
                }
            }
        }
        try {
            cmVar.jd(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.tic.cm());
        } catch (Exception e11) {
            com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", "ADD header exceptopn", e11.getMessage());
        }
    }

    private void jpo(JSONObject jSONObject, boolean z10) throws Throwable {
        Object obj;
        if (zz.jd().opi()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", "reportETEvent error", e10.getMessage());
            }
            com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
            cmVarJd.jd(com.bytedance.sdk.openadsdk.utils.tic.rq());
            byte[] bArrEncryptV3 = null;
            if (z10) {
                com.bytedance.sdk.openadsdk.core.settings.jj jjVarJrx = com.bytedance.sdk.openadsdk.core.settings.au.jrx();
                PangleEncryptConstant.CryptDataScene cryptDataScene = PangleEncryptConstant.CryptDataScene.APP_LOG;
                boolean zJpo = jjVarJrx.jpo(cryptDataScene);
                byte[] bArrMy = my(jSONObject.toString());
                if (zJpo) {
                    Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(bArrMy);
                    if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                        bArrEncryptV3 = (byte[]) obj;
                        nq.jd(true);
                    } else {
                        int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                        nq.jd(false);
                        nq.jpo(1, cryptDataScene, iIntValue);
                    }
                }
                if (bArrEncryptV3 != null) {
                    cmVarJd.jd("Content-Encoding", "union_sdk_encode");
                    cmVarJd.jd("x-pgli18n", "4");
                    cmVarJd.jpo("application/octet-stream;tt-data=a", bArrEncryptV3);
                } else {
                    bArrEncryptV3 = PangleEncryptManager.encryptV3(bArrMy);
                    if (bArrEncryptV3 != null) {
                        jpo(jd(), cmVarJd);
                        cmVarJd.jpo("application/octet-stream;tt-data=a", bArrEncryptV3);
                    }
                }
            }
            if (bArrEncryptV3 == null) {
                JSONObject jSONObjectJpo = com.bytedance.sdk.component.utils.jpo.jpo(jSONObject);
                if (wqx(jSONObjectJpo)) {
                    jSONObject = jSONObjectJpo;
                }
                jpo(cm(jSONObject), cmVarJd);
                cmVarJd.jpo(jSONObject.toString(), sq.cm().prr());
            }
            cmVarJd.jpo(7);
            cmVarJd.jpo("et_applog");
            cmVarJd.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.dt.15
                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                    if (jdVar == null || !jdVar.jj()) {
                        return;
                    }
                    jdVar.cm();
                }

                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    public void jpo(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObjectJd;
        if (com.bytedance.sdk.openadsdk.core.settings.zz.jpo() && (jSONObjectJd = jd(str, list, jSONObject, str2, str3)) != null) {
            com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
            final String strCm = com.bytedance.sdk.openadsdk.utils.tic.cm("/api/ad/union/dislike_event/");
            JSONObject jSONObjectJpo = jpo(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectJd);
            String string = jSONObjectJpo != null ? jSONObjectJpo.toString() : null;
            jpo(cmVarJd, jSONObjectJpo);
            cmVarJd.jd(strCm);
            cmVarJd.cm(string);
            cmVarJd.jpo(7);
            cmVarJd.jpo("dislike");
            com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.2
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h("dislike");
                }
            });
            cmVarJd.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.dt.3
                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                    if (jdVar == null) {
                        com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("dislike", strCm, -1, "response is null");
                        com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.3.3
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h("dislike");
                            }
                        });
                    } else if (jdVar.jj()) {
                        com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.3.1
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h("dislike");
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.3.2
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h("dislike");
                            }
                        });
                        com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("dislike", strCm, jdVar.jpo(), jdVar.jd());
                    }
                }

                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                    com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("dislike", strCm, -1, iOException != null ? iOException.getMessage() : AbstractJsonLexerKt.NULL);
                    if (wqxVar != null) {
                        com.bytedance.sdk.openadsdk.utils.rq.jpo(wqxVar.cm());
                    }
                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.3.4
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            return a.h("dislike");
                        }
                    });
                }
            });
            try {
                String strOptString = new JSONObject(str).optString(BidResponsedEx.KEY_CID, "");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("dislike", strOptString, (String) null, (String) null);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.nmd.wqx(e10.getMessage(), new Object[0]);
            }
        }
    }

    private static JSONObject jpo(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.core.settings.au.jrx().jpo(cryptDataScene)) {
            JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new hmu(cryptDataScene));
            nq.jpo(jSONObjectEncryptType4);
            return jSONObjectEncryptType4;
        }
        return com.bytedance.sdk.component.utils.jpo.jpo(jSONObject);
    }

    private JSONArray jpo(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private void jpo(tu.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
        jpoVar.jpo(-1, xyk.jpo(-1));
        wqxVar.jpo(-1);
        com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(tu.jd jdVar) {
        jdVar.jpo(-1, xyk.jpo(-1));
    }

    public static JSONObject jpo(AdSlot adSlot) throws JSONException {
        hx hxVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", sq.cm().tic());
            jSONObject.put("lmt", DeviceUtils.wqx());
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, zz.jd().yd());
            jSONObject.put("pa_consent", zz.jd().ju());
            jSONObject.put("is_gdpr_user", sq.cm().nzb());
            if (adSlot != null && hx.jpo.containsKey(Integer.valueOf(adSlot.getCodeId())) && (hxVar = hx.jpo.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", hxVar.jd());
                jSONObject.put("lastbundle", hxVar.wqx());
                jSONObject.put("lastclick", hxVar.cm());
                jSONObject.put("lastskip", hxVar.my());
            }
            jpo(jSONObject, "data", jd(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void jpo(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject jpo(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.core.model.hx hxVar) throws JSONException {
        Object obj;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i10);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS, adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (hxVar != null) {
                jSONObject.put("render_method", hxVar.zz);
                int i11 = hxVar.zz;
                if (i11 == 1) {
                    jpo(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i11 == 2) {
                    jpo(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                jpo(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", jd(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", wqx(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", wqx(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i10));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i10 == 1 || i10 == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (hxVar != null && (obj2 = hxVar.f20669qk) != null) {
                jSONObject.put("session_params", obj2);
            }
            if (hxVar != null && (obj = hxVar.xyk) != null) {
                jSONObject.put("common_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i10 == 7 || i10 == 8) {
                adCount = 1;
            }
            if (hxVar != null && hxVar.my != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i10 == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject3.put("type", adSlot.getBannerType());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void jpo(JSONObject jSONObject, String str, int i10, int i11) throws JSONException {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i10);
            jSONObject2.put("height", i11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void jpo(JSONObject jSONObject, String str, float f10, float f11) throws JSONException {
        if (f10 < 0.0f || f11 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f10);
            jSONObject2.put("height", (int) f11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    public void jpo(JSONObject jSONObject, final tu.jd jdVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.zz.jpo()) {
            if (jdVar != null) {
                jdVar.jpo(1000, "Ad request is temporarily paused, Please contact your AM");
            }
        } else {
            if (jSONObject == null || jdVar == null) {
                return;
            }
            JSONObject jSONObjectJpo = jpo(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
            com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
            try {
                cmVarJd.jd(com.bytedance.sdk.openadsdk.xyk.cm.jpo(cmVarJd, com.bytedance.sdk.openadsdk.utils.tic.cm("/api/ad/union/sdk/reward_video/reward/")));
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e10.getMessage());
            }
            jpo(cmVarJd, jSONObjectJpo);
            cmVarJd.cm(jSONObjectJpo != null ? jSONObjectJpo.toString() : "");
            cmVarJd.jpo(10);
            cmVarJd.jpo(C3434s.f38309j);
            com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.4
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h(C3434s.f38309j);
                }
            });
            cmVarJd.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.dt.5
                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar2) {
                    jd jdVarJpo;
                    int i10;
                    if (jdVar2 == null) {
                        com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.5.3
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h(C3434s.f38309j);
                            }
                        });
                        com.bytedance.sdk.openadsdk.prr.jpo.my.jpo(C3434s.f38309j, wqxVar.cm(), -1, "response is null");
                        dt.this.jpo(jdVar);
                        return;
                    }
                    if (!jdVar2.jj() || TextUtils.isEmpty(jdVar2.cm())) {
                        String strJpo = xyk.jpo(-2);
                        int iJpo = jdVar2.jpo();
                        if (!jdVar2.jj() && !TextUtils.isEmpty(jdVar2.jd())) {
                            strJpo = jdVar2.jd();
                        }
                        jdVar.jpo(iJpo, strJpo);
                        com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.5.2
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h(C3434s.f38309j);
                            }
                        });
                        if (jdVar2.jj()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.prr.jpo.my.jpo(C3434s.f38309j, wqxVar.cm(), iJpo, strJpo);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(jdVar2.cm());
                        String strJd = dt.jd(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strJd)) {
                            try {
                                jSONObject2 = new JSONObject(strJd);
                            } catch (Throwable unused) {
                            }
                        }
                        jdVarJpo = jd.jpo(jSONObject2);
                        i10 = jdVarJpo.jpo;
                    } catch (JSONException e11) {
                        com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", e11.getMessage());
                        dt.this.jpo(jdVar);
                    }
                    if (i10 != 20000) {
                        jdVar.jpo(i10, xyk.jpo(i10));
                    } else if (jdVarJpo.wqx == null) {
                        dt.this.jpo(jdVar);
                    } else {
                        jdVar.jpo(jdVarJpo);
                        com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.5.1
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h(C3434s.f38309j);
                            }
                        });
                    }
                }

                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                    String message;
                    if (iOException != null) {
                        message = iOException.getMessage();
                    } else {
                        message = "";
                    }
                    jdVar.jpo(-2, message);
                    if (wqxVar != null) {
                        String strCm = wqxVar.cm();
                        com.bytedance.sdk.openadsdk.utils.rq.jpo(strCm);
                        com.bytedance.sdk.openadsdk.prr.jpo.my.jpo(C3434s.f38309j, strCm, -1, message);
                    }
                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.dt.5.4
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            return a.h(C3434s.f38309j);
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    public JSONObject jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strJd = jd(iOptInt, strOptString);
            if (TextUtils.isEmpty(strJd)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strJd);
            try {
                jSONObject2.put("auction_price", strOptString2);
                return jSONObject2;
            } catch (Throwable unused) {
                return jSONObject2;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    private void jpo(com.bytedance.sdk.component.qk.jd.cm cmVar, JSONObject jSONObject) {
        try {
            if (wqx(jSONObject) && jSONObject.optInt("cypher") == 4) {
                cmVar.jd("x-pgli18n", "4");
                cmVar.jd("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    public com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpo() {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarJpo = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.zz.jpo()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tpl_fetch_model", "date", 0L);
        String strKln = sq.cm().kln();
        String strJd = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= sq.cm().hmu() && jCurrentTimeMillis >= 0 && TextUtils.equals(strKln, strJd)) {
            String strJd2 = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(strJd2)) {
                    return com.bytedance.sdk.component.adexpress.jpo.wqx.jpo.my(strJd2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
            String strJpo = com.bytedance.sdk.openadsdk.xyk.cm.jpo(jdVarWqx, strKln);
            jdVarWqx.jd(strJpo);
            com.bytedance.sdk.component.qk.jd jdVarJpo = jdVarWqx.jpo();
            if (jdVarJpo == null || !jdVarJpo.jj()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(jdVarJpo.cm());
            jSONObject.put("template_fetch_url", strJpo);
            jpoVarJpo = com.bytedance.sdk.component.adexpress.jpo.wqx.jpo.jpo(jSONObject);
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tpl_fetch_model", "model", jSONObject.toString());
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tpl_fetch_model", "last_url", strKln);
            return jpoVarJpo;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("NetApiImpl", th2.getMessage());
            return jpoVarJpo;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    public void jpo(String str) {
        com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
        jdVarWqx.jd(str);
        jdVarWqx.jpo("upload_bidding");
        jdVarWqx.jpo(7);
        jdVarWqx.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.dt.6
            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                jdVar.cm();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu
    public void jpo(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
        cmVarJd.jd(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        cmVarJd.jd("cypher", (String) pairGenerateRequestHeader.first);
        cmVarJd.jd("transfer-param", (String) pairGenerateRequestHeader.second);
        cmVarJd.jd("x-pangle-target-idc", sq.cm().ez());
        cmVarJd.jpo(jSONObject);
        cmVarJd.jpo(5);
        cmVarJd.jpo("apm_pv");
        cmVarJd.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.dt.7
            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                jdVar.cm();
            }
        });
    }
}
