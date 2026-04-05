package com.vungle.ads.internal.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class UnclosedAd {
    public static final Companion Companion = new Companion(null);
    private final String eventId;
    private String sessionId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<UnclosedAd> serializer() {
            return UnclosedAd$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ UnclosedAd(int i10, @SerialName("107") String str, @SerialName(StatisticData.ERROR_CODE_IO_ERROR) String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, UnclosedAd$$serializer.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i10 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ UnclosedAd copy$default(UnclosedAd unclosedAd, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unclosedAd.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = unclosedAd.sessionId;
        }
        return unclosedAd.copy(str, str2);
    }

    public static final void write$Self(UnclosedAd self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.eventId);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && e0.areEqual(self.sessionId, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.sessionId);
    }

    public final String component1() {
        return this.eventId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final UnclosedAd copy(String eventId, String sessionId) {
        e0.checkNotNullParameter(eventId, "eventId");
        e0.checkNotNullParameter(sessionId, "sessionId");
        return new UnclosedAd(eventId, sessionId);
    }

    public boolean equals(Object obj) {
        if (obj != null && e0.areEqual(UnclosedAd.class, obj.getClass())) {
            UnclosedAd unclosedAd = (UnclosedAd) obj;
            if (e0.areEqual(this.eventId, unclosedAd.eventId) && e0.areEqual(this.sessionId, unclosedAd.sessionId)) {
                return true;
            }
        }
        return false;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.eventId.hashCode() * 31);
    }

    public final void setSessionId(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnclosedAd(eventId=");
        sb2.append(this.eventId);
        sb2.append(", sessionId=");
        return o2.q(sb2, this.sessionId, ')');
    }

    public UnclosedAd(String eventId, String sessionId) {
        e0.checkNotNullParameter(eventId, "eventId");
        e0.checkNotNullParameter(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    public /* synthetic */ UnclosedAd(String str, String str2, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    @SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_IO_ERROR)
    public static /* synthetic */ void getSessionId$annotations() {
    }
}
