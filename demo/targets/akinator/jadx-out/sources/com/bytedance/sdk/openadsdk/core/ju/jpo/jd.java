package com.bytedance.sdk.openadsdk.core.ju.jpo;

import a.b;
import android.text.TextUtils;
import ao.kwoC.zAQQWzBxnS;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static volatile jd jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(int i10, String str, String str2);

        void jpo(JSONObject jSONObject, String str);
    }

    private void jd(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.ju.jpo.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.ju.jpo.jpo();
        jpoVar.wqx(str).my(str3).cm(str4).jd(str2).jpo(str5).jpo(Long.valueOf(System.currentTimeMillis()));
        wqx.jpo().jpo(jpoVar);
        jd();
    }

    public static jd jpo() {
        if (jpo == null) {
            synchronized (jd.class) {
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

    public void jpo(com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVar, String str) {
        if (jpoVar == null || TextUtils.isEmpty(jpoVar.jpo())) {
            return;
        }
        StringBuilder sbT = b.t(str, "_");
        sbT.append(jpoVar.jpo());
        final String string = sbT.toString();
        final String strWqx = jpoVar.wqx();
        final String strJd = jpoVar.jd();
        final String strCm = jpoVar.cm();
        String strMy = jpoVar.my();
        if (TextUtils.isEmpty(strMy)) {
            if (str.equals("ad")) {
                strMy = zz.jd().cm();
            } else if (str.equals("adv3")) {
                strMy = zz.jd().cm() + "_v3";
            }
        }
        final String str2 = strMy;
        duq.jpo(new xyk("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.jd.1
            @Override // java.lang.Runnable
            public void run() {
                jd.this.jpo(string, strWqx, strJd, strCm, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd() {
        int iCm = sq.cm().cm();
        if (iCm <= 0) {
            iCm = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.ju.jpo.jpo> listJd = wqx.jpo().jd();
        if (listJd == null || listJd.isEmpty() || iCm >= listJd.size()) {
            if (listJd == null) {
                return;
            }
            listJd.size();
            return;
        }
        int size = (int) (listJd.size() - (iCm * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.ju.jpo.jpo jpoVar : listJd) {
            treeMap.put(jpoVar.cm(), jpoVar);
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                com.bytedance.sdk.openadsdk.core.ju.jpo.jpo jpoVar2 = (com.bytedance.sdk.openadsdk.core.ju.jpo.jpo) entry.getValue();
                if (jpoVar2 != null) {
                    hashSet.add(jpoVar2.jpo());
                }
            }
        }
        jpo(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str, String str2, String str3, String str4, String str5) {
        if (jpo(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            jd(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            jpo(str2, str, str3, str5, (jpo) null);
        } else {
            jd(str2, str3, str5, str4, str);
        }
    }

    public void jpo(String str, String str2, String str3, String str4, String str5, final jpo jpoVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (jpoVar != null) {
                jpoVar.jpo(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String strD = i.d(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.ju.jpo.jpo jpoVarJpo = jpo(strD, str4);
        if (jpoVarJpo != null && !TextUtils.isEmpty(jpoVarJpo.my())) {
            jpo(jpoVarJpo);
            if (jpoVar != null) {
                try {
                    jpoVar.jpo(new JSONObject(jpoVarJpo.my()), "local");
                    return;
                } catch (JSONException unused) {
                    jpoVar.jpo(2, "parse json exception data is " + jpoVarJpo.my(), "local");
                    return;
                }
            }
            return;
        }
        jpo(str2, strD, str4, str5, new jpo() { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.jd.2
            @Override // com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo
            public void jpo(JSONObject jSONObject, String str6) {
                jpo jpoVar2 = jpoVar;
                if (jpoVar2 != null) {
                    jpoVar2.jpo(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo
            public void jpo(int i10, String str6, String str7) {
                jpo jpoVar2 = jpoVar;
                if (jpoVar2 != null) {
                    jpoVar2.jpo(i10, str6, str7);
                }
            }
        });
    }

    private void jpo(final String str, final String str2, final String str3, final String str4, final jpo jpoVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (jpoVar != null) {
                jpoVar.jpo(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
            jdVarWqx.jd(str);
            jdVarWqx.jpo(7);
            jdVarWqx.jpo("load_ug_t");
            jdVarWqx.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.jd.3
                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                    if (jdVar == null) {
                        return;
                    }
                    if (!jdVar.jj()) {
                        jpo jpoVar2 = jpoVar;
                        if (jpoVar2 != null) {
                            jpoVar2.jpo(3, "net code error code is " + jdVar.jpo() + " message is " + jdVar.jd(), "net");
                            return;
                        }
                        return;
                    }
                    String strCm = jdVar.cm();
                    if (TextUtils.isEmpty(strCm)) {
                        jpo jpoVar3 = jpoVar;
                        if (jpoVar3 != null) {
                            jpoVar3.jpo(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    wqx.jpo().jpo(new com.bytedance.sdk.openadsdk.core.ju.jpo.jpo().jpo(str2).jd(str3).wqx(str).my(str4).cm(strCm).jpo(Long.valueOf(System.currentTimeMillis())));
                    jd.this.jd();
                    if (jpoVar != null) {
                        try {
                            jpoVar.jpo(new JSONObject(strCm), "net");
                        } catch (JSONException unused) {
                            jpoVar.jpo(2, zAQQWzBxnS.fzec.concat(String.valueOf(strCm)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                    jpo jpoVar2 = jpoVar;
                    if (jpoVar2 != null) {
                        jpoVar2.jpo(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.ju.jpo.jpo> jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return wqx.jpo().jpo(str);
    }

    public String jpo(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.ju.jpo.jpo jpoVarJpo = jpo(i.d(str, "_", str2), str3);
        if (jpoVarJpo == null) {
            return null;
        }
        jpo(jpoVarJpo);
        return jpoVarJpo.my();
    }

    private com.bytedance.sdk.openadsdk.core.ju.jpo.jpo jpo(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return wqx.jpo().jpo(str, str2);
    }

    private void jpo(final com.bytedance.sdk.openadsdk.core.ju.jpo.jpo jpoVar) {
        jpoVar.jpo(Long.valueOf(System.currentTimeMillis()));
        duq.jpo(new xyk("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.jd.4
            @Override // java.lang.Runnable
            public void run() {
                wqx.jpo().jpo(jpoVar);
            }
        }, 10);
    }

    public void jpo(Set<String> set) {
        try {
            wqx.jpo().jpo(set);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
