package com.mbridge.msdk.dycreator.bus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f40190a;

    /* renamed from: b, reason: collision with root package name */
    final SubscriberMethod f40191b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f40190a = obj;
        this.f40191b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f40190a == subscription.f40190a && this.f40191b.equals(subscription.f40191b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f40191b.f40187d.hashCode() + this.f40190a.hashCode();
    }
}
