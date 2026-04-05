package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzb implements zzyv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyt[] zzd = new zzyt[100];

    public zzzb(boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final synchronized zzyt zza() {
        zzyt zzytVar;
        try {
            this.zzb++;
            int i10 = this.zzc;
            if (i10 > 0) {
                zzyt[] zzytVarArr = this.zzd;
                int i11 = i10 - 1;
                this.zzc = i11;
                zzytVar = zzytVarArr[i11];
                if (zzytVar == null) {
                    throw null;
                }
                zzytVarArr[i11] = null;
            } else {
                zzytVar = new zzyt(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
                int i12 = this.zzb;
                zzyt[] zzytVarArr2 = this.zzd;
                int length = zzytVarArr2.length;
                if (i12 > length) {
                    this.zzd = (zzyt[]) Arrays.copyOf(zzytVarArr2, length + length);
                    return zzytVar;
                }
            }
            return zzytVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final synchronized void zzb(zzyt zzytVar) {
        zzyt[] zzytVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzytVarArr[i10] = zzytVar;
        this.zzb--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final synchronized void zzc(zzyu zzyuVar) {
        while (zzyuVar != null) {
            try {
                zzyt[] zzytVarArr = this.zzd;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzytVarArr[i10] = zzyuVar.zzd();
                this.zzb--;
                zzyuVar = zzyuVar.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final synchronized void zzd() {
        int i10 = this.zza;
        String str = zzep.zza;
        int iMax = Math.max(0, ((i10 + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.zzb);
        int i11 = this.zzc;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i11, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }
}
