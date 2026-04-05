package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzckc implements zzifh {
    private zzckc(zzcjp zzcjpVar) {
    }

    public static zzckc zza(zzcjp zzcjpVar) {
        return new zzckc(zzcjpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
