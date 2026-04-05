package com.bytedance.sdk.openadsdk.jj;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.xyk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.prr.jpo.cm;
import com.bytedance.sdk.openadsdk.prr.wqx;
import com.bytedance.sdk.openadsdk.utils.kln;
import com.ironsource.C3352n2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static volatile jd jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.hna.jpo> f21193jd = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.hna.jpo wqx = null;

    /* renamed from: cm, reason: collision with root package name */
    private volatile boolean f21192cm = false;
    private volatile HandlerThread my = null;

    /* renamed from: jj, reason: collision with root package name */
    private volatile Handler f21194jj = null;

    /* renamed from: qk, reason: collision with root package name */
    private String f21195qk = "";
    private int xyk = 0;
    private volatile long zz = 0;

    /* renamed from: yd, reason: collision with root package name */
    private final Runnable f21196yd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.jj.jd.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (jpo.jpo().my()) {
                        Set<String> setKeySet = jd.this.f21193jd.keySet();
                        if (setKeySet.size() > jd.this.xyk) {
                            jd.this.xyk = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(jd.this.f21193jd.values());
                        Collections.sort(arrayList);
                        for (int i10 = 0; i10 < arrayList.size() && i10 < 5; i10++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.hna.jpo) arrayList.get(i10)).jd());
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.hna.jpo jpoVar = (com.bytedance.sdk.openadsdk.hna.jpo) jd.this.f21193jd.get(str);
                                if (jpoVar != null) {
                                    JSONObject jSONObjectJpo = jpoVar.jpo(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectJpo);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e10) {
                            nmd.wqx(e10.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (jd.this.wqx != null) {
                                jSONObject.put("common", jd.this.wqx.jpo(jSONObject2));
                            }
                        } catch (JSONException e11) {
                            nmd.wqx(e11.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    nmd.wqx(th2.getMessage(), new Object[0]);
                }
                jd.this.f21195qk = jSONObject.toString();
                jd jdVar = jd.this;
                jdVar.jpo(jdVar.f21196yd, jpo.jpo().cm());
            } catch (OutOfMemoryError e12) {
                nmd.wqx(e12.getMessage(), new Object[0]);
            }
        }
    };

    private jd() {
    }

    private void my() {
        if (this.f21192cm) {
            return;
        }
        this.f21192cm = true;
        jpo(this.f21196yd, jpo.jpo().cm());
    }

    private void cm() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.zz > 10000) {
            wqx.jpo("track_feature_result", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.jj.jd.1
                @Override // com.bytedance.sdk.openadsdk.prr.jd
                public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                    jd.this.zz = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(jd.this.xyk));
                    return cm.jd().jpo("track_feature_result").jd(jSONObject.toString());
                }
            });
        }
    }

    private Handler wqx() {
        if (this.my == null || !this.my.isAlive()) {
            synchronized (oya.class) {
                try {
                    if (this.my == null || !this.my.isAlive()) {
                        this.my = xyk.jpo("csj_feature", -1);
                        this.f21194jj = new Handler(this.my.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (this.f21194jj == null) {
            synchronized (oya.class) {
                try {
                    if (this.f21194jj == null) {
                        this.f21194jj = new Handler(this.my.getLooper());
                    }
                } finally {
                }
            }
        }
        return this.f21194jj;
    }

    public void jd() {
        try {
            if (jpo.jpo().wqx()) {
                jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jj.jd.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!jpo.jpo().my()) {
                            if (jd.this.wqx != null) {
                                jd.this.wqx.jpo();
                            }
                        } else {
                            Iterator it = jd.this.f21193jd.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.hna.jpo jpoVar = (com.bytedance.sdk.openadsdk.hna.jpo) jd.this.f21193jd.get((String) it.next());
                                if (jpoVar != null) {
                                    jpoVar.jpo();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e10) {
            nmd.wqx(e10.getMessage(), new Object[0]);
        }
    }

    private void jpo(Runnable runnable) {
        if (kln.jpo || runnable == null) {
            return;
        }
        try {
            wqx().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(Runnable runnable, long j10) {
        if (kln.jpo || runnable == null) {
            return;
        }
        try {
            wqx().postDelayed(runnable, j10);
        } catch (Throwable unused) {
        }
    }

    public static jd jpo() {
        if (jpo == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.wqx.class) {
                try {
                    if (jpo == null) {
                        jpo = new jd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public void jpo(JSONObject jSONObject) throws JSONException {
        if (jpo.jpo().wqx()) {
            try {
                jSONObject.put("feature_data", this.f21195qk);
                cm();
            } catch (JSONException e10) {
                nmd.wqx(e10.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && jpo.jpo().wqx()) {
                my();
                if (jpo.jpo().my()) {
                    com.bytedance.sdk.openadsdk.hna.jpo jpoVar = this.f21193jd.get(str2);
                    if (jpoVar == null) {
                        jpoVar = new com.bytedance.sdk.openadsdk.hna.jpo(str2);
                    }
                    jpoVar.jpo(str, str3);
                    this.f21193jd.put(str2, jpoVar);
                    return;
                }
                if (this.wqx == null) {
                    this.wqx = new com.bytedance.sdk.openadsdk.hna.jpo(str2);
                }
                this.wqx.jpo(str, str3);
            }
        } catch (OutOfMemoryError e10) {
            nmd.wqx(e10.getMessage(), new Object[0]);
        }
    }

    public void jpo(final String str, final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !jpo.jpo().wqx()) {
            return;
        }
        if (!C3352n2.f37928v.equals(str) && !"click".equals(str) && !"dislike".equals(str)) {
            if (jpo.jpo().opi()) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jj.jd.3
                    @Override // java.lang.Runnable
                    public void run() {
                        jd.this.jpo(str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jj.jd.2
            @Override // java.lang.Runnable
            public void run() {
                jd.this.jpo(str, str2, str3);
            }
        });
    }

    public void jpo(final String str, final dt dtVar) {
        if (!TextUtils.isEmpty(str) && jpo.jpo().wqx() && dt.my(dtVar)) {
            if (!jpo.jpo().opi() || dtVar.jp() == 8 || dtVar.jp() == 7 || dtVar.jp() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jj.jd.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String strRoc = dtVar.roc();
                            String strHbg = dtVar.hbg();
                            if (TextUtils.isEmpty(strRoc)) {
                                return;
                            }
                            jd.this.jpo(str, strRoc, strHbg);
                        }
                    });
                }
            }
        }
    }

    public void jpo(final String str, final dt dtVar, final String str2) {
        if (TextUtils.isEmpty(str) || !jpo.jpo().wqx()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jj.jd.5
                @Override // java.lang.Runnable
                public void run() {
                    dt dtVar2 = dtVar;
                    if (dtVar2 == null || TextUtils.isEmpty(dtVar2.roc())) {
                        return;
                    }
                    jd.this.jpo(str, dtVar.roc(), dtVar.hbg() + str2);
                }
            });
        }
    }
}
