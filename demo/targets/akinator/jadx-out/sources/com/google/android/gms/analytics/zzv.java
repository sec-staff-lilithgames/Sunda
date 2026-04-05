package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import b0.e2;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzfe;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzv extends zzbr {
    final /* synthetic */ Tracker zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private boolean zze;
    private long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(Tracker tracker, zzbu zzbuVar) {
        super(zzbuVar);
        this.zza = tracker;
        this.zzd = -1L;
    }

    private final void zzg() {
        if (this.zzd >= 0 || this.zzb) {
            zzp().zzk(this.zza.zze);
        } else {
            zzp().zzl(this.zza.zze);
        }
    }

    public final void zza(Activity activity) throws Throwable {
        String canonicalName;
        if (this.zzc == 0) {
            if (zzC().elapsedRealtime() >= Math.max(1000L, this.zzd) + this.zzf) {
                this.zze = true;
            }
        }
        this.zzc++;
        if (this.zzb) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                this.zza.setCampaignParamsOnNextHit(intent.getData());
            }
            HashMap mapS = e2.s("&t", "screenview");
            Tracker tracker = this.zza;
            if (tracker.zzg != null) {
                zzfe zzfeVar = tracker.zzg;
                canonicalName = activity.getClass().getCanonicalName();
                String str = (String) zzfeVar.zzg.get(canonicalName);
                if (str != null) {
                    canonicalName = str;
                }
            } else {
                canonicalName = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", canonicalName);
            if (TextUtils.isEmpty((CharSequence) mapS.get("&dr"))) {
                Preconditions.checkNotNull(activity);
                Intent intent2 = activity.getIntent();
                String str2 = null;
                if (intent2 != null) {
                    String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        str2 = stringExtra;
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    mapS.put("&dr", str2);
                }
            }
            this.zza.send(mapS);
        }
    }

    public final void zzb(Activity activity) {
        int i10 = this.zzc - 1;
        this.zzc = i10;
        int iMax = Math.max(0, i10);
        this.zzc = iMax;
        if (iMax == 0) {
            this.zzf = zzC().elapsedRealtime();
        }
    }

    public final void zzc(boolean z10) {
        this.zzb = z10;
        zzg();
    }

    public final void zze(long j10) {
        this.zzd = j10;
        zzg();
    }

    public final synchronized boolean zzf() {
        boolean z10;
        z10 = this.zze;
        this.zze = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
    }
}
