package u8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c1 implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f88064b;

    public c1(Object obj) {
        this.f88064b = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<Object> getDataClass() {
        return this.f88064b.getClass();
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, com.bumptech.glide.load.data.d dVar) {
        dVar.onDataReady(this.f88064b);
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}
