package com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd {
    private String jpo = "video_reward_full";

    /* renamed from: jd, reason: collision with root package name */
    private String f16699jd = "video_brand";
    private String wqx = "video_splash";

    /* renamed from: cm, reason: collision with root package name */
    private String f16698cm = "video_default";
    private String my = null;

    /* renamed from: jj, reason: collision with root package name */
    private String f16700jj = null;

    /* renamed from: qk, reason: collision with root package name */
    private String f16701qk = null;
    private String xyk = null;
    private String zz = null;

    private List<com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jpo> jj() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jpo(new File(jpo()).listFiles(), com.bykv.vk.openvk.jpo.jpo.jd.jpo.wqx()));
        arrayList.add(new com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jpo(new File(jd()).listFiles(), com.bykv.vk.openvk.jpo.jpo.jd.jpo.jd()));
        arrayList.add(new com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jpo(new File(my()).listFiles(), com.bykv.vk.openvk.jpo.jpo.jd.jpo.cm()));
        arrayList.add(new com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jpo(new File(wqx()).listFiles(), com.bykv.vk.openvk.jpo.jpo.jd.jpo.my()));
        return arrayList;
    }

    private Set<String> qk() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo jpoVar : com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.jpo.values()) {
            if (jpoVar != null && jpoVar.jpo() != null) {
                com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVarJpo = jpoVar.jpo();
                hashSet.add(com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.jd(wqxVarJpo.my(), wqxVarJpo.sq()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.wqx(wqxVarJpo.my(), wqxVarJpo.sq()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.jpo.jpo.jd.jpo.jd.jd jdVar : com.bykv.vk.openvk.jpo.jpo.jd.jpo.jd.wqx.jpo.values()) {
            if (jdVar != null && jdVar.jpo() != null) {
                com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVarJpo2 = jdVar.jpo();
                hashSet.add(com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.jd(wqxVarJpo2.my(), wqxVarJpo2.sq()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.wqx(wqxVarJpo2.my(), wqxVarJpo2.sq()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd
    public synchronized void cm() {
        try {
            Set<String> setQk = null;
            for (com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jpo jpoVar : jj()) {
                File[] fileArrJpo = jpoVar.jpo();
                if (fileArrJpo != null && fileArrJpo.length >= jpoVar.jd()) {
                    if (setQk == null) {
                        setQk = qk();
                    }
                    int iJd = jpoVar.jd() - 2;
                    if (iJd < 0) {
                        iJd = 0;
                    }
                    jpo(jpoVar.jpo(), iJd, setQk);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd
    public String jd() {
        if (this.xyk == null) {
            this.xyk = this.my + File.separator + this.wqx;
            File file = new File(this.xyk);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.xyk;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd
    public void jpo(String str) {
        this.my = str;
    }

    public String my() {
        if (this.f16701qk == null) {
            this.f16701qk = this.my + File.separator + this.f16699jd;
            File file = new File(this.f16701qk);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f16701qk;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd
    public String wqx() {
        if (this.zz == null) {
            this.zz = this.my + File.separator + this.f16698cm;
            File file = new File(this.zz);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.zz;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd
    public String jpo() {
        if (this.f16700jj == null) {
            this.f16700jj = this.my + File.separator + this.jpo;
            File file = new File(this.f16700jj);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f16700jj;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd
    public long jd(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        if (TextUtils.isEmpty(wqxVar.my()) || TextUtils.isEmpty(wqxVar.sq())) {
            return 0L;
        }
        return com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.jpo(wqxVar.my(), wqxVar.sq());
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd
    public boolean jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        if (TextUtils.isEmpty(wqxVar.my()) || TextUtils.isEmpty(wqxVar.sq())) {
            return false;
        }
        return new File(wqxVar.my(), wqxVar.sq()).exists();
    }

    private static void jpo(File[] fileArr, int i10, Set<String> set) {
        if (i10 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i10) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.jpo.1
                        @Override // java.util.Comparator
                        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i10 < listAsList.size()) {
                        File file = (File) listAsList.get(i10);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i10)).delete();
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
