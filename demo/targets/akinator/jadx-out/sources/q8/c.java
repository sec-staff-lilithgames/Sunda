package q8;

import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f82570a = j9.s.createQueue(20);

    public void offer(q qVar) {
        Queue queue = this.f82570a;
        if (queue.size() < 20) {
            queue.offer(qVar);
        }
    }
}
