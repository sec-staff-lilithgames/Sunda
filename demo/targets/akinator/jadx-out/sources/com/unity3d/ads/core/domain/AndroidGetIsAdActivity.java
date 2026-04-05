package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.e0;
import pw.l;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetIsAdActivity {
    private final o activities$delegate;
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities$delegate = q.lazy(new AndroidGetIsAdActivity$activities$2(this));
    }

    private final List<l> getActivities() {
        return (List) this.activities$delegate.getValue();
    }

    public final boolean invoke(String activityName) {
        e0.checkNotNullParameter(activityName, "activityName");
        return getActivities().contains(l.decodeHex(StringExtensionsKt.getSHA256Hash(activityName)));
    }
}
