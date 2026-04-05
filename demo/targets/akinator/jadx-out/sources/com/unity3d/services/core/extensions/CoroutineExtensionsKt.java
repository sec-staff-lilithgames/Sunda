package com.unity3d.services.core.extensions;

import av.e;
import bv.f;
import bv.n;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kv.a;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, Deferred<?>> deferreds = new LinkedHashMap<Object, Deferred<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Deferred) {
                return containsValue((Deferred<?>) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, Deferred<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, Deferred<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Deferred<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof Deferred)) {
                return remove(obj, (Deferred<?>) obj2);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, Deferred<?>> eldest) {
            e0.checkNotNullParameter(eldest, "eldest");
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Deferred<?>> values() {
            return getValues();
        }

        public /* bridge */ boolean containsValue(Deferred<?> deferred) {
            return super.containsValue((Object) deferred);
        }

        public /* bridge */ boolean remove(Object obj, Deferred<?> deferred) {
            return super.remove(obj, (Object) deferred);
        }
    };
    private static final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", i = {0, 0}, l = {53, 45}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ l $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, l lVar, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$key = obj;
            this.$action = lVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Mutex mutex;
            l lVar;
            Object obj2;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    lVar = this.$action;
                    this.L$0 = coroutineScope;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = lVar;
                    this.label = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        obj2 = obj3;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return obj;
                }
                lVar = (l) this.L$3;
                obj2 = this.L$2;
                mutex = (Mutex) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                a0.throwOnFailure(obj);
                LinkedHashMap<Object, Deferred<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
                Deferred<?> deferredAsync$default = deferreds.get(obj2);
                if (deferredAsync$default == null) {
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, deferredAsync$default);
                }
                Deferred<?> deferred = deferredAsync$default;
                mutex.unlock(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objAwait = deferred.await(this);
                return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
            } catch (Throwable th2) {
                mutex.unlock(null);
                throw th2;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Mutex mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            l lVar = this.$action;
            b0.mark(0);
            mutex.lock(null, this);
            b0.mark(1);
            try {
                LinkedHashMap<Object, Deferred<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
                Deferred<?> deferredAsync$default = deferreds.get(obj2);
                if (deferredAsync$default == null) {
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, deferredAsync$default);
                }
                Deferred<?> deferred = deferredAsync$default;
                mutex.unlock(null);
                b0.mark(0);
                Object objAwait = deferred.await(this);
                b0.mark(1);
                return objAwait;
            } catch (Throwable th2) {
                mutex.unlock(null);
                throw th2;
            }
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super T> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final LinkedHashMap<Object, Deferred<?>> getDeferreds() {
        return deferreds;
    }

    public static final Mutex getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, l lVar, d<? super T> dVar) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(obj, lVar, null), dVar);
    }

    private static final <T> Object memoize$$forInline(Object obj, l lVar, d<? super T> dVar) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(obj, lVar, null);
        b0.mark(0);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(anonymousClass2, dVar);
        b0.mark(1);
        return objCoroutineScope;
    }

    public static final <R> Object runReturnSuspendCatching(a block) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(block, "block");
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(block.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7137isSuccessimpl(objM7131constructorimpl)) {
            return z.m7131constructorimpl(objM7131constructorimpl);
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        return thM7134exceptionOrNullimpl != null ? z.m7131constructorimpl(a0.createFailure(thM7134exceptionOrNullimpl)) : objM7131constructorimpl;
    }

    public static final <R> Object runSuspendCatching(a block) {
        e0.checkNotNullParameter(block, "block");
        try {
            int i10 = z.f87419c;
            return z.m7131constructorimpl(block.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            return z.m7131constructorimpl(a0.createFailure(th2));
        }
    }
}
