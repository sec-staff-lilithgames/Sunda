package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcm {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzq;
    private static final String zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    public final CharSequence zza;
    public final Layout.Alignment zzb;
    public final Layout.Alignment zzc;
    public final Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    public final int zzp;

    static {
        zzcl zzclVar = new zzcl();
        zzclVar.zza("");
        zzclVar.zzr();
        String str = zzep.zza;
        zzq = Integer.toString(0, 36);
        zzr = Integer.toString(17, 36);
        zzs = Integer.toString(1, 36);
        zzt = Integer.toString(2, 36);
        Integer.toString(3, 36);
        zzu = Integer.toString(18, 36);
        zzv = Integer.toString(4, 36);
        zzw = Integer.toString(5, 36);
        zzx = Integer.toString(6, 36);
        zzy = Integer.toString(7, 36);
        zzz = Integer.toString(8, 36);
        zzA = Integer.toString(9, 36);
        zzB = Integer.toString(10, 36);
        zzC = Integer.toString(11, 36);
        zzD = Integer.toString(12, 36);
        zzE = Integer.toString(13, 36);
        zzF = Integer.toString(14, 36);
        zzG = Integer.toString(15, 36);
        zzH = Integer.toString(16, 36);
        zzI = Integer.toString(19, 36);
    }

    public /* synthetic */ zzcm(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, int i16, byte[] bArr) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            zzgmd.zza(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.zza = SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = f11;
        this.zzi = i12;
        this.zzj = f13;
        this.zzk = f14;
        this.zzl = i13;
        this.zzm = f12;
        this.zzn = i15;
        this.zzo = f15;
        this.zzp = i16;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcm.class == obj.getClass()) {
            zzcm zzcmVar = (zzcm) obj;
            if (TextUtils.equals(this.zza, zzcmVar.zza) && this.zzb == zzcmVar.zzb && this.zzc == zzcmVar.zzc && ((bitmap = this.zzd) != null ? !((bitmap2 = zzcmVar.zzd) == null || !bitmap.sameAs(bitmap2)) : zzcmVar.zzd == null) && this.zze == zzcmVar.zze && this.zzf == zzcmVar.zzf && this.zzg == zzcmVar.zzg && this.zzh == zzcmVar.zzh && this.zzi == zzcmVar.zzi && this.zzj == zzcmVar.zzj && this.zzk == zzcmVar.zzk && this.zzl == zzcmVar.zzl && this.zzm == zzcmVar.zzm && this.zzn == zzcmVar.zzn && this.zzo == zzcmVar.zzo && this.zzp == zzcmVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, Float.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Float.valueOf(this.zzh), Integer.valueOf(this.zzi), Float.valueOf(this.zzj), Float.valueOf(this.zzk), Boolean.FALSE, -16777216, Integer.valueOf(this.zzl), Float.valueOf(this.zzm), Integer.valueOf(this.zzn), Float.valueOf(this.zzo), Integer.valueOf(this.zzp));
    }

    public final zzcl zza() {
        return new zzcl(this, null);
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzq, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListZza = zzcp.zza((Spanned) charSequence);
                if (!arrayListZza.isEmpty()) {
                    bundle.putParcelableArrayList(zzr, arrayListZza);
                }
            }
        }
        bundle.putSerializable(zzs, this.zzb);
        bundle.putSerializable(zzt, this.zzc);
        bundle.putFloat(zzv, this.zze);
        bundle.putInt(zzw, this.zzf);
        bundle.putInt(zzx, this.zzg);
        bundle.putFloat(zzy, this.zzh);
        bundle.putInt(zzz, this.zzi);
        bundle.putInt(zzA, this.zzl);
        bundle.putFloat(zzB, this.zzm);
        bundle.putFloat(zzC, this.zzj);
        bundle.putFloat(zzD, this.zzk);
        bundle.putBoolean(zzF, false);
        bundle.putInt(zzE, -16777216);
        bundle.putInt(zzG, this.zzn);
        bundle.putFloat(zzH, this.zzo);
        bundle.putInt(zzI, this.zzp);
        Bitmap bitmap = this.zzd;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzgmd.zzh(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzu, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }
}
