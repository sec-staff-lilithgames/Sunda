package com.bytedance.sdk.openadsdk.jd;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo {

    /* renamed from: cm, reason: collision with root package name */
    private volatile boolean f21188cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f21189jd;
    private int wqx;

    public jd(int i10, int i11) {
        this.f21189jd = 15;
        this.wqx = 3;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f21189jd = i10;
        this.wqx = i11;
    }

    private void cm(List<File> list) {
        long jJd;
        int size;
        boolean zJpo;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zJpo = jpo((jJd = jd(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zJpo) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jJd -= length;
                            }
                            if (jpo(file2, jJd, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void wqx(List<File> list) {
        long jJd = jd(list);
        int size = list.size();
        if (jpo(jJd, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jJd -= length;
            }
            if (jpo(file, jJd, size)) {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jd.jpo
    public boolean jpo(long j10, int i10) {
        return i10 <= this.f21189jd;
    }

    @Override // com.bytedance.sdk.openadsdk.jd.jpo
    public boolean jpo(File file, long j10, int i10) {
        return i10 <= this.wqx;
    }

    @Override // com.bytedance.sdk.openadsdk.jd.jpo
    public void jpo(List<File> list) {
        if (this.f21188cm) {
            cm(list);
            this.f21188cm = false;
        } else {
            wqx(list);
        }
    }

    public jd(int i10, int i11, boolean z10) {
        this.f21189jd = 15;
        this.wqx = 3;
        if (i10 > 0) {
            this.f21189jd = i10;
            this.wqx = i11;
            this.f21188cm = z10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
