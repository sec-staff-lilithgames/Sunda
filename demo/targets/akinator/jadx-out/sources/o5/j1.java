package o5;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class j1 {
    public static final <R> Object useReaderConnection(y0 y0Var, kv.p pVar, zu.d<? super R> dVar) {
        return BuildersKt.withContext(y0Var.getCoroutineScope().getCoroutineContext(), new g1(y0Var, pVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object useWriterConnection(o5.y0 r5, kv.p r6, zu.d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof o5.h1
            if (r0 == 0) goto L13
            r0 = r7
            o5.h1 r0 = (o5.h1) r0
            int r1 = r0.f77589k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77589k = r1
            goto L18
        L13:
            o5.h1 r0 = new o5.h1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f77588j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77589k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            o5.y0 r5 = r0.f77587i
            tu.a0.throwOnFailure(r7)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineScope r7 = r5.getCoroutineScope()
            zu.m r7 = r7.getCoroutineContext()
            o5.i1 r2 = new o5.i1
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f77587i = r5
            r0.f77589k = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            o5.y r5 = r5.getInvalidationTracker()
            r5.refreshAsync()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j1.useWriterConnection(o5.y0, kv.p, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void validateAutoMigrations(o5.y0 r10, o5.l r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.e0.checkNotNullParameter(r11, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r10.getRequiredAutoMigrationSpecClasses()
            java.util.List r2 = r11.f77639s
            o5.y0$d r3 = r11.f77624d
            java.util.List r11 = r11.f77639s
            int r2 = r2.size()
            boolean[] r4 = new boolean[r2]
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r5 = r1.hasNext()
            r6 = -1
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r1.next()
            kotlin.reflect.KClass r5 = (kotlin.reflect.KClass) r5
            r7 = r11
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            int r7 = r7 + r6
            if (r7 < 0) goto L50
        L3a:
            int r8 = r7 + (-1)
            java.lang.Object r9 = r11.get(r7)
            boolean r9 = r5.isInstance(r9)
            if (r9 == 0) goto L4b
            r6 = 1
            r4[r7] = r6
            r6 = r7
            goto L50
        L4b:
            if (r8 >= 0) goto L4e
            goto L50
        L4e:
            r7 = r8
            goto L3a
        L50:
            if (r6 < 0) goto L5a
            java.lang.Object r6 = r11.get(r6)
            r0.put(r5, r6)
            goto L23
        L5a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "A required auto migration spec ("
            r10.<init>(r11)
            java.lang.String r11 = r5.getQualifiedName()
            r10.append(r11)
            java.lang.String r11 = ") is missing in the database configuration."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L7b:
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            int r11 = r11 + r6
            if (r11 < 0) goto L99
        L84:
            int r1 = r11 + (-1)
            if (r11 >= r2) goto L91
            boolean r11 = r4[r11]
            if (r11 == 0) goto L91
            if (r1 >= 0) goto L8f
            goto L99
        L8f:
            r11 = r1
            goto L84
        L91:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            r10.<init>(r11)
            throw r10
        L99:
            java.util.List r10 = r10.createAutoMigrations(r0)
            java.util.Iterator r10 = r10.iterator()
        La1:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lbb
            java.lang.Object r11 = r10.next()
            s5.b r11 = (s5.b) r11
            int r0 = r11.f85471a
            int r1 = r11.f85472b
            boolean r0 = r3.contains(r0, r1)
            if (r0 != 0) goto La1
            r3.addMigration(r11)
            goto La1
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j1.validateAutoMigrations(o5.y0, o5.l):void");
    }

    public static final void validateTypeConverters(y0 y0Var, l configuration) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        Map<KClass<?>, List<KClass<?>>> requiredTypeConverterClassesMap$room_runtime_release = y0Var.getRequiredTypeConverterClassesMap$room_runtime_release();
        List list = configuration.f77638r;
        List list2 = configuration.f77638r;
        boolean[] zArr = new boolean[list.size()];
        for (Map.Entry<KClass<?>, List<KClass<?>>> entry : requiredTypeConverterClassesMap$room_runtime_release.entrySet()) {
            KClass<?> key = entry.getKey();
            for (KClass<?> kClass : entry.getValue()) {
                int size = list2.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (kClass.isInstance(list2.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size = i10;
                        }
                    }
                    size = -1;
                } else {
                    size = -1;
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + kClass.getQualifiedName() + ") for " + key.getQualifiedName() + " is missing in the database configuration.").toString());
                }
                y0Var.addTypeConverter$room_runtime_release(kClass, list2.get(size));
            }
        }
        int size2 = list2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException(j1.o2.k(list2.get(size2), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    public static final void validateMigrationsNotRequired(Set<Integer> migrationStartAndEndVersions, Set<Integer> set) {
        kotlin.jvm.internal.e0.checkNotNullParameter(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        kotlin.jvm.internal.e0.checkNotNullParameter(set, wHkgq.eWKwcCFhmHRXno);
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator<Integer> it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (set.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(a.b.e(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
            }
        }
    }
}
