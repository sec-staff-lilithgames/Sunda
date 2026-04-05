package com.mbridge.msdk.video.module.listener.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class i extends f {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f44845a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f44845a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.f44845a;
        if (aVar != null) {
            aVar.a(i10, obj);
        }
    }
}
