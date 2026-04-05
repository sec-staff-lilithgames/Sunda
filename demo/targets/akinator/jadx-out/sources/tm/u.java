package tm;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f87131a = {"sms", "tel", "inlineVideo", "calendar", "storePicture"};

    public static String[] getSupportedFeatures(Context context) {
        v vVar = new v(context, f87131a);
        ArrayList arrayList = new ArrayList();
        if (vVar.isTelFeatureAvailable()) {
            arrayList.add("tel");
        }
        if (vVar.isSmsFeatureAvailable()) {
            arrayList.add("sms");
        }
        if (vVar.isInlineVideoFeatureAvailable()) {
            arrayList.add("inlineVideo");
        }
        if (vVar.isCalendarFeatureAvailable()) {
            arrayList.add("calendar");
        }
        if (vVar.isStorePictureFeatureAvailable()) {
            arrayList.add("storePicture");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
