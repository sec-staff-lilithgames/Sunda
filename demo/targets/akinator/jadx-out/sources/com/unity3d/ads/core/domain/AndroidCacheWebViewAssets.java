package com.unity3d.ads.core.domain;

import a.b;
import bv.d;
import bv.f;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {
    private final ConcurrentHashMap<String, File> _cached;
    private final CacheRepository cacheRepository;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidCacheWebViewAssets", f = "AndroidCacheWebViewAssets.kt", i = {0, 0, 1, 1, 1}, l = {35, 45}, m = "invoke", n = {"this", "webviewConfiguration", "this", "webviewConfiguration", "additionalFile"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheWebViewAssets.this.invoke(null, this);
        }
    }

    public AndroidCacheWebViewAssets(CacheRepository cacheRepository, SessionRepository sessionRepository) {
        e0.checkNotNullParameter(cacheRepository, "cacheRepository");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new ConcurrentHashMap<>();
    }

    private final String getFilename(String str, String str2) {
        StringBuilder sbS = b.s(str2, '/');
        sbS.append(n0.substringAfterLast$default(n0.substringBefore$default(str, '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null));
        return sbS.toString();
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    public Map<String, File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e9 -> B:39:0x00ec). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.WebViewConfiguration r9, zu.d<? super tu.x0> r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets.invoke(com.unity3d.ads.core.data.model.WebViewConfiguration, zu.d):java.lang.Object");
    }
}
