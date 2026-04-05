package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends a {

    /* renamed from: m, reason: collision with root package name */
    public double f24310m;

    public c(String str, j jVar, String str2) {
        super(str, jVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(j jVar, String str) {
        return jVar.b(str, this.f24309l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(j jVar, String str) {
        String str2 = this.f24309l;
        jVar.getClass();
        String strA = j.a(str, "min", "rat", "bidding", j.e(str2));
        String strA2 = j.a(str, "min", "rat", "bidding", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numA = jVar.a(strA2);
        int iIntValue = numA != null ? numA.intValue() : 5000;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(j jVar, String str) {
        String str2 = this.f24309l;
        jVar.getClass();
        String strA = j.a(str, "rat", "bidding", "perc", j.e(str2));
        String strA2 = j.a(str, "rat", "bidding", "perc", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numA = jVar.a(strA2);
        int iIntValue = numA != null ? numA.intValue() : 15;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final void d(j jVar, String str) {
        super.d(jVar, str);
        Boolean boolC = jVar.c("reverse_retries");
        this.f24303g = boolC != null ? boolC.booleanValue() : true;
        String strA = j.a("retry_interval", "rat", "bidding");
        Integer numA = jVar.a(j.a("retry_interval", "all_mediators"));
        int iIntValue = numA != null ? numA.intValue() : 100;
        Integer numA2 = jVar.a(strA);
        if (numA2 != null) {
            iIntValue = numA2.intValue();
        }
        this.f24301e = iIntValue;
        this.f24299c = (this.f24306i + this.f24305h) - (iIntValue + this.f24302f);
        String strA2 = j.a("bidding", "irat", j.e(this.f24309l));
        Integer numA3 = jVar.a(j.a("bidding", "irat", "all_mediators"));
        int iIntValue2 = numA3 != null ? numA3.intValue() : 10000;
        Integer numA4 = jVar.a(strA2);
        if (numA4 != null) {
            iIntValue2 = numA4.intValue();
        }
        this.f24300d = iIntValue2;
        this.f24310m = Math.min(this.f24308k, this.f24307j) / Math.max(this.f24308k, this.f24307j);
        b(this.f24300d);
        this.f24297a = Math.max(0, a());
        if (this.f24303g) {
            IAlog.a("%s : RequestBiddingAdTimeout shouldReverseRetries - reversing timeouts", IAlog.a(this));
            a(0);
        }
        IAlog.a("%s : RequestBiddingAdTimeout init timeouts, total retries: %d", IAlog.a(this), Integer.valueOf(this.f24297a));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(j jVar) {
        String str = this.f24309l;
        jVar.getClass();
        String strA = j.a("timeout", "threshold", "rat", "bidding", j.e(str));
        Integer numA = jVar.a(j.a("timeout", "threshold", "rat", "bidding", "all_mediators"));
        int iIntValue = numA != null ? numA.intValue() : 300;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c() {
        return this.f24301e;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(int i10) {
        if (this.f24303g) {
            i10 = this.f24297a - i10;
        }
        int i11 = (this.f24298b * i10) + this.f24300d;
        IAlog.a("%s : RequestBiddingAdTimeout resolveTimeoutForRetry, timeout: %d ms for retry: %d", IAlog.a(this), Integer.valueOf(i11), Integer.valueOf(i10));
        b(i11);
        return i11;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b() {
        return this.f24297a;
    }

    public final void b(int i10) {
        double d10 = this.f24310m;
        if (d10 == 1.0d || d10 == 0.0d) {
            IAlog.a("%s : RequestBiddingAdTimeout Ratio: %f, connection and read timeouts should be divided in equal proportions", IAlog.a(this), Double.valueOf(this.f24310m));
            this.f24310m = 0.5d;
        }
        int i11 = (int) (i10 * this.f24310m);
        this.f24305h = i11;
        this.f24306i = i10 - i11;
        IAlog.a("%s : RequestBiddingAdTimeout Update timeouts connection: %d read: %d", IAlog.a(this), Integer.valueOf(this.f24306i), Integer.valueOf(this.f24305h));
    }
}
