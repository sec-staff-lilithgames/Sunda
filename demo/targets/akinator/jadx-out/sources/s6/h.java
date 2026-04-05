package s6;

import android.os.Build;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import n6.c0;
import n6.d0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final String f85482c;

    /* renamed from: b, reason: collision with root package name */
    public final int f85483b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        String strTagWithPrefix = c0.tagWithPrefix("NetworkMeteredCtrlr");
        e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f85482c = strTagWithPrefix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t6.f tracker) {
        super(tracker);
        e0.checkNotNullParameter(tracker, "tracker");
        this.f85483b = 7;
    }

    @Override // s6.c
    public final int a() {
        return this.f85483b;
    }

    @Override // s6.c, s6.f
    public boolean hasConstraint(b0 workSpec) {
        e0.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f89062j.getRequiredNetworkType() == d0.f75709g;
    }

    @Override // s6.c
    public boolean isConstrained(Object obj) {
        r6.i value = (r6.i) obj;
        e0.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.isConnected() && value.isMetered()) ? false : true;
        }
        c0.get().debug(f85482c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !value.isConnected();
    }
}
