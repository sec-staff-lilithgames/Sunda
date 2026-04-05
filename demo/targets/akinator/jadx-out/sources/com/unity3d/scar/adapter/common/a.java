package com.unity3d.scar.adapter.common;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f50703a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f50704b;

    public synchronized void enter() {
        this.f50703a++;
    }

    public synchronized void leave() {
        Runnable runnable;
        int i10 = this.f50703a - 1;
        this.f50703a = i10;
        if (i10 <= 0 && (runnable = this.f50704b) != null) {
            runnable.run();
        }
    }

    public void notify(Runnable runnable) {
        this.f50704b = runnable;
        if (this.f50703a > 0 || runnable == null) {
            return;
        }
        runnable.run();
    }
}
