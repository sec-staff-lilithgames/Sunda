package com.bytedance.sdk.component.adexpress.jpo.jd;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.cm.zz;
import com.bytedance.sdk.component.adexpress.jpo.wqx.jpo;
import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    static Object jpo = new Object();

    public static com.bytedance.sdk.component.adexpress.jpo.wqx.jpo cm() {
        return my.jd().jj();
    }

    public static void jd() {
        try {
            xyk.cm();
            File fileXyk = my.xyk();
            if (fileXyk == null || !fileXyk.exists()) {
                return;
            }
            if (fileXyk.getParentFile() != null) {
                com.bytedance.sdk.component.utils.qk.wqx(fileXyk.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.qk.wqx(fileXyk);
            }
        } catch (Throwable unused) {
        }
    }

    private static String jj() {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarCm = cm();
        if (jpoVarCm == null) {
            return null;
        }
        return jpoVarCm.cm();
    }

    public static void jpo() {
        my.jd();
    }

    public static boolean my() {
        return my.jd().my();
    }

    private static File qk(String str) {
        List<Pair<String, String>> listJd;
        jpo.jd jdVarMy = cm().my();
        if (jdVarMy != null && (listJd = jdVarMy.jd()) != null && listJd.size() > 0) {
            for (Pair<String, String> pair : listJd) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(my.xyk(), (String) pair.first);
                }
            }
        }
        return null;
    }

    public static String wqx() {
        return jj.wqx();
    }

    public static String cm(String str) {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar;
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarCm = cm();
        if (jpoVarCm == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return jj();
        }
        Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo = jpoVarCm.jpo();
        if (mapJpo == null || mapJpo.size() <= 0 || (jpoVar = mapJpo.get(str)) == null) {
            return null;
        }
        return jpoVar.cm();
    }

    public static com.bytedance.sdk.component.adexpress.jpo.wqx.jd jpo(String str) {
        return qk.jpo().jpo(str);
    }

    private static boolean my(String str) {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarCm;
        List<jpo.C0080jpo> listJj;
        if (!my() || (jpoVarCm = cm()) == null || (listJj = jpoVarCm.jj()) == null) {
            return false;
        }
        for (jpo.C0080jpo c0080jpo : listJj) {
            if (c0080jpo != null && TextUtils.equals(str, c0080jpo.jpo())) {
                return true;
            }
        }
        return false;
    }

    public static com.bytedance.sdk.component.adexpress.jpo.wqx.jd wqx(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVarJpo = qk.jpo().jpo(str);
        if (jdVarJpo != null) {
            jdVarJpo.jpo(Long.valueOf(System.currentTimeMillis()));
            jpo(jdVarJpo);
        }
        return jdVarJpo;
    }

    private static File jj(String str) throws IOException {
        if (my()) {
            Iterator<jpo.C0080jpo> it = cm().jj().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jpo.C0080jpo next = it.next();
                if (next.jpo() != null && next.jpo().equals(str)) {
                    File file = new File(my.xyk(), com.bytedance.sdk.component.utils.my.jpo(next.jpo()));
                    String strJpo = com.bytedance.sdk.component.utils.my.jpo(file);
                    if (next.jd() == null || !next.jd().equals(strJpo)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    public static void jpo(com.bytedance.sdk.component.adexpress.jpo.wqx.cm cmVar) {
        qk.jpo().jpo(cmVar, cmVar.f18529jj);
    }

    private static void jpo(final com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVar) {
        com.bytedance.sdk.component.adexpress.cm.cm.jpo(new com.bytedance.sdk.component.xyk.xyk("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.jpo.jd.jd.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (jd.jpo) {
                    jj.jpo().jpo(jdVar, true);
                }
            }
        }, 10);
    }

    public static jpo jpo(String str, zz.jpo jpoVar, String str2, String str3) throws IOException {
        File fileJj;
        jpo jpoVar2 = new jpo();
        if (TextUtils.isEmpty(str3)) {
            fileJj = null;
        } else {
            fileJj = jd(str3, str);
            if (fileJj != null) {
                jpoVar2.jpo(1);
            }
        }
        if (fileJj == null && (fileJj = qk(str)) != null) {
            jpoVar2.jpo(3);
        }
        if (fileJj == null && (fileJj = jj(str)) != null) {
            jpoVar2.jpo(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!jpo(str, str3)) {
                jpoVar2.jpo(4);
            }
        } else if (!my(str)) {
            jpoVar2.jpo(6);
        }
        jpoVar2.jd();
        if (fileJj != null) {
            try {
                jpoVar2.jpo(new WebResourceResponse(jpoVar.jpo(), G5.N, new FileInputStream(fileJj)));
            } catch (Throwable unused) {
            }
        }
        return jpoVar2;
    }

    public static Set<String> jd(String str) {
        return qk.jpo().jd(str);
    }

    private static File jd(String str, String str2) throws IOException {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar;
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarCm = cm();
        if (jpoVarCm != null && my()) {
            Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo = jpoVarCm.jpo();
            if (mapJpo.size() != 0 && (jpoVar = mapJpo.get(str)) != null) {
                Iterator<jpo.C0080jpo> it = jpoVar.jj().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    jpo.C0080jpo next = it.next();
                    if (next.jpo() != null && next.jpo().equals(str2)) {
                        File file = new File(my.xyk(), com.bytedance.sdk.component.utils.my.jpo(next.jpo()));
                        String strJpo = com.bytedance.sdk.component.utils.my.jpo(file);
                        if (next.jd() == null || !next.jd().equals(strJpo)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static boolean jd(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean jpo(String str, String str2) {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarCm;
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar;
        if (!my() || (jpoVarCm = cm()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo = jpoVarCm.jpo();
        if (mapJpo.size() == 0 || (jpoVar = mapJpo.get(str2)) == null) {
            return false;
        }
        for (jpo.C0080jpo c0080jpo : jpoVar.jj()) {
            if (c0080jpo != null && TextUtils.equals(str, c0080jpo.jpo())) {
                return true;
            }
        }
        return false;
    }

    public static boolean jpo(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}
