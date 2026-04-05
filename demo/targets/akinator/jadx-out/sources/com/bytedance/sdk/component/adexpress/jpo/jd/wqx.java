package com.bytedance.sdk.component.adexpress.jpo.jd;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.jpo.wqx.jpo;
import com.bytedance.sdk.component.utils.rv;
import com.ironsource.G5;
import j1.o2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx {
    public List<jpo.C0080jpo> jd(com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<jpo.C0080jpo> arrayList3 = new ArrayList<>();
        if (jpoVar2 == null || jpoVar2.jj().isEmpty()) {
            arrayList2.addAll(jpoVar.jj());
        } else if (jpoVar.jj().isEmpty()) {
            arrayList.addAll(jpoVar2.jj());
        } else {
            for (jpo.C0080jpo c0080jpo : jpoVar.jj()) {
                if (!jpoVar2.jj().contains(c0080jpo) && c0080jpo != null && c0080jpo.jpo() != null && c0080jpo.jd() != null) {
                    arrayList2.add(c0080jpo);
                }
            }
            for (jpo.C0080jpo c0080jpo2 : jpoVar2.jj()) {
                if (!jpoVar.jj().contains(c0080jpo2)) {
                    arrayList.add(c0080jpo2);
                }
            }
        }
        if (jpo(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public abstract File jpo();

    public boolean jpo(Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar = map.get(it.next());
            if (jpoVar != null && !jpo(jpoVar.jj())) {
                return false;
            }
        }
        return true;
    }

    public void wqx(List<jpo.C0080jpo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<jpo.C0080jpo> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(jpo(), com.bytedance.sdk.component.utils.my.jpo(it.next().jpo()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean jpo(List<jpo.C0080jpo> list) throws IOException {
        if (list == null || list.size() <= 0 || jpo() == null) {
            return false;
        }
        for (jpo.C0080jpo c0080jpo : list) {
            String strJpo = com.bytedance.sdk.component.utils.my.jpo(c0080jpo.jpo());
            if (TextUtils.isEmpty(strJpo)) {
                return false;
            }
            File file = new File(jpo(), strJpo);
            String strJpo2 = com.bytedance.sdk.component.utils.my.jpo(file);
            if (!file.exists() || !file.isFile() || c0080jpo.jd() == null || !c0080jpo.jd().equals(strJpo2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean wqx(com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar2) {
        if (jpoVar != null) {
            try {
                if (!TextUtils.isEmpty(jpoVar.wqx())) {
                    if (jpoVar2 == null) {
                        return false;
                    }
                    String strQk = jpoVar.qk();
                    String strQk2 = jpoVar2.qk();
                    if ((!TextUtils.isEmpty(strQk2) && !strQk2.equals(strQk)) || jpo(jpoVar.wqx(), jpoVar2.wqx())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo = jpoVar.jpo();
                    Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo2 = jpoVar2.jpo();
                    if (mapJpo.isEmpty()) {
                        return !mapJpo2.isEmpty();
                    }
                    if (mapJpo2.isEmpty()) {
                        return false;
                    }
                    return jpo(mapJpo, mapJpo2);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean jpo(jpo.jd jdVar) {
        if (jdVar == null || jpo() == null) {
            return false;
        }
        List<Pair<String, String>> listJd = jdVar.jd();
        if (listJd == null || listJd.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listJd.iterator();
        while (it.hasNext()) {
            File file = new File(jpo(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void jd(List<jpo.C0080jpo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<jpo.C0080jpo> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(jpo(), com.bytedance.sdk.component.utils.my.jpo(it.next().jpo()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<jpo.C0080jpo> jpo(com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo = jpoVar.jpo();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<jpo.C0080jpo> arrayList3 = new ArrayList<>();
        if (mapJpo.size() == 0) {
            if (jpoVar2 != null && jpoVar2.jpo().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo2 = jpoVar2.jpo();
                Iterator<String> it = mapJpo2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar3 = mapJpo2.get(it.next());
                    if (jpoVar3 != null) {
                        arrayList.addAll(jpoVar3.jj());
                    }
                }
            }
        } else if (jpoVar2 != null && jpoVar2.jpo().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> mapJpo3 = jpoVar2.jpo();
            for (String str : mapJpo.keySet()) {
                com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar4 = mapJpo.get(str);
                com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar5 = mapJpo3.get(str);
                if (jpoVar5 == null && jpoVar4 != null) {
                    arrayList2.addAll(jpoVar4.jj());
                } else if (jpoVar4 == null && jpoVar5 != null) {
                    arrayList.addAll(jpoVar5.jj());
                } else if (jpoVar4 != null) {
                    for (jpo.C0080jpo c0080jpo : jpoVar4.jj()) {
                        if (c0080jpo != null && !jpoVar5.jj().contains(c0080jpo) && c0080jpo.jd() != null && c0080jpo.jpo() != null) {
                            arrayList2.add(c0080jpo);
                        }
                    }
                    for (jpo.C0080jpo c0080jpo2 : jpoVar5.jj()) {
                        if (c0080jpo2 != null && !jpoVar4.jj().contains(c0080jpo2)) {
                            arrayList.add(c0080jpo2);
                        }
                    }
                }
            }
        } else if (mapJpo.size() != 0) {
            Iterator<String> it2 = mapJpo.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar6 = mapJpo.get(it2.next());
                if (jpoVar6 != null) {
                    arrayList2.addAll(jpoVar6.jj());
                }
            }
        }
        if (jpo(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void jd(File file, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar, String str) {
        if (jpoVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (jpoVar.jj() != null) {
            Iterator<jpo.C0080jpo> it = jpoVar.jj().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.my.jpo(it.next().jpo())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean jpo(List<jpo.C0080jpo> list, List<jpo.C0080jpo> list2) {
        for (jpo.C0080jpo c0080jpo : list) {
            String strJpo = c0080jpo.jpo();
            String strJpo2 = com.bytedance.sdk.component.utils.my.jpo(strJpo);
            File file = new File(jpo(), strJpo2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.qk.jd.jpo jpoVarJj = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jj();
            jpoVarJj.jd(strJpo);
            jpoVarJj.jpo(jpo().getAbsolutePath(), strJpo2);
            com.bytedance.sdk.component.qk.jd jdVarJpo = jpoVarJj.jpo();
            list2.add(c0080jpo);
            if (jdVarJpo == null || !jdVarJpo.jj() || jdVarJpo.my() == null || !jdVarJpo.my().exists()) {
                wqx(list2);
                return false;
            }
        }
        return true;
    }

    public boolean jpo(String str) {
        File file = new File(jpo().getAbsoluteFile(), o2.l(com.bytedance.sdk.component.utils.my.jpo(str), ".zip"));
        com.bytedance.sdk.component.qk.jd.jpo jpoVarJj = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jj();
        jpoVarJj.jd(str);
        jpoVarJj.jpo(file.getParent(), file.getName());
        com.bytedance.sdk.component.qk.jd jdVarJpo = jpoVarJj.jpo();
        if (jdVarJpo.jj() && jdVarJpo.my() != null && jdVarJpo.my().exists()) {
            File fileMy = jdVarJpo.my();
            try {
                rv.jpo(fileMy.getAbsolutePath(), file.getParent());
                if (!fileMy.exists()) {
                    return true;
                }
                fileMy.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void jpo(int i10) {
        if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().cm() != null) {
            com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().cm().jpo(i10);
        }
    }

    public static void jpo(File file, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar, String str) throws IOException {
        FileOutputStream fileOutputStream;
        if (jpoVar == null) {
            return;
        }
        String strYd = jpoVar.yd();
        if (TextUtils.isEmpty(strYd)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
            } catch (Throwable unused) {
                fileOutputStream = null;
            }
            try {
                fileOutputStream.write(strYd.getBytes(G5.N));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                fileOutputStream.close();
            } catch (Throwable unused2) {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
        } catch (IOException unused3) {
        }
    }

    private static boolean jpo(Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> map, Map<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jpo> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar = map.get(str);
            if (jpoVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar2 = map2.get(str);
            if (jpoVar2 == null) {
                return false;
            }
            if (jpo(jpoVar.wqx(), jpoVar2.wqx())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean jpo(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.jpo.jd.wqx.jpo(java.lang.String, java.lang.String):boolean");
    }

    public static boolean jpo(com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar, String str) {
        if (jpoVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(jpoVar.wqx())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return jpo(jpoVar.wqx(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
