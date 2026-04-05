package com.moloco.sdk.common_adapter_internal;

import com.moloco.sdk.publisher.bidrequest.Geo;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Geo f45694a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45695b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45696c;

    /* renamed from: d, reason: collision with root package name */
    public final String f45697d;

    /* renamed from: e, reason: collision with root package name */
    public final String f45698e;

    /* renamed from: f, reason: collision with root package name */
    public final String f45699f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f45700g;

    public c(Geo geo, String str, String str2, String str3, String str4, String str5, Float f10) {
        e0.checkNotNullParameter(geo, "geo");
        this.f45694a = geo;
        this.f45695b = str;
        this.f45696c = str2;
        this.f45697d = str3;
        this.f45698e = str4;
        this.f45699f = str5;
        this.f45700g = f10;
    }

    public static /* synthetic */ c copy$default(c cVar, Geo geo, String str, String str2, String str3, String str4, String str5, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            geo = cVar.f45694a;
        }
        if ((i10 & 2) != 0) {
            str = cVar.f45695b;
        }
        if ((i10 & 4) != 0) {
            str2 = cVar.f45696c;
        }
        if ((i10 & 8) != 0) {
            str3 = cVar.f45697d;
        }
        if ((i10 & 16) != 0) {
            str4 = cVar.f45698e;
        }
        if ((i10 & 32) != 0) {
            str5 = cVar.f45699f;
        }
        if ((i10 & 64) != 0) {
            f10 = cVar.f45700g;
        }
        String str6 = str5;
        Float f11 = f10;
        String str7 = str4;
        String str8 = str2;
        return cVar.copy(geo, str, str8, str3, str7, str6, f11);
    }

    public final Geo component1() {
        return this.f45694a;
    }

    public final String component2() {
        return this.f45695b;
    }

    public final String component3() {
        return this.f45696c;
    }

    public final String component4() {
        return this.f45697d;
    }

    public final String component5() {
        return this.f45698e;
    }

    public final String component6() {
        return this.f45699f;
    }

    public final Float component7() {
        return this.f45700g;
    }

    public final c copy(Geo geo, String str, String str2, String str3, String str4, String str5, Float f10) {
        e0.checkNotNullParameter(geo, "geo");
        return new c(geo, str, str2, str3, str4, str5, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.f45694a, cVar.f45694a) && e0.areEqual(this.f45695b, cVar.f45695b) && e0.areEqual(this.f45696c, cVar.f45696c) && e0.areEqual(this.f45697d, cVar.f45697d) && e0.areEqual(this.f45698e, cVar.f45698e) && e0.areEqual(this.f45699f, cVar.f45699f) && e0.areEqual((Object) this.f45700g, (Object) cVar.f45700g);
    }

    public final String getAdUnitName() {
        return this.f45699f;
    }

    public final String getAppId() {
        return this.f45696c;
    }

    public final Float getBidFloor() {
        return this.f45700g;
    }

    public final String getBidRequestEndpoint() {
        return this.f45695b;
    }

    public final Geo getGeo() {
        return this.f45694a;
    }

    public final String getPlatformId() {
        return this.f45698e;
    }

    public final String getPublisherId() {
        return this.f45697d;
    }

    public int hashCode() {
        int iHashCode = this.f45694a.hashCode() * 31;
        String str = this.f45695b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f45696c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f45697d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f45698e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f45699f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f10 = this.f45700g;
        return iHashCode6 + (f10 != null ? f10.hashCode() : 0);
    }

    public String toString() {
        return "AdapterSessionData(geo=" + this.f45694a + ", bidRequestEndpoint=" + this.f45695b + ", appId=" + this.f45696c + ", publisherId=" + this.f45697d + ", platformId=" + this.f45698e + ", adUnitName=" + this.f45699f + ", bidFloor=" + this.f45700g + ')';
    }
}
