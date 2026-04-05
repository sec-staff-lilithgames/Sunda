package nh;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w7 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f76737b;

    public w7(Iterable iterable, Comparator comparator) {
        this.f76737b = new PriorityQueue(2, new com.google.android.exoplayer2.ui.v0(comparator, 3));
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Iterator it2 = (Iterator) it.next();
            if (it2.hasNext()) {
                this.f76737b.add(new v7(z7.peekingIterator(it2), i10));
                i10++;
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this.f76737b.isEmpty();
    }

    @Override // java.util.Iterator
    public Object next() {
        PriorityQueue priorityQueue = this.f76737b;
        v7 v7Var = (v7) priorityQueue.remove();
        x7 x7Var = (x7) v7Var.f76709a;
        Object next = x7Var.next();
        if (x7Var.hasNext()) {
            priorityQueue.add(v7Var);
        }
        return next;
    }
}
