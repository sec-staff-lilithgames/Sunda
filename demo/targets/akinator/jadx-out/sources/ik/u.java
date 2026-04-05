package ik;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f59721i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f59722j;

    /* renamed from: k, reason: collision with root package name */
    public int f59723k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, zu.d dVar) {
        super(dVar);
        this.f59722j = zVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f59721i = obj;
        this.f59723k |= Integer.MIN_VALUE;
        return this.f59722j.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
