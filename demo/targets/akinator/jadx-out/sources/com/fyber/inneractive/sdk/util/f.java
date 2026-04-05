package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f26774b = new f();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f26775a = new ConcurrentLinkedQueue();

    public f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f26775a.offer(ByteBuffer.allocateDirect(16384));
        }
    }
}
