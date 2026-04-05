package com.applovin.impl.communicator;

import com.inmobi.media.U4;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13803b;

    public /* synthetic */ a(int i10) {
        this.f13803b = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f13803b) {
            case 0:
                return MessagingServiceImpl.a(runnable);
            case 1:
                return U4.a(runnable);
            default:
                return U4.b(runnable);
        }
    }
}
