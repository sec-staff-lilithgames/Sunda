package io.odeeo.sdk.advertisement.data;

import kotlin.jvm.internal.e0;
import lk.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Geo {
    private final String country;
    private final double lat;

    @c("long")
    private final double longitude;

    public Geo(String country, double d10, double d11) {
        e0.checkNotNullParameter(country, "country");
        this.country = country;
        this.lat = d10;
        this.longitude = d11;
    }

    public static /* synthetic */ Geo copy$default(Geo geo, String str, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = geo.country;
        }
        if ((i10 & 2) != 0) {
            d10 = geo.lat;
        }
        if ((i10 & 4) != 0) {
            d11 = geo.longitude;
        }
        return geo.copy(str, d10, d11);
    }

    public final String component1() {
        return this.country;
    }

    public final double component2() {
        return this.lat;
    }

    public final double component3() {
        return this.longitude;
    }

    public final Geo copy(String country, double d10, double d11) {
        e0.checkNotNullParameter(country, "country");
        return new Geo(country, d10, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geo)) {
            return false;
        }
        Geo geo = (Geo) obj;
        return e0.areEqual(this.country, geo.country) && e0.areEqual((Object) Double.valueOf(this.lat), (Object) Double.valueOf(geo.lat)) && e0.areEqual((Object) Double.valueOf(this.longitude), (Object) Double.valueOf(geo.longitude));
    }

    public final String getCountry() {
        return this.country;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Double.hashCode(this.longitude) + ((Double.hashCode(this.lat) + (this.country.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "Geo(country=" + this.country + ", lat=" + this.lat + ", longitude=" + this.longitude + ')';
    }
}
