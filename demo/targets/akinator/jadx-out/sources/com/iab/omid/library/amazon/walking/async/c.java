package com.iab.omid.library.amazon.walking.async;

import com.iab.omid.library.amazon.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f30198a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f30199b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f30200c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f30201d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f30198a = linkedBlockingQueue;
        this.f30199b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f30200c.poll();
        this.f30201d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f30199b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f30200c.add(bVar);
        if (this.f30201d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.amazon.walking.async.b.a
    public void a(b bVar) {
        this.f30201d = null;
        a();
    }
}
