package com.bytedance.sdk.component.jj.jpo.jpo.jd;

import com.bytedance.sdk.component.jj.jpo.cm.jpo;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class cm<T extends com.bytedance.sdk.component.jj.jpo.cm.jpo> {

    /* renamed from: cm, reason: collision with root package name */
    private String f18703cm;

    /* renamed from: jd, reason: collision with root package name */
    private Queue<T> f18704jd = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpo;
    private Queue<String> wqx;

    public cm(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar, Queue<String> queue, String str) {
        this.jpo = jpoVar;
        this.wqx = queue;
        this.f18703cm = str;
    }

    public synchronized boolean jd(int i10, int i11) {
        int size = this.f18704jd.size();
        int iJpo = this.jpo.jpo();
        return (i10 == 2 || i10 == 1) ? com.bytedance.sdk.component.jj.jpo.wqx.jpo.wqx() ? size > 0 : size >= iJpo : size >= iJpo;
    }

    public void jpo(T t10) {
        Queue<T> queue = this.f18704jd;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public synchronized List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jpo(int i10, int i11) {
        if (!jd(i10, i11)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.jpo.jpo());
        do {
            T tPoll = this.f18704jd.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.jpo.jd());
        return arrayList;
    }

    public synchronized void jpo(int i10, List<T> list) {
        if (i10 != -1 && i10 != 200 && i10 != 509) {
            this.f18704jd.addAll(list);
        } else {
            this.f18704jd.size();
        }
    }
}
