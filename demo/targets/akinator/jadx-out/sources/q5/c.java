package q5;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public b f82410i;

    /* renamed from: j, reason: collision with root package name */
    public SQLiteDatabase f82411j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f82412k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f82413l;

    /* renamed from: m, reason: collision with root package name */
    public int f82414m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, zu.d dVar) {
        super(dVar);
        this.f82413l = bVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f82412k = obj;
        this.f82414m |= Integer.MIN_VALUE;
        return this.f82413l.a(null, null, this);
    }
}
