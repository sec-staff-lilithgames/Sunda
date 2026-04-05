package u8;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f88111b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f88112c;

    /* renamed from: e, reason: collision with root package name */
    public final s f88113e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88114f;

    /* renamed from: g, reason: collision with root package name */
    public Object f88115g;

    public r(Resources.Theme theme, Resources resources, s sVar, int i10) {
        this.f88111b = theme;
        this.f88112c = resources;
        this.f88113e = sVar;
        this.f88114f = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        Object obj = this.f88115g;
        if (obj != null) {
            try {
                this.f88113e.close(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<Object> getDataClass() {
        return this.f88113e.getDataClass();
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object objOpen = this.f88113e.open(this.f88111b, this.f88112c, this.f88114f);
            this.f88115g = objOpen;
            dVar.onDataReady(objOpen);
        } catch (Resources.NotFoundException e10) {
            dVar.onLoadFailed(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }
}
