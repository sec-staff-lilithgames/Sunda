package jn;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final long f69726b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f69727c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f69728d;

    public c(int i10, long j10) {
        super(i10);
        this.f69726b = j10;
        this.f69727c = new ArrayList();
        this.f69728d = new ArrayList();
    }

    public void add(d dVar) {
        this.f69727c.add(dVar);
    }

    public c getContainerBoxOfType(int i10) {
        ArrayList arrayList = this.f69728d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) arrayList.get(i11);
            if (cVar.f69730a == i10) {
                return cVar;
            }
        }
        return null;
    }

    public d getLeafBoxOfType(int i10) {
        ArrayList arrayList = this.f69727c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar.f69730a == i10) {
                return dVar;
            }
        }
        return null;
    }

    @Override // jn.e
    public String toString() {
        return e.getBoxTypeString(this.f69730a) + " leaves: " + Arrays.toString(this.f69727c.toArray()) + " containers: " + Arrays.toString(this.f69728d.toArray());
    }

    public void add(c cVar) {
        this.f69728d.add(cVar);
    }
}
