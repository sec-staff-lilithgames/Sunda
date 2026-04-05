package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3190e3 implements InterfaceC3348mg {

    /* renamed from: a, reason: collision with root package name */
    private final Db f36335a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSize f36336b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.e3$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36337a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.a("Load task config is null");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.e3$b */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36338a = new b();

        public b() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.l();
        }
    }

    public C3190e3(Db db2, AdSize adSize) {
        this.f36335a = db2;
        this.f36336b = adSize;
    }

    @Override // com.ironsource.InterfaceC3348mg
    public void a() {
        a(this.f36335a != null, a.f36337a);
        a(this.f36336b != null, b.f36338a);
    }
}
