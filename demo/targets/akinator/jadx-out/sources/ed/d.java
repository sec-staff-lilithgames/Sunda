package ed;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends AbstractCollection implements Deque {

    /* renamed from: b, reason: collision with root package name */
    public a f54094b;

    /* renamed from: c, reason: collision with root package name */
    public a f54095c;

    public final boolean a(a aVar) {
        o oVar = (o) aVar;
        return (oVar.getPrevious() == null && oVar.getNext() == null && oVar != this.f54094b) ? false : true;
    }

    public final void b(a aVar) {
        o oVar = (o) aVar;
        a previous = oVar.getPrevious();
        a next = oVar.getNext();
        if (previous == null) {
            this.f54094b = next;
        } else {
            ((o) previous).setNext(next);
            oVar.setPrevious((a) null);
        }
        if (next == null) {
            this.f54095c = previous;
        } else {
            ((o) next).setPrevious(previous);
            oVar.setNext((a) null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        a aVar = this.f54094b;
        while (aVar != null) {
            o oVar = (o) aVar;
            a next = oVar.getNext();
            oVar.setPrevious((a) null);
            oVar.setNext((a) null);
            aVar = next;
        }
        this.f54095c = null;
        this.f54094b = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean contains(Object obj) {
        return (obj instanceof a) && a((a) obj);
    }

    @Override // java.util.Deque
    public Iterator<a> descendingIterator() {
        return new b(this.f54095c, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f54094b == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public Iterator<a> iterator() {
        return new b(this.f54094b, 0);
    }

    public void moveToBack(a aVar) {
        if (aVar != this.f54095c) {
            b(aVar);
            a aVar2 = this.f54095c;
            this.f54095c = aVar;
            if (aVar2 == null) {
                this.f54094b = aVar;
            } else {
                ((o) aVar2).setNext(aVar);
                ((o) aVar).setPrevious(aVar2);
            }
        }
    }

    public void moveToFront(a aVar) {
        if (aVar != this.f54094b) {
            b(aVar);
            a aVar2 = this.f54094b;
            this.f54094b = aVar;
            if (aVar2 == null) {
                this.f54095c = aVar;
            } else {
                ((o) aVar2).setPrevious(aVar);
                ((o) aVar).setNext(aVar2);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Deque
    public boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque
    public boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public int size() {
        int i10 = 0;
        for (a next = this.f54094b; next != null; next = ((o) next).getNext()) {
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(a aVar) {
        return offerLast(aVar);
    }

    @Override // java.util.Deque
    public void addFirst(a aVar) {
        if (!offerFirst(aVar)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.Deque
    public void addLast(a aVar) {
        if (!offerLast(aVar)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.Deque, java.util.Queue
    public a element() {
        return getFirst();
    }

    @Override // java.util.Deque
    public a getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return peekFirst();
    }

    @Override // java.util.Deque
    public a getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return peekLast();
    }

    @Override // java.util.Deque, java.util.Queue
    public boolean offer(a aVar) {
        return offerLast(aVar);
    }

    @Override // java.util.Deque
    public boolean offerFirst(a aVar) {
        if (a(aVar)) {
            return false;
        }
        a aVar2 = this.f54094b;
        this.f54094b = aVar;
        if (aVar2 == null) {
            this.f54095c = aVar;
            return true;
        }
        ((o) aVar2).setPrevious(aVar);
        ((o) aVar).setNext(aVar2);
        return true;
    }

    @Override // java.util.Deque
    public boolean offerLast(a aVar) {
        if (a(aVar)) {
            return false;
        }
        a aVar2 = this.f54095c;
        this.f54095c = aVar;
        if (aVar2 == null) {
            this.f54094b = aVar;
            return true;
        }
        ((o) aVar2).setNext(aVar);
        ((o) aVar).setPrevious(aVar2);
        return true;
    }

    @Override // java.util.Deque, java.util.Queue
    public a peek() {
        return peekFirst();
    }

    @Override // java.util.Deque
    public a peekFirst() {
        return this.f54094b;
    }

    @Override // java.util.Deque
    public a peekLast() {
        return this.f54095c;
    }

    @Override // java.util.Deque, java.util.Queue
    public a poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    public a pollFirst() {
        if (isEmpty()) {
            return null;
        }
        o oVar = (o) this.f54094b;
        a next = oVar.getNext();
        oVar.setNext((a) null);
        this.f54094b = next;
        if (next == null) {
            this.f54095c = null;
            return oVar;
        }
        ((o) next).setPrevious((a) null);
        return oVar;
    }

    @Override // java.util.Deque
    public a pollLast() {
        if (isEmpty()) {
            return null;
        }
        o oVar = (o) this.f54095c;
        a previous = oVar.getPrevious();
        oVar.setPrevious((a) null);
        this.f54095c = previous;
        if (previous == null) {
            this.f54094b = null;
            return oVar;
        }
        ((o) previous).setNext((a) null);
        return oVar;
    }

    @Override // java.util.Deque
    public a pop() {
        return removeFirst();
    }

    @Override // java.util.Deque
    public void push(a aVar) {
        addFirst(aVar);
    }

    @Override // java.util.Deque, java.util.Queue
    public a remove() {
        return removeFirst();
    }

    @Override // java.util.Deque
    public a removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return pollFirst();
    }

    @Override // java.util.Deque
    public a removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return pollLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean remove(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!a(aVar)) {
            return false;
        }
        b(aVar);
        return true;
    }
}
