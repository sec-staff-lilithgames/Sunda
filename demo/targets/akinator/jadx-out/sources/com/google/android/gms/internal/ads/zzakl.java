package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzakl implements zzaem {
    private final zzaem zza;
    private final zzakg zzb;
    private zzaki zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzep.zzb;
    private final zzeg zzc = new zzeg();

    public zzakl(zzaem zzaemVar, zzakg zzakgVar) {
        this.zza = zzaemVar;
        this.zzb = zzakgVar;
    }

    private final void zzc(int i10) {
        int length = this.zzf.length;
        int i11 = this.zze;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zzd;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i12);
        this.zzd = 0;
        this.zze = i12;
        this.zzf = bArr2;
    }

    public final void zza(boolean z10) {
        this.zzi = true;
    }

    public final /* synthetic */ void zzb(long j10, int i10, zzaka zzakaVar) {
        this.zzh.getClass();
        zzgpe zzgpeVar = zzakaVar.zza;
        long j11 = zzakaVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgpeVar.size());
        Iterator<E> it = zzgpeVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcm) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, arrayList);
        bundle.putLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzeg zzegVar = this.zzc;
        int length = bArrMarshall.length;
        zzegVar.zzb(bArrMarshall, length);
        zzaem zzaemVar = this.zza;
        zzaemVar.zzz(zzegVar, length);
        long j12 = zzakaVar.zzb;
        if (j12 == C.TIME_UNSET) {
            zzgmd.zzh(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j13 = this.zzh.zzt;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        zzaemVar.zzx(j10, i10 | 1, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzu(zzv zzvVar) {
        String str = zzvVar.zzo;
        str.getClass();
        zzgmd.zza(zzas.zzg(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzakg zzakgVar = this.zzb;
            this.zzg = zzakgVar.zza(zzvVar) ? zzakgVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzu(zzvVar);
            return;
        }
        zzaem zzaemVar = this.zza;
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzm("application/x-media3-cues");
        zztVarZza.zzj(str);
        zztVarZza.zzr(Long.MAX_VALUE);
        zztVarZza.zzK(this.zzb.zzb(zzvVar));
        zzaemVar.zzu(zztVarZza.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final int zzv(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzv(zzjVar, i10, z10, 0);
        }
        zzc(i10);
        int iZza = zzjVar.zza(this.zzf, this.zze, i10);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzw(zzeg zzegVar, int i10, int i11) {
        if (this.zzg == null) {
            this.zza.zzw(zzegVar, i10, i11);
            return;
        }
        zzc(i10);
        zzegVar.zzm(this.zzf, this.zze, i10);
        this.zze += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzx(final long j10, final int i10, int i11, int i12, zzael zzaelVar) {
        if (this.zzg == null) {
            this.zza.zzx(j10, i10, i11, i12, zzaelVar);
            return;
        }
        zzgmd.zzb(zzaelVar == null, "DRM on subtitles is not supported");
        int i13 = (this.zze - i12) - i11;
        try {
            this.zzg.zza(this.zzf, i13, i11, zzakh.zza(), new zzdg() { // from class: com.google.android.gms.internal.ads.zzakk
                @Override // com.google.android.gms.internal.ads.zzdg
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzb(j10, i10, (zzaka) obj);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.zzi) {
                throw e10;
            }
            zzdt.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.zzd = i14;
        if (i14 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
