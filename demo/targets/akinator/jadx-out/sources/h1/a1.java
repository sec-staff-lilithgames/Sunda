package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f58531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f58532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f58533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.l f58534h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(s sVar, s sVar2, int i10, kv.l lVar) {
        super(1);
        this.f58531e = sVar;
        this.f58532f = sVar2;
        this.f58533g = i10;
        this.f58534h = lVar;
    }

    @Override // kv.l
    public /* synthetic */ Object invoke(Object obj) {
        if (obj == null) {
            return invoke((x1.e) null);
        }
        throw new ClassCastException();
    }

    public final Boolean invoke(x1.e searchBeyondBounds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        boolean zE = c1.e(this.f58531e, this.f58532f, this.f58533g, this.f58534h);
        Boolean boolValueOf = Boolean.valueOf(zE);
        if (zE || !searchBeyondBounds.a()) {
            return boolValueOf;
        }
        return null;
    }
}
