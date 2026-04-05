package k4;

import java.io.FileOutputStream;
import k4.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f70455i;

    /* renamed from: j, reason: collision with root package name */
    public long f70456j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70457k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q1.a f70458l;

    /* renamed from: m, reason: collision with root package name */
    public int f70459m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1.a aVar, zu.d dVar) {
        super(dVar);
        this.f70458l = aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70457k = obj;
        this.f70459m |= Integer.MIN_VALUE;
        return q1.a.access$getExclusiveFileLockWithRetryIfDeadlock(this.f70458l, null, this);
    }
}
