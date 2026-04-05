package io.odeeo.sdk;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements io.odeeo.internal.y0.b<i> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<AudioManager> f68122a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f68123b;

    public j(io.odeeo.internal.x1.a<AudioManager> aVar, io.odeeo.internal.x1.a<Context> aVar2) {
        this.f68122a = aVar;
        this.f68123b = aVar2;
    }

    public static j create(io.odeeo.internal.x1.a<AudioManager> aVar, io.odeeo.internal.x1.a<Context> aVar2) {
        return new j(aVar, aVar2);
    }

    public static i newInstance(AudioManager audioManager, Context context) {
        return new i(audioManager, context);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public i get() {
        return newInstance(this.f68122a.get(), this.f68123b.get());
    }
}
