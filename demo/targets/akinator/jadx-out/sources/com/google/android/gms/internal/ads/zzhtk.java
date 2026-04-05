package com.google.android.gms.internal.ads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhtk extends zzhtg {
    private final Object zza;

    public zzhtk(Boolean bool) {
        Objects.requireNonNull(bool);
        this.zza = bool;
    }

    private static boolean zzl(zzhtk zzhtkVar) {
        Object obj = zzhtkVar.zza;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzhtk.class != obj.getClass()) {
            return false;
        }
        zzhtk zzhtkVar = (zzhtk) obj;
        Object obj2 = this.zza;
        if (obj2 == null) {
            return zzhtkVar.zza == null;
        }
        if (zzl(this) && zzl(zzhtkVar)) {
            return ((obj2 instanceof BigInteger) || (zzhtkVar.zza instanceof BigInteger)) ? zzk().equals(zzhtkVar.zzk()) : zzh().longValue() == zzhtkVar.zzh().longValue();
        }
        if (obj2 instanceof Number) {
            Object obj3 = zzhtkVar.zza;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return zzj().compareTo(zzhtkVar.zzj()) == 0;
                }
                double dZzi = zzi();
                double dZzi2 = zzhtkVar.zzi();
                if (dZzi != dZzi2) {
                    return Double.isNaN(dZzi) && Double.isNaN(dZzi2);
                }
                return true;
            }
        }
        return obj2.equals(zzhtkVar.zza);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Object obj = this.zza;
        if (obj == null) {
            return 31;
        }
        if (zzl(this)) {
            jDoubleToLongBits = zzh().longValue();
        } else {
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(zzh().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean zza() {
        return this.zza instanceof Boolean;
    }

    public final boolean zzb() {
        Object obj = this.zza;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(zzd());
    }

    public final boolean zzc() {
        return this.zza instanceof Number;
    }

    @Override // com.google.android.gms.internal.ads.zzhtg
    public final String zzd() {
        Object obj = this.zza;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return zzh().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(obj.getClass())));
    }

    public final Number zzh() {
        Object obj = this.zza;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new zzhtp((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final double zzi() {
        return this.zza instanceof Number ? zzh().doubleValue() : Double.parseDouble(zzd());
    }

    public final BigDecimal zzj() {
        Object obj = this.zza;
        return obj instanceof BigDecimal ? (BigDecimal) obj : zzhty.zza(zzd());
    }

    public final BigInteger zzk() {
        Object obj = this.zza;
        return obj instanceof BigInteger ? (BigInteger) obj : zzl(this) ? BigInteger.valueOf(zzh().longValue()) : zzhty.zzb(zzd());
    }

    public zzhtk(Number number) {
        Objects.requireNonNull(number);
        this.zza = number;
    }

    public zzhtk(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }
}
