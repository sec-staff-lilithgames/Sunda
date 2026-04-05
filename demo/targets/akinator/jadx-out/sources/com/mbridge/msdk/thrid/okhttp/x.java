package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class x {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends x {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f43774a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f43775b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f43776c;

        public a(s sVar, int i10, byte[] bArr, int i11) {
            this.f43774a = i10;
            this.f43775b = bArr;
            this.f43776c = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.x
        public long a() {
            return this.f43774a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.x
        public s b() {
            return null;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.x
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.f43775b, this.f43776c, this.f43774a);
        }
    }

    public static x a(s sVar, byte[] bArr) {
        return a(sVar, bArr, 0, bArr.length);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    public abstract s b();

    public static x a(s sVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(sVar, i11, bArr, i10);
    }
}
