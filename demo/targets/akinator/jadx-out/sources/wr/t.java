package wr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class t {
    static {
        new r();
    }

    public static j intercept(j jVar, q... qVarArr) {
        return intercept(jVar, (List<? extends q>) Arrays.asList(qVarArr));
    }

    public static j interceptForward(j jVar, q... qVarArr) {
        return interceptForward(jVar, (List<? extends q>) Arrays.asList(qVarArr));
    }

    public static j intercept(j jVar, List<? extends q> list) {
        mh.p1.checkNotNull(jVar, "channel");
        Iterator<? extends q> it = list.iterator();
        while (it.hasNext()) {
            jVar = new s(jVar, it.next());
        }
        return jVar;
    }

    public static j interceptForward(j jVar, List<? extends q> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return intercept(jVar, arrayList);
    }
}
