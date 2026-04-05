package com.mbridge.msdk.dycreator.bus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class SubscriberExceptionEvent {
    public final Object causingEvent;
    public final Object causingSubscriber;
    public final EventBus eventBus;
    public final Throwable throwable;

    public SubscriberExceptionEvent(EventBus eventBus, Throwable th2, Object obj, Object obj2) {
        this.eventBus = eventBus;
        this.throwable = th2;
        this.causingEvent = obj;
        this.causingSubscriber = obj2;
    }
}
