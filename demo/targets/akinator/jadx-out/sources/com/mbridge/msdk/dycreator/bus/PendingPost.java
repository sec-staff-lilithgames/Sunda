package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class PendingPost {

    /* renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f40178d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f40179a;

    /* renamed from: b, reason: collision with root package name */
    Subscription f40180b;

    /* renamed from: c, reason: collision with root package name */
    PendingPost f40181c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f40179a = obj;
        this.f40180b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f40178d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f40179a = obj;
                pendingPostRemove.f40180b = subscription;
                pendingPostRemove.f40181c = null;
                return pendingPostRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f40179a = null;
        pendingPost.f40180b = null;
        pendingPost.f40181c = null;
        List<PendingPost> list = f40178d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
