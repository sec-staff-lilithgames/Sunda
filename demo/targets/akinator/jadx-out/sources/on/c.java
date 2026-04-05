package on;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final gn.v f79589a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f79590b;

    public c(gn.v vVar, SparseArray<b> sparseArray) {
        this.f79589a = vVar;
        SparseArray sparseArray2 = new SparseArray(vVar.size());
        for (int i10 = 0; i10 < vVar.size(); i10++) {
            int i11 = vVar.get(i10);
            sparseArray2.append(i11, (b) io.bidmachine.media3.common.util.a.checkNotNull(sparseArray.get(i11)));
        }
        this.f79590b = sparseArray2;
    }

    public boolean contains(int i10) {
        return this.f79589a.contains(i10);
    }

    public boolean containsAny(int... iArr) {
        return this.f79589a.containsAny(iArr);
    }

    public int get(int i10) {
        return this.f79589a.get(i10);
    }

    public b getEventTime(int i10) {
        return (b) io.bidmachine.media3.common.util.a.checkNotNull((b) this.f79590b.get(i10));
    }

    public int size() {
        return this.f79589a.size();
    }
}
