package pq;

import android.content.Context;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f81782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar) {
        super(0);
        this.f81782e = mVar;
    }

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eq.b invoke() {
        m mVar = this.f81782e;
        Context applicationContext = mVar.f81652e;
        e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
        return new eq.b(applicationContext, mVar.f81653f);
    }
}
