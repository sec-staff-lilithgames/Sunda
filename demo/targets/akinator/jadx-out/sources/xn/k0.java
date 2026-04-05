package xn;

import android.media.MediaCodec;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class k0 implements q {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f92103a;

    public k0(MediaCodec mediaCodec) {
        this.f92103a = mediaCodec;
    }

    @Override // xn.q
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f92103a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // xn.q
    public void queueSecureInputBuffer(int i10, int i11, nn.d dVar, long j10, int i12) throws MediaCodec.CryptoException {
        this.f92103a.queueSecureInputBuffer(i10, i11, dVar.getFrameworkCryptoInfo(), j10, i12);
    }

    @Override // xn.q
    public void setParameters(Bundle bundle) {
        this.f92103a.setParameters(bundle);
    }

    @Override // xn.q
    public void flush() {
    }

    @Override // xn.q
    public void maybeThrowException() {
    }

    @Override // xn.q
    public void shutdown() {
    }

    @Override // xn.q
    public void start() {
    }

    @Override // xn.q
    public void waitUntilQueueingComplete() {
    }
}
