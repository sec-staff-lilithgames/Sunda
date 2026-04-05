package a2;

import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r6 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f3789a = new ViewGroup.LayoutParams(-2, -2);

    public static final p0.e0 createSubcomposition(z1.b0 container, p0.f0 parent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        return p0.k0.Composition(new z1.e2(container), parent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p0.e0 setContent(a2.b r4, p0.f0 r5, kv.p r6) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
            a2.n3 r0 = a2.n3.f3734a
            r0.ensureStarted()
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L29
            r0 = 0
            android.view.View r0 = r4.getChildAt(r0)
            boolean r2 = r0 instanceof a2.t
            if (r2 == 0) goto L27
            a2.t r0 = (a2.t) r0
            goto L2d
        L27:
            r0 = r1
            goto L2d
        L29:
            r4.removeAllViews()
            goto L27
        L2d:
            if (r0 != 0) goto L46
            a2.t r0 = new a2.t
            android.content.Context r2 = r4.getContext()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r3)
            r0.<init>(r2)
            android.view.View r2 = r0.getView()
            android.view.ViewGroup$LayoutParams r3 = a2.r6.f3789a
            r4.addView(r2, r3)
        L46:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L84
            a2.q6 r4 = a2.q6.f3783a
            java.util.Map r4 = r4.attributeSourceResourceMap(r0)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L84
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            r2 = 2131428090(0x7f0b02fa, float:1.8477815E38)
            r0.setTag(r2, r4)
            boolean r4 = a2.t3.isDebugInspectorInfoEnabled()
            if (r4 != 0) goto L84
            java.lang.Class<a2.t3> r4 = a2.t3.class
            java.lang.String r2 = "isDebugInspectorInfoEnabled"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r2)     // Catch: java.lang.Exception -> L7d
            r2 = 1
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> L7d
            r4.setBoolean(r1, r2)     // Catch: java.lang.Exception -> L7d
            goto L84
        L7d:
            java.lang.String r4 = "Wrapper"
            java.lang.String r2 = "Could not access isDebugInspectorInfoEnabled. Please set explicitly."
            android.util.Log.w(r4, r2)
        L84:
            z1.e2 r4 = new z1.e2
            z1.b0 r2 = r0.getRoot()
            r4.<init>(r2)
            p0.e0 r4 = p0.k0.Composition(r4, r5)
            android.view.View r5 = r0.getView()
            r2 = 2131429200(0x7f0b0750, float:1.8480066E38)
            java.lang.Object r5 = r5.getTag(r2)
            boolean r3 = r5 instanceof a2.o6
            if (r3 == 0) goto La3
            r1 = r5
            a2.o6 r1 = (a2.o6) r1
        La3:
            if (r1 != 0) goto Lb1
            a2.o6 r1 = new a2.o6
            r1.<init>(r0, r4)
            android.view.View r4 = r0.getView()
            r4.setTag(r2, r1)
        Lb1:
            r1.setContent(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.r6.setContent(a2.b, p0.f0, kv.p):p0.e0");
    }
}
