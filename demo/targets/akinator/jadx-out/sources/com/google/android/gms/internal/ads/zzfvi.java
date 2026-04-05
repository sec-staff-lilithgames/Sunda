package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfvi extends zzhwi implements zzhya {
    private zzfvi() {
        throw null;
    }

    public final zzfvi zza(String str) {
        str.getClass();
        zzbg();
        ((zzfvk) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzfvk) this.zza).zzb());
    }

    public final zzfvi zzc(String str, zzfvg zzfvgVar) {
        str.getClass();
        zzfvgVar.getClass();
        zzbg();
        ((zzfvk) this.zza).zze().put(str, zzfvgVar);
        return this;
    }

    public /* synthetic */ zzfvi(byte[] bArr) {
        super(zzfvk.zzb);
    }
}
