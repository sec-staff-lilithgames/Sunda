package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f16903a;

    public f(String str) {
        this.f16903a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f16903a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f16903a;
        String str2 = ((f) obj).f16903a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f16903a);
    }

    public final int hashCode() {
        return this.f16903a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f16903a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f16903a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f16903a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f16903a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f16903a).longValue();
        }
    }

    public final String toString() {
        return this.f16903a;
    }
}
