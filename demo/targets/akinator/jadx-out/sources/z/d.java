package z;

import com.ironsource.C3191e4;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public int f96783b;

    /* renamed from: c, reason: collision with root package name */
    public int f96784c = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f96786f;

    public d(f fVar) {
        this.f96786f = fVar;
        this.f96783b = fVar.size() - 1;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!this.f96785e) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f96784c;
        f fVar = this.f96786f;
        return a0.a.equal(key, fVar.keyAt(i10)) && a0.a.equal(entry.getValue(), fVar.valueAt(this.f96784c));
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        if (this.f96785e) {
            return this.f96786f.keyAt(this.f96784c);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        if (this.f96785e) {
            return this.f96786f.valueAt(this.f96784c);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96784c < this.f96783b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        if (!this.f96785e) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f96784c;
        f fVar = this.f96786f;
        Object objKeyAt = fVar.keyAt(i10);
        Object objValueAt = fVar.valueAt(this.f96784c);
        return (objKeyAt == null ? 0 : objKeyAt.hashCode()) ^ (objValueAt != null ? objValueAt.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f96785e) {
            throw new IllegalStateException();
        }
        this.f96786f.removeAt(this.f96784c);
        this.f96784c--;
        this.f96783b--;
        this.f96785e = false;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (this.f96785e) {
            return this.f96786f.setValueAt(this.f96784c, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public String toString() {
        return getKey() + C3191e4.i.f36525b + getValue();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f96784c++;
        this.f96785e = true;
        return this;
    }
}
