package qm;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f83292c = new b(1, "No internet connection");

    /* renamed from: a, reason: collision with root package name */
    public final int f83293a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83294b;

    public b(int i10, String str) {
        this.f83293a = i10;
        this.f83294b = str;
    }

    public static b badContent(String str) {
        return new b(3, str);
    }

    public static b expired(String str) {
        return new b(6, str);
    }

    public static b incorrectState(String str) {
        return new b(4, str);
    }

    public static b internal(String str) {
        return new b(0, str);
    }

    public static b noFIll(String str) {
        return new b(7, str);
    }

    public static b noRequiredArguments(String str) {
        return new b(2, str);
    }

    public static b placeholder(String str) {
        return new b(5, str);
    }

    public static b throwable(String str, Throwable th2) {
        if (th2 != null) {
            try {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(" - ");
                sb2.append(th2.getClass().getName());
                String message = th2.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb2.append(": ");
                    sb2.append(message);
                }
                return internal(sb2.toString());
            } catch (Throwable unused) {
            }
        }
        return internal(str);
    }

    public int getCode() {
        return this.f83293a;
    }

    public String getMessage() {
        return this.f83294b;
    }

    public String toString() {
        return "(" + this.f83293a + ") " + this.f83294b;
    }
}
