package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f30598a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f30599b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f30600c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f30601d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f30598a = linkedBlockingQueue;
        this.f30599b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f30600c.poll();
        this.f30601d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f30599b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f30600c.add(bVar);
        if (this.f30601d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.a
    public void a(b bVar) {
        this.f30601d = null;
        a();
    }
}
