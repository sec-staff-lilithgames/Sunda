package zc;

import ad.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m {
    @Deprecated
    public abstract c findFilter(Object obj);

    public o findPropertyFilter(Object obj, Object obj2) {
        c cVarFindFilter = findFilter(obj);
        if (cVarFindFilter == null) {
            return null;
        }
        return y.from(cVarFindFilter);
    }
}
