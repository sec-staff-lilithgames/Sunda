package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48123a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f48124b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f48125c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f48126d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f48127e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f48128f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f48129g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f48130h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f48131i;

    public v(Context context) {
        e0.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f48123a = applicationContext;
        this.f48124b = new Rect();
        this.f48125c = new Rect();
        this.f48126d = new Rect();
        this.f48127e = new Rect();
        this.f48128f = new Rect();
        this.f48129g = new Rect();
        this.f48130h = new Rect();
        this.f48131i = new Rect();
    }

    public final void a(Rect rect, Rect rect2) {
        b bVar = b.f48022a;
        float f10 = rect.left;
        Context context = this.f48123a;
        rect2.set(bVar.f(f10, context), bVar.f(rect.top, context), bVar.f(rect.right, context), bVar.f(rect.bottom, context));
    }

    public final void b(int i10, int i11, int i12, int i13) {
        Rect rect = this.f48130h;
        rect.set(i10, i11, i12 + i10, i13 + i11);
        a(rect, this.f48131i);
    }

    public final void c(int i10, int i11, int i12, int i13) {
        Rect rect = this.f48126d;
        rect.set(i10, i11, i12 + i10, i13 + i11);
        a(rect, this.f48127e);
    }

    public final Rect d() {
        return this.f48131i;
    }

    public final Rect e() {
        return this.f48126d;
    }

    public final Rect f() {
        return this.f48127e;
    }

    public final Rect g() {
        return this.f48125c;
    }

    public final Rect b() {
        return this.f48129g;
    }

    public final Rect c() {
        return this.f48130h;
    }

    public final void a(int i10, int i11) {
        Rect rect = this.f48124b;
        rect.set(0, 0, i10, i11);
        a(rect, this.f48125c);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        Rect rect = this.f48128f;
        rect.set(i10, i11, i12 + i10, i13 + i11);
        a(rect, this.f48129g);
    }

    public final Rect a() {
        return this.f48128f;
    }
}
