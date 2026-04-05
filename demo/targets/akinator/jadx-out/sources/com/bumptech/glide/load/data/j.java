package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final h f16593b = new h();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16594a = new HashMap();

    public synchronized <T> g build(T t10) {
        f fVar;
        try {
            j9.q.checkNotNull(t10);
            fVar = (f) this.f16594a.get(t10.getClass());
            if (fVar == null) {
                Iterator it = this.f16594a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f fVar2 = (f) it.next();
                    if (fVar2.getDataClass().isAssignableFrom(t10.getClass())) {
                        fVar = fVar2;
                        break;
                    }
                }
            }
            if (fVar == null) {
                fVar = f16593b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return fVar.build(t10);
    }

    public synchronized void register(f fVar) {
        this.f16594a.put(fVar.getDataClass(), fVar);
    }
}
