package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i {
    public static FilterInputStream a(InputStream inputStream, boolean z10) {
        try {
            if (z10) {
                IAlog.a("HttpExecutorBase: getInputStream found gzip encoding", new Object[0]);
                return new GZIPInputStream(inputStream);
            }
            IAlog.a("HttpExecutorBase: getInputStream no gzip encoding", new Object[0]);
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static l a(FilterInputStream filterInputStream, int i10, String str, Map map, String str2) throws b, q1 {
        try {
            l lVar = new l(filterInputStream, i10, str, map, str2);
            if (lVar.f24237a / 100 != 5) {
                return lVar;
            }
            throw new b(String.format("server returned error %d", Integer.valueOf(lVar.f24237a)));
        } catch (b e10) {
            IAlog.a("failed executing network request", e10, new Object[0]);
            throw new b(e10);
        } catch (Exception e11) {
            IAlog.a("failed reading network response", e11, new Object[0]);
            throw new q1(e11);
        }
    }
}
