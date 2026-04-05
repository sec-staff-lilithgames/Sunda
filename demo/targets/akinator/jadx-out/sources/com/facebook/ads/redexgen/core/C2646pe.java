package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointViewNode$Companion;", "", "<init>", "()V", "viewToNodeMap", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lcom/instagram/common/viewpoint/core/ViewpointViewNode;", "forView", "view", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2646pe {
    public static byte[] A00;

    static {
        A01();
    }

    public /* synthetic */ C2646pe(AbstractC2629p7 abstractC2629p7) {
        this();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-3, -16, -20, -2};
    }

    public C2646pe() {
    }

    @JvmStatic
    public final ViewpointViewNode A02(View view) {
        C2628p6.A09(view, A00(0, 4, 75));
        WeakHashMap weakHashMap = ViewpointViewNode.A04;
        Object viewpointViewNode = weakHashMap.get(view);
        if (viewpointViewNode == null) {
            viewpointViewNode = new ViewpointViewNode(view, null);
            weakHashMap.put(view, viewpointViewNode);
        }
        return (ViewpointViewNode) viewpointViewNode;
    }
}
