package de;

import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements n {

    /* renamed from: a, reason: collision with root package name */
    public final m f52169a;

    public z(m mVar) {
        this.f52169a = (m) com.google.android.exoplayer2.util.a.checkNotNull(mVar);
    }

    @Override // de.n
    public ce.b getCryptoConfig() {
        return null;
    }

    @Override // de.n
    public m getError() {
        return this.f52169a;
    }

    @Override // de.n
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // de.n
    public final UUID getSchemeUuid() {
        return com.google.android.exoplayer2.j.f27534a;
    }

    @Override // de.n
    public int getState() {
        return 1;
    }

    @Override // de.n
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // de.n
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // de.n
    public boolean requiresSecureDecoder(String str) {
        return false;
    }

    @Override // de.n
    public void acquire(p pVar) {
    }

    @Override // de.n
    public void release(p pVar) {
    }
}
