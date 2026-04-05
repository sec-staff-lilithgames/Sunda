package tm;

import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87133a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87134b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87135c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87136d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87137e;

    public v(Context context, String[] strArr) {
        this(context, (List<String>) (strArr != null ? Arrays.asList(strArr) : null));
    }

    public static boolean a(String str, List list) {
        return list != null && list.contains(str);
    }

    public boolean isCalendarFeatureAvailable() {
        return this.f87136d;
    }

    public boolean isInlineVideoFeatureAvailable() {
        return this.f87135c;
    }

    public boolean isSmsFeatureAvailable() {
        return this.f87133a;
    }

    public boolean isStorePictureFeatureAvailable() {
        return this.f87137e;
    }

    public boolean isTelFeatureAvailable() {
        return this.f87134b;
    }

    public v(Context context, List<String> list) {
        um.f0 f0Var = new um.f0(context);
        boolean z10 = false;
        this.f87133a = a("sms", list) && f0Var.hasTelephony();
        if (a("tel", list) && f0Var.hasTelephony()) {
            z10 = true;
        }
        this.f87134b = z10;
        this.f87135c = a("inlineVideo", list);
        this.f87136d = a("calendar", list);
        this.f87137e = a("storePicture", list);
    }
}
