package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.falconx.a.a f17036a;

    /* renamed from: b, reason: collision with root package name */
    private Queue<String> f17037b;

    /* renamed from: c, reason: collision with root package name */
    private b f17038c;

    /* renamed from: d, reason: collision with root package name */
    private File f17039d;

    private a(b bVar) {
        new ArrayList();
        this.f17036a = new com.bykv.vk.openvk.preload.falconx.a.a();
        this.f17037b = new LinkedBlockingQueue();
        this.f17038c = bVar;
        File fileN = bVar.n();
        this.f17039d = fileN;
        fileN.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.f17038c);
    }

    public static /* synthetic */ void d(a aVar) {
        new ArrayList().addAll(aVar.f17038c.e());
        try {
            String strA = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(new com.bykv.vk.openvk.preload.geckox.a.a());
            if (aVar.f17038c.p() != null && aVar.f17038c.p().a()) {
                aVar.f17038c.p();
            } else if (aVar.f17037b.size() < 10) {
                aVar.f17037b.add(strA);
            }
        } catch (Throwable unused) {
        }
    }

    public static a a(b bVar) {
        List<String> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        bVar.a();
        return new a(bVar);
    }

    private boolean b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> listE = this.f17038c.e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it = listE.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), entry.getKey())) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a() {
        List<String> listD = this.f17038c.d();
        List<String> listE = this.f17038c.e();
        if (listD == null || listD.isEmpty() || listE == null || listE.isEmpty()) {
            return false;
        }
        for (String str : listE) {
            Iterator<String> it = listD.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        this.f17036a.a(cls, aVar);
    }

    public final void a(final Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        final String str = BuildConfig.FLAVOR;
        if (!TextUtils.isEmpty(BuildConfig.FLAVOR)) {
            if (a()) {
                if (b(map)) {
                    final com.bykv.vk.openvk.preload.geckox.e.a aVar = null;
                    final Map map2 = null;
                    b.h().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVarA;
                            GeckoLogger.d("gecko-debug-tag", "start check update...", str);
                            if (a.this.f17038c.b() != null) {
                                bVarA = a.this.f17038c.b().a();
                                bVarA.a(a.this.f17038c.b(), a.this.f17038c.n(), a.this.f17038c.e());
                            } else {
                                bVarA = null;
                            }
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVar = bVarA;
                            try {
                                try {
                                    a.this.f17038c.a(new JSONObject());
                                    GeckoLogger.d("gecko-debug-tag", "update finished", com.bykv.vk.openvk.preload.geckox.h.a.a(aVar, a.this.f17039d, a.this.f17038c, a.this.f17036a, map2, map, str).a((com.bykv.vk.openvk.preload.b.b<Object>) str));
                                    if (bVar != null) {
                                        bVar.a();
                                    }
                                    JSONObject jSONObjectF = a.this.f17038c.f();
                                    if (jSONObjectF == null) {
                                        jSONObjectF = new JSONObject();
                                    }
                                    try {
                                        jSONObjectF.put("download_duration", SystemClock.elapsedRealtime() - a.this.f17038c.s());
                                    } catch (Throwable unused) {
                                    }
                                    a.this.f17038c.q().upload("download_gecko_end", jSONObjectF);
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                } catch (Exception e10) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("success", false);
                                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, e10.toString());
                                        jSONObject.put("code", 2);
                                        a.this.f17038c.a(jSONObject);
                                    } catch (Throwable unused2) {
                                    }
                                    GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", e10);
                                    if (bVar != null) {
                                        bVar.a();
                                    }
                                    JSONObject jSONObjectF2 = a.this.f17038c.f();
                                    if (jSONObjectF2 == null) {
                                        jSONObjectF2 = new JSONObject();
                                    }
                                    try {
                                        jSONObjectF2.put("download_duration", SystemClock.elapsedRealtime() - a.this.f17038c.s());
                                    } catch (Throwable unused3) {
                                    }
                                    a.this.f17038c.q().upload("download_gecko_end", jSONObjectF2);
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                }
                                a.d(a.this);
                            } catch (Throwable th2) {
                                if (bVar != null) {
                                    bVar.a();
                                }
                                JSONObject jSONObjectF3 = a.this.f17038c.f();
                                if (jSONObjectF3 == null) {
                                    jSONObjectF3 = new JSONObject();
                                }
                                try {
                                    jSONObjectF3.put("download_duration", SystemClock.elapsedRealtime() - a.this.f17038c.s());
                                } catch (Throwable unused4) {
                                }
                                a.this.f17038c.q().upload("download_gecko_end", jSONObjectF3);
                                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                throw th2;
                            }
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("target keys not in deployments keys");
            }
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        throw new IllegalArgumentException("groupType == null");
    }
}
