package io.bidmachine.iab.vast;

import android.os.Bundle;
import em.n0;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f60566a;

    static {
        n0 n0Var = new n0();
        n0Var.add(new xm.a());
        f60566a = n0Var;
    }

    public static String processUrl(String str, Bundle bundle) {
        if (str == null) {
            return null;
        }
        Iterator it = f60566a.iterator();
        while (it.hasNext()) {
            str = ((xm.b) it.next()).prepare(str, bundle);
        }
        return str;
    }

    public static void processUrls(List<String> list, Bundle bundle, x xVar) {
        if (list == null || list.isEmpty() || xVar == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ((r) xVar).onUrlReady(processUrl(it.next(), bundle));
        }
    }

    public static void register(xm.b bVar) {
        f60566a.add(bVar);
    }

    public static void unregister(xm.b bVar) {
        f60566a.remove(bVar);
    }
}
