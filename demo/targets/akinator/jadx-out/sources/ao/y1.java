package ao;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7905a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f7906b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.k f7907c;

    public y1() {
        this(new a2.o(8));
    }

    public void appendSpan(int i10, Object obj) {
        int i11 = this.f7905a;
        SparseArray sparseArray = this.f7906b;
        if (i11 == -1) {
            io.bidmachine.media3.common.util.a.checkState(sparseArray.size() == 0);
            this.f7905a = 0;
        }
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            io.bidmachine.media3.common.util.a.checkArgument(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                this.f7907c.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i10, obj);
    }

    public void clear() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f7906b;
            if (i10 >= sparseArray.size()) {
                this.f7905a = -1;
                sparseArray.clear();
                return;
            } else {
                this.f7907c.accept(sparseArray.valueAt(i10));
                i10++;
            }
        }
    }

    public void discardFrom(int i10) {
        SparseArray sparseArray = this.f7906b;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            this.f7907c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        this.f7905a = sparseArray.size() > 0 ? Math.min(this.f7905a, sparseArray.size() - 1) : -1;
    }

    public void discardTo(int i10) {
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f7906b;
            if (i11 >= sparseArray.size() - 1) {
                return;
            }
            int i12 = i11 + 1;
            if (i10 < sparseArray.keyAt(i12)) {
                return;
            }
            this.f7907c.accept(sparseArray.valueAt(i11));
            sparseArray.removeAt(i11);
            int i13 = this.f7905a;
            if (i13 > 0) {
                this.f7905a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object get(int i10) {
        SparseArray sparseArray;
        if (this.f7905a == -1) {
            this.f7905a = 0;
        }
        while (true) {
            int i11 = this.f7905a;
            sparseArray = this.f7906b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f7905a--;
        }
        while (this.f7905a < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f7905a + 1)) {
            this.f7905a++;
        }
        return sparseArray.valueAt(this.f7905a);
    }

    public Object getEndValue() {
        return this.f7906b.valueAt(r0.size() - 1);
    }

    public boolean isEmpty() {
        return this.f7906b.size() == 0;
    }

    public y1(io.bidmachine.media3.common.util.k kVar) {
        this.f7906b = new SparseArray();
        this.f7907c = kVar;
        this.f7905a = -1;
    }
}
