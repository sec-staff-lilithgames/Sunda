package com.moloco.sdk.internal.error;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {
    public static /* synthetic */ void a(c cVar, String str, a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
        }
        if ((i10 & 2) != 0) {
            aVar = new a(null, 1, null);
        }
        cVar.a(str, aVar);
    }
}
