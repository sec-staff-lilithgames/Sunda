package pq;

import dq.c0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class l implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dq.h f81646c;

    public /* synthetic */ l(dq.h hVar, int i10) {
        this.f81645b = i10;
        this.f81646c = hVar;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        int i10 = this.f81645b;
        dq.h item = this.f81646c;
        switch (i10) {
            case 0:
                item.a();
                break;
            case 1:
                int i11 = m.f81647s;
                e0.checkNotNullParameter(item, "$item");
                item.d();
                break;
            default:
                int i12 = m.f81647s;
                e0.checkNotNullParameter(item, "$item");
                item.f();
                break;
        }
    }
}
