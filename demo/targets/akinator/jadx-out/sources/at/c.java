package at;

import io.odeeo.internal.p0.q;
import io.odeeo.internal.t0.v;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class c implements v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8006b;

    public /* synthetic */ c(int i10) {
        this.f8006b = i10;
    }

    @Override // io.odeeo.internal.t0.v
    public final boolean apply(Object obj) {
        switch (this.f8006b) {
            case 0:
                return q.c.a((String) obj);
            default:
                return q.c.a((Map.Entry) obj);
        }
    }
}
