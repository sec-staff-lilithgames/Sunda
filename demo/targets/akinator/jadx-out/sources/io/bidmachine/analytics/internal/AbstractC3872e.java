package io.bidmachine.analytics.internal;

import android.content.Context;
import b0.e2;
import io.bidmachine.analytics.internal.AbstractC3874g;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC3872e extends AbstractC3874g implements InterfaceC3873f {

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3873f f60012d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f60013e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f60014f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    private b f60015g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.e$a */
    public enum a {
        UNSPECIFIED,
        BANNER,
        INTERSTITIAL,
        REWARDED,
        NATIVE
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f60022a;

        /* renamed from: b, reason: collision with root package name */
        private final float f60023b;

        /* renamed from: c, reason: collision with root package name */
        private final String f60024c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60025d;

        public b(int i10, float f10, String str) {
            this.f60022a = i10;
            this.f60023b = f10;
            this.f60024c = str;
            this.f60025d = f10 * 1000;
        }

        public final b a(int i10, float f10, String str) {
            return new b(i10, f10, str);
        }

        public final float b() {
            return this.f60025d;
        }

        public final String c() {
            return this.f60024c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f60022a == bVar.f60022a && Float.compare(this.f60023b, bVar.f60023b) == 0 && kotlin.jvm.internal.e0.areEqual(this.f60024c, bVar.f60024c);
        }

        public int hashCode() {
            return this.f60024c.hashCode() + e2.b(this.f60023b, Integer.hashCode(this.f60022a) * 31, 31);
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ b a(b bVar, int i10, float f10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = bVar.f60022a;
            }
            if ((i11 & 2) != 0) {
                f10 = bVar.f60023b;
            }
            if ((i11 & 4) != 0) {
                str = bVar.f60024c;
            }
            return bVar.a(i10, f10, str);
        }

        public final int a() {
            return this.f60022a;
        }

        public /* synthetic */ b(int i10, float f10, String str, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? 0 : i10, f10, str);
        }
    }

    public void a(AbstractC3874g.a aVar) {
        this.f60012d = aVar.a();
    }

    public final b b() {
        b bVar;
        synchronized (this.f60013e) {
            bVar = this.f60015g;
        }
        return bVar;
    }

    public abstract b b(Map map);

    public abstract a c(Map map);

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void f(Context context) {
        synchronized (this.f60013e) {
            this.f60014f.clear();
            this.f60015g = null;
        }
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC3873f
    public void a(Map map) {
        b bVarB;
        InterfaceC3873f interfaceC3873f = this.f60012d;
        if (interfaceC3873f != null) {
            interfaceC3873f.a(map);
        }
        a aVarC = c(map);
        if (aVarC == null || (bVarB = b(map)) == null) {
            return;
        }
        synchronized (this.f60013e) {
            try {
                b bVar = this.f60015g;
                this.f60015g = b.a(bVarB, (bVar != null ? bVar.a() : 0) + 1, 0.0f, null, 6, null);
                b bVar2 = (b) this.f60014f.get(aVarC);
                this.f60014f.put(aVarC, bVar2 == null ? b.a(bVarB, 1, 0.0f, null, 6, null) : b.a(bVarB, bVar2.a() + 1, 0.0f, null, 6, null));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC3873f
    public void a(q0 q0Var) {
        InterfaceC3873f interfaceC3873f = this.f60012d;
        if (interfaceC3873f != null) {
            interfaceC3873f.a(q0Var);
        }
    }

    public final b a(a aVar) {
        b bVar;
        synchronized (this.f60013e) {
            bVar = (b) this.f60014f.get(aVar);
        }
        return bVar;
    }
}
