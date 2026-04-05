package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.ironsource.G5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    public static final int UNKNOWN_ERR = 507;

    /* renamed from: jd, reason: collision with root package name */
    private static volatile boolean f18975jd = true;
    private static volatile PglCryptUtils jpo;

    private PglCryptUtils() {
    }

    public static native byte[] bc(int i10, byte[] bArr);

    public static PglCryptUtils getInstance() {
        if (jpo == null) {
            synchronized (PglCryptUtils.class) {
                try {
                    if (jpo == null) {
                        try {
                            System.loadLibrary("pglarmor");
                        } catch (Throwable unused) {
                            f18975jd = false;
                        }
                        jpo = new PglCryptUtils();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    private static byte[] jpo(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        byte[] byteArray = null;
        gZIPOutputStream = null;
        byteArray = null;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            ?? length = str.length();
            try {
                try {
                    if (length != 0) {
                        try {
                            length = new ByteArrayOutputStream();
                            try {
                                gZIPOutputStream = new GZIPOutputStream(length);
                                try {
                                    gZIPOutputStream.write(str.getBytes(G5.N));
                                    gZIPOutputStream.close();
                                    byte[] byteArray2 = length.toByteArray();
                                    length.close();
                                    return byteArray2;
                                } catch (Exception e10) {
                                    e = e10;
                                    Log.e("ARMOR", e.toString());
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (length != 0) {
                                        byteArray = length.toByteArray();
                                        length.close();
                                    }
                                    return byteArray;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                gZIPOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                if (gZIPOutputStream2 != null) {
                                    try {
                                        gZIPOutputStream2.close();
                                    } catch (Exception e12) {
                                        Log.e("ARMOR", e12.toString());
                                        throw th;
                                    }
                                }
                                if (length != 0) {
                                    length.toByteArray();
                                    length.close();
                                }
                                throw th;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            length = 0;
                            gZIPOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            length = 0;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gZIPOutputStream2 = gZIPOutputStream;
                }
            } catch (Exception e14) {
                Log.e("ARMOR", e14.toString());
            }
        }
        return null;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) throws Throwable {
        byte[] bArrBc;
        if (!f18975jd) {
            return new Pair<>(501, null);
        }
        if (str == null || str.length() == 0) {
            return new Pair<>(502, null);
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode == null || bArrDecode.length == 0) {
            return new Pair<>(504, null);
        }
        try {
            bArrBc = bc(1011, bArrDecode);
        } catch (Throwable th2) {
            Log.e("ARMOR", th2.toString());
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new Pair<>(506, null);
        }
        String strJpo = jpo(bArrBc);
        return TextUtils.isEmpty(strJpo) ? new Pair<>(503, null) : new Pair<>(0, strJpo);
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws Throwable {
        Pair<Integer, String> pairCypher4EncryptWithNoWrapBase64 = cypher4EncryptWithNoWrapBase64(jSONObject.toString());
        if (pairCypher4EncryptWithNoWrapBase64 == null) {
            return new Pair<>(507, null);
        }
        if (((Integer) pairCypher4EncryptWithNoWrapBase64.first).intValue() != 0) {
            return new Pair<>(pairCypher4EncryptWithNoWrapBase64.first, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = (String) pairCypher4EncryptWithNoWrapBase64.second;
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(504, null);
        }
        jSONObject2.put(KEY_MESSAGE, str);
        jSONObject2.put("cypher", 4);
        return new Pair<>(0, jSONObject2);
    }

    public Pair<Integer, String> cypher4EncryptWithNoWrapBase64(String str) throws Throwable {
        if (!f18975jd) {
            return new Pair<>(501, null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(502, null);
        }
        byte[] bArrJpo = jpo(str);
        if (bArrJpo == null || bArrJpo.length == 0) {
            return new Pair<>(503, null);
        }
        Pair<Integer, byte[]> pairCypher4Encrypt = cypher4Encrypt(bArrJpo);
        if (pairCypher4Encrypt == null) {
            return new Pair<>(507, null);
        }
        if (((Integer) pairCypher4Encrypt.first).intValue() != 0) {
            return new Pair<>(pairCypher4Encrypt.first, null);
        }
        String strEncodeToString = Base64.encodeToString((byte[]) pairCypher4Encrypt.second, 2);
        return TextUtils.isEmpty(strEncodeToString) ? new Pair<>(504, null) : new Pair<>(0, strEncodeToString);
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArrBc;
        if (!f18975jd) {
            return new Pair<>(501, null);
        }
        if (bArr != null && bArr.length != 0) {
            try {
                bArrBc = bc(1010, bArr);
            } catch (Throwable th2) {
                Log.e("ARMOR", th2.toString());
                bArrBc = null;
            }
            if (bArrBc != null && bArrBc.length != 0) {
                return new Pair<>(0, bArrBc);
            }
            return new Pair<>(505, null);
        }
        return new Pair<>(502, null);
    }

    private static String jpo(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception exc;
        String str;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        String string = null;
        gZIPInputStream2 = null;
        gZIPInputStream2 = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                } catch (Exception e10) {
                    exc = e10;
                    str = null;
                }
            } catch (Throwable th3) {
                gZIPInputStream = gZIPInputStream2;
                th2 = th3;
            }
        } catch (Exception e11) {
            byteArrayOutputStream = null;
            exc = e11;
            str = null;
        } catch (Throwable th4) {
            gZIPInputStream = null;
            th2 = th4;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i10 = gZIPInputStream.read(bArr2);
                if (i10 != -1) {
                    byteArrayOutputStream.write(bArr2, 0, i10);
                } else {
                    string = byteArrayOutputStream.toString(G5.N);
                    byteArrayInputStream.close();
                    try {
                        gZIPInputStream.close();
                        byteArrayOutputStream.close();
                        return string;
                    } catch (Exception e12) {
                        Log.e("ARMOR", e12.toString());
                        return string;
                    }
                }
            }
        } catch (Exception e13) {
            str = string;
            gZIPInputStream2 = gZIPInputStream;
            exc = e13;
            Log.e("ARMOR", exc.toString());
            if (gZIPInputStream2 != null) {
                try {
                    gZIPInputStream2.close();
                } catch (Exception e14) {
                    Log.e("ARMOR", e14.toString());
                    return str;
                }
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return str;
        } catch (Throwable th5) {
            th2 = th5;
            if (gZIPInputStream != null) {
                try {
                    gZIPInputStream.close();
                } catch (Exception e15) {
                    Log.e("ARMOR", e15.toString());
                    throw th2;
                }
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th2;
        }
    }
}
