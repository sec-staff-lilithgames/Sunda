package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.y;
import androidx.browser.customtabs.z;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzifx;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzk implements zzbfu {
    final /* synthetic */ zzbfv zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    public zzk(zzs zzsVar, zzbfv zzbfvVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbfvVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zza() {
        zzbfv zzbfvVar = this.zza;
        y yVar = new y(zzbfvVar.zzc());
        zzs.zzaj(yVar, this.zzb);
        z zVarBuild = yVar.build();
        Intent intent = zVarBuild.f5302a;
        Context context = this.zzc;
        intent.setPackage(zzifx.zza(context));
        zVarBuild.launchUrl(context, this.zzd);
        zzbfvVar.zzb((Activity) context);
    }
}
