package kotlinx.coroutines.internal;

import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class LockFreeLinkedListHead extends LockFreeLinkedListNode {
    public final void forEach(l lVar) {
        Object next = getNext();
        e0.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !e0.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            lVar.invoke(nextNode);
        }
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean isRemoved() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* renamed from: remove, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo5196remove() {
        return ((Boolean) remove()).booleanValue();
    }

    public final Void remove() {
        throw new IllegalStateException("head cannot be removed");
    }
}
