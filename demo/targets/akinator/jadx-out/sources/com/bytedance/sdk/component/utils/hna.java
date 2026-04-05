package com.bytedance.sdk.component.utils;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.ktor.util.date.GMTDateParser;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna {
    private static final char[] jpo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    public static String jpo(String str) throws NoSuchAlgorithmException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes(C.UTF8_NAME));
                    return jpo(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String jpo(byte[] bArr) {
        if (bArr != null) {
            return jpo(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String jpo(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if (i10 >= 0 && i10 + i11 <= bArr.length) {
                int i12 = i11 * 2;
                char[] cArr = new char[i12];
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    byte b10 = bArr[i14 + i10];
                    int i15 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i16 = i13 + 1;
                    char[] cArr2 = jpo;
                    cArr[i13] = cArr2[i15 >> 4];
                    i13 += 2;
                    cArr[i16] = cArr2[b10 & 15];
                }
                return new String(cArr, 0, i12);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
