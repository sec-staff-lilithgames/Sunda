package io.bidmachine.analytics.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import uu.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f59874a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59875b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f59876c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f59877d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f59878e;

    /* renamed from: f, reason: collision with root package name */
    private final Key f59879f;

    /* renamed from: g, reason: collision with root package name */
    private final B f59880g;

    public C(byte[] bArr, String str, byte[] bArr2, boolean z10) {
        this.f59874a = bArr;
        this.f59875b = str;
        this.f59876c = bArr2;
        this.f59877d = z10;
        KeyPair keyPairA = new r().a();
        this.f59878e = keyPairA.getPublic().getEncoded();
        this.f59879f = keyPairA.getPrivate();
        this.f59880g = new C3889w();
    }

    public final Key a() {
        return a(this.f59879f, this.f59878e, this.f59874a);
    }

    public final byte[] b() {
        return this.f59878e;
    }

    public final Key a(Key key, byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(this.f59880g.a(a(key, bArr2), this.f59877d ? a(bArr, bArr2) : null, this.f59876c), this.f59875b);
    }

    private final byte[] a(Key key, byte[] bArr) throws IllegalStateException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(key);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }

    public /* synthetic */ C(byte[] bArr, String str, byte[] bArr2, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(bArr, str, (i10 & 4) != 0 ? null : bArr2, (i10 & 8) != 0 ? false : z10);
    }

    private final byte[] a(byte[] bArr, byte[] bArr2) throws IOException {
        List listMutableListOf = uu.p0.mutableListOf(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2));
        u0.sort(listMutableListOf);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(((ByteBuffer) listMutableListOf.get(0)).array());
        byteArrayOutputStream.write(((ByteBuffer) listMutableListOf.get(1)).array());
        return byteArrayOutputStream.toByteArray();
    }
}
