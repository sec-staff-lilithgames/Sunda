package a2;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f3689a = new k();

    public final void setAvailableExtraData(AccessibilityNodeInfo node, List<String> data) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        node.setAvailableExtraData(data);
    }
}
