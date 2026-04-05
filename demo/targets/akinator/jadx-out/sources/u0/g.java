package u0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g extends e implements Iterator, lv.c {

    /* renamed from: f, reason: collision with root package name */
    public final f f87491f;

    /* renamed from: g, reason: collision with root package name */
    public Object f87492g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87493h;

    /* renamed from: i, reason: collision with root package name */
    public int f87494i;

    public g(f fVar, u[] uVarArr) {
        super(fVar.getNode$runtime(), uVarArr);
        this.f87491f = fVar;
        this.f87494i = fVar.getModCount$runtime();
    }

    public final void c(int i10, t tVar, Object obj, int i11) {
        int i12 = i11 * 5;
        u[] uVarArr = this.f87482b;
        if (i12 > 30) {
            uVarArr[i11].reset(tVar.getBuffer$runtime(), tVar.getBuffer$runtime().length, 0);
            while (!e0.areEqual(uVarArr[i11].currentKey(), obj)) {
                uVarArr[i11].moveToNextKey();
            }
            this.f87483c = i11;
            return;
        }
        int iIndexSegment = 1 << x.indexSegment(i10, i12);
        if (tVar.hasEntryAt$runtime(iIndexSegment)) {
            uVarArr[i11].reset(tVar.getBuffer$runtime(), tVar.entryCount$runtime() * 2, tVar.entryKeyIndex$runtime(iIndexSegment));
            this.f87483c = i11;
        } else {
            int iNodeIndex$runtime = tVar.nodeIndex$runtime(iIndexSegment);
            t tVarNodeAtIndex$runtime = tVar.nodeAtIndex$runtime(iNodeIndex$runtime);
            uVarArr[i11].reset(tVar.getBuffer$runtime(), tVar.entryCount$runtime() * 2, iNodeIndex$runtime);
            c(i10, tVarNodeAtIndex$runtime, obj, i11 + 1);
        }
    }

    @Override // u0.e, java.util.Iterator
    public Object next() {
        if (this.f87491f.getModCount$runtime() != this.f87494i) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f87492g = this.f87482b[this.f87483c].currentKey();
        this.f87493h = true;
        return super.next();
    }

    @Override // u0.e, java.util.Iterator
    public void remove() {
        if (!this.f87493h) {
            throw new IllegalStateException();
        }
        boolean zHasNext = hasNext();
        f fVar = this.f87491f;
        if (!zHasNext) {
            h1.asMutableMap(fVar).remove(this.f87492g);
        } else {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objCurrentKey = this.f87482b[this.f87483c].currentKey();
            h1.asMutableMap(fVar).remove(this.f87492g);
            c(objCurrentKey != null ? objCurrentKey.hashCode() : 0, fVar.getNode$runtime(), objCurrentKey, 0);
        }
        this.f87492g = null;
        this.f87493h = false;
        this.f87494i = fVar.getModCount$runtime();
    }

    public final void setValue(Object obj, Object obj2) {
        f fVar = this.f87491f;
        if (fVar.containsKey(obj)) {
            if (!hasNext()) {
                fVar.put(obj, obj2);
            } else {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object objCurrentKey = this.f87482b[this.f87483c].currentKey();
                fVar.put(obj, obj2);
                c(objCurrentKey != null ? objCurrentKey.hashCode() : 0, fVar.getNode$runtime(), objCurrentKey, 0);
            }
            this.f87494i = fVar.getModCount$runtime();
        }
    }
}
