package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {

    /* renamed from: g, reason: collision with root package name */
    private static int f41610g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static int f41611h;

    /* renamed from: i, reason: collision with root package name */
    private static int f41612i;

    /* renamed from: f, reason: collision with root package name */
    private boolean f41613f;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    public boolean a() {
        return this.f41613f;
    }

    public int getOrientation() {
        return f41610g;
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f41610g, f41612i, f41611h);
    }

    private void a(int i10, int i11) {
        int iN = l0.n(c.m().d());
        int iM = l0.m(c.m().d());
        int i12 = f41610g;
        if (i12 == 1) {
            if (iM > i11 * 4) {
                setHeight(iM - i11);
                setWidth(iN);
                return;
            } else {
                setHeight(0);
                setWidth(0);
                return;
            }
        }
        if (i12 == 2) {
            if (iN > i10 * 4) {
                setWidth(iN - i10);
                setHeight(iM);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
    }

    public SplashBidRequestParams(String str, String str2, boolean z10, int i10, int i11, int i12) {
        this(str, str2, "", z10, i10, i12, i11);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z10, int i10, int i11, int i12) {
        super(str, str2, str3, 0, 0);
        this.f41613f = false;
        f41610g = i10;
        a(i11, i12);
        this.f41613f = z10;
    }
}
