package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzieo implements zzarf {
    private static final zziez zzg = zziez.zzb(zzieo.class);
    protected final String zza;
    long zzd;
    zziet zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzieo(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zziez zziezVar = zzg;
                String str = this.zza;
                zziezVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zze(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzb(zziet zzietVar, ByteBuffer byteBuffer, long j10, zzarc zzarcVar) throws IOException {
        this.zzd = zzietVar.zzc();
        byteBuffer.remaining();
        this.zze = j10;
        this.zzf = zzietVar;
        zzietVar.zzd(zzietVar.zzc() + j10);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zziez zziezVar = zzg;
            String str = this.zza;
            zziezVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
