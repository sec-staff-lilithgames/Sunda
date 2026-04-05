package xn;

import android.media.MediaCodec;
import io.bidmachine.media3.common.util.w0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i0 implements m {
    public static MediaCodec a(l lVar) throws IOException {
        io.bidmachine.media3.common.util.a.checkNotNull(lVar.f92104a);
        String str = lVar.f92104a.f92111a;
        w0.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        w0.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    @Override // xn.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xn.p createAdapter(xn.l r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = a(r6)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            java.lang.String r1 = "configureCodec"
            io.bidmachine.media3.common.util.w0.beginSection(r1)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            android.view.Surface r1 = r6.f92107d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            if (r1 != 0) goto L21
            xn.s r2 = r6.f92104a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            boolean r2 = r2.f92120j     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            if (r2 == 0) goto L21
            int r2 = io.bidmachine.media3.common.util.a1.f60679a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            r3 = 35
            if (r2 < r3) goto L21
            r2 = 8
            goto L22
        L1d:
            r6 = move-exception
            goto L3f
        L1f:
            r6 = move-exception
            goto L3f
        L21:
            r2 = 0
        L22:
            android.media.MediaFormat r3 = r6.f92105b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            android.media.MediaCrypto r4 = r6.f92108e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            io.bidmachine.media3.common.util.w0.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            java.lang.String r1 = "startCodec"
            io.bidmachine.media3.common.util.w0.beginSection(r1)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            r0.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            io.bidmachine.media3.common.util.w0.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            xn.j0 r1 = new xn.j0     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            xn.k r6 = r6.f92109f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            return r1
        L3f:
            if (r0 == 0) goto L44
            r0.release()
        L44:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.i0.createAdapter(xn.l):xn.p");
    }
}
