package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f30333a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f30334b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f30335c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f30336d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f30333a = linkedBlockingQueue;
        this.f30334b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f30335c.poll();
        this.f30336d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f30334b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f30335c.add(bVar);
        if (this.f30336d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.f30336d = null;
        a();
    }
}
