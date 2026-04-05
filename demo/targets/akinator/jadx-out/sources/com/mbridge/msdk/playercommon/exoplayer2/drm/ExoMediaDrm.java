package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ExoMediaDrm<T extends ExoMediaCrypto> {
    public static final int EVENT_KEY_EXPIRED = 3;
    public static final int EVENT_KEY_REQUIRED = 2;
    public static final int EVENT_PROVISION_REQUIRED = 1;
    public static final int KEY_TYPE_OFFLINE = 2;
    public static final int KEY_TYPE_RELEASE = 3;
    public static final int KEY_TYPE_STREAMING = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultKeyRequest implements KeyRequest {
        private final byte[] data;
        private final String defaultUrl;

        public DefaultKeyRequest(byte[] bArr, String str) {
            this.data = bArr;
            this.defaultUrl = str;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyRequest
        public byte[] getData() {
            return this.data;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyRequest
        public String getDefaultUrl() {
            return this.defaultUrl;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultKeyStatus implements KeyStatus {
        private final byte[] keyId;
        private final int statusCode;

        public DefaultKeyStatus(int i10, byte[] bArr) {
            this.statusCode = i10;
            this.keyId = bArr;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyStatus
        public byte[] getKeyId() {
            return this.keyId;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyStatus
        public int getStatusCode() {
            return this.statusCode;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultProvisionRequest implements ProvisionRequest {
        private final byte[] data;
        private final String defaultUrl;

        public DefaultProvisionRequest(byte[] bArr, String str) {
            this.data = bArr;
            this.defaultUrl = str;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.ProvisionRequest
        public byte[] getData() {
            return this.data;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.ProvisionRequest
        public String getDefaultUrl() {
            return this.defaultUrl;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface KeyRequest {
        byte[] getData();

        String getDefaultUrl();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface KeyStatus {
        byte[] getKeyId();

        int getStatusCode();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnEventListener<T extends ExoMediaCrypto> {
        void onEvent(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnKeyStatusChangeListener<T extends ExoMediaCrypto> {
        void onKeyStatusChange(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, List<KeyStatus> list, boolean z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ProvisionRequest {
        byte[] getData();

        String getDefaultUrl();
    }

    void closeSession(byte[] bArr);

    T createMediaCrypto(byte[] bArr) throws MediaCryptoException;

    KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i10, HashMap<String, String> map) throws NotProvisionedException;

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    ProvisionRequest getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(OnEventListener<? super T> onEventListener);

    void setOnKeyStatusChangeListener(OnKeyStatusChangeListener<? super T> onKeyStatusChangeListener);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);
}
