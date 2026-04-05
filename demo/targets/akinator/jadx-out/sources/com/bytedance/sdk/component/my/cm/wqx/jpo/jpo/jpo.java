package com.bytedance.sdk.component.my.cm.wqx.jpo.jpo;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qk;
import com.bytedance.sdk.component.utils.yd;
import j1.o2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private File f18827jd;
    private int jpo;

    private jpo(int i10, File file) {
        this.jpo = i10;
        this.f18827jd = file;
    }

    private static void cm(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private List<File> jd(File file) {
        List<File> listJpo = jpo(file);
        if (listJpo == null || listJpo.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listJpo) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listJpo, new Comparator<File>() { // from class: com.bytedance.sdk.component.my.cm.wqx.jpo.jpo.jpo.1
            @Override // java.util.Comparator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
            }
        });
        return listJpo;
    }

    public static jpo jpo(int i10, File file) {
        try {
            jpo jpoVar = new jpo(i10, file);
            if (file != null) {
                file.mkdirs();
            }
            return jpoVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void wqx(File file) {
        if (file == null) {
            return;
        }
        try {
            qk.jd(file);
        } catch (Throwable unused) {
        }
    }

    private File wqx(String str) {
        return new File(this.f18827jd, o2.l(str, ".temp"));
    }

    public synchronized InputStream jpo(String str) {
        FileInputStream fileInputStream;
        if (this.jpo <= 0) {
            return null;
        }
        File fileJd = jd(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileJd);
            } catch (Throwable unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            fileInputStream = null;
        }
        try {
            wqx(fileJd);
            return fileInputStream;
        } catch (FileNotFoundException unused3) {
            yd.jpo(fileInputStream);
            return null;
        }
    }

    private File jd(String str) {
        return new File(this.f18827jd, str);
    }

    public synchronized boolean jpo(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (this.jpo > 0 && str != null && bArr != null) {
            File fileWqx = wqx(str);
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(fileWqx);
            } catch (FileNotFoundException unused) {
            } catch (Throwable unused2) {
            }
            try {
                fileOutputStream.write(bArr);
                if (fileWqx.exists()) {
                    jpo(fileWqx, jd(str), true);
                }
                yd.jpo(fileOutputStream);
                List<File> listJpo = jpo(this.f18827jd);
                if (listJpo != null) {
                    int size = listJpo.size();
                    int i10 = this.jpo;
                    if (size > i10) {
                        jpo((int) (i10 * 0.7d));
                    }
                }
                return true;
            } catch (FileNotFoundException unused3) {
                fileOutputStream2 = fileOutputStream;
                try {
                    File file = this.f18827jd;
                    if (file != null) {
                        file.mkdirs();
                    }
                    yd.jpo(fileOutputStream2);
                    List<File> listJpo2 = jpo(this.f18827jd);
                    if (listJpo2 != null) {
                        int size2 = listJpo2.size();
                        int i11 = this.jpo;
                        if (size2 > i11) {
                            jpo((int) (i11 * 0.7d));
                        }
                    }
                    return false;
                } finally {
                    yd.jpo(fileOutputStream2);
                    List<File> listJpo3 = jpo(this.f18827jd);
                    if (listJpo3 != null) {
                        int size3 = listJpo3.size();
                        int i12 = this.jpo;
                        if (size3 > i12) {
                            jpo((int) (i12 * 0.7d));
                        }
                    }
                }
            } catch (Throwable unused4) {
                fileOutputStream2 = fileOutputStream;
                return false;
            }
        }
        return false;
    }

    private List<File> jpo(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void jpo(int i10) {
        try {
            if (i10 > this.jpo) {
                return;
            }
            List<File> listJd = jd(this.f18827jd);
            if (listJd != null && listJd.size() > i10) {
                while (i10 < listJd.size()) {
                    File file = listJd.get(i10);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i10++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void jpo(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            cm(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
