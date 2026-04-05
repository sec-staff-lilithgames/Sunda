package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6803c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f6806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f6807h;

    public d0(int i10, int i11, Bundle bundle, h0 h0Var, i0 i0Var, String str) {
        this.f6807h = h0Var;
        this.f6802b = i0Var;
        this.f6803c = i10;
        this.f6804e = str;
        this.f6805f = i11;
        this.f6806g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() throws RemoteException {
        k kVar;
        IBinder iBinderAsBinder = ((j0) this.f6802b).asBinder();
        h0 h0Var = this.f6807h;
        h0Var.f6827a.f6775f.remove(iBinderAsBinder);
        Iterator it = h0Var.f6827a.f6774e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            k kVar2 = (k) it.next();
            if (kVar2.f6833c == this.f6803c) {
                kVar = (TextUtils.isEmpty(this.f6804e) || this.f6805f <= 0) ? new k(h0Var.f6827a, kVar2.f6831a, kVar2.f6832b, kVar2.f6833c, this.f6806g, this.f6802b) : null;
                it.remove();
            }
        }
        if (kVar == null) {
            kVar = new k(h0Var.f6827a, this.f6804e, this.f6805f, this.f6803c, this.f6806g, this.f6802b);
        }
        h0Var.f6827a.f6775f.put(iBinderAsBinder, kVar);
        try {
            iBinderAsBinder.linkToDeath(kVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
