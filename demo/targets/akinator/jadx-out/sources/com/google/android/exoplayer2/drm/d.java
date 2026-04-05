package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.n1;
import de.a0;
import de.d0;
import de.e0;
import de.g0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zd.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements e {
    public static d getInstance() {
        return new d();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public ce.b createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public int getCryptoType() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public a0 getKeyRequest(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public PersistableBundle getMetrics() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public byte[] getPropertyByteArray(String str) {
        return n1.f28511f;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public String getPropertyString(String str) {
        return "";
    }

    @Override // com.google.android.exoplayer2.drm.e
    public g0 getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.e
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public /* bridge */ /* synthetic */ void setPlayerIdForSession(byte[] bArr, c0 c0Var) {
        super.setPlayerIdForSession(bArr, c0Var);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void acquire() {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void release() {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void closeSession(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setOnEventListener(de.c0 c0Var) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setOnExpirationUpdateListener(d0 d0Var) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setOnKeyStatusChangeListener(e0 e0Var) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setPropertyByteArray(String str, byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setPropertyString(String str, String str2) {
    }
}
