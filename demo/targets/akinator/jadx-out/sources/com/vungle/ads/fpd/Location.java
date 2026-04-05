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
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Location {
    public static final Companion Companion = new Companion(null);
    private String country;
    private Integer dma;
    private String regionState;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Location> serializer() {
            return Location$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Location() {
    }

    public static final void write$Self(Location self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.country != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.country);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.regionState != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.regionState);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.dma == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.dma);
    }

    public final Location setCountry(String country) {
        e0.checkNotNullParameter(country, "country");
        this.country = country;
        return this;
    }

    public final Location setDma(int i10) {
        this.dma = Integer.valueOf(i10);
        return this;
    }

    public final Location setRegionState(String regionState) {
        e0.checkNotNullParameter(regionState, "regionState");
        this.regionState = regionState;
        return this;
    }

    @f
    public /* synthetic */ Location(int i10, @SerialName("country") String str, @SerialName("region_state") String str2, @SerialName("dma") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.country = null;
        } else {
            this.country = str;
        }
        if ((i10 & 2) == 0) {
            this.regionState = null;
        } else {
            this.regionState = str2;
        }
        if ((i10 & 4) == 0) {
            this.dma = null;
        } else {
            this.dma = num;
        }
    }

    @SerialName("country")
    private static /* synthetic */ void getCountry$annotations() {
    }

    @SerialName("dma")
    private static /* synthetic */ void getDma$annotations() {
    }

    @SerialName("region_state")
    private static /* synthetic */ void getRegionState$annotations() {
    }
}
