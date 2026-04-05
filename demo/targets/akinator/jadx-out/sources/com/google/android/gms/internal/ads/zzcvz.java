package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcvz implements zzdbu, zzdhh {
    private zzbxd zza;
    private final Context zzc;
    private final zzflp zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzcvz(Context context, zzflp zzflpVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzflpVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzb
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La5
        Lb:
            com.google.android.gms.internal.ads.zzbge r0 = com.google.android.gms.internal.ads.zzbgu.zzl
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L68
        L1c:
            com.google.android.gms.internal.ads.zzbge r0 = com.google.android.gms.internal.ads.zzbgu.zzm
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.zzbge r0 = com.google.android.gms.internal.ads.zzbgu.zzk
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.zzcbj r0 = com.google.android.gms.ads.internal.zzt.zzh()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzo()
            com.google.android.gms.internal.ads.zzcbe r0 = r0.zzi()
            java.lang.String r0 = r0.zzd()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1a
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L80
            if (r3 == r2) goto L6f
            goto La5
        L6f:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzflp r2 = r5.zzd
            com.google.android.gms.internal.ads.zzbqg r3 = com.google.android.gms.ads.internal.zzt.zzr()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbqp r0 = r3.zza(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzflp r2 = r5.zzd
            com.google.android.gms.internal.ads.zzbqg r3 = com.google.android.gms.ads.internal.zzt.zzr()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbqp r0 = r3.zzb(r0, r4, r2)
        L90:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.zzbqj r3 = com.google.android.gms.internal.ads.zzbqm.zza
            com.google.android.gms.internal.ads.zzbqf r0 = r0.zza(r2, r3, r3)
            android.content.Context r2 = r5.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r5.zze
            com.google.android.gms.internal.ads.zzbxf r4 = new com.google.android.gms.internal.ads.zzbxf
            r4.<init>(r2, r0, r3)
            r5.zza = r4
            r5.zzg = r1
        La5:
            boolean r0 = r5.zzg
            if (r0 != 0) goto Laa
            goto Ld3
        Laa:
            com.google.android.gms.internal.ads.zzbxd r0 = r5.zza
            if (r0 == 0) goto Ld3
            sh.n1 r0 = r0.zza()
            boolean r1 = r5.zzh
            if (r1 != 0) goto Lce
            com.google.android.gms.internal.ads.zzbge r1 = com.google.android.gms.internal.ads.zzbgm.zzi
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lce
            com.google.android.gms.internal.ads.zzcvy r1 = new com.google.android.gms.internal.ads.zzcvy
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.zzf
            r0.addListener(r1, r2)
        Lce:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.zzcby.zza(r0, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcvz.zzc():void");
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zze(String str) {
        zzc();
    }

    public final /* synthetic */ void zzf() {
        zzbef.zze(this.zzc);
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdU(zzfgf zzfgfVar) {
    }
}
