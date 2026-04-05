package ef;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f54321g;

    public h(i iVar) {
        this.f54321g = iVar;
    }

    @Override // ce.j
    public void release() {
        i iVar = this.f54321g;
        synchronized (iVar.f12251b) {
            clear();
            ce.j[] jVarArr = iVar.f12255f;
            int i10 = iVar.f12257h;
            iVar.f12257h = i10 + 1;
            jVarArr[i10] = this;
            if (!iVar.f12252c.isEmpty() && iVar.f12257h > 0) {
                iVar.f12251b.notify();
            }
        }
    }
}
