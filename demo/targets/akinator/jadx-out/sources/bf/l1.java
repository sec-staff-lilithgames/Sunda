package bf;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public int f9309a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f9310b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.h f9311c;

    public l1() {
        this(new a2.o(11));
    }

    public void appendSpan(int i10, Object obj) {
        int i11 = this.f9309a;
        SparseArray sparseArray = this.f9310b;
        if (i11 == -1) {
            com.google.android.exoplayer2.util.a.checkState(sparseArray.size() == 0);
            this.f9309a = 0;
        }
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.google.android.exoplayer2.util.a.checkArgument(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                this.f9311c.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i10, obj);
    }

    public void clear() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f9310b;
            if (i10 >= sparseArray.size()) {
                this.f9309a = -1;
                sparseArray.clear();
                return;
            } else {
                this.f9311c.accept(sparseArray.valueAt(i10));
                i10++;
            }
        }
    }

    public void discardFrom(int i10) {
        SparseArray sparseArray = this.f9310b;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            this.f9311c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        this.f9309a = sparseArray.size() > 0 ? Math.min(this.f9309a, sparseArray.size() - 1) : -1;
    }

    public void discardTo(int i10) {
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f9310b;
            if (i11 >= sparseArray.size() - 1) {
                return;
            }
            int i12 = i11 + 1;
            if (i10 < sparseArray.keyAt(i12)) {
                return;
            }
            this.f9311c.accept(sparseArray.valueAt(i11));
            sparseArray.removeAt(i11);
            int i13 = this.f9309a;
            if (i13 > 0) {
                this.f9309a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object get(int i10) {
        SparseArray sparseArray;
        if (this.f9309a == -1) {
            this.f9309a = 0;
        }
        while (true) {
            int i11 = this.f9309a;
            sparseArray = this.f9310b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f9309a--;
        }
        while (this.f9309a < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f9309a + 1)) {
            this.f9309a++;
        }
        return sparseArray.valueAt(this.f9309a);
    }

    public Object getEndValue() {
        return this.f9310b.valueAt(r0.size() - 1);
    }

    public boolean isEmpty() {
        return this.f9310b.size() == 0;
    }

    public l1(com.google.android.exoplayer2.util.h hVar) {
        this.f9310b = new SparseArray();
        this.f9311c = hVar;
        this.f9309a = -1;
    }
}
