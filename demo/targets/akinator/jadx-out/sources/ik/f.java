package ik;

import org.json.JSONObject;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f59684i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f59685j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f59686k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, zu.d dVar2) {
        super(2, dVar2);
        this.f59686k = dVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        f fVar = new f(this.f59686k, dVar);
        fVar.f59685j = obj;
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[RETURN] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(JSONObject jSONObject, zu.d<? super x0> dVar) {
        return ((f) create(jSONObject, dVar)).invokeSuspend(x0.f87415a);
    }
}
