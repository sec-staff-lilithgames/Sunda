package nh;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b6 extends t4 {

    /* renamed from: a, reason: collision with root package name */
    public re f76122a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f76123b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76124c;

    public b6(int i10) {
        this.f76123b = false;
        this.f76124c = false;
        this.f76122a = new re(i10);
    }

    @Override // nh.t4
    public /* bridge */ /* synthetic */ t4 addAll(Iterable iterable) {
        return addAll((Iterable<Object>) iterable);
    }

    public b6 addCopies(Object obj, int i10) {
        Objects.requireNonNull(this.f76122a);
        if (i10 == 0) {
            return this;
        }
        if (this.f76123b) {
            this.f76122a = new re(this.f76122a);
            this.f76124c = false;
        }
        this.f76123b = false;
        mh.p1.checkNotNull(obj);
        re reVar = this.f76122a;
        reVar.put(obj, reVar.get(obj) + i10);
        return this;
    }

    public b6 setCount(Object obj, int i10) {
        Objects.requireNonNull(this.f76122a);
        if (i10 == 0 && !this.f76124c) {
            re reVar = this.f76122a;
            se seVar = new se();
            seVar.f(reVar.f76606c);
            for (int iB = reVar.b(); iB != -1; iB = reVar.i(iB)) {
                seVar.put(reVar.c(iB), reVar.d(iB));
            }
            this.f76122a = seVar;
            this.f76124c = true;
        } else if (this.f76123b) {
            this.f76122a = new re(this.f76122a);
            this.f76124c = false;
        }
        this.f76123b = false;
        mh.p1.checkNotNull(obj);
        if (i10 == 0) {
            this.f76122a.remove(obj);
            return this;
        }
        this.f76122a.put(mh.p1.checkNotNull(obj), i10);
        return this;
    }

    @Override // nh.t4
    public /* bridge */ /* synthetic */ t4 addAll(Iterator it) {
        return addAll((Iterator<Object>) it);
    }

    @Override // nh.t4
    public d6 build() {
        Objects.requireNonNull(this.f76122a);
        re reVar = this.f76122a;
        if (reVar.f76606c == 0) {
            return d6.of();
        }
        if (this.f76124c) {
            this.f76122a = new re(reVar);
            this.f76124c = false;
        }
        this.f76123b = true;
        return new nf(this.f76122a);
    }

    @Override // nh.t4
    public b6 add(Object obj) {
        return addCopies(obj, 1);
    }

    @Override // nh.t4
    public b6 addAll(Iterable<Object> iterable) {
        re reVar;
        Objects.requireNonNull(this.f76122a);
        if (iterable instanceof ud) {
            ud udVar = (ud) iterable;
            if (udVar instanceof nf) {
                reVar = ((nf) udVar).f76508g;
            } else {
                reVar = udVar instanceof z ? ((z) udVar).f76801e : null;
            }
            if (reVar != null) {
                re reVar2 = this.f76122a;
                reVar2.a(Math.max(reVar2.f76606c, reVar.f76606c));
                for (int iB = reVar.b(); iB >= 0; iB = reVar.i(iB)) {
                    addCopies(reVar.c(iB), reVar.d(iB));
                }
            } else {
                Set<td> setEntrySet = udVar.entrySet();
                re reVar3 = this.f76122a;
                reVar3.a(Math.max(reVar3.f76606c, setEntrySet.size()));
                for (td tdVar : udVar.entrySet()) {
                    addCopies(tdVar.getElement(), tdVar.getCount());
                }
            }
            return this;
        }
        super.addAll(iterable);
        return this;
    }

    @Override // nh.t4
    public b6 add(Object... objArr) {
        super.add(objArr);
        return this;
    }

    public b6() {
        this(4);
    }

    @Override // nh.t4
    public b6 addAll(Iterator<Object> it) {
        super.addAll(it);
        return this;
    }
}
