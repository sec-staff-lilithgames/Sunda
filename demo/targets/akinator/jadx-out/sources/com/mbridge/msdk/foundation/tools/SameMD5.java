package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import com.mbridge.msdk.system.NoProGuard;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class SameMD5 implements NoProGuard {
    public static final String TAG = "MD5";

    public static String ByteArrayToHexString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = 48;
        }
        byte[] bArr3 = new byte[bArr.length + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        byte[] bytes = new BigInteger(bArr3).toString(16).getBytes();
        System.arraycopy(bytes, 0, bArr2, length - bytes.length, bytes.length);
        return new String(bArr2);
    }

    private static String UpHexEncode(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(Integer.toHexString((b10 & 240) >>> 4));
            sb2.append(Integer.toHexString(b10 & 15));
        }
        return sb2.toString().toUpperCase(Locale.US);
    }

    public static String getMD5(String str) throws NoSuchAlgorithmException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            p0.a(TAG, str);
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return hexEncode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String getQftJSMD5(String str) throws NoSuchAlgorithmException {
        try {
            byte[] qftJSMD5Bytes = getQftJSMD5Bytes(str);
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.update(qftJSMD5Bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i10 = 0;
            for (byte b10 : bArrDigest) {
                int i11 = i10 + 1;
                cArr2[i10] = cArr[(b10 >>> 4) & 15];
                i10 += 2;
                cArr2[i11] = cArr[b10 & 15];
            }
            return new String(cArr2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static byte[] getQftJSMD5Bytes(String str) throws UnsupportedEncodingException {
        int length = str.length();
        byte[] bytes = str.getBytes("UTF-16LE");
        p0.c(InternalFrame.ID, "b = " + ByteArrayToHexString(bytes));
        byte[] bArr = new byte[length];
        int i10 = 0;
        for (int i11 = 0; i11 < bytes.length; i11 += 2) {
            byte b10 = bytes[i11];
            if (b10 != -1 && b10 != -2) {
                bArr[i10] = b10;
                i10++;
                if (i10 == length) {
                    break;
                }
            }
        }
        p0.c(InternalFrame.ID, "source = " + ByteArrayToHexString(bArr));
        return bArr;
    }

    public static String getUPMD5(String str) throws NoSuchAlgorithmException {
        try {
            p0.a(TAG, str);
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return UpHexEncode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String hexEncode(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(Integer.toHexString((b10 & 240) >>> 4));
            sb2.append(Integer.toHexString(b10 & 15));
        }
        return sb2.toString().toLowerCase(Locale.US);
    }
}
