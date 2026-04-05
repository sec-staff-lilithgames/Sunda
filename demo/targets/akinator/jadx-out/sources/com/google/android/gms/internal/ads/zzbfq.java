package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.e;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbfq extends e {
    final /* synthetic */ zzbft zza;

    public zzbfq(zzbft zzbftVar) {
        Objects.requireNonNull(zzbftVar);
        this.zza = zzbftVar;
    }

    @Override // androidx.browser.customtabs.e
    public final void onNavigationEvent(int i10, Bundle bundle) {
        this.zza.zzc(i10);
    }
}
