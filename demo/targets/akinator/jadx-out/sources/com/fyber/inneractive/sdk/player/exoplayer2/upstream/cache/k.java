package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f25905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f25906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.f25906b = lVar;
        this.f25905a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f25906b) {
            this.f25905a.open();
            try {
                l.a(this.f25906b);
            } catch (a e10) {
                this.f25906b.f25912f = e10;
            }
            this.f25906b.f25908b.getClass();
        }
    }
}
