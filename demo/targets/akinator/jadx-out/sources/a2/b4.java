package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b4 implements e1.y {

    /* renamed from: b, reason: collision with root package name */
    public final p0.j2 f3460b = p0.o5.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    @Override // e1.y, zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) e1.w.fold(this, r10, pVar);
    }

    @Override // e1.y, zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) e1.w.get(this, lVar);
    }

    @Override // e1.y, zu.k
    public /* bridge */ /* synthetic */ zu.l getKey() {
        return super.getKey();
    }

    @Override // e1.y
    public float getScaleFactor() {
        return ((Number) this.f3460b.getValue()).floatValue();
    }

    @Override // e1.y, zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return e1.w.minusKey(this, lVar);
    }

    @Override // e1.y, zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return e1.w.plus(this, mVar);
    }

    public void setScaleFactor(float f10) {
        this.f3460b.setValue(Float.valueOf(f10));
    }
}
