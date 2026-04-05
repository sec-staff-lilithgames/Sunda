package sn;

import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final n f85931a;

    public a0(n nVar) {
        this.f85931a = (n) io.bidmachine.media3.common.util.a.checkNotNull(nVar);
    }

    @Override // sn.o
    public nn.b getCryptoConfig() {
        return null;
    }

    @Override // sn.o
    public n getError() {
        return this.f85931a;
    }

    @Override // sn.o
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // sn.o
    public final UUID getSchemeUuid() {
        return gn.l.f57984a;
    }

    @Override // sn.o
    public int getState() {
        return 1;
    }

    @Override // sn.o
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // sn.o
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // sn.o
    public boolean requiresSecureDecoder(String str) {
        return false;
    }

    @Override // sn.o
    public void acquire(q qVar) {
    }

    @Override // sn.o
    public void release(q qVar) {
    }
}
