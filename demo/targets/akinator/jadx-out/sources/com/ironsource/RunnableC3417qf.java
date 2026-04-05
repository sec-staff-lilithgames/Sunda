package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.qf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class RunnableC3417qf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f38236a;

    /* renamed from: b, reason: collision with root package name */
    private final C3228g5 f38237b;

    public RunnableC3417qf(C3228g5 c3228g5, Handler handler) {
        this.f38237b = c3228g5;
        this.f38236a = handler;
    }

    public CallableC3157c6 a(C3228g5 c3228g5, String str, long j10) {
        return new CallableC3157c6(c3228g5, str, j10);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C8 c82 = new C8(this.f38237b.b().getParent(), this.f38237b.b().getName());
        Message messageA = a();
        messageA.obj = c82;
        String strA = a(c82.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.f38236a.sendMessage(messageA);
        } else {
            C3246h5 c3246h5Call = a(new C3228g5(c82, this.f38237b.e(), this.f38237b.a(), this.f38237b.c(), this.f38237b.f(), this.f38237b.d()), strA, 3L).call();
            messageA.what = c3246h5Call.b() == 200 ? C3227g4.f36758l : c3246h5Call.b();
            this.f38236a.sendMessage(messageA);
        }
    }

    public Message a() {
        return new Message();
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
