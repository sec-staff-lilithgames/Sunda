package com.bytedance.sdk.openadsdk.zz;

import android.content.Context;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.jj;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.my.cm.wqx.my;
import com.bytedance.sdk.component.my.nmd;
import com.bytedance.sdk.component.my.prr;
import com.bytedance.sdk.component.my.rq;
import com.bytedance.sdk.component.my.wqx.my;
import com.bytedance.sdk.component.utils.yd;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.opi;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nzb;
import com.bytedance.sdk.openadsdk.utils.va;
import hr.kNq.ikJMrW;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class jpo {

        /* renamed from: jd, reason: collision with root package name */
        private static final prr f21666jd = jpo(sq.jpo());
        public static boolean jpo = true;
        private static int wqx = 10;

        /* renamed from: cm, reason: collision with root package name */
        private static int f21665cm = 15;
        private static int my = 30;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.bytedance.sdk.openadsdk.zz.cm$jpo$jpo, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0157jpo implements com.bytedance.sdk.component.my.cm {
            private C0157jpo() {
            }

            @Override // com.bytedance.sdk.component.my.cm
            /* renamed from: jd, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.my.jd.wqx jpo(com.bytedance.sdk.component.my.my myVar) throws IOException {
                ju juVarJj = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jj();
                Cif cifJd = new Cif.jpo().jd(myVar.jpo()).jpo().jd();
                oya oyaVarJd = null;
                com.bytedance.sdk.component.my.jd.cm cmVar = myVar.wqx() ? new com.bytedance.sdk.component.my.jd.cm() : null;
                if (cmVar != null) {
                    cmVar.jpo(System.currentTimeMillis());
                }
                try {
                    oyaVarJd = juVarJj.jpo(cifJd).jd();
                    if (cmVar != null) {
                        cmVar.jd(System.currentTimeMillis());
                    }
                    return new com.bytedance.sdk.component.my.jd.wqx(oyaVarJd.wqx(), oyaVarJd.jj().cm(), "", jpo(myVar, oyaVarJd));
                } catch (Throwable th2) {
                    try {
                        return jpo(cmVar, th2);
                    } finally {
                        yd.jpo(oyaVarJd);
                    }
                }
            }

            private Map<String, String> jpo(com.bytedance.sdk.component.my.my myVar, oya oyaVar) {
                if (!myVar.jd()) {
                    return null;
                }
                jj jjVarQk = oyaVar.qk();
                HashMap map = new HashMap();
                int iJpo = jjVarQk.jpo();
                for (int i10 = 0; i10 < iJpo; i10++) {
                    String strJpo = jjVarQk.jpo(i10);
                    String strJd = jjVarQk.jd(i10);
                    if (strJpo != null) {
                        map.put(strJpo, strJd);
                    }
                }
                return map;
            }

            private com.bytedance.sdk.component.my.jd.wqx jpo(com.bytedance.sdk.component.my.jd.cm cmVar, Throwable th2) {
                th2.getMessage();
                if (cmVar != null) {
                    cmVar.wqx(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.my.jd.wqx wqxVar = new com.bytedance.sdk.component.my.jd.wqx(98765, th2, "net failed");
                wqxVar.jpo(cmVar);
                return wqxVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.my.yd jd(String str) {
            return jpo(f21666jd.jpo(str).my(va.my(sq.jpo())).cm(va.wqx(sq.jpo())));
        }

        public static void jpo() {
            jpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("image_config", "use_new_img", 1) == 1;
            wqx = com.bytedance.sdk.openadsdk.rq.jpo.jpo("image_config", ikJMrW.RtiBpdtso, 10);
            f21665cm = com.bytedance.sdk.openadsdk.rq.jpo.jpo("image_config", "data_cache_count", 15);
            my = com.bytedance.sdk.openadsdk.rq.jpo.jpo("image_config", "disk_cache_count", 30);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.my.yd jd(opi opiVar) {
            return jpo(f21666jd.jpo(opiVar.jpo()).jpo(opiVar.jd()).jd(opiVar.wqx()).my(va.my(sq.jpo())).cm(va.wqx(sq.jpo())).jpo(opiVar.qk()));
        }

        private static prr jpo(Context context) {
            jpo();
            if (jpo) {
                return com.bytedance.sdk.component.my.cm.wqx.jd.jpo(context, new my.jpo().jpo(new com.bytedance.sdk.component.my.cm.wqx.jpo.jd(0, wqx, f21665cm, my, new File(CacheDirFactory.getImageCacheDir("image_p")))).jpo(com.bytedance.sdk.openadsdk.multipro.jd.wqx()).jpo(new nmd() { // from class: com.bytedance.sdk.openadsdk.zz.cm.jpo.2
                    @Override // com.bytedance.sdk.component.my.nmd
                    public ExecutorService jd() {
                        return duq.wqx();
                    }

                    @Override // com.bytedance.sdk.component.my.nmd
                    public ExecutorService jpo() {
                        return duq.jd();
                    }
                }).jpo(new rq() { // from class: com.bytedance.sdk.openadsdk.zz.cm.jpo.1
                    @Override // com.bytedance.sdk.component.my.rq
                    public void jpo(int i10, String str) {
                        com.bytedance.sdk.openadsdk.prr.wqx.jpo(str, true);
                    }
                }).jpo(new C0157jpo()).jpo());
            }
            return com.bytedance.sdk.component.my.wqx.jd.jpo(context, new my.jpo().jpo(new com.bytedance.sdk.component.my.wqx.jpo.jpo(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir("image")))).jpo(com.bytedance.sdk.openadsdk.multipro.jd.wqx()).jpo(new nmd() { // from class: com.bytedance.sdk.openadsdk.zz.cm.jpo.4
                @Override // com.bytedance.sdk.component.my.nmd
                public ExecutorService jd() {
                    return null;
                }

                @Override // com.bytedance.sdk.component.my.nmd
                public ExecutorService jpo() {
                    return duq.jd();
                }
            }).jpo(new rq() { // from class: com.bytedance.sdk.openadsdk.zz.cm.jpo.3
                @Override // com.bytedance.sdk.component.my.rq
                public void jpo(int i10, String str) {
                    com.bytedance.sdk.openadsdk.prr.wqx.jpo(str, false);
                }
            }).jpo(new C0157jpo()).jpo());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream jd(String str, String str2) {
            return f21666jd.jpo(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean jd(String str, String str2, String str3) {
            return f21666jd.jpo(str, str2, str3);
        }

        private static com.bytedance.sdk.component.my.yd jpo(com.bytedance.sdk.component.my.yd ydVar) {
            return nzb.jpo() ? ydVar.jpo(new my()) : ydVar;
        }
    }

    public static boolean jd() {
        return jpo.jpo;
    }

    public static com.bytedance.sdk.component.my.yd jpo(String str) {
        return jpo.jd(str);
    }

    public static com.bytedance.sdk.component.my.yd jpo(opi opiVar) {
        return jpo.jd(opiVar);
    }

    public static InputStream jpo(String str, String str2) {
        return jpo.jd(str, str2);
    }

    public static boolean jpo(String str, String str2, String str3) {
        return jpo.jd(str, str2, str3);
    }

    public static prr jpo() {
        return jpo.f21666jd;
    }
}
