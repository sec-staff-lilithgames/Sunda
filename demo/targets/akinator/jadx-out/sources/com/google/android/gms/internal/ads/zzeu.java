package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeu extends zzew {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzeu(int i10, long j10) {
        super(i10, null);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final String toString() {
        List list = this.zzb;
        String strZze = zzew.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        com.google.android.gms.internal.play_billing.a.B(sb2, strZze, " leaves: ", string, " containers: ");
        sb2.append(string2);
        return sb2.toString();
    }

    public final void zza(zzev zzevVar) {
        this.zzb.add(zzevVar);
    }

    public final void zzb(zzeu zzeuVar) {
        this.zzc.add(zzeuVar);
    }

    public final zzev zzc(int i10) {
        List list = this.zzb;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzev zzevVar = (zzev) list.get(i11);
            if (zzevVar.zzd == i10) {
                return zzevVar;
            }
        }
        return null;
    }

    public final zzeu zzd(int i10) {
        List list = this.zzc;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzeu zzeuVar = (zzeu) list.get(i11);
            if (zzeuVar.zzd == i10) {
                return zzeuVar;
            }
        }
        return null;
    }
}
