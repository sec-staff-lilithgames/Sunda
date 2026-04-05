package p0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q5 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final s4 f80409b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80410c;

    /* renamed from: e, reason: collision with root package name */
    public final q1 f80411e;

    /* renamed from: f, reason: collision with root package name */
    public final r5 f80412f;

    /* renamed from: g, reason: collision with root package name */
    public final int f80413g;

    /* renamed from: h, reason: collision with root package name */
    public int f80414h;

    public q5(s4 s4Var, int i10, q1 q1Var, r5 r5Var) {
        this.f80409b = s4Var;
        this.f80410c = i10;
        this.f80411e = q1Var;
        this.f80412f = r5Var;
        this.f80413g = s4Var.getVersion$runtime();
    }

    public final q1 getGroup() {
        return this.f80411e;
    }

    public final int getParent() {
        return this.f80410c;
    }

    public final r5 getPath() {
        return this.f80412f;
    }

    public final s4 getTable() {
        return this.f80409b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> groups = this.f80411e.getGroups();
        return groups != null && this.f80414h < groups.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public d1.i next() {
        Object obj;
        ArrayList<Object> groups = this.f80411e.getGroups();
        if (groups != null) {
            int i10 = this.f80414h;
            this.f80414h = i10 + 1;
            obj = groups.get(i10);
        } else {
            obj = null;
        }
        boolean z10 = obj instanceof b;
        s4 s4Var = this.f80409b;
        if (z10) {
            return new t4(s4Var, ((b) obj).getLocation$runtime(), this.f80413g);
        }
        if (!(obj instanceof q1)) {
            d0.composeRuntimeError("Unexpected group information structure");
            throw new tu.k();
        }
        return new s5(s4Var, this.f80410c, (q1) obj, new h4(this.f80412f, this.f80414h - 1));
    }
}
