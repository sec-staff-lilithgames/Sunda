package com.bykv.vk.openvk.jpo.jpo.jpo.qk;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.ktor.util.date.GMTDateParser;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static String jpo(File file) {
        return jpo(file, null);
    }

    public static String jpo(File file, String str) throws NoSuchAlgorithmException, IOException {
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i10 = bufferedInputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            if (!TextUtils.isEmpty(str)) {
                messageDigest.update(str.getBytes());
            }
            bufferedInputStream.close();
            return jpo(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    private static String jpo(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
            char[] cArr2 = new char[bArr.length * 2];
            int i10 = 0;
            for (byte b10 : bArr) {
                int i11 = i10 + 1;
                cArr2[i10] = cArr[(b10 >>> 4) & 15];
                i10 += 2;
                cArr2[i11] = cArr[b10 & 15];
            }
            return new String(cArr2);
        }
        return "";
    }
}
