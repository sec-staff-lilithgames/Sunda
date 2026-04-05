package com.mbridge.msdk.foundation.tools;

import io.ktor.util.date.GMTDateParser;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    protected static char[] f41155a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    protected static MessageDigest f41156b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f41157c = "SameFileMD5";

    static {
        try {
            f41156b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e10) {
            System.err.println(m0.class.getName().concat("初始化失败，MessageDigest不支持MD5Util."));
            e10.printStackTrace();
        }
    }

    public static String a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        MessageDigest messageDigest;
        if (file == null || !file.exists()) {
            return "";
        }
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            byte[] bArr = new byte[10485760];
            while (true) {
                int i10 = randomAccessFile.read(bArr);
                if (i10 == -1) {
                    String strA = a(messageDigest.digest());
                    try {
                        randomAccessFile.close();
                        return strA;
                    } catch (IOException e10) {
                        p0.b(f41157c, e10.getMessage());
                        return strA;
                    }
                }
                messageDigest.update(bArr, 0, i10);
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                p0.b(f41157c, th.getMessage());
                return "";
            } finally {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e11) {
                        p0.b(f41157c, e11.getMessage());
                    }
                }
            }
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer(i11 * 2);
        int i12 = i11 + i10;
        while (i10 < i12) {
            a(bArr[i10], stringBuffer);
            i10++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b10, StringBuffer stringBuffer) {
        char[] cArr = f41155a;
        char c10 = cArr[(b10 & 240) >> 4];
        char c11 = cArr[b10 & 15];
        stringBuffer.append(c10);
        stringBuffer.append(c11);
    }
}
