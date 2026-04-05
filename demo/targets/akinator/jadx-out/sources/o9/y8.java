package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y8 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public SplashscreenActivity f78697i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f78698j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78699k;

    /* renamed from: l, reason: collision with root package name */
    public int f78700l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(dVar);
        this.f78699k = splashscreenActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78698j = obj;
        this.f78700l |= Integer.MIN_VALUE;
        return this.f78699k.t(this);
    }
}
