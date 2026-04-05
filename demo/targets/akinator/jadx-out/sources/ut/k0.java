package ut;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements st.b {

    /* renamed from: a, reason: collision with root package name */
    public final st.o f88673a;

    /* renamed from: b, reason: collision with root package name */
    public final st.o f88674b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f88675c;

    public k0(st.o oVar, st.o oVar2, st.o oVar3) {
        this.f88673a = oVar;
        this.f88674b = oVar2;
        this.f88675c = oVar3;
    }

    @Override // st.b
    public void accept(Map<Object, Collection<Object>> map, Object obj) throws Exception {
        Object objApply = this.f88675c.apply(obj);
        Collection<Object> collection = map.get(objApply);
        if (collection == null) {
            collection = (Collection) this.f88673a.apply(objApply);
            map.put(objApply, collection);
        }
        collection.add(this.f88674b.apply(obj));
    }
}
