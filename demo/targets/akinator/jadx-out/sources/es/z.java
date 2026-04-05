package es;

import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public Integer f55123a = 1900;

    /* renamed from: b, reason: collision with root package name */
    public Integer f55124b = 100;

    /* renamed from: c, reason: collision with root package name */
    public Integer f55125c = 5;

    /* renamed from: d, reason: collision with root package name */
    public Integer f55126d = 100;

    public a0 build() {
        return new a0(this.f55123a, this.f55124b, this.f55125c, this.f55126d);
    }

    public z setEnforcementPercentage(Integer num) {
        boolean z10 = false;
        p1.checkArgument(num != null);
        if (num.intValue() >= 0 && num.intValue() <= 100) {
            z10 = true;
        }
        p1.checkArgument(z10);
        this.f55124b = num;
        return this;
    }

    public z setMinimumHosts(Integer num) {
        p1.checkArgument(num != null);
        p1.checkArgument(num.intValue() >= 0);
        this.f55125c = num;
        return this;
    }

    public z setRequestVolume(Integer num) {
        p1.checkArgument(num != null);
        p1.checkArgument(num.intValue() >= 0);
        this.f55126d = num;
        return this;
    }

    public z setStdevFactor(Integer num) {
        p1.checkArgument(num != null);
        this.f55123a = num;
        return this;
    }
}
