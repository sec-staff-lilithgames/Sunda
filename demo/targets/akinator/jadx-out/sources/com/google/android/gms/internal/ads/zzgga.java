package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgga {
    private final zzarn zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgga(zzarn zzarnVar, long j10, long j11, String str) {
        this.zza = zzarnVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = str;
    }

    public static /* synthetic */ zzgga zza(zzarn zzarnVar, byte[] bArr) throws zzarp, zzarl {
        zzarnVar.zza();
        zzarnVar.zzb(bArr);
        List list = (List) zzarnVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzarnVar.zzd(jLongValue, Optional.empty());
        return new zzgga(zzarnVar, jLongValue2, jLongValue3, "3.".concat(new String(zzarq.zza(), StandardCharsets.UTF_8)));
    }

    public final /* synthetic */ String zzb(Map map) {
        return zzfyo.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    public final /* synthetic */ void zzc(Map map) throws zzarp, zzarl {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    public final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
