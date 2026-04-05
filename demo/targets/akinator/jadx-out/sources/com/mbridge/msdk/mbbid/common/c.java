package com.mbridge.msdk.mbbid.common;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private String f41582a;

    /* renamed from: b, reason: collision with root package name */
    private String f41583b;

    /* renamed from: c, reason: collision with root package name */
    private String f41584c;

    public c(String str, String str2) {
        this.f41582a = str;
        this.f41583b = str2;
    }

    public String getmFloorPrice() {
        return this.f41584c;
    }

    public String getmPlacementId() {
        return this.f41582a;
    }

    public String getmUnitId() {
        return this.f41583b;
    }

    public void setmFloorPrice(String str) {
        this.f41584c = str;
    }

    public void setmPlacementId(String str) {
        this.f41582a = str;
    }

    public void setmUnitId(String str) {
        this.f41583b = str;
    }

    public c(String str, String str2, String str3) {
        this.f41582a = str;
        this.f41583b = str2;
        this.f41584c = str3;
    }
}
