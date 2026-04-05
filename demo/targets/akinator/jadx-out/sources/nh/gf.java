package nh;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class gf extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf f76304e;

    public gf(hf hfVar) {
        this.f76304e = hfVar;
    }

    @Override // java.util.List
    public Map.Entry<Object, Object> get(int i10) {
        hf hfVar = this.f76304e;
        mh.p1.checkElementIndex(i10, hfVar.f76337h);
        Object[] objArr = hfVar.f76335f;
        int i11 = i10 * 2;
        int i12 = hfVar.f76336g;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // nh.u4
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76304e.f76337h;
    }
}
