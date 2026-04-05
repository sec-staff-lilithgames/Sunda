package fx;

import retrofit2.Call;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Call f56304b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f56305c;

    public e(Call call) {
        this.f56304b = call;
    }

    @Override // pt.c
    public void dispose() {
        this.f56305c = true;
        this.f56304b.cancel();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f56305c;
    }
}
