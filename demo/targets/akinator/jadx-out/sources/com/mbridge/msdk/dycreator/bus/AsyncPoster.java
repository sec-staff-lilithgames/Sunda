package com.mbridge.msdk.dycreator.bus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class AsyncPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f40149a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private final EventBus f40150b;

    public AsyncPoster(EventBus eventBus) {
        this.f40150b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f40149a.a(PendingPost.a(subscription, obj));
        EventBus.f40154n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f40149a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f40150b.a(pendingPostA);
    }
}
