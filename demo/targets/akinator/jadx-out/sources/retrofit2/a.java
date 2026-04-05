package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f84310c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callback f84311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f84312f;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i10) {
        this.f84309b = i10;
        this.f84310c = anonymousClass1;
        this.f84311e = callback;
        this.f84312f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f84309b) {
            case 0:
                this.f84310c.lambda$onResponse$0(this.f84311e, (Response) this.f84312f);
                break;
            default:
                this.f84310c.lambda$onFailure$1(this.f84311e, (Throwable) this.f84312f);
                break;
        }
    }
}
