package u8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f88074b;

    /* renamed from: c, reason: collision with root package name */
    public final e f88075c;

    public f(byte[] bArr, e eVar) {
        this.f88074b = bArr;
        this.f88075c = eVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<Object> getDataClass() {
        return this.f88075c.getDataClass();
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, com.bumptech.glide.load.data.d dVar) {
        dVar.onDataReady(this.f88075c.convert(this.f88074b));
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}
