package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E5 {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC2784g7 f31741a;

    /* renamed from: b, reason: collision with root package name */
    public final double f31742b;

    public E5(EnumC2784g7 logLevel, double d10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
        this.f31741a = logLevel;
        this.f31742b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5)) {
            return false;
        }
        E5 e52 = (E5) obj;
        return this.f31741a == e52.f31741a && Double.compare(this.f31742b, e52.f31742b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f31742b) + (this.f31741a.hashCode() * 31);
    }

    public final String toString() {
        return "LoggerConfiguration(logLevel=" + this.f31741a + ", samplingFactor=" + this.f31742b + ')';
    }
}
