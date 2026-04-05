package io.ktor.http.content;

import io.ktor.util.AttributeKey;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class VersionsKt {
    private static final AttributeKey<List<Version>> VersionListProperty = new AttributeKey<>("VersionList");

    public static final EntityTagVersion EntityTagVersion(String spec) {
        e0.checkNotNullParameter(spec, "spec");
        return EntityTagVersion.Companion.parseSingle(spec);
    }

    public static final AttributeKey<List<Version>> getVersionListProperty() {
        return VersionListProperty;
    }

    public static final List<Version> getVersions(OutgoingContent outgoingContent) {
        e0.checkNotNullParameter(outgoingContent, "<this>");
        List<Version> list = (List) outgoingContent.getProperty(VersionListProperty);
        return list == null ? p0.emptyList() : list;
    }

    public static final void setVersions(OutgoingContent outgoingContent, List<? extends Version> value) {
        e0.checkNotNullParameter(outgoingContent, "<this>");
        e0.checkNotNullParameter(value, "value");
        outgoingContent.setProperty(VersionListProperty, value);
    }
}
