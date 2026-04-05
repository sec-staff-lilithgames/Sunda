package com.fyber.inneractive.sdk.network.timeouts.content;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.util.IAlog;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends com.fyber.inneractive.sdk.network.timeouts.a {

    /* renamed from: h, reason: collision with root package name */
    public final int f24304h;

    public a(String str, String str2, int i10, boolean z10, String str3, r rVar) {
        int iIntValue;
        j jVar = (j) rVar.a(j.class);
        this.f24304h = 0;
        Boolean boolC = jVar.c("reverse_retries");
        this.f24303g = boolC != null ? boolC.booleanValue() : true;
        if (z10) {
            iIntValue = jVar.b(str, str3);
        } else if (TextUtils.isEmpty(str3)) {
            String strL = o2.l(str, "_global_timeout");
            int i11 = j.d(str) ? 30000 : 10000;
            Integer numA = jVar.a(strL);
            iIntValue = numA != null ? numA.intValue() : i11;
        } else {
            iIntValue = jVar.c(str, str3);
        }
        if (iIntValue > i10) {
            if (TextUtils.isEmpty(str3)) {
                Integer numA2 = jVar.a(j.a(str, str2, "retry_interval"));
                this.f24301e = numA2 != null ? numA2.intValue() : 100;
                Integer numA3 = jVar.a(j.a("timeout", "threshold"));
                this.f24302f = numA3 != null ? numA3.intValue() : 300;
                String strA = j.a(str, str2, "ilat");
                int i12 = j.d(str) ? 20000 : 10000;
                Integer numA4 = jVar.a(strA);
                this.f24300d = numA4 != null ? numA4.intValue() : i12;
            } else {
                String strA2 = j.a(str, str2, "retry_interval", j.e(str3));
                Integer numA5 = jVar.a(j.a("retry_interval", "all_mediators"));
                int iIntValue2 = numA5 != null ? numA5.intValue() : 100;
                Integer numA6 = jVar.a(strA2);
                this.f24301e = numA6 != null ? numA6.intValue() : iIntValue2;
                String strA3 = j.a("timeout", "threshold", j.e(str3));
                Integer numA7 = jVar.a(j.a("timeout", "threshold", "all_mediators"));
                int iIntValue3 = numA7 != null ? numA7.intValue() : 300;
                Integer numA8 = jVar.a(strA3);
                this.f24302f = numA8 != null ? numA8.intValue() : iIntValue3;
                String strA4 = j.a(str, str2, "ilat", j.e(str3));
                String strA5 = j.a(str, str2, "ilat", "all_mediators");
                int iIntValue4 = j.d(str) ? 20000 : 10000;
                Integer numA9 = jVar.a(strA5);
                iIntValue4 = numA9 != null ? numA9.intValue() : iIntValue4;
                Integer numA10 = jVar.a(strA4);
                this.f24300d = numA10 != null ? numA10.intValue() : iIntValue4;
            }
        }
        int i13 = iIntValue - (this.f24302f + i10);
        IAlog.a("%s : LoadAdContentTimeout resolveLoadAdTimeout : usedTime: %d, global timeout: %d, timeout: %d", IAlog.a(a.class), Integer.valueOf(i10), Integer.valueOf(iIntValue), Integer.valueOf(i13));
        this.f24299c = Math.max(i13, 0);
        int iA = a();
        this.f24297a = iA;
        if (iA == 0) {
            this.f24300d = this.f24299c;
        }
        IAlog.a("%s : LoadAdContentTimeout onFixedLoadAdTimeoutUpdated : Calculated: %d attempts with LeftoverTime: %d", IAlog.a(this), Integer.valueOf(this.f24297a), 0);
        int i14 = this.f24297a;
        if (i14 > 0) {
            int i15 = this.f24299c;
            int i16 = this.f24302f;
            int i17 = this.f24301e;
            for (int i18 = 0; i18 <= i14; i18++) {
                i15 -= (this.f24298b * i18) + this.f24300d;
            }
            this.f24304h = Math.max(0, i15 - ((i17 * i14) + (i16 * i14)));
        }
    }
}
