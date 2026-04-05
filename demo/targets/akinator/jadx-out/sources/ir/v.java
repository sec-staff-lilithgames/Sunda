package ir;

import android.view.View;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f68369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f68370f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(View view, w wVar) {
        super(1);
        this.f68369e = view;
        this.f68370f = wVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        this.f68369e.removeOnLayoutChangeListener(this.f68370f);
    }
}
