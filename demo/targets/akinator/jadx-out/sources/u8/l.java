package u8;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final String f88092b;

    /* renamed from: c, reason: collision with root package name */
    public final k f88093c;

    /* renamed from: e, reason: collision with root package name */
    public Object f88094e;

    public l(String str, k kVar) {
        this.f88092b = str;
        this.f88093c = kVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        try {
            ((m) this.f88093c).close(this.f88094e);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<Object> getDataClass() {
        return ((m) this.f88093c).getDataClass();
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object objDecode = ((m) this.f88093c).decode(this.f88092b);
            this.f88094e = objDecode;
            dVar.onDataReady(objDecode);
        } catch (IllegalArgumentException e10) {
            dVar.onLoadFailed(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }
}
