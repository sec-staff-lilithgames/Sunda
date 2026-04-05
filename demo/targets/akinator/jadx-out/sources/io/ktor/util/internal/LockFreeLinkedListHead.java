package io.ktor.util.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class LockFreeLinkedListHead extends LockFreeLinkedListNode {
    @Override // io.ktor.util.internal.LockFreeLinkedListNode
    public /* bridge */ /* synthetic */ AtomicDesc describeRemove() {
        return (AtomicDesc) m4300describeRemove();
    }

    public final /* synthetic */ <T extends LockFreeLinkedListNode> void forEach(l block) {
        e0.checkNotNullParameter(block, "block");
        Object next = getNext();
        e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !e0.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            if (nextNode != null) {
                block.invoke(nextNode);
            }
        }
    }

    public final boolean isEmpty() {
        return getNext() == this;
    }

    @Override // io.ktor.util.internal.LockFreeLinkedListNode
    public final boolean remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.ktor.util.internal.LockFreeLinkedListNode] */
    public final void validate$ktor_utils() {
        Object next = getNext();
        e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListHead lockFreeLinkedListHead = this;
        LockFreeLinkedListHead lockFreeLinkedListHead2 = (LockFreeLinkedListNode) next;
        while (!e0.areEqual(lockFreeLinkedListHead2, this)) {
            LockFreeLinkedListNode nextNode = lockFreeLinkedListHead2.getNextNode();
            lockFreeLinkedListHead2.validateNode$ktor_utils(lockFreeLinkedListHead, nextNode);
            lockFreeLinkedListHead = lockFreeLinkedListHead2;
            lockFreeLinkedListHead2 = nextNode;
        }
        Object next2 = getNext();
        e0.checkNotNull(next2, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
        validateNode$ktor_utils(lockFreeLinkedListHead, (LockFreeLinkedListNode) next2);
    }

    /* renamed from: describeRemove, reason: collision with other method in class */
    public final Void m4300describeRemove() {
        throw new UnsupportedOperationException();
    }
}
