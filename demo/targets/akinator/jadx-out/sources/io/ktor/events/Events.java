package io.ktor.events;

import io.ktor.util.collections.CopyOnWriteHashMap;
import io.ktor.util.internal.LockFreeLinkedListHead;
import io.ktor.util.internal.LockFreeLinkedListNode;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.h1;
import kotlinx.coroutines.DisposableHandle;
import kv.l;
import tu.h;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Events {
    private final CopyOnWriteHashMap<EventDefinition<?>, LockFreeLinkedListHead> handlers = new CopyOnWriteHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class HandlerRegistration extends LockFreeLinkedListNode implements DisposableHandle {
        private final l handler;

        public HandlerRegistration(l handler) {
            e0.checkNotNullParameter(handler, "handler");
            this.handler = handler;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            remove();
        }

        public final l getHandler() {
            return this.handler;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.events.Events$subscribe$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final LockFreeLinkedListHead invoke(EventDefinition<?> it) {
            e0.checkNotNullParameter(it, "it");
            return new LockFreeLinkedListHead();
        }
    }

    public final <T> void raise(EventDefinition<T> definition, T t10) {
        x0 x0Var;
        e0.checkNotNullParameter(definition, "definition");
        LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        Throwable th2 = null;
        if (lockFreeLinkedListHead != null) {
            Object next = lockFreeLinkedListHead.getNext();
            e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            Throwable th3 = null;
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !e0.areEqual(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof HandlerRegistration) {
                    try {
                        l handler = ((HandlerRegistration) nextNode).getHandler();
                        e0.checkNotNull(handler, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise$lambda$2, kotlin.Unit>{ io.ktor.events.EventsKt.EventHandler<T of io.ktor.events.Events.raise$lambda$2> }");
                        ((l) h1.beforeCheckcastToFunctionOfArity(handler, 1)).invoke(t10);
                    } catch (Throwable th4) {
                        if (th3 != null) {
                            h.addSuppressed(th3, th4);
                            x0Var = x0.f87415a;
                        } else {
                            x0Var = null;
                        }
                        if (x0Var == null) {
                            th3 = th4;
                        }
                    }
                }
            }
            th2 = th3;
        }
        if (th2 != null) {
            throw th2;
        }
    }

    public final <T> DisposableHandle subscribe(EventDefinition<T> definition, l handler) {
        e0.checkNotNullParameter(definition, "definition");
        e0.checkNotNullParameter(handler, "handler");
        HandlerRegistration handlerRegistration = new HandlerRegistration(handler);
        this.handlers.computeIfAbsent(definition, AnonymousClass1.INSTANCE).addLast(handlerRegistration);
        return handlerRegistration;
    }

    public final <T> void unsubscribe(EventDefinition<T> definition, l handler) {
        e0.checkNotNullParameter(definition, "definition");
        e0.checkNotNullParameter(handler, "handler");
        LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        if (lockFreeLinkedListHead != null) {
            Object next = lockFreeLinkedListHead.getNext();
            e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !e0.areEqual(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof HandlerRegistration) {
                    HandlerRegistration handlerRegistration = (HandlerRegistration) nextNode;
                    if (e0.areEqual(handlerRegistration.getHandler(), handler)) {
                        handlerRegistration.remove();
                    }
                }
            }
        }
    }

    private static /* synthetic */ void getHandlers$annotations() {
    }
}
