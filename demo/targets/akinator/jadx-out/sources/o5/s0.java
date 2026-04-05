package o5;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f77709b;

        static {
            kotlin.jvm.internal.e0.needClassReification();
            f77709b = new a();
        }

        @Override // kv.a
        public final y0 invoke() {
            kotlin.jvm.internal.e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return (y0) u5.l.findAndInstantiateDatabaseImpl$default(y0.class, null, 2, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements kv.a {

        /* renamed from: b, reason: collision with root package name */
        public static final b f77710b;

        static {
            kotlin.jvm.internal.e0.needClassReification();
            f77710b = new b();
        }

        @Override // kv.a
        public final y0 invoke() {
            kotlin.jvm.internal.e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return (y0) u5.l.findAndInstantiateDatabaseImpl$default(y0.class, null, 2, null);
        }
    }

    public static final <T extends y0> y0.a databaseBuilder(Context context, Class<T> klass, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        if (str == null || sv.n0.isBlank(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (kotlin.jvm.internal.e0.areEqual(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new y0.a(context, klass, str);
    }

    public static /* synthetic */ y0.a databaseBuilder$default(s0 s0Var, Context context, String name, kv.a factory, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            kotlin.jvm.internal.e0.needClassReification();
            factory = a.f77709b;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        if (sv.n0.isBlank(name)) {
            throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        if (kotlin.jvm.internal.e0.areEqual(name, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        kotlin.jvm.internal.e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return new y0.a(kotlin.jvm.internal.c1.getOrCreateKotlinClass(y0.class), name, factory, context);
    }

    public static final <T extends y0> y0.a inMemoryDatabaseBuilder(Context context, Class<T> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        return new y0.a(context, klass, null);
    }

    public static /* synthetic */ y0.a inMemoryDatabaseBuilder$default(s0 s0Var, Context context, kv.a factory, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kotlin.jvm.internal.e0.needClassReification();
            factory = b.f77710b;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        kotlin.jvm.internal.e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return new y0.a(kotlin.jvm.internal.c1.getOrCreateKotlinClass(y0.class), null, factory, context);
    }
}
