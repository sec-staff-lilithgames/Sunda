package com.iab.omid.library.appodeal.walking.async;

import com.iab.omid.library.appodeal.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f30469a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f30470b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f30471c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f30472d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f30469a = linkedBlockingQueue;
        this.f30470b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f30471c.poll();
        this.f30472d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f30470b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f30471c.add(bVar);
        if (this.f30472d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.a
    public void a(b bVar) {
        this.f30472d = null;
        a();
    }
}
