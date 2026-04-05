package ut;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 implements st.b {

    /* renamed from: a, reason: collision with root package name */
    public final st.o f88668a;

    public i0(st.o oVar) {
        this.f88668a = oVar;
    }

    @Override // st.b
    public void accept(Map<Object, Object> map, Object obj) throws Exception {
        map.put(this.f88668a.apply(obj), obj);
    }
}
