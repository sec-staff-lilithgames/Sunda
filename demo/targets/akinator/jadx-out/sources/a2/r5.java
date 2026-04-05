package a2;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public final r0.c f3787a = new r0.c(new Reference[16], 0);

    /* renamed from: b, reason: collision with root package name */
    public final ReferenceQueue f3788b = new ReferenceQueue();

    public final int getSize() {
        Reference referencePoll;
        r0.c cVar;
        do {
            referencePoll = this.f3788b.poll();
            cVar = this.f3787a;
            if (referencePoll != null) {
                cVar.remove(referencePoll);
            }
        } while (referencePoll != null);
        return cVar.getSize();
    }

    public final Object pop() {
        Reference referencePoll;
        r0.c cVar;
        do {
            referencePoll = this.f3788b.poll();
            cVar = this.f3787a;
            if (referencePoll != null) {
                cVar.remove(referencePoll);
            }
        } while (referencePoll != null);
        while (cVar.isNotEmpty()) {
            Object obj = ((Reference) cVar.removeAt(cVar.getSize() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void push(Object obj) {
        ReferenceQueue referenceQueue;
        Reference referencePoll;
        r0.c cVar;
        do {
            referenceQueue = this.f3788b;
            referencePoll = referenceQueue.poll();
            cVar = this.f3787a;
            if (referencePoll != null) {
                cVar.remove(referencePoll);
            }
        } while (referencePoll != null);
        cVar.add(new WeakReference(obj, referenceQueue));
    }
}
