package pn;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import go.c0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import ln.m;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class r {
    public static qn.l a(qn.g gVar, int i10) {
        int adaptationSetIndex = gVar.getAdaptationSetIndex(i10);
        if (adaptationSetIndex == -1) {
            return null;
        }
        List list = ((qn.a) gVar.f83342c.get(adaptationSetIndex)).f83297c;
        if (list.isEmpty()) {
            return null;
        }
        return (qn.l) list.get(0);
    }

    public static void b(co.h hVar, ln.i iVar, qn.l lVar, int i10, boolean z10) throws IOException {
        qn.i iVar2 = (qn.i) io.bidmachine.media3.common.util.a.checkNotNull(lVar.getInitializationUri());
        if (z10) {
            qn.i indexUri = lVar.getIndexUri();
            if (indexUri == null) {
                return;
            }
            qn.i iVarAttemptMerge = iVar2.attemptMerge(indexUri, ((qn.b) lVar.f83358b.get(i10)).f83301a);
            if (iVarAttemptMerge == null) {
                c(iVar, lVar, i10, hVar, iVar2);
                iVar2 = indexUri;
            } else {
                iVar2 = iVarAttemptMerge;
            }
        }
        c(iVar, lVar, i10, hVar, iVar2);
    }

    public static ln.m buildDataSpec(qn.l lVar, String str, qn.i iVar, int i10, Map<String, String> map) {
        return new m.a().setUri(iVar.resolveUri(str)).setPosition(iVar.f83349a).setLength(iVar.f83350b).setKey(resolveCacheKey(lVar, iVar)).setFlags(i10).setHttpRequestHeaders(map).build();
    }

    public static void c(ln.i iVar, qn.l lVar, int i10, co.h hVar, qn.i iVar2) throws IOException {
        new co.o(iVar, buildDataSpec(lVar, ((qn.b) lVar.f83358b.get(i10)).f83301a, iVar2, 0, m5.of()), lVar.f83357a, 0, null, hVar).load();
    }

    public static co.d d(io.bidmachine.media3.common.b bVar, int i10) {
        String str = bVar.f60664n;
        hp.p pVar = hp.q.f59124a;
        return new co.d((str == null || !(str.startsWith("video/webm") || str.startsWith(MimeTypes.AUDIO_WEBM))) ? new ep.s(pVar, 32) : new cp.h(pVar, 2), i10, bVar);
    }

    public static ko.q loadChunkIndex(ln.i iVar, int i10, qn.l lVar, int i11) throws IOException {
        if (lVar.getInitializationUri() == null) {
            return null;
        }
        co.d dVarD = d(lVar.f83357a, i10);
        try {
            b(dVarD, iVar, lVar, i11, true);
            dVarD.release();
            return dVarD.getChunkIndex();
        } catch (Throwable th2) {
            dVarD.release();
            throw th2;
        }
    }

    public static io.bidmachine.media3.common.b loadFormatWithDrmInitData(ln.i iVar, qn.g gVar) throws IOException {
        int i10 = 2;
        qn.l lVarA = a(gVar, 2);
        if (lVarA == null) {
            i10 = 1;
            lVarA = a(gVar, 1);
            if (lVarA == null) {
                return null;
            }
        }
        io.bidmachine.media3.common.b bVar = lVarA.f83357a;
        io.bidmachine.media3.common.b bVarLoadSampleFormat = loadSampleFormat(iVar, i10, lVarA);
        return bVarLoadSampleFormat == null ? bVar : bVarLoadSampleFormat.withManifestFormatInfo(bVar);
    }

    public static void loadInitializationData(co.h hVar, ln.i iVar, qn.l lVar, boolean z10) throws IOException {
        b(hVar, iVar, lVar, 0, z10);
    }

    public static qn.c loadManifest(ln.i iVar, Uri uri) throws IOException {
        return (qn.c) c0.load(iVar, new qn.d(), uri, 4);
    }

    public static io.bidmachine.media3.common.b loadSampleFormat(ln.i iVar, int i10, qn.l lVar, int i11) throws IOException {
        if (lVar.getInitializationUri() == null) {
            return null;
        }
        co.d dVarD = d(lVar.f83357a, i10);
        try {
            b(dVarD, iVar, lVar, i11, false);
            dVarD.release();
            return ((io.bidmachine.media3.common.b[]) io.bidmachine.media3.common.util.a.checkStateNotNull(dVarD.getSampleFormats()))[0];
        } catch (Throwable th2) {
            dVarD.release();
            throw th2;
        }
    }

    public static String resolveCacheKey(qn.l lVar, qn.i iVar) {
        String cacheKey = lVar.getCacheKey();
        return cacheKey != null ? cacheKey : iVar.resolveUri(((qn.b) lVar.f83358b.get(0)).f83301a).toString();
    }

    public static ko.q loadChunkIndex(ln.i iVar, int i10, qn.l lVar) throws IOException {
        return loadChunkIndex(iVar, i10, lVar, 0);
    }

    public static io.bidmachine.media3.common.b loadSampleFormat(ln.i iVar, int i10, qn.l lVar) throws IOException {
        return loadSampleFormat(iVar, i10, lVar, 0);
    }

    @Deprecated
    public static ln.m buildDataSpec(qn.l lVar, String str, qn.i iVar, int i10) {
        return buildDataSpec(lVar, str, iVar, i10, m5.of());
    }

    @Deprecated
    public static ln.m buildDataSpec(qn.l lVar, qn.i iVar, int i10) {
        return buildDataSpec(lVar, ((qn.b) lVar.f83358b.get(0)).f83301a, iVar, i10, m5.of());
    }
}
