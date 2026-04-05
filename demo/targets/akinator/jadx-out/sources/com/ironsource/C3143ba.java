package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ba, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3143ba {

    /* renamed from: a, reason: collision with root package name */
    public static final int f36062a = 1024;

    /* renamed from: b, reason: collision with root package name */
    public static final String f36063b = "RSA/ECB/PKCS1Padding";

    public static KeyPair a() throws NoSuchAlgorithmException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f36063b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception on key generation error: " + e10.getMessage());
            throw new RuntimeException(e10);
        }
    }

    private static RSAPublicKey a(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, UnsupportedEncodingException {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(f36063b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception on encryption error: " + e10.getMessage());
            throw new RuntimeException(e10);
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(a(str.getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME), a(str2)), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception on string encryption error: " + e10.getMessage());
            return "";
        }
    }

    public static byte[] a(byte[] bArr, PrivateKey privateKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(f36063b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception on decryption error: " + e10.getMessage());
            throw new RuntimeException(e10);
        }
    }
}
