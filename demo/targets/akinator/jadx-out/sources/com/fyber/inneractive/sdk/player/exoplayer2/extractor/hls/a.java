package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f24715a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24716b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f24717c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f24718d;

    public a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, byte[] bArr, byte[] bArr2) {
        this.f24715a = hVar;
        this.f24716b = bArr;
        this.f24717c = bArr2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f24716b, "AES"), new IvParameterSpec(this.f24717c));
                this.f24718d = new CipherInputStream(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(this.f24715a, kVar), cipher);
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f24718d = null;
        this.f24715a.close();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        CipherInputStream cipherInputStream = this.f24718d;
        if (cipherInputStream == null) {
            throw new IllegalStateException();
        }
        int i12 = cipherInputStream.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f24715a.a();
    }
}
