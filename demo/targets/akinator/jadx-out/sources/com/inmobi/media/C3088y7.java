package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3088y7 implements InterfaceC3071x7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3071x7 f33600a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f33601b;

    public C3088y7(InterfaceC3071x7 mediaChangeReceiver) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaChangeReceiver, "mediaChangeReceiver");
        this.f33600a = mediaChangeReceiver;
        this.f33601b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3071x7
    public final void a() {
        if (this.f33601b.getAndSet(false)) {
            this.f33600a.a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3071x7
    public final void b() {
        if (this.f33601b.getAndSet(true)) {
            return;
        }
        this.f33600a.b();
    }
}
