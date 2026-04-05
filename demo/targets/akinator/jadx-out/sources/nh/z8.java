package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z8 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f76813b;

    /* renamed from: c, reason: collision with root package name */
    public int f76814c = -1;

    /* renamed from: e, reason: collision with root package name */
    public e9 f76815e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicReferenceArray f76816f;

    /* renamed from: g, reason: collision with root package name */
    public a9 f76817g;

    /* renamed from: h, reason: collision with root package name */
    public ea f76818h;

    /* renamed from: i, reason: collision with root package name */
    public ea f76819i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fa f76820j;

    public z8(fa faVar) {
        this.f76820j = faVar;
        this.f76813b = faVar.f76261e.length - 1;
        a();
    }

    public final void a() {
        this.f76818h = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i10 = this.f76813b;
            if (i10 < 0) {
                return;
            }
            e9[] e9VarArr = this.f76820j.f76261e;
            this.f76813b = i10 - 1;
            e9 e9Var = e9VarArr[i10];
            this.f76815e = e9Var;
            if (e9Var.f76215c != 0) {
                this.f76816f = this.f76815e.f76218g;
                this.f76814c = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    public final boolean b(a9 a9Var) {
        fa faVar = this.f76820j;
        try {
            Object key = a9Var.getKey();
            Object value = a9Var.getKey() == null ? null : a9Var.getValue();
            if (value == null) {
                this.f76815e.g();
                return false;
            }
            this.f76818h = new ea(faVar, key, value);
            this.f76815e.g();
            return true;
        } catch (Throwable th2) {
            this.f76815e.g();
            throw th2;
        }
    }

    public final ea c() {
        ea eaVar = this.f76818h;
        if (eaVar == null) {
            throw new NoSuchElementException();
        }
        this.f76819i = eaVar;
        a();
        return this.f76819i;
    }

    public final boolean d() {
        a9 a9Var = this.f76817g;
        if (a9Var == null) {
            return false;
        }
        while (true) {
            this.f76817g = a9Var.getNext();
            a9 a9Var2 = this.f76817g;
            if (a9Var2 == null) {
                return false;
            }
            if (b(a9Var2)) {
                return true;
            }
            a9Var = this.f76817g;
        }
    }

    public final boolean e() {
        while (true) {
            int i10 = this.f76814c;
            if (i10 < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f76816f;
            this.f76814c = i10 - 1;
            a9 a9Var = (a9) atomicReferenceArray.get(i10);
            this.f76817g = a9Var;
            if (a9Var != null && (b(a9Var) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76818h != null;
    }

    @Override // java.util.Iterator
    public abstract Object next();

    @Override // java.util.Iterator
    public void remove() {
        jh.i.t(this.f76819i != null);
        this.f76820j.remove(this.f76819i.getKey());
        this.f76819i = null;
    }
}
