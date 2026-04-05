package com.moloco.sdk.internal.services.encryption;

import a1.k;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.BuildConfig;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.e0;
import sv.k0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public final o f47003b = q.lazy(new k(21));

    /* renamed from: c, reason: collision with root package name */
    public final o f47004c = q.lazy(new k(22));

    /* renamed from: d, reason: collision with root package name */
    public final o f47005d = q.lazy(new k(23));

    /* renamed from: e, reason: collision with root package name */
    public final o f47006e = q.lazy(new k(24));

    /* renamed from: f, reason: collision with root package name */
    public final SecretKeySpec f47007f = h();

    /* renamed from: g, reason: collision with root package name */
    public final o f47008g = q.lazy(new k(25));

    public static final String c() {
        byte[] bArrDecode = Base64.decode(new byte[]{81, 85, 86, 84, 76, 48, 100, 68, 84, 83, 57, 79, 98, 49, 66, 104, 90, 71, 82, 112, 98, 109, 99, 61}, 0);
        e0.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return k0.decodeToString(bArrDecode);
    }

    public static final String d() {
        return k0.decodeToString(new byte[]{65, 69, 83});
    }

    public static final String e() {
        return k0.decodeToString(new byte[]{82, 83, 65, 47, 69, 67, 66, 47, 79, 65, 69, 80, 87, 105, 116, 104, 83, 72, 65, 45, 50, 53, 54, 65, 110, 100, 77, 71, 70, 49, 80, 97, 100, 100, 105, 110, 103});
    }

    public static final String f() {
        byte[] bArrDecode = Base64.decode(new byte[]{85, 108, 78, 66}, 0);
        e0.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return k0.decodeToString(bArrDecode);
    }

    public static final IvParameterSpec g() {
        return new IvParameterSpec(Base64.decode(BuildConfig.MOLOCO_SDK_BIDTOKEN_SALT, 0));
    }

    @Override // com.moloco.sdk.internal.services.encryption.b
    public IvParameterSpec a() {
        return (IvParameterSpec) this.f47008g.getValue();
    }

    @Override // com.moloco.sdk.internal.services.encryption.b
    public SecretKeySpec b() {
        return this.f47007f;
    }

    public final SecretKeySpec h() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(i());
        keyGenerator.init(NotificationCompat.FLAG_LOCAL_ONLY);
        return new SecretKeySpec(keyGenerator.generateKey().getEncoded(), i());
    }

    public final String i() {
        return (String) this.f47005d.getValue();
    }

    public final String j() {
        return (String) this.f47006e.getValue();
    }

    public final String k() {
        return (String) this.f47003b.getValue();
    }

    public final String l() {
        return (String) this.f47004c.getValue();
    }

    @Override // com.moloco.sdk.internal.services.encryption.b
    public byte[] a(byte[] data) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        e0.checkNotNullParameter(data, "data");
        Cipher cipher = Cipher.getInstance(j());
        cipher.init(1, b(), a());
        byte[] bArrDoFinal = cipher.doFinal(data);
        e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    @Override // com.moloco.sdk.internal.services.encryption.b
    public String b(byte[] data) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        e0.checkNotNullParameter(data, "data");
        Cipher cipher = Cipher.getInstance(j());
        cipher.init(2, b(), a());
        byte[] bArrDoFinal = cipher.doFinal(data);
        e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return k0.decodeToString(bArrDoFinal);
    }

    public final PublicKey c(String str) throws InvalidKeySpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(k()).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        e0.checkNotNullExpressionValue(publicKeyGeneratePublic, "generatePublic(...)");
        return publicKeyGeneratePublic;
    }

    @Override // com.moloco.sdk.internal.services.encryption.b
    public String a(byte[] data, byte[] secret) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        e0.checkNotNullParameter(data, "data");
        e0.checkNotNullParameter(secret, "secret");
        Cipher cipher = Cipher.getInstance(j());
        cipher.init(2, new SecretKeySpec(secret, i()), a());
        byte[] bArrDoFinal = cipher.doFinal(data);
        e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return k0.decodeToString(bArrDoFinal);
    }

    @Override // com.moloco.sdk.internal.services.encryption.b
    public byte[] b(byte[] input, String publicKey) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(publicKey, "publicKey");
        Cipher cipher = Cipher.getInstance(l());
        cipher.init(1, c(publicKey));
        byte[] bArrDoFinal = cipher.doFinal(b().getEncoded());
        e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final PrivateKey b(String str) throws InvalidKeySpecException {
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(k()).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
        e0.checkNotNullExpressionValue(privateKeyGeneratePrivate, "generatePrivate(...)");
        return privateKeyGeneratePrivate;
    }

    @Override // com.moloco.sdk.internal.services.encryption.b
    public byte[] a(String rsaPublicKey) {
        e0.checkNotNullParameter(rsaPublicKey, "rsaPublicKey");
        byte[] encoded = b().getEncoded();
        e0.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        return b(encoded, rsaPublicKey);
    }

    @Override // com.moloco.sdk.internal.services.encryption.b
    public byte[] a(byte[] input, String privateKey) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(privateKey, "privateKey");
        Cipher cipher = Cipher.getInstance(l());
        cipher.init(2, b(privateKey));
        byte[] bArrDoFinal = cipher.doFinal(input);
        e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }
}
