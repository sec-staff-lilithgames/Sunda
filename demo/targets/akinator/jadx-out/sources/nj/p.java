package nj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class p implements st.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76988b;

    @Override // st.a
    public final void run() {
        switch (this.f76988b) {
            case 0:
                j0.logd("Impression store write success");
                break;
            case 1:
                j0.logd("Rate limiter client write success");
                break;
            default:
                j0.logd("Wrote to cache");
                break;
        }
    }
}
