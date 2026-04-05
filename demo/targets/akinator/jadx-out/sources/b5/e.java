package b5;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // b5.a
    public <T> T get(c key) {
        e0.checkNotNullParameter(key, "key");
        return (T) getExtras$lifecycle_viewmodel_release().get(key);
    }

    public final <T> void set(c key, T t10) {
        e0.checkNotNullParameter(key, "key");
        getExtras$lifecycle_viewmodel_release().put(key, t10);
    }

    public e(Map<c, ? extends Object> initialExtras) {
        e0.checkNotNullParameter(initialExtras, "initialExtras");
        getExtras$lifecycle_viewmodel_release().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(a initialExtras) {
        this((Map<c, ? extends Object>) initialExtras.getExtras$lifecycle_viewmodel_release());
        e0.checkNotNullParameter(initialExtras, "initialExtras");
    }

    public /* synthetic */ e(a aVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? b.f8750c : aVar);
    }
}
