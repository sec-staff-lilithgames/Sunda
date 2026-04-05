package yv;

import kotlin.jvm.internal.e0;
import xv.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d {
    public static final xv.h commonBuild(h.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        return new xv.h(aVar.getNoCache$okhttp(), aVar.getNoStore$okhttp(), aVar.getMaxAgeSeconds$okhttp(), -1, false, false, false, aVar.getMaxStaleSeconds$okhttp(), aVar.getMinFreshSeconds$okhttp(), aVar.getOnlyIfCached$okhttp(), aVar.getNoTransform$okhttp(), aVar.getImmutable$okhttp(), null);
    }

    public static final int commonClampToInt(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public static final xv.h commonForceCache(h.b bVar) {
        e0.checkNotNullParameter(bVar, "<this>");
        h.a aVarOnlyIfCached = new h.a().onlyIfCached();
        tv.e eVar = tv.f.f87433c;
        return aVarOnlyIfCached.m7928maxStaleLRDsOJo(tv.h.toDuration(Integer.MAX_VALUE, tv.i.f87442g)).build();
    }

    public static final xv.h commonForceNetwork(h.b bVar) {
        e0.checkNotNullParameter(bVar, "<this>");
        return new h.a().noCache().build();
    }

    public static final h.a commonImmutable(h.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        aVar.setImmutable$okhttp(true);
        return aVar;
    }

    public static final h.a commonNoCache(h.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        aVar.setNoCache$okhttp(true);
        return aVar;
    }

    public static final h.a commonNoStore(h.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        aVar.setNoStore$okhttp(true);
        return aVar;
    }

    public static final h.a commonNoTransform(h.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        aVar.setNoTransform$okhttp(true);
        return aVar;
    }

    public static final h.a commonOnlyIfCached(h.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        aVar.setOnlyIfCached$okhttp(true);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final xv.h commonParse(xv.h.b r30, xv.f0 r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.d.commonParse(xv.h$b, xv.f0):xv.h");
    }

    public static final String commonToString(xv.h hVar) {
        e0.checkNotNullParameter(hVar, "<this>");
        String headerValue$okhttp = hVar.getHeaderValue$okhttp();
        if (headerValue$okhttp != null) {
            return headerValue$okhttp;
        }
        StringBuilder sb2 = new StringBuilder();
        if (hVar.noCache()) {
            sb2.append("no-cache, ");
        }
        if (hVar.noStore()) {
            sb2.append("no-store, ");
        }
        if (hVar.maxAgeSeconds() != -1) {
            sb2.append("max-age=");
            sb2.append(hVar.maxAgeSeconds());
            sb2.append(", ");
        }
        if (hVar.sMaxAgeSeconds() != -1) {
            sb2.append("s-maxage=");
            sb2.append(hVar.sMaxAgeSeconds());
            sb2.append(", ");
        }
        if (hVar.isPrivate()) {
            sb2.append("private, ");
        }
        if (hVar.isPublic()) {
            sb2.append("public, ");
        }
        if (hVar.mustRevalidate()) {
            sb2.append("must-revalidate, ");
        }
        if (hVar.maxStaleSeconds() != -1) {
            sb2.append("max-stale=");
            sb2.append(hVar.maxStaleSeconds());
            sb2.append(", ");
        }
        if (hVar.minFreshSeconds() != -1) {
            sb2.append("min-fresh=");
            sb2.append(hVar.minFreshSeconds());
            sb2.append(", ");
        }
        if (hVar.onlyIfCached()) {
            sb2.append("only-if-cached, ");
        }
        if (hVar.noTransform()) {
            sb2.append("no-transform, ");
        }
        if (hVar.immutable()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        e0.checkNotNullExpressionValue(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        hVar.setHeaderValue$okhttp(string);
        return string;
    }
}
