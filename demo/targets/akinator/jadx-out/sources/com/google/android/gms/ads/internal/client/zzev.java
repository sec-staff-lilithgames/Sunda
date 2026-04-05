package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzev extends zzdm {
    private zzev() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze(zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListenerZzz = zzex.zzb().zzz();
        if (onAdInspectorClosedListenerZzz != null) {
            onAdInspectorClosedListenerZzz.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }

    public /* synthetic */ zzev(byte[] bArr) {
    }
}
