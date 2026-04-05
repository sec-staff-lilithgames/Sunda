package a2;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f3584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h1 f3585f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f3586a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h1 f3587b;

        public a(Context context, h1 h1Var) {
            this.f3586a = context;
            this.f3587b = h1Var;
        }

        @Override // p0.g1
        public void dispose() {
            this.f3586a.getApplicationContext().unregisterComponentCallbacks(this.f3587b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context, h1 h1Var) {
        super(1);
        this.f3584e = context;
        this.f3585f = h1Var;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        Context context = this.f3584e;
        Context applicationContext = context.getApplicationContext();
        h1 h1Var = this.f3585f;
        applicationContext.registerComponentCallbacks(h1Var);
        return new a(context, h1Var);
    }
}
