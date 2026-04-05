package androidx.recyclerview.widget;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f7121a;

    public g(i iVar) {
        this.f7121a = iVar;
    }

    @Override // androidx.recyclerview.widget.g0
    public boolean areContentsTheSame(int i10, int i11) {
        i iVar = this.f7121a;
        Object obj = iVar.f7140b.get(i10);
        Object obj2 = iVar.f7141c.get(i11);
        if (obj != null && obj2 != null) {
            return iVar.f7144g.f7174b.getDiffCallback().areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.g0
    public boolean areItemsTheSame(int i10, int i11) {
        i iVar = this.f7121a;
        Object obj = iVar.f7140b.get(i10);
        Object obj2 = iVar.f7141c.get(i11);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : iVar.f7144g.f7174b.getDiffCallback().areItemsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.g0
    public Object getChangePayload(int i10, int i11) {
        i iVar = this.f7121a;
        Object obj = iVar.f7140b.get(i10);
        Object obj2 = iVar.f7141c.get(i11);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return iVar.f7144g.f7174b.getDiffCallback().getChangePayload(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.g0
    public int getNewListSize() {
        return this.f7121a.f7141c.size();
    }

    @Override // androidx.recyclerview.widget.g0
    public int getOldListSize() {
        return this.f7121a.f7140b.size();
    }
}
