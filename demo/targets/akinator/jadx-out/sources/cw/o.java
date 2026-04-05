package cw;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class o {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<InetAddress> reorderForHappyEyeballs(List<? extends InetAddress> addresses) {
        kotlin.jvm.internal.e0.checkNotNullParameter(addresses, "addresses");
        if (addresses.size() < 2) {
            return addresses;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : addresses) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        tu.v vVar = new tu.v(arrayList, arrayList2);
        List list = (List) vVar.component1();
        List list2 = (List) vVar.component2();
        return (list.isEmpty() || list2.isEmpty()) ? addresses : yv.h.interleave(list, list2);
    }
}
