package io.odeeo.internal.g1;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements io.odeeo.internal.y0.b<AudioManager> {

    /* renamed from: a, reason: collision with root package name */
    public final b f64208a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f64209b;

    public c(b bVar, io.odeeo.internal.x1.a<Context> aVar) {
        this.f64208a = bVar;
        this.f64209b = aVar;
    }

    public static c create(b bVar, io.odeeo.internal.x1.a<Context> aVar) {
        return new c(bVar, aVar);
    }

    public static AudioManager provideAudioManager(b bVar, Context context) {
        return (AudioManager) io.odeeo.internal.y0.d.checkNotNullFromProvides(bVar.provideAudioManager(context));
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public AudioManager get() {
        return provideAudioManager(this.f64208a, this.f64209b.get());
    }
}
