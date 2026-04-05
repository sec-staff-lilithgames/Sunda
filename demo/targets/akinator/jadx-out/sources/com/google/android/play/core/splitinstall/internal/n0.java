package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f29622a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f29623b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f29624c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f29625d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public zzr f29626e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f29627f = false;

    public n0(o0 o0Var, IntentFilter intentFilter, Context context) {
        this.f29622a = o0Var;
        this.f29623b = intentFilter;
        this.f29624c = e0.zza(context);
    }

    public final void a() {
        zzr zzrVar;
        if ((this.f29627f || !this.f29625d.isEmpty()) && this.f29626e == null) {
            zzr zzrVar2 = new zzr(this);
            this.f29626e = zzrVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f29624c.registerReceiver(zzrVar2, this.f29623b, 2);
            } else {
                this.f29624c.registerReceiver(zzrVar2, this.f29623b);
            }
        }
        if (this.f29627f || !this.f29625d.isEmpty() || (zzrVar = this.f29626e) == null) {
            return;
        }
        this.f29624c.unregisterReceiver(zzrVar);
        this.f29626e = null;
    }

    public final synchronized void zzb(hh.a aVar) {
        this.f29622a.zzd("registerListener", new Object[0]);
        f0.zza(aVar, wHkgq.mTA);
        this.f29625d.add(aVar);
        a();
    }

    public final synchronized void zzc(boolean z10) {
        this.f29627f = true;
        a();
    }

    public final synchronized void zzd(hh.a aVar) {
        this.f29622a.zzd("unregisterListener", new Object[0]);
        f0.zza(aVar, "Unregistered Play Core listener should not be null.");
        this.f29625d.remove(aVar);
        a();
    }

    public final synchronized void zze(Object obj) {
        try {
            Iterator it = new HashSet(this.f29625d).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
