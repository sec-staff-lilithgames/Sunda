package io.odeeo.internal.j1;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import ao.kwoC.zAQQWzBxnS;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.moloco.sdk.BKC.JzVV;
import io.odeeo.internal.v1.o;
import io.odeeo.sdk.AdUnit;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f64386a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f64387b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f64388c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.network.PopUpImageController", f = "PopUpImageController.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "fetchImageByUrl$odeeoSdk_release", n = {}, s = {})
    public static final class a extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f64389a;

        /* renamed from: c, reason: collision with root package name */
        public int f64391c;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f64389a = obj;
            this.f64391c |= Integer.MIN_VALUE;
            return i.this.fetchImageByUrl$odeeoSdk_release(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.network.PopUpImageController$loadImage$1", f = "PopUpImageController.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f64392a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64394c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdUnit.PopUpType f64395d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AdUnit.PopUpType popUpType, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f64394c = str;
            this.f64395d = popUpType;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return i.this.new b(this.f64394c, this.f64395d, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f64392a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                i iVar = i.this;
                String str = this.f64394c;
                AdUnit.PopUpType popUpType = this.f64395d;
                this.f64392a = 1;
                obj = iVar.a(str, popUpType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            Object bVar = (io.odeeo.internal.a.c) obj;
            i iVar2 = i.this;
            AdUnit.PopUpType popUpType2 = this.f64395d;
            String str2 = this.f64394c;
            boolean z10 = bVar instanceof io.odeeo.internal.a.b;
            x0 x0Var = x0.f87415a;
            if (z10) {
                Bitmap bitmap = (Bitmap) ((io.odeeo.internal.a.b) bVar).getValue();
                if (bitmap != null) {
                    SharedPreferences.Editor editor = iVar2.f64388c.edit();
                    o oVar = o.f67285a;
                    SharedPreferences sharedPreferences = iVar2.f64388c;
                    e0.checkNotNullExpressionValue(editor, "editor");
                    oVar.deleteAllWithPrefix(sharedPreferences, editor, popUpType2.getValue());
                    io.odeeo.internal.a.c cVarA = iVar2.a(str2, popUpType2, editor, bitmap);
                    if (cVarA instanceof io.odeeo.internal.a.b) {
                        editor.commit();
                    }
                }
                bVar = new io.odeeo.internal.a.b(x0Var);
            } else if (!(bVar instanceof io.odeeo.internal.a.a)) {
                throw new t();
            }
            if (bVar instanceof io.odeeo.internal.a.b) {
                io.odeeo.internal.b2.a.d("loadImage: success", new Object[0]);
            }
            if (bVar instanceof io.odeeo.internal.a.a) {
                io.odeeo.internal.b2.a.d(e0.stringPlus("loadImage: failure ", (Exception) ((io.odeeo.internal.a.a) bVar).getError()), new Object[0]);
            }
            return x0Var;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public i(h sdkApi, CoroutineScope scope, SharedPreferences preferences) {
        e0.checkNotNullParameter(sdkApi, "sdkApi");
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(preferences, "preferences");
        this.f64386a = sdkApi;
        this.f64387b = scope;
        this.f64388c = preferences;
    }

    public final io.odeeo.internal.a.c<SharedPreferences.Editor, Exception> a(String str, AdUnit.PopUpType popUpType, SharedPreferences.Editor editor, Bitmap bitmap) {
        try {
            io.odeeo.internal.b2.a.d(e0.stringPlus("saveImage: ", str), new Object[0]);
            return new io.odeeo.internal.a.b(editor.putString(a(str, popUpType), a(bitmap)));
        } catch (Exception e10) {
            return new io.odeeo.internal.a.a(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchImageByUrl$odeeoSdk_release(java.lang.String r7, zu.d<? super io.odeeo.internal.a.c<android.graphics.Bitmap, ? extends java.lang.Exception>> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "fetchImageByUrl: response is not successful "
            boolean r1 = r8 instanceof io.odeeo.internal.j1.i.a
            if (r1 == 0) goto L15
            r1 = r8
            io.odeeo.internal.j1.i$a r1 = (io.odeeo.internal.j1.i.a) r1
            int r2 = r1.f64391c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f64391c = r2
            goto L1a
        L15:
            io.odeeo.internal.j1.i$a r1 = new io.odeeo.internal.j1.i$a
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.f64389a
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.f64391c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Exception -> L2c
            goto L4f
        L2c:
            r7 = move-exception
            goto L9b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            tu.a0.throwOnFailure(r8)
            java.lang.String r8 = "fetchImageByUrl: "
            java.lang.String r8 = kotlin.jvm.internal.e0.stringPlus(r8, r7)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            io.odeeo.internal.b2.a.d(r8, r3)
            io.odeeo.internal.j1.h r8 = r6.f64386a     // Catch: java.lang.Exception -> L2c
            r1.f64391c = r5     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = r8.getImage(r7, r1)     // Catch: java.lang.Exception -> L2c
            if (r8 != r2) goto L4f
            return r2
        L4f:
            io.odeeo.internal.y1.r r8 = (io.odeeo.internal.y1.r) r8     // Catch: java.lang.Exception -> L2c
            boolean r7 = r8.isSuccessful()     // Catch: java.lang.Exception -> L2c
            if (r7 != 0) goto L7e
            io.odeeo.internal.a.a r7 = new io.odeeo.internal.a.a     // Catch: java.lang.Exception -> L2c
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2c
            int r0 = r8.code()     // Catch: java.lang.Exception -> L2c
            r2.append(r0)     // Catch: java.lang.Exception -> L2c
            r0 = 32
            r2.append(r0)     // Catch: java.lang.Exception -> L2c
            xv.w0 r8 = r8.errorBody()     // Catch: java.lang.Exception -> L2c
            r2.append(r8)     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L2c
            r1.<init>(r8)     // Catch: java.lang.Exception -> L2c
            r7.<init>(r1)     // Catch: java.lang.Exception -> L2c
            return r7
        L7e:
            java.lang.Object r7 = r8.body()     // Catch: java.lang.Exception -> L2c
            xv.w0 r7 = (xv.w0) r7     // Catch: java.lang.Exception -> L2c
            if (r7 != 0) goto L88
            r7 = 0
            goto L8c
        L88:
            byte[] r7 = r7.bytes()     // Catch: java.lang.Exception -> L2c
        L8c:
            if (r7 != 0) goto L90
            r8 = -1
            goto L91
        L90:
            int r8 = r7.length     // Catch: java.lang.Exception -> L2c
        L91:
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r7, r4, r8)     // Catch: java.lang.Exception -> L2c
            io.odeeo.internal.a.b r8 = new io.odeeo.internal.a.b     // Catch: java.lang.Exception -> L2c
            r8.<init>(r7)     // Catch: java.lang.Exception -> L2c
            return r8
        L9b:
            io.odeeo.internal.a.a r8 = new io.odeeo.internal.a.a
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.j1.i.fetchImageByUrl$odeeoSdk_release(java.lang.String, zu.d):java.lang.Object");
    }

    public final void loadImage(String str, AdUnit.PopUpType popupType) {
        e0.checkNotNullParameter(popupType, "popupType");
        BuildersKt__Builders_commonKt.launch$default(this.f64387b, null, null, new b(str, popupType, null), 3, null);
    }

    public final void showImage(String str, ImageView imageView, int i10, WeakReference<b1> weakReference, AdUnit.PopUpType popupType) {
        e0.checkNotNullParameter(imageView, "imageView");
        e0.checkNotNullParameter(weakReference, JzVV.nroKdFyJf);
        e0.checkNotNullParameter(popupType, "popupType");
        Bitmap bitmapA = null;
        try {
            String string = this.f64388c.getString(a(str, popupType), null);
            if (string != null) {
                bitmapA = a(string);
            }
        } catch (Exception unused) {
        }
        b1 b1Var = weakReference.get();
        if (b1Var != null && b1Var.getLifecycle().getCurrentState().isAtLeast(j0.f6617f)) {
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            } else {
                imageView.setImageResource(i10);
            }
        }
    }

    public final Object a(String str, AdUnit.PopUpType popUpType, zu.d<? super io.odeeo.internal.a.c<Bitmap, ? extends Exception>> dVar) {
        if (this.f64388c.getString(a(str, popUpType), null) == null) {
            return fetchImageByUrl$odeeoSdk_release(str, dVar);
        }
        io.odeeo.internal.b2.a.d(e0.stringPlus(zAQQWzBxnS.wtVlGJHuTDPyDA, str), new Object[0]);
        return new io.odeeo.internal.a.b(null);
    }

    public final String a(String str, AdUnit.PopUpType popUpType) {
        return e0.stringPlus(str, popUpType.getValue());
    }

    public final Bitmap a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        e0.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(bytes, 0, bytes.size)");
        return bitmapDecodeByteArray;
    }

    public final String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        e0.checkNotNullExpressionValue(strEncodeToString, "encodeToString(byteArray, Base64.DEFAULT)");
        return strEncodeToString;
    }
}
