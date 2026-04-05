package io.odeeo.internal.f;

import io.odeeo.internal.f.f;
import io.odeeo.internal.f.g;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f63926a;

    public l(f.a aVar) {
        this.f63926a = (f.a) io.odeeo.internal.q0.a.checkNotNull(aVar);
    }

    @Override // io.odeeo.internal.f.f
    public io.odeeo.internal.e.b getCryptoConfig() {
        return null;
    }

    @Override // io.odeeo.internal.f.f
    public f.a getError() {
        return this.f63926a;
    }

    @Override // io.odeeo.internal.f.f
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // io.odeeo.internal.f.f
    public final UUID getSchemeUuid() {
        return io.odeeo.internal.b.h.f62709a;
    }

    @Override // io.odeeo.internal.f.f
    public int getState() {
        return 1;
    }

    @Override // io.odeeo.internal.f.f
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // io.odeeo.internal.f.f
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // io.odeeo.internal.f.f
    public boolean requiresSecureDecoder(String str) {
        return false;
    }

    @Override // io.odeeo.internal.f.f
    public void acquire(g.a aVar) {
    }

    @Override // io.odeeo.internal.f.f
    public void release(g.a aVar) {
    }
}
