package o9;

import com.digidust.elokence.akinator.activities.AkActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public AkActivity f78053i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.jvm.internal.z0 f78054j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f78055k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AkActivity f78056l;

    /* renamed from: m, reason: collision with root package name */
    public int f78057m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AkActivity akActivity, zu.d dVar) {
        super(dVar);
        this.f78056l = akActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78055k = obj;
        this.f78057m |= Integer.MIN_VALUE;
        return AkActivity.i(this.f78056l, this);
    }
}
