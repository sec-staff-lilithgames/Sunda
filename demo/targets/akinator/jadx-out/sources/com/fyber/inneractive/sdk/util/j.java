package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f26782a = new ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    public final i f26783b;

    public j(int i10, i iVar) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f26782a.offer(iVar.a());
        }
        this.f26783b = iVar;
    }
}
