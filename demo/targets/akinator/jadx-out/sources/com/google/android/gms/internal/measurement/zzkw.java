package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkw {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzlr zzd;
    public int zze;

    public zzkw() {
        int i10 = zzlr.zzb;
        int i11 = zznu.zza;
        this.zzd = zzlr.zza;
    }

    public static /* synthetic */ String zza(int i10, int i11, byte b10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + b10 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    public zzkw(zzlr zzlrVar) {
        zzlrVar.getClass();
        this.zzd = zzlrVar;
    }
}
