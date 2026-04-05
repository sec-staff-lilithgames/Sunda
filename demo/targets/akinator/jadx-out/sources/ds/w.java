package ds;

import java.util.concurrent.atomic.AtomicReference;
import wr.e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class w {
    public static wr.q newAttachHeadersInterceptor(e4 e4Var) {
        return new s(e4Var);
    }

    public static wr.q newCaptureMetadataInterceptor(AtomicReference<e4> atomicReference, AtomicReference<e4> atomicReference2) {
        return new v(atomicReference, atomicReference2);
    }
}
