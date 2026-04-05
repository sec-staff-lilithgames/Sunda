package qe;

import android.os.HandlerThread;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements v2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82784c;

    public /* synthetic */ a(int i10, int i11) {
        this.f82783b = i11;
        this.f82784c = i10;
    }

    @Override // mh.v2
    public final Object get() {
        switch (this.f82783b) {
            case 0:
                return new HandlerThread(c.a(this.f82784c, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(c.a(this.f82784c, "ExoPlayer:MediaCodecQueueingThread:"));
            case 2:
                return new HandlerThread(xn.b.b(this.f82784c, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(xn.b.b(this.f82784c, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
