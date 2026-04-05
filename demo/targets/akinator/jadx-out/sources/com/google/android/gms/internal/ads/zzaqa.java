package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaqa {
    public final Object zza;
    public final zzapd zzb;
    public final zzaqd zzc;
    public boolean zzd;

    private zzaqa(zzaqd zzaqdVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaqdVar;
    }

    public static zzaqa zza(Object obj, zzapd zzapdVar) {
        return new zzaqa(obj, zzapdVar);
    }

    public static zzaqa zzb(zzaqd zzaqdVar) {
        return new zzaqa(zzaqdVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzaqa(Object obj, zzapd zzapdVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzapdVar;
        this.zzc = null;
    }
}
