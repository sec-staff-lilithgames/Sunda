package com.mbridge.msdk.mbbid.out;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BannerBidRequestParams extends CommonBidRequestParams {

    /* renamed from: d, reason: collision with root package name */
    private int f41602d;

    /* renamed from: e, reason: collision with root package name */
    private int f41603e;

    public BannerBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f41602d = i11;
        this.f41603e = i10;
    }

    public int getHeight() {
        return this.f41602d;
    }

    public int getWidth() {
        return this.f41603e;
    }

    public void setHeight(int i10) {
        this.f41602d = i10;
    }

    public void setWidth(int i10) {
        this.f41603e = i10;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f41602d = i11;
        this.f41603e = i10;
    }
}
