package c7;

import android.graphics.BitmapFactory;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f11831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(0);
        this.f11831e = bVar;
    }

    @Override // kv.a
    public final g invoke() {
        return b.access$decode(this.f11831e, new BitmapFactory.Options());
    }
}
