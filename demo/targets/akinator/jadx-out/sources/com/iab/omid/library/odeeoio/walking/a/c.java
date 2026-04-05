package com.iab.omid.library.odeeoio.walking.a;

import com.iab.omid.library.odeeoio.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f31257a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f31258b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f31259c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f31260d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f31257a = linkedBlockingQueue;
        this.f31258b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f31259c.poll();
        this.f31260d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f31258b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f31259c.add(bVar);
        if (this.f31260d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.odeeoio.walking.a.b.a
    public void a(b bVar) {
        this.f31260d = null;
        a();
    }
}
