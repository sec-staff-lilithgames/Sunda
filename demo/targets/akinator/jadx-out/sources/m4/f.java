package m4;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.p;
import kv.q;
import tu.o;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements k4.h {

    /* renamed from: a, reason: collision with root package name */
    public final p f74018a;

    /* renamed from: b, reason: collision with root package name */
    public final q f74019b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f74020c;

    /* renamed from: d, reason: collision with root package name */
    public final String f74021d;

    /* renamed from: e, reason: collision with root package name */
    public final o f74022e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f74023f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, String sharedPreferencesName, Set<String> keysToMigrate, q migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        e0.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        e0.checkNotNullParameter(migrate, "migrate");
    }

    @Override // k4.h
    public Object cleanUp(zu.d<? super x0> dVar) throws IOException {
        Context context;
        String str;
        o oVar = this.f74022e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) oVar.getValue()).edit();
        Set set = this.f74023f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) oVar.getValue()).getAll().isEmpty() && (context = this.f74020c) != null && (str = this.f74021d) != null) {
            d.deleteSharedPreferences(context, str);
        }
        if (set != null) {
            set.clear();
        }
        return x0.f87415a;
    }

    @Override // k4.h
    public Object migrate(Object obj, zu.d<Object> dVar) {
        return this.f74019b.invoke(new h((SharedPreferences) this.f74022e.getValue(), this.f74023f), obj, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object shouldMigrate(java.lang.Object r5, zu.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m4.e
            if (r0 == 0) goto L13
            r0 = r6
            m4.e r0 = (m4.e) r0
            int r1 = r0.f74017l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74017l = r1
            goto L18
        L13:
            m4.e r0 = new m4.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f74015j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f74017l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            m4.f r5 = r0.f74014i
            tu.a0.throwOnFailure(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
            r0.f74014i = r4
            r0.f74017l = r3
            kv.p r6 = r4.f74018a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L52
            java.lang.Boolean r5 = bv.b.boxBoolean(r0)
            return r5
        L52:
            java.util.Set r6 = r5.f74023f
            tu.o r5 = r5.f74022e
            if (r6 != 0) goto L70
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6e
            goto L9c
        L6e:
            r3 = r0
            goto L9c
        L70:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L86
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L86
            goto L6e
        L86:
            java.util.Iterator r6 = r6.iterator()
        L8a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L8a
        L9c:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.f.shouldMigrate(java.lang.Object, zu.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, String sharedPreferencesName, q migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        e0.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(kv.a produceSharedPreferences, Set<String> keysToMigrate, q migrate) {
        this(produceSharedPreferences, keysToMigrate, (p) null, migrate, 4, (u) null);
        e0.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        e0.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        e0.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(kv.a produceSharedPreferences, q migrate) {
        this(produceSharedPreferences, (Set) null, (p) null, migrate, 6, (u) null);
        e0.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        e0.checkNotNullParameter(migrate, "migrate");
    }

    public f(kv.a aVar, Set set, p pVar, q qVar, Context context, String str) {
        this.f74018a = pVar;
        this.f74019b = qVar;
        this.f74020c = context;
        this.f74021d = str;
        this.f74022e = tu.q.lazy(aVar);
        this.f74023f = set == g.getMIGRATE_ALL_KEYS() ? null : y0.toMutableSet(set);
    }

    public f(kv.a aVar, Set set, p pVar, q qVar, int i10, u uVar) {
        this(aVar, (Set<String>) ((i10 & 2) != 0 ? g.getMIGRATE_ALL_KEYS() : set), (i10 & 4) != 0 ? new a(2, null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(kv.a produceSharedPreferences, Set<String> keysToMigrate, p shouldRunMigration, q migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        e0.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        e0.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        e0.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        e0.checkNotNullParameter(migrate, "migrate");
    }

    public f(Context context, String str, Set set, p pVar, q qVar, int i10, u uVar) {
        this(context, str, (i10 & 4) != 0 ? g.getMIGRATE_ALL_KEYS() : set, (i10 & 8) != 0 ? new b(2, null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, String sharedPreferencesName, Set<String> keysToMigrate, p shouldRunMigration, q migrate) {
        this(new c(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        e0.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        e0.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        e0.checkNotNullParameter(migrate, "migrate");
    }
}
