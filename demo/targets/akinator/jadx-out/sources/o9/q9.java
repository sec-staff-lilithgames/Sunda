package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q9 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f78468i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78469j;

    /* renamed from: k, reason: collision with root package name */
    public int f78470k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(dVar);
        this.f78469j = splashscreenActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78468i = obj;
        this.f78470k |= Integer.MIN_VALUE;
        return SplashscreenActivity.access$postInitSessionFactory(this.f78469j, 0, this);
    }
}
