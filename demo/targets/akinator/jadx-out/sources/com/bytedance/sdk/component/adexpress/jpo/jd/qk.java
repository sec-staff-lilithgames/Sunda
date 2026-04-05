package com.bytedance.sdk.component.adexpress.jpo.jd;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {
    private static volatile qk jpo;

    /* renamed from: jd, reason: collision with root package name */
    private AtomicBoolean f18519jd = new AtomicBoolean(false);

    private qk() {
    }

    private JSONObject wqx(String str) {
        com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
        if (wqxVarWqx == null) {
            return null;
        }
        com.bytedance.sdk.component.qk.jd.jd jdVarQk = wqxVarWqx.qk();
        jdVarQk.jd(str);
        com.bytedance.sdk.component.qk.jd jdVarJpo = jdVarQk.jpo();
        if (jdVarJpo != null) {
            try {
                if (jdVarJpo.jj() && jdVarJpo.cm() != null) {
                    return new JSONObject(jdVarJpo.cm());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> jd(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return jj.jpo().jd(str);
    }

    public static qk jpo() {
        if (jpo == null) {
            synchronized (qk.class) {
                try {
                    if (jpo == null) {
                        jpo = new qk();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    private void jd() {
        if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx() == null) {
            return;
        }
        int iJpo = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jpo();
        if (iJpo <= 0) {
            iJpo = 100;
        }
        List<com.bytedance.sdk.component.adexpress.jpo.wqx.jd> listJd = jj.jpo().jd();
        if (listJd == null || listJd.isEmpty() || iJpo >= listJd.size()) {
            if (listJd == null) {
                return;
            }
            listJd.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVar : listJd) {
            treeMap.put(jdVar.qk(), jdVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listJd.size() - (iJpo * 0.75f));
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVar2 = (com.bytedance.sdk.component.adexpress.jpo.wqx.jd) entry.getValue();
                if (jdVar2 != null) {
                    hashSet.add(jdVar2.jd());
                }
            }
        }
        jpo(hashSet);
        this.f18519jd.set(false);
    }

    public com.bytedance.sdk.component.adexpress.jpo.wqx.jd jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return jj.jpo().jpo(str);
    }

    public void jpo(com.bytedance.sdk.component.adexpress.jpo.wqx.cm cmVar, String str) {
        String strXyk;
        if (cmVar == null) {
            return;
        }
        final String str2 = cmVar.jpo;
        final String str3 = cmVar.wqx;
        final String str4 = cmVar.f18528jd;
        final String str5 = cmVar.f18527cm;
        final String str6 = cmVar.my;
        if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx() != null) {
            strXyk = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().xyk();
        } else {
            strXyk = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strXyk : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.cm.cm.jpo(new com.bytedance.sdk.component.xyk.xyk("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.jpo.jd.qk.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                qk.this.jpo(str2, str3, str4, str5, str6, str7);
            }
        }, 10);
    }

    private void jd(String str, String str2, String str3, String str4, String str5, String str6) {
        jj.jpo().jpo(new com.bytedance.sdk.component.adexpress.jpo.wqx.jd().jpo(str).jd(str2).wqx(str3).cm(str4).my(str5).jj(str6).jpo(Long.valueOf(System.currentTimeMillis())), false);
        jd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void jpo(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (jpo(str) != null) {
                    if (!TextUtils.isEmpty(str4)) {
                        if (!TextUtils.isEmpty(str3)) {
                            str7 = str5;
                            jd(str6, str, str3, str2, str4, str7);
                        }
                    }
                    return;
                }
                str7 = str5;
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                    jpo(str2, str6, str);
                } else {
                    jd(str6, str, str3, str2, str4, str7);
                }
                boolean zJpo = xyk.jpo(str7);
                if (!jd.my() || zJpo) {
                    my.jd().jpo(true);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    private void jpo(String str, String str2, String str3) {
        JSONObject jSONObjectWqx;
        if (TextUtils.isEmpty(str) || (jSONObjectWqx = wqx(str)) == null) {
            return;
        }
        String strOptString = jSONObjectWqx.optString("md5");
        String strOptString2 = jSONObjectWqx.optString("version");
        String strOptString3 = jSONObjectWqx.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVarJpo = new com.bytedance.sdk.component.adexpress.jpo.wqx.jd().jpo(str2).jd(str3).wqx(strOptString).cm(str).my(strOptString3).jj(strOptString2).jpo(Long.valueOf(System.currentTimeMillis()));
        jj.jpo().jpo(jdVarJpo, false);
        jd();
        if (xyk.jpo(strOptString2)) {
            jdVarJpo.jj(strOptString2);
            my.jd().jpo(true);
        }
    }

    public void jpo(Set<String> set) {
        try {
            jj.jpo().jpo(set);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
