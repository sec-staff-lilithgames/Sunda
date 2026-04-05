package io.odeeo.internal.m1;

import android.content.Context;
import bv.f;
import bv.n;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C3191e4;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f64722a = new c();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f64723a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f64724b;

        public a(String advertisingId, boolean z10) {
            e0.checkNotNullParameter(advertisingId, "advertisingId");
            this.f64723a = advertisingId;
            this.f64724b = z10;
        }

        public final String getAdvertisingId() {
            return this.f64723a;
        }

        public final boolean getLimitAdTracking() {
            return this.f64724b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.odeeo.sdk.privacy.GoogleAdIdHelper$fetchAdvertisingInfoSync$2", f = "GoogleAdIdHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f64725a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f64726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f64726b = context;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f64726b, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f64725a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            if (this.f64726b == null) {
                return null;
            }
            try {
                Object objInvoke = c.f64722a.getAdInfoDeclaredMethod$odeeoSdk_release().invoke(null, this.f64726b);
                Object objInvoke2 = objInvoke.getClass().getDeclaredMethod("getId", null).invoke(objInvoke, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String str = (String) objInvoke2;
                Object objInvoke3 = objInvoke.getClass().getDeclaredMethod(C3191e4.i.M, null).invoke(objInvoke, null);
                if (objInvoke3 != null) {
                    return new a(str, ((Boolean) objInvoke3).booleanValue());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Exception e10) {
                io.odeeo.internal.b2.a.d("Unable to obtain Google AdvertisingIdClient.Info via reflection.", e10);
                return null;
            }
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public final Object fetchAdvertisingInfoSync(Context context, zu.d<? super a> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(context, null), dVar);
    }

    public final Method getAdInfoDeclaredMethod$odeeoSdk_release() {
        return AdvertisingIdClient.class.getDeclaredMethod("getAdvertisingIdInfo", Context.class);
    }
}
