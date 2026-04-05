package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public final b f23244d;

    public c(Context context) {
        super(context);
        this.f23244d = new b(this.f23245a, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23247c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.add(aVar);
            } catch (Throwable th2) {
                IAlog.a("failed to add networkUpdateListener", th2, new Object[0]);
            }
        }
        this.f23244d.b();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(h hVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23247c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.remove(hVar);
            } catch (Throwable th2) {
                IAlog.a("failed to remove networkUpdateListener", th2, new Object[0]);
            }
        }
        this.f23244d.c();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a() {
        this.f23244d.a();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23247c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f23247c = null;
        }
    }
}
