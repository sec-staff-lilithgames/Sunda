package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzxs extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzxs() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    public final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    public final zzxs zzx(zzbl zzblVar) {
        zza(zzblVar);
        return this;
    }

    public final zzxs zzy(int i10, boolean z10) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i10) == z10) {
            return this;
        }
        if (z10) {
            sparseBooleanArray.put(i10, true);
            return this;
        }
        sparseBooleanArray.delete(i10);
        return this;
    }

    public final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    public /* synthetic */ zzxs(zzxt zzxtVar, byte[] bArr) {
        super(zzxtVar);
        this.zza = zzxtVar.zzK;
        this.zzb = zzxtVar.zzM;
        this.zzc = zzxtVar.zzO;
        this.zzd = zzxtVar.zzT;
        this.zze = zzxtVar.zzU;
        this.zzf = zzxtVar.zzV;
        this.zzg = zzxtVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArrayZze = zzxtVar.zze();
            if (i10 < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i10), new HashMap((Map) sparseArrayZze.valueAt(i10)));
                i10++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzxtVar.zzf().clone();
                return;
            }
        }
    }
}
