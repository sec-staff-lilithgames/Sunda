package sn;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.a1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z implements i0 {
    public static z getInstance() {
        return new z();
    }

    @Override // sn.i0
    public nn.b createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // sn.i0
    public int getCryptoType() {
        return 1;
    }

    @Override // sn.i0
    public b0 getKeyRequest(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // sn.i0
    public PersistableBundle getMetrics() {
        return null;
    }

    @Override // sn.i0
    public /* bridge */ /* synthetic */ List getOfflineLicenseKeySetIds() {
        return super.getOfflineLicenseKeySetIds();
    }

    @Override // sn.i0
    public byte[] getPropertyByteArray(String str) {
        return a1.f60681c;
    }

    @Override // sn.i0
    public String getPropertyString(String str) {
        return "";
    }

    @Override // sn.i0
    public h0 getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // sn.i0
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // sn.i0
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // sn.i0
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // sn.i0
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // sn.i0
    public /* bridge */ /* synthetic */ void removeOfflineLicense(byte[] bArr) {
        super.removeOfflineLicense(bArr);
    }

    @Override // sn.i0
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // sn.i0
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // sn.i0
    public /* bridge */ /* synthetic */ void setPlayerIdForSession(byte[] bArr, on.f0 f0Var) {
        super.setPlayerIdForSession(bArr, f0Var);
    }

    @Override // sn.i0
    public void acquire() {
    }

    @Override // sn.i0
    public void release() {
    }

    @Override // sn.i0
    public void closeSession(byte[] bArr) {
    }

    @Override // sn.i0
    public void setOnEventListener(d0 d0Var) {
    }

    @Override // sn.i0
    public void setOnExpirationUpdateListener(e0 e0Var) {
    }

    @Override // sn.i0
    public void setOnKeyStatusChangeListener(f0 f0Var) {
    }

    @Override // sn.i0
    public void setPropertyByteArray(String str, byte[] bArr) {
    }

    @Override // sn.i0
    public void setPropertyString(String str, String str2) {
    }
}
