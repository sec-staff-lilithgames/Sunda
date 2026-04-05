package io.odeeo.internal.f;

import io.odeeo.internal.f.g;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface f {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f63917a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f63917a = i10;
        }
    }

    static void replaceSession(f fVar, f fVar2) {
        if (fVar == fVar2) {
            return;
        }
        if (fVar2 != null) {
            fVar2.acquire(null);
        }
        if (fVar != null) {
            fVar.release(null);
        }
    }

    void acquire(g.a aVar);

    io.odeeo.internal.e.b getCryptoConfig();

    a getError();

    byte[] getOfflineLicenseKeySetId();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    Map<String, String> queryKeyStatus();

    void release(g.a aVar);

    boolean requiresSecureDecoder(String str);
}
