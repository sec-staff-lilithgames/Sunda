package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzasx {
    public final zzars zza;
    public final zzast zzb;
    public final zzasq zzc;
    public final zzasl zzd;

    public zzasx(zzars zzarsVar, zzast zzastVar, zzasl zzaslVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        this.zza = zzarsVar;
        this.zzb = zzastVar;
        this.zzd = zzaslVar;
        this.zzc = new zzasq(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.y((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16) ^ (i17 % 454333378));
    }

    public final Optional zza() {
        zzarm zzarmVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzasp();
            }
            zzasn zzasnVar = (zzasn) arrayDeque.pop();
            long j10 = zzasnVar.zza;
            long j11 = zzasnVar.zzb;
            long j12 = zzasnVar.zzc;
            zzast zzastVar = this.zzb;
            if (zzastVar.zzb < j11) {
                return Optional.of(zzarm.zzG);
            }
            this.zzd.zza(j10);
            if (j12 == 0) {
                while (zzastVar.zzb > j11) {
                    zzastVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzasj e10) {
            e = e10;
            throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzask e11) {
            e = e11;
            throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzasp unused) {
            zzarmVar = zzarm.zzw;
            return Optional.of(zzarmVar);
        } catch (zzasr unused2) {
            zzarmVar = zzarm.zzG;
            return Optional.of(zzarmVar);
        }
    }
}
