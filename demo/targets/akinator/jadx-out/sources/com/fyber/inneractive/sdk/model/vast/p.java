package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends g {
    public static p c(Node node) throws NumberFormatException {
        p pVar = new p();
        super.b(node);
        w1.a(w1.d(node, "AdTitle"));
        w1.a(w1.d(node, "Description"));
        return pVar;
    }
}
