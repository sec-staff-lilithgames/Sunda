package rv;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterable f85044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f85045b;

    public m0(Iterable iterable, t tVar) {
        this.f85044a = iterable;
        this.f85045b = tVar;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        Collection collectionConvertToListIfNotCollection = uu.v0.convertToListIfNotCollection(this.f85044a);
        boolean zIsEmpty = collectionConvertToListIfNotCollection.isEmpty();
        t tVar = this.f85045b;
        return zIsEmpty ? tVar.iterator() : f0.filterNot(tVar, new b1.e0(2, collectionConvertToListIfNotCollection)).iterator();
    }
}
