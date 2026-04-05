package com.bytedance.sdk.component.embedapplog;

import android.util.Log;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class PangleEncryptUtilsType4 {
    public static Pair<Integer, String> decrypt(String str) {
        try {
            Pair<Integer, String> pairCypher4Decrypt = PglCryptUtils.getInstance().cypher4Decrypt(str);
            return new Pair<>(Integer.valueOf(getCryptFailedReason(((Integer) pairCypher4Decrypt.first).intValue())), pairCypher4Decrypt.second);
        } catch (Throwable th2) {
            Log.e("pangle-encrypt", "decrypt exception " + th2.getMessage());
            return new Pair<>(2, null);
        }
    }

    public static JSONObject encrypt(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        Pair<Integer, JSONObject> pairCypher4Encrypt;
        Object obj;
        try {
            pairCypher4Encrypt = PglCryptUtils.getInstance().cypher4Encrypt(jSONObject);
        } catch (Throwable th2) {
            Log.e("pangle-encrypt", "encrypt exception " + th2.getMessage());
            pairCypher4Encrypt = null;
        }
        if (pairCypher4Encrypt != null && ((Integer) pairCypher4Encrypt.first).intValue() == 0 && (obj = pairCypher4Encrypt.second) != null) {
            return (JSONObject) obj;
        }
        if (iDefaultEncrypt == null) {
            return null;
        }
        try {
            return iDefaultEncrypt.encrypt(jSONObject, pairCypher4Encrypt == null ? 0 : getCryptFailedReason(((Integer) pairCypher4Encrypt.first).intValue()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject encryptType4WithNoWrapBase64(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        Pair<Integer, String> pairCypher4EncryptWithNoWrapBase64;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = null;
        if (jSONObject != null) {
            try {
                pairCypher4EncryptWithNoWrapBase64 = PglCryptUtils.getInstance().cypher4EncryptWithNoWrapBase64(jSONObject.toString());
            } catch (Throwable th2) {
                Log.e("pangle-encrypt", "encrypt exception " + th2.getMessage());
            }
        } else {
            pairCypher4EncryptWithNoWrapBase64 = null;
        }
        if (pairCypher4EncryptWithNoWrapBase64 == null || ((Integer) pairCypher4EncryptWithNoWrapBase64.first).intValue() != 0 || pairCypher4EncryptWithNoWrapBase64.second == null) {
            if (iDefaultEncrypt == null) {
                return null;
            }
            try {
                return iDefaultEncrypt.encrypt(jSONObject, pairCypher4EncryptWithNoWrapBase64 == null ? 0 : getCryptFailedReason(((Integer) pairCypher4EncryptWithNoWrapBase64.first).intValue()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            jSONObject2 = new JSONObject();
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, pairCypher4EncryptWithNoWrapBase64.second);
            jSONObject2.put("cypher", 4);
            return jSONObject2;
        } catch (Throwable th4) {
            th = th4;
            jSONObject3 = jSONObject2;
            Log.e("pangle-encrypt", "encrypt json exception " + th.getMessage());
            return jSONObject3;
        }
    }

    public static Pair<Integer, byte[]> encryptWithoutBase64(byte[] bArr) {
        Pair<Integer, byte[]> pairCypher4Encrypt;
        Object obj;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            pairCypher4Encrypt = PglCryptUtils.getInstance().cypher4Encrypt(bArr);
        } catch (Throwable th2) {
            Log.e("pangle-encrypt", "encrypt exception " + th2.getMessage());
            pairCypher4Encrypt = null;
        }
        int cryptFailedReason = 0;
        if (pairCypher4Encrypt != null && ((Integer) pairCypher4Encrypt.first).intValue() == 0 && (obj = pairCypher4Encrypt.second) != null && ((byte[]) obj).length > 0) {
            bArr2 = (byte[]) obj;
        } else if (pairCypher4Encrypt != null) {
            cryptFailedReason = getCryptFailedReason(((Integer) pairCypher4Encrypt.first).intValue());
        }
        return new Pair<>(Integer.valueOf(cryptFailedReason), bArr2);
    }

    private static int getCryptFailedReason(int i10) {
        switch (i10) {
            case 501:
                return 6;
            case 502:
                return 4;
            case 503:
                return 1;
            case 504:
                return 3;
            case 505:
            case 506:
                return 2;
            default:
                return 0;
        }
    }
}
