package ar;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b extends a implements d {
    public b(List<d> list) {
        super(list);
    }

    @Override // ar.d
    public String prepareCreativeForMeasure(String str) {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            str = ((d) it.next()).prepareCreativeForMeasure(str);
        }
        return str;
    }
}
