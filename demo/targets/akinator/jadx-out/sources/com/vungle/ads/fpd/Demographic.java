package com.vungle.ads.fpd;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Demographic {
    public static final Companion Companion = new Companion(null);
    private Integer ageRange;
    private Integer lengthOfResidence;
    private Integer medianHomeValueUSD;
    private Integer monthlyHousingPaymentUSD;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Demographic> serializer() {
            return Demographic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Demographic() {
    }

    public static final void write$Self(Demographic self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ageRange != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.ageRange);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.lengthOfResidence != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.lengthOfResidence);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.medianHomeValueUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.medianHomeValueUSD);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.monthlyHousingPaymentUSD == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.monthlyHousingPaymentUSD);
    }

    public final Demographic setAgeRange(int i10) {
        this.ageRange = Integer.valueOf(AgeRange.Companion.fromAge$vungle_ads_release(i10).getId());
        return this;
    }

    public final Demographic setLengthOfResidence(int i10) {
        this.lengthOfResidence = Integer.valueOf(LengthOfResidence.Companion.fromYears$vungle_ads_release(i10).getId());
        return this;
    }

    public final Demographic setMedianHomeValueUSD(int i10) {
        this.medianHomeValueUSD = Integer.valueOf(MedianHomeValueUSD.Companion.fromPrice$vungle_ads_release(i10).getId());
        return this;
    }

    public final Demographic setMonthlyHousingCosts(int i10) {
        this.monthlyHousingPaymentUSD = Integer.valueOf(MonthlyHousingCosts.Companion.fromCost$vungle_ads_release(i10).getId());
        return this;
    }

    @f
    public /* synthetic */ Demographic(int i10, @SerialName("age_range") Integer num, @SerialName("length_of_residence") Integer num2, @SerialName("median_home_value_usd") Integer num3, @SerialName("monthly_housing_payment_usd") Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i10 & 2) == 0) {
            this.lengthOfResidence = null;
        } else {
            this.lengthOfResidence = num2;
        }
        if ((i10 & 4) == 0) {
            this.medianHomeValueUSD = null;
        } else {
            this.medianHomeValueUSD = num3;
        }
        if ((i10 & 8) == 0) {
            this.monthlyHousingPaymentUSD = null;
        } else {
            this.monthlyHousingPaymentUSD = num4;
        }
    }

    @SerialName("age_range")
    private static /* synthetic */ void getAgeRange$annotations() {
    }

    @SerialName("length_of_residence")
    private static /* synthetic */ void getLengthOfResidence$annotations() {
    }

    @SerialName("median_home_value_usd")
    private static /* synthetic */ void getMedianHomeValueUSD$annotations() {
    }

    @SerialName("monthly_housing_payment_usd")
    private static /* synthetic */ void getMonthlyHousingPaymentUSD$annotations() {
    }
}
