package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzakv {
    private final zzeg zza = new zzeg();
    private final int[] zzb = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcm zza() {
        int i10;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzeg zzegVar = this.zza;
        if (zzegVar.zze() == 0 || zzegVar.zzg() != zzegVar.zze() || !this.zzc) {
            return null;
        }
        zzegVar.zzh(0);
        int i11 = this.zzh * this.zzi;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            int iZzs = zzegVar.zzs();
            if (iZzs != 0) {
                i10 = i12 + 1;
                iArr[i12] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzegVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzegVar.zzs();
                    }
                    i10 = iZzs3 + i12;
                    Arrays.fill(iArr, i12, i10, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzegVar.zzs()]);
                }
            }
            i12 = i10;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcl zzclVar = new zzcl();
        zzclVar.zzc(bitmapCreateBitmap);
        zzclVar.zzi(this.zzf / this.zzd);
        zzclVar.zzj(0);
        zzclVar.zzf(this.zzg / this.zze, 0);
        zzclVar.zzg(0);
        zzclVar.zzm(this.zzh / this.zzd);
        zzclVar.zzn(this.zzi / this.zze);
        return zzclVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    public final /* synthetic */ void zzc(zzeg zzegVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzegVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i11 = 0;
        for (int i12 = i10 / 5; i11 < i12; i12 = i12) {
            int iZzs = zzegVar.zzs();
            int iZzs2 = zzegVar.zzs();
            int iZzs3 = zzegVar.zzs();
            int iZzs4 = zzegVar.zzs();
            double d10 = iZzs2;
            int iZzs5 = zzegVar.zzs() << 24;
            String str = zzep.zza;
            double d11 = iZzs3 - 128;
            double d12 = iZzs4 - 128;
            iArr[iZzs] = (Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)) << 16) | iZzs5 | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255));
            i11++;
        }
        this.zzc = true;
    }

    public final /* synthetic */ void zzd(zzeg zzegVar, int i10) {
        int iZzx;
        if (i10 < 4) {
            return;
        }
        zzegVar.zzk(3);
        int i11 = i10 - 4;
        if ((zzegVar.zzs() & 128) != 0) {
            if (i11 < 7 || (iZzx = zzegVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzegVar.zzt();
            this.zzi = zzegVar.zzt();
            this.zza.zza(iZzx - 4);
            i11 = i10 - 11;
        }
        zzeg zzegVar2 = this.zza;
        int iZzg = zzegVar2.zzg();
        int iZze = zzegVar2.zze();
        if (iZzg >= iZze || i11 <= 0) {
            return;
        }
        int iMin = Math.min(i11, iZze - iZzg);
        zzegVar.zzm(zzegVar2.zzi(), iZzg, iMin);
        zzegVar2.zzh(iZzg + iMin);
    }

    public final /* synthetic */ void zze(zzeg zzegVar, int i10) {
        if (i10 < 19) {
            return;
        }
        this.zzd = zzegVar.zzt();
        this.zze = zzegVar.zzt();
        zzegVar.zzk(11);
        this.zzf = zzegVar.zzt();
        this.zzg = zzegVar.zzt();
    }
}
