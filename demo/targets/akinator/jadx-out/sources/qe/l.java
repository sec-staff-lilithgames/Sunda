package qe;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.exoplayer2.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final r f82843a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f82844b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f82845c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f82846d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCrypto f82847e;

    public l(r rVar, MediaFormat mediaFormat, z0 z0Var, Surface surface, MediaCrypto mediaCrypto) {
        this.f82843a = rVar;
        this.f82844b = mediaFormat;
        this.f82845c = z0Var;
        this.f82846d = surface;
        this.f82847e = mediaCrypto;
    }

    public static l createForAudioDecoding(r rVar, MediaFormat mediaFormat, z0 z0Var, MediaCrypto mediaCrypto) {
        return new l(rVar, mediaFormat, z0Var, null, mediaCrypto);
    }

    public static l createForVideoDecoding(r rVar, MediaFormat mediaFormat, z0 z0Var, Surface surface, MediaCrypto mediaCrypto) {
        return new l(rVar, mediaFormat, z0Var, surface, mediaCrypto);
    }
}
