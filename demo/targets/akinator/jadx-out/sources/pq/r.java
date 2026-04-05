package pq;

import android.view.ViewGroup;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f81783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar) {
        super(0);
        this.f81783e = mVar;
    }

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer invoke() {
        ViewGroup viewGroupC = this.f81783e.e().c();
        if (viewGroupC != null) {
            return Integer.valueOf(viewGroupC.getId());
        }
        return null;
    }
}
