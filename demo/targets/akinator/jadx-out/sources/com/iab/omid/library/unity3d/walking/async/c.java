package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f31385a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f31386b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f31387c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f31388d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f31385a = linkedBlockingQueue;
        this.f31386b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f31387c.poll();
        this.f31388d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f31386b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f31387c.add(bVar);
        if (this.f31388d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.a
    public void a(b bVar) {
        this.f31388d = null;
        a();
    }
}
