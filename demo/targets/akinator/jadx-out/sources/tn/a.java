package tn;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ln.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements ln.i {

    /* renamed from: a, reason: collision with root package name */
    public final ln.i f87165a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f87166b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f87167c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f87168d;

    public a(ln.i iVar, byte[] bArr, byte[] bArr2) {
        this.f87165a = iVar;
        this.f87166b = bArr;
        this.f87167c = bArr2;
    }

    @Override // ln.i
    public final void addTransferListener(g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        this.f87165a.addTransferListener(g0Var);
    }

    @Override // ln.i
    public void close() throws IOException {
        if (this.f87168d != null) {
            this.f87168d = null;
            this.f87165a.close();
        }
    }

    @Override // ln.i
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f87165a.getResponseHeaders();
    }

    @Override // ln.i
    public final Uri getUri() {
        return this.f87165a.getUri();
    }

    @Override // ln.i
    public final long open(ln.m mVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f87166b, "AES"), new IvParameterSpec(this.f87167c));
                ln.k kVar = new ln.k(this.f87165a, mVar);
                this.f87168d = new CipherInputStream(kVar, cipher);
                kVar.open();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // ln.i, gn.o
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        io.bidmachine.media3.common.util.a.checkNotNull(this.f87168d);
        int i12 = this.f87168d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
