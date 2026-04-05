package com.moloco.sdk.publisher.bidrequest;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Geo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String city;
    private final String country;
    private final Float latitude;
    private final Float longitude;
    private final String region;
    private final String zipCode;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<Geo> serializer() {
            return Geo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public /* synthetic */ Geo(int i10, String str, String str2, String str3, String str4, Float f10, Float f11, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i10 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 63, Geo$$serializer.INSTANCE.getDescriptor());
        }
        this.city = str;
        this.country = str2;
        this.region = str3;
        this.zipCode = str4;
        this.latitude = f10;
        this.longitude = f11;
    }

    public static /* synthetic */ Geo copy$default(Geo geo, String str, String str2, String str3, String str4, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = geo.city;
        }
        if ((i10 & 2) != 0) {
            str2 = geo.country;
        }
        if ((i10 & 4) != 0) {
            str3 = geo.region;
        }
        if ((i10 & 8) != 0) {
            str4 = geo.zipCode;
        }
        if ((i10 & 16) != 0) {
            f10 = geo.latitude;
        }
        if ((i10 & 32) != 0) {
            f11 = geo.longitude;
        }
        Float f12 = f10;
        Float f13 = f11;
        return geo.copy(str, str2, str3, str4, f12, f13);
    }

    public static final /* synthetic */ void write$Self$moloco_sdk_release(Geo geo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, geo.city);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, geo.country);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, geo.region);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, geo.zipCode);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, floatSerializer, geo.latitude);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, floatSerializer, geo.longitude);
    }

    public final String component1() {
        return this.city;
    }

    public final String component2() {
        return this.country;
    }

    public final String component3() {
        return this.region;
    }

    public final String component4() {
        return this.zipCode;
    }

    public final Float component5() {
        return this.latitude;
    }

    public final Float component6() {
        return this.longitude;
    }

    public final Geo copy(String str, String str2, String str3, String str4, Float f10, Float f11) {
        return new Geo(str, str2, str3, str4, f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geo)) {
            return false;
        }
        Geo geo = (Geo) obj;
        return e0.areEqual(this.city, geo.city) && e0.areEqual(this.country, geo.country) && e0.areEqual(this.region, geo.region) && e0.areEqual(this.zipCode, geo.zipCode) && e0.areEqual((Object) this.latitude, (Object) geo.latitude) && e0.areEqual((Object) this.longitude, (Object) geo.longitude);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final Float getLatitude() {
        return this.latitude;
    }

    public final Float getLongitude() {
        return this.longitude;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zipCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.latitude;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.longitude;
        return iHashCode5 + (f11 != null ? f11.hashCode() : 0);
    }

    public String toString() {
        return "Geo(city=" + this.city + ", country=" + this.country + ", region=" + this.region + ", zipCode=" + this.zipCode + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    public Geo(String str, String str2, String str3, String str4, Float f10, Float f11) {
        this.city = str;
        this.country = str2;
        this.region = str3;
        this.zipCode = str4;
        this.latitude = f10;
        this.longitude = f11;
    }
}
