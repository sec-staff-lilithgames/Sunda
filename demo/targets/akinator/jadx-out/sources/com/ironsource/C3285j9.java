package com.ironsource;

import android.content.Context;
import com.ironsource.Me;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3285j9 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37025a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.j9$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        public final boolean b(Context context) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            G3 g3D = d(context);
            return g3D.d().length() > 0 && g3D.e().length() > 0;
        }

        public final Me c(Context context) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            G3 g3D = d(context);
            if (g3D.d().length() <= 0 || g3D.e().length() <= 0) {
                g3D = null;
            }
            if (g3D == null) {
                return null;
            }
            Me me2 = new Me(context, g3D.d(), g3D.f(), g3D.e());
            me2.a(Me.a.CACHE);
            return me2;
        }

        public final G3 d(Context context) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            JSONObject jSONObjectA = a(context);
            String cachedAppKey = jSONObjectA.optString("appKey");
            String cachedUserId = jSONObjectA.optString("userId");
            String cachedSettings = jSONObjectA.optString(Me.f34938n);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new G3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    public static final boolean a(Context context) {
        return f37025a.b(context);
    }

    public static final Me b(Context context) {
        return f37025a.c(context);
    }

    public static final G3 c(Context context) {
        return f37025a.d(context);
    }
}
