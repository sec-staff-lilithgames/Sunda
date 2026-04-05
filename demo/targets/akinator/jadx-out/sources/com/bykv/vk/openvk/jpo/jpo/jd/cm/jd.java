package com.bykv.vk.openvk.jpo.jpo.jd.cm;

import j1.o2;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static File jd(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, o2.l(str2, ".temp"));
    }

    public static long jpo(String str, String str2) {
        File fileWqx = wqx(str, str2);
        if (fileWqx.exists()) {
            return fileWqx.length();
        }
        File fileJd = jd(str, str2);
        if (fileJd.exists()) {
            return fileJd.length();
        }
        return 0L;
    }

    public static File wqx(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void jpo(RandomAccessFile randomAccessFile, byte[] bArr, int i10, int i11, String str) throws IOException {
        try {
            randomAccessFile.seek(i10);
            randomAccessFile.write(bArr, 0, i11);
        } catch (Throwable unused) {
        }
    }
}
