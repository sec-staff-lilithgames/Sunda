package io.odeeo.sdk.advertisement.data;

import e3.g;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdRequestRetry {
    private final int delay;
    private final String name;
    private final int retries;

    public AdRequestRetry(int i10, String name, int i11) {
        e0.checkNotNullParameter(name, "name");
        this.delay = i10;
        this.name = name;
        this.retries = i11;
    }

    public static /* synthetic */ AdRequestRetry copy$default(AdRequestRetry adRequestRetry, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = adRequestRetry.delay;
        }
        if ((i12 & 2) != 0) {
            str = adRequestRetry.name;
        }
        if ((i12 & 4) != 0) {
            i11 = adRequestRetry.retries;
        }
        return adRequestRetry.copy(i10, str, i11);
    }

    public final int component1() {
        return this.delay;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.retries;
    }

    public final AdRequestRetry copy(int i10, String name, int i11) {
        e0.checkNotNullParameter(name, "name");
        return new AdRequestRetry(i10, name, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdRequestRetry)) {
            return false;
        }
        AdRequestRetry adRequestRetry = (AdRequestRetry) obj;
        return this.delay == adRequestRetry.delay && e0.areEqual(this.name, adRequestRetry.name) && this.retries == adRequestRetry.retries;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRetries() {
        return this.retries;
    }

    public int hashCode() {
        return Integer.hashCode(this.retries) + o2.e(Integer.hashCode(this.delay) * 31, 31, this.name);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdRequestRetry(delay=");
        sb2.append(this.delay);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", retries=");
        return g.m(sb2, this.retries, ')');
    }
}
