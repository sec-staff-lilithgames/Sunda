package gb;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a {
    public static Cipher a(int i10, byte[] bArr, SecretKey secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i10, secretKey, new GCMParameterSpec(128, bArr));
        return cipher;
    }

    public static String a(Cipher cipher, String str) throws IOException {
        CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(Base64.decode(str, 0)), cipher);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i10 = cipherInputStream.read();
            if (i10 == -1) {
                break;
            }
            arrayList.add(Byte.valueOf((byte) i10));
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            bArr[i11] = ((Byte) arrayList.get(i11)).byteValue();
        }
        return new String(bArr, C.UTF8_NAME);
    }
}
