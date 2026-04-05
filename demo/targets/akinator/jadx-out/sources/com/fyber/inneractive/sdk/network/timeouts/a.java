package com.fyber.inneractive.sdk.network.timeouts;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f24297a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f24298b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f24299c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24300d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f24301e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f24302f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24303g = false;

    public final int a() {
        int iMax;
        int i10 = this.f24299c;
        int i11 = this.f24300d;
        if (i11 <= 0) {
            IAlog.f("%s Unable resolve retries because of invalid ILAT: %d, will set retries to 0", IAlog.a(com.fyber.inneractive.sdk.network.timeouts.content.a.class), Integer.valueOf(i11));
            iMax = 0;
        } else {
            int i12 = i10 / i11;
            int i13 = i12 - 1;
            if (i13 > 3) {
                i13 = i12 - 2;
            }
            iMax = Math.max(i13, 0);
        }
        int i14 = this.f24299c;
        int i15 = this.f24300d;
        int i16 = this.f24301e;
        int i17 = this.f24302f;
        int iMax2 = Math.max(0, i14);
        int iMax3 = Math.max(0, i15);
        int iMax4 = Math.max(0, iMax);
        int iMax5 = Math.max(0, (iMax2 - (Math.max(0, i16) * iMax4)) - (Math.max(0, i17) * iMax4));
        int iMax6 = Math.max(0, iMax3);
        if (iMax4 > 0) {
            iMax5 %= iMax6;
        }
        int iMax7 = Math.max(iMax5, 0);
        if (iMax7 == 0 && iMax > 2) {
            iMax--;
            iMax7 = this.f24300d;
        }
        int i18 = iMax + 1;
        int iMax8 = Math.max(0, iMax7);
        if (i18 > 0) {
            iMax8 /= i18;
        }
        this.f24298b = iMax8;
        return Math.max(0, a(this.f24299c, this.f24300d, iMax8, 0) - 1);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, i10);
        if (i11 <= 0) {
            i11 = iMax;
        }
        int iMax2 = Math.max(0, i12);
        int iMax3 = Math.max(0, i13);
        int i14 = iMax3 + 1;
        int i15 = iMax - ((iMax2 * iMax3) + i11);
        if (i15 < 0) {
            return Math.max(iMax3, 0);
        }
        if (i15 == 0) {
            return Math.max(i14, 0);
        }
        return a(i15, i11, iMax2, i14);
    }
}
