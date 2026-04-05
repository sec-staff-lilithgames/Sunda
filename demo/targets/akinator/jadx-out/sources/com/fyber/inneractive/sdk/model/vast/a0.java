package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 extends g {

    /* renamed from: i, reason: collision with root package name */
    public String f24069i;

    public a0() {
        this.f24107f = 1;
    }

    public static a0 c(Node node) throws NumberFormatException {
        a0 a0Var = new a0();
        super.b(node);
        a0Var.f24069i = w1.a(w1.d(node, "VASTAdTagURI"));
        return a0Var;
    }
}
