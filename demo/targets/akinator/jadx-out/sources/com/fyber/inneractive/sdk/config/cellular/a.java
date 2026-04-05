package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.z0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final d f23238a;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f23240c = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public z0 f23239b = z0.UNKNOWN;

    public a(Context context) {
        this.f23238a = e.a(context);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        this.f23239b = z0Var;
        Iterator it = this.f23240c.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar != null) {
                hVar.a(this.f23239b);
            }
        }
    }
}
