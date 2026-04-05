package m7;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f74068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f74069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f74070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ViewTreeObserver viewTreeObserver, o oVar) {
        super(1);
        this.f74068e = pVar;
        this.f74069f = viewTreeObserver;
        this.f74070g = oVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        m.access$removePreDrawListenerSafe(this.f74068e, this.f74069f, this.f74070g);
    }
}
