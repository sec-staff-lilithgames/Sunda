package kotlinx.coroutines;

import com.ironsource.C3191e4;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    public final String getString(String str) {
        StringBuilder sbO = g.o("List{", str, "}[");
        Object next = getNext();
        e0.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        boolean z10 = true;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !e0.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobNode) {
                if (z10) {
                    z10 = false;
                } else {
                    sbO.append(", ");
                }
                sbO.append(nextNode);
            }
        }
        sbO.append(C3191e4.i.f36531e);
        return sbO.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return super.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return this;
    }
}
