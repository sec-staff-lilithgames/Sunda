package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.Tracks;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.o6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2569o6 implements C1S {

    @MetaExoPlayerCustomization("Remove Immutable List for Oculus")
    public final List<C2570o7> A00;
    public static String[] A01 = {"0eRTZm", "wsJdmo7HTY", "VHUY43wJh5fnSZ3wEvYR5lxV3yQqNNMU", "k8", "kUjTCgoRRteoZ0", "6rJamNQt6U89KJOuF", "xAstRHAahUkfHwQSYEnj0qzfqp", "GuXFY9846UfmIsqOXXuGkg4YoPfa8R1b"};
    public static final C2569o6 A03 = new C2569o6(new ArrayList());
    public static final String A04 = AbstractC09264a.A0h(0);
    public static final C1R<C2569o6> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.o9
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2569o6.A00(bundle);
        }
    };

    public C2569o6(List<C2570o7> list) {
        this.A00 = MetaExoPlayerCustomizedCollections.A03((C2570o7[]) list.toArray(new C2570o7[0]));
    }

    public static /* synthetic */ C2569o6 A00(Bundle bundle) {
        List<Tracks.Group> groups;
        List<Tracks.Group> groups2 = bundle.getParcelableArrayList(A04);
        if (groups2 == null) {
            groups = Collections.emptyList();
        } else {
            groups = C3S.A01(C2570o7.A05, groups2);
        }
        return new C2569o6(groups);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C2569o6) obj).A00);
        }
        String[] strArr = A01;
        if (strArr[2].charAt(26) == strArr[7].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "oFMxQz";
        strArr2[3] = "4E";
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
