package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends PriorityQueue {

    /* renamed from: a, reason: collision with root package name */
    public final int f23159a;

    public k(int i10) {
        super(1, new l());
        this.f23159a = i10;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(g gVar) {
        boolean zAdd = super.add((k) gVar);
        if (size() > this.f23159a) {
            poll();
        }
        return zAdd;
    }
}
