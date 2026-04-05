package sn;

import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface o {
    static void replaceSession(o oVar, o oVar2) {
        if (oVar == oVar2) {
            return;
        }
        if (oVar2 != null) {
            oVar2.acquire(null);
        }
        if (oVar != null) {
            oVar.release(null);
        }
    }

    void acquire(q qVar);

    nn.b getCryptoConfig();

    n getError();

    byte[] getOfflineLicenseKeySetId();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    Map<String, String> queryKeyStatus();

    void release(q qVar);

    boolean requiresSecureDecoder(String str);
}
