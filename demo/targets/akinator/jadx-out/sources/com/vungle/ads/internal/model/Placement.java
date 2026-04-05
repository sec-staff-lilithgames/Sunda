package com.vungle.ads.internal.model;

import com.vungle.ads.internal.Constants;
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
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Placement {
    public static final Companion Companion = new Companion(null);
    private final boolean headerBidding;
    private final String referenceId;
    private final String type;
    private Long wakeupTime;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Placement> serializer() {
            return Placement$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ Placement(int i10, @SerialName("placement_ref_id") String str, @SerialName("is_hb") boolean z10, @SerialName("type") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, Placement$$serializer.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        if ((i10 & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z10;
        }
        if ((i10 & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = placement.referenceId;
        }
        if ((i10 & 2) != 0) {
            z10 = placement.headerBidding;
        }
        if ((i10 & 4) != 0) {
            str2 = placement.type;
        }
        return placement.copy(str, z10, str2);
    }

    public static final void write$Self(Placement self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.referenceId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.headerBidding) {
            output.encodeBooleanElement(serialDesc, 1, self.headerBidding);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.type == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.type);
    }

    public final String component1() {
        return this.referenceId;
    }

    public final boolean component2() {
        return this.headerBidding;
    }

    public final String component3() {
        return this.type;
    }

    public final Placement copy(String referenceId, boolean z10, String str) {
        e0.checkNotNullParameter(referenceId, "referenceId");
        return new Placement(referenceId, z10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) obj;
        return e0.areEqual(this.referenceId, placement.referenceId) && this.headerBidding == placement.headerBidding && e0.areEqual(this.type, placement.type);
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z10 = this.headerBidding;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        String str = this.type;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isAppOpen() {
        return e0.areEqual(this.type, Constants.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return e0.areEqual(this.type, "banner");
    }

    public final boolean isInline() {
        return e0.areEqual(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return e0.areEqual(this.type, "interstitial");
    }

    public final boolean isMREC() {
        return e0.areEqual(this.type, "mrec");
    }

    public final boolean isNative() {
        return e0.areEqual(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return e0.areEqual(this.type, "rewarded");
    }

    public final void setWakeupTime(Long l9) {
        this.wakeupTime = l9;
    }

    public final void snooze(long j10) {
        this.wakeupTime = Long.valueOf((j10 * 1000) + System.currentTimeMillis());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Placement(referenceId=");
        sb2.append(this.referenceId);
        sb2.append(", headerBidding=");
        sb2.append(this.headerBidding);
        sb2.append(", type=");
        return o2.q(sb2, this.type, ')');
    }

    public Placement(String referenceId, boolean z10, String str) {
        e0.checkNotNullParameter(referenceId, "referenceId");
        this.referenceId = referenceId;
        this.headerBidding = z10;
        this.type = str;
    }

    public /* synthetic */ Placement(String str, boolean z10, String str2, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str2);
    }

    @SerialName("is_hb")
    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    @SerialName("placement_ref_id")
    public static /* synthetic */ void getReferenceId$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @Transient
    public static /* synthetic */ void getWakeupTime$annotations() {
    }
}
