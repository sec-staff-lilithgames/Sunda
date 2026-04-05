package com.bytedance.sdk.openadsdk.qk;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.prr.wqx;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static final String[] jpo = {"gecko16-normal-useast5.tiktokv.us"};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.qk.jd$jd, reason: collision with other inner class name */
    public static class C0153jd {
        private static final jd jpo = new jd();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo();
    }

    private static String cm() {
        String[] strArrWcn = sq.cm().wcn();
        if (strArrWcn == null) {
            strArrWcn = jpo;
        }
        String str = strArrWcn[new SecureRandom().nextInt(strArrWcn.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = jpo;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public static void wqx() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.qk.jd.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return duq.my();
                }
            });
        } catch (Throwable th2) {
            nmd.jpo("GeckoHub", "setThreadPoolExecutor error", th2);
        }
    }

    public ILoader jd() {
        try {
            return GeckoHubImp.inst(sq.jpo()).getGeckoResLoader();
        } catch (Throwable th2) {
            nmd.jpo("GeckoHub", "getGeckoResLoader error", th2);
            return null;
        }
    }

    private jd() {
        try {
            GeckoHubImp.inst(sq.jpo());
        } catch (Throwable th2) {
            nmd.jpo("GeckoHub", "GeckoHubImp init error", th2);
        }
    }

    public static jd jpo() {
        return C0153jd.jpo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(Map<String, dt> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<dt> it = map.values().iterator();
            while (it.hasNext()) {
                wqx.jpo(it.next(), jSONObject);
            }
        } catch (Throwable th2) {
            nmd.jpo("GeckoHub", "upLoadStateEvent error", th2);
        }
    }

    public void jpo(Map<String, dt> map) {
        jpo(map, (jpo) null, false);
    }

    public void jpo(final Map<String, dt> map, final jpo jpoVar, boolean z10) {
        try {
            String strJpo = Cif.jpo(sq.jpo());
            if (TextUtils.isEmpty(strJpo)) {
                return;
            }
            for (dt dtVar : map.values()) {
                if (dtVar != null) {
                    if (!z10 && dtVar.sbz()) {
                        map.remove(dtVar.afh());
                    } else {
                        wqx.jd(dtVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(cm());
            GeckoHubImp.inst(sq.jpo()).preload(strJpo, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.qk.jd.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        dt dtVar2 = (dt) map.get(jSONObject.optString("channel"));
                        if (dtVar2 != null) {
                            wqx.jpo.jpo(str, jSONObject, dtVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        jpo jpoVar2 = jpoVar;
                        if (jpoVar2 != null) {
                            jpoVar2.jpo();
                        }
                        jd.jd(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.qk.jpo());
        } catch (Throwable th2) {
            jd(map, null, th2.toString());
            nmd.jpo("GeckoHub", "releaseGeckoResLoader error", th2);
        }
    }

    public void jpo(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(sq.jpo()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th2) {
                nmd.jpo("GeckoHub", "releaseGeckoResLoader error", th2);
            }
        }
    }

    public WebResourceResponseModel jpo(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(sq.jpo()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th2) {
            nmd.jpo("GeckoHub", "findRes error", th2);
            return null;
        }
    }

    public int jpo(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(sq.jpo()).getResCount(iLoader, str);
        } catch (Throwable th2) {
            nmd.jpo("GeckoHub", "getResCount error", th2);
            return 0;
        }
    }
}
