package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.net.Uri;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qf.c1;
import qf.p;
import qf.t;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f50085a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h f50086b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f50087c;

    /* renamed from: d, reason: collision with root package name */
    public long f50088d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f50089e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f50090f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ t f50092j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f50092j = tVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Long> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new a(this.f50092j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IOException {
            File fileC;
            t tVar = this.f50092j;
            b bVar = b.this;
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            try {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVarA = bVar.a(bVar.f50085a);
                if (dVarA instanceof d.a) {
                    fileC = ((d.a) dVarA).b();
                } else {
                    if (!(dVarA instanceof d.c)) {
                        bVar.f50090f = true;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b.c(bVar), "Failed to download file: " + bVar.f50085a, null, false, 12, null);
                        throw new IOException("Cannot read file: " + bVar.f50085a);
                    }
                    fileC = ((d.c) dVarA).c();
                }
                if (!fileC.exists()) {
                    throw new IOException("Cannot read file, does not exist yet: " + bVar.f50085a);
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileC, "r");
                randomAccessFile.seek(tVar.f82997f);
                bVar.a(randomAccessFile);
                long length = tVar.f82998g;
                if (length == -1) {
                    length = fileC.length() - tVar.f82997f;
                }
                bVar.f50088d = length;
                if (bVar.f50088d == 0 && bVar.a(dVarA)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, b.c(bVar), "Streaming error likely detected", null, false, 12, null);
                    bVar.f50090f = true;
                }
                return bv.b.boxLong(bVar.f50088d);
            } catch (IOException e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.c(bVar), "Failed to open file: " + bVar.f50085a, e10, false, 8, null);
                throw e10;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b$b, reason: collision with other inner class name */
    public static final class C0484b extends n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f50094j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0484b(String str, zu.d<? super C0484b> dVar) {
            super(2, dVar);
            this.f50094j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> dVar) {
            return ((C0484b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new C0484b(this.f50094j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            return b.this.f50086b.a(this.f50094j);
        }
    }

    public b(String url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h mediaCacheRepository) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        this.f50085a = url;
        this.f50086b = mediaCacheRepository;
    }

    public static /* synthetic */ void c() {
    }

    @Override // qf.p
    public void addTransferListener(c1 transferListener) {
        e0.checkNotNullParameter(transferListener, "transferListener");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "addTransferListener", null, false, 12, null);
    }

    @Override // qf.p
    public void close() {
        try {
            RandomAccessFile randomAccessFile = this.f50087c;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } finally {
            this.f50087c = null;
        }
    }

    @Override // qf.p
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // qf.p
    public Uri getUri() {
        return Uri.parse(this.f50085a);
    }

    @Override // qf.p
    public long open(t dataSpec) {
        e0.checkNotNullParameter(dataSpec, "dataSpec");
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new a(dataSpec, null), 1, null)).longValue();
    }

    @Override // qf.p, qf.k
    public int read(byte[] buffer, int i10, int i11) throws IOException {
        IOException iOException;
        int i12;
        e0.checkNotNullParameter(buffer, "buffer");
        try {
            if (i11 == 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Read length is 0", null, false, 12, null);
                return 0;
            }
            long j10 = this.f50088d;
            String str = this.f50085a;
            if (j10 == 0 && (a(str) instanceof d.a)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Media stream is complete", null, false, 12, null);
                return -1;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVarA = a(str);
            if (dVarA instanceof d.b) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Streaming failed: " + str, null, false, 12, null);
                this.f50090f = true;
                return 0;
            }
            if (dVarA instanceof d.a) {
                RandomAccessFile randomAccessFile = this.f50087c;
                i = randomAccessFile != null ? randomAccessFile.read(buffer, i10, i11) : 0;
                if (i > 0) {
                    this.f50089e = true;
                    this.f50088d -= i;
                }
                return i;
            }
            loop0: while (true) {
                i12 = 0;
                while (i12 <= 0) {
                    try {
                        if (!(a(str) instanceof d.c)) {
                            break loop0;
                        }
                        RandomAccessFile randomAccessFile2 = this.f50087c;
                        if (randomAccessFile2 != null) {
                            i12 = randomAccessFile2.read(buffer, i10, i11);
                        }
                    } catch (IOException e10) {
                        iOException = e10;
                        i = i12;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Waiting for more data", iOException, false, 8, null);
                        return i;
                    }
                }
            }
            if (i12 > 0) {
                this.f50089e = true;
                this.f50088d -= i12;
            }
            return i12;
        } catch (IOException e11) {
            iOException = e11;
        }
    }

    public static final /* synthetic */ String c(b bVar) {
        bVar.getClass();
        return "ProgressiveMediaFileDataSource";
    }

    public final RandomAccessFile b() {
        return this.f50087c;
    }

    public final void a(RandomAccessFile randomAccessFile) {
        this.f50087c = randomAccessFile;
    }

    public final boolean a() {
        return this.f50090f;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d a(String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) BuildersKt__BuildersKt.runBlocking$default(null, new C0484b(str, null), 1, null);
    }

    public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVar) {
        return this.f50089e && (dVar instanceof d.c) && e0.areEqual(((d.c) dVar).d(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e.a());
    }
}
