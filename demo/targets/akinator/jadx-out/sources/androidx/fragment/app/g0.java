package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.a f6319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f6320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.a f6321c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i.b f6322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f6323e;

    public g0(Fragment fragment, t.a aVar, AtomicReference atomicReference, j.a aVar2, i.b bVar) {
        this.f6323e = fragment;
        this.f6319a = aVar;
        this.f6320b = atomicReference;
        this.f6321c = aVar2;
        this.f6322d = bVar;
    }

    @Override // androidx.fragment.app.i0
    public final void a() {
        Fragment fragment = this.f6323e;
        this.f6320b.set(((i.g) this.f6319a.apply(null)).register(fragment.generateActivityResultKey(), fragment, this.f6321c, this.f6322d));
    }
}
