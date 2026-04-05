package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaai {
    private final Context zza;
    private boolean zzb;
    private zztg zzc = zztg.zzb;
    private final zzst zzd;
    private Handler zze;
    private zzabs zzf;

    public zzaai(Context context) {
        this.zza = context;
        this.zzd = new zzsn(context, null, null);
    }

    public final zzaai zza(zztg zztgVar) {
        this.zzc = zztgVar;
        return this;
    }

    public final zzaai zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaai zzc(zzabs zzabsVar) {
        this.zzf = zzabsVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzaak zzd() {
        /*
            r3 = this;
            boolean r0 = r3.zzb
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzgmd.zzh(r0)
            android.os.Handler r0 = r3.zze
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzabs r2 = r3.zzf
            if (r2 == 0) goto L10
            goto L12
        L10:
            r2 = r1
            goto L1a
        L12:
            r2 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzabs r0 = r3.zzf
            if (r0 == 0) goto L1a
            goto L10
        L1a:
            com.google.android.gms.internal.ads.zzgmd.zzh(r2)
            r3.zzb = r1
            com.google.android.gms.internal.ads.zzaak r0 = new com.google.android.gms.internal.ads.zzaak
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaai.zzd():com.google.android.gms.internal.ads.zzaak");
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zztg zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzst zzg() {
        return this.zzd;
    }

    public final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzabs zzi() {
        return this.zzf;
    }
}
