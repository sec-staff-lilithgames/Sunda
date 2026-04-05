package o5;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: l, reason: collision with root package name */
    public static final a f77597l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f77598m = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final y0 f77599a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f77600b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f77601c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f77602d;

    /* renamed from: e, reason: collision with root package name */
    public final kv.l f77603e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f77604f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f77605g;

    /* renamed from: h, reason: collision with root package name */
    public final n0 f77606h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f77607i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f77608j;

    /* renamed from: k, reason: collision with root package name */
    public kv.a f77609k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static final String access$getTriggerName(a aVar, String str, String str2) {
            aVar.getClass();
            return "room_table_modification_trigger_" + str + '_' + str2;
        }
    }

    public j2(y0 database, Map<String, String> shadowTablesMap, Map<String, ? extends Set<String>> viewTables, String[] tableNames, boolean z10, kv.l onInvalidatedTablesIds) {
        String lowerCase;
        kotlin.jvm.internal.e0.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.e0.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewTables, "viewTables");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.f77599a = database;
        this.f77600b = shadowTablesMap;
        this.f77601c = viewTables;
        this.f77602d = z10;
        this.f77603e = onInvalidatedTablesIds;
        this.f77608j = new AtomicBoolean(false);
        this.f77609k = new i.f(11);
        this.f77604f = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            this.f77604f.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f77600b.get(tableNames[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.f77605g = strArr;
        for (Map.Entry entry : this.f77600b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (this.f77604f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f77604f;
                linkedHashMap.put(lowerCase4, uu.p1.getValue(linkedHashMap, lowerCase3));
            }
        }
        this.f77606h = new n0(this.f77605g.length);
        this.f77607i = new p0(this.f77605g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$checkInvalidatedTables(o5.j2 r4, o5.r0 r5, zu.d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof o5.k2
            if (r0 == 0) goto L16
            r0 = r6
            o5.k2 r0 = (o5.k2) r0
            int r1 = r0.f77620l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f77620l = r1
            goto L1b
        L16:
            o5.k2 r0 = new o5.k2
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f77618j
            java.lang.Object r6 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r0.f77620l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r5 = r0.f77617i
            java.util.Set r5 = (java.util.Set) r5
            tu.a0.throwOnFailure(r4)
            return r5
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            java.lang.Object r5 = r0.f77617i
            o5.r0 r5 = (o5.r0) r5
            tu.a0.throwOnFailure(r4)
            goto L5a
        L43:
            tu.a0.throwOnFailure(r4)
            f.j0 r4 = new f.j0
            r1 = 11
            r4.<init>(r1)
            r0.f77617i = r5
            r0.f77620l = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.usePrepared(r1, r4, r0)
            if (r4 != r6) goto L5a
            goto L71
        L5a:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L72
            r0.f77617i = r4
            r0.f77620l = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = o5.i2.execSQL(r5, r1, r0)
            if (r5 != r6) goto L72
        L71:
            return r6
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j2.access$checkInvalidatedTables(o5.j2, o5.r0, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (o5.i2.execSQL(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:
    
        if (o5.i2.execSQL(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d4, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d2 -> B:28:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$startTrackingTable(o5.j2 r17, o5.r0 r18, int r19, zu.d r20) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j2.access$startTrackingTable(o5.j2, o5.r0, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:19:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$stopTrackingTable(o5.j2 r8, o5.r0 r9, int r10, zu.d r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof o5.v2
            if (r0 == 0) goto L16
            r0 = r11
            o5.v2 r0 = (o5.v2) r0
            int r1 = r0.f77758p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f77758p = r1
            goto L1b
        L16:
            o5.v2 r0 = new o5.v2
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f77756n
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77758p
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r8 = r0.f77755m
            int r9 = r0.f77754l
            java.lang.String[] r10 = r0.f77753k
            java.lang.String r2 = r0.f77752j
            o5.r0 r4 = r0.f77751i
            tu.a0.throwOnFailure(r11)
            r11 = r10
            r10 = r4
            goto L76
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            tu.a0.throwOnFailure(r11)
            java.lang.String[] r8 = r8.f77605g
            r8 = r8[r10]
            java.lang.String[] r10 = o5.j2.f77598m
            int r11 = r10.length
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L51:
            if (r9 >= r8) goto L78
            r4 = r11[r9]
            o5.j2$a r5 = o5.j2.f77597l
            java.lang.String r4 = o5.j2.a.access$getTriggerName(r5, r2, r4)
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = j1.o2.f(r6, r5, r4)
            r0.f77751i = r10
            r0.f77752j = r2
            r0.f77753k = r11
            r0.f77754l = r9
            r0.f77755m = r8
            r0.f77758p = r3
            java.lang.Object r4 = o5.i2.execSQL(r10, r4, r0)
            if (r4 != r1) goto L76
            return r1
        L76:
            int r9 = r9 + r3
            goto L51
        L78:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j2.access$stopTrackingTable(o5.j2, o5.r0, int, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object refreshInvalidation$room_runtime_release$default(j2 j2Var, String[] strArr, kv.a aVar, kv.a aVar2, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new i.f(10);
        }
        if ((i10 & 4) != 0) {
            aVar2 = new i.f(10);
        }
        return j2Var.refreshInvalidation$room_runtime_release(strArr, aVar, aVar2, dVar);
    }

    public static /* synthetic */ void refreshInvalidationAsync$room_runtime_release$default(j2 j2Var, kv.a aVar, kv.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new i.f(10);
        }
        if ((i10 & 2) != 0) {
            aVar2 = new i.f(10);
        }
        j2Var.refreshInvalidationAsync$room_runtime_release(aVar, aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zu.d r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o5.p2
            if (r0 == 0) goto L13
            r0 = r8
            o5.p2 r0 = (o5.p2) r0
            int r1 = r0.f77692m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77692m = r1
            goto L18
        L13:
            o5.p2 r0 = new o5.p2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f77690k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77692m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            p5.a r1 = r0.f77689j
            o5.j2 r0 = r0.f77688i
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2d
            goto L85
        L2d:
            r8 = move-exception
            goto L9e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            tu.a0.throwOnFailure(r8)
            o5.y0 r8 = r7.f77599a
            p5.a r2 = r8.getCloseBarrier$room_runtime_release()
            boolean r4 = r2.block$room_runtime_release()
            if (r4 == 0) goto La2
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.f77608j     // Catch: java.lang.Throwable -> L57
            r5 = 0
            boolean r4 = r4.compareAndSet(r3, r5)     // Catch: java.lang.Throwable -> L57
            if (r4 != 0) goto L5a
            java.util.Set r8 = uu.c2.emptySet()     // Catch: java.lang.Throwable -> L57
            r2.unblock$room_runtime_release()
            return r8
        L57:
            r8 = move-exception
            r1 = r2
            goto L9e
        L5a:
            kv.a r4 = r7.f77609k     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L57
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L57
            if (r4 != 0) goto L70
            java.util.Set r8 = uu.c2.emptySet()     // Catch: java.lang.Throwable -> L57
            r2.unblock$room_runtime_release()
            return r8
        L70:
            o5.r2 r4 = new o5.r2     // Catch: java.lang.Throwable -> L57
            r6 = 0
            r4.<init>(r7, r6)     // Catch: java.lang.Throwable -> L57
            r0.f77688i = r7     // Catch: java.lang.Throwable -> L57
            r0.f77689j = r2     // Catch: java.lang.Throwable -> L57
            r0.f77692m = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r8 = r8.useConnection$room_runtime_release(r5, r4, r0)     // Catch: java.lang.Throwable -> L57
            if (r8 != r1) goto L83
            return r1
        L83:
            r0 = r7
            r1 = r2
        L85:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L2d
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L9a
            o5.p0 r2 = r0.f77607i     // Catch: java.lang.Throwable -> L2d
            r2.increment(r8)     // Catch: java.lang.Throwable -> L2d
            kv.l r0 = r0.f77603e     // Catch: java.lang.Throwable -> L2d
            r0.invoke(r8)     // Catch: java.lang.Throwable -> L2d
        L9a:
            r1.unblock$room_runtime_release()
            return r8
        L9e:
            r1.unblock$room_runtime_release()
            throw r8
        La2:
            java.util.Set r8 = uu.c2.emptySet()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j2.a(zu.d):java.lang.Object");
    }

    public final void configureConnection(x5.b connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        x5.d dVarPrepare = connection.prepare("PRAGMA query_only");
        try {
            dVarPrepare.step();
            boolean z10 = dVarPrepare.getBoolean(0);
            iv.a.closeFinally(dVarPrepare, null);
            if (z10) {
                return;
            }
            x5.a.execSQL(connection, "PRAGMA temp_store = MEMORY");
            x5.a.execSQL(connection, "PRAGMA recursive_triggers = 1");
            x5.a.execSQL(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.f77602d) {
                x5.a.execSQL(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                x5.a.execSQL(connection, sv.k0.replace$default("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, (Object) null));
            }
            this.f77606h.forceNeedSync$room_runtime_release();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                iv.a.closeFinally(dVarPrepare, th2);
                throw th3;
            }
        }
    }

    public final Flow<Set<String>> createFlow$room_runtime_release(String[] resolvedTableNames, int[] tableIds, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableIds, "tableIds");
        return FlowKt.flow(new o2(this, tableIds, z10, resolvedTableNames, null));
    }

    public final kv.a getOnAllowRefresh$room_runtime_release() {
        return this.f77609k;
    }

    public final boolean onObserverAdded$room_runtime_release(int[] tableIds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableIds, "tableIds");
        return this.f77606h.onObserverAdded$room_runtime_release(tableIds);
    }

    public final boolean onObserverRemoved$room_runtime_release(int[] tableIds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableIds, "tableIds");
        return this.f77606h.onObserverRemoved$room_runtime_release(tableIds);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshInvalidation$room_runtime_release(java.lang.String[] r5, kv.a r6, kv.a r7, zu.d<? super java.lang.Boolean> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o5.s2
            if (r0 == 0) goto L13
            r0 = r8
            o5.s2 r0 = (o5.s2) r0
            int r1 = r0.f77715m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77715m = r1
            goto L18
        L13:
            o5.s2 r0 = new o5.s2
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f77713k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77715m
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int[] r5 = r0.f77712j
            kv.a r6 = r0.f77711i
            r7 = r6
            kv.a r7 = (kv.a) r7
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r5 = move-exception
            goto L87
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            tu.a0.throwOnFailure(r8)
            tu.v r5 = r4.validateTableNames$room_runtime_release(r5)
            java.lang.Object r5 = r5.component2()
            int[] r5 = (int[]) r5
            r6.invoke()
            r6 = r7
            kv.a r6 = (kv.a) r6     // Catch: java.lang.Throwable -> L30
            r0.f77711i = r6     // Catch: java.lang.Throwable -> L30
            r0.f77712j = r5     // Catch: java.lang.Throwable -> L30
            r0.f77715m = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r4.a(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L30
            int r6 = r5.length     // Catch: java.lang.Throwable -> L30
            r0 = 0
            if (r6 != 0) goto L6b
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L30
            boolean r5 = r8.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r5 != 0) goto L69
            goto L7f
        L69:
            r3 = r0
            goto L7f
        L6b:
            int r6 = r5.length     // Catch: java.lang.Throwable -> L30
            r1 = r0
        L6d:
            if (r1 >= r6) goto L69
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r2 = bv.b.boxInt(r2)     // Catch: java.lang.Throwable -> L30
            boolean r2 = r8.contains(r2)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L7c
            goto L7f
        L7c:
            int r1 = r1 + 1
            goto L6d
        L7f:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)     // Catch: java.lang.Throwable -> L30
            r7.invoke()
            return r5
        L87:
            r7.invoke()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j2.refreshInvalidation$room_runtime_release(java.lang.String[], kv.a, kv.a, zu.d):java.lang.Object");
    }

    public final void refreshInvalidationAsync$room_runtime_release(kv.a onRefreshScheduled, kv.a onRefreshCompleted) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onRefreshScheduled, "onRefreshScheduled");
        kotlin.jvm.internal.e0.checkNotNullParameter(onRefreshCompleted, "onRefreshCompleted");
        if (this.f77608j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            BuildersKt__Builders_commonKt.launch$default(this.f77599a.getCoroutineScope(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new t2(this, onRefreshCompleted, null), 2, null);
        }
    }

    public final void resetSync$room_runtime_release() {
        this.f77606h.resetTriggerState$room_runtime_release();
    }

    public final void setOnAllowRefresh$room_runtime_release(kv.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
        this.f77609k = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object syncTriggers$room_runtime_release(zu.d<? super tu.x0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o5.w2
            if (r0 == 0) goto L13
            r0 = r7
            o5.w2 r0 = (o5.w2) r0
            int r1 = r0.f77776l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77776l = r1
            goto L18
        L13:
            o5.w2 r0 = new o5.w2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f77774j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77776l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            p5.a r0 = r0.f77773i
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2b
            goto L57
        L2b:
            r7 = move-exception
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            tu.a0.throwOnFailure(r7)
            o5.y0 r7 = r6.f77599a
            p5.a r2 = r7.getCloseBarrier$room_runtime_release()
            boolean r4 = r2.block$room_runtime_release()
            if (r4 == 0) goto L61
            o5.y2 r4 = new o5.y2     // Catch: java.lang.Throwable -> L5b
            r5 = 0
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L5b
            r0.f77773i = r2     // Catch: java.lang.Throwable -> L5b
            r0.f77776l = r3     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            java.lang.Object r7 = r7.useConnection$room_runtime_release(r3, r4, r0)     // Catch: java.lang.Throwable -> L5b
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r2
        L57:
            r0.unblock$room_runtime_release()
            goto L61
        L5b:
            r7 = move-exception
            r0 = r2
        L5d:
            r0.unblock$room_runtime_release()
            throw r7
        L61:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j2.syncTriggers$room_runtime_release(zu.d):java.lang.Object");
    }

    public final tu.v validateTableNames$room_runtime_release(String[] names) {
        kotlin.jvm.internal.e0.checkNotNullParameter(names, "names");
        Set setCreateSetBuilder = uu.b2.createSetBuilder();
        for (String str : names) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f77601c.get(lowerCase);
            if (set != null) {
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        String[] strArr = (String[]) uu.b2.build(setCreateSetBuilder).toArray(new String[0]);
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) this.f77604f.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i10] = num.intValue();
        }
        return tu.e0.to(strArr, iArr);
    }
}
