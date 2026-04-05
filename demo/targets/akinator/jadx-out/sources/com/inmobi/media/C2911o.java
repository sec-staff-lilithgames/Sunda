package com.inmobi.media;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2911o extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2894n f33174b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2911o(Context context, C2894n c2894n) {
        super(0);
        this.f33173a = context;
        this.f33174b = c2894n;
    }

    @Override // kv.a
    public final Object invoke() {
        this.f33173a.unregisterReceiver(this.f33174b);
        return tu.x0.f87415a;
    }
}
