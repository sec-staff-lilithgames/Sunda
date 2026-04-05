package es;

import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public Integer f55115a = 85;

    /* renamed from: b, reason: collision with root package name */
    public Integer f55116b = 100;

    /* renamed from: c, reason: collision with root package name */
    public Integer f55117c = 5;

    /* renamed from: d, reason: collision with root package name */
    public Integer f55118d = 50;

    public y build() {
        return new y(this.f55115a, this.f55116b, this.f55117c, this.f55118d);
    }

    public x setEnforcementPercentage(Integer num) {
        boolean z10 = false;
        p1.checkArgument(num != null);
        if (num.intValue() >= 0 && num.intValue() <= 100) {
            z10 = true;
        }
        p1.checkArgument(z10);
        this.f55116b = num;
        return this;
    }

    public x setMinimumHosts(Integer num) {
        p1.checkArgument(num != null);
        p1.checkArgument(num.intValue() >= 0);
        this.f55117c = num;
        return this;
    }

    public x setRequestVolume(Integer num) {
        p1.checkArgument(num != null);
        p1.checkArgument(num.intValue() >= 0);
        this.f55118d = num;
        return this;
    }

    public x setThreshold(Integer num) {
        boolean z10 = false;
        p1.checkArgument(num != null);
        if (num.intValue() >= 0 && num.intValue() <= 100) {
            z10 = true;
        }
        p1.checkArgument(z10);
        this.f55115a = num;
        return this;
    }
}
