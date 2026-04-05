package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f31520a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f31521b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f31522c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f31523d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f31520a = linkedBlockingQueue;
        this.f31521b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f31522c.poll();
        this.f31523d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f31521b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f31522c.add(bVar);
        if (this.f31523d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.a
    public void a(b bVar) {
        this.f31523d = null;
        a();
    }
}
