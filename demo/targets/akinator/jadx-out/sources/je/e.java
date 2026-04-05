package je;

import ee.i0;
import ee.l0;
import ee.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements s {

    /* renamed from: b, reason: collision with root package name */
    public final long f69524b;

    /* renamed from: c, reason: collision with root package name */
    public final s f69525c;

    public e(long j10, s sVar) {
        this.f69524b = j10;
        this.f69525c = sVar;
    }

    @Override // ee.s
    public void endTracks() {
        this.f69525c.endTracks();
    }

    @Override // ee.s
    public void seekMap(i0 i0Var) {
        this.f69525c.seekMap(new d(this, i0Var));
    }

    @Override // ee.s
    public l0 track(int i10, int i11) {
        return this.f69525c.track(i10, i11);
    }
}
