package com.vungle.ads.internal.signals;

import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.model.UnclosedAd;
import e3.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class SessionData {
    public static final Companion Companion = new Companion(null);
    private int httpProxyEnabled;
    private int isDevice;
    private int isVPNConnected;
    private int overlayGranted;
    private int sensorCount;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<SignaledAd> signaledAd;
    private List<UnclosedAd> unclosedAd;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<SessionData> serializer() {
            return SessionData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SessionData(int i10) {
        this.sessionCount = i10;
        this.sessionId = i.c("randomUUID().toString()");
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sessionData.sessionCount;
        }
        return sessionData.copy(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self(com.vungle.ads.internal.signals.SessionData r7, kotlinx.serialization.encoding.CompositeEncoder r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.signals.SessionData.write$Self(com.vungle.ads.internal.signals.SessionData, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int component1() {
        return this.sessionCount;
    }

    public final SessionData copy(int i10) {
        return new SessionData(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionData) && this.sessionCount == ((SessionData) obj).sessionCount;
    }

    public final int getHttpProxyEnabled() {
        return this.httpProxyEnabled;
    }

    public final int getOverlayGranted() {
        return this.overlayGranted;
    }

    public final int getSensorCount() {
        return this.sensorCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<SignaledAd> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<UnclosedAd> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionCount);
    }

    public final int isDevice() {
        return this.isDevice;
    }

    public final int isVPNConnected() {
        return this.isVPNConnected;
    }

    public final void setDevice(int i10) {
        this.isDevice = i10;
    }

    public final void setHttpProxyEnabled(int i10) {
        this.httpProxyEnabled = i10;
    }

    public final void setOverlayGranted(int i10) {
        this.overlayGranted = i10;
    }

    public final void setSensorCount(int i10) {
        this.sensorCount = i10;
    }

    public final void setSessionCreationTime(long j10) {
        this.sessionCreationTime = j10;
    }

    public final void setSessionDepthCounter(int i10) {
        this.sessionDepthCounter = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSignaledAd(List<SignaledAd> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<UnclosedAd> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.unclosedAd = list;
    }

    public final void setVPNConnected(int i10) {
        this.isVPNConnected = i10;
    }

    public String toString() {
        return g.m(new StringBuilder("SessionData(sessionCount="), this.sessionCount, ')');
    }

    @f
    public /* synthetic */ SessionData(int i10, @SerialName("103") int i11, @SerialName(StatisticData.ERROR_CODE_IO_ERROR) String str, @SerialName(StatisticData.ERROR_CODE_NOT_FOUND) long j10, @SerialName("106") List list, @SerialName("102") long j11, @SerialName("104") int i12, @SerialName("105") List list2, @SerialName("112") int i13, @SerialName("113") int i14, @SerialName("114") int i15, @SerialName("115") int i16, @SerialName("116") int i17, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, SessionData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionCount = i11;
        if ((i10 & 2) == 0) {
            this.sessionId = i.c("randomUUID().toString()");
        } else {
            this.sessionId = str;
        }
        if ((i10 & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j10;
        }
        if ((i10 & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i10 & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j11;
        }
        if ((i10 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i12;
        }
        if ((i10 & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
        if ((i10 & 128) == 0) {
            this.isDevice = 0;
        } else {
            this.isDevice = i13;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.isVPNConnected = 0;
        } else {
            this.isVPNConnected = i14;
        }
        if ((i10 & 512) == 0) {
            this.overlayGranted = 0;
        } else {
            this.overlayGranted = i15;
        }
        if ((i10 & 1024) == 0) {
            this.sensorCount = 0;
        } else {
            this.sensorCount = i16;
        }
        if ((i10 & 2048) == 0) {
            this.httpProxyEnabled = 0;
        } else {
            this.httpProxyEnabled = i17;
        }
    }

    @SerialName("116")
    public static /* synthetic */ void getHttpProxyEnabled$annotations() {
    }

    @SerialName("114")
    public static /* synthetic */ void getOverlayGranted$annotations() {
    }

    @SerialName("115")
    public static /* synthetic */ void getSensorCount$annotations() {
    }

    @SerialName("103")
    public static /* synthetic */ void getSessionCount$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_NOT_FOUND)
    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    @SerialName("104")
    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    @SerialName("102")
    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_IO_ERROR)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @SerialName("106")
    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    @SerialName("105")
    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    @SerialName("112")
    public static /* synthetic */ void isDevice$annotations() {
    }

    @SerialName("113")
    public static /* synthetic */ void isVPNConnected$annotations() {
    }
}
