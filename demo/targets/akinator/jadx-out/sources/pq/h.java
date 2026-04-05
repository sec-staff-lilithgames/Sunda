package pq;

import dq.d0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends dr.b {

    /* renamed from: c, reason: collision with root package name */
    public final dq.h f81644c;

    public h(dq.h adElement) {
        e0.checkNotNullParameter(adElement, "adElement");
        this.f81644c = adElement;
    }

    @Override // dr.b
    public void runTask() {
        try {
            this.f81644c.c();
        } catch (Throwable th2) {
            d0.b(th2);
        }
    }
}
