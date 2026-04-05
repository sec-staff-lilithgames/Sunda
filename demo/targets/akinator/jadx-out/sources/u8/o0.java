package u8;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f88099a = new HashMap();

    public void clear() {
        this.f88099a.clear();
    }

    public <Model> List<l0> get(Class<Model> cls) {
        n0 n0Var = (n0) this.f88099a.get(cls);
        if (n0Var == null) {
            return null;
        }
        return n0Var.f88097a;
    }

    public <Model> void put(Class<Model> cls, List<l0> list) {
        if (((n0) this.f88099a.put(cls, new n0(list))) != null) {
            throw new IllegalStateException(a.b.i(cls, "Already cached loaders for model: "));
        }
    }
}
