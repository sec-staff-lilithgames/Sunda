package v5;

import android.os.Bundle;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import o6.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f89043c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final w5.a f89044a;

    /* renamed from: b, reason: collision with root package name */
    public final h f89045b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final i create(j owner) {
            e0.checkNotNullParameter(owner, "owner");
            return new i(new w5.a(owner, new v0(owner, 14)), null);
        }
    }

    public i(w5.a aVar, u uVar) {
        this.f89044a = aVar;
        this.f89045b = new h(aVar);
    }

    public static final i create(j jVar) {
        return f89043c.create(jVar);
    }

    public final h getSavedStateRegistry() {
        return this.f89045b;
    }

    public final void performAttach() {
        this.f89044a.performAttach();
    }

    public final void performRestore(Bundle bundle) {
        this.f89044a.performRestore$savedstate_release(bundle);
    }

    public final void performSave(Bundle outBundle) {
        e0.checkNotNullParameter(outBundle, "outBundle");
        this.f89044a.performSave$savedstate_release(outBundle);
    }
}
