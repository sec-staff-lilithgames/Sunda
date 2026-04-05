package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class kln implements uu {
    private static final Map<Integer, String> wqx = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.kln.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, Q6.U0);
            put(4, "apk-sign");
            put(5, "screen_scale");
            put(6, "app_set_id_scope");
            put(7, "app_set_id");
            put(8, "installed_source");
            put(9, "app_running_time");
            put(10, "vendor");
            put(11, "model");
            put(12, "user_agent_device");
            put(13, "user_agent_webview");
            put(14, "sys_compiling_time");
            put(15, "sec_did");
            put(16, "url");
            put(17, "X-Argus");
            put(18, "X-Ladon");
            put(19, "X-Khronos");
            put(20, "X-Gorgon");
            put(21, "pangle_m");
            put(22, "screen_height");
            put(23, "screen_width");
            put(24, "rom_version");
            put(25, "carrier_name");
            put(26, "os_version");
            put(27, "conn_type");
            put(28, "boot");
            put(29, "feature_data");
            put(30, "t_ver");
            put(31, CampaignEx.JSON_KEY_AAB);
            put(32, "w_ver");
            put(33, "is_fold");
            put(34, "abi");
            put(35, "is_multi");
        }
    };
    String jpo = "com.union_test.internationad";

    /* renamed from: jd, reason: collision with root package name */
    String f20572jd = "8025677";

    /* renamed from: cm, reason: collision with root package name */
    private int f20571cm = 0;

    public static void jj() {
        try {
            com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.kln.2
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h("bidding_token");
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAdManagerImpl", th2.getMessage());
        }
    }

    public static void qk() {
        try {
            com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.kln.3
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h("bidding_token");
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAdManagerImpl", th2.getMessage());
        }
    }

    public static void xyk() {
        try {
            com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.kln.4
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h("bidding_token");
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAdManagerImpl", th2.getMessage());
        }
    }

    private boolean zz() {
        return "TX".equals(com.bytedance.sdk.openadsdk.core.settings.au.jrx().ef()) || TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.au.jrx().ef());
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public kln jpo(String str) throws JSONException {
        zz.jd().jpo(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    /* renamed from: my, reason: merged with bridge method [inline-methods] */
    public kln jd(String str) {
        zz.jd().wqx(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public String wqx() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public int cm() {
        return this.f20571cm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public uu jd(int i10) {
        zz.jd().cm(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public uu jpo(int i10) {
        zz.jd().jj(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public uu my(int i10) {
        zz.jd().my(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public uu wqx(int i10) {
        this.f20571cm = i10;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public uu cm(int i10) {
        zz.jd().wqx(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public int jd() {
        return zz.jd().yd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public uu jpo() {
        com.bytedance.sdk.component.utils.prr.jpo("PangleSDK-7605");
        com.bykv.vk.openvk.jpo.jpo.jpo.qk.wqx.jpo("PangleSDK-7605");
        com.bytedance.sdk.component.utils.nmd.jpo("PangleSDK-7605");
        com.bytedance.sdk.component.utils.prr.jd();
        com.bytedance.sdk.component.qk.jpo.jpo();
        com.bykv.vk.openvk.jpo.jpo.jpo.qk.wqx.jpo();
        com.bytedance.sdk.component.utils.nmd.jpo();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public int my() {
        return zz.jd().ju();
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public uu wqx(String str) {
        zz.jd().xyk(str);
        return this;
    }

    private JSONObject jd(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.sq.cm().pdm(r4) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x02b9, TryCatch #0 {all -> 0x02b9, blocks: (B:3:0x0008, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:11:0x002f, B:18:0x004a, B:20:0x004e, B:22:0x0058, B:24:0x005c, B:27:0x007e, B:28:0x0092, B:30:0x00ad, B:34:0x00cc, B:33:0x00bb, B:35:0x00d3, B:37:0x00eb, B:41:0x0102, B:43:0x011f, B:45:0x012c, B:46:0x0135, B:48:0x0205, B:49:0x0215, B:52:0x0231, B:54:0x023c, B:55:0x024e, B:57:0x025b, B:61:0x026a, B:63:0x0270, B:65:0x027d, B:66:0x0293, B:68:0x0299, B:69:0x029c, B:71:0x02a2, B:72:0x02ae, B:38:0x00f1, B:40:0x00fd, B:14:0x003a, B:16:0x0040), top: B:76:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x02b9, TryCatch #0 {all -> 0x02b9, blocks: (B:3:0x0008, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:11:0x002f, B:18:0x004a, B:20:0x004e, B:22:0x0058, B:24:0x005c, B:27:0x007e, B:28:0x0092, B:30:0x00ad, B:34:0x00cc, B:33:0x00bb, B:35:0x00d3, B:37:0x00eb, B:41:0x0102, B:43:0x011f, B:45:0x012c, B:46:0x0135, B:48:0x0205, B:49:0x0215, B:52:0x0231, B:54:0x023c, B:55:0x024e, B:57:0x025b, B:61:0x026a, B:63:0x0270, B:65:0x027d, B:66:0x0293, B:68:0x0299, B:69:0x029c, B:71:0x02a2, B:72:0x02ae, B:38:0x00f1, B:40:0x00fd, B:14:0x003a, B:16:0x0040), top: B:76:0x0008 }] */
    @Override // com.bytedance.sdk.openadsdk.core.uu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String jpo(com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest r15) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.kln.jpo(com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest):java.lang.String");
    }

    private JSONObject jpo(JSONObject jSONObject, boolean z10) {
        JSONObject jSONObjectJpo;
        if (z10) {
            jSONObjectJpo = PangleEncryptManager.encryptType4(jSONObject, new hmu(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            nq.jpo(jSONObjectJpo);
        } else {
            jSONObjectJpo = com.bytedance.sdk.component.utils.jpo.jpo(jSONObject);
        }
        return jSONObjectJpo != null ? jSONObjectJpo : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.uu
    public boolean jpo(String str, int i10, String str2, String str3, String str4) {
        if (!this.jpo.equals(sq.jpo().getPackageName()) || !this.f20572jd.equals(zz.jd().cm()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.component.reward.yd.jpo(str, i10, str2, str3, str4);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
