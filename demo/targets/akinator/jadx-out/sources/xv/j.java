package xv;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface j extends Cloneable {
    void cancel();

    /* renamed from: clone */
    j mo3679clone();

    void enqueue(k kVar);

    v0 execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    o0 request();

    pw.d1 timeout();
}
