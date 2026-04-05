package nh;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f76633a;

    /* renamed from: b, reason: collision with root package name */
    public int f76634b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f76635c = -1;

    /* renamed from: d, reason: collision with root package name */
    public h9 f76636d;

    /* renamed from: e, reason: collision with root package name */
    public h9 f76637e;

    public s8 concurrencyLevel(int i10) {
        int i11 = this.f76635c;
        mh.p1.checkState(i11 == -1, "concurrency level was already set to %s", i11);
        mh.p1.checkArgument(i10 > 0);
        this.f76635c = i10;
        return this;
    }

    public s8 initialCapacity(int i10) {
        int i11 = this.f76634b;
        mh.p1.checkState(i11 == -1, "initial capacity was already set to %s", i11);
        mh.p1.checkArgument(i10 >= 0);
        this.f76634b = i10;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        if (!this.f76633a) {
            int i10 = this.f76634b;
            if (i10 == -1) {
                i10 = 16;
            }
            int i11 = this.f76635c;
            if (i11 == -1) {
                i11 = 4;
            }
            return new ConcurrentHashMap(i10, 0.75f, i11);
        }
        t8 t8Var = fa.f76258l;
        h9 h9Var = this.f76636d;
        f9 f9Var = h9.f76324b;
        if (((h9) mh.g1.firstNonNull(h9Var, f9Var)) == f9Var && ((h9) mh.g1.firstNonNull(this.f76637e, f9Var)) == f9Var) {
            return new fa(this, i9.f76357a);
        }
        h9 h9Var2 = (h9) mh.g1.firstNonNull(this.f76636d, f9Var);
        g9 g9Var = h9.f76325c;
        if (h9Var2 == f9Var && ((h9) mh.g1.firstNonNull(this.f76637e, f9Var)) == g9Var) {
            return new fa(this, m9.f76475a);
        }
        if (((h9) mh.g1.firstNonNull(this.f76636d, f9Var)) == g9Var && ((h9) mh.g1.firstNonNull(this.f76637e, f9Var)) == f9Var) {
            return new fa(this, t9.f76661a);
        }
        if (((h9) mh.g1.firstNonNull(this.f76636d, f9Var)) == g9Var && ((h9) mh.g1.firstNonNull(this.f76637e, f9Var)) == g9Var) {
            return new fa(this, x9.f76762a);
        }
        throw new AssertionError();
    }

    public String toString() {
        mh.f1 stringHelper = mh.g1.toStringHelper(this);
        int i10 = this.f76634b;
        if (i10 != -1) {
            stringHelper.add("initialCapacity", i10);
        }
        int i11 = this.f76635c;
        if (i11 != -1) {
            stringHelper.add("concurrencyLevel", i11);
        }
        h9 h9Var = this.f76636d;
        if (h9Var != null) {
            stringHelper.add("keyStrength", mh.c.toLowerCase(h9Var.toString()));
        }
        h9 h9Var2 = this.f76637e;
        if (h9Var2 != null) {
            stringHelper.add("valueStrength", mh.c.toLowerCase(h9Var2.toString()));
        }
        return stringHelper.toString();
    }

    public s8 weakKeys() {
        h9 h9Var = this.f76636d;
        mh.p1.checkState(h9Var == null, "Key strength was already set to %s", h9Var);
        this.f76636d = (h9) mh.p1.checkNotNull(h9.f76325c);
        this.f76633a = true;
        return this;
    }

    public s8 weakValues() {
        h9 h9Var = this.f76637e;
        mh.p1.checkState(h9Var == null, "Value strength was already set to %s", h9Var);
        this.f76637e = (h9) mh.p1.checkNotNull(h9.f76325c);
        this.f76633a = true;
        return this;
    }
}
