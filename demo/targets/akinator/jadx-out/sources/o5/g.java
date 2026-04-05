package o5;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public y0 f77565i;

    /* renamed from: j, reason: collision with root package name */
    public CancellationSignal f77566j;

    /* renamed from: k, reason: collision with root package name */
    public Callable f77567k;

    /* renamed from: l, reason: collision with root package name */
    public zu.m f77568l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f77569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f77570n;

    /* renamed from: o, reason: collision with root package name */
    public int f77571o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, zu.d dVar) {
        super(dVar);
        this.f77570n = jVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77569m = obj;
        this.f77571o |= Integer.MIN_VALUE;
        return this.f77570n.execute(null, false, null, null, this);
    }
}
