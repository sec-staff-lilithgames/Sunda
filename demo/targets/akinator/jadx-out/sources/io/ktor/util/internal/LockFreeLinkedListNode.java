package io.ktor.util.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kv.a;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class LockFreeLinkedListNode {
    static final /* synthetic */ AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");
    static final /* synthetic */ AtomicReferenceFieldUpdater _prev$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _removedRef$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class AbstractAtomicDesc extends AtomicDesc {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PrepareOp extends OpDescriptor {
            public final AbstractAtomicDesc desc;
            public final LockFreeLinkedListNode next;

            /* renamed from: op, reason: collision with root package name */
            public final AtomicOp<LockFreeLinkedListNode> f62180op;

            /* JADX WARN: Multi-variable type inference failed */
            public PrepareOp(LockFreeLinkedListNode next, AtomicOp<? super LockFreeLinkedListNode> op2, AbstractAtomicDesc desc) {
                e0.checkNotNullParameter(next, "next");
                e0.checkNotNullParameter(op2, "op");
                e0.checkNotNullParameter(desc, "desc");
                this.next = next;
                this.f62180op = op2;
                this.desc = desc;
            }

            @Override // io.ktor.util.internal.OpDescriptor
            public Object perform(Object obj) {
                e0.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                Object objOnPrepare = this.desc.onPrepare(lockFreeLinkedListNode, this.next);
                if (objOnPrepare == null) {
                    Object obj2 = this.f62180op.isDecided() ? this.next : this.f62180op;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, obj2) && atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == this) {
                    }
                    return null;
                }
                if (objOnPrepare == LockFreeLinkedListKt.REMOVE_PREPARED) {
                    Removed removed = this.next.removed();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode._next$FU;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, this, removed)) {
                        if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) != this) {
                            return objOnPrepare;
                        }
                    }
                    lockFreeLinkedListNode.helpDelete();
                    return objOnPrepare;
                }
                this.f62180op.tryDecide(objOnPrepare);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LockFreeLinkedListNode._next$FU;
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.next;
                while (!atomicReferenceFieldUpdater3.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2)) {
                    if (atomicReferenceFieldUpdater3.get(lockFreeLinkedListNode) != this) {
                        return objOnPrepare;
                    }
                }
                return objOnPrepare;
            }
        }

        @Override // io.ktor.util.internal.AtomicDesc
        public final void complete(AtomicOp<?> op2, Object obj) {
            e0.checkNotNullParameter(op2, "op");
            boolean z10 = obj == null;
            LockFreeLinkedListNode affectedNode = getAffectedNode();
            if (affectedNode == null) {
                if (z10) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            LockFreeLinkedListNode originalNext = getOriginalNext();
            if (originalNext == null) {
                if (z10) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            Object objUpdatedNext = z10 ? updatedNext(affectedNode, originalNext) : originalNext;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(affectedNode, op2, objUpdatedNext)) {
                if (atomicReferenceFieldUpdater.get(affectedNode) != op2) {
                    return;
                }
            }
            if (z10) {
                finishOnSuccess(affectedNode, originalNext);
            }
        }

        public Object failure(LockFreeLinkedListNode affected, Object next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            return null;
        }

        public abstract void finishOnSuccess(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2);

        public abstract LockFreeLinkedListNode getAffectedNode();

        public abstract LockFreeLinkedListNode getOriginalNext();

        public abstract Object onPrepare(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2);

        @Override // io.ktor.util.internal.AtomicDesc
        public final Object prepare(AtomicOp<?> op2) {
            e0.checkNotNullParameter(op2, "op");
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNodeTakeAffectedNode = takeAffectedNode(op2);
                Object obj = lockFreeLinkedListNodeTakeAffectedNode._next;
                if (obj == op2 || op2.isDecided()) {
                    return null;
                }
                if (obj instanceof OpDescriptor) {
                    ((OpDescriptor) obj).perform(lockFreeLinkedListNodeTakeAffectedNode);
                } else {
                    Object objFailure = failure(lockFreeLinkedListNodeTakeAffectedNode, obj);
                    if (objFailure != null) {
                        return objFailure;
                    }
                    if (retry(lockFreeLinkedListNodeTakeAffectedNode, obj)) {
                        continue;
                    } else {
                        e0.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                        PrepareOp prepareOp = new PrepareOp((LockFreeLinkedListNode) obj, op2, this);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNodeTakeAffectedNode, obj, prepareOp)) {
                                Object objPerform = prepareOp.perform(lockFreeLinkedListNodeTakeAffectedNode);
                                if (objPerform != LockFreeLinkedListKt.REMOVE_PREPARED) {
                                    return objPerform;
                                }
                            } else if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeTakeAffectedNode) != obj) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        public boolean retry(LockFreeLinkedListNode affected, Object next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            return false;
        }

        public LockFreeLinkedListNode takeAffectedNode(OpDescriptor op2) {
            e0.checkNotNullParameter(op2, "op");
            LockFreeLinkedListNode affectedNode = getAffectedNode();
            e0.checkNotNull(affectedNode);
            return affectedNode;
        }

        public abstract Object updatedNext(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class AddLastDesc<T extends LockFreeLinkedListNode> extends AbstractAtomicDesc {
        private static final /* synthetic */ AtomicReferenceFieldUpdater _affectedNode$FU = AtomicReferenceFieldUpdater.newUpdater(AddLastDesc.class, Object.class, "_affectedNode");
        private volatile /* synthetic */ Object _affectedNode;
        public final T node;
        public final LockFreeLinkedListNode queue;

        public AddLastDesc(LockFreeLinkedListNode queue, T node) {
            e0.checkNotNullParameter(queue, "queue");
            e0.checkNotNullParameter(node, "node");
            this.queue = queue;
            this.node = node;
            if (node._next != node || node._prev != node) {
                throw new IllegalStateException("Check failed.");
            }
            this._affectedNode = null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishOnSuccess(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            this.node.finishAdd(this.queue);
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final LockFreeLinkedListNode getAffectedNode() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final LockFreeLinkedListNode getOriginalNext() {
            return this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public Object onPrepare(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _affectedNode$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, affected) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public boolean retry(LockFreeLinkedListNode affected, Object next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            return next != this.queue;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            return r0;
         */
        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.ktor.util.internal.LockFreeLinkedListNode takeAffectedNode(io.ktor.util.internal.OpDescriptor r5) {
            /*
                r4 = this;
                java.lang.String r0 = "op"
                kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
            L5:
                io.ktor.util.internal.LockFreeLinkedListNode r0 = r4.queue
                java.lang.Object r0 = r0._prev
                java.lang.String r1 = "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.e0.checkNotNull(r0, r1)
                io.ktor.util.internal.LockFreeLinkedListNode r0 = (io.ktor.util.internal.LockFreeLinkedListNode) r0
                java.lang.Object r1 = r0._next
                io.ktor.util.internal.LockFreeLinkedListNode r2 = r4.queue
                if (r1 != r2) goto L17
                goto L19
            L17:
                if (r1 != r5) goto L1a
            L19:
                return r0
            L1a:
                boolean r3 = r1 instanceof io.ktor.util.internal.OpDescriptor
                if (r3 == 0) goto L24
                io.ktor.util.internal.OpDescriptor r1 = (io.ktor.util.internal.OpDescriptor) r1
                r1.perform(r0)
                goto L5
            L24:
                io.ktor.util.internal.LockFreeLinkedListNode r0 = io.ktor.util.internal.LockFreeLinkedListNode.access$correctPrev(r2, r0, r5)
                if (r0 == 0) goto L5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.internal.LockFreeLinkedListNode.AddLastDesc.takeAffectedNode(io.ktor.util.internal.OpDescriptor):io.ktor.util.internal.LockFreeLinkedListNode");
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public Object updatedNext(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            T t10 = this.node;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(t10, t10, affected) && atomicReferenceFieldUpdater.get(t10) == t10) {
            }
            T t11 = this.node;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode._next$FU;
            LockFreeLinkedListNode lockFreeLinkedListNode = this.queue;
            while (!atomicReferenceFieldUpdater2.compareAndSet(t11, t11, lockFreeLinkedListNode) && atomicReferenceFieldUpdater2.get(t11) == t11) {
            }
            return this.node;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {
        public final LockFreeLinkedListNode newNode;
        public LockFreeLinkedListNode oldNext;

        public CondAddOp(LockFreeLinkedListNode newNode) {
            e0.checkNotNullParameter(newNode, "newNode");
            this.newNode = newNode;
        }

        @Override // io.ktor.util.internal.AtomicOp
        public void complete(LockFreeLinkedListNode affected, Object obj) {
            e0.checkNotNullParameter(affected, "affected");
            boolean z10 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode = z10 ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(affected, this, lockFreeLinkedListNode)) {
                    if (atomicReferenceFieldUpdater.get(affected) != this) {
                        return;
                    }
                }
                if (z10) {
                    LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                    LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                    e0.checkNotNull(lockFreeLinkedListNode3);
                    lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.internal.LockFreeLinkedListNode$makeCondAddOp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40001 extends CondAddOp {
        final /* synthetic */ a $condition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40001(LockFreeLinkedListNode lockFreeLinkedListNode, a aVar) {
            super(lockFreeLinkedListNode);
            this.$condition = aVar;
        }

        @Override // io.ktor.util.internal.AtomicOp
        public Object prepare(LockFreeLinkedListNode affected) {
            e0.checkNotNullParameter(affected, "affected");
            if (((Boolean) this.$condition.invoke()).booleanValue()) {
                return null;
            }
            return LockFreeLinkedListKt.getCONDITION_FALSE();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        r7.markPrev();
        r3 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
        r2 = ((io.ktor.util.internal.Removed) r2).ref;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r3.compareAndSet(r1, r7, r2) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r3.get(r1) == r7) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.ktor.util.internal.LockFreeLinkedListNode correctPrev(io.ktor.util.internal.LockFreeLinkedListNode r7, io.ktor.util.internal.OpDescriptor r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            java.lang.Object r2 = r7._next
            if (r2 != r8) goto L7
            return r7
        L7:
            boolean r3 = r2 instanceof io.ktor.util.internal.OpDescriptor
            if (r3 == 0) goto L11
            io.ktor.util.internal.OpDescriptor r2 = (io.ktor.util.internal.OpDescriptor) r2
            r2.perform(r7)
            goto L2
        L11:
            boolean r3 = r2 instanceof io.ktor.util.internal.Removed
            if (r3 == 0) goto L36
            if (r1 == 0) goto L2f
            r7.markPrev()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU
            io.ktor.util.internal.Removed r2 = (io.ktor.util.internal.Removed) r2
            io.ktor.util.internal.LockFreeLinkedListNode r2 = r2.ref
        L20:
            boolean r4 = r3.compareAndSet(r1, r7, r2)
            if (r4 == 0) goto L27
            goto L2d
        L27:
            java.lang.Object r4 = r3.get(r1)
            if (r4 == r7) goto L20
        L2d:
            r7 = r1
            goto L1
        L2f:
            java.lang.Object r7 = r7._prev
            io.ktor.util.internal.LockFreeLinkedListNode r7 = io.ktor.util.internal.LockFreeLinkedListKt.unwrap(r7)
            goto L2
        L36:
            java.lang.Object r3 = r6._prev
            boolean r4 = r3 instanceof io.ktor.util.internal.Removed
            if (r4 == 0) goto L3d
            return r0
        L3d:
            if (r2 == r6) goto L4b
            java.lang.String r1 = "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.e0.checkNotNull(r2, r1)
            r1 = r2
            io.ktor.util.internal.LockFreeLinkedListNode r1 = (io.ktor.util.internal.LockFreeLinkedListNode) r1
            r5 = r1
            r1 = r7
            r7 = r5
            goto L2
        L4b:
            if (r3 != r7) goto L4e
            return r0
        L4e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = io.ktor.util.internal.LockFreeLinkedListNode._prev$FU
        L50:
            boolean r4 = r2.compareAndSet(r6, r3, r7)
            if (r4 == 0) goto L5d
            java.lang.Object r2 = r7._prev
            boolean r2 = r2 instanceof io.ktor.util.internal.Removed
            if (r2 != 0) goto L2
            return r0
        L5d:
            java.lang.Object r4 = r2.get(r6)
            if (r4 == r3) goto L50
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.internal.LockFreeLinkedListNode.correctPrev(io.ktor.util.internal.LockFreeLinkedListNode, io.ktor.util.internal.OpDescriptor):io.ktor.util.internal.LockFreeLinkedListNode");
    }

    private final LockFreeLinkedListNode findHead() {
        LockFreeLinkedListNode nextNode = this;
        while (!(nextNode instanceof LockFreeLinkedListHead)) {
            nextNode = nextNode.getNextNode();
            if (nextNode == this) {
                throw new IllegalStateException("Cannot loop to this while looking for list head");
            }
        }
        return nextNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdd(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (true) {
            Object obj = lockFreeLinkedListNode._prev;
            if ((obj instanceof Removed) || getNext() != lockFreeLinkedListNode) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, obj, this)) {
                if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != obj) {
                    break;
                }
            }
            if (getNext() instanceof Removed) {
                e0.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                lockFreeLinkedListNode.correctPrev((LockFreeLinkedListNode) obj, null);
                return;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRemove(LockFreeLinkedListNode lockFreeLinkedListNode) {
        helpDelete();
        lockFreeLinkedListNode.correctPrev(LockFreeLinkedListKt.unwrap(this._prev), null);
    }

    private final LockFreeLinkedListNode markPrev() {
        LockFreeLinkedListNode lockFreeLinkedListNodeFindHead;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return ((Removed) obj).ref;
            }
            if (obj == this) {
                lockFreeLinkedListNodeFindHead = findHead();
            } else {
                e0.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                lockFreeLinkedListNodeFindHead = (LockFreeLinkedListNode) obj;
            }
            Removed removed = lockFreeLinkedListNodeFindHead.removed();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return (LockFreeLinkedListNode) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Removed removed() {
        Removed removed = (Removed) this._removedRef;
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        _removedRef$FU.lazySet(this, removed2);
        return removed2;
    }

    public final void addLast(LockFreeLinkedListNode node) {
        Object prev;
        e0.checkNotNullParameter(node, "node");
        do {
            prev = getPrev();
            e0.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
        } while (!((LockFreeLinkedListNode) prev).addNext(node, this));
    }

    public final boolean addLastIf(LockFreeLinkedListNode node, a condition) {
        int iTryCondAddNext;
        e0.checkNotNullParameter(node, "node");
        e0.checkNotNullParameter(condition, "condition");
        C40001 c40001 = new C40001(node, condition);
        do {
            Object prev = getPrev();
            e0.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            iTryCondAddNext = ((LockFreeLinkedListNode) prev).tryCondAddNext(node, this, c40001);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addLastIfPrev(LockFreeLinkedListNode node, l predicate) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        e0.checkNotNullParameter(node, "node");
        e0.checkNotNullParameter(predicate, "predicate");
        do {
            Object prev = getPrev();
            e0.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) prev;
            if (!((Boolean) predicate.invoke(lockFreeLinkedListNode)).booleanValue()) {
                return false;
            }
        } while (!lockFreeLinkedListNode.addNext(node, this));
        return true;
    }

    public final boolean addLastIfPrevAndIf(LockFreeLinkedListNode node, l predicate, a condition) {
        int iTryCondAddNext;
        e0.checkNotNullParameter(node, "node");
        e0.checkNotNullParameter(predicate, "predicate");
        e0.checkNotNullParameter(condition, "condition");
        C40001 c40001 = new C40001(node, condition);
        do {
            Object prev = getPrev();
            e0.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) prev;
            if (!((Boolean) predicate.invoke(lockFreeLinkedListNode)).booleanValue()) {
                return false;
            }
            iTryCondAddNext = lockFreeLinkedListNode.tryCondAddNext(node, this, c40001);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addNext(LockFreeLinkedListNode node, LockFreeLinkedListNode next) {
        e0.checkNotNullParameter(node, "node");
        e0.checkNotNullParameter(next, "next");
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, next, node)) {
            if (atomicReferenceFieldUpdater.get(this) != next) {
                return false;
            }
        }
        node.finishAdd(next);
        return true;
    }

    public final boolean addOneIfEmpty(LockFreeLinkedListNode node) {
        e0.checkNotNullParameter(node, "node");
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        while (getNext() == this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, this, node)) {
                if (atomicReferenceFieldUpdater.get(this) != this) {
                    break;
                }
            }
            node.finishAdd(this);
            return true;
        }
        return false;
    }

    public final <T extends LockFreeLinkedListNode> AddLastDesc<T> describeAddLast(T node) {
        e0.checkNotNullParameter(node, "node");
        return new AddLastDesc<>(this, node);
    }

    public AtomicDesc describeRemove() {
        if (isRemoved()) {
            return null;
        }
        return new AbstractAtomicDesc() { // from class: io.ktor.util.internal.LockFreeLinkedListNode.describeRemove.1
            private static final /* synthetic */ AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass1.class, Object.class, "_originalNext");
            private volatile /* synthetic */ Object _originalNext = null;

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public Object failure(LockFreeLinkedListNode affected, Object next) {
                e0.checkNotNullParameter(affected, "affected");
                e0.checkNotNullParameter(next, "next");
                if (next instanceof Removed) {
                    return LockFreeLinkedListKt.getALREADY_REMOVED();
                }
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public void finishOnSuccess(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
                e0.checkNotNullParameter(affected, "affected");
                e0.checkNotNullParameter(next, "next");
                LockFreeLinkedListNode.this.finishRemove(next);
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public LockFreeLinkedListNode getAffectedNode() {
                return LockFreeLinkedListNode.this;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public LockFreeLinkedListNode getOriginalNext() {
                return (LockFreeLinkedListNode) this._originalNext;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public Object onPrepare(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
                e0.checkNotNullParameter(affected, "affected");
                e0.checkNotNullParameter(next, "next");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _originalNext$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, next) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public Removed updatedNext(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
                e0.checkNotNullParameter(affected, "affected");
                e0.checkNotNullParameter(next, "next");
                return next.removed();
            }
        };
    }

    public final RemoveFirstDesc<LockFreeLinkedListNode> describeRemoveFirst() {
        return new RemoveFirstDesc<>(this);
    }

    public final Object getNext() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    public final LockFreeLinkedListNode getNextNode() {
        return LockFreeLinkedListKt.unwrap(getNext());
    }

    public final Object getPrev() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return obj;
            }
            e0.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            if (lockFreeLinkedListNode.getNext() == this) {
                return obj;
            }
            correctPrev(lockFreeLinkedListNode, null);
        }
    }

    public final LockFreeLinkedListNode getPrevNode() {
        return LockFreeLinkedListKt.unwrap(getPrev());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r0.markPrev();
        r5 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
        r4 = ((io.ktor.util.internal.Removed) r4).ref;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r5.compareAndSet(r3, r0, r4) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r5.get(r3) == r0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void helpDelete() {
        /*
            r8 = this;
            io.ktor.util.internal.LockFreeLinkedListNode r0 = r8.markPrev()
            java.lang.Object r1 = r8._next
            java.lang.String r2 = "null cannot be cast to non-null type io.ktor.util.internal.Removed"
            kotlin.jvm.internal.e0.checkNotNull(r1, r2)
            io.ktor.util.internal.Removed r1 = (io.ktor.util.internal.Removed) r1
            io.ktor.util.internal.LockFreeLinkedListNode r1 = r1.ref
            r2 = 0
        L10:
            r3 = r2
        L11:
            java.lang.Object r4 = r1.getNext()
            boolean r5 = r4 instanceof io.ktor.util.internal.Removed
            if (r5 == 0) goto L21
            r1.markPrev()
            io.ktor.util.internal.Removed r4 = (io.ktor.util.internal.Removed) r4
            io.ktor.util.internal.LockFreeLinkedListNode r1 = r4.ref
            goto L11
        L21:
            java.lang.Object r4 = r0.getNext()
            boolean r5 = r4 instanceof io.ktor.util.internal.Removed
            if (r5 == 0) goto L4a
            if (r3 == 0) goto L43
            r0.markPrev()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU
            io.ktor.util.internal.Removed r4 = (io.ktor.util.internal.Removed) r4
            io.ktor.util.internal.LockFreeLinkedListNode r4 = r4.ref
        L34:
            boolean r6 = r5.compareAndSet(r3, r0, r4)
            if (r6 == 0) goto L3b
            goto L41
        L3b:
            java.lang.Object r6 = r5.get(r3)
            if (r6 == r0) goto L34
        L41:
            r0 = r3
            goto L10
        L43:
            java.lang.Object r0 = r0._prev
            io.ktor.util.internal.LockFreeLinkedListNode r0 = io.ktor.util.internal.LockFreeLinkedListKt.unwrap(r0)
            goto L11
        L4a:
            if (r4 == r8) goto L5b
            java.lang.String r3 = "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.e0.checkNotNull(r4, r3)
            r3 = r4
            io.ktor.util.internal.LockFreeLinkedListNode r3 = (io.ktor.util.internal.LockFreeLinkedListNode) r3
            if (r3 != r1) goto L57
            return
        L57:
            r7 = r3
            r3 = r0
            r0 = r7
            goto L11
        L5b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU
        L5d:
            boolean r5 = r4.compareAndSet(r0, r8, r1)
            if (r5 == 0) goto L64
            return
        L64:
            java.lang.Object r5 = r4.get(r0)
            if (r5 == r8) goto L5d
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.internal.LockFreeLinkedListNode.helpDelete():void");
    }

    public final void helpRemove() {
        Object next = getNext();
        Removed removed = next instanceof Removed ? (Removed) next : null;
        if (removed == null) {
            throw new IllegalStateException("Must be invoked on a removed node");
        }
        finishRemove(removed.ref);
    }

    public final boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    public final CondAddOp makeCondAddOp(LockFreeLinkedListNode node, a condition) {
        e0.checkNotNullParameter(node, "node");
        e0.checkNotNullParameter(condition, "condition");
        return new C40001(node, condition);
    }

    public boolean remove() {
        while (true) {
            Object next = getNext();
            if ((next instanceof Removed) || next == this) {
                return false;
            }
            e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            Removed removed = lockFreeLinkedListNode.removed();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, next, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != next) {
                    break;
                }
            }
            finishRemove(lockFreeLinkedListNode);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.ktor.util.internal.LockFreeLinkedListNode] */
    public final /* synthetic */ <T> T removeFirstIfIsInstanceOf() {
        while (true) {
            Object next = getNext();
            e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            ?? r02 = (T) ((LockFreeLinkedListNode) next);
            if (r02 == this) {
                return null;
            }
            e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            if (r02 == 0) {
                return null;
            }
            if (r02.remove()) {
                return r02;
            }
            r02.helpDelete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, io.ktor.util.internal.LockFreeLinkedListNode, java.lang.Object] */
    public final /* synthetic */ <T> T removeFirstIfIsInstanceOfOrPeekIf(l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        while (true) {
            Object next = getNext();
            e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            ?? r02 = (T) ((LockFreeLinkedListNode) next);
            if (r02 == this) {
                return null;
            }
            e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            if (r02 == 0) {
                return null;
            }
            if (((Boolean) predicate.invoke(r02)).booleanValue()) {
                return r02;
            }
            if (r02.remove()) {
                return r02;
            }
            r02.helpDelete();
        }
    }

    public final LockFreeLinkedListNode removeFirstOrNull() {
        while (true) {
            Object next = getNext();
            e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    public String toString() {
        return c1.getOrCreateKotlinClass(getClass()).getSimpleName() + '@' + hashCode();
    }

    public final int tryCondAddNext(LockFreeLinkedListNode node, LockFreeLinkedListNode next, CondAddOp condAdd) {
        e0.checkNotNullParameter(node, "node");
        e0.checkNotNullParameter(next, "next");
        e0.checkNotNullParameter(condAdd, "condAdd");
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, next, condAdd)) {
            if (atomicReferenceFieldUpdater.get(this) != next) {
                return 0;
            }
        }
        return condAdd.perform(this) == null ? 1 : 2;
    }

    public final void validateNode$ktor_utils(LockFreeLinkedListNode prev, LockFreeLinkedListNode next) {
        e0.checkNotNullParameter(prev, "prev");
        e0.checkNotNullParameter(next, "next");
        if (prev != this._prev) {
            throw new IllegalStateException("Check failed.");
        }
        if (next != this._next) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class RemoveFirstDesc<T> extends AbstractAtomicDesc {
        private static final /* synthetic */ AtomicReferenceFieldUpdater _affectedNode$FU = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_affectedNode");
        private static final /* synthetic */ AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode;
        private volatile /* synthetic */ Object _originalNext;
        public final LockFreeLinkedListNode queue;

        public RemoveFirstDesc(LockFreeLinkedListNode queue) {
            e0.checkNotNullParameter(queue, "queue");
            this.queue = queue;
            this._affectedNode = null;
            this._originalNext = null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public Object failure(LockFreeLinkedListNode affected, Object next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            if (affected == this.queue) {
                return LockFreeLinkedListKt.getLIST_EMPTY();
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final void finishOnSuccess(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            affected.finishRemove(next);
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final LockFreeLinkedListNode getAffectedNode() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final LockFreeLinkedListNode getOriginalNext() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        public final T getResult() {
            T t10 = (T) getAffectedNode();
            e0.checkNotNull(t10);
            return t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final Object onPrepare(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            if (affected instanceof LockFreeLinkedListHead) {
                throw new IllegalStateException("Check failed.");
            }
            if (!validatePrepared(affected)) {
                return LockFreeLinkedListKt.REMOVE_PREPARED;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _affectedNode$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, affected) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _originalNext$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, next) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final boolean retry(LockFreeLinkedListNode affected, Object next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            if (!(next instanceof Removed)) {
                return false;
            }
            affected.helpDelete();
            return true;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final LockFreeLinkedListNode takeAffectedNode(OpDescriptor op2) {
            e0.checkNotNullParameter(op2, "op");
            Object next = this.queue.getNext();
            e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            return (LockFreeLinkedListNode) next;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final Object updatedNext(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            e0.checkNotNullParameter(affected, "affected");
            e0.checkNotNullParameter(next, "next");
            return next.removed();
        }

        public boolean validatePrepared(T t10) {
            return true;
        }

        public static /* synthetic */ void getResult$annotations() {
        }
    }
}
