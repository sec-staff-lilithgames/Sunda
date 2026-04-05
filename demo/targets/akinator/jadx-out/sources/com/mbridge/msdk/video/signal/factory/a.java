package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f45183a;

    /* renamed from: b, reason: collision with root package name */
    protected d f45184b;

    /* renamed from: c, reason: collision with root package name */
    protected j f45185c;

    /* renamed from: d, reason: collision with root package name */
    protected g f45186d;

    /* renamed from: e, reason: collision with root package name */
    protected f f45187e;

    /* renamed from: f, reason: collision with root package name */
    protected i f45188f;

    /* renamed from: g, reason: collision with root package name */
    protected c f45189g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f45183a == null) {
            this.f45183a = new com.mbridge.msdk.video.signal.impl.b();
        }
        return this.f45183a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f45188f == null) {
            this.f45188f = new com.mbridge.msdk.video.signal.impl.g();
        }
        return this.f45188f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f45189g == null) {
            this.f45189g = new com.mbridge.msdk.video.signal.impl.c();
        }
        return this.f45189g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f45184b == null) {
            this.f45184b = new com.mbridge.msdk.video.signal.impl.d();
        }
        return this.f45184b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f45187e == null) {
            this.f45187e = new e();
        }
        return this.f45187e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f45186d == null) {
            this.f45186d = new com.mbridge.msdk.video.signal.impl.f();
        }
        return this.f45186d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f45185c == null) {
            this.f45185c = new h();
        }
        return this.f45185c;
    }
}
