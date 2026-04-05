package com.moloco.sdk.internal.services;

import android.content.SharedPreferences;
import com.moloco.sdk.internal.MolocoLogger;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f46968a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46970j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f46970j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new a(this.f46970j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            d dVar = d.this;
            SharedPreferences sharedPreferences = dVar.f46968a;
            String str = this.f46970j;
            if (!sharedPreferences.contains(str)) {
                return null;
            }
            try {
                return bv.b.boxBoolean(dVar.f46968a.getBoolean(str, false));
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, null, false, 12, null);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46972j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f46972j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Double> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new b(this.f46972j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            d dVar = d.this;
            SharedPreferences sharedPreferences = dVar.f46968a;
            String str = this.f46972j;
            if (!sharedPreferences.contains(str)) {
                return null;
            }
            try {
                String string = dVar.f46968a.getString(str, "0");
                if (string != null) {
                    return bv.b.boxDouble(Double.parseDouble(string));
                }
                return null;
            } catch (ClassCastException e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, e10, false, 8, null);
                return null;
            } catch (NumberFormatException e11) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, e11, false, 8, null);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46974j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f46974j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Float> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new c(this.f46974j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            d dVar = d.this;
            SharedPreferences sharedPreferences = dVar.f46968a;
            String str = this.f46974j;
            if (!sharedPreferences.contains(str)) {
                return null;
            }
            try {
                return bv.b.boxFloat(dVar.f46968a.getFloat(str, 0.0f));
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, null, false, 12, null);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.services.d$d, reason: collision with other inner class name */
    public static final class C0388d extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46976j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0388d(String str, zu.d<? super C0388d> dVar) {
            super(2, dVar);
            this.f46976j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
            return ((C0388d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new C0388d(this.f46976j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            d dVar = d.this;
            SharedPreferences sharedPreferences = dVar.f46968a;
            String str = this.f46976j;
            if (!sharedPreferences.contains(str)) {
                return null;
            }
            try {
                return bv.b.boxInt(dVar.f46968a.getInt(str, 0));
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, null, false, 12, null);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46978j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f46978j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Long> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new e(this.f46978j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            d dVar = d.this;
            SharedPreferences sharedPreferences = dVar.f46968a;
            String str = this.f46978j;
            if (!sharedPreferences.contains(str)) {
                return null;
            }
            try {
                String string = dVar.f46968a.getString(str, "0");
                if (string != null) {
                    return bv.b.boxLong(Long.parseLong(string));
                }
                return null;
            } catch (ClassCastException e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, e10, false, 8, null);
                return null;
            } catch (NumberFormatException e11) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, e11, false, 8, null);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46980j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f46980j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super String> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new f(this.f46980j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            d dVar = d.this;
            SharedPreferences sharedPreferences = dVar.f46968a;
            String str = this.f46980j;
            if (!sharedPreferences.contains(str)) {
                return null;
            }
            try {
                return dVar.f46968a.getString(str, "");
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, null, false, 12, null);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46982j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, zu.d<? super g> dVar) {
            super(2, dVar);
            this.f46982j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new g(this.f46982j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            d.this.f46968a.edit().remove(this.f46982j).apply();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Object f46983i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f46984j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f46985k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(T t10, d dVar, String str, zu.d<? super h> dVar2) {
            super(2, dVar2);
            this.f46983i = t10;
            this.f46984j = dVar;
            this.f46985k = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new h(this.f46983i, this.f46984j, this.f46985k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            Object obj2 = this.f46983i;
            boolean z10 = obj2 instanceof Integer;
            d dVar = this.f46984j;
            String str = this.f46985k;
            if (z10) {
                dVar.f46968a.edit().putInt(str, ((Number) obj2).intValue()).apply();
            } else if (obj2 instanceof String) {
                dVar.f46968a.edit().putString(str, (String) obj2).apply();
            } else if (obj2 instanceof Float) {
                dVar.f46968a.edit().putFloat(str, ((Number) obj2).floatValue()).apply();
            } else if (obj2 instanceof Boolean) {
                dVar.f46968a.edit().putBoolean(str, ((Boolean) obj2).booleanValue()).apply();
            } else if (obj2 instanceof Double) {
                dVar.f46968a.edit().putString(str, String.valueOf(((Number) obj2).doubleValue())).apply();
            } else if (obj2 instanceof Long) {
                dVar.f46968a.edit().putString(str, String.valueOf(((Number) obj2).longValue())).apply();
            } else {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type: " + obj2 + " for key: " + str, null, false, 12, null);
            }
            return x0.f87415a;
        }
    }

    public d(SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f46968a = sharedPreferences;
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object b(String str, zu.d<? super Double> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new b(str, null), dVar);
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object c(String str, zu.d<? super Float> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new c(str, null), dVar);
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object d(String str, zu.d<? super String> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new f(str, null), dVar);
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object e(String str, zu.d<? super Integer> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new C0388d(str, null), dVar);
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object f(String str, zu.d<? super Boolean> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new a(str, null), dVar);
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object g(String str, zu.d<? super Long> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new e(str, null), dVar);
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object a(String str, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new g(str, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    @Override // com.moloco.sdk.internal.services.g0
    public <T> Object a(String str, T t10, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new h(t10, this, str, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
