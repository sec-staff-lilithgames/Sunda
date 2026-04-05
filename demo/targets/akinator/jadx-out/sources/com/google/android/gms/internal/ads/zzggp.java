package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzggp implements zzggf {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzfys zzc;
    private final String zzd;
    private final String zze;
    private final zzgjd zzf;
    private final zzggr zzg;

    public zzggp(Context context, ExecutorService executorService, zzfxt zzfxtVar, zzfys zzfysVar, zzgjd zzgjdVar, zzggr zzggrVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzfysVar;
        this.zzf = zzgjdVar;
        this.zzg = zzggrVar;
        this.zzd = zzfxtVar.zzb();
        this.zze = zzfxtVar.zzi().zzc();
    }

    private static zzfzy zzc(int i10) {
        zzfzx zzfzxVarZzd = zzfzy.zzd();
        zzfzxVarZzd.zze(i10);
        return (zzfzy) zzfzxVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzggf
    public final n1 zza() {
        int i10;
        zzazv zzazvVarZza = zzazw.zza();
        byte[] bArrZza = zzarq.zza();
        zzhvi zzhviVar = zzhvi.zzb;
        zzazvVarZza.zza(zzhvi.zzr(bArrZza, 0, bArrZza.length));
        zzazvVarZza.zzb(Build.VERSION.SDK_INT);
        zzazvVarZza.zzc(Build.MODEL);
        Context context = this.zza;
        zzazvVarZza.zzd(context.getPackageName());
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i10 = -1;
        }
        zzfys zzfysVar = this.zzc;
        zzgjd zzgjdVar = this.zzf;
        zzazvVarZza.zze(i10);
        zzazvVarZza.zzf(this.zzd);
        n1 n1VarZzk = zzgui.zzk(zzfysVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzfyo.zza(((zzazw) zzazvVarZza.zzbu()).zzaN(), true)).build().toString()), new zzglu() { // from class: com.google.android.gms.internal.ads.zzggo
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb((zzfyr) obj);
            }
        }, this.zzb);
        zzgjdVar.zze(20002, n1VarZzk);
        return n1VarZzk;
    }

    public final /* synthetic */ zzfzy zzb(zzfyr zzfyrVar) {
        if (zzfyrVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzarq.zza(), StandardCharsets.UTF_8));
            return zzc(7);
        }
        try {
            String strZzb = zzfyrVar.zzb();
            if (TextUtils.isEmpty(strZzb)) {
                this.zzf.zzb(20004);
                return zzc(8);
            }
            zzazy zzazyVarZzb = zzazy.zzb(zzfyo.zzb(strZzb, true), zzhvy.zzb());
            if (zzazyVarZzb.zza().zzc() && zzazyVarZzb.zza().zza()) {
                if (!this.zzg.zza(zzazyVarZzb)) {
                    this.zzf.zzb(20006);
                    return zzc(12);
                }
                zzfzx zzfzxVarZzd = zzfzy.zzd();
                zzfzz zzfzzVarZzd = zzgaa.zzd();
                zzfzzVarZzd.zzb(zzazyVarZzb.zza().zzb());
                zzfzxVarZzd.zzb(zzfzzVarZzd);
                zzfzxVarZzd.zzc(zzazyVarZzb.zza().zzd());
                zzfzxVarZzd.zze(2);
                return (zzfzy) zzfzxVarZzd.zzbu();
            }
            this.zzf.zzb(20004);
            return zzc(8);
        } catch (Throwable th2) {
            this.zzf.zzd(20005, th2);
            return zzc(6);
        }
    }
}
