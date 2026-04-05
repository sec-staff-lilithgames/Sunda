package io.ktor.events;

import bx.a;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class EventsKt {
    public static final <T> void raiseCatching(Events events, EventDefinition<T> definition, T t10, a aVar) {
        e0.checkNotNullParameter(events, "<this>");
        e0.checkNotNullParameter(definition, "definition");
        try {
            events.raise(definition, t10);
        } catch (Throwable th2) {
            if (aVar != null) {
                aVar.error("Some handlers have thrown an exception", th2);
            }
        }
    }

    public static /* synthetic */ void raiseCatching$default(Events events, EventDefinition eventDefinition, Object obj, a aVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        raiseCatching(events, eventDefinition, obj, aVar);
    }
}
