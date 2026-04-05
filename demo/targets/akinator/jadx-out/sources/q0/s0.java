package q0;

import androidx.lifecycle.c3;
import com.ironsource.C3191e4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.i4;
import p0.v4;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends u0 {

    /* renamed from: b, reason: collision with root package name */
    public int f82371b;

    /* renamed from: d, reason: collision with root package name */
    public int f82373d;

    /* renamed from: f, reason: collision with root package name */
    public int f82375f;

    /* renamed from: g, reason: collision with root package name */
    public int f82376g;

    /* renamed from: h, reason: collision with root package name */
    public int f82377h;

    /* renamed from: a, reason: collision with root package name */
    public n0[] f82370a = new n0[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f82372c = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public Object[] f82374e = new Object[16];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements o0 {

        /* renamed from: a, reason: collision with root package name */
        public int f82378a;

        /* renamed from: b, reason: collision with root package name */
        public int f82379b;

        /* renamed from: c, reason: collision with root package name */
        public int f82380c;

        public a() {
        }

        public final String currentOperationDebugString() {
            String str = "operation[" + this.f82378a + "] = " + s0.this.a(this, "");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "toString(...)");
            return str;
        }

        @Override // q0.o0
        public int getInt(int i10) {
            return s0.this.f82372c[this.f82379b + i10];
        }

        @Override // q0.o0
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo5927getObject31yXWZQ(int i10) {
            return (T) s0.this.f82374e[this.f82380c + i10];
        }

        public final n0 getOperation() {
            return s0.this.f82370a[this.f82378a];
        }

        public final boolean next() {
            int i10 = this.f82378a;
            s0 s0Var = s0.this;
            if (i10 >= s0Var.f82371b) {
                return false;
            }
            n0 operation = getOperation();
            this.f82379b = operation.getInts() + this.f82379b;
            this.f82380c = operation.getObjects() + this.f82380c;
            int i11 = this.f82378a + 1;
            this.f82378a = i11;
            return i11 < s0Var.f82371b;
        }
    }

    public final String a(a aVar, String str) {
        n0 operation = aVar.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(operation.getName());
        sb2.append('(');
        String str2 = str + "    ";
        int ints = operation.getInts();
        boolean z10 = true;
        for (int i10 = 0; i10 < ints; i10++) {
            String strIntParamName = operation.intParamName(i10);
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append('\n');
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(str2);
            sb2.append(strIntParamName);
            sb2.append(" = ");
            sb2.append(aVar.getInt(i10));
        }
        int objects = operation.getObjects();
        for (int i11 = 0; i11 < objects; i11++) {
            int iM5952constructorimpl = w.m5952constructorimpl(i11);
            String strMo5902objectParamName31yXWZQ = operation.mo5902objectParamName31yXWZQ(iM5952constructorimpl);
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append('\n');
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(str2);
            sb2.append(strMo5902objectParamName31yXWZQ);
            sb2.append(" = ");
            sb2.append(b(aVar.mo5927getObject31yXWZQ(iM5952constructorimpl), str2));
        }
        sb2.append('\n');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(str);
        sb2.append(")");
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String b(Object obj, String str) {
        return obj == null ? AbstractJsonLexerKt.NULL : obj instanceof Object[] ? c(uu.k0.asIterable((Object[]) obj), str) : obj instanceof int[] ? c(uu.k0.asIterable((int[]) obj), str) : obj instanceof long[] ? c(uu.k0.asIterable((long[]) obj), str) : obj instanceof float[] ? c(uu.k0.asIterable((float[]) obj), str) : obj instanceof double[] ? c(uu.k0.asIterable((double[]) obj), str) : obj instanceof Iterable ? c((Iterable) obj, str) : obj instanceof u0 ? ((u0) obj).toDebugString(str) : obj.toString();
    }

    public final String c(Iterable iterable, String str) {
        return y0.joinToString$default(iterable, ", ", C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, new c3(17, this, str), 24, null);
    }

    public final void clear() {
        this.f82371b = 0;
        this.f82373d = 0;
        uu.f0.fill(this.f82374e, (Object) null, 0, this.f82375f);
        this.f82375f = 0;
    }

    public final void drain(kv.l lVar) {
        if (isNotEmpty()) {
            a aVar = new a();
            do {
                lVar.invoke(aVar);
            } while (aVar.next());
        }
        clear();
    }

    public final void ensureAllArgumentsPushedFor(n0 n0Var) {
        int i10 = this.f82376g;
        int ints = n0Var.getInts();
        if (i10 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            n0Var.getObjects();
        }
    }

    public final void executeAndFlushAllPendingOperations(p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        if (isNotEmpty()) {
            a aVar = new a();
            while (true) {
                p0.d dVar2 = dVar;
                v4 v4Var2 = v4Var;
                i4 i4Var2 = i4Var;
                p0 p0Var2 = p0Var;
                aVar.getOperation().executeWithComposeStackTrace(aVar, dVar2, v4Var2, i4Var2, p0Var2);
                if (!aVar.next()) {
                    break;
                }
                dVar = dVar2;
                v4Var = v4Var2;
                i4Var = i4Var2;
                p0Var = p0Var2;
            }
        }
        clear();
    }

    public final void forEach(kv.l lVar) {
        if (isNotEmpty()) {
            a aVar = new a();
            do {
                lVar.invoke(aVar);
            } while (aVar.next());
        }
    }

    public final int getSize() {
        return this.f82371b;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final void pop() {
        n0[] n0VarArr = this.f82370a;
        int i10 = this.f82371b - 1;
        this.f82371b = i10;
        n0 n0Var = n0VarArr[i10];
        n0VarArr[i10] = null;
        int objects = n0Var.getObjects();
        for (int i11 = 0; i11 < objects; i11++) {
            Object[] objArr = this.f82374e;
            int i12 = this.f82375f - 1;
            this.f82375f = i12;
            objArr[i12] = null;
        }
        this.f82373d -= n0Var.getInts();
    }

    public final void popInto(s0 s0Var) {
        n0[] n0VarArr = this.f82370a;
        int i10 = this.f82371b - 1;
        this.f82371b = i10;
        n0 n0Var = n0VarArr[i10];
        n0VarArr[i10] = null;
        s0Var.pushOp(n0Var);
        Object[] objArr = this.f82374e;
        Object[] objArr2 = s0Var.f82374e;
        int objects = s0Var.f82375f - n0Var.getObjects();
        int objects2 = this.f82375f - n0Var.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.f82375f - objects2);
        uu.f0.fill(this.f82374e, (Object) null, this.f82375f - n0Var.getObjects(), this.f82375f);
        uu.f0.copyInto(this.f82372c, s0Var.f82372c, s0Var.f82373d - n0Var.getInts(), this.f82373d - n0Var.getInts(), this.f82373d);
        this.f82375f -= n0Var.getObjects();
        this.f82373d -= n0Var.getInts();
    }

    public final void push(n0 n0Var) {
        pushOp(n0Var);
    }

    public final void pushOp(n0 n0Var) {
        int i10 = this.f82371b;
        if (i10 == this.f82370a.length) {
            int iCoerceAtMost = qv.v.coerceAtMost(i10, 1024);
            int i11 = this.f82371b;
            n0[] n0VarArr = new n0[iCoerceAtMost + i11];
            System.arraycopy(this.f82370a, 0, n0VarArr, 0, i11);
            this.f82370a = n0VarArr;
        }
        int ints = n0Var.getInts() + this.f82373d;
        int length = this.f82372c.length;
        if (ints > length) {
            int[] iArr = new int[qv.v.coerceAtLeast(qv.v.coerceAtMost(length, 1024) + length, ints)];
            uu.f0.copyInto(this.f82372c, iArr, 0, 0, length);
            this.f82372c = iArr;
        }
        int objects = n0Var.getObjects() + this.f82375f;
        int length2 = this.f82374e.length;
        if (objects > length2) {
            Object[] objArr = new Object[qv.v.coerceAtLeast(qv.v.coerceAtMost(length2, 1024) + length2, objects)];
            System.arraycopy(this.f82374e, 0, objArr, 0, length2);
            this.f82374e = objArr;
        }
        n0[] n0VarArr2 = this.f82370a;
        int i12 = this.f82371b;
        this.f82371b = i12 + 1;
        n0VarArr2[i12] = n0Var;
        this.f82373d = n0Var.getInts() + this.f82373d;
        this.f82375f = n0Var.getObjects() + this.f82375f;
    }

    @Override // q0.u0
    public String toDebugString(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (isNotEmpty()) {
            a aVar = new a();
            int i10 = 0;
            while (true) {
                sb2.append(str);
                int i11 = i10 + 1;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(a(aVar, str));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
                sb2.append('\n');
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
                if (!aVar.next()) {
                    break;
                }
                i10 = i11;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @tu.f
    public String toString() {
        return super.toString();
    }

    public final void push(n0 n0Var, kv.l lVar) {
        pushOp(n0Var);
        lVar.invoke(t0.m5936boximpl(t0.m5937constructorimpl(this)));
        ensureAllArgumentsPushedFor(n0Var);
    }

    public static /* synthetic */ void getOpCodes$runtime$annotations() {
    }
}
