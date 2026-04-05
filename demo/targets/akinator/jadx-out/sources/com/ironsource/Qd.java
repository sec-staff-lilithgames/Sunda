package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Qd implements InterfaceC3348mg {

    /* renamed from: a, reason: collision with root package name */
    private final Db f35363a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35364a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.d("Load task config is null");
        }
    }

    public Qd(Db db2) {
        this.f35363a = db2;
    }

    @Override // com.ironsource.InterfaceC3348mg
    public void a() {
        a(this.f35363a != null, a.f35364a);
    }
}
