package k4;

import java.io.Serializable;
import java.util.Iterator;
import k4.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Serializable f70369i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f70370j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70371k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m.a f70372l;

    /* renamed from: m, reason: collision with root package name */
    public int f70373m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m.a aVar, zu.d dVar) {
        super(dVar);
        this.f70372l = aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70371k = obj;
        this.f70373m |= Integer.MIN_VALUE;
        return m.a.access$runMigrations(this.f70372l, null, null, this);
    }
}
