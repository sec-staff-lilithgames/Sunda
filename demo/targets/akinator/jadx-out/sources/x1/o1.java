package x1;

import a2.x3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 extends x3 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final kv.l f91390e;

    /* renamed from: f, reason: collision with root package name */
    public long f91391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(kv.l onSizeChanged, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f91390e = onSizeChanged;
        this.f91391f = s2.w.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(this.f91390e, ((o1) obj).f91390e);
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final kv.l getOnSizeChanged() {
        return this.f91390e;
    }

    public int hashCode() {
        return this.f91390e.hashCode();
    }

    @Override // x1.m1
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo3761onRemeasuredozmzZPI(long j10) {
        if (s2.v.m6970equalsimpl0(this.f91391f, j10)) {
            return;
        }
        this.f91390e.invoke(s2.v.m6964boximpl(j10));
        this.f91391f = j10;
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
