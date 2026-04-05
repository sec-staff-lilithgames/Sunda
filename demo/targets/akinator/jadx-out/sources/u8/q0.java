package u8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q0 implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f88104b;

    /* renamed from: c, reason: collision with root package name */
    public final w3.f f88105c;

    /* renamed from: e, reason: collision with root package name */
    public int f88106e;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.l f88107f;

    /* renamed from: g, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f88108g;

    /* renamed from: h, reason: collision with root package name */
    public List f88109h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f88110i;

    public q0(ArrayList arrayList, w3.f fVar) {
        this.f88105c = fVar;
        j9.q.checkNotEmpty(arrayList);
        this.f88104b = arrayList;
        this.f88106e = 0;
    }

    public final void a() {
        if (this.f88110i) {
            return;
        }
        if (this.f88106e < this.f88104b.size() - 1) {
            this.f88106e++;
            loadData(this.f88107f, this.f88108g);
        } else {
            j9.q.checkNotNull(this.f88109h);
            this.f88108g.onLoadFailed(new p8.q0("Fetch failed", new ArrayList(this.f88109h)));
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
        this.f88110i = true;
        Iterator it = this.f88104b.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        List list = this.f88109h;
        if (list != null) {
            this.f88105c.release(list);
        }
        this.f88109h = null;
        Iterator it = this.f88104b.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cleanup();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<Object> getDataClass() {
        return ((com.bumptech.glide.load.data.e) this.f88104b.get(0)).getDataClass();
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return ((com.bumptech.glide.load.data.e) this.f88104b.get(0)).getDataSource();
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, com.bumptech.glide.load.data.d dVar) {
        this.f88107f = lVar;
        this.f88108g = dVar;
        this.f88109h = (List) this.f88105c.acquire();
        ((com.bumptech.glide.load.data.e) this.f88104b.get(this.f88106e)).loadData(lVar, this);
        if (this.f88110i) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void onDataReady(Object obj) {
        if (obj != null) {
            this.f88108g.onDataReady(obj);
        } else {
            a();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void onLoadFailed(Exception exc) {
        ((List) j9.q.checkNotNull(this.f88109h)).add(exc);
        a();
    }
}
