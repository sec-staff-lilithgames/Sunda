package z1;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final p f97382b = new p(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f97383c = q.m8062constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f97384d = q.m8062constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f97385e = q.m8062constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f97386f = q.m8062constructorimpl(3);

    /* renamed from: g, reason: collision with root package name */
    public static final int f97387g = q.m8062constructorimpl(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f97388h = q.m8062constructorimpl(5);

    /* renamed from: a, reason: collision with root package name */
    public final o0[] f97389a;

    public /* synthetic */ r(o0[] o0VarArr) {
        this.f97389a = o0VarArr;
    }

    public static final void a(o0[] o0VarArr, o0 o0Var, int i10) {
        o0Var.setNext(o0VarArr[i10]);
        o0VarArr[i10] = o0Var;
    }

    /* renamed from: addAfterLayoutModifier-impl, reason: not valid java name */
    public static final void m8070addAfterLayoutModifierimpl(o0[] o0VarArr, u0 layoutNodeWrapper, e1.v modifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        if (modifier instanceof x1.l1) {
            a(o0VarArr, new c2(layoutNodeWrapper, modifier), f97387g);
        }
        if (modifier instanceof x1.m1) {
            a(o0VarArr, new c2(layoutNodeWrapper, modifier), f97388h);
        }
    }

    /* renamed from: addBeforeLayoutModifier-impl, reason: not valid java name */
    public static final void m8071addBeforeLayoutModifierimpl(o0[] o0VarArr, u0 layoutNodeWrapper, e1.v modifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        if (modifier instanceof g1.i) {
            a(o0VarArr, new m(layoutNodeWrapper, (g1.i) modifier), f97383c);
        }
        if (modifier instanceof u1.j0) {
            a(o0VarArr, new z1(layoutNodeWrapper, (u1.j0) modifier), f97384d);
        }
        if (modifier instanceof e2.t) {
            a(o0VarArr, new e2.s(layoutNodeWrapper, (e2.t) modifier), f97385e);
        }
        if (modifier instanceof x1.p1) {
            a(o0VarArr, new c2(layoutNodeWrapper, modifier), f97386f);
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r m8072boximpl(o0[] o0VarArr) {
        return new r(o0VarArr);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m8073clearimpl(o0[] o0VarArr) {
        for (o0 next : o0VarArr) {
            for (; next != null; next = next.getNext()) {
                if (next.isAttached()) {
                    next.onDetach();
                }
            }
        }
        int length = o0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            o0VarArr[i10] = null;
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static o0[] m8074constructorimpl(o0[] entities) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entities, "entities");
        return entities;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ o0[] m8075constructorimpl$default(o0[] o0VarArr, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            o0VarArr = new o0[6];
        }
        return m8074constructorimpl(o0VarArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8076equalsimpl(o0[] o0VarArr, Object obj) {
        return (obj instanceof r) && kotlin.jvm.internal.e0.areEqual(o0VarArr, ((r) obj).m8084unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8077equalsimpl0(o0[] o0VarArr, o0[] o0VarArr2) {
        return kotlin.jvm.internal.e0.areEqual(o0VarArr, o0VarArr2);
    }

    /* renamed from: forEach-9r0pUL4, reason: not valid java name */
    public static final <T extends o0, M extends e1.v> void m8078forEach9r0pUL4(o0[] o0VarArr, int i10, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        for (o0 next = o0VarArr[i10]; next != null; next = next.getNext()) {
            block.invoke(next);
        }
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m8079forEachimpl(o0[] o0VarArr, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        for (o0 next : o0VarArr) {
            for (; next != null; next = next.getNext()) {
                block.invoke(next);
            }
        }
    }

    /* renamed from: has-0OSVbXo, reason: not valid java name */
    public static final boolean m8080has0OSVbXo(o0[] o0VarArr, int i10) {
        return o0VarArr[i10] != null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8081hashCodeimpl(o0[] o0VarArr) {
        return Arrays.hashCode(o0VarArr);
    }

    /* renamed from: head-0OSVbXo, reason: not valid java name */
    public static final <T extends o0, M extends e1.v> T m8082head0OSVbXo(o0[] o0VarArr, int i10) {
        return (T) o0VarArr[i10];
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8083toStringimpl(o0[] o0VarArr) {
        return "EntityList(entities=" + Arrays.toString(o0VarArr) + ')';
    }

    public boolean equals(Object obj) {
        return m8076equalsimpl(this.f97389a, obj);
    }

    public final o0[] getEntities() {
        return this.f97389a;
    }

    public int hashCode() {
        return m8081hashCodeimpl(this.f97389a);
    }

    public String toString() {
        return m8083toStringimpl(this.f97389a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ o0[] m8084unboximpl() {
        return this.f97389a;
    }
}
