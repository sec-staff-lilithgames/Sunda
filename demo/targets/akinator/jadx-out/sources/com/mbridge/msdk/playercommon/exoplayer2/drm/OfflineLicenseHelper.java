package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OfflineLicenseHelper<T extends ExoMediaCrypto> {
    private final ConditionVariable conditionVariable;
    private final DefaultDrmSessionManager<T> drmSessionManager;
    private final HandlerThread handlerThread;

    public OfflineLicenseHelper(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map) {
        HandlerThread handlerThread = new HandlerThread("OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.conditionVariable = new ConditionVariable();
        DefaultDrmSessionEventListener defaultDrmSessionEventListener = new DefaultDrmSessionEventListener() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.OfflineLicenseHelper.1
            @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
            public void onDrmKeysLoaded() {
                OfflineLicenseHelper.this.conditionVariable.open();
            }

            @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
            public void onDrmKeysRemoved() {
                OfflineLicenseHelper.this.conditionVariable.open();
            }

            @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
            public void onDrmKeysRestored() {
                OfflineLicenseHelper.this.conditionVariable.open();
            }

            @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
            public void onDrmSessionManagerError(Exception exc) {
                OfflineLicenseHelper.this.conditionVariable.open();
            }
        };
        DefaultDrmSessionManager<T> defaultDrmSessionManager = new DefaultDrmSessionManager<>(uuid, exoMediaDrm, mediaDrmCallback, map);
        this.drmSessionManager = defaultDrmSessionManager;
        defaultDrmSessionManager.addListener(new Handler(handlerThread.getLooper()), defaultDrmSessionEventListener);
    }

    private byte[] blockingKeyRequest(int i10, byte[] bArr, DrmInitData drmInitData) throws DrmSession.DrmSessionException {
        DrmSession<T> drmSessionOpenBlockingKeyRequest = openBlockingKeyRequest(i10, bArr, drmInitData);
        DrmSession.DrmSessionException error = drmSessionOpenBlockingKeyRequest.getError();
        byte[] offlineLicenseKeySetId = drmSessionOpenBlockingKeyRequest.getOfflineLicenseKeySetId();
        this.drmSessionManager.releaseSession(drmSessionOpenBlockingKeyRequest);
        if (error == null) {
            return offlineLicenseKeySetId;
        }
        throw error;
    }

    public static OfflineLicenseHelper<FrameworkMediaCrypto> newWidevineInstance(String str, HttpDataSource.Factory factory) throws UnsupportedDrmException {
        return newWidevineInstance(str, false, factory, null);
    }

    private DrmSession<T> openBlockingKeyRequest(int i10, byte[] bArr, DrmInitData drmInitData) {
        this.drmSessionManager.setMode(i10, bArr);
        this.conditionVariable.close();
        DrmSession<T> drmSessionAcquireSession = this.drmSessionManager.acquireSession(this.handlerThread.getLooper(), drmInitData);
        this.conditionVariable.block();
        return drmSessionAcquireSession;
    }

    public synchronized byte[] downloadLicense(DrmInitData drmInitData) throws DrmSession.DrmSessionException {
        Assertions.checkArgument(drmInitData != null);
        return blockingKeyRequest(2, null, drmInitData);
    }

    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        DrmSession<T> drmSessionOpenBlockingKeyRequest = openBlockingKeyRequest(1, bArr, null);
        DrmSession.DrmSessionException error = drmSessionOpenBlockingKeyRequest.getError();
        Pair<Long, Long> licenseDurationRemainingSec = WidevineUtil.getLicenseDurationRemainingSec(drmSessionOpenBlockingKeyRequest);
        this.drmSessionManager.releaseSession(drmSessionOpenBlockingKeyRequest);
        if (error == null) {
            return licenseDurationRemainingSec;
        }
        if (!(error.getCause() instanceof KeysExpiredException)) {
            throw error;
        }
        return Pair.create(0L, 0L);
    }

    public synchronized byte[] getPropertyByteArray(String str) {
        return this.drmSessionManager.getPropertyByteArray(str);
    }

    public synchronized String getPropertyString(String str) {
        return this.drmSessionManager.getPropertyString(str);
    }

    public void release() {
        this.handlerThread.quit();
    }

    public synchronized void releaseLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        blockingKeyRequest(3, bArr, null);
    }

    public synchronized byte[] renewLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        return blockingKeyRequest(2, bArr, null);
    }

    public synchronized void setPropertyByteArray(String str, byte[] bArr) {
        this.drmSessionManager.setPropertyByteArray(str, bArr);
    }

    public synchronized void setPropertyString(String str, String str2) {
        this.drmSessionManager.setPropertyString(str, str2);
    }

    public static OfflineLicenseHelper<FrameworkMediaCrypto> newWidevineInstance(String str, boolean z10, HttpDataSource.Factory factory) throws UnsupportedDrmException {
        return newWidevineInstance(str, z10, factory, null);
    }

    public static OfflineLicenseHelper<FrameworkMediaCrypto> newWidevineInstance(String str, boolean z10, HttpDataSource.Factory factory, HashMap<String, String> map) throws UnsupportedDrmException {
        UUID uuid = C.WIDEVINE_UUID;
        return new OfflineLicenseHelper<>(uuid, FrameworkMediaDrm.newInstance(uuid), new HttpMediaDrmCallback(str, z10, factory), map);
    }
}
