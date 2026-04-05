package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzahl {
    private final zzeg zza = new zzeg(8);
    private int zzb;

    private final long zzb(zzadb zzadbVar) throws IOException {
        int i10;
        zzeg zzegVar = this.zza;
        zzacr zzacrVar = (zzacr) zzadbVar;
        int i11 = 0;
        zzacrVar.zzh(zzegVar.zzi(), 0, 1, false);
        int i12 = zzegVar.zzi()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        zzacrVar.zzh(zzegVar.zzi(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (zzegVar.zzi()[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i15 << 8);
        }
        this.zzb += i10;
        return i15;
    }

    public final boolean zza(zzadb zzadbVar) throws IOException {
        long jZzo = zzadbVar.zzo();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (jZzo != -1 && jZzo <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = jZzo;
        }
        zzeg zzegVar = this.zza;
        zzacr zzacrVar = (zzacr) zzadbVar;
        zzacrVar.zzh(zzegVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzegVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | (zzegVar.zzi()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzacrVar.zzh(zzegVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzadbVar);
        long j11 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j12 = j11 + jZzb;
            if (jZzo == -1 || j12 < jZzo) {
                while (true) {
                    long j13 = this.zzb;
                    if (j13 < j12) {
                        if (zzb(zzadbVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzadbVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i12 = (int) jZzb2;
                            zzacrVar.zzj(i12, false);
                            this.zzb += i12;
                        }
                    } else if (j13 == j12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
