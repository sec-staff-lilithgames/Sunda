package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzhtg {
    @Deprecated
    public zzhtg() {
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            zzhun zzhunVar = new zzhun(zzhub.zza(sb2));
            zzhunVar.zza(zzhtl.LENIENT);
            zzhuj.zza.zza(zzhunVar, this);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zzhti zze() {
        if (this instanceof zzhti) {
            return (zzhti) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzhtf zzf() {
        if (this instanceof zzhtf) {
            return (zzhtf) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zzhtk zzg() {
        if (this instanceof zzhtk) {
            return (zzhtk) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}
