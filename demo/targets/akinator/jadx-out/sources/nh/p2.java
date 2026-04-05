package nh;

import java.util.Iterator;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p2 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76549e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f76550f;

    public p2(Queue queue) {
        this.f76550f = (Queue) mh.p1.checkNotNull(queue);
    }

    @Override // nh.b
    public final Object computeNext() {
        switch (this.f76549e) {
            case 0:
                Queue queue = (Queue) this.f76550f;
                if (!queue.isEmpty()) {
                    return queue.remove();
                }
                this.f76111b = 3;
                return null;
            default:
                Iterator it = (Iterator) this.f76550f;
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (it.hasNext() || !str.isEmpty()) {
                        return str;
                    }
                }
                this.f76111b = 3;
                return null;
        }
    }

    public p2(ph.i0 i0Var) {
        this.f76550f = ph.i0.f81313b.split(i0Var.f81314a).iterator();
    }
}
