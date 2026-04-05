package com.bykv.vk.openvk.preload.a;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16995a;

    public n(Boolean bool) {
        this.f16995a = com.bykv.vk.openvk.preload.falconx.a.a.a(bool);
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final Number a() {
        Object obj = this.f16995a;
        return obj instanceof String ? new com.bykv.vk.openvk.preload.a.b.f((String) obj) : (Number) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final String b() {
        Object obj = this.f16995a;
        return obj instanceof Number ? a().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final boolean c() {
        Object obj = this.f16995a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(b());
    }

    public final boolean d() {
        return this.f16995a instanceof Boolean;
    }

    public final boolean e() {
        return this.f16995a instanceof Number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f16995a == null) {
            return nVar.f16995a == null;
        }
        if (a(this) && a(nVar)) {
            return a().longValue() == nVar.a().longValue();
        }
        Object obj2 = this.f16995a;
        if (!(obj2 instanceof Number) || !(nVar.f16995a instanceof Number)) {
            return obj2.equals(nVar.f16995a);
        }
        double dDoubleValue = a().doubleValue();
        double dDoubleValue2 = nVar.a().doubleValue();
        return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.f16995a == null) {
            return 31;
        }
        if (a(this)) {
            jDoubleToLongBits = a().longValue();
        } else {
            Object obj = this.f16995a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    private static boolean a(n nVar) {
        Object obj = nVar.f16995a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public n(Number number) {
        this.f16995a = com.bykv.vk.openvk.preload.falconx.a.a.a(number);
    }

    public n(String str) {
        this.f16995a = com.bykv.vk.openvk.preload.falconx.a.a.a(str);
    }
}
