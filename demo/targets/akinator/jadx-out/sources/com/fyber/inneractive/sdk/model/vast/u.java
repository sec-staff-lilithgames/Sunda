package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public String f24142a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f24143b;

    public static u a(Node node) {
        f fVar;
        u uVar = new u();
        uVar.f24142a = w1.b(node, "version");
        ArrayList arrayListC = w1.c(node, "Ad");
        if (!arrayListC.isEmpty()) {
            uVar.f24143b = new ArrayList();
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    fVar = null;
                } else {
                    f fVar2 = new f();
                    fVar2.f24099a = w1.b(node2, "id");
                    Node nodeD = w1.d(node2, "Wrapper");
                    if (nodeD != null) {
                        fVar2.f24100b = a0.c(nodeD);
                    }
                    Node nodeD2 = w1.d(node2, "InLine");
                    if (nodeD2 != null) {
                        fVar2.f24101c = p.c(nodeD2);
                    }
                    fVar = fVar2;
                }
                uVar.f24143b.add(fVar);
            }
        }
        return uVar;
    }

    public final String toString() {
        return new StringBuilder(o2.o(new StringBuilder("Vast: version - "), this.f24142a, "\nAds: ")).toString();
    }
}
