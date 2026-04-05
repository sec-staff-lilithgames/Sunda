package l1;

import j1.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final k f72227a = d.access$asDrawTransform(this);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f72228b;

    public b(a aVar) {
        this.f72228b = aVar;
    }

    @Override // l1.f
    public e0 getCanvas() {
        return this.f72228b.getDrawParams().getCanvas();
    }

    @Override // l1.f
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public long mo5320getSizeNHjbRc() {
        return this.f72228b.getDrawParams().m5318getSizeNHjbRc();
    }

    @Override // l1.f
    public k getTransform() {
        return this.f72227a;
    }

    @Override // l1.f
    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void mo5321setSizeuvyYCjk(long j10) {
        this.f72228b.getDrawParams().m5319setSizeuvyYCjk(j10);
    }
}
