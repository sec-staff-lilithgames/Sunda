package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t3 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f6011b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6012c;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f6013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6014f;

    public t3(v3 v3Var) {
        this.f6014f = v3Var;
    }

    public final Iterator a() {
        if (this.f6013e == null) {
            this.f6013e = this.f6014f.f6063c.entrySet().iterator();
        }
        return this.f6013e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f6011b + 1;
        v3 v3Var = this.f6014f;
        return i10 < v3Var.f6062b.size() || (!v3Var.f6063c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f6012c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f6012c = false;
        int i10 = v3.f6061i;
        v3 v3Var = this.f6014f;
        v3Var.b();
        if (this.f6011b >= v3Var.f6062b.size()) {
            a().remove();
            return;
        }
        int i11 = this.f6011b;
        this.f6011b = i11 - 1;
        v3Var.d(i11);
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        this.f6012c = true;
        int i10 = this.f6011b + 1;
        this.f6011b = i10;
        v3 v3Var = this.f6014f;
        return i10 < v3Var.f6062b.size() ? (Map.Entry) v3Var.f6062b.get(this.f6011b) : (Map.Entry) a().next();
    }
}
