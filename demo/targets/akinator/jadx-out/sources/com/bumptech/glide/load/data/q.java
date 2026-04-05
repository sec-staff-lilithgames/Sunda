package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.InputStream;
import x8.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q implements g {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f16605a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final q8.b f16606a;

        public a(q8.b bVar) {
            this.f16606a = bVar;
        }

        @Override // com.bumptech.glide.load.data.f
        public Class<InputStream> getDataClass() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.f
        public g build(InputStream inputStream) {
            return new q(inputStream, this.f16606a);
        }
    }

    public q(InputStream inputStream, q8.b bVar) {
        o0 o0Var = new o0(inputStream, bVar);
        this.f16605a = o0Var;
        o0Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
        this.f16605a.release();
    }

    public void fixMarkLimits() {
        this.f16605a.fixMarkLimit();
    }

    @Override // com.bumptech.glide.load.data.g
    public InputStream rewindAndGet() throws IOException {
        o0 o0Var = this.f16605a;
        o0Var.reset();
        return o0Var;
    }
}
