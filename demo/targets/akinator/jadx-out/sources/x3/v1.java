package x3;

import android.view.ContentInfo;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v1 {
    public static String[] getReceiveContentMimeTypes(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static n performReceiveContent(View view, n nVar) {
        ContentInfo contentInfo = nVar.toContentInfo();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfo);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfo ? nVar : n.toContentInfoCompat(contentInfoPerformReceiveContent);
    }

    public static void setOnReceiveContentListener(View view, String[] strArr, r0 r0Var) {
        if (r0Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new w1(r0Var));
        }
    }
}
