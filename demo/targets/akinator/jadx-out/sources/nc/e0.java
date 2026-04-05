package nc;

import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final Object f75887c;

    public e0(g0 g0Var, Object obj, Object obj2) {
        super(g0Var, obj);
        this.f75887c = obj2;
    }

    @Override // nc.g0
    public void assign(Object obj) throws IOException {
        ((Map) obj).put(this.f75887c, this.f75901b);
    }
}
