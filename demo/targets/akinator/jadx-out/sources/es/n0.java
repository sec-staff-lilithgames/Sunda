package es;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import mh.g1;
import mh.p1;
import wr.b3;
import wr.c3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class n0 extends q {

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f55071l;

    /* renamed from: m, reason: collision with root package name */
    public b3.f f55072m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends b3.f {

        /* renamed from: a, reason: collision with root package name */
        public final List f55073a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f55074b;

        /* renamed from: c, reason: collision with root package name */
        public final int f55075c;

        public a(List<b3.f> list, AtomicInteger atomicInteger) {
            p1.checkArgument(!list.isEmpty(), "empty list");
            this.f55073a = list;
            this.f55074b = (AtomicInteger) p1.checkNotNull(atomicInteger, "index");
            Iterator<b3.f> it = list.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
            this.f55075c = iHashCode;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            List list = aVar.f55073a;
            if (aVar == this) {
                return true;
            }
            if (this.f55075c == aVar.f55075c && this.f55074b == aVar.f55074b) {
                List list2 = this.f55073a;
                if (list2.size() == list.size() && new HashSet(list2).containsAll(list)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f55075c;
        }

        @Override // wr.b3.f
        public c3 pickSubchannel(b3.d dVar) {
            int andIncrement = this.f55074b.getAndIncrement() & Integer.MAX_VALUE;
            List list = this.f55073a;
            return ((b3.f) list.get(andIncrement % list.size())).pickSubchannel(dVar);
        }

        public String toString() {
            return g1.toStringHelper((Class<?>) a.class).add("subchannelPickers", this.f55073a).toString();
        }
    }

    public n0(b3.c cVar) {
        super(cVar);
        this.f55071l = new AtomicInteger(new Random().nextInt());
        this.f55072m = new m0();
    }

    @Override // es.q
    public final void b() {
        wr.f0 f0Var;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f55089f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            f0Var = wr.f0.f90913c;
            if (!zHasNext) {
                break;
            }
            o oVar = (o) it.next();
            if (!oVar.isDeactivated() && oVar.getCurrentState() == f0Var) {
                arrayList.add(oVar);
            }
        }
        if (!arrayList.isEmpty()) {
            d(f0Var, c(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            wr.f0 currentState = ((o) it2.next()).getCurrentState();
            wr.f0 f0Var2 = wr.f0.f90912b;
            if (currentState == f0Var2 || currentState == wr.f0.f90915f) {
                d(f0Var2, new m0());
                return;
            }
        }
        d(wr.f0.f90914e, c(linkedHashMap.values()));
    }

    public final a c(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((o) it.next()).getCurrentPicker());
        }
        return new a(arrayList, this.f55071l);
    }

    public final void d(wr.f0 f0Var, b3.f fVar) {
        if (f0Var == this.f55093j && fVar.equals(this.f55072m)) {
            return;
        }
        this.f55090g.updateBalancingState(f0Var, fVar);
        this.f55093j = f0Var;
        this.f55072m = fVar;
    }
}
