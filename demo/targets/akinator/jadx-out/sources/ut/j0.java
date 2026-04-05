package ut;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 implements st.b {

    /* renamed from: a, reason: collision with root package name */
    public final st.o f88670a;

    /* renamed from: b, reason: collision with root package name */
    public final st.o f88671b;

    public j0(st.o oVar, st.o oVar2) {
        this.f88670a = oVar;
        this.f88671b = oVar2;
    }

    @Override // st.b
    public void accept(Map<Object, Object> map, Object obj) throws Exception {
        map.put(this.f88671b.apply(obj), this.f88670a.apply(obj));
    }
}
