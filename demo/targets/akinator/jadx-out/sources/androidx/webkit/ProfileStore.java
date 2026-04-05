package androidx.webkit;

import java.util.List;
import k6.b;
import l6.b0;
import l6.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (t0.E.isSupportedByWebView()) {
            return b0.getInstance();
        }
        throw t0.getUnsupportedOperationException();
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}
