package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzals {
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.EMPTY_SET;
    private String zzd = "";
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public final void zza(String str) {
        this.zza = str;
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public final void zzc(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final void zzd(String str) {
        this.zzd = str;
    }

    public final int zze(String str, String str2, Set set, String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (iZzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return (this.zzc.size() * 4) + iZzA;
    }

    public final int zzf() {
        int i10 = this.zzk;
        if (i10 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final boolean zzg() {
        return this.zzj == 1;
    }

    public final zzals zzh(boolean z10) {
        this.zzj = 1;
        return this;
    }

    public final zzals zzi(boolean z10) {
        this.zzk = 1;
        return this;
    }

    public final zzals zzj(boolean z10) {
        this.zzl = 1;
        return this;
    }

    public final String zzk() {
        return this.zze;
    }

    public final zzals zzl(String str) {
        this.zze = zzglm.zza(str);
        return this;
    }

    public final int zzm() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final zzals zzn(int i10) {
        this.zzf = i10;
        this.zzg = true;
        return this;
    }

    public final boolean zzo() {
        return this.zzg;
    }

    public final int zzp() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final zzals zzq(int i10) {
        this.zzh = i10;
        this.zzi = true;
        return this;
    }

    public final boolean zzr() {
        return this.zzi;
    }

    public final zzals zzs(float f10) {
        this.zzn = f10;
        return this;
    }

    public final zzals zzt(int i10) {
        this.zzm = i10;
        return this;
    }

    public final int zzu() {
        return this.zzm;
    }

    public final float zzv() {
        return this.zzn;
    }

    public final zzals zzw(int i10) {
        this.zzo = i10;
        return this;
    }

    public final int zzx() {
        return this.zzo;
    }

    public final zzals zzy(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final boolean zzz() {
        return this.zzp;
    }
}
