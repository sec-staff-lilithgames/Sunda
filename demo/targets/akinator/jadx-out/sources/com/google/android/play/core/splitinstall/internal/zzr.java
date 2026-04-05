package com.google.android.play.core.splitinstall.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzr extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f29629a;

    public /* synthetic */ zzr(n0 n0Var) {
        this.f29629a = n0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        jh.p pVar = (jh.p) this.f29629a;
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        jh.a aVarZzd = jh.a.zzd(bundleExtra);
        pVar.f29622a.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", aVarZzd);
        jh.f fVarZza = ((jh.j) pVar.f69568h).zza();
        if (aVarZzd.status() != 3 || fVarZza == null) {
            pVar.zzk(aVarZzd);
        } else {
            fVarZza.zzd(aVarZzd.c(), new jh.n(pVar, aVarZzd, intent, context));
        }
    }
}
