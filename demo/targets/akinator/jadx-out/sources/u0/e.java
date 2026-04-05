package u0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final u[] f87482b;

    /* renamed from: c, reason: collision with root package name */
    public int f87483c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87484e = true;

    public e(t tVar, u[] uVarArr) {
        this.f87482b = uVarArr;
        uVarArr[0].reset(tVar.getBuffer$runtime(), tVar.entryCount$runtime() * 2);
        this.f87483c = 0;
        a();
    }

    public final void a() {
        int i10 = this.f87483c;
        u[] uVarArr = this.f87482b;
        if (uVarArr[i10].hasNextKey()) {
            return;
        }
        for (int i11 = this.f87483c; -1 < i11; i11--) {
            int iB = b(i11);
            if (iB == -1 && uVarArr[i11].hasNextNode()) {
                uVarArr[i11].moveToNextNode();
                iB = b(i11);
            }
            if (iB != -1) {
                this.f87483c = iB;
                return;
            }
            if (i11 > 0) {
                uVarArr[i11 - 1].moveToNextNode();
            }
            uVarArr[i11].reset(t.f87502e.getEMPTY$runtime().getBuffer$runtime(), 0);
        }
        this.f87484e = false;
    }

    public final int b(int i10) {
        u[] uVarArr = this.f87482b;
        if (uVarArr[i10].hasNextKey()) {
            return i10;
        }
        if (!uVarArr[i10].hasNextNode()) {
            return -1;
        }
        t tVarCurrentNode = uVarArr[i10].currentNode();
        if (i10 == 6) {
            uVarArr[i10 + 1].reset(tVarCurrentNode.getBuffer$runtime(), tVarCurrentNode.getBuffer$runtime().length);
        } else {
            uVarArr[i10 + 1].reset(tVarCurrentNode.getBuffer$runtime(), tVarCurrentNode.entryCount$runtime() * 2);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87484e;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = this.f87482b[this.f87483c].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
