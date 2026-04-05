package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m9 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public SplashscreenActivity f78370i;

    /* renamed from: j, reason: collision with root package name */
    public Object f78371j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f78372k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78373l;

    /* renamed from: m, reason: collision with root package name */
    public int f78374m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(dVar);
        this.f78373l = splashscreenActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78372k = obj;
        this.f78374m |= Integer.MIN_VALUE;
        return SplashscreenActivity.access$initializeAll(this.f78373l, this);
    }
}
