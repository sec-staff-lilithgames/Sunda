package xn;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final s f92104a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f92105b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f92106c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f92107d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCrypto f92108e;

    /* renamed from: f, reason: collision with root package name */
    public final k f92109f;

    public l(s sVar, MediaFormat mediaFormat, io.bidmachine.media3.common.b bVar, Surface surface, MediaCrypto mediaCrypto, k kVar) {
        this.f92104a = sVar;
        this.f92105b = mediaFormat;
        this.f92106c = bVar;
        this.f92107d = surface;
        this.f92108e = mediaCrypto;
        this.f92109f = kVar;
    }

    public static l createForAudioDecoding(s sVar, MediaFormat mediaFormat, io.bidmachine.media3.common.b bVar, MediaCrypto mediaCrypto, k kVar) {
        return new l(sVar, mediaFormat, bVar, null, mediaCrypto, kVar);
    }

    public static l createForVideoDecoding(s sVar, MediaFormat mediaFormat, io.bidmachine.media3.common.b bVar, Surface surface, MediaCrypto mediaCrypto) {
        return new l(sVar, mediaFormat, bVar, surface, mediaCrypto, null);
    }
}
