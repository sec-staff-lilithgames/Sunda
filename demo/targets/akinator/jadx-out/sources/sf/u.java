package sf;

import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f85730c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce.f f85731e;

    public /* synthetic */ u(v vVar, ce.f fVar, int i10) {
        this.f85729b = i10;
        this.f85730c = vVar;
        this.f85731e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f85729b) {
            case 0:
                v vVar = this.f85730c;
                vVar.getClass();
                ce.f fVar = this.f85731e;
                fVar.ensureUpdated();
                ((p0) ((w) n1.castNonNull(vVar.f85733b))).onVideoDisabled(fVar);
                break;
            default:
                ((p0) ((w) n1.castNonNull(this.f85730c.f85733b))).onVideoEnabled(this.f85731e);
                break;
        }
    }
}
