package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzffh implements zzepj {
    private final Context zza;
    private final Executor zzb;
    private final zzcjn zzc;
    private final zzfey zzd;
    private final zzfdm zze;
    private final zzfgg zzf;
    private final zzflp zzg;
    private final zzfgm zzh;
    private n1 zzi;

    public zzffh(Context context, Executor executor, zzcjn zzcjnVar, zzfdm zzfdmVar, zzfey zzfeyVar, zzfgm zzfgmVar, zzfgg zzfggVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjnVar;
        this.zze = zzfdmVar;
        this.zzd = zzfeyVar;
        this.zzh = zzfgmVar;
        this.zzf = zzfggVar;
        this.zzg = zzcjnVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdrm zze(zzfdk zzfdkVar) {
        zzdrm zzdrmVarZzp = this.zzc.zzp();
        zzcxw zzcxwVar = new zzcxw();
        zzcxwVar.zza(this.zza);
        zzcxwVar.zzb(((zzffg) zzfdkVar).zza);
        zzcxwVar.zzf(this.zzf);
        zzdrmVarZzp.zzd(zzcxwVar.zze());
        zzdrmVarZzp.zze(new zzden().zzn());
        return zzdrmVarZzp;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzepj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm r11, java.lang.String r12, com.google.android.gms.internal.ads.zzeph r13, com.google.android.gms.internal.ads.zzepi r14) throws org.json.JSONException, android.os.RemoteException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbyc r0 = new com.google.android.gms.internal.ads.zzbyc
            r0.<init>(r11, r12)
            com.google.android.gms.internal.ads.zzffa r13 = (com.google.android.gms.internal.ads.zzffa) r13
            java.lang.String r11 = r0.zzb
            r12 = 0
            if (r11 != 0) goto L1e
            int r11 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r11 = "Ad unit ID should not be null for rewarded video ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r11)
            java.util.concurrent.Executor r11 = r10.zzb
            com.google.android.gms.internal.ads.zzfff r13 = new com.google.android.gms.internal.ads.zzfff
            r13.<init>()
            r11.execute(r13)
            return r12
        L1e:
            sh.n1 r13 = r10.zzi
            if (r13 == 0) goto L29
            boolean r13 = r13.isDone()
            if (r13 != 0) goto L29
            return r12
        L29:
            com.google.android.gms.internal.ads.zzbge r12 = com.google.android.gms.internal.ads.zzbgn.zzc
            java.lang.Object r12 = r12.zze()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r13 = 5
            r1 = 0
            if (r12 == 0) goto L5c
            com.google.android.gms.internal.ads.zzfdm r12 = r10.zze
            java.lang.Object r2 = r12.zzd()
            if (r2 == 0) goto L5c
            java.lang.Object r12 = r12.zzd()
            com.google.android.gms.internal.ads.zzdrn r12 = (com.google.android.gms.internal.ads.zzdrn) r12
            com.google.android.gms.internal.ads.zzflm r12 = r12.zzd()
            r12.zzi(r13)
            com.google.android.gms.ads.internal.client.zzm r2 = r0.zza
            java.lang.String r3 = r2.zzp
            r12.zzc(r3)
            android.os.Bundle r2 = r2.zzm
            r12.zzd(r2)
            r6 = r12
            goto L5d
        L5c:
            r6 = r1
        L5d:
            android.content.Context r12 = r10.zza
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zza
            boolean r2 = r0.zzf
            com.google.android.gms.internal.ads.zzfhk.zzb(r12, r2)
            com.google.android.gms.internal.ads.zzbel r3 = com.google.android.gms.internal.ads.zzbeu.zzjT
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r9 = 1
            if (r3 == 0) goto L84
            if (r2 == 0) goto L84
            com.google.android.gms.internal.ads.zzcjn r2 = r10.zzc
            com.google.android.gms.internal.ads.zzdyo r2 = r2.zzw()
            r2.zzc(r9)
        L84:
            android.util.Pair r2 = new android.util.Pair
            com.google.android.gms.internal.ads.zzduq r3 = com.google.android.gms.internal.ads.zzduq.PUBLIC_API_CALL
            java.lang.String r3 = r3.zza()
            long r4 = r0.zzz
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.<init>(r3, r4)
            android.util.Pair r3 = new android.util.Pair
            com.google.android.gms.internal.ads.zzduq r4 = com.google.android.gms.internal.ads.zzduq.DYNAMITE_ENTER
            java.lang.String r4 = r4.zza()
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzt.zzk()
            long r7 = r5.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r3.<init>(r4, r5)
            android.util.Pair[] r2 = new android.util.Pair[]{r2, r3}
            android.os.Bundle r2 = com.google.android.gms.internal.ads.zzdus.zza(r2)
            com.google.android.gms.internal.ads.zzfgm r3 = r10.zzh
            r3.zzg(r11)
            com.google.android.gms.ads.internal.client.zzr r11 = com.google.android.gms.ads.internal.client.zzr.zzc()
            r3.zzc(r11)
            r3.zza(r0)
            r3.zzv(r2)
            com.google.android.gms.internal.ads.zzfgn r11 = r3.zzz()
            int r2 = com.google.android.gms.internal.ads.zzfll.zzg(r11)
            com.google.android.gms.internal.ads.zzflc r7 = com.google.android.gms.internal.ads.zzflc.zzo(r12, r2, r13, r0)
            com.google.android.gms.internal.ads.zzffg r8 = new com.google.android.gms.internal.ads.zzffg
            r8.<init>(r1)
            r8.zza = r11
            com.google.android.gms.internal.ads.zzfdm r11 = r10.zze
            com.google.android.gms.internal.ads.zzfdn r12 = new com.google.android.gms.internal.ads.zzfdn
            r12.<init>(r8, r1)
            com.google.android.gms.internal.ads.zzffe r13 = new com.google.android.gms.internal.ads.zzffe
            r13.<init>()
            sh.n1 r11 = r11.zzc(r12, r13, r1)
            r10.zzi = r11
            com.google.android.gms.internal.ads.zzffd r3 = new com.google.android.gms.internal.ads.zzffd
            r4 = r10
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r12 = r4.zzb
            com.google.android.gms.internal.ads.zzgui.zzr(r11, r3, r12)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffh.zza(com.google.android.gms.ads.internal.client.zzm, java.lang.String, com.google.android.gms.internal.ads.zzeph, com.google.android.gms.internal.ads.zzepi):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzepj
    public final boolean zzb() {
        throw null;
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zzdN(zzfhp.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzfey zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzfdm zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzflp zzi() {
        return this.zzg;
    }

    public final void zzj(int i10) {
        this.zzh.zzj().zza(i10);
    }
}
