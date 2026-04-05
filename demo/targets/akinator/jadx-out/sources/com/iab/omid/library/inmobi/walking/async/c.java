package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f30870a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f30871b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f30872c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f30873d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f30870a = linkedBlockingQueue;
        this.f30871b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f30872c.poll();
        this.f30873d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f30871b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f30872c.add(bVar);
        if (this.f30873d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.a
    public void a(b bVar) {
        this.f30873d = null;
        a();
    }
}
