package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final TelephonyManager f23245a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f23246b;

    /* renamed from: c, reason: collision with root package name */
    public CopyOnWriteArrayList f23247c = new CopyOnWriteArrayList();

    public d(Context context) {
        this.f23245a = (TelephonyManager) context.getSystemService("phone");
        this.f23246b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public abstract void a();

    public abstract void a(a aVar);

    public abstract void a(h hVar);

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23247c;
        if (copyOnWriteArrayList == null) {
            IAlog.a("NetworkDetector: onNetworkUpdated: no update listeners", new Object[0]);
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar != null) {
                hVar.a(z0Var);
            }
        }
    }
}
