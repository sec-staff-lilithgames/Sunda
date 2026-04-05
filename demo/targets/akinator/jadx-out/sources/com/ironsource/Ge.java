package com.ironsource;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ge implements Fe {

    /* renamed from: a, reason: collision with root package name */
    private final N8 f34538a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34539a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final String f34540b = "sessionNumber";

        /* renamed from: c, reason: collision with root package name */
        public static final String f34541c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ge() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.He
    public void a(Context context, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f34538a.a(context, a.f34540b, i10);
    }

    @Override // com.ironsource.He
    public int b(Context context, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return this.f34538a.b(context, a.f34540b, i10);
    }

    public Ge(N8 sdkSharedPref) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f34538a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC3382oe
    public long a(Context context, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return this.f34538a.b(context, "firstSessionTimestamp", j10);
    }

    @Override // com.ironsource.InterfaceC3382oe
    public void b(Context context, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f34538a.a(context, "firstSessionTimestamp", j10);
    }

    public /* synthetic */ Ge(N8 n82, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new Ie() : n82);
    }
}
