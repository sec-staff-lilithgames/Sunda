package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzf implements zzfzg {
    private final zzhxz zza;

    public zzfzf(zzhxz zzhxzVar) {
        this.zza = zzhxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        ((zzhxz) obj).zzaO(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return (zzhxz) this.zza.zzbd().zza(inputStream, zzhvy.zza());
        } catch (zzhxd e10) {
            throw new zzfzc("Cannot read proto.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
