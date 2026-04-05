package i0;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import p0.g1;
import p0.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f59311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f59312f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f59313a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f59314b;

        public a(f fVar, l lVar) {
            this.f59313a = fVar;
            this.f59314b = lVar;
        }

        @Override // p0.g1
        public void dispose() {
            ((h) this.f59313a).getModifiers().remove(this.f59314b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, l lVar) {
        super(1);
        this.f59311e = fVar;
        this.f59312f = lVar;
    }

    @Override // kv.l
    public final g1 invoke(h1 DisposableEffect) {
        e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        f fVar = this.f59311e;
        r0.c modifiers = ((h) fVar).getModifiers();
        l lVar = this.f59312f;
        modifiers.add(lVar);
        return new a(fVar, lVar);
    }
}
