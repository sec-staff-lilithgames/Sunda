package com.vungle.ads.fpd;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.util.RangeUtil;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Revenue {
    public static final Companion Companion = new Companion(null);
    private Float earningsByPlacementUSD;
    private Boolean isUserAPurchaser;
    private Boolean isUserASubscriber;
    private Float last30DaysMeanSpendUSD;
    private Float last30DaysMedianSpendUSD;
    private Float last30DaysPlacementFillRate;
    private Float last30DaysTotalSpendUSD;
    private Float last30DaysUserLtvUSD;
    private Float last30DaysUserPltvUSD;
    private Float last7DaysMeanSpendUSD;
    private Float last7DaysMedianSpendUSD;
    private Float last7DaysPlacementFillRate;
    private Float last7DaysTotalSpendUSD;
    private Float last7DaysUserLtvUSD;
    private Float last7DaysUserPltvUSD;
    private List<String> topNAdomain;
    private Float totalEarningsUSD;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Revenue> serializer() {
            return Revenue$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Revenue() {
    }

    public static final void write$Self(Revenue self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.totalEarningsUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.totalEarningsUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.earningsByPlacementUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, FloatSerializer.INSTANCE, self.earningsByPlacementUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.topNAdomain != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, new ArrayListSerializer(StringSerializer.INSTANCE), self.topNAdomain);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isUserAPurchaser != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.isUserAPurchaser);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isUserASubscriber != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.isUserASubscriber);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.last7DaysTotalSpendUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, FloatSerializer.INSTANCE, self.last7DaysTotalSpendUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.last7DaysMedianSpendUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, FloatSerializer.INSTANCE, self.last7DaysMedianSpendUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.last7DaysMeanSpendUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, FloatSerializer.INSTANCE, self.last7DaysMeanSpendUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.last30DaysTotalSpendUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, FloatSerializer.INSTANCE, self.last30DaysTotalSpendUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.last30DaysMedianSpendUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, FloatSerializer.INSTANCE, self.last30DaysMedianSpendUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.last30DaysMeanSpendUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, FloatSerializer.INSTANCE, self.last30DaysMeanSpendUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.last7DaysUserPltvUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, FloatSerializer.INSTANCE, self.last7DaysUserPltvUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.last7DaysUserLtvUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, FloatSerializer.INSTANCE, self.last7DaysUserLtvUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.last30DaysUserPltvUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, FloatSerializer.INSTANCE, self.last30DaysUserPltvUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.last30DaysUserLtvUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, FloatSerializer.INSTANCE, self.last30DaysUserLtvUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.last7DaysPlacementFillRate != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, FloatSerializer.INSTANCE, self.last7DaysPlacementFillRate);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 16) && self.last30DaysPlacementFillRate == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 16, FloatSerializer.INSTANCE, self.last30DaysPlacementFillRate);
    }

    public final Revenue setEarningsByPlacement(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.earningsByPlacementUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setIsUserAPurchaser(boolean z10) {
        this.isUserAPurchaser = Boolean.valueOf(z10);
        return this;
    }

    public final Revenue setIsUserASubscriber(boolean z10) {
        this.isUserASubscriber = Boolean.valueOf(z10);
        return this;
    }

    public final Revenue setLast30DaysMeanSpendUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysMeanSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast30DaysMedianSpendUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysMedianSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast30DaysPlacementFillRate(float f10) {
        if (RangeUtil.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.last30DaysPlacementFillRate = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast30DaysTotalSpendUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysTotalSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast30DaysUserLtvUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysUserLtvUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast30DaysUserPltvUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysUserPltvUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast7DaysMeanSpendUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysMeanSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast7DaysMedianSpendUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysMedianSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast7DaysPlacementFillRate(float f10) {
        if (RangeUtil.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.last7DaysPlacementFillRate = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast7DaysTotalSpendUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysTotalSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast7DaysUserLtvUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysUserLtvUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setLast7DaysUserPltvUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysUserPltvUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setTopNAdomain(List<String> list) {
        this.topNAdomain = list != null ? y0.toMutableList((Collection) list) : null;
        return this;
    }

    public final Revenue setTotalEarningsUsd(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalEarningsUSD = Float.valueOf(f10);
        }
        return this;
    }

    @f
    public /* synthetic */ Revenue(int i10, @SerialName("total_earnings_usd") Float f10, @SerialName("earnings_by_placement_usd") Float f11, @SerialName("top_n_adomain") List list, @SerialName("is_user_a_purchaser") Boolean bool, @SerialName("is_user_a_subscriber") Boolean bool2, @SerialName("last_7_days_total_spend_usd") Float f12, @SerialName("last_7_days_median_spend_usd") Float f13, @SerialName("last_7_days_mean_spend_usd") Float f14, @SerialName("last_30_days_total_spend_usd") Float f15, @SerialName("last_30_days_median_spend_usd") Float f16, @SerialName("last_30_days_mean_spend_usd") Float f17, @SerialName("last_7_days_user_pltv_usd") Float f18, @SerialName("last_7_days_user_ltv_usd") Float f19, @SerialName("last_30_days_user_pltv_usd") Float f20, @SerialName("last_30_days_user_ltv_usd") Float f21, @SerialName("last_7_days_placement_fill_rate") Float f22, @SerialName("last_30_days_placement_fill_rate") Float f23, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.totalEarningsUSD = null;
        } else {
            this.totalEarningsUSD = f10;
        }
        if ((i10 & 2) == 0) {
            this.earningsByPlacementUSD = null;
        } else {
            this.earningsByPlacementUSD = f11;
        }
        if ((i10 & 4) == 0) {
            this.topNAdomain = null;
        } else {
            this.topNAdomain = list;
        }
        if ((i10 & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
        if ((i10 & 16) == 0) {
            this.isUserASubscriber = null;
        } else {
            this.isUserASubscriber = bool2;
        }
        if ((i10 & 32) == 0) {
            this.last7DaysTotalSpendUSD = null;
        } else {
            this.last7DaysTotalSpendUSD = f12;
        }
        if ((i10 & 64) == 0) {
            this.last7DaysMedianSpendUSD = null;
        } else {
            this.last7DaysMedianSpendUSD = f13;
        }
        if ((i10 & 128) == 0) {
            this.last7DaysMeanSpendUSD = null;
        } else {
            this.last7DaysMeanSpendUSD = f14;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.last30DaysTotalSpendUSD = null;
        } else {
            this.last30DaysTotalSpendUSD = f15;
        }
        if ((i10 & 512) == 0) {
            this.last30DaysMedianSpendUSD = null;
        } else {
            this.last30DaysMedianSpendUSD = f16;
        }
        if ((i10 & 1024) == 0) {
            this.last30DaysMeanSpendUSD = null;
        } else {
            this.last30DaysMeanSpendUSD = f17;
        }
        if ((i10 & 2048) == 0) {
            this.last7DaysUserPltvUSD = null;
        } else {
            this.last7DaysUserPltvUSD = f18;
        }
        if ((i10 & 4096) == 0) {
            this.last7DaysUserLtvUSD = null;
        } else {
            this.last7DaysUserLtvUSD = f19;
        }
        if ((i10 & Segment.SIZE) == 0) {
            this.last30DaysUserPltvUSD = null;
        } else {
            this.last30DaysUserPltvUSD = f20;
        }
        if ((i10 & 16384) == 0) {
            this.last30DaysUserLtvUSD = null;
        } else {
            this.last30DaysUserLtvUSD = f21;
        }
        if ((32768 & i10) == 0) {
            this.last7DaysPlacementFillRate = null;
        } else {
            this.last7DaysPlacementFillRate = f22;
        }
        if ((i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.last30DaysPlacementFillRate = null;
        } else {
            this.last30DaysPlacementFillRate = f23;
        }
    }

    @SerialName("earnings_by_placement_usd")
    private static /* synthetic */ void getEarningsByPlacementUSD$annotations() {
    }

    @SerialName("last_30_days_mean_spend_usd")
    private static /* synthetic */ void getLast30DaysMeanSpendUSD$annotations() {
    }

    @SerialName("last_30_days_median_spend_usd")
    private static /* synthetic */ void getLast30DaysMedianSpendUSD$annotations() {
    }

    @SerialName("last_30_days_placement_fill_rate")
    private static /* synthetic */ void getLast30DaysPlacementFillRate$annotations() {
    }

    @SerialName("last_30_days_total_spend_usd")
    private static /* synthetic */ void getLast30DaysTotalSpendUSD$annotations() {
    }

    @SerialName("last_30_days_user_ltv_usd")
    private static /* synthetic */ void getLast30DaysUserLtvUSD$annotations() {
    }

    @SerialName("last_30_days_user_pltv_usd")
    private static /* synthetic */ void getLast30DaysUserPltvUSD$annotations() {
    }

    @SerialName("last_7_days_mean_spend_usd")
    private static /* synthetic */ void getLast7DaysMeanSpendUSD$annotations() {
    }

    @SerialName("last_7_days_median_spend_usd")
    private static /* synthetic */ void getLast7DaysMedianSpendUSD$annotations() {
    }

    @SerialName("last_7_days_placement_fill_rate")
    private static /* synthetic */ void getLast7DaysPlacementFillRate$annotations() {
    }

    @SerialName("last_7_days_total_spend_usd")
    private static /* synthetic */ void getLast7DaysTotalSpendUSD$annotations() {
    }

    @SerialName("last_7_days_user_ltv_usd")
    private static /* synthetic */ void getLast7DaysUserLtvUSD$annotations() {
    }

    @SerialName("last_7_days_user_pltv_usd")
    private static /* synthetic */ void getLast7DaysUserPltvUSD$annotations() {
    }

    @SerialName("top_n_adomain")
    private static /* synthetic */ void getTopNAdomain$annotations() {
    }

    @SerialName("total_earnings_usd")
    private static /* synthetic */ void getTotalEarningsUSD$annotations() {
    }

    @SerialName("is_user_a_purchaser")
    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    @SerialName("is_user_a_subscriber")
    private static /* synthetic */ void isUserASubscriber$annotations() {
    }
}
