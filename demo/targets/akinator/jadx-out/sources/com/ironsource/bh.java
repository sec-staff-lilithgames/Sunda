package com.ironsource;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class bh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f36098c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3466te f36099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3432re f36100f;

    public /* synthetic */ bh(Context context, C3466te c3466te, InterfaceC3432re interfaceC3432re, int i10) {
        this.f36097b = i10;
        this.f36098c = context;
        this.f36099e = c3466te;
        this.f36100f = interfaceC3432re;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36097b) {
            case 0:
                Ae.b(this.f36098c, this.f36099e, this.f36100f);
                break;
            default:
                Ae.d(this.f36098c, this.f36099e, this.f36100f);
                break;
        }
    }
}
