package io.bidmachine;

import android.location.Location;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c4 implements up.p {

    /* renamed from: a, reason: collision with root package name */
    public final up.d f60327a;

    /* renamed from: b, reason: collision with root package name */
    public final TargetingParams f60328b;

    public c4(up.d dVar, TargetingParams targetingParams) {
        this.f60327a = dVar;
        this.f60328b = targetingParams;
    }

    @Override // up.p
    public String getCity() {
        if (((f4) this.f60327a).canSendGeoPosition()) {
            return this.f60328b.getCity();
        }
        return null;
    }

    @Override // up.p
    public String getCountry() {
        if (((f4) this.f60327a).canSendGeoPosition()) {
            return this.f60328b.getCountry();
        }
        return null;
    }

    @Override // up.p
    public Location getDeviceLocation() {
        if (((f4) this.f60327a).canSendGeoPosition()) {
            return this.f60328b.getDeviceLocation();
        }
        return null;
    }

    @Override // up.p
    public pr.e getGender() {
        if (((f4) this.f60327a).canSendUserInfo()) {
            return this.f60328b.getGender();
        }
        return null;
    }

    @Override // up.p
    public String[] getKeywords() {
        if (((f4) this.f60327a).canSendUserInfo()) {
            return this.f60328b.getKeywords();
        }
        return null;
    }

    @Override // up.p
    public String getStoreUrl() {
        return this.f60328b.getStoreUrl();
    }

    @Override // up.p
    public Integer getUserAge() {
        Integer userBirthdayYear = getUserBirthdayYear();
        if (userBirthdayYear != null) {
            return Integer.valueOf(Calendar.getInstance().get(1) - userBirthdayYear.intValue());
        }
        return null;
    }

    @Override // up.p
    public Integer getUserBirthdayYear() {
        if (((f4) this.f60327a).canSendUserInfo()) {
            return this.f60328b.getBirthdayYear();
        }
        return null;
    }

    @Override // up.p
    public String getUserId() {
        if (((f4) this.f60327a).canSendUserInfo()) {
            return this.f60328b.getUserId();
        }
        return null;
    }

    @Override // up.p
    public String getZip() {
        if (((f4) this.f60327a).canSendGeoPosition()) {
            return this.f60328b.getZip();
        }
        return null;
    }

    @Override // up.p
    public Boolean isPaid() {
        return this.f60328b.getPaid();
    }
}
