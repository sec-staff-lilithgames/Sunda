package com.inmobi.media;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.g5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2782g5 implements La {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2799h5 f32868a;

    public C2782g5(C2799h5 c2799h5) {
        this.f32868a = c2799h5;
    }

    @Override // com.inmobi.media.La
    public final void a(Na result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        WeakReference weakReference = (WeakReference) this.f32868a.f32453b.get(result.f32074a.f31920h);
        Va va2 = weakReference != null ? (Va) weakReference.get() : null;
        if (Qa.a(result)) {
            this.f32868a.b(result, va2);
        } else {
            this.f32868a.a(result, va2);
        }
    }
}
