package com.vungle.ads.internal.signals;

import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class SignaledAd {
    public static final Companion Companion = new Companion(null);
    private long adAvailabilityCallbackTime;
    private String eventId;
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<SignaledAd> serializer() {
            return SignaledAd$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SignaledAd() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ SignaledAd copy$default(SignaledAd signaledAd, Long l9, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l9 = signaledAd.lastAdLoadTime;
        }
        if ((i10 & 2) != 0) {
            j10 = signaledAd.loadAdTime;
        }
        return signaledAd.copy(l9, j10);
    }

    private final long getTimeDifference(Long l9, long j10) {
        if (l9 == null) {
            return -1L;
        }
        long jLongValue = j10 - l9.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    public static final void write$Self(SignaledAd self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.templateSignals != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.templateSignals);
        }
        output.encodeLongElement(serialDesc, 1, self.timeSinceLastAdLoad);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.eventId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.eventId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.timeBetweenAdAvailabilityAndPlayAd != 0) {
            output.encodeLongElement(serialDesc, 3, self.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.screenOrientation == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 4, self.screenOrientation);
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    public final Long component1() {
        return this.lastAdLoadTime;
    }

    public final long component2() {
        return this.loadAdTime;
    }

    public final SignaledAd copy(Long l9, long j10) {
        return new SignaledAd(l9, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignaledAd)) {
            return false;
        }
        SignaledAd signaledAd = (SignaledAd) obj;
        return e0.areEqual(this.lastAdLoadTime, signaledAd.lastAdLoadTime) && this.loadAdTime == signaledAd.loadAdTime;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public int hashCode() {
        Long l9 = this.lastAdLoadTime;
        return Long.hashCode(this.loadAdTime) + ((l9 == null ? 0 : l9.hashCode()) * 31);
    }

    public final void setAdAvailabilityCallbackTime(long j10) {
        this.adAvailabilityCallbackTime = j10;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j10) {
        this.playAdTime = j10;
    }

    public final void setScreenOrientation(int i10) {
        this.screenOrientation = i10;
    }

    public final void setTemplateSignals(String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j10) {
        this.timeBetweenAdAvailabilityAndPlayAd = j10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SignaledAd(lastAdLoadTime=");
        sb2.append(this.lastAdLoadTime);
        sb2.append(", loadAdTime=");
        return g.n(sb2, this.loadAdTime, ')');
    }

    @f
    public /* synthetic */ SignaledAd(int i10, @SerialName("500") String str, @SerialName("109") long j10, @SerialName("107") String str2, @SerialName("110") long j11, @SerialName("108") int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i10 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 2, SignaledAd$$serializer.INSTANCE.getDescriptor());
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i10 & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j10;
        if ((i10 & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i10 & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j11;
        }
        if ((i10 & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i11;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public SignaledAd(Long l9, long j10) {
        this.lastAdLoadTime = l9;
        this.loadAdTime = j10;
        this.timeSinceLastAdLoad = getTimeDifference(l9, j10);
    }

    public /* synthetic */ SignaledAd(Long l9, long j10, int i10, u uVar) {
        this((i10 & 1) != 0 ? 0L : l9, (i10 & 2) != 0 ? 0L : j10);
    }

    @Transient
    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    @SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @Transient
    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    @Transient
    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    @Transient
    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    @SerialName("108")
    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    @SerialName("500")
    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    @SerialName("110")
    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    @SerialName("109")
    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }
}
