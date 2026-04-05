package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z1 {
    public static y1 a(Object obj, Object obj2) {
        y1 y1Var = (y1) obj;
        y1 y1Var2 = (y1) obj2;
        if (y1Var2.isEmpty()) {
            return y1Var;
        }
        if (!y1Var.f26547a) {
            y1Var = y1Var.isEmpty() ? new y1() : new y1(y1Var);
        }
        if (!y1Var.f26547a) {
            throw new UnsupportedOperationException();
        }
        if (!y1Var2.isEmpty()) {
            y1Var.putAll(y1Var2);
        }
        return y1Var;
    }
}
