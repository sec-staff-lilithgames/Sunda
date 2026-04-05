package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.util.Pair;
import android.view.ViewGroup;
import com.inmobi.media.A8;
import com.inmobi.media.C2970r8;
import io.bidmachine.media3.exoplayer.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13788b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13789c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13793h;

    public /* synthetic */ c9(f0 f0Var, SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.o oVar) {
        this.f13790e = f0Var;
        this.f13791f = sensorEventListener;
        this.f13792g = sensor;
        this.f13789c = i10;
        this.f13793h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13788b) {
            case 0:
                ((f0) this.f13790e).a((SensorEventListener) this.f13791f, (Sensor) this.f13792g, this.f13789c, (com.applovin.impl.sdk.o) this.f13793h);
                break;
            case 1:
                i1.a aVar = (i1.a) this.f13790e;
                Pair pair = (Pair) this.f13791f;
                io.bidmachine.media3.exoplayer.i1.this.f61260h.onLoadStarted(((Integer) pair.first).intValue(), (ao.k0) pair.second, (ao.b0) this.f13792g, (ao.g0) this.f13793h, this.f13789c);
                break;
            default:
                A8.a((A8) this.f13790e, this.f13789c, (ViewGroup) this.f13791f, (ViewGroup) this.f13792g, (C2970r8) this.f13793h);
                break;
        }
    }

    public /* synthetic */ c9(A8 a82, int i10, ViewGroup viewGroup, ViewGroup viewGroup2, C2970r8 c2970r8) {
        this.f13790e = a82;
        this.f13789c = i10;
        this.f13791f = viewGroup;
        this.f13792g = viewGroup2;
        this.f13793h = c2970r8;
    }

    public /* synthetic */ c9(i1.a aVar, Pair pair, ao.b0 b0Var, ao.g0 g0Var, int i10) {
        this.f13790e = aVar;
        this.f13791f = pair;
        this.f13792g = b0Var;
        this.f13793h = g0Var;
        this.f13789c = i10;
    }
}
