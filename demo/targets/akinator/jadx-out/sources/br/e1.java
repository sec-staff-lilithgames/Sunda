package br;

import android.webkit.MimeTypeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9819b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f1 f9820a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final e1 from(String str) {
            e1 e1VarFromDefaultSettings = fromDefaultSettings(str);
            if (e1VarFromDefaultSettings != null || (e1VarFromDefaultSettings = fromUrl(str)) != null) {
                return e1VarFromDefaultSettings;
            }
            if (str != null) {
                return fromBase64(str);
            }
            return null;
        }

        public final e1 fromBase64(String str) {
            if (str == null) {
                return null;
            }
            if (sv.n0.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                return new r(str);
            }
            return null;
        }

        public final e1 fromDefaultSettings(String str) {
            try {
                String strA = dq.v.f52535a.a(str);
                if (strA != null) {
                    return e1.f9819b.fromBase64(strA);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final e1 fromUrl(String str) {
            String validUrl = ir.q.getValidUrl(str);
            if (validUrl == null || sv.n0.isBlank(validUrl) || !ir.q.isHttpUrl(validUrl)) {
                return null;
            }
            f1 f1Var = f1.f9827b;
            try {
                if (sv.k0.contentEquals(MimeTypeMap.getFileExtensionFromUrl(validUrl), "m3u8", true)) {
                    f1Var = f1.f9828c;
                }
            } catch (Throwable unused) {
            }
            return new c2(validUrl, f1Var);
        }
    }

    public e1(f1 f1Var, kotlin.jvm.internal.u uVar) {
        this.f9820a = f1Var;
    }

    public static final e1 from(String str) {
        return f9819b.from(str);
    }

    public static final e1 fromBase64(String str) {
        return f9819b.fromBase64(str);
    }

    public static final e1 fromDefaultSettings(String str) {
        return f9819b.fromDefaultSettings(str);
    }

    public static final e1 fromUrl(String str) {
        return f9819b.fromUrl(str);
    }

    public f1 getDeliveryType() {
        return this.f9820a;
    }
}
