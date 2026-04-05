package zd;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.p f97807a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f97808b;

    public c(com.google.android.exoplayer2.util.p pVar, SparseArray<b> sparseArray) {
        this.f97807a = pVar;
        SparseArray sparseArray2 = new SparseArray(pVar.size());
        for (int i10 = 0; i10 < pVar.size(); i10++) {
            int i11 = pVar.get(i10);
            sparseArray2.append(i11, (b) com.google.android.exoplayer2.util.a.checkNotNull(sparseArray.get(i11)));
        }
        this.f97808b = sparseArray2;
    }

    public boolean contains(int i10) {
        return this.f97807a.contains(i10);
    }

    public boolean containsAny(int... iArr) {
        return this.f97807a.containsAny(iArr);
    }

    public int get(int i10) {
        return this.f97807a.get(i10);
    }

    public b getEventTime(int i10) {
        return (b) com.google.android.exoplayer2.util.a.checkNotNull((b) this.f97808b.get(i10));
    }

    public int size() {
        return this.f97807a.size();
    }
}
