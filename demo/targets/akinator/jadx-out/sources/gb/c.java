package gb;

import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public d f57510b;

    /* renamed from: c, reason: collision with root package name */
    public b f57511c;

    /* renamed from: a, reason: collision with root package name */
    public SecretKey f57509a = null;

    /* renamed from: d, reason: collision with root package name */
    public final AlgorithmParameterSpec f57512d = new hb.a().a();

    public final void a() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        cb.b.a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(this.f57512d);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.f57509a = (SecretKey) key;
            this.f57510b = new d();
            this.f57511c = new b();
        }
    }

    public final Pair a(String str) {
        if (this.f57510b != null) {
            return d.a(this.f57509a, str);
        }
        return null;
    }

    public final String a(String str, byte[] bArr) {
        if (this.f57511c != null) {
            return a.a(a.a(2, bArr, this.f57509a), str);
        }
        return null;
    }
}
