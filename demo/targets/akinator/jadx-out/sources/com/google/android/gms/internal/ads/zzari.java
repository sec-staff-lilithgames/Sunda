package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzari extends zzieq {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzifa zzm;
    private long zzn;

    public zzari() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzifa.zzj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.zzg);
        sb2.append(";modificationTime=");
        sb2.append(this.zzh);
        sb2.append(";timescale=");
        sb2.append(this.zzi);
        sb2.append(";duration=");
        sb2.append(this.zzj);
        sb2.append(";rate=");
        sb2.append(this.zzk);
        sb2.append(";volume=");
        sb2.append(this.zzl);
        sb2.append(";matrix=");
        sb2.append(this.zzm);
        sb2.append(";nextTrackId=");
        return a.b.g(this.zzn, C3191e4.i.f36531e, sb2);
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzieo
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zziev.zza(zzare.zzd(byteBuffer));
            this.zzh = zziev.zza(zzare.zzd(byteBuffer));
            this.zzi = zzare.zza(byteBuffer);
            this.zzj = zzare.zzd(byteBuffer);
        } else {
            this.zzg = zziev.zza(zzare.zza(byteBuffer));
            this.zzh = zziev.zza(zzare.zza(byteBuffer));
            this.zzi = zzare.zza(byteBuffer);
            this.zzj = zzare.zza(byteBuffer);
        }
        this.zzk = zzare.zze(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzare.zzb(byteBuffer);
        zzare.zza(byteBuffer);
        zzare.zza(byteBuffer);
        this.zzm = new zzifa(zzare.zze(byteBuffer), zzare.zze(byteBuffer), zzare.zze(byteBuffer), zzare.zze(byteBuffer), zzare.zzf(byteBuffer), zzare.zzf(byteBuffer), zzare.zzf(byteBuffer), zzare.zze(byteBuffer), zzare.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzare.zza(byteBuffer);
    }
}
