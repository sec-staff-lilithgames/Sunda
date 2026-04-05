package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazl extends zzazr {
    private final zzayk zzh;
    private long zzi;

    public zzazl(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11, zzayk zzaykVar) {
        super(zzaydVar, "7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", zzaucVar, i10, 53);
        this.zzh = zzaykVar;
        if (zzaykVar != null) {
            this.zzi = zzaykVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
