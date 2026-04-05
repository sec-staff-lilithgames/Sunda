package so;

import ko.c0;
import ko.e1;
import ko.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f86064b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f86065c;

    public f(long j10, c0 c0Var) {
        this.f86064b = j10;
        this.f86065c = c0Var;
    }

    @Override // ko.c0
    public void endTracks() {
        this.f86065c.endTracks();
    }

    @Override // ko.c0
    public void seekMap(y0 y0Var) {
        this.f86065c.seekMap(new e(this, y0Var, y0Var));
    }

    @Override // ko.c0
    public e1 track(int i10, int i11) {
        return this.f86065c.track(i10, i11);
    }
}
