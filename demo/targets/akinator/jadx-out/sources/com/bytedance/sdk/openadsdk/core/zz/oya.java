package com.bytedance.sdk.openadsdk.core.zz;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.kln;
import com.bytedance.sdk.openadsdk.utils.duq;
import j1.o2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya {
    /* JADX INFO: Access modifiers changed from: private */
    public static void cm(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strJpo = com.bytedance.sdk.openadsdk.core.ju.wqx.jpo(strOptString, str);
                File fileJpo = jpo(strJpo);
                if (fileJpo != null && fileJpo.exists() && fileJpo.length() > 0) {
                    return;
                } else {
                    wqx(strJpo);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wqx(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strJpo = com.bytedance.sdk.openadsdk.core.ju.wqx.jpo(strOptString, str);
                File fileJpo = jpo(strJpo);
                if (fileJpo != null && fileJpo.exists() && fileJpo.length() > 0) {
                    return;
                } else {
                    wqx(strJpo);
                }
            }
        }
    }

    public static boolean jd(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        kln klnVarJrx;
        return (dtVar == null || (klnVarJrx = dtVar.jrx()) == null || klnVarJrx.jj() == null) ? false : true;
    }

    public static void jpo(final com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        duq.jd(new com.bytedance.sdk.component.xyk.xyk("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.zz.oya.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                kln klnVarJrx;
                kln.jpo jpoVarJj;
                com.bytedance.sdk.openadsdk.core.model.dt dtVar2 = dtVar;
                if (dtVar2 == null || (klnVarJrx = dtVar2.jrx()) == null || (jpoVarJj = klnVarJrx.jj()) == null) {
                    return;
                }
                String strRee = com.bytedance.sdk.openadsdk.core.settings.au.jrx().ree();
                oya.jpo(dtVar, jpoVarJj.jpo(), strRee);
                oya.wqx(jpoVarJj.jd(), strRee);
                oya.cm(jpoVarJj.wqx(), strRee);
            }
        });
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, JSONArray jSONArray, String str) throws IOException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strJpo = com.bytedance.sdk.openadsdk.core.ju.wqx.jpo(strOptString, str);
                String strJpo2 = com.bytedance.sdk.component.utils.my.jpo(strJpo);
                InputStream inputStreamJpo = com.bytedance.sdk.openadsdk.zz.cm.jpo(strJpo, strJpo2);
                if (inputStreamJpo != null) {
                    try {
                        inputStreamJpo.close();
                    } catch (IOException unused) {
                    }
                } else {
                    com.bytedance.sdk.openadsdk.zz.cm.jpo(strJpo).wqx(1).jpo(strJpo2).jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, strJpo, new com.bytedance.sdk.component.my.hna() { // from class: com.bytedance.sdk.openadsdk.core.zz.oya.2
                        @Override // com.bytedance.sdk.component.my.hna
                        public void jpo(int i11, String str2, Throwable th2) {
                        }

                        @Override // com.bytedance.sdk.component.my.hna
                        public void jpo(com.bytedance.sdk.component.my.ju juVar) {
                            juVar.jpo();
                        }
                    }), 4);
                }
            }
        }
    }

    public static InputStream jd(String str) {
        File fileJpo = jpo(str);
        if (fileJpo == null || !fileJpo.exists() || fileJpo.length() <= 0) {
            return null;
        }
        try {
            return new FileInputStream(fileJpo);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("ExpressStaticResPreload", th2.getMessage());
            return null;
        }
    }

    private static void wqx(String str) {
        File fileJpo = jpo(str);
        if (fileJpo == null) {
            return;
        }
        File file = new File(fileJpo + ".tmp");
        com.bytedance.sdk.component.qk.jd.jpo jpoVarCm = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().cm();
        jpoVarCm.jpo(8);
        jpoVarCm.jpo("preloadStaticRes");
        jpoVarCm.jd(str);
        jpoVarCm.jpo(fileJpo.getParent(), fileJpo.getName());
        com.bytedance.sdk.component.qk.jd jdVarJpo = jpoVarCm.jpo();
        if (jdVarJpo != null && jdVarJpo.jj() && jdVarJpo.my() != null && jdVarJpo.my().exists()) {
            com.bytedance.sdk.component.utils.nmd.jpo("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (fileJpo.exists()) {
            try {
                fileJpo.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("ExpressStaticResPreload", th2.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.nmd.wqx("ExpressStaticResPreload", th3.getMessage());
            }
        }
    }

    public static File jpo(String str) {
        String strL;
        String strJpo = com.bytedance.sdk.component.utils.my.jpo(str);
        if (strJpo == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            strL = o2.l(name, "/express_static_res/");
        } else {
            strL = o2.l(name, "/express_static_res/");
        }
        return com.bytedance.sdk.component.utils.qk.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), com.bytedance.sdk.openadsdk.multipro.jd.wqx(), strL, strJpo);
    }
}
