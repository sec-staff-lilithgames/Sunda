package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import de.a0;
import de.c0;
import de.d0;
import de.e0;
import de.g0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface e {
    void acquire();

    void closeSession(byte[] bArr);

    ce.b createCryptoConfig(byte[] bArr) throws MediaCryptoException;

    int getCryptoType();

    a0 getKeyRequest(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    PersistableBundle getMetrics();

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    g0 getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(c0 c0Var);

    void setOnExpirationUpdateListener(d0 d0Var);

    void setOnKeyStatusChangeListener(e0 e0Var);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);

    default void setPlayerIdForSession(byte[] bArr, zd.c0 c0Var) {
    }
}
