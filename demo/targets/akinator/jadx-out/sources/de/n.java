package de;

import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface n {
    static void replaceSession(n nVar, n nVar2) {
        if (nVar == nVar2) {
            return;
        }
        if (nVar2 != null) {
            nVar2.acquire(null);
        }
        if (nVar != null) {
            nVar.release(null);
        }
    }

    void acquire(p pVar);

    ce.b getCryptoConfig();

    m getError();

    byte[] getOfflineLicenseKeySetId();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    Map<String, String> queryKeyStatus();

    void release(p pVar);

    boolean requiresSecureDecoder(String str);
}
