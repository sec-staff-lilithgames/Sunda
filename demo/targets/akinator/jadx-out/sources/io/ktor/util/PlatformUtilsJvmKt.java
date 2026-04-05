package io.ktor.util;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PlatformUtilsJvmKt {
    private static final String DEVELOPMENT_MODE_KEY = "io.ktor.development";

    public static final Platform getPlatform(PlatformUtils platformUtils) {
        e0.checkNotNullParameter(platformUtils, "<this>");
        return Platform.Jvm;
    }

    public static final boolean isDevelopmentMode(PlatformUtils platformUtils) {
        e0.checkNotNullParameter(platformUtils, "<this>");
        String property = System.getProperty(DEVELOPMENT_MODE_KEY);
        return property != null && Boolean.parseBoolean(property);
    }

    public static final boolean isNewMemoryModel(PlatformUtils platformUtils) {
        e0.checkNotNullParameter(platformUtils, "<this>");
        return true;
    }
}
