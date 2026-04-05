package hs;

import io.odeeo.internal.a0.a0;
import io.odeeo.internal.a0.y;
import io.odeeo.internal.g.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f59146b;

    public /* synthetic */ a(l lVar, int i10) {
        this.f59145a = i10;
        this.f59146b = lVar;
    }

    @Override // io.odeeo.internal.a0.y.a
    public final y createProgressiveMediaExtractor() {
        switch (this.f59145a) {
            case 0:
                return a0.b.a(this.f59146b);
            default:
                return a0.b.b(this.f59146b);
        }
    }
}
