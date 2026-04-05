package oq;

import br.n0;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements tq.f {

    /* renamed from: c, reason: collision with root package name */
    public static final List f79738c;

    /* renamed from: a, reason: collision with root package name */
    public final b f79739a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f79740b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f79738c = o0.listOf(n0.OnClick);
    }

    public c(b animationController, kv.a aVar) {
        e0.checkNotNullParameter(animationController, "animationController");
        this.f79739a = animationController;
        this.f79740b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @Override // tq.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.util.List<? extends java.lang.Object> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r0)
            r0 = 0
            java.lang.Object r1 = uu.y0.getOrNull(r9, r0)
            boolean r2 = r1 instanceof br.n0
            if (r2 != 0) goto Lf
            return r0
        Lf:
            r2 = 1
            java.lang.Object r9 = uu.y0.getOrNull(r9, r2)
            boolean r3 = r9 instanceof java.lang.Integer
            if (r3 != 0) goto L19
            return r0
        L19:
            java.util.List r3 = oq.c.f79738c
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L22
            return r0
        L22:
            r3 = 0
            kv.a r4 = r8.f79740b
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r4.invoke()
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L2f
        L2e:
            r4 = r3
        L2f:
            oq.b r5 = r8.f79739a
            if (r4 == 0) goto L46
            int r6 = r4.intValue()
            r7 = -1
            if (r6 == r7) goto L3b
            r3 = r4
        L3b:
            if (r3 == 0) goto L46
            int r3 = r3.intValue()
            boolean r3 = r5.a(r3)
            goto L47
        L46:
            r3 = r0
        L47:
            r4 = r9
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            boolean r4 = r5.a(r4)
            if (r3 != 0) goto L58
            if (r4 == 0) goto L57
            goto L58
        L57:
            r2 = r0
        L58:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Intercept result="
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = "; eventType="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "; viewId="
            r3.append(r1)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "AdAnimationEventInterceptor"
            dq.d0.b(r1, r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c.a(java.util.List):boolean");
    }
}
