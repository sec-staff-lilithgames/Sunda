package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import j1.o2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.utils.qk$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo implements Comparator<File> {
        private jpo() {
        }

        private int jpo(long j10, long j11) {
            if (j10 < j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }

        public /* synthetic */ jpo(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return jpo(file.lastModified(), file2.lastModified());
        }
    }

    public static byte[] cm(File file) {
        FileInputStream fileInputStream;
        long length;
        Long lValueOf;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                length = file.length();
                lValueOf = Long.valueOf(length);
                fileInputStream = new FileInputStream(file);
            } catch (Throwable unused) {
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[lValueOf.intValue()];
                if (fileInputStream.read(bArr) == length) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    return bArr;
                }
            } catch (Throwable unused3) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    private static String jd(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    private static void jj(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    public static File jpo(Context context, boolean z10, String str, String str2) {
        String strJd = jd(context);
        if (z10) {
            str = jpo(context) + "-" + str;
        }
        if (strJd != null) {
            String str3 = File.separator;
            if (!strJd.endsWith(str3)) {
                strJd = o2.l(strJd, str3);
            }
        }
        String strL = o2.l(strJd, str);
        File file = new File(strL);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(strL, str2);
    }

    private static void my(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long j10;
        long length = file.length();
        if (length == 0) {
            jj(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            j10 = length - 1;
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            randomAccessFile.seek(j10);
            byte b10 = randomAccessFile.readByte();
            randomAccessFile.seek(j10);
            randomAccessFile.write(b10);
            randomAccessFile.close();
        } catch (Throwable unused2) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }
    }

    public static void wqx(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        wqx(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            file.delete();
        } catch (Throwable unused2) {
        }
    }

    public static void jd(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            my(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File jpo(Context context, boolean z10, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z10) {
            str = jpo(context) + "-" + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = o2.l(absolutePath, str2);
            }
        }
        File file = new File(o2.l(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static List<File> jpo(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new jpo(null));
        return listAsList;
    }

    public static String jpo(Context context) {
        String strJpo = tu.jpo(context);
        return (TextUtils.isEmpty(strJpo) || !strJpo.contains(":")) ? strJpo : strJpo.replace(":", "-");
    }
}
