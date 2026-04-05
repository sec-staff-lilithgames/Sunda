package dd;

import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class s implements u, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f52100b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52101c;

    /* renamed from: e, reason: collision with root package name */
    public final transient ed.v f52102e;

    public s(int i10, int i11) {
        this.f52100b = i10;
        this.f52101c = i11;
        this.f52102e = new ed.f().initialCapacity(i10).maximumCapacity(i11).concurrencyLevel(4).build();
    }

    @Override // dd.u
    public void clear() {
        this.f52102e.clear();
    }

    @Override // dd.u
    public void contents(BiConsumer<Object, Object> biConsumer) {
        for (Map.Entry<Object, Object> entry : this.f52102e.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    @Override // dd.u
    public u emptyCopy() {
        return new s(this.f52100b, this.f52101c);
    }

    @Override // dd.u
    public Object get(Object obj) {
        return this.f52102e.get(obj);
    }

    @Override // dd.u
    public Object put(Object obj, Object obj2) {
        return this.f52102e.put(obj, obj2);
    }

    @Override // dd.u
    public Object putIfAbsent(Object obj, Object obj2) {
        return this.f52102e.putIfAbsent(obj, obj2);
    }

    @Override // dd.u
    public int size() {
        return this.f52102e.size();
    }
}
