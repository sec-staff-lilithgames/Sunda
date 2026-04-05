package com.mbridge.msdk.dycreator.bus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class PendingPostQueue {

    /* renamed from: a, reason: collision with root package name */
    private PendingPost f40182a;

    /* renamed from: b, reason: collision with root package name */
    private PendingPost f40183b;

    public synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f40183b;
            if (pendingPost2 != null) {
                pendingPost2.f40181c = pendingPost;
                this.f40183b = pendingPost;
            } else {
                if (this.f40182a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f40183b = pendingPost;
                this.f40182a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f40182a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f40181c;
            this.f40182a = pendingPost2;
            if (pendingPost2 == null) {
                this.f40183b = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost a(int i10) throws InterruptedException {
        try {
            if (this.f40182a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a();
    }
}
