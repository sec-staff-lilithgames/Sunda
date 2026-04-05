package com.google.android.exoplayer2.util;

import sh.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class l1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f28488c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f28489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28490f;

    public /* synthetic */ l1(a2 a2Var, Runnable runnable, Object obj, int i10) {
        this.f28487b = i10;
        this.f28488c = a2Var;
        this.f28489e = runnable;
        this.f28490f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28487b) {
            case 0:
                a2 a2Var = this.f28488c;
                Runnable runnable = this.f28489e;
                Object obj = this.f28490f;
                try {
                    if (!a2Var.isCancelled()) {
                        runnable.run();
                        a2Var.set(obj);
                        break;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    a2Var.setException(th2);
                    return;
                }
            default:
                a2 a2Var2 = this.f28488c;
                Runnable runnable2 = this.f28489e;
                Object obj2 = this.f28490f;
                try {
                    if (!a2Var2.isCancelled()) {
                        runnable2.run();
                        a2Var2.set(obj2);
                        break;
                    } else {
                        break;
                    }
                } catch (Throwable th3) {
                    a2Var2.setException(th3);
                }
        }
    }
}
