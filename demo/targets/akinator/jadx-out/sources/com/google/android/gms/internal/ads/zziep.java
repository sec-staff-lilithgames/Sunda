package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zziep extends zzies implements zzarf {
    protected final String zza = "moov";

    public zziep(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzb(zziet zzietVar, ByteBuffer byteBuffer, long j10, zzarc zzarcVar) throws IOException {
        zzietVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzietVar;
        this.zze = zzietVar.zzc();
        zzietVar.zzd(zzietVar.zzc() + j10);
        this.zzf = zzietVar.zzc();
        this.zzb = zzarcVar;
    }
}
