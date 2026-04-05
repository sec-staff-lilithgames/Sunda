package sw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kb.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a {
    public static String hash(Context context, String str, boolean z10) {
        byte[] bArrDigest;
        if (str == null) {
            return null;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length != 1) {
                return null;
            }
            try {
                bArrDigest = MessageDigest.getInstance("SHA-256").digest(signatureArr[0].toByteArray());
            } catch (NoSuchAlgorithmException unused) {
                bArrDigest = null;
            }
            if (z10) {
                return b.encode(bArrDigest);
            }
            if (bArrDigest == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02X", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    public static boolean test(Context context, String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return str2.replaceAll(" ", "").equals(hash(context, str));
    }

    public static String hash(Context context, String str) {
        return hash(context, str, false);
    }
}
