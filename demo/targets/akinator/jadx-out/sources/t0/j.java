package t0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tv.Mu.QpyI;
import uu.f0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class j extends b implements s0.d {

    /* renamed from: e, reason: collision with root package name */
    public static final a f86242e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final j f86243f = new j(new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f86244c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(u uVar) {
        }

        public final j getEMPTY() {
            return j.f86243f;
        }
    }

    public j(Object[] objArr) {
        this.f86244c = objArr;
        y0.a.m8013assert(objArr.length <= 32);
    }

    @Override // t0.b, java.util.Collection, java.util.List, s0.j, s0.h
    public /* bridge */ /* synthetic */ s0.h addAll(Collection collection) {
        return addAll((Collection<Object>) collection);
    }

    @Override // uu.g, java.util.List
    public Object get(int i10) {
        y0.d.checkElementIndex$runtime(i10, size());
        return this.f86244c[i10];
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f86244c.length;
    }

    @Override // uu.g, java.util.List
    public int indexOf(Object obj) {
        return k0.indexOf(this.f86244c, obj);
    }

    @Override // uu.g, java.util.List
    public int lastIndexOf(Object obj) {
        return k0.lastIndexOf(this.f86244c, obj);
    }

    @Override // uu.g, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        y0.d.checkPositionIndex$runtime(i10, size());
        return new c(this.f86244c, i10, size());
    }

    @Override // t0.b, s0.j
    public s0.j removeAt(int i10) {
        y0.d.checkElementIndex$runtime(i10, size());
        if (size() == 1) {
            return f86243f;
        }
        int size = size() - 1;
        Object[] objArr = this.f86244c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        f0.copyInto(objArr, objArrCopyOf, i10, i10 + 1, size());
        return new j(objArrCopyOf);
    }

    @Override // t0.b, uu.g, java.util.List, s0.j
    public s0.j set(int i10, Object obj) {
        y0.d.checkElementIndex$runtime(i10, size());
        Object[] objArr = this.f86244c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new j(objArrCopyOf);
    }

    @Override // t0.b, java.util.Collection, java.util.List, s0.j, s0.h
    public s0.j add(Object obj) {
        int size = size();
        Object[] objArr = this.f86244c;
        if (size >= 32) {
            return new e(objArr, l.presizedBufferWith(obj), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = obj;
        return new j(objArrCopyOf);
    }

    @Override // t0.b, java.util.Collection, java.util.List, s0.j, s0.h
    public s0.j addAll(Collection<Object> collection) {
        if (collection.size() + size() > 32) {
            s0.i iVarBuilder = builder();
            iVarBuilder.addAll(collection);
            return iVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f86244c, collection.size() + size());
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new j(objArrCopyOf);
    }

    @Override // t0.b, s0.j, s0.h
    public s0.i builder() {
        return new f(this, null, this.f86244c, 0);
    }

    @Override // t0.b, s0.j, s0.h
    public s0.j removeAll(kv.l lVar) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f86244c;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    e0.checkNotNullExpressionValue(objArrCopyOf, QpyI.ecHKfsLBt);
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f86243f : new j(f0.copyOfRange(objArrCopyOf, 0, size));
    }

    @Override // t0.b, java.util.List, s0.j
    public s0.j add(int i10, Object obj) {
        y0.d.checkPositionIndex$runtime(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        int size = size();
        Object[] objArr = this.f86244c;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            f0.copyInto$default(this.f86244c, objArr2, 0, 0, i10, 6, (Object) null);
            f0.copyInto(objArr, objArr2, i10 + 1, i10, size());
            objArr2[i10] = obj;
            return new j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        f0.copyInto(objArr, objArrCopyOf, i10 + 1, i10, size() - 1);
        objArrCopyOf[i10] = obj;
        return new e(objArrCopyOf, l.presizedBufferWith(objArr[31]), size() + 1, 0);
    }

    @Override // t0.b, java.util.List, s0.j
    public s0.j addAll(int i10, Collection<Object> collection) {
        y0.d.checkPositionIndex$runtime(i10, size());
        if (collection.size() + size() <= 32) {
            Object[] objArr = new Object[collection.size() + size()];
            int i11 = i10;
            f0.copyInto$default(this.f86244c, objArr, 0, 0, i11, 6, (Object) null);
            f0.copyInto(this.f86244c, objArr, collection.size() + i11, i11, size());
            Iterator<Object> it = collection.iterator();
            while (it.hasNext()) {
                objArr[i11] = it.next();
                i11++;
            }
            return new j(objArr);
        }
        s0.i iVarBuilder = builder();
        iVarBuilder.addAll(i10, collection);
        return iVarBuilder.build();
    }
}
