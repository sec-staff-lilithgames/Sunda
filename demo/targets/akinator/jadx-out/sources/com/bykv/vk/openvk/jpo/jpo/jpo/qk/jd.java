package com.bykv.vk.openvk.jpo.jpo.jpo.qk;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static final MessageDigest jpo = jpo();

    /* renamed from: jd, reason: collision with root package name */
    private static final char[] f16741jd = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private jd() {
    }

    private static MessageDigest jpo() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String jpo(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = jpo;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName(C.UTF8_NAME));
        synchronized (jd.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return jpo(bArrDigest);
    }

    public static String jpo(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f16741jd;
            cArr[i10] = cArr2[(b10 & 240) >> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
