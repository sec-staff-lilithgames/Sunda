package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdhw extends zzcto {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdfz zze;
    private final zzdjl zzf;
    private final zzcuj zzg;
    private final zzfsc zzh;
    private final zzczb zzi;
    private final zzcbn zzj;
    private final zzdvi zzk;
    private boolean zzl;

    public zzdhw(zzctn zzctnVar, Context context, zzcgy zzcgyVar, zzdfz zzdfzVar, zzdjl zzdjlVar, zzcuj zzcujVar, zzfsc zzfscVar, zzczb zzczbVar, zzcbn zzcbnVar, zzdvi zzdviVar) {
        super(zzctnVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcgyVar);
        this.zze = zzdfzVar;
        this.zzf = zzdjlVar;
        this.zzg = zzcujVar;
        this.zzh = zzfscVar;
        this.zzi = zzczbVar;
        this.zzj = zzcbnVar;
        this.zzk = zzdviVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcgy zzcgyVar = (zzcgy) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhk)).booleanValue()) {
                if (!this.zzl && zzcgyVar != null) {
                    zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcgyVar.destroy();
                        }
                    });
                }
            } else if (zzcgyVar != null) {
                zzcgyVar.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(boolean r7, android.app.Activity r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzdfz r0 = r6.zze
            r0.zza()
            com.google.android.gms.ads.internal.zzt.zzc()
            com.google.android.gms.internal.ads.zzdjl r1 = r6.zzf
            com.google.android.gms.internal.ads.zzffu r2 = r1.zzb()
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzS(r2)
            r3 = 0
            if (r2 != 0) goto L7d
            com.google.android.gms.internal.ads.zzbel r2 = com.google.android.gms.internal.ads.zzbeu.zzox
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r4.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L33
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r2 = r6.zzc
            com.google.android.gms.internal.ads.zzffu r4 = r6.zzb
            com.google.android.gms.internal.ads.zzdvi r5 = r6.zzk
            com.google.android.gms.ads.internal.util.zzs.zzR(r2, r4, r5)
        L33:
            com.google.android.gms.internal.ads.zzbel r2 = com.google.android.gms.internal.ads.zzbeu.zzaT
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r4.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L7d
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r2 = r6.zzc
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzK(r2)
            if (r2 == 0) goto L7d
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r7)
            com.google.android.gms.internal.ads.zzczb r7 = r6.zzi
            r7.zze()
            com.google.android.gms.internal.ads.zzbel r7 = com.google.android.gms.internal.ads.zzbeu.zzaU
            com.google.android.gms.internal.ads.zzbes r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r8.zzd(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lf3
            com.google.android.gms.internal.ads.zzfsc r7 = r6.zzh
            com.google.android.gms.internal.ads.zzfgf r8 = r6.zza
            com.google.android.gms.internal.ads.zzfge r8 = r8.zzb
            com.google.android.gms.internal.ads.zzffx r8 = r8.zzb
            java.lang.String r8 = r8.zzb
            r7.zza(r8)
            goto Lf3
        L7d:
            java.lang.ref.WeakReference r2 = r6.zzd
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.zzcgy r2 = (com.google.android.gms.internal.ads.zzcgy) r2
            com.google.android.gms.internal.ads.zzbel r4 = com.google.android.gms.internal.ads.zzbeu.zzmT
            com.google.android.gms.internal.ads.zzbes r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 == 0) goto Lc3
            if (r2 == 0) goto Lc3
            com.google.android.gms.internal.ads.zzffu r2 = r2.zzC()
            if (r2 == 0) goto Lc3
            boolean r4 = r2.zzar
            if (r4 == 0) goto Lc3
            int r2 = r2.zzas
            com.google.android.gms.internal.ads.zzcbn r4 = r6.zzj
            int r4 = r4.zzj()
            if (r2 == r4) goto Lc3
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "The interstitial consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r7)
            com.google.android.gms.internal.ads.zzczb r7 = r6.zzi
            r8 = 12
            java.lang.String r0 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r8 = com.google.android.gms.internal.ads.zzfhp.zzd(r8, r0, r5)
            r7.zzc(r8)
            goto Lf3
        Lc3:
            boolean r2 = r6.zzl
            if (r2 == 0) goto Ld9
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "The interstitial ad has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r2)
            com.google.android.gms.internal.ads.zzczb r2 = r6.zzi
            r4 = 10
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfhp.zzd(r4, r5, r5)
            r2.zzc(r4)
        Ld9:
            boolean r2 = r6.zzl
            if (r2 != 0) goto Lf3
            if (r8 != 0) goto Le1
            android.content.Context r8 = r6.zzc
        Le1:
            com.google.android.gms.internal.ads.zzczb r2 = r6.zzi     // Catch: com.google.android.gms.internal.ads.zzdjk -> Led
            r1.zza(r7, r8, r2)     // Catch: com.google.android.gms.internal.ads.zzdjk -> Led
            r0.zzb()     // Catch: com.google.android.gms.internal.ads.zzdjk -> Led
            r7 = 1
            r6.zzl = r7
            return r7
        Led:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzczb r8 = r6.zzi
            r8.zzd(r7)
        Lf3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdhw.zza(boolean, android.app.Activity):boolean");
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
