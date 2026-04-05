package sn;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import io.bidmachine.media3.common.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i0 {
    void acquire();

    void closeSession(byte[] bArr);

    nn.b createCryptoConfig(byte[] bArr) throws MediaCryptoException;

    int getCryptoType();

    b0 getKeyRequest(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    PersistableBundle getMetrics();

    default List<byte[]> getOfflineLicenseKeySetIds() {
        throw new UnsupportedOperationException();
    }

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    h0 getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    default void removeOfflineLicense(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(d0 d0Var);

    void setOnExpirationUpdateListener(e0 e0Var);

    void setOnKeyStatusChangeListener(f0 f0Var);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);

    default void setPlayerIdForSession(byte[] bArr, on.f0 f0Var) {
    }
}
