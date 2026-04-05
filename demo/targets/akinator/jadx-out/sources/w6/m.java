package w6;

import androidx.lifecycle.l1;
import androidx.lifecycle.r1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {
    public static <In, Out> l1 dedupedMappedLiveDataFor(l1 l1Var, t.a aVar, x6.b bVar) {
        Object obj = new Object();
        r1 r1Var = new r1();
        r1Var.addSource(l1Var, new l(bVar, obj, aVar, r1Var));
        return r1Var;
    }
}
