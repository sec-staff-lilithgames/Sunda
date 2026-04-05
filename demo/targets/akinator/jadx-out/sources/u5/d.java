package u5;

import android.database.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import o5.f2;
import o5.g2;
import o5.h2;
import o5.y0;
import sv.k0;
import tu.x0;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public g2 f87862i;

        /* renamed from: j, reason: collision with root package name */
        public int f87863j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f87864k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f87865l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f87866m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ y0 f87867n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kv.p f87868o;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: u5.d$a$a, reason: collision with other inner class name */
        public static final class C0789a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f87869i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f87870j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ kv.p f87871k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0789a(kv.p pVar, zu.d<? super C0789a> dVar) {
                super(2, dVar);
                this.f87871k = pVar;
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                C0789a c0789a = new C0789a(this.f87871k, dVar);
                c0789a.f87870j = obj;
                return c0789a;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f87869i;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                    return obj;
                }
                tu.a0.throwOnFailure(obj);
                f2 f2Var = (f2) this.f87870j;
                this.f87869i = 1;
                Object objInvoke = this.f87871k.invoke(f2Var, this);
                return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
            }

            public final Object invokeSuspend$$forInline(Object obj) {
                return this.f87871k.invoke((f2) this.f87870j, this);
            }

            @Override // kv.p
            public final Object invoke(f2 f2Var, zu.d<? super R> dVar) {
                return ((C0789a) create(f2Var, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, boolean z11, y0 y0Var, kv.p pVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f87865l = z10;
            this.f87866m = z11;
            this.f87867n = y0Var;
            this.f87868o = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(this.f87865l, this.f87866m, this.f87867n, this.f87868o, dVar);
            aVar.f87864k = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
        
            if (r12.sync$room_runtime_release(r11) == r0) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[PHI: r1 r12
          0x00a4: PHI (r1v10 o5.h2) = (r1v7 o5.h2), (r1v15 o5.h2) binds: [B:35:0x00a1, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r12v14 java.lang.Object) = (r12v12 java.lang.Object), (r12v0 java.lang.Object) binds: [B:35:0x00a1, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c3 A[RETURN] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            h2 h2Var = (h2) this.f87864k;
            boolean z10 = this.f87865l;
            kv.p pVar = this.f87868o;
            if (!z10) {
                return pVar.invoke(h2Var, this);
            }
            boolean z11 = this.f87866m;
            g2 g2Var = z11 ? g2.f77579b : g2.f77580c;
            y0 y0Var = this.f87867n;
            if (!z11) {
                kotlin.jvm.internal.b0.mark(0);
                Object objInTransaction = h2Var.inTransaction(this);
                kotlin.jvm.internal.b0.mark(1);
                if (!((Boolean) objInTransaction).booleanValue()) {
                    o5.y invalidationTracker = y0Var.getInvalidationTracker();
                    kotlin.jvm.internal.b0.mark(0);
                    invalidationTracker.sync$room_runtime_release(this);
                    kotlin.jvm.internal.b0.mark(1);
                }
            }
            C0789a c0789a = new C0789a(pVar, null);
            kotlin.jvm.internal.b0.mark(0);
            Object objWithTransaction = h2Var.withTransaction(g2Var, c0789a, this);
            kotlin.jvm.internal.b0.mark(1);
            if (!z11) {
                kotlin.jvm.internal.b0.mark(0);
                Object objInTransaction2 = h2Var.inTransaction(this);
                kotlin.jvm.internal.b0.mark(1);
                if (!((Boolean) objInTransaction2).booleanValue()) {
                    y0Var.getInvalidationTracker().refreshAsync();
                }
            }
            return objWithTransaction;
        }

        @Override // kv.p
        public final Object invoke(h2 h2Var, zu.d<? super R> dVar) {
            return ((a) create(h2Var, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final String a(x5.d dVar) {
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        do {
            if (i10 == 0) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(dVar.getText(0));
                sb2.append("'.\n");
            }
            String text = dVar.getText(3);
            if (!linkedHashMap.containsKey(text)) {
                linkedHashMap.put(text, dVar.getText(2));
            }
            i10++;
        } while (dVar.step());
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append("\nNumber of rows in violation: ");
        sb2.append(i10);
        sb2.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            com.google.android.gms.internal.play_billing.a.B(sb2, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static final void dropFtsSyncTriggers(x5.b connection) {
        e0.checkNotNullParameter(connection, "connection");
        List listCreateListBuilder = o0.createListBuilder();
        x5.d dVarPrepare = connection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (dVarPrepare.step()) {
            try {
                listCreateListBuilder.add(dVarPrepare.getText(0));
            } finally {
            }
        }
        iv.a.closeFinally(dVarPrepare, null);
        for (String str : o0.build(listCreateListBuilder)) {
            if (k0.startsWith$default(str, "room_fts_content_sync_", false, 2, null)) {
                x5.a.execSQL(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final void foreignKeyCheck(x5.b db2, String tableName) {
        e0.checkNotNullParameter(db2, "db");
        e0.checkNotNullParameter(tableName, "tableName");
        x5.d dVarPrepare = db2.prepare("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (dVarPrepare.step()) {
                throw new SQLException(a(dVarPrepare));
            }
            iv.a.closeFinally(dVarPrepare, null);
        } finally {
        }
    }

    public static final <R> Object internalPerform(y0 y0Var, boolean z10, boolean z11, kv.p pVar, zu.d<? super R> dVar) {
        return y0Var.useConnection$room_runtime_release(z10, new a(z11, z10, y0Var, pVar, null), dVar);
    }
}
