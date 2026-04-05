package com.mbridge.msdk.foundation.tools;

import io.ktor.util.date.GMTDateParser;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class c1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static final char[] f41075a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

        /* renamed from: b, reason: collision with root package name */
        static final SecureRandom f41076b = new SecureRandom();
    }

    public static int a(int[] iArr, int i10) {
        int length = (iArr.length >> 1) - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12 << 1];
            if (i13 < i10) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i10) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return length;
    }

    private static void b(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        file.delete();
    }

    public static byte[] c(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i10 = (int) length;
        byte[] bArr = new byte[i10];
        a(file, bArr, i10);
        return bArr;
    }

    public static boolean d(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    public static void a(File file) {
        try {
            if (file.exists()) {
                b(file);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(File file, byte[] bArr, int i10) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i11 = 0;
        while (i11 < i10) {
            try {
                int i12 = randomAccessFile.read(bArr, i11, i10 - i11);
                if (i12 < 0) {
                    break;
                } else {
                    i11 += i12;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    public static String b() {
        byte[] bArr = new byte[16];
        a.f41076b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 << 1;
            char[] cArr2 = a.f41075a;
            cArr[i11] = cArr2[(b10 >> 4) & 15];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    public static boolean a(File file, byte[] bArr) {
        File file2;
        try {
            file2 = new File(file.getParent(), file.getName() + ".tmp");
        } catch (Exception unused) {
        }
        if (!d(file2)) {
            return false;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            randomAccessFile.setLength(bArr.length);
            randomAccessFile.write(bArr);
            a(randomAccessFile);
            if (!file.exists() || file.delete()) {
                return file2.renameTo(file);
            }
            return false;
        } catch (Throwable th2) {
            a(randomAccessFile);
            throw th2;
        }
    }
}
