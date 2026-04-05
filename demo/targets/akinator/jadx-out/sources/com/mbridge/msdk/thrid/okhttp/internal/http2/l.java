package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f43602a = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements l {
        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public void a(int i10, b bVar) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, List<c> list) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, List<c> list, boolean z10) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException {
            eVar.skip(i11);
            return true;
        }
    }

    void a(int i10, b bVar);

    boolean a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException;

    boolean a(int i10, List<c> list);

    boolean a(int i10, List<c> list, boolean z10);
}
