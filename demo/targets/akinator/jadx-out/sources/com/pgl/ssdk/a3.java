package com.pgl.ssdk;

import com.pgl.ssdk.a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a3<T extends a2> {

    /* renamed from: a, reason: collision with root package name */
    private int f50347a;

    /* renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f50348b = new LinkedBlockingQueue();

    private a3(int i10) {
        this.f50347a = i10;
    }

    public static a3 a(int i10) {
        return new a3(i10);
    }

    public T a() {
        return this.f50348b.poll();
    }
}
