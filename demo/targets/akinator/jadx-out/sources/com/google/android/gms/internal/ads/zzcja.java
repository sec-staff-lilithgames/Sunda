package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcja extends MutableContextWrapper {
    private Activity zza;
    private Context zzb;
    private Context zzc;

    public zzcja(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.zzc.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zza = context instanceof Activity ? (Activity) context : null;
        this.zzc = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
        }
    }

    public final void zza(Intent intent, int i10) {
        if (this.zza == null) {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 63);
        sb2.append("Starting activity for result with intent: ");
        sb2.append(strValueOf);
        sb2.append(" and requestCode: 236");
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        this.zza.startActivityForResult(intent, 236);
    }

    public final Activity zzb() {
        return this.zza;
    }

    public final Context zzc() {
        return this.zzc;
    }
}
