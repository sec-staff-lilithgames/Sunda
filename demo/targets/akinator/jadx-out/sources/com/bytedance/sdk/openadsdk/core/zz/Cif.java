package com.bytedance.sdk.openadsdk.core.zz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.core.zz.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {

    /* renamed from: jd, reason: collision with root package name */
    private static String f21060jd;
    private static String jpo;

    public static String jd() {
        String strWqx;
        if (jpo == null) {
            jpo = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarJd = com.bytedance.sdk.component.adexpress.jpo.jd.xyk.jd();
        if (jpoVarJd != null && (strWqx = jpoVarJd.wqx()) != null && !strWqx.equals(jpo)) {
            jpo = strWqx;
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_sp", "js_render_ver", strWqx);
        }
        return jpo;
    }

    public static void jpo() {
        com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jpo(new com.bytedance.sdk.component.adexpress.jpo.jpo.jd() { // from class: com.bytedance.sdk.openadsdk.core.zz.if.1
            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.jd
            public int jpo(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.jd
            public Cursor jpo(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.wqx(com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.jd
            public int jpo(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.jd
            public void jpo(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jpo(new com.bytedance.sdk.component.adexpress.jpo.jpo.wqx() { // from class: com.bytedance.sdk.openadsdk.core.zz.if.2

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.bytedance.sdk.openadsdk.core.zz.if$2$1, reason: invalid class name */
            public class AnonymousClass1 implements Runnable {

                /* renamed from: jd, reason: collision with root package name */
                final /* synthetic */ int f21062jd;
                final /* synthetic */ MessageQueue[] jpo;
                final /* synthetic */ int wqx;

                public AnonymousClass1(MessageQueue[] messageQueueArr, int i10, int i11) {
                    this.jpo = messageQueueArr;
                    this.f21062jd = i10;
                    this.wqx = i11;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.jpo[0] = Looper.myQueue();
                    jpo(this.jpo[0], this.f21062jd, this.wqx);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public ExecutorService au() {
                if (duq.m495if()) {
                    return duq.my();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public void cm() {
                int iHuv = com.bytedance.sdk.openadsdk.core.sq.cm().huv();
                int iYa = com.bytedance.sdk.openadsdk.core.sq.cm().ya();
                if (iHuv == 0 && iYa == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.my.my.jpo().jpo(iHuv);
                com.bytedance.sdk.component.adexpress.my.my.jpo().jd(iYa);
                int iJj = com.bytedance.sdk.openadsdk.rq.jpo.jj();
                int iMy = com.bytedance.sdk.openadsdk.rq.jpo.my();
                if (iJj == 0 && iMy == 0) {
                    return;
                }
                jpo(com.bytedance.sdk.openadsdk.core.oya.wqx().getLooper().getQueue(), iMy, iJj);
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public int hna() {
                return va.my(com.bytedance.sdk.openadsdk.core.sq.jpo());
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            /* renamed from: if */
            public int mo411if() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public com.bytedance.sdk.component.qk.jd.jpo jj() {
                com.bytedance.sdk.component.qk.jd.jpo jpoVarCm = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().cm();
                jpoVarCm.jpo(8);
                jpoVarCm.jpo("express_down");
                return jpoVarCm;
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public int ju() {
                return com.bytedance.sdk.openadsdk.core.sq.cm().ya();
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public com.bytedance.sdk.component.adexpress.jpo.wqx.jpo my() {
                return com.bytedance.sdk.openadsdk.core.sq.wqx().jpo();
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public int opi() {
                return com.bytedance.sdk.openadsdk.rq.jpo.jpo("gaussian_blur_type", 0);
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public ExecutorService oya() {
                if (duq.m495if()) {
                    return duq.yd();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public int prr() {
                return va.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo());
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public com.bytedance.sdk.component.qk.jd.jd qk() {
                com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
                jdVarWqx.jpo(8);
                jdVarWqx.jpo("express_get");
                return jdVarWqx;
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public boolean sq() {
                return com.bytedance.sdk.openadsdk.rq.jpo.jpo("destroy_render_script", true);
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public Handler wqx() {
                return com.bytedance.sdk.openadsdk.core.oya.wqx();
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public String xyk() {
                return com.bytedance.sdk.openadsdk.core.zz.jd().cm();
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public int yd() {
                return com.bytedance.sdk.openadsdk.core.sq.cm().huv();
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public int zz() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public Context jd() {
                return com.bytedance.sdk.openadsdk.core.sq.jpo();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void jd(final MessageQueue messageQueue, final int i10) {
                if (messageQueue == null || i10 <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.zz.if.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.jpo.jd(i10, false, messageQueue).jd();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.wqx
            public int jpo() {
                if (com.bytedance.sdk.openadsdk.core.sq.cm() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.sq.cm().cm();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void jpo(final MessageQueue messageQueue, final int i10, final int i11) {
                if (messageQueue != null) {
                    final int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.if.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            jd(messageQueue, i10);
                            jpo(messageQueue, i11);
                        }
                    };
                    if (iJpo > 0) {
                        com.bytedance.sdk.openadsdk.core.oya.wqx().postDelayed(runnable, iJpo);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void jpo(final MessageQueue messageQueue, final int i10) {
                if (messageQueue == null || i10 <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.zz.if.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.jpo.jd(i10, true, messageQueue).jd();
                        return false;
                    }
                });
            }
        });
        com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jpo(new com.bytedance.sdk.component.adexpress.jpo.jpo.cm() { // from class: com.bytedance.sdk.openadsdk.core.zz.if.3
            @Override // com.bytedance.sdk.component.adexpress.jpo.jpo.cm
            public void jpo(int i10) {
                com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo(com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jd(i10).jj(com.bytedance.sdk.openadsdk.core.xyk.jpo(i10)));
            }
        });
        com.bytedance.sdk.component.zz.jpo.jpo.jpo().jpo(new com.bytedance.sdk.component.zz.jpo.jd() { // from class: com.bytedance.sdk.openadsdk.core.zz.if.4
            @Override // com.bytedance.sdk.component.zz.jpo.jd
            public void jpo(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.cm.wqx.wqx(com.bytedance.sdk.openadsdk.utils.jd.jd(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.zz.jpo.jd
            public void jpo(com.bytedance.sdk.component.zz.jd.jpo jpoVar, String str, String str2, JSONObject jSONObject, long j10) {
                com.bytedance.sdk.openadsdk.core.model.dt dtVar = new com.bytedance.sdk.openadsdk.core.model.dt();
                dtVar.hmu(jpoVar.jpo());
                dtVar.se(jpoVar.jd());
                dtVar.dt(jpoVar.wqx());
                com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, str, str2, jSONObject, j10);
            }

            @Override // com.bytedance.sdk.component.zz.jpo.jd
            public void jpo(com.bytedance.sdk.component.zz.jd.jpo jpoVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (jpoVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.dt dtVar = new com.bytedance.sdk.openadsdk.core.model.dt();
                    dtVar.hmu(jpoVar.jpo());
                    dtVar.se(jpoVar.jd());
                    dtVar.dt(jpoVar.wqx());
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.core.zz.if.4.1
                        @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                        public JSONObject jpo() {
                            return jSONObject;
                        }

                        @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                        public JSONObject wqx() {
                            return jSONObject2;
                        }
                    });
                }
            }
        });
    }

    public static String wqx() {
        Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo;
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar;
        String strWqx;
        if (f21060jd == null) {
            f21060jd = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarJd = com.bytedance.sdk.component.adexpress.jpo.jd.xyk.jd();
        if (jpoVarJd != null && (mapJpo = jpoVarJd.jpo()) != null && (jpoVar = mapJpo.get("v3")) != null && (strWqx = jpoVar.wqx()) != null && !strWqx.equals(f21060jd)) {
            f21060jd = strWqx;
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_sp", "js_render_v3_ver", strWqx);
        }
        return f21060jd;
    }
}
