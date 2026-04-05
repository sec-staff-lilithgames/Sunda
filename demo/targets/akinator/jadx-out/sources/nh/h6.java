package nh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f76322a = new ArrayList();

    public h6 add(ze zeVar) {
        mh.p1.checkArgument(!zeVar.isEmpty(), "range must not be empty, but was %s", zeVar);
        this.f76322a.add(zeVar);
        return this;
    }

    public h6 addAll(af afVar) {
        return addAll(afVar.asRanges());
    }

    public j6 build() {
        ArrayList arrayList = this.f76322a;
        x4 x4Var = new x4(arrayList.size());
        ze zeVar = ze.f76826e;
        Collections.sort(arrayList, ye.f76795b);
        xe xeVarPeekingIterator = z7.peekingIterator(arrayList.iterator());
        while (true) {
            x7 x7Var = (x7) xeVarPeekingIterator;
            if (!x7Var.hasNext()) {
                break;
            }
            ze zeVarSpan = (ze) x7Var.next();
            while (x7Var.hasNext()) {
                ze zeVar2 = (ze) x7Var.peek();
                if (zeVarSpan.isConnected(zeVar2)) {
                    mh.p1.checkArgument(zeVarSpan.intersection(zeVar2).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", zeVarSpan, zeVar2);
                    zeVarSpan = zeVarSpan.span((ze) x7Var.next());
                }
            }
            x4Var.add((Object) zeVarSpan);
        }
        b5 b5VarBuild = x4Var.build();
        return b5VarBuild.isEmpty() ? j6.of() : (b5VarBuild.size() == 1 && ((ze) i7.getOnlyElement(b5VarBuild)).equals(ze.all())) ? j6.f76387g : new j6(b5VarBuild, null);
    }

    public h6 addAll(Iterable<ze> iterable) {
        Iterator<ze> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }
}
