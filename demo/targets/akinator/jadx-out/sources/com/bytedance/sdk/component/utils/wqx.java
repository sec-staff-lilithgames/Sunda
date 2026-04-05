package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    private static HashMap<String, ArrayList<String>> jpo = new HashMap<>();

    private static Signature[] jd(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList<String> jpo(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (jpo.get(str) != null) {
                return jpo.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : jd(context, packageName)) {
                    String strJpo = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        strJpo = jpo(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        strJpo = jpo(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strJpo = jpo(signature, "SHA256");
                    }
                    arrayList.add(strJpo);
                }
            } catch (Exception unused) {
            }
            jpo.put(str, arrayList);
        }
        return arrayList;
    }

    public static String jpo(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayListJpo = jpo(context, "SHA1");
        if (arrayListJpo != null && arrayListJpo.size() != 0) {
            for (int i10 = 0; i10 < arrayListJpo.size(); i10++) {
                sb2.append(arrayListJpo.get(i10));
                if (i10 < arrayListJpo.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private static String jpo(Signature signature, String str) throws NoSuchAlgorithmException {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(Integer.toHexString((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1, 3).toUpperCase());
                    sb2.append(":");
                }
                return sb2.substring(0, sb2.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}
