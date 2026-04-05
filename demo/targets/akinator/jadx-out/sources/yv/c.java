package yv;

import kotlin.jvm.internal.e0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {
    public static final v0 stripBody(v0 v0Var) {
        e0.checkNotNullParameter(v0Var, "<this>");
        return v0Var.newBuilder().body(new b(v0Var.body().contentType(), v0Var.body().contentLength())).build();
    }
}
