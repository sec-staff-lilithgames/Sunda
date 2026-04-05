package io.odeeo.internal.q1;

import android.media.AudioManager;
import io.odeeo.internal.j1.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements io.odeeo.internal.y0.b<a> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<f> f65988a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<AudioManager> f65989b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<String> f65990c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<String> f65991d;

    public b(io.odeeo.internal.x1.a<f> aVar, io.odeeo.internal.x1.a<AudioManager> aVar2, io.odeeo.internal.x1.a<String> aVar3, io.odeeo.internal.x1.a<String> aVar4) {
        this.f65988a = aVar;
        this.f65989b = aVar2;
        this.f65990c = aVar3;
        this.f65991d = aVar4;
    }

    public static b create(io.odeeo.internal.x1.a<f> aVar, io.odeeo.internal.x1.a<AudioManager> aVar2, io.odeeo.internal.x1.a<String> aVar3, io.odeeo.internal.x1.a<String> aVar4) {
        return new b(aVar, aVar2, aVar3, aVar4);
    }

    public static a newInstance(f fVar, AudioManager audioManager, String str, String str2) {
        return new a(fVar, audioManager, str, str2);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public a get() {
        return newInstance(this.f65988a.get(), this.f65989b.get(), this.f65990c.get(), this.f65991d.get());
    }
}
