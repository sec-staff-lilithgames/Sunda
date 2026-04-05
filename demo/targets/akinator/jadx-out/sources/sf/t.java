package sf;

import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85725b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f85726c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f85727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f85728f;

    public /* synthetic */ t(v vVar, int i10, long j10) {
        this.f85726c = vVar;
        this.f85728f = i10;
        this.f85727e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f85725b) {
            case 0:
                ((p0) ((w) n1.castNonNull(this.f85726c.f85733b))).onDroppedFrames(this.f85728f, this.f85727e);
                break;
            default:
                ((p0) ((w) n1.castNonNull(this.f85726c.f85733b))).onVideoFrameProcessingOffset(this.f85727e, this.f85728f);
                break;
        }
    }

    public /* synthetic */ t(v vVar, long j10, int i10) {
        this.f85726c = vVar;
        this.f85727e = j10;
        this.f85728f = i10;
    }
}
