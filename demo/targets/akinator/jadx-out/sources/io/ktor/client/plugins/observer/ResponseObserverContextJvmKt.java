package io.ktor.client.plugins.observer;

import kotlinx.coroutines.slf4j.MDCContext;
import zu.d;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ResponseObserverContextJvmKt {
    public static final Object getResponseObserverContext(d<? super m> dVar) {
        MDCContext mDCContext = (MDCContext) dVar.getContext().get(MDCContext.Key);
        return mDCContext != null ? mDCContext : n.f98854b;
    }
}
