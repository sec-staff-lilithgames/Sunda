package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheResult;
import java.io.File;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface CacheDataSource {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i10 & 8) != 0) {
                num = Integer.MAX_VALUE;
            }
            return cacheDataSource.getFile(file, str, str3, num, dVar);
        }
    }

    Object getFile(File file, String str, String str2, Integer num, d<? super CacheResult> dVar);
}
