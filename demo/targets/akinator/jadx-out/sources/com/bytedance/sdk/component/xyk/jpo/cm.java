package com.bytedance.sdk.component.xyk.jpo;

import com.bytedance.sdk.component.xyk.jpo.wqx;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm<T extends wqx> {

    /* renamed from: jd, reason: collision with root package name */
    private BlockingQueue<T> f19032jd = new LinkedBlockingQueue();
    private int jpo;

    private cm(int i10) {
        this.jpo = i10;
    }

    public static cm jpo(int i10) {
        return new cm(i10);
    }

    public T jpo() {
        return this.f19032jd.poll();
    }

    public boolean jpo(T t10) {
        if (t10 == null) {
            return false;
        }
        t10.jpo();
        if (this.f19032jd.size() >= this.jpo) {
            return false;
        }
        return this.f19032jd.offer(t10);
    }
}
