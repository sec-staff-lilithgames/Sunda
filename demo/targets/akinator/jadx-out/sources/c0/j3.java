package c0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j3 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11515a;

    public j3(v vVar, float f10, float f11) {
        qv.m mVarUntil = qv.v.until(0, vVar.getSize$animation_core_release());
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(mVarUntil, 10));
        Iterator it = mVarUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(new n0(f10, f11, vVar.get$animation_core_release(((uu.j1) it).nextInt())));
        }
        this.f11515a = arrayList;
    }

    @Override // c0.x
    public n0 get(int i10) {
        return (n0) this.f11515a.get(i10);
    }
}
