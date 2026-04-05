package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import org.json.JSONArray;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface CacheRepository {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i10, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i11 & 2) != 0) {
                jSONArray = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return cacheRepository.getFile(str, jSONArray, i10, dVar);
        }
    }

    Object clearCache(d<? super x0> dVar);

    Object doesFileExist(String str, d<? super Boolean> dVar);

    Object getCacheSize(d<? super Long> dVar);

    Object getFile(String str, JSONArray jSONArray, int i10, d<? super CacheResult> dVar);

    Object getWebviewFile(String str, String str2, d<? super CacheResult> dVar);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, d<? super CacheResult> dVar);
}
