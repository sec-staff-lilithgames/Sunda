package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import b0.e2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DefaultDrmSessionManager<T extends ExoMediaCrypto> implements DrmSessionManager<T>, DefaultDrmSession.ProvisioningManager<T> {
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final String TAG = "DefaultDrmSessionMgr";
    private final MediaDrmCallback callback;
    private final DefaultDrmSessionEventListener.EventDispatcher eventDispatcher;
    private final int initialDrmRequestRetryCount;
    private final ExoMediaDrm<T> mediaDrm;
    volatile DefaultDrmSessionManager<T>.MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    private byte[] offlineLicenseKeySetId;
    private final HashMap<String, String> optionalKeyRequestParameters;
    private Looper playbackLooper;
    private final List<DefaultDrmSession<T>> provisioningSessions;
    private final List<DefaultDrmSession<T>> sessions;
    private final UUID uuid;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public interface EventListener extends DefaultDrmSessionEventListener {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener<T> {
        private MediaDrmEventListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.OnEventListener
        public void onEvent(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
            if (DefaultDrmSessionManager.this.mode == 0) {
                DefaultDrmSessionManager.this.mediaDrmHandler.obtainMessage(i10, bArr).sendToTarget();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this(uuid, exoMediaDrm, mediaDrmCallback, map);
        if (handler == null || defaultDrmSessionEventListener == null) {
            return;
        }
        addListener(handler, defaultDrmSessionEventListener);
    }

    private static DrmInitData.SchemeData getSchemeData(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i10 = 0; i10 < drmInitData.schemeDataCount; i10++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i10);
            if ((schemeData.matches(uuid) || (C.CLEARKEY_UUID.equals(uuid) && schemeData.matches(C.COMMON_PSSH_UUID))) && (schemeData.data != null || z10)) {
                arrayList.add(schemeData);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (C.WIDEVINE_UUID.equals(uuid)) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(i11);
                int version = schemeData2.hasData() ? PsshAtomUtil.parseVersion(schemeData2.data) : -1;
                int i12 = Util.SDK_INT;
                if ((i12 < 23 && version == 0) || (i12 >= 23 && version == 1)) {
                    return schemeData2;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    @Deprecated
    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance(UUID uuid, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> defaultDrmSessionManagerNewFrameworkInstance = newFrameworkInstance(uuid, mediaDrmCallback, map);
        if (handler != null && defaultDrmSessionEventListener != null) {
            defaultDrmSessionManagerNewFrameworkInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return defaultDrmSessionManagerNewFrameworkInstance;
    }

    @Deprecated
    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance(MediaDrmCallback mediaDrmCallback, String str, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> defaultDrmSessionManagerNewPlayReadyInstance = newPlayReadyInstance(mediaDrmCallback, str);
        if (handler != null && defaultDrmSessionEventListener != null) {
            defaultDrmSessionManagerNewPlayReadyInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return defaultDrmSessionManagerNewPlayReadyInstance;
    }

    @Deprecated
    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance(MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> defaultDrmSessionManagerNewWidevineInstance = newWidevineInstance(mediaDrmCallback, map);
        if (handler != null && defaultDrmSessionEventListener != null) {
            defaultDrmSessionManagerNewWidevineInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return defaultDrmSessionManagerNewWidevineInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager
    public DrmSession<T> acquireSession(Looper looper, DrmInitData drmInitData) {
        DrmInitData.SchemeData schemeData;
        Object obj;
        Looper looper2 = this.playbackLooper;
        Assertions.checkState(looper2 == null || looper2 == looper);
        if (this.sessions.isEmpty()) {
            this.playbackLooper = looper;
            if (this.mediaDrmHandler == null) {
                this.mediaDrmHandler = new MediaDrmHandler(looper);
            }
        }
        DefaultDrmSession<T> defaultDrmSession = null;
        defaultDrmSession = null;
        if (this.offlineLicenseKeySetId == null) {
            DrmInitData.SchemeData schemeData2 = getSchemeData(drmInitData, this.uuid, false);
            if (schemeData2 == null) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.uuid);
                this.eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
            schemeData = schemeData2;
        } else {
            schemeData = null;
        }
        if (this.multiSession) {
            byte[] bArr = schemeData != null ? schemeData.data : null;
            Iterator<DefaultDrmSession<T>> it = this.sessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) it.next();
                if (defaultDrmSession2.hasInitData(bArr)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        } else if (!this.sessions.isEmpty()) {
            defaultDrmSession = this.sessions.get(0);
        }
        if (defaultDrmSession == null) {
            DefaultDrmSession<T> defaultDrmSession3 = new DefaultDrmSession<>(this.uuid, this.mediaDrm, this, schemeData, this.mode, this.offlineLicenseKeySetId, this.optionalKeyRequestParameters, this.callback, looper, this.eventDispatcher, this.initialDrmRequestRetryCount);
            this.sessions.add(defaultDrmSession3);
            obj = defaultDrmSession3;
        } else {
            obj = defaultDrmSession;
        }
        ((DefaultDrmSession) obj).acquire();
        return (DrmSession<T>) obj;
    }

    public final void addListener(Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this.eventDispatcher.addListener(handler, defaultDrmSessionEventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager
    public boolean canAcquireSession(DrmInitData drmInitData) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeData(drmInitData, this.uuid, true) == null) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(C.COMMON_PSSH_UUID)) {
                return false;
            }
            Log.w(TAG, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.uuid);
        }
        String str = drmInitData.schemeType;
        if (str == null || C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        return !(C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cbcs.equals(str) || C.CENC_TYPE_cens.equals(str)) || Util.SDK_INT >= 25;
    }

    public final byte[] getPropertyByteArray(String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    public final String getPropertyString(String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
    public void onProvisionCompleted() {
        Iterator<DefaultDrmSession<T>> it = this.provisioningSessions.iterator();
        while (it.hasNext()) {
            it.next().onProvisionCompleted();
        }
        this.provisioningSessions.clear();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
    public void onProvisionError(Exception exc) {
        Iterator<DefaultDrmSession<T>> it = this.provisioningSessions.iterator();
        while (it.hasNext()) {
            it.next().onProvisionError(exc);
        }
        this.provisioningSessions.clear();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
    public void provisionRequired(DefaultDrmSession<T> defaultDrmSession) {
        this.provisioningSessions.add(defaultDrmSession);
        if (this.provisioningSessions.size() == 1) {
            defaultDrmSession.provision();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager
    public void releaseSession(DrmSession<T> drmSession) {
        if (drmSession instanceof ErrorStateDrmSession) {
            return;
        }
        DefaultDrmSession<T> defaultDrmSession = (DefaultDrmSession) drmSession;
        if (defaultDrmSession.release()) {
            this.sessions.remove(defaultDrmSession);
            if (this.provisioningSessions.size() > 1 && this.provisioningSessions.get(0) == defaultDrmSession) {
                this.provisioningSessions.get(1).provision();
            }
            this.provisioningSessions.remove(defaultDrmSession);
        }
    }

    public final void removeListener(DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this.eventDispatcher.removeListener(defaultDrmSessionEventListener);
    }

    public void setMode(int i10, byte[] bArr) {
        Assertions.checkState(this.sessions.isEmpty());
        if (i10 == 1 || i10 == 3) {
            Assertions.checkNotNull(bArr);
        }
        this.mode = i10;
        this.offlineLicenseKeySetId = bArr;
    }

    public final void setPropertyByteArray(String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    public final void setPropertyString(String str, String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map) {
        this(uuid, (ExoMediaDrm) exoMediaDrm, mediaDrmCallback, map, false, 3);
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance(UUID uuid, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map) throws UnsupportedDrmException {
        return new DefaultDrmSessionManager<>(uuid, (ExoMediaDrm) FrameworkMediaDrm.newInstance(uuid), mediaDrmCallback, map, false, 3);
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance(MediaDrmCallback mediaDrmCallback, String str) throws UnsupportedDrmException {
        return newFrameworkInstance(C.PLAYREADY_UUID, mediaDrmCallback, !TextUtils.isEmpty(str) ? e2.s(PLAYREADY_CUSTOM_DATA_KEY, str) : null);
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance(MediaDrmCallback mediaDrmCallback, HashMap<String, String> map) throws UnsupportedDrmException {
        return newFrameworkInstance(C.WIDEVINE_UUID, mediaDrmCallback, map);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener, boolean z10) {
        this(uuid, exoMediaDrm, mediaDrmCallback, map, z10);
        if (handler == null || defaultDrmSessionEventListener == null) {
            return;
        }
        addListener(handler, defaultDrmSessionEventListener);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, boolean z10) {
        this(uuid, exoMediaDrm, mediaDrmCallback, map, z10, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener, boolean z10, int i10) {
        this(uuid, exoMediaDrm, mediaDrmCallback, map, z10, i10);
        if (handler == null || defaultDrmSessionEventListener == null) {
            return;
        }
        addListener(handler, defaultDrmSessionEventListener);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, boolean z10, int i10) {
        Assertions.checkNotNull(uuid);
        Assertions.checkNotNull(exoMediaDrm);
        Assertions.checkArgument(!C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        this.mediaDrm = exoMediaDrm;
        this.callback = mediaDrmCallback;
        this.optionalKeyRequestParameters = map;
        this.eventDispatcher = new DefaultDrmSessionEventListener.EventDispatcher();
        this.multiSession = z10;
        this.initialDrmRequestRetryCount = i10;
        this.mode = 0;
        this.sessions = new ArrayList();
        this.provisioningSessions = new ArrayList();
        if (z10) {
            exoMediaDrm.setPropertyString("sessionSharing", a.f37604j);
        }
        exoMediaDrm.setOnEventListener(new MediaDrmEventListener());
    }
}
