package com.ironsource;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.if, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cif implements J3 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f36947d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f36948e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final long f36949f = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f36950a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36951b;

    /* renamed from: c, reason: collision with root package name */
    private final N8 f36952c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.if$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public Cif(Context context, String baseName, N8 sdkSharedPref) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(baseName, "baseName");
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f36950a = context;
        this.f36951b = baseName;
        this.f36952c = sdkSharedPref;
    }

    @Override // com.ironsource.J3
    public void a(String identifier, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        this.f36952c.a(this.f36950a, new C3291jf(identifier, j1.o2.l(this.f36951b, ".show_count_show_counter")).a(), i10);
    }

    @Override // com.ironsource.J3
    public Long b(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.f36952c.b(this.f36950a, new C3291jf(identifier, j1.o2.l(this.f36951b, ".pacing_last_show_time")).a(), -1L)));
    }

    @Override // com.ironsource.J3
    public Integer c(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        return a(Integer.valueOf(this.f36952c.b(this.f36950a, new C3291jf(identifier, j1.o2.l(this.f36951b, ".show_count_show_counter")).a(), -1)));
    }

    public /* synthetic */ Cif(Context context, String str, N8 n82, int i10, kotlin.jvm.internal.u uVar) {
        this(context, str, (i10 & 4) != 0 ? new Ie() : n82);
    }

    @Override // com.ironsource.J3
    public void a(String identifier, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        this.f36952c.a(this.f36950a, new C3291jf(identifier, j1.o2.l(this.f36951b, ".pacing_last_show_time")).a(), j10);
    }

    @Override // com.ironsource.J3
    public void b(String identifier, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        this.f36952c.a(this.f36950a, new C3291jf(identifier, j1.o2.l(this.f36951b, ".show_count_threshold")).a(), j10);
    }

    @Override // com.ironsource.J3
    public Long a(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.f36952c.b(this.f36950a, new C3291jf(identifier, j1.o2.l(this.f36951b, ".show_count_threshold")).a(), -1L)));
    }

    private final Long a(Long l9) {
        if (l9 != null && l9.longValue() == -1) {
            return null;
        }
        return l9;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
