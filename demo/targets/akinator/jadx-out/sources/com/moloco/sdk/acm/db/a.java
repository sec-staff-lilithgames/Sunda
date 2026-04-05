package com.moloco.sdk.acm.db;

import java.util.List;
import kotlin.jvm.internal.e0;
import sv.n0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {
    public final String a(c eventType) {
        e0.checkNotNullParameter(eventType, "eventType");
        return eventType.name();
    }

    public final List<String> b(String tagsString) {
        e0.checkNotNullParameter(tagsString, "tagsString");
        return tagsString.length() == 0 ? p0.emptyList() : n0.split$default((CharSequence) tagsString, new String[]{","}, false, 0, 6, (Object) null);
    }

    public final c a(String eventType) {
        e0.checkNotNullParameter(eventType, "eventType");
        return c.valueOf(eventType);
    }

    public final String a(List<String> tags) {
        e0.checkNotNullParameter(tags, "tags");
        return y0.joinToString$default(tags, ",", null, null, 0, null, null, 62, null);
    }
}
