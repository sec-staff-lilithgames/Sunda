package io.odeeo.internal.f;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import io.odeeo.internal.f.e;
import io.odeeo.internal.f.m;
import io.odeeo.internal.q0.g0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements m {
    public static k getInstance() {
        return new k();
    }

    @Override // io.odeeo.internal.f.m
    public io.odeeo.internal.e.b createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.f.m
    public int getCryptoType() {
        return 1;
    }

    @Override // io.odeeo.internal.f.m
    public m.b getKeyRequest(byte[] bArr, List<e.b> list, int i10, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.f.m
    public PersistableBundle getMetrics() {
        return null;
    }

    @Override // io.odeeo.internal.f.m
    public byte[] getPropertyByteArray(String str) {
        return g0.f65866f;
    }

    @Override // io.odeeo.internal.f.m
    public String getPropertyString(String str) {
        return "";
    }

    @Override // io.odeeo.internal.f.m
    public m.h getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.f.m
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // io.odeeo.internal.f.m
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.f.m
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.f.m
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.f.m
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.f.m
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.f.m
    public void acquire() {
    }

    @Override // io.odeeo.internal.f.m
    public void release() {
    }

    @Override // io.odeeo.internal.f.m
    public void closeSession(byte[] bArr) {
    }

    @Override // io.odeeo.internal.f.m
    public void setOnEventListener(m.d dVar) {
    }

    @Override // io.odeeo.internal.f.m
    public void setOnExpirationUpdateListener(m.e eVar) {
    }

    @Override // io.odeeo.internal.f.m
    public void setOnKeyStatusChangeListener(m.f fVar) {
    }

    @Override // io.odeeo.internal.f.m
    public void setPropertyByteArray(String str, byte[] bArr) {
    }

    @Override // io.odeeo.internal.f.m
    public void setPropertyString(String str, String str2) {
    }
}
