package f7;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import c7.s;
import c7.t;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import pw.h0;
import pw.n0;
import pw.r;
import sv.k0;
import tu.x0;
import xv.h;
import xv.j0;
import xv.o0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final xv.h f55464f;

    /* renamed from: g, reason: collision with root package name */
    public static final xv.h f55465g;

    /* renamed from: a, reason: collision with root package name */
    public final String f55466a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.o f55467b;

    /* renamed from: c, reason: collision with root package name */
    public final tu.o f55468c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f55469d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f55470e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final tu.o f55471a;

        /* renamed from: b, reason: collision with root package name */
        public final tu.o f55472b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f55473c;

        public b(tu.o oVar, tu.o oVar2, boolean z10) {
            this.f55471a = oVar;
            this.f55472b = oVar2;
            this.f55473c = z10;
        }

        @Override // f7.h
        public i create(Uri uri, l7.o oVar, a7.m mVar) {
            if (!e0.areEqual(uri.getScheme(), "http") && !e0.areEqual(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) {
                return null;
            }
            return new k(uri.toString(), oVar, this.f55471a, this.f55472b, this.f55473c);
        }
    }

    static {
        new a(null);
        f55464f = new h.a().noCache().noStore().build();
        f55465g = new h.a().noCache().onlyIfCached().build();
    }

    public k(String str, l7.o oVar, tu.o oVar2, tu.o oVar3, boolean z10) {
        this.f55466a = str;
        this.f55467b = oVar;
        this.f55468c = oVar2;
        this.f55469d = oVar3;
        this.f55470e = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xv.o0 r5, zu.d r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f7.l
            if (r0 == 0) goto L13
            r0 = r6
            f7.l r0 = (f7.l) r0
            int r1 = r0.f55476k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55476k = r1
            goto L18
        L13:
            f7.l r0 = new f7.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f55474i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f55476k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L70
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r6)
            boolean r6 = q7.n.isMainThread()
            tu.o r2 = r4.f55468c
            if (r6 == 0) goto L5d
            l7.o r6 = r4.f55467b
            l7.b r6 = r6.getNetworkCachePolicy()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L57
            java.lang.Object r6 = r2.getValue()
            xv.i r6 = (xv.i) r6
            xv.j r5 = r6.newCall(r5)
            xv.v0 r5 = r5.execute()
            goto L73
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            java.lang.Object r6 = r2.getValue()
            xv.i r6 = (xv.i) r6
            xv.j r5 = r6.newCall(r5)
            r0.f55476k = r3
            java.lang.Object r6 = q7.b.await(r5, r0)
            if (r6 != r1) goto L70
            return r1
        L70:
            r5 = r6
            xv.v0 r5 = (xv.v0) r5
        L73:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto L90
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L90
            xv.w0 r6 = r5.body()
            if (r6 == 0) goto L8a
            q7.n.closeQuietly(r6)
        L8a:
            k7.f r6 = new k7.f
            r6.<init>(r5)
            throw r6
        L90:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.k.a(xv.o0, zu.d):java.lang.Object");
    }

    public final r b() {
        Object value = this.f55469d.getValue();
        e0.checkNotNull(value);
        return ((d7.d) value).getFileSystem();
    }

    public final o0 c() {
        o0.a aVarUrl = new o0.a().url(this.f55466a);
        l7.o oVar = this.f55467b;
        o0.a aVarHeaders = aVarUrl.headers(oVar.getHeaders());
        for (Map.Entry<Class<?>, Object> entry : oVar.getTags().asMap().entrySet()) {
            Class<?> key = entry.getKey();
            e0.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            aVarHeaders.tag((Class<? super Class<?>>) key, (Class<?>) entry.getValue());
        }
        boolean readEnabled = oVar.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = oVar.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            aVarHeaders.cacheControl(xv.h.f93648p);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                aVarHeaders.cacheControl(f55465g);
            }
        } else if (oVar.getDiskCachePolicy().getWriteEnabled()) {
            aVarHeaders.cacheControl(xv.h.f93647o);
        } else {
            aVarHeaders.cacheControl(f55464f);
        }
        return aVarHeaders.build();
    }

    public final k7.c d(d7.c cVar) throws Throwable {
        k7.c cVar2;
        try {
            pw.k kVarBuffer = h0.buffer(b().source(cVar.getMetadata()));
            try {
                cVar2 = new k7.c(kVarBuffer);
                th = null;
            } catch (Throwable th2) {
                th = th2;
                cVar2 = null;
            }
            if (kVarBuffer != null) {
                try {
                    kVarBuffer.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        tu.h.addSuppressed(th, th3);
                    }
                }
            }
            if (th != null) {
                throw th;
            }
            e0.checkNotNull(cVar2);
            return cVar2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final s e(d7.c cVar) {
        n0 data = cVar.getData();
        r rVarB = b();
        String diskCacheKey = this.f55467b.getDiskCacheKey();
        if (diskCacheKey == null) {
            diskCacheKey = this.f55466a;
        }
        return t.create(data, rVarB, diskCacheKey, cVar);
    }

    public final d7.c f(d7.c cVar, o0 o0Var, v0 v0Var, k7.c cVar2) throws IOException {
        d7.b bVarEdit;
        Long lValueOf;
        l7.o oVar = this.f55467b;
        Throwable th2 = null;
        if (oVar.getDiskCachePolicy().getWriteEnabled() && (!this.f55470e || k7.d.f70644c.isCacheable(o0Var, v0Var))) {
            if (cVar != null) {
                bVarEdit = cVar.closeAndEdit();
            } else {
                d7.d dVar = (d7.d) this.f55469d.getValue();
                if (dVar != null) {
                    String diskCacheKey = oVar.getDiskCacheKey();
                    if (diskCacheKey == null) {
                        diskCacheKey = this.f55466a;
                    }
                    bVarEdit = dVar.edit(diskCacheKey);
                } else {
                    bVarEdit = null;
                }
            }
            try {
                if (bVarEdit != null) {
                    try {
                        int iCode = v0Var.code();
                        x0 x0Var = x0.f87415a;
                        if (iCode != 304 || cVar2 == null) {
                            pw.j jVarBuffer = h0.buffer(b().sink(bVarEdit.getMetadata(), false));
                            try {
                                new k7.c(v0Var).writeTo(jVarBuffer);
                                th = null;
                            } catch (Throwable th3) {
                                th = th3;
                                x0Var = null;
                            }
                            if (jVarBuffer != null) {
                                try {
                                    jVarBuffer.close();
                                } catch (Throwable th4) {
                                    if (th == null) {
                                        th = th4;
                                    } else {
                                        tu.h.addSuppressed(th, th4);
                                    }
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            e0.checkNotNull(x0Var);
                            pw.j jVarBuffer2 = h0.buffer(b().sink(bVarEdit.getData(), false));
                            try {
                                w0 w0VarBody = v0Var.body();
                                e0.checkNotNull(w0VarBody);
                                lValueOf = Long.valueOf(w0VarBody.source().readAll(jVarBuffer2));
                            } catch (Throwable th5) {
                                th2 = th5;
                                lValueOf = null;
                            }
                            if (jVarBuffer2 != null) {
                                try {
                                    jVarBuffer2.close();
                                } catch (Throwable th6) {
                                    if (th2 == null) {
                                        th2 = th6;
                                    } else {
                                        tu.h.addSuppressed(th2, th6);
                                    }
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            e0.checkNotNull(lValueOf);
                        } else {
                            v0 v0VarBuild = v0Var.newBuilder().headers(k7.d.f70644c.combineHeaders(cVar2.getResponseHeaders(), v0Var.headers())).build();
                            pw.j jVarBuffer3 = h0.buffer(b().sink(bVarEdit.getMetadata(), false));
                            try {
                                new k7.c(v0VarBuild).writeTo(jVarBuffer3);
                            } catch (Throwable th7) {
                                x0Var = null;
                                th2 = th7;
                            }
                            if (jVarBuffer3 != null) {
                                try {
                                    jVarBuffer3.close();
                                } catch (Throwable th8) {
                                    if (th2 == null) {
                                        th2 = th8;
                                    } else {
                                        tu.h.addSuppressed(th2, th8);
                                    }
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            e0.checkNotNull(x0Var);
                        }
                        d7.c cVarCommitAndGet = bVarEdit.commitAndGet();
                        q7.n.closeQuietly(v0Var);
                        return cVarCommitAndGet;
                    } catch (Exception e10) {
                        q7.n.abortQuietly(bVarEdit);
                        throw e10;
                    }
                }
            } catch (Throwable th9) {
                q7.n.closeQuietly(v0Var);
                throw th9;
            }
        } else if (cVar != null) {
            q7.n.closeQuietly(cVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc A[Catch: Exception -> 0x01e2, TryCatch #3 {Exception -> 0x01e2, blocks: (B:85:0x01b3, B:87:0x01bc, B:91:0x01de, B:95:0x01e5, B:96:0x01ea), top: B:108:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5 A[Catch: Exception -> 0x01e2, TryCatch #3 {Exception -> 0x01e2, blocks: (B:85:0x01b3, B:87:0x01bc, B:91:0x01de, B:95:0x01e5, B:96:0x01ea), top: B:108:0x01b3 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // f7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetch(zu.d<? super f7.g> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.k.fetch(zu.d):java.lang.Object");
    }

    public final String getMimeType$coil_base_release(String str, j0 j0Var) {
        String mimeTypeFromUrl;
        String string = j0Var != null ? j0Var.toString() : null;
        if ((string == null || k0.startsWith$default(string, "text/plain", false, 2, null)) && (mimeTypeFromUrl = q7.n.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), str)) != null) {
            return mimeTypeFromUrl;
        }
        if (string != null) {
            return sv.n0.substringBefore$default(string, ';', (String) null, 2, (Object) null);
        }
        return null;
    }
}
