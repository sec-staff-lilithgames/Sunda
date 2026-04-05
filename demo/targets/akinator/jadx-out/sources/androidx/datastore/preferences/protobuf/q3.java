package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q3 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f5973b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f5974c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v3 f5975e;

    public q3(v3 v3Var) {
        this.f5975e = v3Var;
        this.f5973b = v3Var.f6062b.size();
    }

    public final Iterator a() {
        if (this.f5974c == null) {
            this.f5974c = this.f5975e.f6066g.entrySet().iterator();
        }
        return this.f5974c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f5973b;
        return (i10 > 0 && i10 <= this.f5975e.f6062b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.f5975e.f6062b;
        int i10 = this.f5973b - 1;
        this.f5973b = i10;
        return (Map.Entry) list.get(i10);
    }
}
