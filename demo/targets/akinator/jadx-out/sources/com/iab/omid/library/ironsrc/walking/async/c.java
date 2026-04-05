package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f31005a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f31006b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f31007c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f31008d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f31005a = linkedBlockingQueue;
        this.f31006b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f31007c.poll();
        this.f31008d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f31006b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f31007c.add(bVar);
        if (this.f31008d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.a
    public void a(b bVar) {
        this.f31008d = null;
        a();
    }
}
