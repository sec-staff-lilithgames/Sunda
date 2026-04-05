package com.moloco.sdk.internal.bidtoken;

import android.util.Base64;
import av.e;
import bv.n;
import com.moloco.sdk.internal.w;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.p;
import org.json.JSONObject;
import sv.k0;
import sv.n0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f45837i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f45837i = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super w> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f45837i, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            try {
                byte[] bArrDecode = Base64.decode((String) n0.split$default((CharSequence) n0.split$default((CharSequence) this.f45837i, new char[]{AbstractJsonLexerKt.COLON}, false, 0, 6, (Object) null).get(1), new String[]{"."}, false, 0, 6, (Object) null).get(1), 0);
                e0.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                return new w.b(new com.moloco.sdk.internal.bidtoken.a(new JSONObject(k0.decodeToString(bArrDecode)).getLong("exp")));
            } catch (Exception e10) {
                return new w.a(new com.moloco.sdk.internal.n(e10.toString(), -1));
            }
        }
    }

    @Override // com.moloco.sdk.internal.bidtoken.b
    public Object a(String str, zu.d<? super w> dVar) {
        return BuildersKt.withContext(d.f45838a, new a(str, null), dVar);
    }
}
