package com.moloco.sdk.acm.services;

import android.util.Log;
import bv.n;
import com.ironsource.C3191e4;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kv.p;
import sv.n0;
import tu.a0;
import tu.x0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f45659a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final CoroutineScope f45660b = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f45661c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f45662d = b.f45654a.a("debug.moloco.enable_logs");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f45663i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f45664j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f45663i = str;
            this.f45664j = str2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f45663i, this.f45664j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            Iterator it = f.f45661c.iterator();
            if (!it.hasNext()) {
                return x0.f87415a;
            }
            if (it.next() != null) {
                throw new ClassCastException();
            }
            f.f45659a.b(this.f45663i);
            throw null;
        }
    }

    public static /* synthetic */ void b(f fVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.b(str, str2, z10);
    }

    public static final boolean c() {
        return f45662d;
    }

    public static /* synthetic */ void d() {
    }

    public final void b(String tag, String msg, boolean z10) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(msg, "msg");
        if (f45662d || z10) {
            String strB = b(tag);
            String strA = a(msg);
            Log.i(strB, strA);
            a(strB, strA);
        }
    }

    public final void c(String msg) {
        e0.checkNotNullParameter(msg, "msg");
        Log.i("==tlog==", a(msg));
    }

    public static final void a(boolean z10) {
        f45662d = z10;
    }

    public static final void a(e loggerListener) {
        e0.checkNotNullParameter(loggerListener, "loggerListener");
        f45661c.add(loggerListener);
    }

    public static /* synthetic */ void a(f fVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.a(str, str2, z10);
    }

    public final void a(String tag, String msg, boolean z10) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(msg, "msg");
        if (f45662d || z10) {
            String strB = b(tag);
            String strA = a(msg);
            Log.d(strB, strA);
            a(strB, strA);
        }
    }

    public static /* synthetic */ void b(f fVar, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        fVar.b(str, str2, th2, z10);
    }

    public final void b(String tag, String str, Throwable th2, boolean z10) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(str, PcrIk.PvOurMvNvjZkt);
        if (f45662d || z10) {
            String strB = b(tag);
            String strA = a(str);
            Log.w(strB, strA, th2);
            a(strB, strA);
        }
    }

    public static /* synthetic */ void a(f fVar, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        fVar.a(str, str2, th2, z10);
    }

    public final void a(String tag, String msg, Throwable th2, boolean z10) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(msg, "msg");
        if (f45662d || z10) {
            String strB = b(tag);
            String strA = a(msg);
            Log.e(strB, strA, th2);
            a(strB, strA);
        }
    }

    public final String b() throws ClassNotFoundException, SecurityException {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        e0.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElementA = a(stackTrace);
        String className = stackTraceElementA.getClassName();
        stackTraceElementA.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElementA.getMethodName();
        if (e0.areEqual(methodName, "invokeSuspend")) {
            String className2 = stackTraceElementA.getClassName();
            e0.checkNotNullExpressionValue(className2, "getClassName(...)");
            methodName = n0.substringAfterLast$default(n0.removeSuffix(className2, (CharSequence) "$1"), "$", (String) null, 2, (Object) null);
        }
        e0.checkNotNullExpressionValue(methodName, "let(...)");
        return methodName;
    }

    public final void a(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(f45660b, null, null, new a(str, str2, null), 3, null);
    }

    public final String a(String str) {
        try {
            return C3191e4.i.f36529d + b() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    public final StackTraceElement a(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!e0.areEqual(stackTraceElement.getClassName(), f45659a.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        return (StackTraceElement) k0.first(stackTraceElementArr);
    }

    public final String b(String str) {
        return sv.k0.startsWith$default(str, "ACM", false, 2, null) ? str : a.b.k("ACM", str);
    }
}
